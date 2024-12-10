package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.SystemClock;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73x  reason: invalid class name and case insensitive filesystem */
public final class C1410073x {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public Bitmap A08;
    public C1409773u A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C = C108945cZ.A0K(1);
    public final PointF A0D = new PointF();
    public final AnonymousClass87P A0E;
    public final C1405671z A0F;
    public final AnonymousClass70N A0G;
    public final AnonymousClass11P A0H;

    public C1410073x(AnonymousClass11P r3, AnonymousClass87P r4, C1405671z r5, AnonymousClass70N r6) {
        C18070vi.A0d(r3, 1);
        this.A0H = r3;
        this.A0F = r5;
        this.A0G = r6;
        this.A0E = r4;
    }

    public final void A06() {
        this.A0B = false;
        this.A0E.CFU();
    }

    public static C1410073x A00(DoodleView doodleView, C1405671z r4, AnonymousClass70N r5) {
        return new C1410073x(doodleView.A05, new AnonymousClass7J6(doodleView, 1), r4, r5);
    }

    public static final void A01(Canvas canvas, C1410073x r5) {
        AnonymousClass70N r0 = r5.A0G;
        AnonymousClass69K A012 = r0.A01();
        if (A012 != null) {
            for (AnonymousClass69V r1 : r0.A04()) {
                if (r1.A04 instanceof C1196869l) {
                    if (r5.A0A) {
                        SystemClock.elapsedRealtime();
                    }
                    r1.A03 = A012;
                    r1.A06 = true;
                    r1.A0M(canvas);
                    r1.A06 = false;
                }
            }
        }
    }

    public static void A02(DoodleView doodleView) {
        doodleView.A0J.A0A = true;
        SystemClock.elapsedRealtime();
        doodleView.invalidate();
    }

    public static final boolean A03(C1410073x r4, List list) {
        if (!AnonymousClass000.A1X(r4.A0G.A01()) || r4.A06 != null || r4.A05 != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof AnonymousClass69V) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r6 == r3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.C1410073x r8, boolean r9) {
        /*
            X.70N r0 = r8.A0G
            X.69K r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r7 = 0
            if (r0 == 0) goto L_0x001d
            X.71z r0 = r8.A0F
            android.graphics.RectF r5 = r0.A08
            android.util.DisplayMetrics r1 = r0.A09
            if (r5 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            android.graphics.Bitmap r0 = r8.A05
            if (r0 != 0) goto L_0x001e
            if (r9 != 0) goto L_0x001e
        L_0x001d:
            return r7
        L_0x001e:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C108945cZ.A01(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A05
            if (r0 == 0) goto L_0x0071
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0071
            android.graphics.Bitmap r0 = r8.A05
            if (r0 == 0) goto L_0x0071
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0071
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            if (r6 == r3) goto L_0x001d
        L_0x0071:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A05
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = X.C123916Wi.A00(r3, r2, r0)
            r8.A05 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410073x.A04(X.73x, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.C1410073x r8, boolean r9) {
        /*
            X.71z r0 = r8.A0F
            android.graphics.RectF r5 = r0.A08
            android.util.DisplayMetrics r1 = r0.A09
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A06
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C108945cZ.A01(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A06
            if (r0 == 0) goto L_0x0065
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0065
            android.graphics.Bitmap r0 = r8.A06
            if (r0 == 0) goto L_0x0065
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0065
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            if (r6 == r3) goto L_0x0011
        L_0x0065:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A06
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = X.C123916Wi.A00(r3, r2, r0)
            r8.A06 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410073x.A05(X.73x, boolean):boolean");
    }

    public final void A07() {
        List<AnonymousClass69V> A062;
        Bitmap bitmap;
        AnonymousClass70B r2;
        Bitmap bitmap2 = this.A06;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        Bitmap bitmap3 = this.A05;
        if (bitmap3 != null) {
            bitmap3.eraseColor(0);
        }
        AnonymousClass70N r1 = this.A0G;
        if (r1.A01() == null) {
            A062 = r1.A04();
        } else {
            A062 = AnonymousClass1b2.A06(AnonymousClass1b2.A0C(C1591583l.A00, AnonymousClass1b2.A09(C1591483k.A00, C29431cG.A0V(r1.A04))));
        }
        if (!A062.isEmpty()) {
            A04(this, true);
            A05(this, true);
            for (AnonymousClass69V r5 : A062) {
                if (r5.A04 instanceof C24024BuA) {
                    bitmap = this.A06;
                } else {
                    bitmap = this.A05;
                }
                if (bitmap != null) {
                    PointF pointF = this.A0D;
                    int i = this.A00;
                    C18070vi.A0d(pointF, 1);
                    r5.A01 = bitmap;
                    r5.A02 = pointF;
                    r5.A00 = i;
                }
                r5.A06 = false;
                Bitmap bitmap4 = r5.A01;
                if (!(bitmap4 == null || (r2 = r5.A04) == null)) {
                    r2.A03(bitmap4, r5.A02, r5.A00);
                    Canvas canvas = r2.A00;
                    if (canvas != null) {
                        r2.A04(canvas);
                    }
                }
            }
        }
    }
}
