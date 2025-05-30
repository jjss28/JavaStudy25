package ch05.mbcbank.DTO;

public class HanaAccountDTO extends AccountDTO{
	public HanaAccountDTO(String ano, String owner, int balance, String bankname) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
		this.setBankname("하나");
		// 생성자
	}
	// AccountDTO객체를 부모로 만듬

	public HanaAccountDTO() {

	}

}
