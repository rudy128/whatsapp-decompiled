package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.3NJ  reason: invalid class name */
public final class AnonymousClass3NJ extends InsetDrawable {
    public final boolean A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3NJ(android.graphics.drawable.Drawable r4, java.lang.Integer r5, boolean r6) {
        /*
            r3 = this;
            r2 = 0
            r3.<init>(r4, r2)
            int r1 = r5.intValue()
            switch(r1) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0014;
                case 2: goto L_0x0015;
                case 3: goto L_0x0010;
                case 4: goto L_0x0014;
                case 5: goto L_0x0015;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0010:
            r0 = r6
            r6 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            r3.A00 = r6
            switch(r1) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001d;
                case 2: goto L_0x001d;
                default: goto L_0x001a;
            }
        L_0x001a:
            r3.A01 = r2
            return
        L_0x001d:
            r2 = 1
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NJ.<init>(android.graphics.drawable.Drawable, java.lang.Integer, boolean):void");
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        boolean z = this.A00;
        if (z || this.A01) {
            canvas.save();
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!this.A01) {
                f = 1.0f;
            }
            canvas.scale(f2, f, getBounds().exactCenterX(), getBounds().exactCenterY());
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        C18070vi.A0d(rect, 0);
        boolean padding = super.getPadding(rect);
        if (this.A00) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        if (this.A01) {
            int i2 = rect.bottom;
            rect.bottom = rect.top;
            rect.top = i2;
        }
        return padding;
    }
}
