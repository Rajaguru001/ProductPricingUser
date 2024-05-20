package com.chainsys.encapsulation;

public class BankDepositeForm {
	int amount;
	String name;
	long accountnumber;
	String pancard;
	long phonenumber;
	String ifsc;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "BankDepositeForm [amount=" + amount + ", name=" + name + ", accountnumber=" + accountnumber
				+ ", pancard=" + pancard + ", phonenumber=" + phonenumber + ", ifsc=" + ifsc + "]";
	}

}
