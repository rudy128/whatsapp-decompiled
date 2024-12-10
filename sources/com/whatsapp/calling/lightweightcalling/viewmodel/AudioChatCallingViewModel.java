package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.A99;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1DT;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OB;
import X.AnonymousClass1V7;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3VX;
import X.AnonymousClass4R3;
import X.C107215Yv;
import X.C175258yP;
import X.C18030ve;
import X.C18070vi;
import X.C24921Me;
import X.C30391dr;
import X.C41561wd;
import X.C72203La;
import X.C76493nP;
import X.C76513nR;
import X.C84714Ko;
import X.C93654jK;
import android.os.PowerManager;
import com.whatsapp.jid.UserJid;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class AudioChatCallingViewModel extends AnonymousClass3VX implements C72203La {
    public C84714Ko A00 = C76513nR.A00;
    public A99 A01;
    public AnonymousClass4R3 A02;
    public UserJid A03;
    public Integer A04;
    public String A05;
    public Set A06;
    public AnonymousClass1OB A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public PowerManager.WakeLock A0C;
    public boolean A0D;
    public final AnonymousClass1DT A0E = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0F = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0G = AnonymousClass3MW.A0L();
    public final AnonymousClass190 A0H;
    public final AnonymousClass11S A0I;
    public final C175258yP A0J;
    public final AnonymousClass1V9 A0K;
    public final AnonymousClass1V7 A0L;
    public final C107215Yv A0M = new C93654jK(this, 0);
    public final AnonymousClass1M9 A0N;
    public final C24921Me A0O;
    public final AnonymousClass11C A0P;
    public final AnonymousClass1MZ A0Q;
    public final C18030ve A0R;

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        this.A01 = a99;
        Integer num = this.A04;
        if (num != null) {
            a99.A0j(num.intValue());
        }
    }

    public void C5G() {
        this.A01 = null;
    }

    public static final void A04(AudioChatCallingViewModel audioChatCallingViewModel) {
        A99 a99 = audioChatCallingViewModel.A01;
        if (a99 != null) {
            a99.A0j(8);
            audioChatCallingViewModel.A0L.A02(audioChatCallingViewModel);
            audioChatCallingViewModel.A01 = null;
        }
        AnonymousClass4R3 r0 = audioChatCallingViewModel.A02;
        if (r0 != null) {
            r0.A00((C107215Yv) null);
        }
        A06(audioChatCallingViewModel, false);
    }

    public static final void A05(AudioChatCallingViewModel audioChatCallingViewModel, C84714Ko r4) {
        if ((r4 instanceof C76493nP) && !C18070vi.A18(r4, audioChatCallingViewModel.A00)) {
            AnonymousClass1OB r0 = audioChatCallingViewModel.A07;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            audioChatCallingViewModel.A07 = AnonymousClass3MY.A0s(new AudioChatCallingViewModel$restartSubtitleTimer$1(audioChatCallingViewModel, (C30391dr) null), C41561wd.A00(audioChatCallingViewModel));
        }
        audioChatCallingViewModel.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r4, boolean r5) {
        /*
            boolean r0 = r4.A0D
            if (r0 == r5) goto L_0x0027
            r4.A0D = r5
            r3 = 1
            android.os.PowerManager$WakeLock r0 = r4.A0C
            if (r5 == 0) goto L_0x0032
            if (r0 != 0) goto L_0x0021
            X.11C r0 = r4.A0P
            android.os.PowerManager r2 = r0.A0G()
            if (r2 == 0) goto L_0x0030
            r1 = 32
            java.lang.String r0 = "AudioChatCallingViewModel"
            android.os.PowerManager$WakeLock r0 = X.C181789Rv.A00(r2, r0, r1)
        L_0x001d:
            r4.A0C = r0
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            android.os.PowerManager$WakeLock r0 = r4.A0C
            if (r0 == 0) goto L_0x0027
            r0.acquire()
            return
        L_0x0030:
            r0 = 0
            goto L_0x001d
        L_0x0032:
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0027
            android.os.PowerManager$WakeLock r0 = r4.A0C
            if (r0 == 0) goto L_0x0027
            r0.release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A06(com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel, boolean):void");
    }

    public void A0S() {
        this.A0J.unregisterObserver(this);
        A04(this);
    }

    public AudioChatCallingViewModel(AnonymousClass190 r3, AnonymousClass11S r4, C175258yP r5, AnonymousClass1V9 r6, AnonymousClass1V7 r7, AnonymousClass1M9 r8, C24921Me r9, AnonymousClass11C r10, AnonymousClass1MZ r11, C18030ve r12) {
        C18070vi.A0w(r12, r7, r5, r3, r4);
        C18070vi.A0x(r9, r8, r11, r10, r6);
        this.A0R = r12;
        this.A0L = r7;
        this.A0J = r5;
        this.A0H = r3;
        this.A0I = r4;
        this.A0O = r9;
        this.A0N = r8;
        this.A0Q = r11;
        this.A0P = r10;
        this.A0K = r6;
        r5.registerObserver(this);
        AnonymousClass3VX.A00(r5, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.1BI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.1BI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.1BI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: X.1BI} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        if ((X.C18020vd.A00(X.C18040vf.A02, r4.A0R, 5091) & 64) <= 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0136, code lost:
        if (r5 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0138;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C86534Sa r19, com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r20) {
        /*
            java.util.LinkedHashSet r3 = X.C17880vN.A14()
            r6 = r19
            X.10w r8 = r6.A06
            java.util.Collection r0 = r8.values()
            X.10e r0 = (X.C199310e) r0
            X.1IZ r5 = r0.iterator()
            r9 = 0
            r7 = r9
        L_0x0014:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x003b
            java.lang.Object r4 = r5.next()
            X.C18070vi.A0X(r4)
            X.6qE r4 = (X.C134216qE) r4
            int r1 = r4.A04
            r0 = 1
            if (r1 != r0) goto L_0x0014
            if (r7 == 0) goto L_0x002d
            int r2 = r7.A00
        L_0x002d:
            int r0 = r4.A00
            if (r2 >= r0) goto L_0x0032
            r7 = r4
        L_0x0032:
            com.whatsapp.jid.UserJid r0 = r4.A0A
            X.C18070vi.A0X(r0)
            r3.add(r0)
            goto L_0x0014
        L_0x003b:
            r4 = r20
            com.whatsapp.jid.UserJid r1 = r4.A03
            com.whatsapp.voipcalling.CallState r5 = r6.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 == r0) goto L_0x0049
            if (r7 == 0) goto L_0x0049
            com.whatsapp.jid.UserJid r9 = r7.A0A
        L_0x0049:
            r4.A03 = r9
            X.1DT r7 = r4.A0F
            boolean r0 = r4.A0A
            r14 = 1
            if (r0 == 0) goto L_0x01eb
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x01eb
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r5 != r0) goto L_0x0066
            X.0ve r0 = r4.A0R
            boolean r0 = X.C40811vJ.A0X(r0)
            if (r0 != 0) goto L_0x01eb
        L_0x0066:
            r0 = 1
        L_0x0067:
            X.AnonymousClass3MY.A1L(r7, r0)
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0120
            X.3nR r9 = X.C76513nR.A00
        L_0x0070:
            A05(r4, r9)
            X.1DT r7 = r4.A0G
            X.C18070vi.A0W(r5)
            com.whatsapp.jid.UserJid r8 = r4.A03
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r0) goto L_0x00e3
            r0 = 2131898234(0x7f122f7a, float:1.943138E38)
        L_0x0081:
            X.6IR r11 = X.AnonymousClass3MX.A0t(r0)
        L_0x0085:
            X.1EC r9 = r6.A08
            com.whatsapp.jid.UserJid r8 = r4.A03
            r13 = 0
            if (r8 == 0) goto L_0x009c
            if (r9 == 0) goto L_0x00e1
            X.1MZ r0 = r4.A0Q
            X.2sr r0 = r0.A06(r9, r8)
            if (r0 == 0) goto L_0x00e1
            int r0 = r0.A00
        L_0x0098:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x009c:
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r0 != 0) goto L_0x00a1
            r14 = 0
        L_0x00a1:
            X.4Ko r0 = r4.A00
            X.4ZN r12 = r0.A00
            X.6qE r0 = r6.A07
            if (r0 == 0) goto L_0x00df
            boolean r15 = r0.A0I
        L_0x00ab:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 == r0) goto L_0x00b3
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r5 != r0) goto L_0x00c3
        L_0x00b3:
            X.0ve r6 = r4.A0R
            r5 = 5091(0x13e3, float:7.134E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r6, r5)
            r0 = r0 & 64
            r16 = 1
            if (r0 > 0) goto L_0x00c5
        L_0x00c3:
            r16 = 0
        L_0x00c5:
            X.4Uy r10 = new X.4Uy
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r7.A0F(r10)
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00dc
        L_0x00d7:
            X.1DT r0 = r4.A0E
            X.AnonymousClass3MX.A1J(r0, r2)
        L_0x00dc:
            r4.A06 = r3
            return
        L_0x00df:
            r15 = 0
            goto L_0x00ab
        L_0x00e1:
            r0 = -1
            goto L_0x0098
        L_0x00e3:
            if (r8 == 0) goto L_0x011b
            X.11S r0 = r4.A0I
            boolean r0 = r0.A0O(r8)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            goto L_0x0081
        L_0x00f1:
            X.1M9 r0 = r4.A0N
            X.1E7 r9 = r0.A0H(r8)
            boolean r0 = r9.A0B()
            if (r0 != 0) goto L_0x0114
            X.1Me r8 = r4.A0O
            boolean r0 = X.C24921Me.A06(r9)
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = X.AnonymousClass3MX.A17(r8, r9)
        L_0x0109:
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = ""
        L_0x010d:
            X.482 r11 = new X.482
            r11.<init>(r0)
            goto L_0x0085
        L_0x0114:
            X.1Me r0 = r4.A0O
            java.lang.String r0 = r0.A0I(r9)
            goto L_0x0109
        L_0x011b:
            r0 = 2131898041(0x7f122eb9, float:1.9430989E38)
            goto L_0x0081
        L_0x0120:
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 == r7) goto L_0x012c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 == r0) goto L_0x012c
            X.3nQ r9 = X.C76503nQ.A00
            goto L_0x0070
        L_0x012c:
            java.util.Set r10 = r4.A06
            r9 = 0
            if (r10 == 0) goto L_0x018e
            if (r5 == r7) goto L_0x0138
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r7 = 1
            if (r5 != r0) goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x018e
            if (r7 != 0) goto L_0x018e
            X.4Ko r7 = r4.A00
            boolean r0 = r7 instanceof X.C76493nP
            if (r0 == 0) goto L_0x018c
            X.3nP r7 = (X.C76493nP) r7
            if (r7 == 0) goto L_0x018c
            X.1E7 r7 = r7.A00
        L_0x014d:
            java.util.Iterator r13 = r3.iterator()
        L_0x0151:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r12 = r13.next()
            r11 = r12
            X.1BI r11 = (X.AnonymousClass1BI) r11
            if (r7 == 0) goto L_0x018a
            X.1BI r0 = r7.A0J
        L_0x0162:
            boolean r0 = X.C18070vi.A18(r0, r11)
            if (r0 != 0) goto L_0x0151
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x0151
            X.11S r0 = r4.A0I
            boolean r0 = r0.A0O(r11)
            if (r0 != 0) goto L_0x0151
            r9 = r12
        L_0x0177:
            X.1BI r9 = (X.AnonymousClass1BI) r9
            if (r9 == 0) goto L_0x018e
            X.1M9 r0 = r4.A0N
            X.1E7 r7 = r0.A0H(r9)
            X.1Me r0 = r4.A0O
            X.3nP r9 = new X.3nP
            r9.<init>(r0, r7)
            goto L_0x0070
        L_0x018a:
            r0 = r9
            goto L_0x0162
        L_0x018c:
            r7 = r9
            goto L_0x014d
        L_0x018e:
            X.4Ko r9 = r4.A00
            boolean r0 = r9 instanceof X.C76493nP
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x019c
            X.3nS r9 = X.C76523nS.A00
            goto L_0x0070
        L_0x019c:
            X.1EC r7 = r6.A08
            if (r7 == 0) goto L_0x01c7
            X.1M9 r0 = r4.A0N
            X.1E7 r10 = r0.A0H(r7)
            int r9 = r3.size()
            X.1Me r0 = r4.A0O
            r8 = 2131755492(0x7f1001e4, float:1.9141865E38)
            java.lang.Object[] r7 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r0.A0I(r10)
        L_0x01b7:
            r7[r2] = r0
            X.C17880vN.A1T(r7, r9, r14)
            X.6IS r0 = X.C1402670q.A01(r7, r8, r9)
            X.3nO r9 = new X.3nO
            r9.<init>(r0)
            goto L_0x0070
        L_0x01c7:
            java.util.Set r0 = r8.keySet()
            java.util.List r17 = X.C29431cG.A0t(r0)
            int r9 = r3.size()
            X.1Me r0 = r4.A0O
            X.1M9 r15 = r4.A0N
            r8 = 2131755492(0x7f1001e4, float:1.9141865E38)
            java.lang.Object[] r7 = X.AnonymousClass3MW.A1b()
            r18 = 3
            r20 = r2
            r19 = r2
            r16 = r0
            X.4ZN r0 = X.AnonymousClass74H.A04(r15, r16, r17, r18, r19, r20)
            goto L_0x01b7
        L_0x01eb:
            r0 = 0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A03(X.4Sa, com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel):void");
    }
}
