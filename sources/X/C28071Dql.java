package X;

import android.graphics.Canvas;

/* renamed from: X.Dql  reason: case insensitive filesystem */
public final class C28071Dql extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Canvas $canvas;
    public final /* synthetic */ C25741ClB $state;
    public final /* synthetic */ C22879BTq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28071Dql(Canvas canvas, C25741ClB clB, C22879BTq bTq) {
        super(1);
        this.this$0 = bTq;
        this.$state = clB;
        this.$canvas = canvas;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r4 == r1) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r16
            android.graphics.Matrix r6 = (android.graphics.Matrix) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.BTq r3 = r15.this$0
            float r1 = r3.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            int r1 = r3.A01
            r0 = 3
            if (r1 != r0) goto L_0x0027
            r13 = r5
        L_0x0019:
            android.graphics.Canvas r8 = r15.$canvas
            X.BTq r2 = r15.this$0
            X.ClB r4 = r15.$state
            int r3 = r8.save()
            r8.concat(r6)
            goto L_0x0064
        L_0x0027:
            X.ClB r2 = r15.$state
            android.graphics.Paint r13 = r2.A01
            if (r13 != 0) goto L_0x0034
            r0 = 7
            android.graphics.Paint r13 = X.C108945cZ.A0K(r0)
            r2.A01 = r13
        L_0x0034:
            float r4 = r3.A00
            X.BTq r0 = r2.A04
            if (r0 == 0) goto L_0x0056
            float r1 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x0056
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
        L_0x0046:
            int r1 = r3.A01
            X.BTq r0 = r2.A04
            if (r0 == 0) goto L_0x0050
            int r0 = r0.A01
            if (r1 == r0) goto L_0x0053
        L_0x0050:
            X.C25904CoG.A01(r1, r13)
        L_0x0053:
            r2.A04 = r3
            goto L_0x0019
        L_0x0056:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r0
            int r1 = (int) r4
            int r0 = r13.getAlpha()
            if (r0 == r1) goto L_0x0046
            r13.setAlpha(r1)
            goto L_0x0046
        L_0x0064:
            long r0 = r2.A02     // Catch:{ all -> 0x00c7 }
            float r11 = X.AnonymousClass001.A02(r0)     // Catch:{ all -> 0x00c7 }
            float r12 = X.AnonymousClass001.A01(r0)     // Catch:{ all -> 0x00c7 }
            r9 = 0
            float r11 = r11 + r9
            float r12 = r12 + r9
            r14 = 31
            r10 = r9
            int r7 = r8.saveLayer(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00c7 }
            X.BU3 r0 = r2.A03     // Catch:{ all -> 0x00c2 }
            r6 = 0
            if (r0 == 0) goto L_0x00a5
            android.graphics.Path r0 = r4.A00(r0, r5)     // Catch:{ all -> 0x00c2 }
            int r5 = r8.save()     // Catch:{ all -> 0x00c2 }
            r8.clipPath(r0)     // Catch:{ all -> 0x00c2 }
            java.util.List r2 = r2.A04     // Catch:{ all -> 0x00a0 }
            int r1 = r2.size()     // Catch:{ all -> 0x00a0 }
        L_0x008e:
            if (r6 >= r1) goto L_0x009c
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x00a0 }
            X.E7f r0 = (X.C28554E7f) r0     // Catch:{ all -> 0x00a0 }
            r0.BJL(r8, r4)     // Catch:{ all -> 0x00a0 }
            int r6 = r6 + 1
            goto L_0x008e
        L_0x009c:
            r8.restoreToCount(r5)     // Catch:{ all -> 0x00c2 }
            goto L_0x00b9
        L_0x00a0:
            r0 = move-exception
            r8.restoreToCount(r5)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00a5:
            java.util.List r2 = r2.A04     // Catch:{ all -> 0x00c2 }
            int r1 = r2.size()     // Catch:{ all -> 0x00c2 }
        L_0x00ab:
            if (r6 >= r1) goto L_0x00b9
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x00c2 }
            X.E7f r0 = (X.C28554E7f) r0     // Catch:{ all -> 0x00c2 }
            r0.BJL(r8, r4)     // Catch:{ all -> 0x00c2 }
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00b9:
            r8.restoreToCount(r7)     // Catch:{ all -> 0x00c7 }
            r8.restoreToCount(r3)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c2:
            r0 = move-exception
            r8.restoreToCount(r7)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            r8.restoreToCount(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28071Dql.invoke(java.lang.Object):java.lang.Object");
    }
}
