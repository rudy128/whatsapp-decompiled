package X;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1mN  reason: invalid class name and case insensitive filesystem */
public class C35521mN extends C25871Py {
    public static final Charset A08 = Charset.defaultCharset();
    public Runnable A00 = null;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Runnable A07 = new C449025f((Object) this, 41);

    public C35521mN(C18010vc r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A01 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r7;
        this.A02 = new AnonymousClass3BG(r3, 2);
        this.A04 = new AnonymousClass3BG(r3, 3);
    }

    public static void A00(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str) || str.startsWith("ab_props:") || str.startsWith("prop_override:") || str.endsWith("_expo_key")) {
                it.remove();
            }
        }
    }
}
