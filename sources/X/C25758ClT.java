package X;

/* renamed from: X.ClT  reason: case insensitive filesystem */
public final class C25758ClT {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        if (i == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C25758ClT) || i != ((C25758ClT) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C25758ClT(int i) {
        this.A00 = i;
    }
}
