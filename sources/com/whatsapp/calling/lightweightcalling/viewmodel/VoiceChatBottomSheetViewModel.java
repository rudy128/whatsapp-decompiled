package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1RW;
import X.AnonymousClass1TA;
import X.AnonymousClass1TB;
import X.AnonymousClass1V7;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3VX;
import X.AnonymousClass4ZN;
import X.C146427Pb;
import X.C175258yP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18600wl;
import X.C24671Lf;
import X.C24921Me;
import X.C40811vJ;
import X.C72203La;
import X.C76423nI;
import X.C76433nJ;
import X.C76443nK;
import X.C76453nL;
import X.C76463nM;
import X.C76473nN;
import X.C94174kA;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;

public final class VoiceChatBottomSheetViewModel extends AnonymousClass3VX implements C72203La {
    public A99 A00;
    public GroupJid A01;
    public AnonymousClass4ZN A02;
    public Integer A03 = AnonymousClass00R.A0C;
    public String A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass1E7 A07;
    public boolean A08;
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0L();
    public final AnonymousClass11S A0C;
    public final C175258yP A0D;
    public final AnonymousClass1VP A0E;
    public final AnonymousClass1M9 A0F;
    public final C24921Me A0G;
    public final AnonymousClass1TB A0H;
    public final AnonymousClass1MZ A0I;
    public final AnonymousClass1TA A0J;
    public final C18030ve A0K;
    public final AnonymousClass10I A0L;
    public final AnonymousClass00H A0M;
    public final C18600wl A0N;
    public final C18600wl A0O;
    public final C94174kA A0P;
    public final AnonymousClass1V7 A0Q;
    public final C24671Lf A0R;
    public final AnonymousClass1RW A0S;
    public volatile boolean A0T;

