package X;

/* renamed from: X.4hh  reason: invalid class name and case insensitive filesystem */
public final class C92664hh implements C107875al {
    public final AnonymousClass4UR A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92664hh) && C18070vi.A18(this.A00, ((C92664hh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4ZN BNZ() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ C86734Sv BNt() {
        return null;
    }

    public C92664hh(AnonymousClass4UR r2) {
        this.A00 = r2;
        this.A01 = C72453Mb.A0q(r2.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EffectEnabledBannerContent(config=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
