package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	/**
	 * 通过itemid查询对应的商品信息
	 * 参数：itemid
	 * 返回值类型：TbItem
	 */
	public TbItem getItemById(Long itemId) throws Exception {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}
	
}
