package com.cogent.main;

import org.springframework.batch.item.ItemProcessor;

public class ProductProcessor implements ItemProcessor<ProductEntity,ProductEntity>{

	@Override
	public ProductEntity process(ProductEntity item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
