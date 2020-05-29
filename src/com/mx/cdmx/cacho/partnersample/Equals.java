package com.mx.cdmx.cacho.partnersample;

import java.util.Objects;

public class Equals {

	public static void main(String[] args) {
		Person joe 		= new Person("Joe", "Montana");
		Object mrJoe 	= new Person("Joe", "Montana");
		boolean equal 	= joe.equals(mrJoe);
		System.out.println(equal);
	}
	
	public static class Person {
		private String firstName;
		private String lastName;
		
		public Person(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
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
		@Override
		public boolean equals(Object o) {
		    if (this == o)
		        return true;
		    if (o == null)
		        return false;
		    if (!(o instanceof Person))
	            return false;
		    if (getClass() != o.getClass())
		        return false;
		    Person person = (Person) o;
		    return Objects.equals(firstName, person.firstName)
		            && Objects.equals(lastName, person.lastName);
		}
		
		@Override
		public final int hashCode() {
		    int result = 17;
		    if (firstName != null) {
		        result = 31 * result + firstName.hashCode();
		    }
		    if (lastName != null) {
		        result = 31 * result + lastName.hashCode();
		    }
		    return result;
		}
	}
}
