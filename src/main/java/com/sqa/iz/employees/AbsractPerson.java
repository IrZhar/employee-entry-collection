package com.sqa.iz.employees;

public class AbsractPerson implements IPerson {

	private String address;
	private int age;
	private String name;

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class:");
		builder.append(this.getClass().getSimpleName());
		builder.append(" who lives at ");
		builder.append(this.address);
		builder.append(" and is only ");
		builder.append(this.age);
		builder.append(" years old, Welcome ");
		builder.append(this.name);
		builder.append("!");
		return builder.toString();
	}

}
