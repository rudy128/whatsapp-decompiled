package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.BoI  reason: case insensitive filesystem */
public final class C23711BoI extends BV6 {
    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        C18070vi.A0d(view, 0);
        view.setBackground((Drawable) null);
        if (Build.VERSION.SDK_INT < 28) {
            view.setLayerType(0, (Paint) null);
        }
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        return new C01930Bz(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r0 == 0) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0M(android.view.View r21, X.DOZ r22, X.DFL r23, java.lang.Object r24) {
        /*
            r20 = this;
            r8 = r21
            r7 = r22
            r10 = r23
            boolean r12 = X.AnonymousClass8BX.A1U(r8, r7, r10)
            java.lang.Object r0 = X.BE9.A0l(r7, r10)
            X.CWp r0 = (X.C25080CWp) r0
            X.CbA r6 = r0.A00
            if (r6 == 0) goto L_0x00e1
            r0 = 42
            X.DFL r11 = r10.A09(r0)
            r9 = 40
            r14 = 0
            r5 = 0
            if (r11 == 0) goto L_0x00d4
            X.DFL r2 = X.BE7.A0O(r11)
            if (r2 == 0) goto L_0x0037
            r0 = 13314(0x3402, float:1.8657E-41)
            X.DFL r1 = new X.DFL
            r1.<init>(r0)
            X.CqB r0 = X.C25995CqB.A00()
            X.C5l r0 = r0.A01
            android.graphics.drawable.Drawable r14 = r0.A00(r7, r2, r1)
        L_0x0037:
            int r19 = X.C25885Cnw.A00(r7, r11)
            float r17 = X.CC7.A00(r11, r9)
            r0 = 46
            float r18 = X.CC7.A00(r11, r0)
            android.content.Context r4 = r7.A00
            r0 = 52
            r3 = 0
            X.DFL r0 = r11.A09(r0)
            if (r0 == 0) goto L_0x0054
            int r3 = X.C25340Cdz.A01(r7, r0, r3)
        L_0x0054:
            X.C18070vi.A0b(r4)
            r0 = 58
            float r0 = r11.A03(r0, r5)
            float r2 = X.C25342Ce1.A00(r4, r0)
            r0 = 57
            float r0 = r11.A03(r0, r5)
            float r1 = X.C25342Ce1.A00(r4, r0)
            r0 = 59
            float r0 = r11.A03(r0, r5)
            float r0 = X.C25342Ce1.A00(r4, r0)
            X.Can r15 = new X.Can
            r15.<init>(r2, r1, r0, r3)
        L_0x007a:
            java.lang.String r4 = r10.A0D(r9)
            r0 = 3
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r0)
            int r2 = r3.length
            r1 = 0
        L_0x0085:
            if (r1 >= r2) goto L_0x00dc
            r16 = r3[r1]
            int r0 = r16.intValue()
            switch(r0) {
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ce;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.String r0 = "default"
        L_0x0092:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00cb
            X.CbI r13 = new X.CbI
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.Ca5 r3 = new X.Ca5
            r3.<init>(r13, r6)
            X.CbI r0 = r3.A00
            X.Can r1 = r0.A04
            if (r1 == 0) goto L_0x00b3
            float r0 = r1.A02
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            int r0 = r1.A03
            r1 = 1
            if (r0 != 0) goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            r2 = 0
            if (r1 == 0) goto L_0x00c0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x00c0
            r8.setLayerType(r12, r2)
        L_0x00c0:
            android.content.Context r1 = r7.A00
            X.BEw r0 = new X.BEw
            r0.<init>(r1, r3)
            r8.setBackground(r0)
            return r2
        L_0x00cb:
            int r1 = r1 + 1
            goto L_0x0085
        L_0x00ce:
            java.lang.String r0 = "none"
            goto L_0x0092
        L_0x00d1:
            java.lang.String r0 = "shark-fin"
            goto L_0x0092
        L_0x00d4:
            r15 = r14
            r19 = 0
            r17 = 0
            r18 = 0
            goto L_0x007a
        L_0x00dc:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x00e1:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23711BoI.A0M(android.view.View, X.DOZ, X.DFL, java.lang.Object):java.lang.Object");
    }

    public C23711BoI(DOZ doz, DFL dfl) {
        super(doz, dfl);
    }
}
