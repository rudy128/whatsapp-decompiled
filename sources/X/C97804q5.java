package X;

/* renamed from: X.4q5  reason: invalid class name and case insensitive filesystem */
public final class C97804q5 implements C108465bk {
    public final boolean A00;
    public final int A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97804q5) && this.A00 == ((C97804q5) obj).A00);
    }

    public int BQY() {
        return this.A01;
    }

    public int BXa() {
        return 1;
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

    public C97804q5(boolean z) {
        this.A00 = z;
        this.A01 = z ? 2131895565 : 2131895566;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeySecurityCheckup(isCompleted=");
        return C17900vP.A0F(A10, this.A00);
    }

    public int BSg() {
        return 2131233385;
    }

    public int BaX() {
        return 2131895567;
    }
}
