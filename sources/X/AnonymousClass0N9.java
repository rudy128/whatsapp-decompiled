package X;

/* renamed from: X.0N9  reason: invalid class name */
public final class AnonymousClass0N9 {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        if (i == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass0N9) || i != ((AnonymousClass0N9) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ AnonymousClass0N9(int i) {
        this.A00 = i;
    }
}
