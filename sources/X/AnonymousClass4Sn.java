package X;

/* renamed from: X.4Sn  reason: invalid class name */
public final class AnonymousClass4Sn {
    public final C18090vk A00;

    public AnonymousClass4Sn(C18090vk r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Sn) && C18070vi.A18(this.A00, ((AnonymousClass4Sn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(onClick=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
