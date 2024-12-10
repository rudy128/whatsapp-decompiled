package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.6v6  reason: invalid class name and case insensitive filesystem */
public abstract class C137216v6 {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r1 != 29) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7H2 A00(X.AnonymousClass21V r11, X.C32021gV r12) {
        /*
            r5 = r11
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            r2 = 1
            r6 = r12
            X.C18070vi.A0d(r12, r2)
            X.2rc r0 = r11.A02
            if (r0 == 0) goto L_0x003c
            java.io.File r7 = r0.A0G
            if (r7 == 0) goto L_0x003c
            int r1 = r11.A0u
            if (r1 == r2) goto L_0x0091
            r0 = 2
            if (r1 == r0) goto L_0x0083
            r0 = 3
            if (r1 == r0) goto L_0x0075
            r0 = 9
            if (r1 == r0) goto L_0x0066
            r0 = 13
            if (r1 == r0) goto L_0x0058
            r0 = 81
            if (r1 == r0) goto L_0x0075
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0050
            r0 = 25
            if (r1 == r0) goto L_0x0091
            r0 = 26
            if (r1 == r0) goto L_0x0066
            r0 = 28
            if (r1 == r0) goto L_0x0075
            r0 = 29
            if (r1 == r0) goto L_0x0058
        L_0x003c:
            long r10 = r11.A0I
            java.lang.String r0 = ""
            android.net.Uri r7 = android.net.Uri.parse(r0)
            X.C18070vi.A0X(r7)
            r9 = 0
            X.650 r4 = new X.650
            r6 = r4
            r8 = r5
            r6.<init>(r7, r8, r9, r10)
            return r4
        L_0x0050:
            long r8 = r11.A0I
            X.653 r4 = new X.653
            r4.<init>(r5, r6, r7, r8)
            return r4
        L_0x0058:
            long r2 = r11.A0I
            int r0 = r11.A0D
            long r0 = (long) r0
            X.652 r4 = new X.652
            r6 = r7
            r7 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r9)
            return r4
        L_0x0066:
            X.21i r5 = (X.C438921i) r5
            long r9 = r5.A0I
            int r0 = r5.A00
            long r11 = (long) r0
            java.lang.String r8 = r5.A06
            X.655 r4 = new X.655
            r4.<init>(r5, r6, r7, r8, r9, r11)
            return r4
        L_0x0075:
            long r2 = r11.A0I
            int r0 = r11.A0D
            long r0 = (long) r0
            X.654 r4 = new X.654
            r6 = r7
            r7 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r9)
            return r4
        L_0x0083:
            long r2 = r11.A0I
            int r0 = r11.A0D
            long r0 = (long) r0
            X.651 r4 = new X.651
            r6 = r7
            r7 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r9)
            return r4
        L_0x0091:
            long r0 = r11.A0I
            X.64z r4 = new X.64z
            r4.<init>(r11, r7, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137216v6.A00(X.21V, X.1gV):X.7H2");
    }

    public static final void A01(Bitmap bitmap, Drawable drawable, AnonymousClass8B2 r10, AnonymousClass65B r11, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        C18070vi.A0d(r10, 1);
        C18070vi.A0d(drawable, 4);
        Context A04 = AnonymousClass3MY.A04(r11);
        if (bitmap == null) {
            r11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int type = r10.getType();
            if (type == 0 || type == 1 || type == 2) {
                r11.A09 = false;
                if (z2 && z3) {
                    r11.setSelectable(false);
                }
            } else {
                r11.A09 = true;
                r11.setSelectable(true);
            }
            r11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (type != -1) {
                if (type == 0 || type == 1 || type == 2) {
                    r11.setBackgroundColor(i);
                    i2 = 2131232110;
                } else if (type == 3) {
                    AnonymousClass8B2 r1 = r11.A08;
                    if (r1 instanceof AnonymousClass7H2) {
                        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.gallery.GalleryMedia");
                        AnonymousClass21V r0 = ((AnonymousClass7H2) r1).A01;
                        if (r0 != null && r0.A09 == 1) {
                            AnonymousClass3MX.A1A(A04, r11, AnonymousClass1YL.A00(A04, 2130968625, 2131099688));
                            r11.setImageResource(2131232107);
                        }
                    }
                    AnonymousClass3MX.A1A(A04, r11, 2131101947);
                    i2 = 2131231967;
                } else if (type == 4) {
                    r11.setBackgroundColor(i);
                    r11.setImageDrawable(C137486vX.A01(A04, r10.BUw(), (String) null, true));
                    return;
                } else if (type == 6) {
                    r11.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    r11.setBackgroundColor(i);
                    i2 = 2131233051;
                }
                r11.setImageResource(i2);
                return;
            }
            r11.setBackgroundColor(i);
            r11.setImageResource(0);
            return;
        }
        r11.A09 = true;
        r11.setSelectable(true);
        AnonymousClass3MW.A1R(r11);
        r11.setBackgroundColor(0);
        r11.A06 = bitmap;
        if (z) {
            Drawable[] drawableArr = new Drawable[2];
            drawableArr[0] = drawable;
            C108995ce.A10(r11, C108975cc.A08(A04, bitmap), drawableArr);
            return;
        }
        r11.setImageBitmap(bitmap);
    }
}
