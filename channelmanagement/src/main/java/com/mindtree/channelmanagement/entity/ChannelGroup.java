package com.mindtree.channelmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChannelGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int channelGroupId;
	
	private String channelGroupName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "channelGroup")
	private List<Channel> channel;

	
	
	public ChannelGroup() {
		super();
	}



	public ChannelGroup(int channelGroupId, String channelGroupName, List<Channel> channel) {
		super();
		this.channelGroupId = channelGroupId;
		this.channelGroupName = channelGroupName;
		this.channel = channel;
	}



	public int getChannelGroupId() {
		return channelGroupId;
	}



	public void setChannelGroupId(int channelGroupId) {
		this.channelGroupId = channelGroupId;
	}



	public String getChannelGroupName() {
		return channelGroupName;
	}



	public void setChannelGroupName(String channelGroupName) {
		this.channelGroupName = channelGroupName;
	}



	public List<Channel> getChannel() {
		return channel;
	}



	public void setChannel(List<Channel> channel) {
		this.channel = channel;
	}



	@Override
	public String toString() {
		return "ChannelGroup [channelGroupId=" + channelGroupId + ", channelGroupName=" + channelGroupName
				+ ", channel=" + channel + "]";
	}
	
	
	

}
