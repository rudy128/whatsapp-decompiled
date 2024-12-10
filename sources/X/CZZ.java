package X;

public final class CZZ {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof CZZ) || i != ((CZZ) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Invalid(value=");
        return AnonymousClass001.A1L(A10, i);
    }

    public /* synthetic */ CZZ(int i) {
        this.A00 = i;
    }
}
