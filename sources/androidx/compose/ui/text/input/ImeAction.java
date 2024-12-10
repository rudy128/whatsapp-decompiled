package androidx.compose.ui.text.input;

public final class ImeAction {
    public final int A00;

    public static final /* synthetic */ ImeAction A00(int i) {
        return new ImeAction(i);
    }

    public static String A01(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            return "Done";
        }
        return "Invalid";
    }

    public final /* synthetic */ int A02() {
        return this.A00;
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof ImeAction) || i != ((ImeAction) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ ImeAction(int i) {
        this.A00 = i;
    }
}
