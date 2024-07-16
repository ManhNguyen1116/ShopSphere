package com.cogent.main;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ProductItemWriter  implements ItemWriter<ProductEntity>{
	
	private final ProductRepository productRepo;

	@Override
	public void write(Chunk<? extends ProductEntity> chunkList) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Writer Thread " + Thread.currentThread().getName());
		productRepo.saveAll(chunkList);
	}
	
	
}
