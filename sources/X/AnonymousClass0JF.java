package X;

/* renamed from: X.0JF  reason: invalid class name */
public final class AnonymousClass0JF {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass0JF) || i != ((AnonymousClass0JF) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.A00 == 0) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public /* synthetic */ AnonymousClass0JF(int i) {
        this.A00 = i;
    }
}
