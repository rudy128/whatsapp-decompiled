package X;

/* renamed from: X.3nJ  reason: invalid class name and case insensitive filesystem */
public final class C76433nJ extends AnonymousClass4ME {
    public final boolean A00;

    public C76433nJ(boolean z) {
        super(z, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76433nJ) && this.A00 == ((C76433nJ) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Start(canStartCall=");
        return C17900vP.A0F(A10, this.A00);
    }
}
