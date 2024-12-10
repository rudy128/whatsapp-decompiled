package X;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.7BY  reason: invalid class name */
public final class AnonymousClass7BY implements AnonymousClass86O {
    public final Rect A00;
    public final Rect A01;
    public final AnonymousClass170 A02 = ((AnonymousClass170) C221618v.A01(16419));
    public final WeakReference A03;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (X.AnonymousClass000.A1Q((r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))) != X.AnonymousClass000.A1Q((r3 > r2 ? 1 : (r3 == r2 ? 0 : -1)))) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKl(X.C1404171i r12, X.C140006zn r13) {
        /*
            r11 = this;
            r2 = 0
            java.lang.Object r0 = r12.A03
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.String r9 = X.C108955ca.A0w(r0)
            float r6 = r13.A01(r12)
            android.graphics.Rect r7 = r11.A00
            java.util.Map r3 = r13.A04
            java.lang.String r4 = r12.A00
            java.lang.Object r0 = r3.get(r4)
            X.6fh r0 = (X.C128256fh) r0
            if (r0 == 0) goto L_0x00dd
            android.graphics.Rect r5 = r0.A01
            int r0 = r5.top
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00dd
            int r0 = r5.left
            if (r0 == r1) goto L_0x00dd
            int r0 = r5.right
            if (r0 == r1) goto L_0x00dd
            int r0 = r5.bottom
            if (r0 == r1) goto L_0x00dd
            r7.set(r5)
            android.graphics.Rect r5 = r11.A01
            r5.setEmpty()
            java.util.List r0 = r13.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r5.union(r0)
            goto L_0x003d
        L_0x004d:
            int r1 = r7.centerY()
            int r0 = r5.centerY()
            int r8 = X.C108945cZ.A05(r1, r0)
            java.lang.ref.WeakReference r0 = r11.A03
            java.lang.Object r10 = r0.get()
            X.3uK r10 = (X.AnonymousClass3uK) r10
            if (r10 != 0) goto L_0x0069
            java.lang.String r0 = "VideoPlaybackAction/execute/conversationRowVideo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0068:
            return
        L_0x0069:
            java.lang.Object r0 = r3.get(r4)
            X.6fh r0 = (X.C128256fh) r0
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0090
            r0 = 1
            if (r1 == r0) goto L_0x009e
            X.170 r3 = r11.A02
            r2 = 1
            java.util.HashMap r0 = r3.A05
            r0.remove(r9)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x008d
            X.4VQ r0 = r10.A06
            if (r0 == 0) goto L_0x008d
            r0.A03()
        L_0x008d:
            r3.A02 = r2
            return
        L_0x0090:
            X.170 r3 = r11.A02
            r2 = 1
            java.util.HashMap r1 = r3.A05
            X.6ma r0 = new X.6ma
            r0.<init>(r10, r6, r8)
            r1.put(r9, r0)
            goto L_0x008d
        L_0x009e:
            X.170 r7 = r11.A02
            r5 = 1
            java.util.HashMap r1 = r7.A05
            java.lang.Object r4 = r1.get(r9)
            X.6ma r4 = (X.C132316ma) r4
            if (r4 != 0) goto L_0x00b6
            X.6ma r0 = new X.6ma
            r0.<init>(r10, r6, r8)
            r1.put(r9, r0)
            r7.A02 = r5
            return
        L_0x00b6:
            float r3 = r4.A00
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r0 = r4.A01
            if (r0 == r8) goto L_0x0068
        L_0x00c0:
            int r0 = r1.size()
            if (r0 > r5) goto L_0x00d6
            float r2 = r7.A00
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r1 == r0) goto L_0x00d8
        L_0x00d6:
            r7.A02 = r5
        L_0x00d8:
            r4.A00 = r6
            r4.A01 = r8
            return
        L_0x00dd:
            java.lang.String r0 = "This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BY.BKl(X.71i, X.6zn):void");
    }

    public AnonymousClass7BY(AnonymousClass3uK r2) {
        this.A03 = AnonymousClass3MW.A0z(r2);
        this.A00 = AnonymousClass3MW.A07();
        this.A01 = AnonymousClass3MW.A07();
    }
}
