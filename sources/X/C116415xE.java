package X;

/* renamed from: X.5xE  reason: invalid class name and case insensitive filesystem */
public final class C116415xE extends AnonymousClass6T1 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C116415xE) && C18070vi.A18(this.A00, ((C116415xE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C116415xE(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QrDataState(qrData=");
        return C17900vP.A0B(this.A00, A10);
    }
}
