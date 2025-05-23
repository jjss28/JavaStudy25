package ch04.MarioKart;

import java.util.Scanner;

public class CartService {
	// 필드

	// 생성자

	// 메서드

	public void menu(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState) {
		// 키보드 입력 객체 캐릭터 배열 로그인한 사용자 상태
		for (int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
				System.out.println("이름 : " + characterDTOs[i].name + "무게 : " + characterDTOs[i].weight + "\n");
				;
			} // if문 종료
		} // for문 종료
		System.out.println("캐릭터를 선택하세요");
		System.out.print(">>>");
		
		String selecChar = input.next();
		
		for(int i = 0 ; i < characterDTOs.length ; i++) {
			if(characterDTOs[i] != null && characterDTOs[i].name.equals(selecChar)) {
				loginState.characterDTO = characterDTOs[i];
				// 키보드로 선택한 캐릭터 정보를 로그인한 객체에 연결!!
			} // if문 종료
		} // for문 종료
		
		System.out.println(loginState.nickName + "님은" + loginState.characterDTO.name + "를 선택하셨습니다.");

	} // menu 메서드 종료

}
