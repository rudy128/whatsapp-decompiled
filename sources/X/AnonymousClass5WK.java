package X;

/* renamed from: X.5WK  reason: invalid class name */
public final class AnonymousClass5WK extends AnonymousClass4PR {
    public final Throwable A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5WK) || !C18070vi.A18(this.A00, ((AnonymousClass5WK) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Throwable th = this.A00;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public AnonymousClass5WK(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Closed(");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
