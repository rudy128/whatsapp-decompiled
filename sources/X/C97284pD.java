package X;

/* renamed from: X.4pD  reason: invalid class name and case insensitive filesystem */
public final class C97284pD implements AnonymousClass5YH {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97284pD) && C18070vi.A18(this.A00, ((C97284pD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97284pD(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestReviewSelectReason(reportId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
