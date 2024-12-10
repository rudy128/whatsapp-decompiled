package X;

import android.view.View;

/* renamed from: X.27c  reason: invalid class name */
public class AnonymousClass27c extends C29441cH {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass27c(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            switch(r5) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131436007(0x7f0b21e7, float:1.8493872E38)
        L_0x000a:
            r1 = 28
            r0 = 0
            r4.<init>(r3, r2, r0, r1)
            return
        L_0x0011:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131436013(0x7f0b21ed, float:1.8493884E38)
            goto L_0x000a
        L_0x0017:
            r3 = 2131436015(0x7f0b21ef, float:1.8493888E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r1 = 64
            r0 = 30
            r4.<init>(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27c.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object A01(View view) {
        boolean A06;
        switch (this.A00) {
            case 0:
                A06 = C28301Zv.A06(view);
                break;
            case 1:
                return C62692ro.A01(view);
            default:
                A06 = C28301Zv.A05(view);
                break;
        }
        return Boolean.valueOf(A06);
    }

    public /* bridge */ /* synthetic */ void A03(View view, Object obj) {
        switch (this.A00) {
            case 0:
                C28301Zv.A04(view, AnonymousClass000.A1Y(obj));
                return;
            case 1:
                C62692ro.A02(view, (CharSequence) obj);
                return;
            default:
                C28301Zv.A03(view, AnonymousClass000.A1Y(obj));
                return;
        }
    }
}
