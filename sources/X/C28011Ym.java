package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: X.1Ym  reason: invalid class name and case insensitive filesystem */
public class C28011Ym {
    public static final C28021Yn A0C = new C28031Yo(0.5f);
    public C28021Yn A00;
    public C28021Yn A01;
    public C28021Yn A02;
    public C28021Yn A03;
    public C28051Yq A04;
    public C28051Yq A05;
    public C28051Yq A06;
    public C28051Yq A07;
    public C28071Yt A08;
    public C28071Yt A09;
    public C28071Yt A0A;
    public C28071Yt A0B;

    public static C28041Yp A01(Context context, AttributeSet attributeSet, int i, int i2) {
        AnonymousClass1Ys r4 = new AnonymousClass1Ys(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0T, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return A02(context, r4, resourceId, resourceId2);
    }

    public static C28041Yp A02(Context context, C28021Yn r11, int i, int i2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C27781Xn.A0c);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C28021Yn A002 = A00(obtainStyledAttributes, r11, 5);
            C28021Yn A003 = A00(obtainStyledAttributes, A002, 8);
            C28021Yn A004 = A00(obtainStyledAttributes, A002, 9);
            C28021Yn A005 = A00(obtainStyledAttributes, A002, 7);
            C28021Yn A006 = A00(obtainStyledAttributes, A002, 6);
            C28041Yp r1 = new C28041Yp();
            r1.A06 = C27811Xs.A00(i4);
            r1.A02 = A003;
            r1.A07 = C27811Xs.A00(i5);
            r1.A03 = A004;
            r1.A05 = C27811Xs.A00(i6);
            r1.A01 = A005;
            r1.A04 = C27811Xs.A00(i7);
            r1.A00 = A006;
            return r1;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C28011Ym A03(float f) {
        C28041Yp r1 = new C28041Yp(this);
        r1.A00(f);
        return new C28011Ym(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r5.A01.BPT(r6) != r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if ((r5.A04 instanceof X.C28061Yr) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r5.A08.getClass().equals(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(android.graphics.RectF r6) {
        /*
            r5 = this;
            X.1Yt r0 = r5.A09
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.1Yt> r1 = X.C28071Yt.class
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0034
            X.1Yt r0 = r5.A0A
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.1Yt r0 = r5.A0B
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.1Yt r0 = r5.A08
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.1Yn r0 = r5.A02
            float r1 = r0.BPT(r6)
            X.1Yn r0 = r5.A03
            float r0 = r0.BPT(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.1Yn r0 = r5.A00
            float r0 = r0.BPT(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.1Yn r0 = r5.A01
            float r0 = r0.BPT(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            X.1Yq r0 = r5.A07
            boolean r0 = r0 instanceof X.C28061Yr
            if (r0 == 0) goto L_0x0074
            X.1Yq r0 = r5.A06
            boolean r0 = r0 instanceof X.C28061Yr
            if (r0 == 0) goto L_0x0074
            X.1Yq r0 = r5.A05
            boolean r0 = r0 instanceof X.C28061Yr
            if (r0 == 0) goto L_0x0074
            X.1Yq r0 = r5.A04
            boolean r1 = r0 instanceof X.C28061Yr
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28011Ym.A04(android.graphics.RectF):boolean");
    }

    public C28011Ym(C28041Yp r2) {
        this.A06 = r2.A06;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A0B = r2.A0B;
        this.A0A = r2.A0A;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
    }

    public static C28021Yn A00(TypedArray typedArray, C28021Yn r4, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return r4;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AnonymousClass1Ys((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C28031Yo(peekValue.getFraction(1.0f, 1.0f));
        }
        return r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1Yq] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1Yq] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.1Yq] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.1Yq] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.1Yt] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.1Yt] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.1Yt] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.1Yt] */
    public C28011Ym() {
        this.A06 = new Object();
        this.A07 = new Object();
        this.A05 = new Object();
        this.A04 = new Object();
        this.A02 = new AnonymousClass1Ys(0.0f);
        this.A03 = new AnonymousClass1Ys(0.0f);
        this.A01 = new AnonymousClass1Ys(0.0f);
        this.A00 = new AnonymousClass1Ys(0.0f);
        this.A0B = new Object();
        this.A0A = new Object();
        this.A08 = new Object();
        this.A09 = new Object();
    }
}
