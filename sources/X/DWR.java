package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;

public class DWR implements C18140vp {
    public final int A00;
    public final Object A01;

    public DWR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static GestureDetector A00(Context context, View view, Object obj, int i) {
        return new GestureDetector(context, new C72883Nw(view, new C94664kz(obj, i)));
    }

    public static C26993DOp A01(DWR dwr) {
        return (C26993DOp) ((C93084iP) dwr.A01).A00;
    }

    public static C18150vq A02(Object obj, int i) {
        return C18150vq.A02(new DWR(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        return r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0152, code lost:
        r3 = r3 / ((float) ((android.graphics.Rect) r0.get()).height());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0163, code lost:
        if (r3 < 0.0f) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0167, code lost:
        if (r3 > 1.0f) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016e, code lost:
        return java.lang.Float.valueOf(1.0f - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016f, code lost:
        r0 = (r3 > 0.0f ? 1 : (r3 == 0.0f ? 0 : -1));
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0173, code lost:
        if (r0 >= 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0175, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0186, code lost:
        r1 = r1 - ((float) ((android.graphics.Rect) r0.get()).top);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0198, code lost:
        r0 = 0.55f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a3, code lost:
        r0 = 0.45f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a6, code lost:
        r1 = r1 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ab, code lost:
        return java.lang.Float.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020f, code lost:
        return new X.D55(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0229, code lost:
        return new X.C825048f(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x002a;
                case 2: goto L_0x002d;
                case 3: goto L_0x0035;
                case 4: goto L_0x003d;
                case 5: goto L_0x0045;
                case 6: goto L_0x004d;
                case 7: goto L_0x0055;
                case 8: goto L_0x005d;
                case 9: goto L_0x0065;
                case 10: goto L_0x006d;
                case 11: goto L_0x0075;
                case 12: goto L_0x007d;
                case 13: goto L_0x0085;
                case 14: goto L_0x004d;
                case 15: goto L_0x0099;
                case 16: goto L_0x00a0;
                case 17: goto L_0x00a7;
                case 18: goto L_0x00ae;
                case 19: goto L_0x00b5;
                case 20: goto L_0x00bc;
                case 21: goto L_0x00c3;
                case 22: goto L_0x00ca;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00e5;
                case 26: goto L_0x00ec;
                case 27: goto L_0x00f3;
                case 28: goto L_0x00fa;
                case 29: goto L_0x0101;
                case 30: goto L_0x0108;
                case 31: goto L_0x0005;
                case 32: goto L_0x0113;
                case 33: goto L_0x011e;
                case 34: goto L_0x012b;
                case 35: goto L_0x0005;
                case 36: goto L_0x013b;
                case 37: goto L_0x0146;
                case 38: goto L_0x0177;
                case 39: goto L_0x0191;
                case 40: goto L_0x019c;
                case 41: goto L_0x01ac;
                case 42: goto L_0x01c7;
                case 43: goto L_0x01cb;
                case 44: goto L_0x01dc;
                case 45: goto L_0x01e0;
                case 46: goto L_0x01f1;
                case 47: goto L_0x0201;
                case 48: goto L_0x0210;
                case 49: goto L_0x0220;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getLeft()
            int r2 = r0.getTop()
            int r1 = r0.getRight()
            int r0 = r0.getBottom()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x001f:
            java.lang.Object r1 = r5.A01
            X.BId r1 = (X.C22654BId) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.9tr r4 = r1.A00
            return r4
        L_0x002a:
            java.lang.Object r4 = r5.A01
            return r4
        L_0x002d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0D
            goto L_0x010e
        L_0x0035:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0G
            goto L_0x010e
        L_0x003d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0E
            goto L_0x010e
        L_0x0045:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0K
            goto L_0x010e
        L_0x004d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A01
            goto L_0x010e
        L_0x0055:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0N
            goto L_0x010e
        L_0x005d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0O
            goto L_0x010e
        L_0x0065:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0P
            goto L_0x010e
        L_0x006d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0Q
            goto L_0x010e
        L_0x0075:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A04
            goto L_0x010e
        L_0x007d:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0M
            goto L_0x010e
        L_0x0085:
            java.lang.Object r0 = r5.A01
            X.4iP r0 = (X.C93084iP) r0
            android.graphics.Rect r4 = X.AnonymousClass3MW.A07()
            X.0vp r0 = r0.A0H
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.getPadding(r4)
            return r4
        L_0x0099:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0H
            goto L_0x010e
        L_0x00a0:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0I
            goto L_0x010e
        L_0x00a7:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A05
            goto L_0x010e
        L_0x00ae:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A06
            goto L_0x010e
        L_0x00b5:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A09
            goto L_0x010e
        L_0x00bc:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0A
            goto L_0x010e
        L_0x00c3:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A02
            goto L_0x010e
        L_0x00ca:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A03
            goto L_0x010e
        L_0x00d1:
            java.lang.Object r0 = r5.A01
            X.4iP r0 = (X.C93084iP) r0
            android.graphics.Rect r4 = X.AnonymousClass3MW.A07()
            X.0vp r0 = r0.A08
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.getPadding(r4)
            return r4
        L_0x00e5:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A07
            goto L_0x010e
        L_0x00ec:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0B
            goto L_0x010e
        L_0x00f3:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0F
            goto L_0x010e
        L_0x00fa:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0J
            goto L_0x010e
        L_0x0101:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A08
            goto L_0x010e
        L_0x0108:
            X.DOp r0 = A01(r5)
            X.0vl r0 = r0.A0C
        L_0x010e:
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x0113:
            java.lang.Object r0 = r5.A01
            X.Bq9 r0 = (X.Bq9) r0
            X.1Hk r0 = r0.A0A
            float r1 = X.BE9.A03(r0)
            goto L_0x0198
        L_0x011e:
            java.lang.Object r1 = r5.A01
            X.Bq9 r1 = (X.Bq9) r1
            X.1Hk r0 = r1.A0F
            float r3 = X.BE9.A03(r0)
            X.1Hk r0 = r1.A0I
            goto L_0x0152
        L_0x012b:
            java.lang.Object r2 = r5.A01
            X.Bq9 r2 = (X.Bq9) r2
            android.content.res.Resources r1 = r2.A02
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            X.1Hk r0 = r2.A0I
            goto L_0x0186
        L_0x013b:
            java.lang.Object r0 = r5.A01
            X.Bq9 r0 = (X.Bq9) r0
            X.1Hk r0 = r0.A0A
            float r1 = X.BE9.A03(r0)
            goto L_0x01a3
        L_0x0146:
            java.lang.Object r1 = r5.A01
            X.Bq9 r1 = (X.Bq9) r1
            X.1Hk r0 = r1.A0D
            float r3 = X.BE9.A03(r0)
            X.1Hk r0 = r1.A0H
        L_0x0152:
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.height()
            float r0 = (float) r0
            float r3 = r3 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x016f
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x016f
        L_0x0169:
            float r2 = r2 - r3
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            return r4
        L_0x016f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x0169
            r3 = 0
            goto L_0x0169
        L_0x0177:
            java.lang.Object r2 = r5.A01
            X.Bq9 r2 = (X.Bq9) r2
            android.content.res.Resources r1 = r2.A02
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            X.1Hk r0 = r2.A0H
        L_0x0186:
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.top
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L_0x01a7
        L_0x0191:
            java.lang.Object r0 = r5.A01
            X.Bq8 r0 = (X.Bq8) r0
            int r0 = r0.A02
            float r1 = (float) r0
        L_0x0198:
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            goto L_0x01a6
        L_0x019c:
            java.lang.Object r0 = r5.A01
            X.Bq8 r0 = (X.Bq8) r0
            int r0 = r0.A02
            float r1 = (float) r0
        L_0x01a3:
            r0 = 1055286886(0x3ee66666, float:0.45)
        L_0x01a6:
            float r1 = r1 * r0
        L_0x01a7:
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            return r4
        L_0x01ac:
            java.lang.Object r4 = r5.A01
            android.view.View r4 = (android.view.View) r4
            int r3 = r4.getLeft()
            float r0 = r4.getY()
            int r2 = (int) r0
            int r1 = r4.getRight()
            int r0 = r4.getBottom()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x01c7:
            java.lang.Object r1 = r5.A01
            r0 = 0
            goto L_0x0224
        L_0x01cb:
            java.lang.Object r3 = r5.A01
            X.3so r3 = (X.C78443so) r3
            android.content.Context r2 = r3.getContext()
            android.widget.LinearLayout r1 = r3.A01
            r0 = 0
            android.view.GestureDetector r1 = A00(r2, r1, r3, r0)
            r0 = 3
            goto L_0x020a
        L_0x01dc:
            java.lang.Object r1 = r5.A01
            r0 = 1
            goto L_0x0224
        L_0x01e0:
            java.lang.Object r3 = r5.A01
            X.3sj r3 = (X.C78393sj) r3
            android.content.Context r2 = r3.getContext()
            android.widget.LinearLayout r1 = r3.A00
            r0 = 1
            android.view.GestureDetector r1 = A00(r2, r1, r3, r0)
            r0 = 4
            goto L_0x020a
        L_0x01f1:
            java.lang.Object r3 = r5.A01
            X.BqP r3 = (X.C23814BqP) r3
            android.content.Context r2 = r3.getContext()
            android.widget.FrameLayout r1 = r3.A00
            r0 = 2
            android.view.GestureDetector r4 = A00(r2, r1, r3, r0)
            return r4
        L_0x0201:
            java.lang.Object r1 = r5.A01
            r0 = 46
            X.0vq r1 = A02(r1, r0)
            r0 = 5
        L_0x020a:
            X.D55 r4 = new X.D55
            r4.<init>(r1, r0)
            return r4
        L_0x0210:
            java.lang.Object r3 = r5.A01
            X.BqN r3 = (X.C23812BqN) r3
            android.content.Context r2 = r3.getContext()
            android.widget.FrameLayout r1 = r3.A01
            r0 = 3
            android.view.GestureDetector r4 = A00(r2, r1, r3, r0)
            return r4
        L_0x0220:
            java.lang.Object r1 = r5.A01
            r0 = 22
        L_0x0224:
            X.48f r4 = new X.48f
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DWR.get():java.lang.Object");
    }
}
