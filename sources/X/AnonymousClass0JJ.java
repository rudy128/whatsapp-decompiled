package X;

/* renamed from: X.0JJ  reason: invalid class name */
public final class AnonymousClass0JJ {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass0JJ) || i != ((AnonymousClass0JJ) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.A00 == 1) {
            return "Touch";
        }
        return "Keyboard";
    }

    public /* synthetic */ AnonymousClass0JJ(int i) {
        this.A00 = i;
    }
}
