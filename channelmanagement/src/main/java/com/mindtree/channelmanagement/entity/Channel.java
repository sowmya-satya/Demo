package com.mindtree.channelmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Channel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int channelId;
	
	private String  channelName;
	
	private int channelPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ChannelGroup channelGroup;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "channel")
	private List<Shows> show;
	
	

	public Channel() {
		super();
	}



	public Channel(int channelId, String channelName, int channelPrice, ChannelGroup channelGroup, List<Shows> show) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelPrice = channelPrice;
		this.channelGroup = channelGroup;
		this.show = show;
	}



	public int getChannelId() {
		return channelId;
	}



	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}



	public String getChannelName() {
		return channelName;
	}



	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}



	public int getChannelPrice() {
		return channelPrice;
	}



	public void setChannelPrice(int channelPrice) {
		this.channelPrice = channelPrice;
	}



	public ChannelGroup getChannelGroup() {
		return channelGroup;
	}



	public void setChannelGroup(ChannelGroup channelGroup) {
		this.channelGroup = channelGroup;
	}



	public List<Shows> getShow() {
		return show;
	}



	public void setShow(List<Shows> show) {
		this.show = show;
	}



	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", channelName=" + channelName + ", channelPrice=" + channelPrice
				+ ", channelGroup=" + channelGroup + ", show=" + show + "]";
	}
	
	

}
