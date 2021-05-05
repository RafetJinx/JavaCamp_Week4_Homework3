package Entities;

import java.util.GregorianCalendar;

public class Gamer {
	private String nationalityId;
	private String firstName;
	private String lastName;
	private GregorianCalendar dateOfBirth;
	
	private Gamer(Builder builder) {
		this.nationalityId = builder.nationalityId;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.dateOfBirth = builder.dateOfBirth;		
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static class Builder {
		private String nationalityId;
		private String firstName;
		private String lastName;
		private GregorianCalendar dateOfBirth;
						
		public Builder(String nationalityId, String firstName,
						String lastName, GregorianCalendar dateOfBirth) {
			this.nationalityId = nationalityId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}
		
		public Gamer buidler() {
			return new Gamer(this);
		}
	}

}
