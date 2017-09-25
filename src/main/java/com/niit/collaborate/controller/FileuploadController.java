package com.niit.collaborate.controller;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.niit.collaborate.dao.UploadfileDAO;
import com.niit.collaborate.model.Uploadfile;
import com.niit.collaborate.model.User;
import com.niit.collaborate.service.UserService;

@RestController
public class FileuploadController {

	@Autowired
	private UploadfileDAO uploadFileDao;

	@Autowired
	private Uploadfile uploadFile;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/doUpload", method = RequestMethod.POST)
	public ResponseEntity<?> handleFileUpload(HttpServletRequest request, HttpSession session,
			@RequestParam CommonsMultipartFile fileUpload) throws Exception {
		String loggedInUserId = (String) session.getAttribute("loggedInUserId");
		System.out.println("getting friends of: " + loggedInUserId);
		User user = userService.getByemailId(loggedInUserId);
		System.out.println("User emailId: " + user.getEmailId());
		if (user == null)
			throw new RuntimeException("Not logged in");
		System.out.println("User is " + user.getfName() + " " + user.getlName());
		if (fileUpload != null) {
			CommonsMultipartFile file = fileUpload;
			System.out.println("Saving File: " + file.getOriginalFilename());
			Uploadfile uploadFile = new Uploadfile();
			uploadFile.setFileName(file.getOriginalFilename());
			uploadFile.setUserName(user.getEmailId());
			uploadFile.setData(file.getBytes()); // image
			uploadFileDao.save(uploadFile);
			// Select * from uploadFile where username = 'Mohammed_Ismail'

			Uploadfile getUploadFile = uploadFileDao.getFile(user.getEmailId());
			String name = getUploadFile.getFileName();
			System.out.println("FileName: " + name);
			System.out.println("File: " + getUploadFile.getData());
			byte[] imagefiles = getUploadFile.getData(); // image

			try {
				String path = "C:/Users/ikism/workspace/CollaborationBackEnd/src/main/webapp/WEB-INF/resources/images/"
						+ user.getEmailId();
				System.out.println("Path: " + path);
				File files = new File(path);
				FileOutputStream fos = new FileOutputStream(files);
				fos.write(imagefiles);
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return new ResponseEntity<Uploadfile>(HttpStatus.OK);
	}

	@RequestMapping(value = "/getFile", method = RequestMethod.GET)
	public ResponseEntity<?> getFile(HttpSession session) {
		User user = (User) session.getAttribute("loggedInUserId");
		Uploadfile uploadFile = uploadFileDao.getFile(user.getEmailId());
		String name = uploadFile.getFileName();
		System.out.println("Name: " + name);
		System.out.println("File: " + uploadFile.getData());
		byte[] imagefiles = uploadFile.getData();
		return new ResponseEntity<byte[]>(imagefiles, HttpStatus.OK);
	}
}

