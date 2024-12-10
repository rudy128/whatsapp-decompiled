package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.6Gl  reason: invalid class name and case insensitive filesystem */
public final class C120896Gl extends AnonymousClass6Gn {
    public C121826Lq A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C32951i1 A04;
    public final AnonymousClass1WR A05;
    public final C24681Lg A06;
    public final C25931Qe A07;
    public final AnonymousClass70R A08;
    public final AnonymousClass1W6 A09;
    public final AnonymousClass73X A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1LU A0C;
    public final AnonymousClass70R A0D;
    public final AnonymousClass1DC A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023b, code lost:
        if (X.C18020vd.A05(r1, r2, 9692) != false) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(android.view.View r18) {
        /*
            r17 = this;
            r7 = 0
            r12 = r17
            r0 = r18
            super.A0U(r0)
            X.206 r6 = r12.A07
            X.1BI r0 = r6.A0H()
            boolean r1 = X.C22971Dz.A0Z(r0)
            r5 = 8
            X.70R r4 = r12.A08
            X.1bI r0 = r4.A08()
            if (r1 == 0) goto L_0x003a
            r0.A04(r5)
            android.view.ViewGroup r0 = r4.A08
            if (r0 == 0) goto L_0x0026
            r0.setVisibility(r5)
        L_0x0026:
            X.0ve r2 = r12.A0L
            r1 = 9775(0x262f, float:1.3698E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0260
            X.10I r1 = r12.A0S
            r0 = 48
            X.AnonymousClass7RH.A01(r1, r12, r0)
            return
        L_0x003a:
            r0.A04(r7)
            android.view.ViewGroup r0 = r4.A08
            if (r0 == 0) goto L_0x0044
            r0.setVisibility(r5)
        L_0x0044:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0058
            android.view.View r1 = X.AnonymousClass70R.A00(r4)
            r0 = 2131434508(0x7f0b1c0c, float:1.8490832E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r1, r0)
            android.content.res.ColorStateList r0 = r12.A00
            X.AnonymousClass1HF.A0L(r0, r1)
        L_0x0058:
            boolean r8 = r12.A0V
            if (r8 == 0) goto L_0x025b
            X.0ve r2 = r12.A0L
            r1 = 10578(0x2952, float:1.4823E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0076
            android.view.View r1 = X.AnonymousClass70R.A00(r4)
            r0 = 2131434509(0x7f0b1c0d, float:1.8490834E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            r0.setVisibility(r7)
        L_0x0076:
            r9 = 2131434507(0x7f0b1c0b, float:1.849083E38)
        L_0x0079:
            X.1bI r0 = r4.A08()
            android.view.View r10 = X.AnonymousClass3MX.A0D(r0)
            X.1BI r1 = r6.A0H()
            if (r1 == 0) goto L_0x00a2
            X.1M9 r0 = r12.A02
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r12.A03
            java.lang.String r3 = r0.A0N(r1)
            android.content.Context r2 = r12.A0J()
            r1 = 2131896384(0x7f122840, float:1.9427628E38)
            r0 = 1
            java.lang.String r0 = X.C17890vO.A0R(r2, r3, r0, r7, r1)
            X.AnonymousClass1Y5.A06(r10, r0)
        L_0x00a2:
            android.view.View r0 = X.AnonymousClass70R.A00(r4)
            android.view.View r3 = X.AnonymousClass3MX.A0C(r0, r9)
            if (r8 != 0) goto L_0x00c8
            X.1Lc r0 = r12.A0M
            X.0ve r2 = r0.A01
            r1 = 11079(0x2b47, float:1.5525E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c8
            android.view.View r0 = X.AnonymousClass70R.A00(r4)
            r0.setPadding(r7, r7, r7, r7)
            int r0 = X.C43531zx.A00(r3, r5)
            r3.setPadding(r7, r7, r7, r0)
        L_0x00c8:
            r0 = 12
            X.AnonymousClass6LG.A00(r3, r12, r0)
            android.view.View r1 = X.AnonymousClass70R.A00(r4)
            r0 = 2131436819(0x7f0b2513, float:1.849552E38)
            X.1bI r2 = X.C72453Mb.A0s(r1, r0)
            X.0ve r10 = r12.A0L
            r0 = 11953(0x2eb1, float:1.675E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r16 = X.C18020vd.A05(r1, r10, r0)
            android.view.ViewStub r9 = r2.A01
            if (r9 == 0) goto L_0x00f1
            r0 = 2131627072(0x7f0e0c40, float:1.8881398E38)
            if (r16 == 0) goto L_0x00ee
            r0 = 2131627073(0x7f0e0c41, float:1.88814E38)
        L_0x00ee:
            r9.setLayoutResource(r0)
        L_0x00f1:
            r0 = 7471(0x1d2f, float:1.0469E-41)
            boolean r0 = X.C18020vd.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x0256
            r0 = 8742(0x2226, float:1.225E-41)
            boolean r0 = X.C18020vd.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x0111
            X.36j r0 = X.C63672tV.A02(r6)
            if (r0 == 0) goto L_0x0111
            X.36j r0 = X.C63672tV.A02(r6)
            if (r0 == 0) goto L_0x0256
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0256
        L_0x0111:
            android.view.View r9 = r2.A02()
            r0 = 2131435655(0x7f0b2087, float:1.8493158E38)
            android.view.View r11 = X.AnonymousClass3MX.A0C(r9, r0)
            X.4rF r14 = X.C98494rF.A00()
            X.4rF r13 = X.C98494rF.A00()
            android.view.View r9 = r2.A02()
            r0 = 2131432228(0x7f0b1324, float:1.8486208E38)
            if (r16 == 0) goto L_0x023f
            X.1bI r0 = X.C72453Mb.A0s(r9, r0)
            r13.element = r0
        L_0x0133:
            if (r8 != 0) goto L_0x014a
            X.1Lc r0 = r12.A0M
            X.0ve r8 = r0.A01
            r0 = 11079(0x2b47, float:1.5525E-41)
            boolean r0 = X.C18020vd.A05(r1, r8, r0)
            if (r0 == 0) goto L_0x014a
            r8 = 7
            X.7RQ r0 = new X.7RQ
            r0.<init>(r2, r3, r8)
            r3.post(r0)
        L_0x014a:
            android.view.View r0 = r2.A02()
            r15 = 2
            X.78F r10 = new X.78F
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.setOnClickListener(r10)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0164
            android.view.View r3 = r2.A02()
            android.content.res.ColorStateList r0 = r12.A00
            X.AnonymousClass1HF.A0L(r0, r3)
        L_0x0164:
            android.view.View r3 = X.AnonymousClass3MX.A0D(r2)
            X.10I r0 = r12.A0S
            X.AnonymousClass7RQ.A02(r0, r12, r3, r5)
            android.view.View r0 = r2.A02()
            r0.setEnabled(r7)
        L_0x0174:
            X.36j r0 = X.C63672tV.A02(r6)
            r2 = 1
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r0.A01()
            if (r0 != r2) goto L_0x01fe
        L_0x0181:
            X.1Lc r0 = r12.A0M
            X.0ve r2 = r0.A01
            r0 = 10025(0x2729, float:1.4048E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01e5
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x0264
            r0 = 2131436822(0x7f0b2516, float:1.8495525E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            android.view.View r3 = X.AnonymousClass3MX.A0D(r0)
        L_0x019c:
            X.0vf r1 = X.C18040vf.A01
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x01b8
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x01c2
            X.21V r6 = (X.AnonymousClass21V) r6
            java.lang.String r0 = r6.A18()
            if (r0 == 0) goto L_0x01b8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01c2
        L_0x01b8:
            r0 = 14
            X.AnonymousClass78P.A00(r3, r12, r0)
            r3.setVisibility(r7)
            goto L_0x0026
        L_0x01c2:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r0 = 0
            if (r1 == 0) goto L_0x01e1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x01e1
            android.content.Context r0 = r12.A0J()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168852(0x7f070e54, float:1.7952018E38)
            int r0 = X.AnonymousClass3MW.A01(r1, r0)
            r2.bottomMargin = r0
            r0 = r2
        L_0x01e1:
            r3.setLayoutParams(r0)
            goto L_0x01b8
        L_0x01e5:
            android.view.View r1 = X.AnonymousClass70R.A00(r4)
            r0 = 2131436823(0x7f0b2517, float:1.8495527E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            android.view.View r3 = X.AnonymousClass3MX.A0D(r0)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x019c
            android.content.res.ColorStateList r0 = r12.A00
            X.AnonymousClass1HF.A0L(r0, r3)
            goto L_0x019c
        L_0x01fe:
            X.36j r0 = X.C63672tV.A02(r6)
            if (r0 == 0) goto L_0x0026
            java.util.Set r0 = r0.A04
            if (r0 == 0) goto L_0x0026
            java.util.Iterator r3 = r0.iterator()
        L_0x020c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x020c
            if (r2 == 0) goto L_0x0026
            X.1Lc r0 = r12.A0M
            X.0ve r2 = r0.A01
            r0 = 12254(0x2fde, float:1.7172E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0026
            r0 = 9816(0x2658, float:1.3755E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0026
            r0 = 9692(0x25dc, float:1.3581E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0181
        L_0x023f:
            android.view.View r10 = r9.findViewById(r0)
            r14.element = r10
            com.airbnb.lottie.LottieAnimationView r10 = (com.airbnb.lottie.LottieAnimationView) r10
            r0 = 1
            X.CxR r9 = new X.CxR
            r9.<init>(r10, r11, r0)
            X.1rd r0 = r10.A09
            X.1rf r0 = r0.A0d
            r0.addListener(r9)
            goto L_0x0133
        L_0x0256:
            r2.A04(r5)
            goto L_0x0174
        L_0x025b:
            r9 = 2131434510(0x7f0b1c0e, float:1.8490836E38)
            goto L_0x0079
        L_0x0260:
            A00(r12)
            return
        L_0x0264:
            java.lang.String r0 = "contentSheet"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120896Gl.A0U(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0L, 7184) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C120896Gl r3) {
        /*
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0018
            X.206 r0 = r3.A07
            int r1 = r0.A0u
            r0 = 3
            if (r1 != r0) goto L_0x0018
            X.0ve r2 = r3.A0L
            r1 = 7184(0x1c10, float:1.0067E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r3.A0Y(r0)
            X.1KB r2 = r3.A0F
            r1 = 49
            X.7RH r0 = new X.7RH
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGP(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120896Gl.A00(X.6Gl):void");
    }

    public static final void A01(C120896Gl r5, int i) {
        Boolean bool;
        C32741hg r1 = r5.A05;
        r1.A03 = Integer.valueOf(i);
        boolean z = r5.A0V;
        if (z) {
            bool = C108945cZ.A1A(r5.A0W());
        } else {
            bool = null;
        }
        r1.A02 = bool;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("playbackPage/reply page=");
        A10.append(r5);
        A10.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = r5.A0N.A01;
        C17900vP.A0b(statusPlaybackBaseFragment, A10);
        AnonymousClass1FU r0 = (AnonymousClass1FU) C18050vg.A01(r5.A0J(), AnonymousClass1FU.class);
        if (r0 == null || !r0.Bed()) {
            r5.A0P();
            if (!z) {
                r5.A08.A08().A04(8);
            }
            Context A0J = r5.A0J();
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(A0J.getPackageName(), "com.whatsapp.status.playback.StatusReplyActivity");
            AnonymousClass4aU.A00(A0A2, r5.A07.A0v);
            A0A2.putExtra("isStatusReply", true);
            AnonymousClass1FL A1B = statusPlaybackBaseFragment.A1B();
            if (A1B == null || A1B.isFinishing()) {
                r5.A0E.A0A(r5.A0J(), A0A2);
                return;
            }
            if (C18020vd.A05(C18040vf.A02, r5.A0L, 1455)) {
                A1B.getWindow().setSoftInputMode(48);
            }
            C108995ce.A17(r5.A0E, AnonymousClass1L9.A07(A0A2, A1B, 10) ? 1 : 0);
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("playbackPage/reply reply-already-ended page=");
        A102.append(r5);
        C17900vP.A0Y(statusPlaybackBaseFragment, "; host=", A102);
    }

    public final void A0b() {
        AnonymousClass70R r2 = this.A08;
        if (r2.A0H) {
            A0P();
            r2.A08().A04(8);
            View view = r2.A03;
            if (view != null) {
                view.setVisibility(8);
            }
            C28931bI r1 = r2.A0F;
            if (r1 != null) {
                r1.A04(0);
                this.A01.A0W(3);
                C28931bI r0 = r2.A0F;
                if (r0 != null) {
                    AnonymousClass6LG.A00(r0.A02().findViewById(2131428443), this, 13);
                    C28931bI r02 = r2.A0F;
                    if (r02 != null) {
                        View A0D2 = AnonymousClass3MX.A0D(r02);
                        if (!C18020vd.A05(C18040vf.A02, this.A0M.A01, 12254)) {
                            AnonymousClass3MY.A0x(A0J(), C17880vN.A0E(A0D2, 2131432490), 2131893138);
                            AnonymousClass3MY.A0x(A0J(), C17880vN.A0E(A0D2, 2131432488), 2131893137);
                            return;
                        }
                        return;
                    }
                }
            }
            C18070vi.A11("mentionsReceiverNuxPanel");
            throw null;
        }
    }

    public void A0D() {
        super.A0D();
        this.A06.unregisterObserver(this.A05);
    }

    public void A0M() {
        super.A0M();
        C17890vO.A0t(this.A00);
        this.A00 = null;
        AnonymousClass7O7 r4 = new AnonymousClass7O7(this, 2);
        AnonymousClass1W6 r3 = this.A09;
        AnonymousClass73X r2 = this.A0A;
        AnonymousClass1BI A0H = this.A07.A0H();
        if (A0H != null) {
            C121826Lq r1 = new C121826Lq(A0H, r3, r4, r2);
            C17890vO.A0u(r1, this.A0S);
            this.A00 = r1;
            return;
        }
        throw C17880vN.A0g();
    }

    public void A0N() {
        View view;
        super.A0N();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        int i = 8;
        if (bottomSheetBehavior.A0J != 4) {
            bottomSheetBehavior.A0W(4);
        } else {
            AnonymousClass70R r1 = this.A08;
            r1.A01().setVisibility(8);
            r1.A01().setAlpha(0.0f);
        }
        boolean A0Z = C22971Dz.A0Z(this.A07.A0H());
        AnonymousClass70R r12 = this.A08;
        C28931bI A082 = r12.A08();
        if (A0Z) {
            A082.A04(8);
            view = r12.A08;
        } else {
            i = 0;
            A082.A04(0);
            view = r12.A03;
        }
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void A0R(int i) {
        super.A0R(i);
        if (i == 3) {
            AnonymousClass70R r2 = this.A08;
            C28931bI r0 = r2.A0F;
            if (r0 != null) {
                if (r0.A01() == 8) {
                    r2.A01().setVisibility(0);
                    r2.A01().setAlpha(1.0f);
                    A01(this, 1);
                    return;
                }
                return;
            }
        } else if (i == 4) {
            C28931bI r02 = this.A08.A0F;
            if (r02 != null) {
                r02.A04(8);
                return;
            }
        } else {
            return;
        }
        C18070vi.A11("mentionsReceiverNuxPanel");
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120896Gl(X.AnonymousClass1L8 r44, X.AnonymousClass1L9 r45, X.C61862qP r46, X.AnonymousClass1KB r47, X.AnonymousClass11S r48, X.C34531kd r49, X.C40751vD r50, X.C33251iW r51, X.AnonymousClass1M9 r52, X.C24921Me r53, X.C37451pZ r54, X.C36531o3 r55, X.C32951i1 r56, X.AnonymousClass11C r57, X.AnonymousClass11P r58, X.C24681Lg r59, X.C36391no r60, X.AnonymousClass1WX r61, X.C24661Le r62, X.C32981i4 r63, X.C18030ve r64, X.C25931Qe r65, X.AnonymousClass1LU r66, X.C62242r5 r67, X.C32861hs r68, X.AnonymousClass168 r69, X.AnonymousClass206 r70, X.C24641Lc r71, X.C32741hg r72, X.C1407572w r73, X.C131156kb r74, X.AnonymousClass6p9 r75, X.AnonymousClass1W6 r76, X.C139956zi r77, X.AnonymousClass1DC r78, X.AnonymousClass10I r79, X.AnonymousClass73X r80, X.AnonymousClass00H r81, X.AnonymousClass00H r82, X.AnonymousClass00H r83, X.AnonymousClass00H r84, boolean r85) {
        /*
            r43 = this;
            r0 = 3
            r8 = r67
            r2 = r77
            X.C108975cc.A10(r2, r0, r8)
            r0 = 16
            r7 = r69
            X.C18070vi.A0d(r7, r0)
            r0 = 19
            r3 = r76
            X.C18070vi.A0d(r3, r0)
            r0 = 23
            r5 = r73
            r4 = r74
            X.C108975cc.A11(r5, r0, r4)
            r0 = 40
            r1 = r78
            X.C18070vi.A0d(r1, r0)
            r10 = r43
            r34 = r72
            r33 = r71
            r6 = r70
            r30 = r68
            r9 = r65
            r27 = r64
            r26 = r63
            r25 = r62
            r24 = r61
            r23 = r60
            r11 = r44
            r12 = r45
            r37 = r75
            r13 = r46
            r14 = r47
            r15 = r48
            r16 = r49
            r39 = r79
            r17 = r50
            r18 = r51
            r40 = r82
            r41 = r83
            r19 = r54
            r42 = r84
            r20 = r55
            r21 = r57
            r22 = r58
            r28 = r9
            r29 = r8
            r31 = r7
            r32 = r6
            r35 = r5
            r36 = r4
            r38 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = r66
            r10.A0C = r0
            r0 = r52
            r10.A02 = r0
            r0 = r53
            r10.A03 = r0
            r10.A09 = r3
            r0 = r59
            r10.A06 = r0
            r0 = r80
            r10.A0A = r0
            r0 = r85
            r10.A0F = r0
            r10.A07 = r9
            r10.A01 = r15
            r0 = r56
            r10.A04 = r0
            r0 = r81
            r10.A0B = r0
            r10.A0E = r1
            boolean r1 = r10.A0V
            X.70R r0 = new X.70R
            r0.<init>(r1)
            r10.A0D = r0
            r10.A08 = r0
            X.7FL r0 = new X.7FL
            r0.<init>(r14, r6, r10)
            r10.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120896Gl.<init>(X.1L8, X.1L9, X.2qP, X.1KB, X.11S, X.1kd, X.1vD, X.1iW, X.1M9, X.1Me, X.1pZ, X.1o3, X.1i1, X.11C, X.11P, X.1Lg, X.1no, X.1WX, X.1Le, X.1i4, X.0ve, X.1Qe, X.1LU, X.2r5, X.1hs, X.168, X.206, X.1Lc, X.1hg, X.72w, X.6kb, X.6p9, X.1W6, X.6zi, X.1DC, X.10I, X.73X, X.00H, X.00H, X.00H, X.00H, boolean):void");
    }
}
