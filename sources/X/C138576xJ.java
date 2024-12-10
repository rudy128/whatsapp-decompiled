package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6xJ  reason: invalid class name and case insensitive filesystem */
public class C138576xJ {
    public C1409773u A00;
    public RectF A01;
    public final C126116cD A02;
    public final C1405671z A03;
    public final AnonymousClass6p8 A04;
    public final C139356yh A05;
    public final AnonymousClass71K A06;

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.6q1, X.69I] */
    public static void A00(C138576xJ r9) {
        C1405671z r2 = r9.A03;
        if (r2.A08 != null) {
            RectF A08 = AnonymousClass3MW.A08();
            r2.A0A.mapRect(A08, r2.A08);
            int i = r2.A04;
            int i2 = r2.A03;
            float width = A08.width() / A08.height();
            float f = (float) i;
            float f2 = (float) i2;
            if (width > f / f2) {
                f2 = f / width;
            } else {
                f = width * f2;
            }
            float f3 = (float) (i / 2);
            float f4 = (float) (i2 / 2);
            float f5 = f / 2.0f;
            float f6 = f2 / 2.0f;
            RectF rectF = new RectF(f3 - f5, f4 - f6, f3 + f5, f4 + f6);
            RectF rectF2 = r9.A01;
            if (rectF2 == null || !rectF2.equals(rectF)) {
                r9.A01 = rectF;
                C139356yh r4 = r9.A05;
                RectF rectF3 = r4.A02;
                rectF3.set(rectF);
                Map map = r4.A05;
                Iterator A0l = C17890vO.A0l(map);
                while (A0l.hasNext()) {
                    AnonymousClass6q1 r0 = (AnonymousClass6q1) A0l.next();
                    View view = r0.A05;
                    if (view != null) {
                        r0.A06.removeView(view);
                    }
                }
                map.clear();
                Integer A0h = C17880vN.A0h();
                Handler handler = r4.A09;
                ViewGroup viewGroup = r4.A0A;
                Vibrator vibrator = r4.A03;
                Integer A0T = C108975cc.A0T(C108975cc.A0S(A0h, new AnonymousClass69H(rectF3, handler, vibrator, viewGroup, 1), map), new AnonymousClass69H(rectF3, handler, vibrator, viewGroup, 2), map);
                ? r1 = new AnonymousClass6q1(rectF3, handler, vibrator, viewGroup);
                r1.A01 = -1;
                r1.A03 = false;
                r1.A00 = 0.0f;
                map.put(A0T, r1);
            }
        }
    }

    public C138576xJ(C126116cD r2, C1405671z r3, C139356yh r4, AnonymousClass71K r5) {
        this.A03 = r3;
        this.A04 = new AnonymousClass6p8(r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = r2;
    }
}
