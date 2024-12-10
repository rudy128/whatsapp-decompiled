package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3cP  reason: invalid class name and case insensitive filesystem */
public class C74743cP extends AnonymousClass3NL {
    public boolean A00 = true;
    public final C18000vb A01;

    public static void A03(Drawable drawable, ImageView imageView, C18000vb r3) {
        imageView.setImageDrawable(new C74743cP(drawable, r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (X.AnonymousClass3MW.A1Z(r2.A01) == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r3) {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            X.0vb r0 = r2.A01
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            r2.A00 = r1
            r2.invalidateSelf()
        L_0x0017:
            super.draw(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74743cP.draw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (X.AnonymousClass3MW.A1Z(r2.A01) == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getPadding(android.graphics.Rect r3) {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            X.0vb r0 = r2.A01
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            r2.A00 = r1
            r2.invalidateSelf()
        L_0x0017:
            boolean r0 = super.getPadding(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74743cP.getPadding(android.graphics.Rect):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74743cP(Drawable drawable, C18000vb r4) {
        super(drawable, 0);
        boolean A1Z = AnonymousClass3MW.A1Z(r4);
        this.A00 = A1Z;
        this.A01 = r4;
    }
}
