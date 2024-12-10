package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.4nR  reason: invalid class name and case insensitive filesystem */
public class C96184nR implements C107455Zt {
    public final int A00;
    public final Object A01;

    public C96184nR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C80743xu BGp(Activity activity, C107355Zj r22, String str) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((AnonymousClass10H) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r1);
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r1);
        AnonymousClass10G r2 = r1.A00;
        AnonymousClass1L4 A0w = AnonymousClass3Ma.A0w(r2);
        AnonymousClass190 A0N = AnonymousClass3MY.A0N(r1);
        AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r1);
        AnonymousClass18O A0S = AnonymousClass3MZ.A0S(r1);
        C1193267r A0t = AnonymousClass3MZ.A0t(r1);
        AnonymousClass11C A0a = AnonymousClass3Ma.A0a(r1);
        C18000vb A6Q = AnonymousClass10E.A6Q(r1);
        C19830z4 A0c = AnonymousClass3Ma.A0c(r1);
        C18010vc A0r = AnonymousClass3Ma.A0r(r1);
        AnonymousClass1L2 A0c2 = C72463Mc.A0c(r2);
        return new C80743xu(activity, A0N, A12, A0S, A0a, A6O, A0c, A6Q, r22, A0c2, (A59) r2.A1h.get(), A0t, A0f, (EmojiSearchProvider) r2.A1c.get(), A8r, A0r, A0w, str);
    }
}
