package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4aM  reason: invalid class name */
public final class AnonymousClass4aM {
    public int A00;
    public CallState A01 = CallState.NONE;
    public final C190979lp A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C18000vb A05;
    public final AnonymousClass1MW A06;
    public final VoipCameraManager A07;
    public final C18140vp A08;
    public final AnonymousClass11S A09;
    public final C143867Fc A0A;
    public final C108895cT A0B;

    public static final int A00(C86534Sa r3, AnonymousClass4aM r4, boolean z) {
        if (z) {
            return 0;
        }
        boolean z2 = r3.A0L;
        if (z2 && r3.A08 != null) {
            return 3;
        }
        CallState callState = r3.A0B;
        C18070vi.A0W(callState);
        if (AnonymousClass72U.A02(callState)) {
            return 0;
        }
        if (!C72463Mc.A1Z(r4.A08) || !z2) {
            return 2;
        }
        return 3;
    }

    public static final C87264Ux A02(AnonymousClass4D1 r8, float f, int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        AnonymousClass4T9 r2;
        if (i == 0) {
            return null;
        }
        if (i == 2) {
            z2 = false;
            r2 = new AnonymousClass4T9(AnonymousClass3MX.A0t(2131898165), AnonymousClass3MX.A0t(2131898164));
            z3 = !z;
            i2 = 2131232179;
        } else if (i != 3) {
            throw AnonymousClass000.A0k("CallScreenHeaderUseCase Invalid participant btn type");
        } else {
            z2 = false;
            r2 = new AnonymousClass4T9(AnonymousClass3MX.A0t(2131898189), AnonymousClass3MX.A0t(2131898188));
            i2 = 2131233313;
            z3 = true;
        }
        return new C87264Ux(r2, r8, f, i2, z3, z2);
    }

    public static final C87264Ux A01(C86534Sa r8) {
        AnonymousClass4D1 r4;
        CallState callState = r8.A0B;
        C18070vi.A0W(callState);
        if (!(callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY)) {
            if (r8.A0Q) {
                return null;
            }
            if (!(AnonymousClass72U.A03(callState) || callState == CallState.REJOINING || callState == CallState.ACCEPT_SENT || callState == CallState.RECEIVED_CALL)) {
                return null;
            }
        }
        boolean z = r8.A0G;
        int i = 2131233229;
        if (z) {
            i = 2131232030;
        }
        AnonymousClass4T9 r3 = new AnonymousClass4T9(AnonymousClass3MX.A0t(2131898204), AnonymousClass3MX.A0t(2131898203));
        if (z) {
            r4 = AnonymousClass4D1.NORMAL;
        } else {
            r4 = AnonymousClass4D1.LARGE;
        }
        return new C87264Ux(r3, r4, 0.0f, i, true, false);
    }

    public static final AnonymousClass4ZN A04(C86534Sa r4, AnonymousClass4aM r5) {
        UserJid userJid;
        String A0q;
        Collection values = r4.A06.values();
        ArrayList<C134216qE> A13 = AnonymousClass000.A13();
        for (Object next : values) {
            AnonymousClass3MZ.A1V(next, A13, ((C134216qE) next).A0M ? 1 : 0);
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C134216qE r0 : A13) {
            A0D.add(r0.A0A);
        }
        if (A0D.isEmpty()) {
            CallState callState = r4.A0B;
            C18070vi.A0W(callState);
            if (callState == CallState.LINK && (userJid = r4.A09) != null) {
                AnonymousClass11S r1 = r5.A09;
                if ((!r1.A0O(userJid) || (A0q = r1.A0D()) == null || AnonymousClass1YF.A0T(A0q)) && (A0q = AnonymousClass3MY.A0q(r5.A04, r5.A03.A0H(userJid))) == null) {
                    return null;
                }
                return new AnonymousClass482(A0q);
            }
        }
        return AnonymousClass74H.A04(r5.A03, r5.A04, A0D, 3, false, false);
    }

    public static final AnonymousClass6IR A05(AnonymousClass4ZN r2, boolean z) {
        if (r2 == null) {
            return null;
        }
        int i = 2131898153;
        if (z) {
            i = 2131898151;
        }
        return C1402670q.A02(AnonymousClass000.A1b(r2, 1), i);
    }

