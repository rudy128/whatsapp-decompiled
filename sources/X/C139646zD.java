package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.animated.webp.WebPImage;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.6zD  reason: invalid class name and case insensitive filesystem */
public class C139646zD {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public boolean A03;
    public int A04;
    public long A05;
    public Canvas A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Bitmap A0B;
    public final AnonymousClass1KB A0C;
    public final C18030ve A0D;
    public final C139396yl A0E;
    public final C26661Sz A0F;
    public final C127916f9 A0G;
    public final Runnable A0H = new AnonymousClass7RI(this);
    public final Set A0I = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean A0J;

    public C139646zD(Bitmap bitmap, WebPImage webPImage, AnonymousClass1KB r11, C18030ve r12, C26661Sz r13, String str, int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        this.A0C = r11;
        this.A0F = r13;
        this.A0B = bitmap;
        this.A0G = new C127916f9(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A08 = i6;
        this.A07 = i5;
        this.A0E = new C139396yl(bitmap, webPImage, str, i6, i5);
        this.A0D = r12;
        this.A09 = (i3 - i) / 2;
        this.A0A = (i4 - i2) / 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0D, 8746) != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Canvas A00() {
        /*
            r3 = this;
            android.graphics.Bitmap r0 = r3.A02
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L_0x0026
            X.0ve r2 = r3.A0D
            r1 = 8746(0x222a, float:1.2256E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0026
        L_0x0016:
            int r1 = r3.A08
            int r0 = r3.A07
            android.graphics.Bitmap r0 = X.C108945cZ.A0H(r1, r0)
            r3.A02 = r0
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r0)
            r3.A06 = r0
        L_0x0026:
            android.graphics.Canvas r0 = r3.A06
            if (r0 != 0) goto L_0x0032
            android.graphics.Bitmap r0 = r3.A02
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r0)
            r3.A06 = r0
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139646zD.A00():android.graphics.Canvas");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r6 = r12.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r16 = this;
            r12 = r16
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x014e
            X.6f9 r6 = r12.A0G
            int r5 = r6.A00
            r4 = 1
            if (r5 <= r4) goto L_0x014e
            java.util.Set r7 = r12.A0I
            int r0 = r7.size()
            if (r0 == 0) goto L_0x014e
            long r14 = android.os.SystemClock.uptimeMillis()
            long r2 = r12.A05
            int r0 = r12.A04
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0145
            android.graphics.Bitmap r3 = r12.A01
            if (r3 == 0) goto L_0x005c
            android.graphics.Bitmap r1 = r12.A02
            if (r1 == 0) goto L_0x002f
            r0 = 0
            r1.eraseColor(r0)
        L_0x002f:
            X.0ve r10 = r12.A0D
            r0 = 8746(0x222a, float:1.2256E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            java.lang.String r11 = "AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap"
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L_0x007a
            android.graphics.Canvas r8 = r12.A00()
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x008b
            r0 = 11141(0x2b85, float:1.5612E-41)
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
        L_0x004f:
            if (r0 == 0) goto L_0x0076
            int r0 = r12.A09
            float r1 = (float) r0
            int r0 = r12.A0A
            float r0 = (float) r0
            r8.drawBitmap(r3, r1, r0, r2)
        L_0x005a:
            r12.A01 = r2
        L_0x005c:
            java.util.ArrayList r2 = X.C17880vN.A10(r7)
            java.util.Iterator r1 = r2.iterator()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()
            X.85t r0 = (X.C1597585t) r0
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x0064
        L_0x0076:
            r8.drawBitmap(r3, r1, r1, r2)
            goto L_0x005a
        L_0x007a:
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x008b
            r0 = 11141(0x2b85, float:1.5612E-41)
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            android.graphics.Canvas r8 = r12.A00()
            goto L_0x004f
        L_0x008b:
            com.whatsapp.util.Log.e((java.lang.String) r11)
            goto L_0x005a
        L_0x008f:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x00ce
            java.util.Iterator r9 = r2.iterator()
        L_0x0097:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r3 = r9.next()
            X.85t r3 = (X.C1597585t) r3
            X.5dZ r3 = (X.C109515dZ) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0097
            int r0 = r3.A00
            int r2 = r0 + 1
            r3.A00 = r2
            boolean r1 = r3.A05
            int r0 = r3.A01
            if (r1 == 0) goto L_0x00b7
            int r0 = r0 + 1
        L_0x00b7:
            if (r2 >= r0) goto L_0x00c7
            long r7 = android.os.SystemClock.uptimeMillis()
            long r0 = r3.A02
            long r7 = r7 - r0
            int r0 = X.C109515dZ.A0C
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
        L_0x00c7:
            r3.stop()
            goto L_0x0097
        L_0x00cb:
            r0 = 0
            r12.A03 = r0
        L_0x00ce:
            int r0 = r12.A00
            int r13 = r0 + 1
            int r13 = r13 % r5
            r12.A00 = r13
            if (r13 != 0) goto L_0x00d9
            r12.A03 = r4
        L_0x00d9:
            r12.A05 = r14
            int[] r0 = r6.A01
            r0 = r0[r13]
            r12.A04 = r0
            long r0 = (long) r0
            long r14 = r14 + r0
            X.1Sz r1 = r12.A0F
            X.6yl r11 = r12.A0E
            X.7PV r10 = new X.7PV
            r10.<init>(r11, r12, r13, r14)
            X.1T0 r8 = r1.A04
            monitor-enter(r8)
            java.util.PriorityQueue r7 = r8.A01     // Catch:{ all -> 0x0140 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00f5:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0140 }
            X.7PV r3 = (X.AnonymousClass7PV) r3     // Catch:{ all -> 0x0140 }
            int r2 = r3.A00     // Catch:{ all -> 0x0140 }
            int r0 = r10.A00     // Catch:{ all -> 0x0140 }
            if (r2 < r0) goto L_0x00f5
            X.6yl r2 = r3.A02     // Catch:{ all -> 0x0140 }
            X.6yl r0 = r10.A02     // Catch:{ all -> 0x0140 }
            if (r2 != r0) goto L_0x00f5
            long r4 = r10.A01     // Catch:{ all -> 0x0140 }
            long r2 = r3.A01     // Catch:{ all -> 0x0140 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            r6.remove()     // Catch:{ all -> 0x0140 }
            goto L_0x00f5
        L_0x0119:
            r7.add(r10)     // Catch:{ all -> 0x0142 }
            r8.notifyAll()     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            X.6Mf r0 = r1.A00
            if (r0 != 0) goto L_0x015d
            X.0ve r5 = r1.A02
            X.1KB r4 = r1.A01
            X.1Sv r6 = r1.A03
            X.6cv r7 = new X.6cv
            r7.<init>(r1)
            X.6Mf r3 = new X.6Mf
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A00 = r3
            monitor-enter(r8)
            r8.A00 = r3     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            X.6Mf r0 = r1.A00
            r0.start()
            return
        L_0x0140:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0145:
            X.1KB r1 = r12.A0C
            java.lang.Runnable r0 = r12.A0H
            long r2 = r2 - r14
            r1.A0K(r0, r2)
            return
        L_0x014e:
            r0 = 0
            r12.A0J = r0
            android.graphics.Bitmap r1 = r12.A02
            r0 = 0
            if (r1 == 0) goto L_0x015b
            r1.recycle()
            r12.A02 = r0
        L_0x015b:
            r12.A01 = r0
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139646zD.A01():void");
    }

    public void finalize() {
        this.A0E.finalize();
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            bitmap.recycle();
            this.A02 = null;
        }
    }
}
