package X;

/* renamed from: X.0JL  reason: invalid class name */
public final class AnonymousClass0JL {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass0JL) || i != ((AnonymousClass0JL) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PointerKeyboardModifiers(packedValue=");
        return AnonymousClass001.A1L(A10, i);
    }

    public /* synthetic */ AnonymousClass0JL(int i) {
        this.A00 = i;
    }
}
