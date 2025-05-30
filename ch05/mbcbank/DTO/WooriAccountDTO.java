package ch05.mbcbank.DTO;

public class WooriAccountDTO extends AccountDTO {
	public WooriAccountDTO(String ano, String owner, int balance, String bankname) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
		this.setBankname("우리");
		// 생성자
	}
	// AccountDTO를 부모로 하는 자식 개체

}