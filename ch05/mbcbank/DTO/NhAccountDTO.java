package ch05.mbcbank.DTO;

public class NhAccountDTO extends AccountDTO {
	public NhAccountDTO(String ano, String owner, int balance, String bankname) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
		this.setBankname("농협");
		// 생성자
	}
	// AccountDTO를 부모로하는 자식 DTO

}
