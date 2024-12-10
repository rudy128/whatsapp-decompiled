package X;

/* renamed from: X.2kh  reason: invalid class name and case insensitive filesystem */
public class C58442kh {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58442kh r5 = (C58442kh) obj;
            String str = r5.A00;
            String str2 = this.A00;
            return (str == str2 || (str != null && str.equals(str2))) && r5.A01 == this.A01;
        }
    }

    public final int hashCode() {
        return ((589 + C17900vP.A00(this.A00)) * 31) + (this.A01 ? 1 : 0);
    }

    public C58442kh(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
