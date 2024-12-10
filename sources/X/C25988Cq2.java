package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: X.Cq2  reason: case insensitive filesystem */
public final class C25988Cq2 {
    public C25219CbF A00;
    public boolean A01;
    public boolean A02;
    public final C18030ve A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C27780Dl0(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C27781Dl1(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C27782Dl2(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C27783Dl3(this));

    public C25988Cq2(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        if (X.AnonymousClass1ZO.A02(r8, X.AnonymousClass1ZO.A01(r1)) < 960) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019d, code lost:
        if (X.AnonymousClass1ZO.A02(r8, X.AnonymousClass1ZO.A01(r1)) < 960) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C140066zt A02(android.content.Context r27, int r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r9 = 0
            r4 = r26
            boolean r0 = r4.A01
            r8 = r27
            if (r0 != 0) goto L_0x0037
            boolean r0 = X.C22781De.A03()
            if (r0 != 0) goto L_0x0037
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0037
            r2 = 1
            r4.A01 = r2
            X.1Di r1 = X.C25432Cfe.A00
            X.D7F r0 = X.C24507C7b.A00(r8)
            java.lang.Object r0 = r1.invoke(r0)
            X.EAn r0 = (X.EAn) r0
            X.C18070vi.A0d(r0, r2)
            r1 = r8
            android.app.Activity r1 = (android.app.Activity) r1
            X.C18070vi.A0d(r1, r9)
            X.D7F r0 = (X.D7F) r0
            X.E8S r0 = r0.A00
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.Be4(r1)
        L_0x0035:
            r4.A02 = r0
        L_0x0037:
            X.CbF r3 = r4.A00
            r6 = r28
            r5 = r29
            r7 = r30
            if (r3 == 0) goto L_0x009c
            boolean r10 = r4.A02
            int r11 = r3.A00
            if (r11 != r6) goto L_0x005d
            boolean r0 = r3.A02
            if (r0 != r10) goto L_0x005d
            boolean r0 = r3.A04
            if (r0 != r7) goto L_0x005d
            boolean r0 = r3.A03
            if (r0 != r5) goto L_0x005d
            java.lang.String r0 = "StatusTileCalculator/calculateStatusTileSpec cache hit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6zt r0 = r3.A01
            return r0
        L_0x005b:
            r0 = 0
            goto L_0x0035
        L_0x005d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "\n                StatusTileCalculator/calculateStatusTileSpec cache miss changes:\n                screenOrientation: "
            r2.append(r0)
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1S(r11, r6)
            r2.append(r0)
            java.lang.String r0 = "\n                isEmbedded: "
            r2.append(r0)
            boolean r0 = r3.A02
            boolean r0 = X.AnonymousClass000.A1S(r0, r10)
            r2.append(r0)
            java.lang.String r0 = "\n                isVerticalGrid: "
            r2.append(r0)
            boolean r0 = r3.A04
            boolean r0 = X.AnonymousClass000.A1S(r0, r7)
            r2.append(r0)
            java.lang.String r0 = "\n                isHorizontalGridEnabled: "
            r2.append(r0)
            boolean r0 = r3.A03
            if (r0 != r5) goto L_0x0094
            r1 = 0
        L_0x0094:
            r2.append(r1)
            java.lang.String r0 = "\n                "
            X.C17890vO.A1A(r2, r0)
        L_0x009c:
            java.lang.String r0 = "StatusTileCalculator/calculateStatusTileSpec cache miss"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r16 = "StatusTileCalculator/calculateStatusTileSpec saving to cache"
            if (r30 != 0) goto L_0x00ea
            if (r29 == 0) goto L_0x00cc
            boolean r2 = r4.A02
            android.content.res.Configuration r0 = X.C108965cb.A03(r8)
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L_0x00cc
            if (r2 != 0) goto L_0x00cc
            android.app.Activity r1 = X.C18050vg.A00(r8)
            if (r1 == 0) goto L_0x00ea
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x00ea
            float r0 = X.AnonymousClass1ZO.A01(r1)
            int r1 = X.AnonymousClass1ZO.A02(r8, r0)
            r0 = 960(0x3c0, float:1.345E-42)
            if (r1 < r0) goto L_0x00ea
        L_0x00cc:
            boolean r0 = r4.A02
            r9 = 0
            r7 = r4
            r10 = r9
            r11 = r6
            r12 = r0
            r13 = r5
            X.6zt r8 = r7.A01(r8, r9, r10, r11, r12, r13)
            boolean r1 = r4.A02
            X.CbF r0 = new X.CbF
            r11 = 0
            r12 = r5
            r7 = r0
            r9 = r6
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r4.A00 = r0
            com.whatsapp.util.Log.i((java.lang.String) r16)
            return r8
        L_0x00ea:
            android.graphics.Point r0 = A00(r8, r6)
            int r10 = r0.x
            int r0 = r0.y
            double r2 = (double) r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r0
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            float r11 = X.BE7.A02(r8, r0)
            if (r30 == 0) goto L_0x0183
            r0 = 2
            r12 = 3
            if (r6 != r0) goto L_0x0104
            r12 = 6
        L_0x0104:
            int r0 = r12 + -1
            float r1 = (float) r0
            float r1 = r1 * r11
            r0 = 2131169103(0x7f070f4f, float:1.7952527E38)
            float r0 = X.BE7.A02(r8, r0)
            int r0 = (int) r0
            int r0 = r0 * 2
            int r0 = r10 - r0
            float r15 = (float) r0
            float r15 = r15 - r1
            float r0 = (float) r12
            float r15 = r15 / r0
            r0 = 2131168878(0x7f070e6e, float:1.795207E38)
            float r14 = X.BE7.A02(r8, r0)
            float r14 = r14 * r15
            r0 = 2131168882(0x7f070e72, float:1.7952078E38)
            float r0 = X.BE7.A02(r8, r0)
            float r14 = r14 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r14
            if (r30 != 0) goto L_0x015a
            double r0 = (double) r0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x015a
            int r0 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r0 = r4.A02
            r9 = r4
            r10 = r8
            r13 = r6
            r14 = r0
            r15 = r5
            X.6zt r17 = r9.A01(r10, r11, r12, r13, r14, r15)
        L_0x0146:
            boolean r1 = r4.A02
            X.CbF r0 = new X.CbF
            r8 = r0
            r9 = r17
            r10 = r6
            r11 = r1
            r12 = r7
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r4.A00 = r0
            com.whatsapp.util.Log.i((java.lang.String) r16)
            return r17
        L_0x015a:
            int r3 = (int) r15
            int r2 = (int) r14
            boolean r1 = r4.A02
            X.0vl r0 = r4.A04
            float r0 = X.C72453Mb.A00(r0)
            int r0 = X.C62762rw.A01(r8, r0)
            if (r3 >= r0) goto L_0x0180
            X.1sf r18 = X.C39191sf.EXTRA_SMALL
        L_0x016c:
            X.6zt r17 = new X.6zt
            r23 = r9
            r24 = r1
            r25 = r5
            r19 = r3
            r20 = r2
            r21 = r6
            r22 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0146
        L_0x0180:
            X.1sf r18 = X.C39191sf.SMALL
            goto L_0x016c
        L_0x0183:
            r0 = 1
            if (r6 != r0) goto L_0x01a2
            android.app.Activity r1 = X.C18050vg.A00(r8)
            if (r1 == 0) goto L_0x019f
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x019f
            float r0 = X.AnonymousClass1ZO.A01(r1)
            int r1 = X.AnonymousClass1ZO.A02(r8, r0)
            r0 = 960(0x3c0, float:1.345E-42)
            r12 = 7
            if (r1 >= r0) goto L_0x0104
        L_0x019f:
            r12 = 4
            goto L_0x0104
        L_0x01a2:
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r8)
            android.view.WindowManager r0 = r0.getWindowManager()
            android.graphics.Point r0 = X.C62762rw.A02(r0)
            int r0 = r0.x
            float r1 = (float) r0
            r0 = 2131168882(0x7f070e72, float:1.7952078E38)
            float r0 = X.BE7.A02(r8, r0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.floor(r0)
            float r12 = (float) r0
            int r12 = (int) r12
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25988Cq2.A02(android.content.Context, int, boolean, boolean):X.6zt");
    }

    private final C140066zt A01(Context context, Integer num, Integer num2, int i, boolean z, boolean z2) {
        int i2;
        float A002;
        C39191sf r12;
        Context context2 = context;
        int i3 = i;
        Point A003 = A00(context2, i3);
        float max = Math.max((float) Math.rint((double) (((float) A003.y) * 0.2f)), (float) C62762rw.A01(context2, 142.0f));
        Object obj = num;
        if (num == null) {
            obj = Float.valueOf(BE7.A02(context2, 2131168774));
        }
        float A042 = AnonymousClass000.A04(obj);
        float A022 = BE7.A02(context2, 2131168882);
        float A023 = BE7.A02(context2, 2131168878);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = A003.x;
        }
        float A024 = ((float) i2) - BE7.A02(context2, 2131169103);
        float A025 = BE7.A02(context2, 2131168879);
        float rint = ((float) Math.rint((double) ((max * A022) / A023))) * 1.0f;
        float f = rint + A042;
        float f2 = A024 / f;
        int floor = (int) ((float) Math.floor((double) f2));
        float f3 = (((f2 - ((float) floor)) * f) - A042) / rint;
        float f4 = (A025 / rint) * 1.5f;
        float f5 = 1.0f - f4;
        C18100vl r8 = this.A05;
        if (floor > C72453Mb.A0I(r8) || (floor == C72453Mb.A0I(r8) && f3 > C72453Mb.A00(this.A06))) {
            while (true) {
                if ((floor > C72453Mb.A0I(r8) || (floor == C72453Mb.A0I(r8) && f3 > C72453Mb.A00(this.A06))) && (f3 <= f4 || f3 >= f5)) {
                    rint *= 1.02f;
                    float f6 = rint + A042;
                    float f7 = A024 / f6;
                    floor = (int) ((float) Math.floor((double) f7));
                    f3 = (((f7 - ((float) floor)) * f6) - A042) / rint;
                    f4 = (A025 / rint) * 1.5f;
                    f5 = 1.0f - f4;
                }
            }
            A002 = ((float) floor) + C72453Mb.A00(this.A06);
        } else {
            A002 = C72453Mb.A00(this.A07);
        }
        float floor2 = (A024 - (((float) ((int) ((float) Math.floor((double) A002)))) * A042)) / A002;
        int i4 = (int) ((floor2 * A023) / A022);
        int i5 = (int) floor2;
        if (i5 < C62762rw.A01(context2, C72453Mb.A00(this.A04))) {
            r12 = C39191sf.EXTRA_SMALL;
        } else {
            r12 = C39191sf.SMALL;
        }
        return new C140066zt(r12, i5, i4, i3, 4, true, z, z2);
    }

    public static final Point A00(Context context, int i) {
        int A012;
        int A002;
        Activity A003 = AnonymousClass1L9.A00(context);
        if (i == 2) {
            Rect A072 = AnonymousClass3MW.A07();
            AnonymousClass3MZ.A0F(A003).getRootView().getWindowVisibleDisplayFrame(A072);
            A012 = C108945cZ.A05(A072.right, A072.left);
            A002 = C108945cZ.A05(A072.bottom, A072.top);
        } else {
            A012 = (int) AnonymousClass1ZO.A01(A003);
            A002 = (int) AnonymousClass1ZO.A00(A003);
        }
        return new Point(A012, A002);
    }
}
