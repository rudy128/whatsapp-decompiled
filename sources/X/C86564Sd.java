package X;

/* renamed from: X.4Sd  reason: invalid class name and case insensitive filesystem */
public final class C86564Sd {
    public final C86704Ss A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86564Sd) && C18070vi.A18(this.A00, ((C86564Sd) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C86564Sd(C86704Ss r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoveAllEffectsButtonConfiguration(accessibility=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
