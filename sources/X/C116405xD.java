package X;

/* renamed from: X.5xD  reason: invalid class name and case insensitive filesystem */
public final class C116405xD extends AnonymousClass6T1 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C116405xD) && this.A00 == ((C116405xD) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C116405xD(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QrDataExpiredState(expired=");
        return C17900vP.A0F(A10, this.A00);
    }
}
