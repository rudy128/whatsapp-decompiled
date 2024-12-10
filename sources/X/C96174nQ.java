package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.4nQ  reason: invalid class name and case insensitive filesystem */
public class C96174nQ implements C107445Zs {
    public final int A00;
    public final Object A01;

    public C96174nQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C80733xt BH7(Activity activity, C107355Zj r22, String str, int i) {
        AnonymousClass10E r2;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            r2 = ((AnonymousClass10H) obj).A00;
        } else {
            r2 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r2);
        C18030ve A8r = AnonymousClass10E.A8r(r2);
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r2);
        AnonymousClass10G r1 = r2.A00;
        AnonymousClass1L4 A0w = AnonymousClass3Ma.A0w(r1);
        AnonymousClass190 A0N = AnonymousClass3MY.A0N(r2);
        AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r2);
        C1193267r A0t = AnonymousClass3MZ.A0t(r2);
        C19830z4 A0c = AnonymousClass3Ma.A0c(r2);
        C18010vc A0r = AnonymousClass3Ma.A0r(r2);
        A59 a59 = (A59) r1.A1h.get();
        return new C80733xt(activity, A0N, A12, AnonymousClass3Ma.A0a(r2), A6O, A0c, AnonymousClass10E.A6Q(r2), r22, C72463Mc.A0c(r1), a59, A0t, A0f, (EmojiSearchProvider) r1.A1c.get(), A8r, A0r, A0w, str, i);
    }
}
