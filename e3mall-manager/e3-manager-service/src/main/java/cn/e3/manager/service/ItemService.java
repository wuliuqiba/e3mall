package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 通过itemid查询对应的商品信息
	 * 参数：itemid
	 * 返回值类型：TbItem
	 */
	public TbItem getItemById(Long itemId) throws Exception;
}
