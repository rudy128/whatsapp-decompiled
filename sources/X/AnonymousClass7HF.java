package X;

/* renamed from: X.7HF  reason: invalid class name */
public final class AnonymousClass7HF implements AnonymousClass856 {
    public final C160878Ah A00;

    public AnonymousClass7HF(C160878Ah r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7HF) && C18070vi.A18(this.A00, ((AnonymousClass7HF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CacheResult(mediaList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
