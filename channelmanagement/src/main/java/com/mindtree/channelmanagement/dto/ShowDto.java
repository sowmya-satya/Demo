package com.mindtree.channelmanagement.dto;

public class ShowDto {

	
	private int showId;
	
	private String showName;
	
	private ChannelDto channelDto;

	public ShowDto() {
		super();
	}

	public ShowDto(int showId, String showName, ChannelDto channelDto) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.channelDto = channelDto;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public ChannelDto getChannelDto() {
		return channelDto;
	}

	public void setChannelDto(ChannelDto channelDto) {
		this.channelDto = channelDto;
	}

	@Override
	public String toString() {
		return "ShowDto [showId=" + showId + ", showName=" + showName + ", channelDto=" + channelDto + "]";
	}
	
	
}
