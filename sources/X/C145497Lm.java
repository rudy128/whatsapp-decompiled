package X;

/* renamed from: X.7Lm  reason: invalid class name and case insensitive filesystem */
public final class C145497Lm implements C1596485i {
    public final C188779hy A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C145497Lm) && C18070vi.A18(this.A00, ((C145497Lm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C145497Lm(C188779hy r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onSendSmsToWaVerifyFailed(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
