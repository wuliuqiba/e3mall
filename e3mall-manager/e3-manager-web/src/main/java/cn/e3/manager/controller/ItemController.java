package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * 通过itemid查询对应的商品信息
	 * 请求：/item/id/{itemId}
	 * 参数：itemid
	 * 返回值类型：TbItem
	 */
	@RequestMapping("/item/id/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) throws Exception {
		//调用service根据id进行查询
		TbItem item = itemService.getItemById(itemId);
		
		return item;
	}
	
}
