package com.niit.chatonbckend.dao;


import java.util.List;

import com.niit.chatonbackend.model.Friend;

public interface FriendDAO {
	//friendList using userId
	public List<Friend> getMyFriend(String userId);

	//to accept or reject purpose
	public Friend getBId(String userId, String friendId);

	//New Friend request
	public boolean saveFriend(Friend friend);

	//accept or reject purpose
	public boolean updateFriend(Friend friend);

	//unFriend 
	public void deleteFriend(String userId, String friendId);

	//to list all the new friend request
	public List<Friend> getNewFriendRequest(String userId);

	public void setOnline(String userId);

	public void setOffLine(String userId);
}

