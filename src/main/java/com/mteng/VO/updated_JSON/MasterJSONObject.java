package com.mteng.VO.updated_JSON;

import java.util.ArrayList;
import java.util.List;

public class MasterJSONObject {
	private Entity entity;
	private List<Peer> peers = new ArrayList<Peer>();
	public Entity getEntity() {
		return entity;
	}
	public List<Peer> getPeers() {
		return peers;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	public void setPeers(List<Peer> peers) {
		this.peers = peers;
	}
}