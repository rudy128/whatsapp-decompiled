package X;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6GW  reason: invalid class name */
public final class AnonymousClass6GW extends AnonymousClass70O implements AnonymousClass89L {
    public DisplayMetrics A00;
    public View A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public final int A05;
    public final View A06;
    public final C61862qP A07;
    public final TextEmojiLabel A08;
    public final C36391no A09;
    public final C32981i4 A0A;
    public final C18030ve A0B;
    public final C131596lM A0C;
    public final C32011gU A0D;
    public final AnonymousClass210 A0E;
    public final C136026t9 A0F;
    public final C110485fs A0G;
    public final C32021gV A0H;
    public final AnonymousClass00H A0I;

    public final boolean A0J(float f, float f2, boolean z) {
        Spanned spanned;
        CharSequence text = this.A08.getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned != null) {
            C143017Br[] r6 = (C143017Br[]) spanned.getSpans(0, spanned.length(), C143017Br.class);
            C18070vi.A0b(r6);
            for (C143017Br r3 : r6) {
                Iterator it = r3.A05.iterator();
                while (it.hasNext()) {
                    if (((RectF) it.next()).contains(f, f2)) {
                        if (z) {
                            String str = r3.A04;
                            String A002 = C124326Xx.A00(str);
                            C36391no r1 = this.A09;
                            AnonymousClass210 r32 = this.A0E;
                            Set BX2 = r1.BX2(r32.A0H(), r32, str);
                            this.A02 = 1;
                            A0E();
                            this.A0C.A00(5);
                            Context A0B2 = AnonymousClass70K.A0B(this);
                            String A0w = C108955ca.A0w(r32);
                            AnonymousClass1L8 r7 = this.A00;
                            boolean A0Y = AnonymousClass1YF.A0Y(A002, "…", false);
                            boolean z2 = true;
                            if (this.A0A.A0E(Uri.parse(str)) == 1) {
                                z2 = false;
                            }
                            C137406vP.A00(A0B2, r7, this, str, A0w, BX2, A0Y, z2);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6GW(X.C61862qP r12, X.AnonymousClass1KB r13, X.C36361nl r14, X.AnonymousClass11C r15, X.C18000vb r16, X.C36391no r17, X.C32981i4 r18, X.C18030ve r19, X.C131596lM r20, X.C32011gU r21, X.AnonymousClass168 r22, X.AnonymousClass206 r23, X.C133426oj r24, X.C32021gV r25, X.AnonymousClass00H r26) {
        /*
            r11 = this;
            r1 = r23
            r0 = 7
            r9 = r22
            X.C18070vi.A0d(r9, r0)
            r0 = 9
            r2 = r20
            X.C18070vi.A0d(r2, r0)
            r4 = r11
            r6 = r13
            r5 = r14
            r7 = r15
            r8 = r16
            r10 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = r19
            r11.A0B = r0
            r0 = r21
            r11.A0D = r0
            r3 = r17
            r11.A09 = r3
            r11.A0C = r2
            r0 = r25
            r11.A0H = r0
            r0 = r18
            r11.A0A = r0
            r11.A07 = r12
            r0 = r26
            r11.A0I = r0
            X.C17960vV.A07(r1)
            X.210 r1 = (X.AnonymousClass210) r1
            r11.A0E = r1
            X.6oj r0 = r11.A05
            X.6Gp r2 = r0.A00
            android.content.Context r0 = r2.A0J()
            X.5fs r1 = X.AnonymousClass6XY.A00(r0, r3, r1)
            r11.A0G = r1
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            X.C18070vi.A0X(r0)
            r11.A06 = r0
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r11.A08 = r0
            X.6t9 r0 = r1.getStaticContentPlayer()
            r11.A0F = r0
            android.content.Context r0 = r2.A0J()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168866(0x7f070e62, float:1.7952046E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r11.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GW.<init>(X.2qP, X.1KB, X.1nl, X.11C, X.0vb, X.1no, X.1i4, X.0ve, X.6lM, X.1gU, X.168, X.206, X.6oj, X.1gV, X.00H):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r1 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.Bitmap r6, android.view.View r7, android.view.View r8, X.AnonymousClass6GW r9, com.whatsapp.webpagepreview.WebPagePreviewView r10, int r11, int r12, int r13, boolean r14) {
        /*
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x00bd
            if (r6 == 0) goto L_0x008b
            int r0 = r9.A05
            float r1 = (float) r0
            android.util.DisplayMetrics r0 = r9.A00
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "displayMetrics"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0014:
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r11 < r0) goto L_0x008b
            X.6oj r0 = r9.A05     // Catch:{ OutOfMemoryError -> 0x009d }
            X.6Gp r5 = r0.A00     // Catch:{ OutOfMemoryError -> 0x009d }
            android.content.Context r0 = r5.A0J()     // Catch:{ OutOfMemoryError -> 0x009d }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x009d }
            r0 = 2131168866(0x7f070e62, float:1.7952046E38)
            r4 = 2131168866(0x7f070e62, float:1.7952046E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            X.C108975cc.A0t(r10, r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            r1 = 1068708659(0x3fb33333, float:1.4)
            float r0 = (float) r11     // Catch:{ OutOfMemoryError -> 0x009d }
            float r0 = r0 * r1
            int r1 = (int) r0     // Catch:{ OutOfMemoryError -> 0x009d }
            int r12 = r12 * r2
            int r12 = r12 / r11
            android.view.View r0 = r9.A06     // Catch:{ OutOfMemoryError -> 0x009d }
            int r3 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x009d }
            com.whatsapp.TextEmojiLabel r0 = r9.A08     // Catch:{ OutOfMemoryError -> 0x009d }
            int r0 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x009d }
            int r3 = r3 - r0
            int r3 = r3 - r13
            int r0 = java.lang.Math.min(r12, r3)     // Catch:{ OutOfMemoryError -> 0x009d }
            int r3 = java.lang.Math.min(r1, r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            int r13 = r13 + r3
            r0 = 0
            r10.setImagePlayFrameVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            r10.setImageProgressBarVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            android.view.View r0 = r9.A01     // Catch:{ OutOfMemoryError -> 0x009d }
            if (r0 == 0) goto L_0x0079
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ OutOfMemoryError -> 0x009d }
            if (r1 == 0) goto L_0x0079
            android.content.Context r0 = r5.A0J()     // Catch:{ OutOfMemoryError -> 0x009d }
            int r0 = X.AnonymousClass3MZ.A01(r0, r4)     // Catch:{ OutOfMemoryError -> 0x009d }
            r1.width = r0     // Catch:{ OutOfMemoryError -> 0x009d }
            r1.height = r13     // Catch:{ OutOfMemoryError -> 0x009d }
            android.view.View r0 = r9.A01     // Catch:{ OutOfMemoryError -> 0x009d }
            if (r0 == 0) goto L_0x0079
            r0.setLayoutParams(r1)     // Catch:{ OutOfMemoryError -> 0x009d }
        L_0x0079:
            r0 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r6, r2, r12, r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            X.C18070vi.A0X(r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            r10.A0G()     // Catch:{ OutOfMemoryError -> 0x009d }
            r10.A0M(r2, r3)     // Catch:{ OutOfMemoryError -> 0x009d }
            r10.setImageLargeThumbWithBitmap(r0)     // Catch:{ OutOfMemoryError -> 0x009d }
            goto L_0x00b1
        L_0x008b:
            java.lang.String r1 = r9.A04
            if (r1 == 0) goto L_0x0094
            X.210 r0 = r9.A0E
            r10.A0Q(r0, r1)
        L_0x0094:
            android.view.View r1 = r9.A01
            if (r1 != 0) goto L_0x00aa
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x009d:
            java.lang.String r1 = r9.A04
            if (r1 == 0) goto L_0x00a6
            X.210 r0 = r9.A0E
            r10.A0Q(r0, r1)
        L_0x00a6:
            android.view.View r1 = r9.A01
            if (r1 == 0) goto L_0x00b1
        L_0x00aa:
            android.content.Context r0 = X.AnonymousClass70K.A0B(r9)
            X.AnonymousClass74F.A08(r0, r1)
        L_0x00b1:
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x00b8
            r0.requestLayout()
        L_0x00b8:
            com.whatsapp.TextEmojiLabel r0 = r9.A08
            r0.requestLayout()
        L_0x00bd:
            r0 = 6
            X.48Z r2 = new X.48Z
            r2.<init>(r0, r9, r14)
            r8.setOnClickListener(r2)
            r1 = 7
            X.78t r0 = new X.78t
            r0.<init>(r8, r9, r1)
            r8.setOnTouchListener(r0)
            r7.setOnClickListener(r2)
            r0 = 10
            X.C1421478i.A00(r7, r9, r0)
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x00fb
            int r1 = r0.length()
            r0 = 89
            if (r1 < r0) goto L_0x0106
            java.lang.Integer r0 = X.C17880vN.A0h()
        L_0x00e7:
            long r2 = X.C17880vN.A05(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 * r0
            r0 = 4500(0x1194, double:2.2233E-320)
            long r2 = r2 + r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r1 = java.lang.Math.max(r0, r2)
            X.6t9 r0 = r9.A0F
            r0.A00 = r1
        L_0x00fb:
            X.6t9 r0 = r9.A0F
            r0.A01()
            X.6oj r0 = r9.A05
            r0.A01()
            return
        L_0x0106:
            int r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GW.A00(android.graphics.Bitmap, android.view.View, android.view.View, X.6GW, com.whatsapp.webpagepreview.WebPagePreviewView, int, int, int, boolean):void");
    }

    public static final void A01(AnonymousClass6GW r8) {
        C133426oj r5 = r8.A05;
        DisplayMetrics A082 = C108965cb.A08(r5.A00.A0J());
        C18070vi.A0X(A082);
        r8.A00 = A082;
        TextEmojiLabel textEmojiLabel = r8.A08;
        boolean z = false;
        if (textEmojiLabel.getText().length() <= 350) {
            z = true;
        }
        CharSequence text = textEmojiLabel.getText();
        if (text instanceof Spanned) {
            C143017Br[] r2 = (C143017Br[]) ((Spanned) text).getSpans(0, text.length(), C143017Br.class);
            C18070vi.A0b(r2);
            int length = r2.length;
            if (length != 0) {
                r8.A03 = 1;
                r8.A02 = C17880vN.A0j();
            }
            if (AnonymousClass25A.A0t(r8.A0E) && z && length > 0) {
                textEmojiLabel.addOnLayoutChangeListener(new AnonymousClass78Z(r2, r8, 3));
                textEmojiLabel.requestLayout();
                return;
            }
        }
        r8.A0F.A01();
        r5.A01();
    }

    public long A0A() {
        return this.A0F.A00;
    }

    public void A0E() {
        this.A0F.A02();
    }

    public void A0F() {
        C136026t9 r2 = this.A0F;
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        A01(this);
    }

    public void A0G() {
        this.A0F.A02();
    }

    public void Boy() {
        this.A02 = C17880vN.A0i();
    }

    public void BrX() {
        A0C();
    }
}
