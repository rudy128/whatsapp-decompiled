package X;

/* renamed from: X.9Ep  reason: invalid class name and case insensitive filesystem */
public class C178829Ep extends C178869Et implements C22469B9b {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    public C178829Ep(int i) {
        String str;
        C29591cX A0t = C108945cZ.A0t("member_add_mode");
        if (i != 0) {
            str = "all_member_add";
        } else {
            str = "admin_add";
        }
        A0t.A07(str);
        this.A00 = A0t.A03();
    }
}
