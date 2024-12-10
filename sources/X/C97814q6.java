package X;

/* renamed from: X.4q6  reason: invalid class name and case insensitive filesystem */
public final class C97814q6 implements C108465bk {
    public final boolean A00;
    public final int A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97814q6) && this.A00 == ((C97814q6) obj).A00);
    }

    public int BQY() {
        return this.A01;
    }

    public int BXa() {
        return 3;
    }

    public boolean BeK() {
        return this.A00;
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C97814q6(boolean z) {
        this.A00 = z;
        this.A01 = z ? 2131895572 : 2131895571;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TwoFacSecurityCheckup(isCompleted=");
        return C17900vP.A0F(A10, this.A00);
    }

    public int BSg() {
        return 2131232159;
    }

    public int BaX() {
        return 2131895573;
    }
}
