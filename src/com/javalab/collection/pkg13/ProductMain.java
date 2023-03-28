package com.javalab.collection.pkg13;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 저장할 ArrayList 객체 생성
		List<Product> product = new ArrayList<>(); //Product 타입 ArrayList

		product.add(new Product(1, "자전거", 250000));
		product.add(new Product(2, "노트북", 1250000));
		product.add(new Product(3, "쌀거", 150000));
		product.add(new Product(4, "세탁기", 800000));
		product.add(new Product(5, "시금치", 2500));
		product.add(new Product(6, "대파", 10000));
		product.add(new Product(7, "에어컨", 3500000));
		product.add(new Product(8, "쇼파", 3000000));
		product.add(new Product(9, "우유", 2500));
		product.add(new Product(10, "운동화", 600000));

		// 전체 상품 목록
		System.out.println("1. 전체 상품 출력");
		System.out.println("------------------------");
		System.out.println("번호\t이름\t가격");
		printAllProduct(product);

		// 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고
		// 해당 상품 가격을 main()메소드에서 출력하세요. getProductPrice(ArrayList,찾을상품명);
		System.out.println("2. 원하는 상품의 가격 검색");
		String name = "에어컨";
		int aprice = getProductPrice(product, name);
		System.out.printf("원하는 상품은 %s이고 가격은 %d입니다.", name, aprice);
		System.out.println();
		System.out.println();

		// 구매한 제품의 평균 구매 가격을 조회해서 main메소드에서 출력
		double avg = getAverage(product);
		System.out.printf("구매한 제품의 평균 가격은 %.2f원입니다", avg);
		System.out.println();
		System.out.println();

		// 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고, main()메소드에서 출력
		List<Product> product100 = product100List(product);
		System.out.println("제품 중에 100만원이 넘는 제품");
		for (Product product2 : product100) {
			System.out.println(product2.getId() + "\t" + product2.getName() 
						+ "\t" + product2.getPrice());
		}
		System.out.println();
		
		
		// HashMap 생성
		Map<Integer, Product> productMap = new HashMap<>();
		productMap.put(1, new Product(1, "자전거", 250000));
		productMap.put(2, new Product(2, "노트북", 1250000));
		productMap.put(3, new Product(3, "쌀거", 150000));
		productMap.put(4, new Product(4, "세탁기", 800000));
		productMap.put(5, new Product(5, "시금치", 2500));
		productMap.put(6, new Product(6, "대파", 10000));
		productMap.put(7, new Product(7, "에어컨", 3500000));
		productMap.put(8, new Product(8, "쇼파", 3000000));
		productMap.put(9, new Product(9, "우유", 2500));
		productMap.put(10, new Product(10, "운동화", 600000));
		
		// HashMap을 통한 제품 출력 메소드 만들기
		// - HashMap에 데이터 추가하기
		PrintProductMap(productMap);
		System.out.println();
		
		PrintProductMap2(productMap);

	}
	
	// HashMap 통한 제품 출력 메소드
	private static void PrintProductMap(Map<Integer, Product> productMap) {
		
		for (Integer product : productMap.keySet()) {
			System.out.println(productMap.get(product).getId() + 
					"\t" + productMap.get(product).getName() + 
					"\t" + productMap.get(product).getPrice());
		}
	}
	
	private static void PrintProductMap2(Map<Integer, Product> productMap) {
		Set<Integer> keySet = productMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(productMap.get(key).getId() + 
					"\t" + productMap.get(key).getName() +
					"\t" + productMap.get(key).getPrice());
		}
	}

	// 제품 중 100만원 넘는 제품 찾는 메소드
	private static List<Product> product100List(List<Product> ArrayList) {
		List<Product> product100 = new ArrayList<>();
		for (Product product : ArrayList) {
			if (product.getPrice() >= 1000000) {
				product100.add(product);
			}
		}
		return product100;
	}

	// 구매한 제품 평균 메소드
	private static double getAverage(List<Product> product) {
		int sum = 0;
		double avg = 0.0;
		for (Product product2 : product) {
			sum = sum + product2.getPrice();
		}
		avg = (double) sum / product.size();
		return avg;
	}

	// 원하는 상품 파라미터 메소드
	private static int getProductPrice(List<Product> ArrayList, String name) {
		int aPrice = 0; // 제품 가격 변수
		for (Product product : ArrayList) {
			if (product.getName().equals(name)) {
				aPrice = product.getPrice();
			}
		}
		return aPrice;
	}

	// 전체 상품 목록 메소드
	private static void printAllProduct(List<Product> ArrayList) {
		for (Product product : ArrayList) {
			System.out.println(product.getId() + "\t" + product.getName() 
						+ "\t" + product.getPrice());
		}
		System.out.println();
	}
}