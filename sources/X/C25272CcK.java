package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.CcK  reason: case insensitive filesystem */
public abstract class C25272CcK {
    public int A00 = -1;
    public View A01;
    public C38251qy A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C67 A07;

    public void A01() {
        CP3 cp3;
        BMI bmi = (BMI) this;
        if ((bmi instanceof BLm) && (cp3 = ((BLm) bmi).A02) != null) {
            cp3.A01.A08((RecyclerView) null);
        }
    }

    public abstract void A03();

    public abstract void A05(View view, C67 c67);

    public PointF A00(int i) {
        C38251qy r1 = this.A02;
        if (r1 instanceof C38261qz) {
            return ((C38261qz) r1).BFT(i);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        Log.w("RecyclerView", AnonymousClass000.A0y(C38261qz.class.getCanonicalName(), A10));
        return null;
    }

    public final void A02() {
        if (this.A05) {
            this.A05 = false;
            A03();
            this.A03.A0w.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            C38251qy r1 = this.A02;
            if (r1.A06 == this) {
                r1.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r10, int r11) {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r9.A03
            int r1 = r9.A00
            r0 = -1
            if (r1 == r0) goto L_0x0009
            if (r4 != 0) goto L_0x000c
        L_0x0009:
            r9.A02()
        L_0x000c:
            boolean r0 = r9.A04
            r2 = 0
            if (r0 == 0) goto L_0x003d
            android.view.View r0 = r9.A01
            if (r0 != 0) goto L_0x003d
            X.1qy r0 = r9.A02
            if (r0 == 0) goto L_0x003d
            int r0 = r9.A00
            android.graphics.PointF r5 = r9.A00(r0)
            if (r5 == 0) goto L_0x003d
            float r3 = r5.x
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            float r0 = r5.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
        L_0x002e:
            float r0 = java.lang.Math.signum(r3)
            int r1 = (int) r0
            float r0 = r5.y
            float r0 = java.lang.Math.signum(r0)
            int r0 = (int) r0
            r4.A0o(r1, r2, r0)
        L_0x003d:
            r0 = 0
            r9.A04 = r0
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x0059
            int r1 = androidx.recyclerview.widget.RecyclerView.A01(r0)
            int r0 = r9.A00
            if (r1 != r0) goto L_0x00fc
            android.view.View r1 = r9.A01
            X.C67 r0 = r9.A07
            r9.A05(r1, r0)
            r0.A00(r4)
            r9.A02()
        L_0x0059:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x00b7
            X.C67 r5 = r9.A07
            r7 = r9
            X.BMI r7 = (X.BMI) r7
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.1qy r0 = r0.A0D
            int r0 = r0.A0J()
            if (r0 == 0) goto L_0x009d
            int r0 = r7.A01
            int r2 = r0 - r10
            int r0 = r0 * r2
            if (r0 > 0) goto L_0x0074
            r2 = 0
        L_0x0074:
            r7.A01 = r2
            int r1 = r7.A02
            int r0 = r1 - r11
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x007e
            r0 = 0
        L_0x007e:
            r7.A02 = r0
            if (r2 != 0) goto L_0x00a0
            if (r0 != 0) goto L_0x00a0
            int r0 = r7.A00
            android.graphics.PointF r8 = r7.A00(r0)
            if (r8 == 0) goto L_0x0099
            float r6 = r8.x
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            float r0 = r8.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
        L_0x0099:
            int r0 = r7.A00
            r5.A04 = r0
        L_0x009d:
            r7.A02()
        L_0x00a0:
            int r0 = r5.A04
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r5.A00(r4)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x00b7
            r0 = 1
            r9.A04 = r0
            X.1qW r0 = r4.A0x
            r0.A00()
        L_0x00b7:
            return
        L_0x00b8:
            float r1 = r6 * r6
            float r3 = r8.y
            float r0 = r3 * r3
            float r1 = r1 + r0
            double r0 = (double) r1
            double r1 = java.lang.Math.sqrt(r0)
            float r0 = (float) r1
            float r6 = r6 / r0
            r8.x = r6
            float r3 = r3 / r0
            r8.y = r3
            r7.A03 = r8
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r6 = r6 * r1
            int r0 = (int) r6
            r7.A01 = r0
            float r3 = r3 * r1
            int r0 = (int) r3
            r7.A02 = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            int r6 = r7.A09(r0)
            int r0 = r7.A01
            float r0 = (float) r0
            r1 = 1067030938(0x3f99999a, float:1.2)
            float r0 = r0 * r1
            int r3 = (int) r0
            int r0 = r7.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            int r2 = (int) r0
            float r0 = (float) r6
            float r0 = r0 * r1
            int r1 = (int) r0
            android.view.animation.LinearInterpolator r0 = r7.A07
            r5.A02 = r3
            r5.A03 = r2
            r5.A01 = r1
            r5.A05 = r0
            r0 = 1
            r5.A06 = r0
            goto L_0x00a0
        L_0x00fc:
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r1, r0)
            r9.A01 = r2
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25272CcK.A04(int, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C67, java.lang.Object] */
    public C25272CcK() {
        ? obj = new Object();
        obj.A04 = -1;
        obj.A06 = false;
        obj.A00 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        obj.A01 = Integer.MIN_VALUE;
        obj.A05 = null;
        this.A07 = obj;
    }
}
