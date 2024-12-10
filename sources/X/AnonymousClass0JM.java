package X;

/* renamed from: X.0JM  reason: invalid class name */
public final class AnonymousClass0JM {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass0JM) || i != ((AnonymousClass0JM) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public /* synthetic */ AnonymousClass0JM(int i) {
        this.A00 = i;
    }
}
