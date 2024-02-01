package com.tnsif.day4;

public class Manager extends Employee {
	private int teamSize;
	public Manager(int employeeId, String employeeName, String employeeDepartment) {
		super(employeeId, employeeName, employeeDepartment);
		// TODO Auto-generated constructor stub
	}

	public Manager() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Manager(int employeeId, String employeeName, String employeeDepartment, int teamSize) {
		super(employeeId, employeeName, employeeDepartment);
		this.teamSize = teamSize;
	}

	/**
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}

	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()="
				+ getEmployeeName() + ", getEmployeeDepartment()=" + getEmployeeDepartment() + "]";
	}
	
	

}
