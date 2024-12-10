package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4QY  reason: invalid class name */
public final class AnonymousClass4QY {
    public final /* synthetic */ AnonymousClass3VG A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4QY(AnonymousClass3VG r1, Set set, boolean z) {
        this.A00 = r1;
        this.A01 = set;
        this.A02 = z;
    }

    public void A00() {
        Map map;
        AnonymousClass4UM r0;
        Log.e("NewsletterInsightsViewModel/Error fetching newsletter insights");
        Set<C87234Uu> set = this.A01;
        AnonymousClass3VG r3 = this.A00;
        for (C87234Uu r2 : set) {
            C85014Lt r02 = r3.A04;
            C29681ch r1 = r3.A03;
            Map map2 = (Map) r02.A00.A06();
            if (map2 != null) {
                map = (Map) map2.get(r1);
            } else {
                map = null;
            }
            String str = null;
            if (!(map == null || (r0 = (AnonymousClass4UM) map.get(r2)) == null)) {
                str = r0.A01;
            }
            if (!C18070vi.A18(str, "OK")) {
                AnonymousClass3VG.A03(r3, r2, C821643h.A0C);
            }
        }
        AnonymousClass3VG.A00(r3);
        if (this.A02) {
            r3.A01.A0E(new C88034Yb(r3.A03, AnonymousClass00R.A0u, (Integer) null, 2131891793, true));
        }
    }
}
