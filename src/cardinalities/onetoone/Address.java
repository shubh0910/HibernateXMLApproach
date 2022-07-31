package cardinalities.onetoone;

public class Address {

		private int aid;
		private String ecity;
		private String estate;
		private Employee emp;
		public String getEcity() {
			return ecity;
		}
		public void setEcity(String ecity) {
			this.ecity = ecity;
		}
		
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public Employee getEmp() {
			return emp;
		}
		public void setEmp(Employee emp) {
			this.emp = emp;
		}
		public String getEstate() {
			return estate;
		}
		public void setEstate(String estate) {
			this.estate = estate;
		}
		
		@Override
		public String toString() {
			return "Address [aid=" + aid + ", ecity=" + ecity + ", estate="
					+ estate +"]";
		}


}
