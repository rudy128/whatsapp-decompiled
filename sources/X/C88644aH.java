package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4aH  reason: invalid class name and case insensitive filesystem */
public class C88644aH {
    public int A00;
    public int A01;
    public AnonymousClass11S A02;
    public C80033wR A03;
    public AR0 A04;
    public C19991A2e A05;
    public AnonymousClass10I A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final C36361nl A0A;
    public final A5M A0B;
    public final C86224Qu A0C;
    public final C108355bZ A0D;
    public final AnonymousClass3uP A0E;
    public final C108675c7 A0F;
    public final C18030ve A0G;
    public final C131596lM A0H;
    public final C62242r5 A0I;
    public final C32021gV A0J;
    public final WebPagePreviewView A0K;
    public final C85694Oj A0L;
    public final C36391no A0M;

    private float A00(AnonymousClass206 r7, C87754Wv r8) {
        boolean z = this.A08;
        float f = 0.5625f;
        if (z) {
            f = 0.25f;
        }
        float f2 = 1.4f;
        if (!z) {
            f2 = 1.0f;
            if (r8.A01 == 4) {
                return 0.5625f;
            }
        }
        new BitmapFactory.Options().inJustDecodeBounds = true;
        C693536w A002 = C60502o8.A00(r7);
        if (A002 != null) {
            float f3 = ((float) A002.A00) / ((float) A002.A01);
            if (f3 < 1.0f) {
                return Math.max(f3, f);
            }
            return Math.min(f3, f2);
        } else if (this.A08) {
            return 1.0f;
        } else {
            return f;
        }
    }

    private int A01(AnonymousClass206 r4) {
        int A012;
        C108675c7 r2 = this.A0F;
        boolean Bew = r2.Bew(r4);
        Context context = this.A09;
        if (Bew) {
            A012 = r2.BPM(context, ((Rect) C72463Mc.A0m(((C93084iP) this.A0E.A09).A0Q)).left);
        } else {
            A012 = C88264Yz.A01(context, 72);
        }
        return (A012 - this.A00) - this.A01;
    }

