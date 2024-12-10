package X;

/* renamed from: X.4hj  reason: invalid class name and case insensitive filesystem */
public final class C92684hj implements C107875al {
    public final C18090vk A00;
    public final C86734Sv A01 = new C86734Sv(new AFE(this, 47), AnonymousClass3MX.A0t(2131886712));
    public final AnonymousClass4ZN A02 = AnonymousClass3MX.A0t(2131886709);

    public C92684hj(C18090vk r4) {
        C18070vi.A0d(r4, 1);
        this.A00 = r4;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92684hj) && C18070vi.A18(this.A00, ((C92684hj) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4ZN BNZ() {
        return this.A02;
    }

    public C86734Sv BNt() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TrayLoadErrorBannerContent(retryLoadTray=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
