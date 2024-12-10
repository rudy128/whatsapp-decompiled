package X;

/* renamed from: X.CqZ  reason: case insensitive filesystem */
public final class C26018CqZ {
    public final int A00;

    public static long A00(C17130tn r8, C17090tj r9, String str) {
        C26231CvN.A05(r8, r9, new C26018CqZ(3), str, 0, 4, 0);
        return 0;
    }

    public static String A01(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
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
        if (!(obj instanceof C26018CqZ) || i != ((C26018CqZ) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ C26018CqZ(int i) {
        this.A00 = i;
    }
}
