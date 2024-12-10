package X;

/* renamed from: X.9El  reason: invalid class name and case insensitive filesystem */
public class C178789El extends C178869Et implements C22469B9b {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    public C178789El(long j, int i) {
        String str;
        C29591cX A0t = C108945cZ.A0t("message_updates");
        boolean A02 = C178869Et.A02(j);
        if (i != 0) {
            str = A02 ? "before" : str;
            this.A00 = A0t.A03();
        }
        if (A02) {
            str = "after";
        }
        this.A00 = A0t.A03();
        C108965cb.A1I(A0t, str, j);
        this.A00 = A0t.A03();
    }
}
