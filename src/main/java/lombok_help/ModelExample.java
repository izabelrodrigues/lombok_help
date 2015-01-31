package lombok_help;

public class ModelExample {
	
	private int atributo01;
	private String atributo02;
	private String atributo03;
	private boolean atributo04;
	private Double atributo05;
	private int atributo06;
		
	public int getAtributo01() {
		return atributo01;
	}

	public void setAtributo01(int atributo01) {
		this.atributo01 = atributo01;
	}

	public String getAtributo02() {
		return atributo02;
	}

	public void setAtributo02(String atributo02) {
		this.atributo02 = atributo02;
	}

	public String getAtributo03() {
		return atributo03;
	}

	public void setAtributo03(String atributo03) {
		this.atributo03 = atributo03;
	}

	public boolean isAtributo04() {
		return atributo04;
	}

	public void setAtributo04(boolean atributo04) {
		this.atributo04 = atributo04;
	}

	public Double getAtributo05() {
		return atributo05;
	}

	public void setAtributo05(Double atributo05) {
		this.atributo05 = atributo05;
	}

	public int getAtributo06() {
		return atributo06;
	}

	public void setAtributo06(int atributo06) {
		this.atributo06 = atributo06;
	}

	public ModelExample(int atributo01, String atributo02, String atributo03,
			boolean atributo04, Double atributo05, int atributo06) {
		this.atributo01 = atributo01;
		this.atributo02 = atributo02;
		this.atributo03 = atributo03;
		this.atributo04 = atributo04;
		this.atributo05 = atributo05;
		this.atributo06 = atributo06;
	}

	public ModelExample() {	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atributo01;
		result = prime * result
				+ ((atributo02 == null) ? 0 : atributo02.hashCode());
		result = prime * result
				+ ((atributo03 == null) ? 0 : atributo03.hashCode());
		result = prime * result + (atributo04 ? 1231 : 1237);
		result = prime * result
				+ ((atributo05 == null) ? 0 : atributo05.hashCode());
		result = prime * result + atributo06;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ModelExample)) {
			return false;
		}
		ModelExample other = (ModelExample) obj;
		if (atributo01 != other.atributo01) {
			return false;
		}
		if (atributo02 == null) {
			if (other.atributo02 != null) {
				return false;
			}
		} else if (!atributo02.equals(other.atributo02)) {
			return false;
		}
		if (atributo03 == null) {
			if (other.atributo03 != null) {
				return false;
			}
		} else if (!atributo03.equals(other.atributo03)) {
			return false;
		}
		if (atributo04 != other.atributo04) {
			return false;
		}
		if (atributo05 == null) {
			if (other.atributo05 != null) {
				return false;
			}
		} else if (!atributo05.equals(other.atributo05)) {
			return false;
		}
		if (atributo06 != other.atributo06) {
			return false;
		}
		return true;
	}
	
}
