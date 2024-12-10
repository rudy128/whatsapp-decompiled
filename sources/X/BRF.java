package X;

public final class BRF extends C3C {
    public final C24307Bz4 A00;

    public int hashCode() {
        return this.A00.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BRF)) {
            return super.equals(obj);
        }
        C24307Bz4 bz4 = this.A00;
        if (bz4 == C24307Bz4.AVATAR_DYNAMIC_COLOR_APPLIED) {
            return false;
        }
        return C18070vi.A18(bz4.name(), ((BRF) obj).A00.name());
    }

    public BRF(C24307Bz4 bz4) {
        this.A00 = bz4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EffectEvent(effectLifecycle=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