    public AnonymousClass4aM(AnonymousClass11S r2, C143867Fc r3, C190979lp r4, C108895cT r5, AnonymousClass1M9 r6, C24921Me r7, C18000vb r8, AnonymousClass1MW r9, VoipCameraManager voipCameraManager, C18140vp r11) {
        C18070vi.A0w(r2, r3, r6, r7, r8);
        C18070vi.A0x(voipCameraManager, r5, r9, r4, r11);
        this.A09 = r2;
        this.A0A = r3;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = voipCameraManager;
        this.A0B = r5;
        this.A06 = r9;
        this.A02 = r4;
        this.A08 = r11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (X.AnonymousClass72U.A02(r1) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e4, code lost:
        if (r2 != 17) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.LINK) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r9.A0E == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.PRECALLING) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (X.C72473Md.A1Z(r10.A08) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = 2131231177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r1 = 2131103225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r9.A0Q == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r1 = 2131103226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        return new X.AnonymousClass4UW(r3, r4, r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r0 = 2131232420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r11 != 0) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r11 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011e, code lost:
        if (r9.A0L != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r9.A0G != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0163, code lost:
        r1 = 2131887642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1 = r9.A0B;
        X.C18070vi.A0W(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4UW A03(X.C86534Sa r9, X.AnonymousClass4aM r10, int r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r4 = 0
            r3 = 0
            if (r15 == 0) goto L_0x004e
            r0 = 2131898113(0x7f122f01, float:1.9431135E38)
        L_0x0007:
            X.6IR r3 = X.AnonymousClass3MX.A0t(r0)
            if (r11 == 0) goto L_0x004a
        L_0x000d:
            r0 = 2
            if (r11 == r0) goto L_0x004a
            boolean r0 = r9.A0G
            if (r0 != 0) goto L_0x003a
            com.whatsapp.voipcalling.CallState r1 = r9.A0B
            X.C18070vi.A0W(r1)
            boolean r0 = X.AnonymousClass72U.A02(r1)
            if (r0 != 0) goto L_0x002b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x002b
            java.lang.String r0 = r9.A0E
            if (r0 == 0) goto L_0x003a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 != r0) goto L_0x003a
        L_0x002b:
            X.0vp r0 = r10.A08
            boolean r0 = X.C72473Md.A1Z(r0)
            if (r0 == 0) goto L_0x003a
            r0 = 2131231177(0x7f0801c9, float:1.8078428E38)
        L_0x0036:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x003a:
            boolean r0 = r9.A0Q
            r1 = 2131103225(0x7f060df9, float:1.781891E38)
            if (r0 == 0) goto L_0x0044
            r1 = 2131103226(0x7f060dfa, float:1.7818912E38)
        L_0x0044:
            X.4UW r0 = new X.4UW
            r0.<init>(r3, r4, r11, r1)
            return r0
        L_0x004a:
            r0 = 2131232420(0x7f0806a4, float:1.8080949E38)
            goto L_0x0036
        L_0x004e:
            if (r12 != 0) goto L_0x01c1
            if (r14 != 0) goto L_0x01c1
            if (r11 == 0) goto L_0x01bc
            r0 = 2
            if (r11 == r0) goto L_0x01bc
            com.whatsapp.voipcalling.CallState r2 = r9.A0B
            int r0 = r2.ordinal()
            r6 = 1
            switch(r0) {
                case 1: goto L_0x0119;
                case 2: goto L_0x0125;
                case 3: goto L_0x012f;
                case 4: goto L_0x012a;
                case 5: goto L_0x012a;
                case 6: goto L_0x0070;
                case 7: goto L_0x0061;
                case 8: goto L_0x012f;
                case 9: goto L_0x0163;
                case 10: goto L_0x0120;
                case 11: goto L_0x012f;
                default: goto L_0x0061;
            }
        L_0x0061:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallScreenHeaderUseCase/setSubtitleText string not set for call state: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0070:
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x00d3
            X.10w r5 = r9.A06
            java.util.Collection r1 = r5.values()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a5
            java.util.Iterator r2 = r1.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x0084
            int r0 = r1.A08
            if (r0 == r6) goto L_0x0084
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0084
            int r0 = r1.A03
            if (r0 == r6) goto L_0x0084
            r1 = 2131898096(0x7f122ef0, float:1.94311E38)
            goto L_0x01b6
        L_0x00a5:
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x00d3
            java.util.Collection r0 = r5.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6qE r0 = (X.C134216qE) r0
            boolean r0 = r0.A0M
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b1
        L_0x00c4:
            X.6qE r1 = (X.C134216qE) r1
            if (r1 == 0) goto L_0x00d3
            boolean r0 = r1.A0I
            if (r0 != r6) goto L_0x00d3
            r1 = 2131898275(0x7f122fa3, float:1.9431463E38)
            goto L_0x01b6
        L_0x00d1:
            r1 = 0
            goto L_0x00c4
        L_0x00d3:
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x00e4
            X.0vp r0 = r10.A08
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 != 0) goto L_0x00e4
            r1 = 2131898264(0x7f122f98, float:1.943144E38)
            goto L_0x01b6
        L_0x00e4:
            X.10w r0 = r9.A06
            X.C18070vi.A0W(r0)
            int r5 = X.C83594Fx.A00(r0)
            X.0vb r2 = r10.A05
            long r0 = r9.A05
            long r0 = X.C17880vN.A04(r0)
            java.lang.String r2 = X.C64052u8.A0D(r2, r4, r0)
            X.C18070vi.A0X(r2)
            r0 = 8
            if (r5 <= r0) goto L_0x0112
            r1 = 2131755036(0x7f10001c, float:1.914094E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1T(r0, r5, r3)
            r0[r6] = r2
            X.6IS r3 = X.C1402670q.A01(r0, r1, r5)
            goto L_0x000d
        L_0x0112:
            X.482 r3 = new X.482
            r3.<init>(r2)
            goto L_0x000d
        L_0x0119:
            boolean r0 = r9.A0L
            r1 = 2131898118(0x7f122f06, float:1.9431145E38)
            if (r0 == 0) goto L_0x01b6
        L_0x0120:
            r1 = 2131898234(0x7f122f7a, float:1.943138E38)
            goto L_0x01b6
        L_0x0125:
            r1 = 2131887637(0x7f120615, float:1.9409887E38)
            goto L_0x01b6
        L_0x012a:
            r1 = 2131898124(0x7f122f0c, float:1.9431157E38)
            goto L_0x01b6
        L_0x012f:
            X.0vp r0 = r10.A08
            boolean r0 = X.C72473Md.A1Z(r0)
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x0182
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x0167
            java.lang.String r0 = r9.A0D
            if (r0 == 0) goto L_0x0147
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 == 0) goto L_0x0163
        L_0x0147:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x01b3
            X.1EC r1 = r9.A08
            if (r1 == 0) goto L_0x01b3
            X.1MW r0 = r10.A06
            int r2 = r0.A09(r1)
            r1 = 2131755200(0x7f1000c0, float:1.9141273E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C17880vN.A1T(r0, r2, r3)
            X.6IS r3 = X.C1402670q.A01(r0, r1, r2)
            goto L_0x000d
        L_0x0163:
            r1 = 2131887642(0x7f12061a, float:1.9409897E38)
            goto L_0x01b6
        L_0x0167:
            X.9lp r2 = r10.A02
            X.1M9 r1 = r10.A03
            com.whatsapp.jid.UserJid r0 = r9.A0A
            if (r0 == 0) goto L_0x01fe
            X.1E7 r0 = r1.A0H(r0)
            X.4ZN r3 = r2.A00(r0)
            if (r3 != 0) goto L_0x000d
            java.lang.String r0 = "CallScreenHeaderUseCase No subtitle for for user"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2131887660(0x7f12062c, float:1.9409933E38)
            goto L_0x01b6
        L_0x0182:
            X.1EC r1 = r9.A08
            boolean r0 = r9.A0Q
            if (r1 == 0) goto L_0x01aa
            r7 = 2131890362(0x7f1210ba, float:1.9415414E38)
            if (r0 == 0) goto L_0x0190
            r7 = 2131890361(0x7f1210b9, float:1.9415412E38)
        L_0x0190:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            X.1Me r2 = r10.A04
            X.1M9 r1 = r10.A03
            com.whatsapp.jid.UserJid r0 = r9.A0A
            if (r0 == 0) goto L_0x0203
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r2, r0)
            r5[r3] = r0
            X.6IR r3 = X.C1402670q.A02(r5, r7)
            goto L_0x000d
        L_0x01aa:
            r1 = 2131891176(0x7f1213e8, float:1.9417065E38)
            if (r0 == 0) goto L_0x01b6
            r1 = 2131891167(0x7f1213df, float:1.9417046E38)
            goto L_0x01b6
        L_0x01b3:
            r1 = 2131890894(0x7f1212ce, float:1.9416493E38)
        L_0x01b6:
            X.6IR r3 = X.AnonymousClass3MX.A0t(r1)
            goto L_0x000d
        L_0x01bc:
            r0 = 2131899580(0x7f1234bc, float:1.943411E38)
            goto L_0x0007
        L_0x01c1:
            int r2 = r9.A01
            if (r13 != 0) goto L_0x01e6
            if (r14 != 0) goto L_0x01eb
            r0 = 2
            r1 = 2131898126(0x7f122f0e, float:1.943116E38)
            if (r2 == r0) goto L_0x01f2
            r0 = 4
            r1 = 2131898148(0x7f122f24, float:1.9431206E38)
            if (r2 == r0) goto L_0x01f2
            r0 = 5
            if (r2 == r0) goto L_0x01eb
            r0 = 9
            if (r2 == r0) goto L_0x01ef
            r0 = 10
            if (r2 == r0) goto L_0x01e7
            r0 = 16
            if (r2 == r0) goto L_0x01e7
            r0 = 17
            if (r2 == r0) goto L_0x01ef
        L_0x01e6:
            return r4
        L_0x01e7:
            r1 = 2131898113(0x7f122f01, float:1.9431135E38)
            goto L_0x01f2
        L_0x01eb:
            r1 = 2131887638(0x7f120616, float:1.9409889E38)
            goto L_0x01f2
        L_0x01ef:
            r1 = 2131898290(0x7f122fb2, float:1.9431494E38)
        L_0x01f2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x01e6
            int r0 = r0.intValue()
            goto L_0x0007
        L_0x01fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r8)
            throw r0
        L_0x0203:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aM.A03(X.4Sa, X.4aM, int, boolean, boolean, boolean, boolean):X.4UW");
    }
}
