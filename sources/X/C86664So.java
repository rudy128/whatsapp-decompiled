package X;

/* renamed from: X.4So  reason: invalid class name and case insensitive filesystem */
public final class C86664So {
    public final String A00;

    public C86664So(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86664So) && C18070vi.A18(this.A00, ((C86664So) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TruncatedUrlSpan(originalUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
