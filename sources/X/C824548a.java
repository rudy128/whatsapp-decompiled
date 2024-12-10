package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.48a  reason: invalid class name and case insensitive filesystem */
public class C824548a extends C38471rL {
    public final /* synthetic */ C91934gU A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public C824548a(C91934gU r1, String str, Map map, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = map;
    }

    public void A04(View view) {
        C22654BId bId;
        Log.i("UserNoticeBanner/update/banner tapped");
        boolean z = this.A03;
        C91934gU r5 = this.A00;
        C33451iq r0 = r5.A04;
        if (z) {
            r0.A0B();
            C36731oN r2 = r5.A02;
            bId = r5.A01;
            r2.A01(bId.getContext(), true);
        } else {
            r0.A0C();
            C36731oN r3 = r5.A02;
            String str = this.A01;
            Map map = this.A02;
            bId = r5.A01;
            r3.A00(bId.getContext(), str, map);
        }
        C26106CsQ.A00(r5.A03, 2);
        C72453Mb.A1A(r5.A00);
        C18140vp r1 = r5.A05;
        if (r1.get() != null) {
            bId.A0f((C195759tr) r1.get());
        }
    }
}
