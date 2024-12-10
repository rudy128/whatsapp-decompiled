package X;

/* renamed from: X.3nI  reason: invalid class name and case insensitive filesystem */
public final class C76423nI extends AnonymousClass4ME {
    public final boolean A00;

    public C76423nI(boolean z) {
        super(z, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76423nI) && this.A00 == ((C76423nI) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Leave(canLeaveCall=");
        return C17900vP.A0F(A10, this.A00);
    }
}
