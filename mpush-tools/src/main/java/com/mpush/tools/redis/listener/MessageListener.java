package com.mpush.tools.redis.listener;


public interface MessageListener {
	
	void onMessage(String channel, String message);

}