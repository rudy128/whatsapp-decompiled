package X;

/* renamed from: X.4pB  reason: invalid class name and case insensitive filesystem */
public final class C97264pB implements AnonymousClass5YH {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97264pB) && C18070vi.A18(this.A00, ((C97264pB) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97264pB(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReportDetailScreen(reportId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
