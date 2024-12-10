package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1TA;
import X.AnonymousClass1TD;
import X.AnonymousClass4QQ;
import X.C18030ve;
import X.C18070vi;
import X.C201811d;
import X.C93634jI;
import com.whatsapp.voipcalling.CallState;

public final class MinimizedCallBannerUseCase {
    public AnonymousClass1BI A00;
    public boolean A01;
    public CallState A02 = CallState.NONE;
    public final AnonymousClass4QQ A03;
    public final AnonymousClass1TD A04;
    public final AnonymousClass1TA A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1DC A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I = C201811d.A00(16467);

    /* JADX WARNING: type inference failed for: r3v3, types: [X.4ik] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r7.A01 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0139, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.ACCEPT_SENT) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r12, 8329) == false) goto L_0x0170;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C86534Sa r26, X.C30391dr r27, boolean r28, boolean r29, boolean r30) {
        /*
            r25 = this;
            r3 = r27
            r17 = r30
            r8 = r26
            boolean r0 = r3 instanceof X.C100904vG
            r7 = r25
            if (r0 == 0) goto L_0x031a
            r9 = r3
            X.4vG r9 = (X.C100904vG) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x031a
            int r2 = r2 - r1
            r9.label = r2
        L_0x001a:
            java.lang.Object r1 = r9.result
            X.1g4 r16 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r11 = 1
            r6 = 0
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0040
            if (r0 == r11) goto L_0x02d2
            if (r0 != r5) goto L_0x0321
            java.lang.Object r3 = r9.L$2
            java.lang.Object r8 = r9.L$1
            X.4Sa r8 = (X.C86534Sa) r8
            java.lang.Object r7 = r9.L$0
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase r7 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase) r7
            X.C30691eM.A01(r1)
        L_0x0037:
            com.whatsapp.voipcalling.CallState r1 = r8.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x003f
            r7.A01 = r6
        L_0x003f:
            return r3
        L_0x0040:
            X.C30691eM.A01(r1)
            X.00H r0 = r7.A07
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.4jI r0 = (X.C93634jI) r0
            r0.A03(r8, r6)
            if (r29 != 0) goto L_0x00c1
            if (r28 != 0) goto L_0x00c1
            X.C18070vi.A0d(r8, r6)
            X.1TA r1 = r7.A05
            java.lang.String r0 = r8.A0C
            java.lang.String r0 = X.C40811vJ.A0A(r0)
            X.2Q4 r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x030e
            long r0 = r0.A01()
            X.1TD r2 = r7.A04
            X.9Bw r3 = r2.A05(r0)
        L_0x006d:
            X.1EC r2 = r8.A08
            if (r2 == 0) goto L_0x0110
            X.00H r0 = r7.A08
            java.lang.Object r0 = r0.get()
            X.1RW r0 = (X.AnonymousClass1RW) r0
            X.1RX r1 = r0.A00()
            X.C18070vi.A0X(r1)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0110
            X.BCs r0 = r1.A00
            if (r0 == 0) goto L_0x0110
            X.1BI r0 = r0.getChatJid()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.4QQ r0 = r7.A03
            boolean r0 = r0.A00(r8, r2, r3)
            if (r0 != 0) goto L_0x00c1
            com.whatsapp.voipcalling.CallState r0 = r8.A0B
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass72U.A03(r0)
            if (r0 == 0) goto L_0x0110
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0110
            X.0ve r2 = r7.A06
            X.0vf r1 = X.C18040vf.A01
            r0 = 9788(0x263c, float:1.3716E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0110
            boolean r0 = X.C40811vJ.A0U(r2)
            if (r0 != 0) goto L_0x0110
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0110
        L_0x00c1:
            X.00H r0 = r7.A0D
            java.lang.Object r0 = r0.get()
            com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase r0 = (com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase) r0
            r0.A00 = r4
            if (r28 != 0) goto L_0x00d8
            X.1VE r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "animated_banner_entry_for_callid"
            X.C17880vN.A1B(r1, r0)
        L_0x00d8:
            r0 = r28 ^ 1
        L_0x00da:
            X.4ik r3 = new X.4ik
            r3.<init>(r0)
        L_0x00df:
            com.whatsapp.voipcalling.CallState r1 = r7.A02
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x0311
            com.whatsapp.voipcalling.CallState r1 = r8.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 != r0) goto L_0x0311
            boolean r0 = r3 instanceof X.C93284ij
            if (r0 == 0) goto L_0x0311
            boolean r0 = r8.A0G
            if (r0 != 0) goto L_0x0311
            r7.A02 = r1
            r9.L$0 = r7
            r9.L$1 = r8
            r9.L$2 = r3
            r9.L$3 = r4
            r9.L$4 = r4
            r9.L$5 = r4
            r9.L$6 = r4
            r9.label = r5
            r0 = 250(0xfa, double:1.235E-321)
            java.lang.Object r1 = X.C62882s9.A00(r9, r0)
            r0 = r16
            if (r1 != r0) goto L_0x0037
            return r16
        L_0x0110:
            X.0ve r12 = r7.A06
            X.00H r10 = r7.A0E
            boolean r0 = r8.A0H
            if (r0 != 0) goto L_0x013b
            boolean r1 = r8.A0G
            com.whatsapp.voipcalling.CallState r2 = r8.A0B
            if (r1 == 0) goto L_0x0152
            X.C18070vi.A0W(r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x013b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x0170
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 == r0) goto L_0x0170
            boolean r0 = X.AnonymousClass72U.A03(r2)
            if (r0 != 0) goto L_0x0170
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x0170
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r2 == r0) goto L_0x0170
        L_0x013b:
            X.00H r0 = r7.A0D
            java.lang.Object r0 = r0.get()
            com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase r0 = (com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase) r0
            r0.A00 = r4
            X.1VE r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "animated_banner_entry_for_callid"
            X.C17880vN.A1B(r1, r0)
            r0 = 1
            goto L_0x00da
        L_0x0152:
            X.C18070vi.A0W(r2)
            int r3 = r2.ordinal()
            if (r3 == r6) goto L_0x013b
            r0 = 9
            if (r3 == r0) goto L_0x013b
            r0 = 11
            if (r3 == r0) goto L_0x013b
            r0 = 3
            if (r3 != r0) goto L_0x0170
            X.0vf r3 = X.C18040vf.A01
            r0 = 8329(0x2089, float:1.1671E-41)
            boolean r0 = X.C18020vd.A05(r3, r12, r0)
            if (r0 != 0) goto L_0x013b
        L_0x0170:
            java.lang.Object r0 = r10.get()
            X.2pG r0 = (X.C61182pG) r0
            boolean r0 = X.C61182pG.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x013b
            if (r1 == 0) goto L_0x0287
            int r3 = r2.ordinal()
            if (r3 == r11) goto L_0x0275
            r0 = 10
            if (r3 == r0) goto L_0x0279
            r0 = 4
            if (r3 == r0) goto L_0x0271
            X.00H r0 = r7.A0A
            java.lang.Object r0 = r0.get()
            X.4XH r0 = (X.AnonymousClass4XH) r0
            X.4ii r13 = r0.A01(r8)
        L_0x0199:
            X.5Ww r13 = (X.C106705Ww) r13
        L_0x019b:
            X.00H r0 = r7.A0I
            r0.get()
            boolean r0 = X.AnonymousClass72U.A02(r2)
            if (r0 != r11) goto L_0x0262
            X.4if r12 = X.C93244if.A00
        L_0x01a8:
            X.5Wv r12 = (X.C106695Wv) r12
            X.00H r0 = r7.A0G
            r0.get()
            boolean r0 = X.AnonymousClass72U.A02(r2)
            if (r0 != r11) goto L_0x0245
            X.4if r10 = X.C93244if.A00
        L_0x01b7:
            X.5Wv r10 = (X.C106695Wv) r10
            X.00H r0 = r7.A0H
            r0.get()
            java.lang.String r0 = ""
            X.482 r0 = X.C1402670q.A00(r0)
            X.4id r2 = new X.4id
            r2.<init>(r0)
            X.00H r0 = r7.A09
            java.lang.Object r0 = r0.get()
            X.4ZU r0 = (X.AnonymousClass4ZU) r0
            X.4ZN r15 = X.AnonymousClass4ZU.A00(r0, r8)
            X.C18070vi.A0d(r15, r11)
            boolean r0 = r8.A0L
            if (r0 == 0) goto L_0x0229
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x0210
            r14 = 2131897847(0x7f122df7, float:1.9430595E38)
        L_0x01e3:
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r6] = r15
        L_0x01e7:
            X.6IR r14 = X.C1402670q.A02(r3, r14)
        L_0x01eb:
            X.00H r0 = r7.A0D
            java.lang.Object r1 = r0.get()
            com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase r1 = (com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase) r1
            r9.L$0 = r7
            r9.L$1 = r8
            r9.L$2 = r13
            r9.L$3 = r12
            r9.L$4 = r10
            r9.L$5 = r2
            r9.L$6 = r14
            r0 = r17
            r9.Z$0 = r0
            r9.label = r11
            java.lang.Object r1 = r1.A00(r8, r9)
            r0 = r16
            if (r1 != r0) goto L_0x02f5
            return r16
        L_0x0210:
            r14 = 2131898052(0x7f122ec4, float:1.943101E38)
            if (r1 == 0) goto L_0x01e3
            r14 = 2131898160(0x7f122f30, float:1.943123E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r1 = r0
            r0 = 2131898016(0x7f122ea0, float:1.9430938E38)
            X.6IR r0 = X.C1402670q.A02(r1, r0)
            r3[r6] = r0
            r3[r11] = r15
            goto L_0x01e7
        L_0x0229:
            boolean r1 = r8.A0Q
            r0 = 2131898117(0x7f122f05, float:1.9431143E38)
            if (r1 == 0) goto L_0x0233
            r0 = 2131897837(0x7f122ded, float:1.9430575E38)
        L_0x0233:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.6IR r0 = X.AnonymousClass3MX.A0t(r0)
            r1[r6] = r0
            r1[r11] = r15
            r0 = 2131898160(0x7f122f30, float:1.943123E38)
            X.6IR r14 = X.C1402670q.A02(r1, r0)
            goto L_0x01eb
        L_0x0245:
            r14 = 2131231634(0x7f080392, float:1.8079355E38)
            if (r1 == 0) goto L_0x024d
            r14 = 2131233243(0x7f0809db, float:1.8082618E38)
        L_0x024d:
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r0 = 2131898200(0x7f122f58, float:1.9431311E38)
            if (r2 != r3) goto L_0x0257
            r0 = 2131889222(0x7f120c46, float:1.9413101E38)
        L_0x0257:
            X.6IR r0 = X.AnonymousClass3MX.A0t(r0)
            X.4ie r10 = new X.4ie
            r10.<init>(r0, r14)
            goto L_0x01b7
        L_0x0262:
            X.6qE r0 = r8.A07
            if (r0 == 0) goto L_0x026f
            boolean r0 = r0.A0I
        L_0x0268:
            X.4ic r12 = new X.4ic
            r12.<init>(r0)
            goto L_0x01a8
        L_0x026f:
            r0 = 0
            goto L_0x0268
        L_0x0271:
            r0 = 2131891541(0x7f121555, float:1.9417805E38)
            goto L_0x027c
        L_0x0275:
            r0 = 2131896302(0x7f1227ee, float:1.9427461E38)
            goto L_0x027c
        L_0x0279:
            r0 = 2131897734(0x7f122d86, float:1.9430366E38)
        L_0x027c:
            X.6IR r0 = X.AnonymousClass3MX.A0t(r0)
            X.4ig r13 = new X.4ig
            r13.<init>(r0)
            goto L_0x0199
        L_0x0287:
            boolean r0 = r8.A0L
            if (r0 == 0) goto L_0x02c4
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x02b7;
                case 2: goto L_0x02b3;
                case 3: goto L_0x02a2;
                case 4: goto L_0x02af;
                case 5: goto L_0x02af;
                case 6: goto L_0x0292;
                case 7: goto L_0x0292;
                case 8: goto L_0x0292;
                case 9: goto L_0x0292;
                case 10: goto L_0x02b7;
                default: goto L_0x0292;
            }
        L_0x0292:
            X.00H r0 = r7.A0A
            java.lang.Object r0 = r0.get()
            X.4XH r0 = (X.AnonymousClass4XH) r0
            X.4ii r13 = r0.A01(r8)
        L_0x029e:
            X.5Ww r13 = (X.C106705Ww) r13
            goto L_0x019b
        L_0x02a2:
            X.00H r0 = r7.A09
            java.lang.Object r0 = r0.get()
            X.4ZU r0 = (X.AnonymousClass4ZU) r0
            X.4ih r13 = r0.A02(r8)
            goto L_0x029e
        L_0x02af:
            r0 = 2131898124(0x7f122f0c, float:1.9431157E38)
            goto L_0x02ba
        L_0x02b3:
            r0 = 2131898119(0x7f122f07, float:1.9431147E38)
            goto L_0x02ba
        L_0x02b7:
            r0 = 2131897734(0x7f122d86, float:1.9430366E38)
        L_0x02ba:
            X.6IR r0 = X.AnonymousClass3MX.A0t(r0)
            X.4ig r13 = new X.4ig
            r13.<init>(r0)
            goto L_0x029e
        L_0x02c4:
            X.00H r0 = r7.A09
            java.lang.Object r0 = r0.get()
            X.4ZU r0 = (X.AnonymousClass4ZU) r0
            X.4ih r13 = r0.A02(r8)
            goto L_0x019b
        L_0x02d2:
            boolean r0 = r9.Z$0
            r17 = r0
            java.lang.Object r14 = r9.L$6
            X.4ZN r14 = (X.AnonymousClass4ZN) r14
            java.lang.Object r2 = r9.L$5
            X.5Wv r2 = (X.C106695Wv) r2
            java.lang.Object r10 = r9.L$4
            X.5Wv r10 = (X.C106695Wv) r10
            java.lang.Object r12 = r9.L$3
            X.5Wv r12 = (X.C106695Wv) r12
            java.lang.Object r13 = r9.L$2
            X.5Ww r13 = (X.C106705Ww) r13
            java.lang.Object r8 = r9.L$1
            X.4Sa r8 = (X.C86534Sa) r8
            java.lang.Object r7 = r9.L$0
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase r7 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase) r7
            X.C30691eM.A01(r1)
        L_0x02f5:
            boolean r23 = X.AnonymousClass000.A1Y(r1)
            X.4ij r3 = new X.4ij
            r22 = r14
            r24 = r17
            r19 = r10
            r20 = r2
            r21 = r13
            r18 = r12
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00df
        L_0x030e:
            r3 = 0
            goto L_0x006d
        L_0x0311:
            com.whatsapp.voipcalling.CallState r0 = r8.A0B
            X.C18070vi.A0W(r0)
            r7.A02 = r0
            goto L_0x0037
        L_0x031a:
            X.4vG r9 = new X.4vG
            r9.<init>(r7, r3)
            goto L_0x001a
        L_0x0321:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase.A01(X.4Sa, X.1dr, boolean, boolean, boolean):java.lang.Object");
    }

    public MinimizedCallBannerUseCase(AnonymousClass4QQ r2, AnonymousClass1TD r3, AnonymousClass1TA r4, C18030ve r5, AnonymousClass1DC r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16) {
        C18070vi.A0w(r5, r6, r7, r8, r9);
        C18070vi.A0x(r10, r11, r12, r13, r14);
        AnonymousClass00H r0 = r16;
        C18070vi.A0y(r15, r0, r2, r3, r4);
        this.A06 = r5;
        this.A0C = r6;
        this.A0E = r7;
        this.A0H = r8;
        this.A0G = r9;
        this.A09 = r10;
        this.A0F = r11;
        this.A0D = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A07 = r15;
        this.A08 = r0;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }

    public static C93634jI A00(AnonymousClass00H r0) {
        return (C93634jI) ((MinimizedCallBannerUseCase) r0.get()).A07.get();
    }
}
