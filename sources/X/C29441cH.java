package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.1cH  reason: invalid class name and case insensitive filesystem */
public abstract class C29441cH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Class A03;

    public abstract Object A01(View view);

    public abstract void A03(View view, Object obj);

    public Object A00(View view) {
        if (Build.VERSION.SDK_INT >= this.A01) {
            return A01(view);
        }
        Object tag = view.getTag(this.A02);
        if (!this.A03.isInstance(tag)) {
            return null;
        }
        return tag;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1.booleanValue() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.A01
            if (r1 < r0) goto L_0x000a
            r3.A03(r4, r5)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r3.A00(r4)
            r1 = r3
            boolean r0 = r3 instanceof X.C29451cI
            if (r0 != 0) goto L_0x0037
            X.27c r1 = (X.AnonymousClass27c) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r2 != r0) goto L_0x0044
            return
        L_0x0037:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0009
        L_0x0044:
            X.1XU r0 = X.AnonymousClass1HF.A09(r4)
            if (r0 != 0) goto L_0x004f
            X.1XU r0 = new X.1XU
            r0.<init>()
        L_0x004f:
            X.AnonymousClass1HF.A0f(r4, r0)
            int r0 = r3.A02
            r4.setTag(r0, r5)
            int r0 = r3.A00
            X.AnonymousClass1HF.A0Y(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29441cH.A02(android.view.View, java.lang.Object):void");
    }

    public C29441cH(Class cls, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = cls;
        this.A00 = i2;
        this.A01 = i3;
    }
}
