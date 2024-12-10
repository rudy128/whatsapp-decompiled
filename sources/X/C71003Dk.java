package X;

import android.graphics.Canvas;

/* renamed from: X.3Dk  reason: invalid class name and case insensitive filesystem */
public class C71003Dk implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71003Dk(Canvas canvas, C43081zE r2, C39221si r3, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = canvas;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011b, code lost:
        if (1 <= r6) goto L_0x00f7;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            if (r0 == 0) goto L_0x006a
            java.lang.Object r3 = r13.A01
            X.1zE r3 = (X.C43081zE) r3
            java.lang.Object r2 = r13.A02
            X.1si r2 = (X.C39221si) r2
            java.lang.Object r5 = r13.A03
            android.graphics.Canvas r5 = (android.graphics.Canvas) r5
            android.graphics.PorterDuffXfermode r0 = X.C43081zE.A0S
            X.0vl r0 = r3.A0Q
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            X.2QI r2 = (X.AnonymousClass2QI) r2
            X.1sh r0 = r2.A01
            int r0 = r0.statusColor
            java.lang.Object r0 = X.AnonymousClass000.A0w(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0056
            int r1 = r0.intValue()
            X.0vl r4 = r3.A0R
            java.lang.Object r0 = r4.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r1)
            X.1sg r0 = r3.A02
            X.25S r0 = r0.A00()
            android.graphics.RectF r3 = r3.A0E
            float r2 = r2.A00
            boolean r1 = r0 instanceof X.AnonymousClass2QA
            r0 = 0
            if (r1 == 0) goto L_0x0059
            X.C18070vi.A0d(r3, r0)
            android.graphics.Path r1 = X.AnonymousClass204.A07(r3)
        L_0x004d:
            java.lang.Object r0 = r4.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r5.drawPath(r1, r0)
        L_0x0056:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0059:
            X.C18070vi.A0d(r3, r0)
            r0 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r1.addArc(r3, r0, r2)
            goto L_0x004d
        L_0x006a:
            java.lang.Object r10 = r13.A01
            X.1zE r10 = (X.C43081zE) r10
            java.lang.Object r1 = r13.A02
            X.1si r1 = (X.C39221si) r1
            java.lang.Object r9 = r13.A03
            android.graphics.Canvas r9 = (android.graphics.Canvas) r9
            android.graphics.PorterDuffXfermode r0 = X.C43081zE.A0S
            X.1sg r0 = r10.A02
            X.25S r0 = r0.A00()
            android.graphics.RectF r8 = r10.A0E
            X.2QH r1 = (X.AnonymousClass2QH) r1
            java.util.List r7 = r1.A00
            int r6 = r7.size()
            boolean r1 = r0 instanceof X.AnonymousClass2QA
            r0 = 0
            if (r1 == 0) goto L_0x00e7
            X.C18070vi.A0d(r8, r0)
            android.graphics.Path r0 = X.AnonymousClass204.A07(r8)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r5)
        L_0x009b:
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L_0x00a0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r4 = r5.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x00b3
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x00b3:
            android.graphics.Path r4 = (android.graphics.Path) r4
            X.0vl r0 = r10.A0Q
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r7.get(r2)
            X.1sh r0 = (X.C39211sh) r0
            int r0 = r0.statusColor
            java.lang.Object r0 = X.AnonymousClass000.A0w(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00e5
            int r2 = r0.intValue()
            X.0vl r1 = r10.A0R
            java.lang.Object r0 = r1.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r2)
            java.lang.Object r0 = r1.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r9.drawPath(r4, r0)
        L_0x00e5:
            r2 = r3
            goto L_0x00a0
        L_0x00e7:
            X.C18070vi.A0d(r8, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = 1135869952(0x43b40000, float:360.0)
            float r0 = (float) r6
            float r12 = r12 / r0
            r4 = 1
            if (r6 != r4) goto L_0x0111
            r11 = 0
        L_0x00f7:
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x00f9:
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r11 / r0
            float r1 = r1 + r3
            float r0 = r12 - r11
            r2.addArc(r8, r1, r0)
            r5.add(r2)
            float r3 = r3 + r12
            if (r4 == r6) goto L_0x009b
            int r4 = r4 + 1
            goto L_0x00f9
        L_0x0111:
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x011e
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r12 / r0
        L_0x011b:
            if (r4 > r6) goto L_0x009b
            goto L_0x00f7
        L_0x011e:
            r11 = 1094713344(0x41400000, float:12.0)
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71003Dk.invoke():java.lang.Object");
    }
}
