package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1qV  reason: invalid class name and case insensitive filesystem */
public class C37981qV extends C37971qU {
    public static TimeInterpolator A0B;
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();

    public static void A00(C37981qV r2, C42011xT r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0B);
        r2.A0E(r3);
    }

    public static boolean A03(AnonymousClass6UZ r4, C37981qV r5, C42011xT r6) {
        if (r4.A04 == r6) {
            r4.A04 = null;
        } else if (r4.A05 != r6) {
            return false;
        } else {
            r4.A05 = null;
        }
        View view = r6.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        r5.A08(r6);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.2Rx] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r1 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.C42011xT r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            android.view.View r2 = r4.A0H
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r5 = r5 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r6 = r6 + r0
            A00(r3, r4)
            int r0 = r7 - r5
            int r1 = r8 - r6
            if (r0 != 0) goto L_0x001e
            if (r1 != 0) goto L_0x0025
            r3.A08(r4)
            r0 = 0
            return r0
        L_0x001e:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002a
        L_0x0025:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002a:
            java.util.ArrayList r1 = r3.A08
            X.2Rx r0 = new X.2Rx
            r0.<init>()
            r0.A04 = r4
            r0.A00 = r5
            r0.A01 = r6
            r0.A02 = r7
            r0.A03 = r8
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37981qV.A0L(X.1xT, int, int, int, int):boolean");
    }

    public static void A01(C37981qV r3, C42011xT r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass6UZ r1 = (AnonymousClass6UZ) list.get(size);
                if (A03(r1, r3, r4) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public static void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42011xT) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
        }
    }

    public boolean A0K(C42011xT r3) {
        A00(this, r3);
        r3.A0H.setAlpha(0.0f);
        this.A06.add(r3);
        return true;
    }
}
