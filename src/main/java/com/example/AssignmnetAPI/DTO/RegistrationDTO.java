package com.example.AssignmnetAPI.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RegistrationDTO {
	  private String username;
	    private String password;
		public RegistrationDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "RegistrationDTO [username=" + username + ", password=" + password + "]";
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
