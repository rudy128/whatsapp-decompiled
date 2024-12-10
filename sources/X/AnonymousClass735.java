package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.735  reason: invalid class name */
public final class AnonymousClass735 {
    public static final List A0I;
    public static final long A0J = TimeUnit.DAYS.toMillis(7);
    public View A00;
    public View A01;
    public AnonymousClass1OB A02;
    public boolean A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1VE A05;
    public final AnonymousClass1VF A06;
    public final AnonymousClass1V9 A07;
    public final AnonymousClass4ZV A08;
    public final AnonymousClass11P A09;
    public final C18030ve A0A;
    public final C41111vp A0B;
    public final Map A0C;
    public final AnonymousClass1OX A0D;
    public final boolean A0E;
    public final C22851Dl A0F;
    public final AnonymousClass1DC A0G;
    public final boolean A0H;

    static {
        AnonymousClass6RC[] r2 = new AnonymousClass6RC[5];
        r2[0] = AnonymousClass6RC.SCREEN_SHARING;
        r2[1] = AnonymousClass6RC.MORE_MENU;
        r2[2] = AnonymousClass6RC.ADD_PARTICIPANTS;
        r2[3] = AnonymousClass6RC.AR_EFFECTS;
        A0I = C18070vi.A0O(AnonymousClass6RC.AR_EFFECTS_PIP, r2, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005e, code lost:
        if (r6 != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass735(android.content.Context r24, X.AnonymousClass1F9 r25, X.AnonymousClass1VE r26, X.AnonymousClass1VF r27, X.AnonymousClass1V9 r28, X.AnonymousClass11C r29, X.AnonymousClass11P r30, X.C18000vb r31, X.C18030ve r32, X.AnonymousClass1DC r33, X.AnonymousClass1OX r34, boolean r35) {
        /*
            r23 = this;
            r2 = 1
            r9 = 2
            r8 = 3
            r5 = r29
            X.C18070vi.A0d(r5, r8)
            r7 = 4
            r4 = r31
            X.C18070vi.A0d(r4, r7)
            r12 = 5
            r0 = r30
            r6 = r32
            X.C108965cb.A1O(r0, r12, r6)
            r10 = r26
            r1 = r33
            X.C72473Md.A1K(r1, r10)
            r13 = r27
            r11 = r28
            X.C72473Md.A1L(r13, r11)
            r3 = r23
            r3.<init>()
            r3.A09 = r0
            r3.A0A = r6
            r0 = r35
            r3.A0H = r0
            r0 = r34
            r3.A0D = r0
            r3.A0G = r1
            r3.A05 = r10
            r3.A06 = r13
            r3.A07 = r11
            r1 = 6399(0x18ff, float:8.967E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r0, r6, r1)
            r3.A0E = r6
            long r13 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r10)
            java.lang.String r0 = "tooltip_last_shown_ms"
            long r0 = X.C17890vO.A05(r1, r0)
            long r13 = r13 - r0
            long r10 = A0J
            r15 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            r0 = 0
            if (r6 == 0) goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            r3.A03 = r0
            X.1D6[] r6 = new X.AnonymousClass1D6[r12]
            X.6RC r1 = X.AnonymousClass6RC.SCREEN_SHARING
            X.7iV r0 = new X.7iV
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            X.AnonymousClass1D6.A03(r1, r0, r6, r15)
            X.6RC r1 = X.AnonymousClass6RC.MORE_MENU
            X.7iW r0 = new X.7iW
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            X.AnonymousClass1D6.A03(r1, r0, r6, r2)
            X.6RC r1 = X.AnonymousClass6RC.AR_EFFECTS
            X.7iX r0 = new X.7iX
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            X.AnonymousClass1D6.A03(r1, r0, r6, r9)
            X.6RC r1 = X.AnonymousClass6RC.AR_EFFECTS_PIP
            X.7iY r0 = new X.7iY
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            X.AnonymousClass1D6.A03(r1, r0, r6, r8)
            X.6RC r1 = X.AnonymousClass6RC.ADD_PARTICIPANTS
            X.7iZ r0 = new X.7iZ
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            X.AnonymousClass1D6.A03(r1, r0, r6, r7)
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r6)
            r3.A0C = r0
            X.4ZV r0 = new X.4ZV
            r1 = r24
            r0.<init>(r1, r5, r4)
            r3.A08 = r0
            X.72C r14 = new X.72C
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r16 = r15
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.1vp r2 = X.AnonymousClass3MW.A0n(r14)
            r3.A0B = r2
            X.1DT r0 = X.C108945cZ.A0S()
            r3.A04 = r0
            r1 = 43
            X.7AN r0 = new X.7AN
            r0.<init>(r3, r1)
            r3.A0F = r0
            r1 = r25
            r2.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass735.<init>(android.content.Context, X.1F9, X.1VE, X.1VF, X.1V9, X.11C, X.11P, X.0vb, X.0ve, X.1DC, X.1OX, boolean):void");
    }

    public static final void A01(AnonymousClass735 r1, AnonymousClass72C r2) {
        if (r1.A03) {
            C41111vp r12 = r1.A0B;
            if (!C108965cb.A1W(r12, r2)) {
                r12.A0F(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r5 = true;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r12.isSelfRequestingUpgrade() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r7 != r1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r12.isSelfRequestingUpgrade() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = r12.self;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r0.A08 != 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r2 = r12.videoEnabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r2 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r7 != r1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r11.A0H != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r1 = (X.AnonymousClass72C) r11.A0B.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r8 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r6 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r11.A0H == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r5 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r4 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005e, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        if (r2 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0061, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        if (r3 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0064, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
        if (r2 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r3 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        A01(r11, new X.AnonymousClass72C(r1.A00, r1.A06, r1.A01, r6, r7, r8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007f, code lost:
        if (r7 == r1) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.A08 == 1) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.whatsapp.voipcalling.CallInfo r12) {
        /*
            r11 = this;
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0078
            X.0ve r1 = r11.A0A
            X.1DC r0 = r11.A0G
            boolean r8 = X.AnonymousClass74H.A0B(r1, r0, r12)
            com.whatsapp.voipcalling.CallState r7 = r12.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 != r1) goto L_0x007d
            boolean r0 = r12.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x007d
            X.6qE r0 = r12.self
            if (r0 == 0) goto L_0x007d
            int r0 = r0.A08
            r6 = 1
            if (r0 != r6) goto L_0x007d
        L_0x0021:
            r5 = 1
            boolean r0 = r12.isSelfRequestingUpgrade()
            r4 = 1
            if (r0 == 0) goto L_0x002c
        L_0x0029:
            r4 = 0
            if (r7 != r1) goto L_0x007b
        L_0x002c:
            boolean r0 = r12.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x007b
            X.6qE r0 = r12.self
            if (r0 == 0) goto L_0x007b
            int r0 = r0.A08
            r3 = 1
            if (r0 != r3) goto L_0x007b
        L_0x003b:
            boolean r2 = r12.videoEnabled
            if (r2 == 0) goto L_0x0046
            if (r7 != r1) goto L_0x0046
            boolean r0 = r11.A0H
            r7 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            X.1vp r0 = r11.A0B
            java.lang.Object r1 = r0.A06()
            X.72C r1 = (X.AnonymousClass72C) r1
            if (r8 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0058
            boolean r0 = r11.A0H
            r6 = 1
            if (r0 == 0) goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r8 = 1
            if (r4 != 0) goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r9 = 1
            if (r3 != 0) goto L_0x0069
        L_0x0064:
            r9 = 0
            if (r2 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
        L_0x0069:
            r10 = 1
        L_0x006a:
            boolean r4 = r1.A06
            int r3 = r1.A00
            boolean r5 = r1.A01
            X.72C r2 = new X.72C
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            A01(r11, r2)
        L_0x0078:
            return
        L_0x0079:
            r10 = 0
            goto L_0x006a
        L_0x007b:
            r3 = 0
            goto L_0x003b
        L_0x007d:
            r6 = 0
            r5 = 0
            if (r7 != r1) goto L_0x0029
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass735.A02(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A03(boolean z) {
        if (this.A03) {
            AnonymousClass72C r2 = (AnonymousClass72C) this.A0B.A06();
            AnonymousClass72C.A00(this, r2, r2.A00, r2.A06, z);
        }
    }

    public static final View A00(AnonymousClass735 r2, C87294Va r3) {
        if (r3.A06().intValue() != 0) {
            return r2.A00;
        }
        return r2.A01;
    }
}
