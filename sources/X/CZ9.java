package X;

public final class CZ9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CZ9)) {
            return false;
        }
        CZ9 cz9 = (CZ9) obj;
        if (this.A02 == cz9.A02 && this.A01 == cz9.A01 && this.A03 == cz9.A03 && this.A00 == cz9.A00 && C18070vi.A18(this.A05, cz9.A05)) {
            String str = this.A04;
            String str2 = cz9.A04;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.A02 * 31) + this.A01) * 31;
        String str = this.A05;
        if (str != null) {
            int A022 = ((C17890vO.A02(str, i) + this.A03) * 31) + this.A00;
            String str2 = this.A04;
            if (str2 != null) {
                return C108945cZ.A09(str2, A022 * 31);
            }
            return A022;
        }
        throw C17880vN.A0g();
    }

    public CZ9(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