    public void A0S() {
        this.A0T = true;
        this.A0D.unregisterObserver(this);
        this.A0R.unregisterObserver(this.A0P);
        A04();
    }

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        this.A00 = a99;
        AnonymousClass3VX.A00(this.A0D, this);
    }

    public void C5G() {
        this.A00 = null;
    }

    public VoiceChatBottomSheetViewModel(AnonymousClass11S r18, C175258yP r19, AnonymousClass1VP r20, AnonymousClass1V7 r21, AnonymousClass1M9 r22, C24671Lf r23, C24921Me r24, AnonymousClass1RW r25, AnonymousClass1TB r26, AnonymousClass1MZ r27, AnonymousClass1TA r28, C18030ve r29, AnonymousClass10I r30, AnonymousClass00H r31, C18600wl r32, C18600wl r33) {
        AnonymousClass10I r5 = r30;
        C18030ve r0 = r29;
        AnonymousClass1TB r8 = r26;
        AnonymousClass1VP r14 = r20;
        AnonymousClass11S r16 = r18;
        C18070vi.A0w(r0, r16, r5, r14, r8);
        C24921Me r10 = r24;
        AnonymousClass1M9 r12 = r22;
        C24671Lf r11 = r23;
        AnonymousClass1V7 r13 = r21;
        C175258yP r15 = r19;
        C18070vi.A0x(r10, r15, r12, r11, r13);
        AnonymousClass00H r4 = r31;
        C18600wl r3 = r32;
        AnonymousClass1TA r6 = r28;
        AnonymousClass1MZ r7 = r27;
        AnonymousClass1RW r9 = r25;
        C18070vi.A0y(r6, r7, r4, r3, r9);
        C18600wl r2 = r33;
        C18070vi.A0d(r2, 16);
        this.A0K = r0;
        this.A0C = r16;
        this.A0L = r5;
        this.A0E = r14;
        this.A0H = r8;
        this.A0G = r10;
        this.A0D = r15;
        this.A0F = r12;
        this.A0R = r11;
        this.A0Q = r13;
        this.A0J = r6;
        this.A0I = r7;
        this.A0M = r4;
        this.A0O = r3;
        this.A0S = r9;
        this.A0N = r2;
        C94174kA r210 = new C94174kA(this, 1);
        this.A0P = r210;
        r15.registerObserver(this);
        r11.registerObserver(r210);
    }

    private final void A04() {
        if (this.A00 != null) {
            this.A0Q.A02(this);
            this.A00 = null;
            this.A04 = null;
            AnonymousClass3VX.A00(this.A0D, this);
            this.A01 = null;
            this.A0L.CGN(new C146427Pb(this, 24));
            this.A06 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fa, code lost:
        if (r6 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0125, code lost:
        if (r9 == X.AnonymousClass00R.A0C) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012f, code lost:
        if (r13 == false) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C86534Sa r19, com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r20) {
        /*
            r7 = r19
            com.whatsapp.voipcalling.CallState r6 = r7.A0B
            int r9 = r6.ordinal()
            r1 = 0
            switch(r9) {
                case 1: goto L_0x0093;
                case 2: goto L_0x0093;
                case 3: goto L_0x0093;
                case 4: goto L_0x0093;
                case 5: goto L_0x000c;
                case 6: goto L_0x0093;
                case 7: goto L_0x000c;
                case 8: goto L_0x0093;
                case 9: goto L_0x000c;
                case 10: goto L_0x0093;
                default: goto L_0x000c;
            }
        L_0x000c:
            r3 = 0
        L_0x000d:
            r4 = r20
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0027
            com.whatsapp.jid.GroupJid r5 = r4.A01
            if (r5 == 0) goto L_0x0091
            X.0ve r2 = r4.A0K
            X.1MZ r0 = r4.A0I
            int r0 = X.AnonymousClass3MW.A03(r0, r5)
            boolean r0 = X.C40811vJ.A0Z(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0091
        L_0x0027:
            r0 = 1
        L_0x0028:
            r4.A06 = r0
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x0036
            java.lang.String r0 = r7.A0C
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x0186
        L_0x0036:
            com.whatsapp.jid.GroupJid r2 = r4.A01
            if (r2 == 0) goto L_0x004a
            X.1EC r0 = r7.A08
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x004a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r6 != r0) goto L_0x0186
        L_0x004a:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x0186
            if (r3 == 0) goto L_0x0186
            java.lang.String r0 = r4.A04
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r7.A0C
            r4.A04 = r0
            X.8yP r0 = r4.A0D
            X.AnonymousClass3VX.A00(r0, r4)
        L_0x005d:
            X.A99 r0 = r4.A00
            if (r0 != 0) goto L_0x006a
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x006a
            X.1V7 r0 = r4.A0Q
            r0.A01(r4)
        L_0x006a:
            X.1EC r10 = r7.A08
            if (r10 == 0) goto L_0x018e
            X.10w r5 = r7.A06
            java.util.Collection r0 = r5.values()
            X.10e r0 = (X.C199310e) r0
            X.1IZ r8 = r0.iterator()
        L_0x007a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r8.next()
            X.C18070vi.A0X(r0)
            X.6qE r0 = (X.C134216qE) r0
            int r2 = r0.A04
            r0 = 1
            if (r2 != r0) goto L_0x007a
            int r1 = r1 + 1
            goto L_0x007a
        L_0x0091:
            r0 = 0
            goto L_0x0028
        L_0x0093:
            r3 = 1
            goto L_0x000d
        L_0x0096:
            X.1M9 r0 = r4.A0F
            X.1E7 r2 = r0.A0H(r10)
            X.A99 r0 = r4.A00
            if (r0 == 0) goto L_0x0183
            X.Adx r0 = r0.A0R
            X.C17960vV.A07(r0)
            int r8 = r0.A00
        L_0x00a7:
            X.6qE r0 = r7.A07
            if (r0 == 0) goto L_0x0180
            boolean r0 = r0.A0I
        L_0x00ad:
            r4.A08 = r0
            r0 = 1
            if (r9 == r0) goto L_0x0174
            r0 = 4
            if (r9 == r0) goto L_0x0168
            r0 = 10
            if (r9 == r0) goto L_0x015c
            X.1Me r0 = r4.A0G
            java.lang.String r0 = r0.A0I(r2)
            X.3nH r14 = new X.3nH
            r14.<init>(r1, r0)
        L_0x00c4:
            X.0ve r1 = r4.A0K
            X.0vf r9 = X.C18040vf.A01
            r0 = 7875(0x1ec3, float:1.1035E-41)
            boolean r13 = X.C18020vd.A05(r9, r1, r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 != r0) goto L_0x0146
            java.lang.Integer r9 = X.AnonymousClass00R.A01
        L_0x00d4:
            X.1DT r0 = r4.A0B
            boolean r12 = r4.A08
            X.A99 r10 = r4.A00
            if (r10 == 0) goto L_0x0144
            java.lang.String r11 = r7.A0C
            X.Adx r10 = r10.A0R
            X.C17960vV.A07(r10)
            boolean r10 = r10.A0F(r11)
        L_0x00e7:
            java.util.ArrayList r16 = A03(r4, r6, r8, r12, r10)
            int r8 = r5.size()
            boolean r7 = r7.A0O
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.ACTIVE
            r17 = 0
            if (r6 == r5) goto L_0x00fc
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r11 = 0
            if (r6 != r5) goto L_0x00fd
        L_0x00fc:
            r11 = 1
        L_0x00fd:
            r5 = 6359(0x18d7, float:8.911E-42)
            X.0vf r10 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r10, r1, r5)
            r5 = 5241(0x1479, float:7.344E-42)
            int r5 = X.C18020vd.A00(r10, r1, r5)
            r1 = 0
            if (r8 > r5) goto L_0x010f
            r1 = 1
        L_0x010f:
            if (r11 == 0) goto L_0x0119
            if (r1 == 0) goto L_0x0119
            if (r7 == 0) goto L_0x0117
            if (r6 == 0) goto L_0x0119
        L_0x0117:
            r17 = 1
        L_0x0119:
            java.lang.String r1 = r4.A04
            boolean r18 = X.AnonymousClass000.A1X(r1)
            if (r13 == 0) goto L_0x0127
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r19 = 0
            if (r9 != r1) goto L_0x0129
        L_0x0127:
            r19 = 1
        L_0x0129:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r9 != r1) goto L_0x0131
            r20 = 1
            if (r13 != 0) goto L_0x0133
        L_0x0131:
            r20 = 0
        L_0x0133:
            r15 = 0
            X.4VB r13 = new X.4VB
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0.A0E(r13)
            X.1DT r0 = r4.A0A
            X.AnonymousClass3MY.A1M(r0, r3)
            r4.A07 = r2
            return
        L_0x0144:
            r10 = 0
            goto L_0x00e7
        L_0x0146:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r6 == r0) goto L_0x014e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r6 != r0) goto L_0x0158
        L_0x014e:
            boolean r0 = X.C40811vJ.A0X(r1)
            if (r0 == 0) goto L_0x0158
            java.lang.Integer r9 = X.AnonymousClass00R.A00
            goto L_0x00d4
        L_0x0158:
            java.lang.Integer r9 = X.AnonymousClass00R.A0C
            goto L_0x00d4
        L_0x015c:
            X.0ve r1 = r4.A0K
            r0 = 2131897734(0x7f122d86, float:1.9430366E38)
            X.3nF r14 = new X.3nF
            r14.<init>(r1, r0)
            goto L_0x00c4
        L_0x0168:
            X.0ve r1 = r4.A0K
            r0 = 2131891541(0x7f121555, float:1.9417805E38)
            X.3nD r14 = new X.3nD
            r14.<init>(r1, r0)
            goto L_0x00c4
        L_0x0174:
            X.0ve r1 = r4.A0K
            r0 = 2131896302(0x7f1227ee, float:1.9427461E38)
            X.3nE r14 = new X.3nE
            r14.<init>(r1, r0)
            goto L_0x00c4
        L_0x0180:
            r0 = 0
            goto L_0x00ad
        L_0x0183:
            r8 = 0
            goto L_0x00a7
        L_0x0186:
            X.1DT r0 = r4.A0A
            X.AnonymousClass3MY.A1M(r0, r1)
            r4.A04()
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel.A05(X.4Sa, com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel):void");
    }

    public static final ArrayList A03(VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, CallState callState, int i, boolean z, boolean z2) {
        Integer num;
        boolean z3;
        ArrayList A13 = AnonymousClass000.A13();
        if (callState == CallState.NONE) {
            num = AnonymousClass00R.A01;
        } else if ((callState == CallState.REJOINING || callState == CallState.RECEIVED_CALL) && C40811vJ.A0X(voiceChatBottomSheetViewModel.A0K)) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A0C;
        }
        voiceChatBottomSheetViewModel.A03 = num;
        C18030ve r5 = voiceChatBottomSheetViewModel.A0K;
        boolean A052 = C18020vd.A05(C18040vf.A01, r5, 7875);
        boolean z4 = false;
        Integer num2 = voiceChatBottomSheetViewModel.A03;
        if (!A052 ? num2 != AnonymousClass00R.A01 || C18020vd.A00(C18040vf.A02, r5, 5429) >= 3 : num2 == AnonymousClass00R.A0C) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (voiceChatBottomSheetViewModel.A03.intValue() == 1) {
            z = voiceChatBottomSheetViewModel.A05;
        }
        A13.add(new C76463nM(z, z3));
        boolean A1T = AnonymousClass000.A1T(i, 1);
        Integer num3 = voiceChatBottomSheetViewModel.A03;
        Integer num4 = AnonymousClass00R.A0C;
        A13.add(new C76443nK(A1T, AnonymousClass000.A1Z(num3, num4)));
        A13.add(new C76453nL(AnonymousClass000.A1Z(voiceChatBottomSheetViewModel.A03, num4), z2, AnonymousClass000.A1T(i, 3)));
        A13.add(new C76433nJ(AnonymousClass000.A1Z(voiceChatBottomSheetViewModel.A03, AnonymousClass00R.A01)));
        A13.add(new C76473nN(z, AnonymousClass000.A1Z(voiceChatBottomSheetViewModel.A03, AnonymousClass00R.A00)));
        if (voiceChatBottomSheetViewModel.A03 == num4) {
            z4 = true;
        }
        A13.add(new C76423nI(z4));
        return A13;
    }
}
