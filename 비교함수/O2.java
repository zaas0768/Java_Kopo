
public class O2 {
	int name = 1;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.name;
	}

	@Override
	public boolean equals(Object obj) {
		O2 obj2 = (O2) obj;
		if (this.name == obj2.name) {
			return true;
		}
		return false;
	}
}
