package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass1DS;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1OX;
import X.AnonymousClass1PM;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.C135026rX;
import X.C138056wS;
import X.C139766zP;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C22791Df;
import X.C35761ml;
import X.C35771mm;
import X.C41111vp;
import X.C41731wy;
import X.C42741yf;
import com.whatsapp.jid.UserJid;

public final class UserControlMessageLevelViewModel extends AnonymousClass1J2 {
    public AnonymousClass206 A00;
    public C135026rX A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1KB A04;
    public final C35761ml A05;
    public final C18030ve A06;
    public final C138056wS A07;
    public final C41111vp A08;
    public final C41731wy A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass1OX A0F;
    public final AnonymousClass11E A0G;
    public final AnonymousClass1LU A0H;
    public final AnonymousClass00H A0I;
    public final C18600wl A0J;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r8, X.C122666Rg r9, com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C147897Ux
            if (r0 == 0) goto L_0x010d
            r6 = r11
            X.7Ux r6 = (X.C147897Ux) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010d
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r4) goto L_0x0114
            java.lang.Object r8 = r6.L$2
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r6.L$1
            java.lang.Object r10 = r6.L$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r10 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r10
            X.C30691eM.A01(r2)
        L_0x002b:
            X.6Rg r0 = X.C122666Rg.INTERESTED
            if (r9 != r0) goto L_0x0030
            r5 = 1
        L_0x0030:
            X.C18070vi.A0d(r8, r4)
            if (r5 == 0) goto L_0x004c
            r0 = 2131897229(0x7f122b8d, float:1.9429342E38)
        L_0x0038:
            java.lang.String r0 = r8.getString(r0)
        L_0x003c:
            X.C18070vi.A0b(r0)
            X.6Ko r1 = new X.6Ko
            r1.<init>(r0, r5)
            X.1wy r0 = r10.A09
            r0.A0F(r1)
        L_0x0049:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004c:
            if (r2 == 0) goto L_0x0059
            r1 = 2131897230(0x7f122b8e, float:1.9429344E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C108975cc.A0b(r8, r2, r0, r1)
            if (r0 != 0) goto L_0x003c
        L_0x0059:
            r0 = 2131897231(0x7f122b8f, float:1.9429346E38)
            goto L_0x0038
        L_0x005d:
            X.C30691eM.A01(r2)
            X.11E r0 = r10.A0G
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0103
            X.6Rg r0 = X.C122666Rg.INTERESTED
            boolean r3 = X.AnonymousClass000.A1Z(r9, r0)
            X.1OX r2 = r10.A0F
            r1 = 0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUpdatePreference$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUpdatePreference$1
            r0.<init>(r10, r1, r3)
            X.AnonymousClass3MX.A1Q(r0, r2)
            X.6Rg r0 = X.C122666Rg.NOT_INTERESTED
            if (r9 != r0) goto L_0x00e4
            X.6wS r0 = r10.A07
            X.0ve r2 = r0.A00
            r1 = 10668(0x29ac, float:1.4949E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = A04(r10)
            if (r0 == 0) goto L_0x00a9
            X.6rX r0 = r10.A01
            if (r0 == 0) goto L_0x00e4
            X.206 r0 = r0.A01
            if (r0 == 0) goto L_0x00e4
            com.whatsapp.jid.UserJid r1 = r0.A0I()
            if (r1 == 0) goto L_0x00e4
            X.00H r0 = r10.A0B
            boolean r0 = X.C72463Mc.A1U(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            X.6Kp r1 = X.C121596Kp.A00
            X.1wy r0 = r10.A09
            r0.A0F(r1)
            android.app.Activity r3 = X.AnonymousClass1L9.A00(r8)
            boolean r0 = r3 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x00e2
            X.1FL r3 = (X.AnonymousClass1FL) r3
        L_0x00ba:
            android.os.Bundle r1 = X.C17880vN.A0D()
            X.6rX r0 = r10.A01
            if (r0 == 0) goto L_0x00cd
            X.206 r0 = r0.A01
            if (r0 == 0) goto L_0x00cd
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x00cd
            X.AnonymousClass4aU.A0A(r1, r0)
        L_0x00cd:
            com.whatsapp.usercontrol.view.UserControlNotInterestedFragment r2 = new com.whatsapp.usercontrol.view.UserControlNotInterestedFragment
            r2.<init>()
            r2.A1R(r1)
            if (r3 == 0) goto L_0x0049
            X.1GP r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "UserControlNotInterestedFragment"
            r2.A2C(r1, r0)
            goto L_0x0049
        L_0x00e2:
            r3 = 0
            goto L_0x00ba
        L_0x00e4:
            X.6rX r0 = r10.A01
            r3 = 0
            if (r0 == 0) goto L_0x0101
            com.whatsapp.jid.UserJid r2 = r0.A00
        L_0x00eb:
            X.0wl r1 = r10.A0J
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$submitFeedback$verifiedName$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$submitFeedback$verifiedName$1
            r0.<init>(r2, r10, r3)
            r6.L$0 = r10
            r6.L$1 = r9
            r6.L$2 = r8
            r6.label = r4
            java.lang.Object r2 = X.C30451dy.A00(r6, r1, r0)
            if (r2 != r7) goto L_0x002b
            return r7
        L_0x0101:
            r2 = r3
            goto L_0x00eb
        L_0x0103:
            X.1KB r1 = r10.A04
            r0 = 2131892931(0x7f121ac3, float:1.9420624E38)
            r1.A08(r0, r5)
            goto L_0x0049
        L_0x010d:
            X.7Ux r6 = new X.7Ux
            r6.<init>(r10, r11)
            goto L_0x0012
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A00(android.content.Context, X.6Rg, com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel, X.1dr):java.lang.Object");
    }

    public static final String A03(UserJid userJid, UserControlMessageLevelViewModel userControlMessageLevelViewModel) {
        C42741yf A012 = ((AnonymousClass1PM) userControlMessageLevelViewModel.A0I.get()).A01(userJid);
        if (A012 != null) {
            return A012.A08;
        }
        return null;
    }

    public static final boolean A04(UserControlMessageLevelViewModel userControlMessageLevelViewModel) {
        AnonymousClass206 r0;
        UserJid A0I2;
        C135026rX r02 = userControlMessageLevelViewModel.A01;
        if (r02 == null || (r0 = r02.A01) == null || (A0I2 = r0.A0I()) == null) {
            return false;
        }
        return ((C35771mm) userControlMessageLevelViewModel.A07.A01.get()).A08(A0I2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0T(android.content.Context r8, X.C30391dr r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C147677Ub
            if (r0 == 0) goto L_0x0069
            r6 = r9
            X.7Ub r6 = (X.C147677Ub) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r3) goto L_0x006f
            java.lang.Object r8 = r6.L$1
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r2 = r6.L$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r2
            X.C30691eM.A01(r5)
        L_0x0028:
            X.C18070vi.A0d(r8, r3)
            if (r5 == 0) goto L_0x0038
            r1 = 2131897676(0x7f122d4c, float:1.9430248E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C108975cc.A0b(r8, r5, r0, r1)
            if (r0 != 0) goto L_0x003f
        L_0x0038:
            r0 = 2131897677(0x7f122d4d, float:1.943025E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x003f:
            X.C18070vi.A0b(r0)
            X.6Kl r1 = new X.6Kl
            r1.<init>(r0)
            X.1wy r0 = r2.A09
            r0.A0F(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004f:
            X.C30691eM.A01(r5)
            X.0wl r2 = r7.A0J
            r1 = 0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateNotInterestedDescText$verifiedName$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateNotInterestedDescText$verifiedName$1
            r0.<init>(r7, r1)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r5 = X.C30451dy.A00(r6, r2, r0)
            if (r5 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r2 = r7
            goto L_0x0028
        L_0x0069:
            X.7Ub r6 = new X.7Ub
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A0T(android.content.Context, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0U(android.content.Context r8, X.C30391dr r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C147687Uc
            if (r0 == 0) goto L_0x0069
            r6 = r9
            X.7Uc r6 = (X.C147687Uc) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r3) goto L_0x006f
            java.lang.Object r8 = r6.L$1
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r2 = r6.L$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r2
            X.C30691eM.A01(r5)
        L_0x0028:
            X.C18070vi.A0d(r8, r3)
            if (r5 == 0) goto L_0x0038
            r1 = 2131897223(0x7f122b87, float:1.942933E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C108975cc.A0b(r8, r5, r0, r1)
            if (r0 != 0) goto L_0x003f
        L_0x0038:
            r0 = 2131897225(0x7f122b89, float:1.9429333E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x003f:
            X.C18070vi.A0b(r0)
            X.6Km r1 = new X.6Km
            r1.<init>(r0)
            X.1wy r0 = r2.A09
            r0.A0F(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004f:
            X.C30691eM.A01(r5)
            X.0wl r2 = r7.A0J
            r1 = 0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1
            r0.<init>(r7, r1)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r5 = X.C30451dy.A00(r6, r2, r0)
            if (r5 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r2 = r7
            goto L_0x0028
        L_0x0069:
            X.7Uc r6 = new X.7Uc
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A0U(android.content.Context, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0V(android.content.Context r8, X.C30391dr r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C147697Ud
            if (r0 == 0) goto L_0x0071
            r6 = r9
            X.7Ud r6 = (X.C147697Ud) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r3 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r4) goto L_0x0077
            java.lang.Object r8 = r6.L$1
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r2 = r6.L$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r2
            X.C30691eM.A01(r3)
        L_0x0028:
            X.C18070vi.A0d(r8, r4)
            if (r3 == 0) goto L_0x0038
            r1 = 2131897232(0x7f122b90, float:1.9429348E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C108975cc.A0b(r8, r3, r0, r1)
            if (r0 != 0) goto L_0x003f
        L_0x0038:
            r0 = 2131897233(0x7f122b91, float:1.942935E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x003f:
            X.C18070vi.A0b(r0)
            X.6Kn r1 = new X.6Kn
            r1.<init>(r0)
            X.1wy r0 = r2.A09
            r0.A0F(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004f:
            X.C30691eM.A01(r3)
            X.6rX r0 = r7.A01
            r3 = 0
            if (r0 == 0) goto L_0x006d
            com.whatsapp.jid.UserJid r2 = r0.A00
        L_0x0059:
            X.0wl r1 = r7.A0J
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateTitleText$verifiedName$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateTitleText$verifiedName$1
            r0.<init>(r2, r7, r3)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r4
            java.lang.Object r3 = X.C30451dy.A00(r6, r1, r0)
            if (r3 != r5) goto L_0x006f
            return r5
        L_0x006d:
            r2 = r3
            goto L_0x0059
        L_0x006f:
            r2 = r7
            goto L_0x0028
        L_0x0071:
            X.7Ud r6 = new X.7Ud
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A0V(android.content.Context, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.6Ui, java.lang.Object] */
    public UserControlMessageLevelViewModel(AnonymousClass1KB r3, C35761ml r4, AnonymousClass11E r5, C18030ve r6, AnonymousClass1LU r7, C138056wS r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15, AnonymousClass1OX r16) {
        C18070vi.A0w(r9, r10, r11, r12, r15);
        AnonymousClass1OX r1 = r16;
        C18070vi.A0x(r13, r3, r1, r5, r8);
        C18070vi.A0r(r7, r14, r4);
        C18070vi.A0d(r6, 14);
        this.A0A = r9;
        this.A0C = r10;
        this.A0E = r11;
        this.A0I = r12;
        this.A0J = r15;
        this.A0D = r13;
        this.A04 = r3;
        this.A0F = r1;
        this.A0G = r5;
        this.A07 = r8;
        this.A0H = r7;
        this.A0B = r14;
        this.A05 = r4;
        this.A06 = r6;
        r11.get();
        C41111vp A0n = AnonymousClass3MW.A0n(new C139766zP(new Object()));
        this.A08 = A0n;
        this.A03 = C22791Df.A00(A0n);
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A09 = A0o;
        this.A02 = A0o;
    }
}
