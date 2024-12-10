package X;

/* renamed from: X.6os  reason: invalid class name and case insensitive filesystem */
public class C133506os {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C133506os r4 = (C133506os) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public C133506os(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
