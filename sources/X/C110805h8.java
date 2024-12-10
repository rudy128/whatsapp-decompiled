package X;

import android.content.Context;

/* renamed from: X.5h8  reason: invalid class name and case insensitive filesystem */
public final class C110805h8 extends C03610Iy {
    public final AnonymousClass206 A00;
    public final Context A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110805h8(android.content.Context r17, android.view.View r18, X.AnonymousClass206 r19, X.C132456mq r20, X.C132886no r21) {
        /*
            r16 = this;
            r5 = r19
            boolean r1 = X.C108975cc.A1K(r5)
            r4 = r20
            r2 = r21
            X.C18070vi.A0l(r2, r4)
            r13 = 0
            r14 = 2130970787(0x7f0408a3, float:1.7550294E38)
            r10 = r16
            r11 = r17
            r12 = r18
            r15 = r13
            r10.<init>(r11, r12, r13, r14, r15)
            r10.A01 = r11
            r10.A00 = r5
            X.01m r3 = r10.A03
            java.util.ArrayList r6 = X.C108965cb.A0t(r3)
            X.36j r0 = X.C63672tV.A02(r5)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x00e5
        L_0x002f:
            X.00H r7 = r2.A03
            java.lang.Object r9 = X.C18070vi.A0E(r7)
            X.72B r9 = (X.AnonymousClass72B) r9
            java.util.List r8 = X.C18070vi.A0M(r5)
            X.6Re r1 = X.C122646Re.FACEBOOK
            r0 = 4
            boolean r0 = r9.A04(r1, r8, r0, r13)
            if (r0 != 0) goto L_0x005e
            X.1wv r0 = r2.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x007b
            boolean r0 = r5 instanceof X.C441822l
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r7.get()
            X.72B r0 = (X.AnonymousClass72B) r0
            X.6R1 r1 = r0.A02(r13)
            X.6R1 r0 = X.AnonymousClass6R1.DISABLED
            if (r1 != r0) goto L_0x007b
        L_0x005e:
            X.00H r0 = r2.A04
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            boolean r0 = r0.A09(r5)
            if (r0 == 0) goto L_0x007b
            r0 = 2131432627(0x7f0b14b3, float:1.8487017E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892013(0x7f12172d, float:1.9418762E38)
            java.lang.String r0 = r11.getString(r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r6)
        L_0x007b:
            java.lang.Object r8 = X.C18070vi.A0E(r7)
            X.72B r8 = (X.AnonymousClass72B) r8
            java.util.List r7 = X.C18070vi.A0M(r5)
            X.6Re r1 = X.C122646Re.INSTAGRAM
            r0 = 4
            boolean r0 = r8.A04(r1, r7, r0, r13)
            if (r0 == 0) goto L_0x00ab
            X.00H r0 = r2.A04
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            boolean r0 = r0.A09(r5)
            if (r0 == 0) goto L_0x00ab
            r0 = 2131432628(0x7f0b14b4, float:1.8487019E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892014(0x7f12172e, float:1.9418764E38)
            java.lang.String r0 = r11.getString(r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r6)
        L_0x00ab:
            r4.A00()
            X.206 r0 = r10.A00
            X.C18070vi.A0d(r0, r13)
            r0 = 2131432582(0x7f0b1486, float:1.8486926E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892010(0x7f12172a, float:1.9418756E38)
            java.lang.String r0 = r11.getString(r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x00c8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r2 = r4.next()
            X.0yx r2 = (X.C19760yx) r2
            java.lang.Object r0 = r2.A00
            X.C18070vi.A0W(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r2.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.add((int) r13, (int) r1, (int) r13, (java.lang.CharSequence) r0)
            goto L_0x00c8
        L_0x00e5:
            r0 = 2131432588(0x7f0b148c, float:1.8486938E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892011(0x7f12172b, float:1.9418758E38)
            java.lang.String r0 = r11.getString(r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r6)
            r0 = 2131432629(0x7f0b14b5, float:1.848702E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892012(0x7f12172c, float:1.941876E38)
            java.lang.String r0 = r11.getString(r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r6)
            goto L_0x002f
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110805h8.<init>(android.content.Context, android.view.View, X.206, X.6mq, X.6no):void");
    }
}
