package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.03U  reason: invalid class name */
public class AnonymousClass03U {
    public C007903o A00;
    public C007903o A01;
    public int A02 = -1;
    public C007903o A03;
    public final View A04;
    public final AnonymousClass01X A05;

    public void A02() {
        this.A02 = -1;
        this.A01 = null;
        A01();
        A01();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.03o] */
    private boolean A00(Drawable drawable) {
        C007903o r4 = this.A03;
        C007903o r42 = r4;
        if (r4 == null) {
            ? obj = new Object();
            this.A03 = obj;
            r42 = obj;
        }
        r42.A00 = null;
        r42.A02 = false;
        r42.A01 = null;
        r42.A03 = false;
        View view = this.A04;
        ColorStateList A022 = AnonymousClass1HF.A02(view);
        if (A022 != null) {
            r42.A02 = true;
            r42.A00 = A022;
        }
        PorterDuff.Mode A032 = AnonymousClass1HF.A03(view);
        if (A032 != null) {
            r42.A03 = true;
            r42.A01 = A032;
        }
        if (!r42.A02 && !r42.A03) {
            return false;
        }
        AnonymousClass02D.A05(drawable, r42, view.getDrawableState());
        return true;
    }

    public void A01() {
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT > 21 && this.A01 == null) || !A00(background)) {
            C007903o r1 = this.A00;
            if (r1 != null || (r1 = this.A01) != null) {
                AnonymousClass02D.A05(background, r1, view.getDrawableState());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.03o] */
    public void A03(int i) {
        ColorStateList A08;
        this.A02 = i;
        AnonymousClass01X r2 = this.A05;
        if (r2 != null) {
            Context context = this.A04.getContext();
            synchronized (r2) {
                A08 = r2.A00.A08(context, i);
            }
            if (A08 != null) {
                C007903o r1 = this.A01;
                C007903o r12 = r1;
                if (r1 == null) {
                    ? obj = new Object();
                    this.A01 = obj;
                    r12 = obj;
                }
                r12.A00 = A08;
                r12.A02 = true;
                A01();
                A01();
            }
        }
        this.A01 = null;
        A01();
        A01();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void A04(ColorStateList colorStateList) {
        C007903o r1 = this.A00;
        C007903o r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            this.A00 = obj;
            r12 = obj;
        }
        r12.A00 = colorStateList;
        r12.A02 = true;
        A01();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void A05(PorterDuff.Mode mode) {
        C007903o r1 = this.A00;
        C007903o r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            this.A00 = obj;
            r12 = obj;
        }
        r12.A01 = mode;
        r12.A03 = true;
        A01();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.03o] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.view.View r7 = r10.A04
            android.content.Context r0 = r7.getContext()
            int[] r8 = X.C002501d.A0Q
            r1 = 0
            r6 = r11
            r9 = r12
            X.01c r3 = X.C002401c.A00(r0, r11, r8, r12, r1)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r3.A02
            X.AnonymousClass1HF.A0K(r4, r5, r6, r7, r8, r9)
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            r0 = -1
            int r0 = r5.getResourceId(r1, r0)     // Catch:{ all -> 0x0075 }
            r10.A02 = r0     // Catch:{ all -> 0x0075 }
            X.01X r4 = r10.A05     // Catch:{ all -> 0x0075 }
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x0075 }
            int r1 = r10.A02     // Catch:{ all -> 0x0075 }
            monitor-enter(r4)     // Catch:{ all -> 0x0075 }
            X.02D r0 = r4.A00     // Catch:{ all -> 0x0038 }
            android.content.res.ColorStateList r0 = r0.A08(r2, r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x003b:
            X.03o r1 = r10.A01     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x0046
            X.03o r1 = new X.03o     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            r10.A01 = r1     // Catch:{ all -> 0x0075 }
        L_0x0046:
            r1.A00 = r0     // Catch:{ all -> 0x0075 }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x0075 }
            r10.A01()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            r1 = 1
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x005c
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch:{ all -> 0x0075 }
            X.AnonymousClass1HF.A0L(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x005c:
            r0 = 2
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            r1 = 2
            r0 = -1
            int r1 = r5.getInt(r1, r0)     // Catch:{ all -> 0x0075 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C005902p.A00(r0, r1)     // Catch:{ all -> 0x0075 }
            X.AnonymousClass1HF.A0N(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x0071:
            r5.recycle()
            return
        L_0x0075:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03U.A06(android.util.AttributeSet, int):void");
    }

    public AnonymousClass03U(View view) {
        this.A04 = view;
        this.A05 = AnonymousClass01X.A01();
    }
}
