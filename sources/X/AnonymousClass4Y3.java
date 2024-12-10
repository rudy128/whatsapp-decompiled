package X;

/* renamed from: X.4Y3  reason: invalid class name */
public final class AnonymousClass4Y3 {
    public static final AnonymousClass4Y3 A01 = new AnonymousClass4Y3((Long) null);
    public final Long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Y3) && C18070vi.A18(this.A00, ((AnonymousClass4Y3) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass4Y3(Long l) {
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsUiConfiguration(rotationDuration=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
