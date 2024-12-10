package X;

import android.content.Context;
import android.view.View;

public class AFK implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public AFK(Context context, AW0 aw0, A6R a6r, B8b b8b, AnonymousClass206 r5, String str, int i) {
        this.A00 = i;
        this.A01 = a6r;
        this.A06 = str;
        this.A02 = context;
        this.A03 = aw0;
        this.A04 = r5;
        this.A05 = b8b;
    }

    public final void onClick(View view) {
        boolean z;
        BD4 A0U;
        BD4 A0U2;
        int i = this.A00;
        A6R a6r = (A6R) this.A01;
        String str = this.A06;
        Context context = (Context) this.A02;
        AW0 aw0 = (AW0) this.A03;
        AnonymousClass206 r8 = (AnonymousClass206) this.A04;
        B8b b8b = (B8b) this.A05;
        if (i != 0) {
            if (!(str == null || (A0U2 = AnonymousClass8BT.A0U(a6r.A05)) == null)) {
                A0U2.BiL(42, str, (String) null, 1);
            }
            z = true;
        } else {
            if (!(str == null || (A0U = AnonymousClass8BT.A0U(a6r.A05)) == null)) {
                A0U.BiL(41, str, (String) null, 1);
            }
            z = false;
        }
        a6r.A04(context, aw0, new C20758AXn(context, aw0, a6r, b8b, r8, str, z), z);
    }
}
