package X;

import android.graphics.drawable.Drawable;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6Jm  reason: invalid class name and case insensitive filesystem */
public final class C121396Jm extends C121456Js {
    public long A00;
    public C135016rW A01;
    public final C18100vl A02;
    public final AnonymousClass11P A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121396Jm(android.view.View r27, X.C72043Kk r28, X.AnonymousClass1VW r29, X.C24921Me r30, X.C37451pZ r31, X.AnonymousClass11P r32, X.AQC r33, X.C140066zt r34, X.C131656lS r35, X.C34551kg r36, X.AnonymousClass1DC r37, X.AnonymousClass00H r38, X.AnonymousClass00H r39, X.AnonymousClass00H r40, X.AnonymousClass00H r41, boolean r42) {
        /*
            r26 = this;
            r0 = 1
            r10 = r27
            r8 = r32
            int r2 = X.C72453Mb.A0G(r8, r10, r0)
            r0 = 7
            r4 = r39
            r5 = r38
            r12 = r29
            r15 = r33
            X.C72483Me.A16(r15, r12, r5, r4, r0)
            r6 = r37
            r11 = r28
            r1 = r40
            r13 = r30
            r7 = r35
            X.C18070vi.A0y(r1, r11, r7, r6, r13)
            r3 = 16
            r0 = r41
            X.C18070vi.A0d(r0, r3)
            r3 = 0
            r9 = r26
            r25 = r42
            r14 = r31
            r16 = r34
            r18 = r36
            r22 = r1
            r23 = r0
            r24 = r3
            r20 = r5
            r21 = r4
            r19 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.A03 = r8
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.7xF r0 = X.AnonymousClass7xF.A00
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r9.A02 = r0
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = r9.A0G
            java.lang.Object r0 = r0.getValue()
            X.1sk r0 = (X.C39241sk) r0
            r1.setProfileBadge(r0)
            r1.setImportantForAccessibility(r2)
            r0 = 2131434169(0x7f0b1ab9, float:1.8490144E38)
            android.view.View r2 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x0081
            android.content.Context r1 = r10.getContext()
            r0 = 2131899161(0x7f123319, float:1.943326E38)
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            r0 = 36
            X.AnonymousClass3Ma.A1E(r2, r9, r0)
            if (r42 == 0) goto L_0x0081
            X.1sv r0 = new X.1sv
            r0.<init>(r3, r3, r3, r3)
            X.C43531zx.A03(r2, r0)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121396Jm.<init>(android.view.View, X.3Kk, X.1VW, X.1Me, X.1pZ, X.11P, X.AQC, X.6zt, X.6lS, X.1kg, X.1DC, X.00H, X.00H, X.00H, X.00H, boolean):void");
    }

    public static final void A02(C121396Jm r5, float f) {
        if (((double) f) >= 1.0d || System.currentTimeMillis() - r5.A00 >= 30) {
            r5.A00 = AnonymousClass11P.A01(r5.A03);
            WDSProfilePhoto wDSProfilePhoto = r5.A0G;
            wDSProfilePhoto.setStatusIndicatorEnabled(true);
            wDSProfilePhoto.setProfileStatus(new AnonymousClass2QI(C39211sh.UNSEEN, f));
        }
    }

    public void A0J(AnonymousClass6J8 r5) {
        C18070vi.A0d(r5, 0);
        super.A0J(r5);
        AnonymousClass6JC r3 = (AnonymousClass6JC) r5;
        C63372sx A002 = r3.A00();
        if (A002 == null || A002.A00() <= 0) {
            ShapeableImageView shapeableImageView = this.A09;
            shapeableImageView.setImageDrawable((Drawable) null);
            shapeableImageView.setBackground((Drawable) null);
        } else {
            A0H();
        }
        if (r5 instanceof AnonymousClass6JC) {
            AnonymousClass3MY.A0w(C108945cZ.A0D(this), this.A08, C124256Xq.A00(r3));
        }
    }

    public static final float A01(AnonymousClass206 r8, C121396Jm r9) {
        String str;
        C135016rW r0;
        if (!(r8 instanceof AnonymousClass21V)) {
            return 1.0f;
        }
        AnonymousClass21V r82 = (AnonymousClass21V) r8;
        C62572rc r4 = r82.A02;
        float f = 0.0f;
        if (r4 == null) {
            return 0.0f;
        }
        long j = r4.A0C;
        float f2 = (((float) j) * 0.5f) / 100.0f;
        boolean z = r4.A0U;
        if (!z) {
            if (!r4.A0V && j == 100) {
                String str2 = r82.A0v.A01;
                C135016rW r02 = r9.A01;
                if (r02 != null) {
                    str = r02.A01;
                } else {
                    str = null;
                }
                if (C18070vi.A18(str2, str) && (r0 = r9.A01) != null) {
                    f = r0.A00;
                }
            }
            f = f2;
        } else {
            if (z) {
                f = f2 + 0.5f;
            }
            f = f2;
        }
        r9.A01 = new C135016rW(C108955ca.A0w(r82), f);
        float f3 = f * 0.8472222f;
        if (f3 > 0.29166666f) {
            f3 += 0.15277778f;
        }
        return C28851b7.A02(f3, 0.0f, 1.0f);
    }

    public void A0K(AnonymousClass6J8 r4) {
        if (r4 instanceof AnonymousClass6JC) {
            C63372sx A002 = r4.A00();
            if (A002 == null || A002.A00() == 0) {
                ShapeableImageView shapeableImageView = this.A0A;
                shapeableImageView.setImageDrawable((Drawable) null);
                shapeableImageView.setBackgroundDrawable(C24261Jm.A00(C108945cZ.A0D(this), 2131233033));
                return;
            }
            super.A0K(r4);
        }
    }

    public void ByX(AnonymousClass206 r3, int i) {
        String str;
        AnonymousClass206 A032;
        AnonymousClass205 r0;
        String str2 = C108965cb.A0U(r3).A01;
        AnonymousClass6J8 r02 = this.A04;
        if (r02 == null || (A032 = r02.A03()) == null || (r0 = A032.A0v) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        if (C18070vi.A18(str2, str)) {
            C137756vy r03 = C161008Az.A00;
            C137756vy r04 = C137756vy.A02;
            if (i == 8) {
                A02(this, A01(r3, this));
            } else {
                super.ByX(r3, i);
            }
        }
    }
}
