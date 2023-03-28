package com.javalab.collection.pkg10;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {

		// 기본 데이터
		String[] member = new String[10];
		member[0]="임재,20190509,20190510,8,남,30대후반";
		member[1]="성열,20190509,20190510,1,남,30대중반";
		member[2]="천재,20190509,20190510,3,남,30대초반";
		member[3]="현수,20190509,20190509,1,남,20대후반";
		member[4]="진우,20190509,20190510,2,남,30대초반";
		member[5]="영수,20190509,20190510,2,여,40대후반";
		member[6]="종화,20190509,20190509,0,남,20대후반";
		member[7]="윤정,20190509,20190510,3,여,40대후반";
		member[8]="종호,20190509,20190510,3,남,20대중반";
		member[9]="동현,20190509,20190510,5,남,20대중반";
		
		// 1. 기본 데이터를 가공하여 Member객체로 만들고 저장할 ArrList 생성
		List<Member> memberList = new ArrayList<>();  // 멤버 타입 ArrayList
		
		// 기본 데이터를 반복문을 통해서 Member 객체로 생성
		for(int i = 0; i < member.length; i++) {
			String[] arr = member[i].split(","); // 콤머로 구분해서 자르고 배열에 넣어줌
			int numVisit = Integer.parseInt(arr[3]); 
			char gender = arr[4].charAt(0);
			memberList.add(new Member(arr[0], arr[1], arr[2], numVisit, gender, arr[5]));
		}
		
		// 2. 이름이 천재인 회원
		printMember(memberList);
		System.out.println();
		
		// 3. 전체회원 출력
		printAllMember(memberList);
		System.out.println();
		
		// 4. 30대인 회원
		List<Member> member30list = printperson(memberList);
		for (Member member2 : member30list) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + 
					"\t" + member2.getLastVisitDate() + "\t"+ member2.getNumVisit() + 
					"\t" + member2.getGender() + "\t" + member2.getAge());
		}
		System.out.println();
	
		
		// 5. 20대 후반들의 방문횟수
		printVisit(memberList);
	}

	// 30대인 회원 찾아주는 메소드
	   private static List<Member> printperson(List<Member> memberList) {
		      List<Member> members30list = new ArrayList<Member>();
		      
		      for (Member member : memberList) {
		         String ageTest = member.getAge().substring(0 , 2);
		         if (Integer.parseInt(ageTest) == 30) {
		            members30list.add(member);
		         }
		      }
		      return members30list;
		   }

	// 20대 후반 방문횟수 메소드
	private static int printVisit(List<Member> memberList) {
		int count = 0;
		for (Member member : memberList) {
			if(member.getAge().contains("20대후반")) {
				count = count + member.getNumVisit();
			}
		}
		System.out.printf("20대 후반들의 방문횟수는 : %d번" , count);
		return count;
	}

	// 전체회원 메소드
	private static void printAllMember(List<Member> memberList) {
		for (Member member2 : memberList) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + 
						"\t" + member2.getLastVisitDate() + "\t" + member2.getNumVisit() + 
						"\t" + member2.getGender() + "\t" + member2.getAge());
		}	
	}

	// 이름이 천재인 회원 메소드
	private static void printMember(List<Member> memberList) {
		for (Member member : memberList) {
			if (member.getName().equals("천재")) {
				System.out.println(member.getName() + "\t" + member.getJoinDate() + 
							"\t" + member.getLastVisitDate() + "\t"+ member.getNumVisit() + 
							"\t" + member.getGender() + "\t" + member.getAge());

			}
		}
	}
}