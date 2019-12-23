package com.mindtree.channelmanagement.dto;

import java.util.List;

public class ChannelDto {

private int channelId;
	
	private String  channelName;
	
	private int channelPrice;
	
	private ChannelGroupDto channelGroupDto;
	
	private List<ShowDto> showDto;

	public ChannelDto() {
		super();
	}

	public ChannelDto(int channelId, String channelName, int channelPrice, ChannelGroupDto channelGroupDto,
			List<ShowDto> showDto) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelPrice = channelPrice;
		this.channelGroupDto = channelGroupDto;
		this.showDto = showDto;
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

	public ChannelGroupDto getChannelGroupDto() {
		return channelGroupDto;
	}

	public void setChannelGroupDto(ChannelGroupDto channelGroupDto) {
		this.channelGroupDto = channelGroupDto;
	}

	public List<ShowDto> getShowDto() {
		return showDto;
	}

	public void setShowDto(List<ShowDto> showDto) {
		this.showDto = showDto;
	}

	@Override
	public String toString() {
		return "ChannelDto [channelId=" + channelId + ", channelName=" + channelName + ", channelPrice=" + channelPrice
				+ ", channelGroupDto=" + channelGroupDto + ", showDto=" + showDto + "]";
	}
	

	
}
