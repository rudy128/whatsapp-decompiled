package X;

/* renamed from: X.D7y  reason: case insensitive filesystem */
public class C26649D7y implements C40681v6 {
    public final Integer A00;
    public final boolean A01;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        if (r3.A0S) {
            return new C26630D7d(this);
        }
        C196379ux.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public C26649D7y(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MergePaths{mode=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "SUBTRACT";
                    break;
                case 3:
                    str = "INTERSECT";
                    break;
                case 4:
                    str = "EXCLUDE_INTERSECTIONS";
                    break;
                default:
                    str = "MERGE";
                    break;
            }
        } else {
            str = "null";
        }
        A10.append(str);
        return C17890vO.A0b(A10);
    }
}
