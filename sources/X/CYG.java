package X;

public final class CYG {
    public final Object A00;
    public final String A01;

    public CYG(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CYG) {
                CYG cyg = (CYG) obj;
                if (this.A00 != cyg.A00 || !this.A01.equals(cyg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, System.identityHashCode(this.A00) * 31);
    }
}
