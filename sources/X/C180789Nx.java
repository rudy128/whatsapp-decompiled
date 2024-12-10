package X;

/* renamed from: X.9Nx  reason: invalid class name and case insensitive filesystem */
public class C180789Nx {
    public String A00;
    public String A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C180789Nx r5 = (C180789Nx) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = r5.A00;
            String str2 = this.A00;
            return str == null ? str2 == null : str.equals(str2);
        }
    }

    public int hashCode() {
        return -1;
    }
}
