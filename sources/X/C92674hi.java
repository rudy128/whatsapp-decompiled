package X;

/* renamed from: X.4hi  reason: invalid class name and case insensitive filesystem */
public final class C92674hi implements C107875al {
    public final AnonymousClass4ZN A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92674hi) && C18070vi.A18(this.A01, ((C92674hi) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass4ZN BNZ() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ C86734Sv BNt() {
        return null;
    }

    public C92674hi(AnonymousClass4ZN r1) {
        this.A01 = r1;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstructionBannerContent(stringProvider=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
