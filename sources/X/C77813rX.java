package X;

import android.app.Activity;
import android.os.Bundle;
import java.util.Collection;

/* renamed from: X.3rX  reason: invalid class name and case insensitive filesystem */
public final class C77813rX extends C75433hU implements C28741ap {
    public C46162Dk A00;
    public boolean A01;
    public boolean A02;
    public AnonymousClass440 A03;
    public boolean A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass4XM A06;
    public final C86454Rr A07;

    public /* synthetic */ void BoD(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public void BoG(AnonymousClass1BI r2, boolean z) {
        C18070vi.A0d(r2, 0);
        if (C18070vi.A18(this.A0f, r2)) {
            A04(this);
            A0C();
        }
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoO(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        super.onActivityCreated(activity, bundle);
        if (!this.A04) {
            A0C();
            A0E(new C90004dN(this, activity, 46));
            AnonymousClass1Y5.A02(A02(), 2131886189);
            C72453Mb.A1D(this.A0F);
            AnonymousClass440 r0 = this.A03;
            if (r0 != null) {
                C22801Dg A002 = C95424mD.A00(r0);
                AnonymousClass01E r2 = this.A0U;
                AnonymousClass3MW.A1W(r2);
                C91644g1.A00(r2, A002, new C105335Rp(this), 6);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        super.onActivityDestroyed(activity);
        AnonymousClass440 r1 = this.A03;
        if (r1 != null) {
            AnonymousClass01E r0 = this.A0U;
            AnonymousClass3MW.A1W(r0);
            r0.getLifecycle().A06(r1);
        }
    }

    public static final String A03(C77813rX r6) {
        C46162Dk r0 = r6.A00;
        if (r0 == null) {
            C18070vi.A11("newsletterInfo");
            throw null;
        }
        AnonymousClass4XM r02 = r6.A06;
        int A002 = AnonymousClass4XM.A00(r02, (int) r0.A0G);
        String A012 = r02.A01(A002);
        C18070vi.A0d(A012, 1);
        String quantityString = r6.A0U.getResources().getQuantityString(2131755282, A002, AnonymousClass000.A1b(A012, 1));
        C18070vi.A0X(quantityString);
        return quantityString;
    }

    public static final void A04(C77813rX r1) {
        AnonymousClass440 r0;
        C46162Dk A0U;
        if (r1.A00 == null && (r0 = r1.A03) != null && (A0U = r0.A0U()) != null) {
            r1.A00 = A0U;
            A06(r1, A0U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C77813rX r4) {
        /*
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x000d
            X.2Dk r1 = r4.A00
            if (r1 != 0) goto L_0x000e
            X.01E r0 = r4.A0U
            r0.finish()
        L_0x000d:
            return
        L_0x000e:
            X.4Rr r0 = r4.A07
            java.lang.String r3 = "newsletterInfo"
            boolean r0 = r0.A00(r1)
            com.whatsapp.TextEmojiLabel r2 = r4.A0A()
            if (r0 == 0) goto L_0x0022
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0022:
            X.2Dk r0 = r4.A00
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x008a
            X.01E r1 = r4.A0U
            r0 = 2131892555(0x7f12194b, float:1.9419862E38)
        L_0x002f:
            java.lang.String r0 = X.C18070vi.A0F(r1, r0)
        L_0x0033:
            r2.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r4.A0A()
            r0 = 0
            r1.setVisibility(r0)
            X.2Dk r0 = r4.A00
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x000d
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r4.A02 = r0
            r4.A01 = r0
            com.whatsapp.TextEmojiLabel r1 = r4.A0A()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            com.whatsapp.TextEmojiLabel r0 = r4.A0A()
            android.view.ViewPropertyAnimator r1 = r0.animate()
            if (r1 == 0) goto L_0x000d
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            if (r2 == 0) goto L_0x000d
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L_0x000d
            r0 = 2000(0x7d0, double:9.88E-321)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            if (r2 == 0) goto L_0x000d
            r1 = 24
            X.4rh r0 = new X.4rh
            r0.<init>(r4, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            if (r0 == 0) goto L_0x000d
            r0.start()
            return
        L_0x008a:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = A03(r4)
            goto L_0x0033
        L_0x0093:
            X.01E r1 = r4.A0U
            r0 = 2131892893(0x7f121a9d, float:1.9420547E38)
            goto L_0x002f
        L_0x0099:
            X.C18070vi.A11(r3)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77813rX.A05(X.3rX):void");
    }

    public static final void A06(C77813rX r5, C46162Dk r6) {
        C46162Dk r3 = r5.A00;
        if (r3 != null) {
            r5.A00 = r6;
            if (C18070vi.A18(r3.A0T, r6.A0T) && r3.A05 == r6.A05 && r3.A04 == r6.A04) {
                long j = r3.A0G;
                C46162Dk r0 = r5.A00;
                if (r0 != null) {
                    if (j == r0.A0G) {
                        return;
                    }
                }
            }
            A05(r5);
            return;
        }
        C18070vi.A11("newsletterInfo");
        throw null;
    }

    public String BO6() {
        return "NewsletterTitle";
    }

    public void A0I() {
        super.A0I();
        A04(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77813rX(X.AnonymousClass01E r48, X.C42201xn r49, X.AnonymousClass4JP r50, X.AnonymousClass1KB r51, X.AnonymousClass11S r52, X.C72043Kk r53, X.AnonymousClass4ZR r54, X.C39511tC r55, X.C35751mk r56, X.AnonymousClass1VW r57, X.C24671Lf r58, X.C24921Me r59, X.C27191Vc r60, X.C27171Va r61, X.AnonymousClass11P r62, X.C18000vb r63, X.AnonymousClass1Q1 r64, X.AnonymousClass1CJ r65, X.C25181Nf r66, X.AnonymousClass1E7 r67, X.AnonymousClass1KW r68, X.C18030ve r69, X.C25191Ng r70, X.AnonymousClass1LT r71, X.C29681ch r72, X.AnonymousClass4XM r73, X.C86454Rr r74, X.AnonymousClass1PU r75, X.AnonymousClass1DC r76, X.AnonymousClass10I r77, java.lang.String r78) {
        /*
            r47 = this;
            r1 = 1
            r46 = r48
            r0 = r46
            X.C18070vi.A0d(r0, r1)
            r0 = 3
            r15 = r67
            r7 = r72
            X.C18070vi.A0f(r7, r0, r15)
            r44 = r51
            r2 = r77
            r43 = r52
            r12 = r65
            r10 = r69
            r3 = r44
            r0 = r43
            X.C18070vi.A0x(r10, r3, r0, r2, r12)
            r3 = r76
            r24 = r57
            r26 = r59
            r45 = r49
            r11 = r68
            r5 = r24
            r4 = r45
            r0 = r26
            X.C18070vi.A0y(r11, r5, r4, r3, r0)
            r4 = r75
            r25 = r58
            r19 = r61
            r18 = r63
            r6 = r18
            r5 = r19
            r0 = r25
            X.C18070vi.A0t(r6, r4, r5, r0)
            r22 = r55
            r23 = r56
            r27 = r60
            r17 = r64
            r8 = r17
            r6 = r23
            r5 = r22
            r0 = r27
            X.C18070vi.A0u(r6, r8, r5, r0)
            r14 = r50
            r20 = r53
            r16 = r66
            r9 = r70
            r5 = r16
            r0 = r20
            X.C18070vi.A0v(r5, r9, r14, r0)
            r13 = r62
            r8 = r71
            r6 = r73
            r5 = r74
            X.C72483Me.A15(r8, r13, r6, r5)
            r30 = 0
            r0 = r47
            r21 = r54
            r42 = r78
            r28 = r19
            r29 = r18
            r31 = r17
            r32 = r16
            r33 = r15
            r34 = r11
            r35 = r10
            r36 = r9
            r37 = r8
            r38 = r7
            r39 = r4
            r40 = r3
            r41 = r2
            r15 = r0
            r16 = r46
            r17 = r45
            r18 = r44
            r19 = r43
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0.A05 = r13
            r0.A06 = r6
            r0.A07 = r5
            X.1E7 r2 = r0.A0H
            X.1BI r2 = r2.A0J
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r2, r3)
            X.1ci r2 = r12.A0A(r2)
            if (r2 == 0) goto L_0x00cf
            X.01E r2 = r0.A0U
            X.AnonymousClass3MW.A1W(r2)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.1E7 r1 = r0.A0H
            X.1BI r1 = r1.A0J
            X.C18070vi.A0z(r1, r3)
            X.1ch r1 = (X.C29681ch) r1
            X.440 r1 = X.AnonymousClass4HB.A00(r14, r2, r1)
            r0.A03 = r1
            A04(r0)
            return
        L_0x00cf:
            r0.A04 = r1
            X.01E r0 = r0.A0U
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77813rX.<init>(X.01E, X.1xn, X.4JP, X.1KB, X.11S, X.3Kk, X.4ZR, X.1tC, X.1mk, X.1VW, X.1Lf, X.1Me, X.1Vc, X.1Va, X.11P, X.0vb, X.1Q1, X.1CJ, X.1Nf, X.1E7, X.1KW, X.0ve, X.1Ng, X.1LT, X.1ch, X.4XM, X.4Rr, X.1PU, X.1DC, X.10I, java.lang.String):void");
    }
}