    private C98144qe A02(AnonymousClass206 r8, C87754Wv r9, Bitmap[] bitmapArr) {
        WebPagePreviewView webPagePreviewView = this.A0K;
        webPagePreviewView.setLargeThumbSizeWidthMatchParent(this.A07);
        int A012 = A01(r8);
        int A002 = (int) (((float) A012) * A00(r8, r9));
        if (this.A07) {
            webPagePreviewView.setVideoLargeThumbFrameHeight(A002);
        } else {
            webPagePreviewView.setImageLargeThumbFrameHeight(A002);
        }
        return new C98144qe(this.A09, webPagePreviewView, bitmapArr, A012, this.A07);
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [X.4qe] */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.4qh] */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.4qe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass3uP r17, X.C88644aH r18, X.AnonymousClass206 r19, X.C108645c3 r20, X.C87754Wv r21, boolean r22, boolean r23, boolean r24) {
        /*
            r0 = r18
            X.1no r5 = r0.A0M
            r2 = r21
            java.lang.String r4 = r2.A03
            r1 = r19
            com.whatsapp.jid.UserJid r3 = r1.A0I()
            java.util.Set r6 = r5.BX2(r3, r1, r4)
            if (r6 == 0) goto L_0x0052
            com.whatsapp.webpagepreview.WebPagePreviewView r12 = r0.A0K
            boolean r3 = r1 instanceof X.AnonymousClass210
            if (r3 == 0) goto L_0x0050
            r3 = r1
            X.210 r3 = (X.AnonymousClass210) r3
            int r3 = r3.A01
        L_0x001f:
            r12.A0L(r3)
            r17.A1q()
            r8 = 9
            X.78E r3 = new X.78E
            r4 = r0
            r5 = r2
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r12.setOnClickListener(r3)
        L_0x0032:
            r2 = 2131432020(0x7f0b1254, float:1.8485786E38)
            android.view.View r4 = r12.findViewById(r2)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            X.5bZ r3 = r0.A0D
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            X.205 r0 = r1.A0v
            boolean r0 = r0.A02
            int r1 = X.C72453Mb.A05(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.BS0(r2, r1, r0)
            r4.setForeground(r0)
            return
        L_0x0050:
            r3 = 0
            goto L_0x001f
        L_0x0052:
            r5 = r23
            if (r22 == 0) goto L_0x01a1
            com.whatsapp.webpagepreview.WebPagePreviewView r12 = r0.A0K
            r12.A0J()
            java.lang.Boolean r3 = X.C17970vW.A03
            android.widget.ProgressBar r3 = r12.A09
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.cancel()
            android.view.View r3 = r12.A00
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.cancel()
            android.view.View r3 = r12.A01
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.cancel()
            android.widget.ProgressBar r3 = r12.A09
            r6 = 0
            r3.setAlpha(r6)
            android.view.View r4 = r12.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r3)
            android.view.View r3 = r12.A01
            r3.setAlpha(r6)
            android.view.View r3 = r12.A02
            r3.setAlpha(r6)
            android.widget.ImageView r3 = r12.A06
            r3.setAlpha(r6)
            r12.A0J()
            int r3 = r2.A01
            r12.setVideoLargeLogo(r3)
            r4 = 1
            r17 = 0
            X.4QM r8 = new X.4QM
            r8.<init>(r1, r12)
            r7 = r20
            X.205 r6 = r7.BPv()
            if (r6 == 0) goto L_0x00c9
            X.205 r3 = r1.A0v
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00c9
            r7.CJ2(r8)
            int r9 = r7.BPu()
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r9 == r4) goto L_0x019c
            r3 = 2
            if (r9 == r3) goto L_0x0194
            r3 = 3
            if (r9 != r3) goto L_0x00c9
            r12.A0K(r6, r7, r6, r6)
        L_0x00c9:
            android.graphics.Bitmap[] r13 = new android.graphics.Bitmap[r4]
            r24 = 2
            X.6LH r3 = new X.6LH
            r18 = r3
            r19 = r0
            r20 = r1
            r22 = r8
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r12.setOnClickListener(r3)
            X.1gV r3 = r0.A0J
            boolean r5 = X.AnonymousClass2T7.A00(r1, r3, r5)
            if (r5 == 0) goto L_0x0170
            X.5c7 r5 = r0.A0F
            boolean r5 = r5.Bew(r1)
            if (r5 == 0) goto L_0x015e
            X.4qe r9 = r0.A02(r1, r2, r13)
        L_0x00f3:
            X.Abv r2 = X.C60532oB.A00(r1)
            if (r2 == 0) goto L_0x0154
            android.widget.ImageView r2 = r12.A07
            r3.A0H(r2, r1, r9, r4)
        L_0x00fe:
            boolean r2 = r1 instanceof X.AnonymousClass210
            if (r2 == 0) goto L_0x025b
            X.0ve r2 = r0.A0G
            X.36w r2 = X.C50372Ue.A00(r2, r1)
            if (r2 == 0) goto L_0x025b
            r2 = 8
            X.4qb r5 = new X.4qb
            r5.<init>(r0, r2)
            com.whatsapp.WaImageView r13 = r12.getFaviconThumbView()
            X.0ve r2 = r3.A02
            X.36w r15 = X.C50372Ue.A00(r2, r1)
            if (r15 == 0) goto L_0x0032
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "favicon-"
            java.lang.String r4 = X.AnonymousClass206.A03(r1, r2, r4)
            r13.setTag(r4)
            boolean r2 = X.C22781De.A03()
            if (r2 == 0) goto L_0x0133
            r3.A0C()
        L_0x0133:
            X.6L5 r16 = new X.6L5
            r17 = r13
            r18 = r1
            r19 = r15
            r20 = r5
            r21 = r3
            r22 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r20 = 0
            r21 = 1
            r17 = r5
            r18 = r3
            r19 = r4
            r14 = r1
            X.C32021gV.A06(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0032
        L_0x0154:
            boolean r2 = r1 instanceof X.AnonymousClass210
            if (r2 == 0) goto L_0x00fe
            android.widget.ImageView r2 = r12.A07
            r3.A0D(r2, r1, r9)
            goto L_0x00fe
        L_0x015e:
            android.content.Context r10 = r0.A09
            boolean r2 = r0.A07
            int r14 = r0.A01
            int r15 = r0.A00
            X.3wR r11 = r0.A03
            X.4qh r9 = new X.4qh
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00f3
        L_0x0170:
            int r8 = r0.A01(r1)
            float r5 = r0.A00(r1, r2)
            float r2 = (float) r8
            float r2 = r2 * r5
            int r2 = (int) r2
            r12.setVideoLargeThumbFrameHeight(r2)
            android.content.Context r7 = r0.A09
            X.0ve r6 = r0.A0G
            r5 = 2060(0x80c, float:2.887E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r15 = X.C18020vd.A05(r2, r6, r5)
            X.4qf r9 = new X.4qf
            r10 = r9
            r11 = r7
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x00f3
        L_0x0194:
            r3 = 1059816735(0x3f2b851f, float:0.67)
            r12.A0K(r6, r7, r7, r3)
            goto L_0x00c9
        L_0x019c:
            r12.A0K(r7, r6, r6, r6)
            goto L_0x00c9
        L_0x01a1:
            X.1gV r3 = r0.A0J
            boolean r4 = X.AnonymousClass2T7.A00(r1, r3, r5)
            if (r4 == 0) goto L_0x0223
            r17 = 0
        L_0x01ab:
            com.whatsapp.webpagepreview.WebPagePreviewView r12 = r0.A0K
            r12.A0G()
            r5 = 0
            if (r24 == 0) goto L_0x0221
            int r4 = r2.A00
        L_0x01b5:
            r12.setImageLargeLogo(r4)
            X.Abv r4 = X.C60532oB.A00(r1)
            r7 = 1
            if (r4 == 0) goto L_0x01d1
            android.graphics.Bitmap[] r4 = new android.graphics.Bitmap[r7]
            X.4qe r6 = r0.A02(r1, r2, r4)
            com.whatsapp.components.button.ThumbnailButton r4 = r12.A0I
            r3.A0H(r4, r1, r6, r5)
        L_0x01ca:
            r4 = 18
            X.AnonymousClass48j.A00(r12, r2, r1, r0, r4)
            goto L_0x00fe
        L_0x01d1:
            X.5c7 r4 = r0.A0F
            boolean r4 = r4.Bew(r1)
            if (r4 == 0) goto L_0x01f8
            android.graphics.Bitmap[] r4 = new android.graphics.Bitmap[r7]
            X.4qe r6 = r0.A02(r1, r2, r4)
        L_0x01df:
            if (r17 == 0) goto L_0x021b
            com.whatsapp.components.button.ThumbnailButton r7 = r12.A0I
            X.205 r4 = r1.A0v
            r18 = 100
            r20 = r5
            r21 = r5
            r19 = r5
            r13 = r3
            r14 = r7
            r15 = r1
            r16 = r6
            r17 = r4
            r13.A0F(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01ca
        L_0x01f8:
            android.widget.FrameLayout r4 = r12.A04
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r4 = -2
            r6.width = r4
            android.widget.FrameLayout r4 = r12.A04
            r4.requestLayout()
            android.graphics.Bitmap[] r13 = new android.graphics.Bitmap[r7]
            android.content.Context r10 = r0.A09
            boolean r4 = r0.A07
            int r14 = r0.A01
            int r15 = r0.A00
            X.3wR r11 = r0.A03
            X.4qh r6 = new X.4qh
            r9 = r6
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01df
        L_0x021b:
            com.whatsapp.components.button.ThumbnailButton r4 = r12.A0I
            r3.A0D(r4, r1, r6)
            goto L_0x01ca
        L_0x0221:
            r4 = 0
            goto L_0x01b5
        L_0x0223:
            boolean r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            X.Abv r4 = X.C60532oB.A00(r1)
            if (r4 != 0) goto L_0x0249
            boolean r4 = r1 instanceof X.AnonymousClass210
            if (r4 == 0) goto L_0x0249
            r5 = r1
            X.210 r5 = (X.AnonymousClass210) r5
            byte[] r4 = r5.A1A()
            if (r4 == 0) goto L_0x0249
            int r5 = r5.A01
            r4 = 7
            if (r5 != r4) goto L_0x0245
            com.whatsapp.webpagepreview.WebPagePreviewView r12 = r0.A0K
            r12.A0I()
            goto L_0x01ca
        L_0x0245:
            r17 = 1
            goto L_0x01ab
        L_0x0249:
            com.whatsapp.webpagepreview.WebPagePreviewView r12 = r0.A0K
            boolean r4 = r1 instanceof X.AnonymousClass210
            if (r4 == 0) goto L_0x0259
            r4 = r1
            X.210 r4 = (X.AnonymousClass210) r4
            int r4 = r4.A01
        L_0x0254:
            r12.A0L(r4)
            goto L_0x01ca
        L_0x0259:
            r4 = 0
            goto L_0x0254
        L_0x025b:
            com.whatsapp.WaImageView r3 = r12.getFaviconThumbView()
            r2 = 8
            r3.setVisibility(r2)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88644aH.A03(X.3uP, X.4aH, X.206, X.5c3, X.4Wv, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, X.3hL, X.7Fe] */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.3wS] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r10.A11(1024) != false) goto L_0x001b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass206 r24, X.C108645c3 r25, X.C87754Wv r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r23 = this;
            r4 = r23
            android.content.Context r0 = r4.A09
            int r8 = X.C88264Yz.A00(r0)
            r3 = r27
            r4.A07 = r3
            r0 = 1024(0x400, double:5.06E-321)
            r10 = r24
            r2 = r31
            if (r31 == 0) goto L_0x001b
            boolean r6 = r10.A11(r0)
            r5 = 1
            if (r6 == 0) goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r4.A08 = r5
            if (r30 == 0) goto L_0x00fd
            if (r31 == 0) goto L_0x00f7
            X.4QT r7 = X.C80023wQ.A03
            X.4QT r6 = X.C80023wQ.A02
        L_0x0026:
            X.3wQ r5 = new X.3wQ
            r5.<init>(r7, r6, r8)
        L_0x002b:
            r4.A03 = r5
            X.3uP r15 = r4.A0E
            r5 = r26
            r14 = r28
            r16 = r4
            r17 = r10
            r19 = r5
            r20 = r3
            r21 = r14
            r18 = r25
            r22 = r29
            A03(r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r10.A11(r0)
            if (r0 == 0) goto L_0x00ab
            X.4Oj r6 = r4.A0L
            X.0ve r8 = r4.A0G
            com.whatsapp.webpagepreview.WebPagePreviewView r7 = r4.A0K
            X.5cR r0 = r15.A0k
            if (r0 != 0) goto L_0x00a6
            r11 = 0
        L_0x0055:
            X.9gb r12 = new X.9gb
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.Abv r4 = X.C60532oB.A00(r10)
            if (r4 == 0) goto L_0x00a5
            X.1gU r2 = r6.A03
            X.181 r1 = r6.A01
            X.C18070vi.A0s(r8, r2, r1, r4)
            java.lang.String r0 = r4.A0E
            if (r0 == 0) goto L_0x0104
            X.3hL r9 = new X.3hL
            r9.<init>(r1, r8, r2, r0)
            r9.A08 = r0
            r9.A0O(r4)
            r9.A01 = r3
            X.4Ro r0 = new X.4Ro
            r0.<init>(r9, r10)
            r7.setTag(r0)
            r7.A0P(r9, r11, r14)
            java.lang.String r0 = r4.A0F
            if (r0 == 0) goto L_0x00a5
            byte[] r0 = r4.A01
            if (r0 != 0) goto L_0x00a5
            java.util.Set r2 = r6.A05
            X.205 r0 = r10.A0v
            java.lang.String r1 = r0.A01
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x00a5
            r2.add(r1)
            X.10I r0 = r6.A04
            r13 = 2
            X.Ak7 r5 = new X.Ak7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.CGL(r5, r1)
        L_0x00a5:
            return
        L_0x00a6:
            java.util.ArrayList r11 = r0.getSearchTerms()
            goto L_0x0055
        L_0x00ab:
            boolean r0 = r10 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00a5
            r0 = r10
            X.210 r0 = (X.AnonymousClass210) r0
            com.whatsapp.webpagepreview.WebPagePreviewView r6 = r4.A0K
            X.5cR r1 = r15.A0k
            if (r1 != 0) goto L_0x00f2
            r11 = 0
        L_0x00b9:
            X.1gV r1 = r4.A0J
            boolean r16 = X.AnonymousClass2T7.A00(r10, r1, r14)
            java.lang.String r10 = r5.A03
            X.1no r4 = r6.A0M
            com.whatsapp.jid.UserJid r1 = r0.A0I()
            java.util.Set r4 = r4.BX2(r1, r0, r10)
            r1 = 0
            if (r31 == 0) goto L_0x00d1
            r6.setImageContentMinimumHeight(r1)
        L_0x00d1:
            java.lang.String r8 = r0.A06
            java.lang.String r9 = r0.A05
            byte[] r12 = r0.A1A()
            int r1 = r0.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            boolean r15 = X.AnonymousClass000.A1W(r4)
            int r14 = r0.A01
            r18 = 0
            r13 = -1
            r19 = r18
            r20 = r2
            r17 = r3
            com.whatsapp.webpagepreview.WebPagePreviewView.A0D(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00f2:
            java.util.ArrayList r11 = r1.getSearchTerms()
            goto L_0x00b9
        L_0x00f7:
            X.4QT r7 = X.C80023wQ.A01
            X.4QT r6 = X.C80023wQ.A00
            goto L_0x0026
        L_0x00fd:
            X.3wR r5 = new X.3wR
            r5.<init>(r8, r2)
            goto L_0x002b
        L_0x0104:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88644aH.A04(X.206, X.5c3, X.4Wv, boolean, boolean, boolean, boolean, boolean):void");
    }

    public C88644aH(Context context, C36361nl r5, A5M a5m, C86224Qu r7, C108355bZ r8, C85694Oj r9, AnonymousClass3uP r10, C108675c7 r11, C36391no r12, C18030ve r13, C131596lM r14, C62242r5 r15, C32021gV r16, AnonymousClass10I r17) {
        this.A0G = r13;
        this.A09 = context;
        this.A0F = r11;
        this.A0A = r5;
        this.A0E = r10;
        this.A0M = r12;
        this.A0J = r16;
        this.A0H = r14;
        this.A0D = r8;
        this.A0I = r15;
        this.A0K = new WebPagePreviewView(context);
        this.A0L = r9;
        this.A03 = new C80033wR(C88264Yz.A00(context), false);
        this.A0C = r7;
        this.A0B = a5m;
        this.A06 = r17;
    }
}
