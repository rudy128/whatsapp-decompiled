package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.03V  reason: invalid class name */
public class AnonymousClass03V {
    public int A00 = 0;
    public C007903o A01;
    public C007903o A02;
    public final ImageView A03;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.03o] */
    public void A02() {
        ImageView imageView = this.A03;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C005902p.A02(drawable);
            if (Build.VERSION.SDK_INT <= 21) {
                C007903o r2 = this.A02;
                C007903o r22 = r2;
                if (r2 == null) {
                    ? obj = new Object();
                    this.A02 = obj;
                    r22 = obj;
                }
                r22.A00 = null;
                r22.A02 = false;
                r22.A01 = null;
                r22.A03 = false;
                ColorStateList A002 = A00(imageView);
                if (A002 != null) {
                    r22.A02 = true;
                    r22.A00 = A002;
                }
                PorterDuff.Mode A012 = A01(imageView);
                if (A012 != null) {
                    r22.A03 = true;
                    r22.A01 = A012;
                }
                if (r22.A02 || r22.A03) {
                    AnonymousClass02D.A05(drawable, r22, imageView.getDrawableState());
                    return;
                }
            }
            C007903o r1 = this.A01;
            if (r1 != null) {
                AnonymousClass02D.A05(drawable, r1, imageView.getDrawableState());
            }
        }
    }

    public void A03(int i) {
        Drawable drawable;
        ImageView imageView = this.A03;
        if (i != 0) {
            drawable = AnonymousClass02D.A03().A09(imageView.getContext(), i);
            if (drawable != null) {
                C005902p.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A02();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.ImageView r8 = r11.A03
            android.content.Context r1 = r8.getContext()
            int[] r9 = X.C002501d.A05
            r0 = 0
            r7 = r12
            r10 = r13
            X.01c r4 = X.C002401c.A00(r1, r12, r9, r13, r0)
            android.content.Context r5 = r8.getContext()
            android.content.res.TypedArray r6 = r4.A02
            X.AnonymousClass1HF.A0K(r5, r6, r7, r8, r9, r10)
            android.graphics.drawable.Drawable r0 = r8.getDrawable()     // Catch:{ all -> 0x0060 }
            r3 = -1
            if (r0 != 0) goto L_0x0037
            r0 = 1
            int r2 = r6.getResourceId(r0, r3)     // Catch:{ all -> 0x0060 }
            if (r2 == r3) goto L_0x003a
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0060 }
            X.02D r0 = X.AnonymousClass02D.A03()     // Catch:{ all -> 0x0060 }
            android.graphics.drawable.Drawable r0 = r0.A09(r1, r2)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003a
            r8.setImageDrawable(r0)     // Catch:{ all -> 0x0060 }
        L_0x0037:
            X.C005902p.A02(r0)     // Catch:{ all -> 0x0060 }
        L_0x003a:
            r1 = 2
            boolean r0 = r6.hasValue(r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0048
            android.content.res.ColorStateList r0 = r4.A01(r1)     // Catch:{ all -> 0x0060 }
            X.C28081Yu.A00(r0, r8)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            r0 = 3
            boolean r0 = r6.hasValue(r0)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005c
            r0 = 3
            int r1 = r6.getInt(r0, r3)     // Catch:{ all -> 0x0060 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C005902p.A00(r0, r1)     // Catch:{ all -> 0x0060 }
            X.C28081Yu.A01(r0, r8)     // Catch:{ all -> 0x0060 }
        L_0x005c:
            r6.recycle()
            return
        L_0x0060:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03V.A04(android.util.AttributeSet, int):void");
    }

    public AnonymousClass03V(ImageView imageView) {
        this.A03 = imageView;
    }

    public static ColorStateList A00(ImageView imageView) {
        return C28091Yv.A00(imageView);
    }

    public static PorterDuff.Mode A01(ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
