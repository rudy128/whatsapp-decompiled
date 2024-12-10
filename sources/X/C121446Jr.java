package X;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6Jr  reason: invalid class name and case insensitive filesystem */
public class C121446Jr extends AnonymousClass6KK implements C161008Az {
    public int A00;
    public long A01;
    public AnonymousClass6J8 A02;
    public C135526sL A03;
    public String A04;
    public AnonymousClass1BI A05;
    public final View A06;
    public final ShapeableImageView A07;
    public final TextEmojiLabel A08;
    public final WaTextView A09;
    public final AnonymousClass11P A0A;
    public final C131656lS A0B;
    public final AnonymousClass8AW A0C;
    public final WDSProfilePhoto A0D;
    public final C18100vl A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final C24921Me A0H;
    public final C18000vb A0I;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121446Jr(android.view.View r14, X.C72043Kk r15, X.AnonymousClass1VW r16, X.C24921Me r17, X.C37451pZ r18, X.AnonymousClass11P r19, X.C18000vb r20, X.AQC r21, X.C131656lS r22, X.AnonymousClass8AW r23, X.AnonymousClass00H r24, X.AnonymousClass00H r25, X.AnonymousClass00H r26, boolean r27, boolean r28) {
        /*
            r13 = this;
            r2 = 1
            r0 = 3
            r7 = r16
            r9 = r21
            r10 = r24
            X.C72473Md.A1M(r9, r7, r10, r0)
            r3 = r19
            r1 = r20
            r11 = r25
            r12 = r26
            X.C18070vi.A0x(r11, r12, r15, r3, r1)
            r0 = r22
            r4 = r17
            X.C72473Md.A1L(r0, r4)
            r5 = r13
            r6 = r14
            r8 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A0A = r3
            r13.A0I = r1
            r13.A0B = r0
            r13.A0H = r4
            r0 = r23
            r13.A0C = r0
            r0 = r27
            r13.A0F = r0
            r0 = r28
            r13.A0G = r0
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.7vd r0 = new X.7vd
            r0.<init>(r14, r15)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r13.A0E = r0
            r0 = 2131437028(0x7f0b25e4, float:1.8495943E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            if (r0 == 0) goto L_0x0085
            r0.setStatusIndicatorEnabled(r2)
        L_0x0053:
            r13.A0D = r0
            r0 = 2131434164(0x7f0b1ab4, float:1.8490134E38)
            android.view.View r0 = r14.findViewById(r0)
            r13.A06 = r0
            r0 = 2131435672(0x7f0b2098, float:1.8493193E38)
            android.view.View r0 = r14.findViewById(r0)
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            r13.A07 = r0
            r0 = 2131429428(0x7f0b0834, float:1.8480528E38)
            com.whatsapp.TextEmojiLabel r1 = X.C72453Mb.A0c(r14, r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0079
            A03(r1)
        L_0x0079:
            r13.A08 = r1
            r0 = 2131429798(0x7f0b09a6, float:1.8481279E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3Ma.A0N(r14, r0)
            r13.A09 = r0
            return
        L_0x0085:
            r0 = 0
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121446Jr.<init>(android.view.View, X.3Kk, X.1VW, X.1Me, X.1pZ, X.11P, X.0vb, X.AQC, X.6lS, X.8AW, X.00H, X.00H, X.00H, boolean, boolean):void");
    }

    public static final void A03(TextEmojiLabel textEmojiLabel) {
        C18070vi.A0d(textEmojiLabel, 0);
        textEmojiLabel.setBreakStrategy(0);
    }

    public void A0I(AnonymousClass6J8 r6) {
        AnonymousClass1E7 A012 = r6.A01();
        WDSProfilePhoto wDSProfilePhoto = this.A0D;
        if (wDSProfilePhoto == null) {
            return;
        }
        if (C22971Dz.A0Z(A012.A0J)) {
            A0D(wDSProfilePhoto, A012);
        } else {
            this.A00.A05(wDSProfilePhoto, this.A01, A012, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1 == 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass6J8 r5) {
        /*
            r4 = this;
            r3 = 0
            boolean r0 = r4 instanceof X.C121386Jl
            if (r0 == 0) goto L_0x0039
            r3 = r4
            X.6Jl r3 = (X.C121386Jl) r3
            boolean r0 = r5 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x0038
            com.whatsapp.TextEmojiLabel r2 = r3.A08
            X.0ve r0 = r2.getAbProps()
            boolean r0 = X.AnonymousClass1J8.A09(r0)
            if (r0 != 0) goto L_0x001b
            X.C43421zm.A04(r2)
        L_0x001b:
            X.2sx r0 = r5.A00()
            if (r0 == 0) goto L_0x002a
            int r1 = r0.A00()
            r0 = 2131892379(0x7f12189b, float:1.9419505E38)
            if (r1 != 0) goto L_0x002d
        L_0x002a:
            r0 = 2131892380(0x7f12189c, float:1.9419507E38)
        L_0x002d:
            r2.setText(r0)
            r2.A0N()
            X.6JC r5 = (X.AnonymousClass6JC) r5
            X.C121386Jl.A01(r5, r3)
        L_0x0038:
            return
        L_0x0039:
            X.1Me r1 = r4.A0H
            X.1E7 r0 = r5.A01()
            java.lang.String r2 = r1.A0N(r0)
            X.0vl r1 = r4.A0E
            java.lang.Object r0 = r1.getValue()
            X.1xh r0 = (X.C42141xh) r0
            r0.A0B(r3, r2)
            android.view.View r0 = r4.A0H
            boolean r0 = X.C113585nK.A00(r0)
            if (r0 != 0) goto L_0x0061
            java.lang.Object r0 = r1.getValue()
            X.1xh r0 = (X.C42141xh) r0
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            X.C43421zm.A04(r0)
        L_0x0061:
            if (r2 == 0) goto L_0x0038
            X.0vb r0 = r4.A0I
            r4.A0F(r0, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121446Jr.A0J(X.6J8):void");
    }

    public void BIZ() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 <= 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.AnonymousClass6J8 r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C121386Jl
            if (r0 == 0) goto L_0x001e
            boolean r0 = r4 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x001d
            android.view.View r2 = r3.A0H
            X.2sx r0 = r4.A00()
            if (r0 == 0) goto L_0x0018
            int r1 = r0.A00()
            r0 = 43
            if (r1 > 0) goto L_0x001a
        L_0x0018:
            r0 = 44
        L_0x001a:
            X.AnonymousClass3Ma.A1E(r2, r3, r0)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r4 instanceof X.AnonymousClass6JB
            if (r0 == 0) goto L_0x001d
            android.view.View r1 = r3.A0H
            r0 = 8
            X.AnonymousClass78M.A00(r1, r3, r4, r0)
            r0 = 16
            X.C1421578j.A00(r1, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121446Jr.A0H(X.6J8):void");
    }

    public void A0K(AnonymousClass6J8 r5) {
        C131656lS r2;
        int i;
        boolean z = this instanceof C121386Jl;
        ShapeableImageView shapeableImageView = this.A07;
        if (z) {
            if (shapeableImageView != null) {
                C63372sx A002 = r5.A00();
                int i2 = 0;
                if (A002 == null || A002.A00() <= 0) {
                    i2 = 8;
                }
                shapeableImageView.setVisibility(i2);
                r2 = this.A0B;
                i = 20;
            } else {
                return;
            }
        } else if (shapeableImageView != null) {
            r2 = this.A0B;
            i = 18;
        } else {
            return;
        }
        r2.A00(new AnonymousClass7RO(this, r5, shapeableImageView, i));
    }

    public final void A0L(AnonymousClass6J8 r4) {
        this.A02 = r4;
        this.A05 = r4.A01().A0J;
        this.A0H.setTag(r4);
        AnonymousClass1E7 A012 = r4.A01();
        this.A00 = A012.A07;
        this.A01 = A012.A0E;
        this.A04 = A012.A0K();
    }

    public void ByX(AnonymousClass206 r5, int i) {
        String str;
        AnonymousClass21V r1;
        AnonymousClass21V r2;
        AnonymousClass206 A032;
        AnonymousClass205 r0;
        String str2 = C108965cb.A0U(r5).A01;
        AnonymousClass6J8 r02 = this.A02;
        AnonymousClass206 r22 = null;
        if (r02 == null || (A032 = r02.A03()) == null || (r0 = A032.A0v) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        if (!C18070vi.A18(str2, str)) {
            return;
        }
        if ((r5 instanceof C438421d) || (r5 instanceof AnonymousClass21W)) {
            C137756vy r03 = C161008Az.A00;
            if (C108965cb.A1b(C137756vy.A00, i)) {
                if ((r5 instanceof AnonymousClass21V) && (r1 = (AnonymousClass21V) r5) != null) {
                    AnonymousClass6J8 r04 = this.A02;
                    if (r04 != null) {
                        r22 = r04.A03();
                    }
                    if ((r22 instanceof AnonymousClass21V) && (r2 = (AnonymousClass21V) r22) != null) {
                        r2.A02 = r1.A02;
                        C60502o8.A01(r2, C60502o8.A00(r1));
                        r2.A0p(r1.A13());
                    }
                }
                ShapeableImageView shapeableImageView = this.A07;
                if (shapeableImageView != null) {
                    this.A0B.A00(new AnonymousClass7RO(this, r5, shapeableImageView, 19));
                }
            }
        }
    }
}
