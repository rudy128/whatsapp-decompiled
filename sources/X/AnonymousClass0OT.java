package X;

/* renamed from: X.0OT  reason: invalid class name */
public final class AnonymousClass0OT {
    public final C17130tn A00;

    public boolean equals(Object obj) {
        return A01(this.A00, obj);
    }

    public static boolean A01(C17130tn r2, Object obj) {
        if (!(obj instanceof AnonymousClass0OT) || !C18070vi.A18(r2, ((AnonymousClass0OT) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C17130tn r2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SkippableUpdater(composer=");
        return AnonymousClass001.A1F(r2, A10);
    }

    public /* synthetic */ AnonymousClass0OT(C17130tn r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0OT A00(C17130tn r1) {
        r1.BJy();
        return new AnonymousClass0OT(r1);
    }
}
