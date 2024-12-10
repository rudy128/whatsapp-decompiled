package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: X.BPj  reason: case insensitive filesystem */
public class C22796BPj extends BPW {
    public static Bitmap A04;
    public static PorterDuffColorFilter A05;
    public static C26022Cqg A06;
    public static final ArrayList A07 = C17880vN.A0z(5);
    public int A00;
    public EnumSet A01;
    public final Paint A02;
    public final BPX A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CJB] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22796BPj(X.DAE r19, X.BPX r20) {
        /*
            r18 = this;
            X.CJB r3 = new X.CJB
            r3.<init>()
            r4 = r20
            r3.A00 = r4
            r1 = 0
            X.Cqg r0 = A06
            if (r0 != 0) goto L_0x0015
            X.Cqg r0 = new X.Cqg
            r0.<init>()
            A06 = r0
        L_0x0015:
            r2 = r18
            r5 = r19
            r2.<init>(r5, r0, r3)
            r0 = 3
            android.graphics.Paint r0 = X.C108945cZ.A0K(r0)
            r2.A02 = r0
            r0 = 1
            r2.A00 = r0
            r2.A03 = r1
            r2.A03 = r4
            X.CTh r0 = r4.A03
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "dark"
        L_0x0032:
            r4.A01 = r0
            X.DAE r1 = r2.A07
            X.BIS r0 = r1.A0Q
            java.util.EnumSet r0 = r0.A0g
            r2.A01 = r0
            X.BPY r0 = new X.BPY
            r0.<init>(r2)
            r2.A08 = r0
            android.graphics.Bitmap r0 = A04
            if (r0 != 0) goto L_0x00ac
            int r3 = r1.A0N
            android.content.Context r0 = r1.A0O
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r0)
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            A04 = r0
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L_0x0066
            r2 = 32
        L_0x0066:
            android.graphics.Paint r9 = X.AnonymousClass3MW.A06()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L_0x0072:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00ac
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L_0x0083
        L_0x0081:
            r0 = 44
        L_0x0083:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r10 = r4
            r12 = r6
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r5
            r12 = r4
            r13 = r6
            r14 = r5
            r15 = r8
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r16 = r11
            r14 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L_0x0072
        L_0x00aa:
            r0 = 0
            goto L_0x0032
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22796BPj.<init>(X.DAE, X.BPX):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A07;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (((double) size) * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((BPS) arrayList.get(i2)).A07;
        }
        int i3 = ((int) (((double) i) * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    public void A08(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A08(canvas);
        BE8.A0z(C26138Ct1.A0F, nanoTime);
    }

    public C26146CtA A09(int i, int i2, int i3) {
        C26146CtA A09 = super.A09(i, i2, i3);
        if (A09 != null) {
            A09.A02 = i;
            A09.A03 = i2;
            A09.A04 = i3;
        }
        return A09;
    }

    public void A0A() {
        super.A0A();
        this.A07 = 0;
        ArrayList arrayList = A07;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            C26022Cqg cqg = this.A09;
            if (cqg.A03 != -1) {
                cqg.A03 = -1;
            }
        }
        int[] iArr = this.A0B;
        A00(iArr);
        C26022Cqg cqg2 = this.A09;
        cqg2.A01 = iArr[0];
        cqg2.A02 = iArr[1];
        cqg2.A02();
    }
}
