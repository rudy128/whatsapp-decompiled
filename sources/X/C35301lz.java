package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1lz  reason: invalid class name and case insensitive filesystem */
public final class C35301lz {
    public final AnonymousClass190 A00;
    public final C32591hR A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass120 A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass1M9 A05;
    public final C26191Re A06;
    public final AnonymousClass11Q A07;
    public final AnonymousClass1P3 A08;
    public final C25571Os A09;
    public final AnonymousClass1CJ A0A;
    public final AnonymousClass122 A0B;
    public final C32481hG A0C;
    public final AnonymousClass1MZ A0D;
    public final C24661Le A0E;
    public final AnonymousClass1RK A0F;
    public final AnonymousClass1U5 A0G;
    public final AnonymousClass1MR A0H;
    public final C18030ve A0I;
    public final AnonymousClass126 A0J;
    public final C35241lt A0K;
    public final C35291ly A0L;
    public final AnonymousClass1N9 A0M;
    public final C35211lq A0N;
    public final AnonymousClass1N7 A0O;
    public final AnonymousClass1PT A0P;
    public final AnonymousClass10I A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AtomicInteger A0Z = new AtomicInteger();
    public final AtomicInteger A0a = new AtomicInteger();
    public final AnonymousClass11P A0b;
    public final AnonymousClass18K A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if (r1.A01((com.whatsapp.jid.UserJid) r2) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass2HL r4, X.C63362sw r5, X.C35301lz r6) {
        /*
            X.00H r0 = r6.A0X
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A02(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0E = r0
            X.1PT r3 = r6.A0P
            X.1BI r2 = r5.A03()
            com.whatsapp.jid.UserJid r1 = r5.A05()
            r0 = 0
            boolean r0 = r3.A0K(r2, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02 = r0
            java.lang.Boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0037
            X.18K r0 = r6.A0c
            r0.CC7(r4)
            return
        L_0x0037:
            X.1BI r2 = r5.A03()
            X.00H r0 = r6.A0V
            java.lang.Object r1 = r0.get()
            X.12B r1 = (X.AnonymousClass12B) r1
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0057
            X.00H r0 = r1.A01
            r0.get()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r1 = r1.A01(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            X.18K r2 = r6.A0c
            r1 = 1
            X.0vt r0 = new X.0vt
            r0.<init>(r1, r1)
            r2.CC0(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35301lz.A01(X.2HL, X.2sw, X.1lz):void");
    }

    public static boolean A02(C63362sw r4, C35301lz r5) {
        AnonymousClass11P r2 = r5.A0b;
        C18070vi.A0d(r2, 0);
        if (C22971Dz.A0a(r4.A0Z) && r4.A0X + 86400000 < AnonymousClass11P.A01(r2)) {
            if (!C18020vd.A05(C18040vf.A02, r5.A0I, 5547)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r5 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.A4S r6, X.AnonymousClass2HL r7, X.C173578vJ r8, X.C63362sw r9, X.C35301lz r10, boolean r11) {
        /*
            boolean r5 = A02(r9, r10)
            if (r6 == 0) goto L_0x00ea
            int r4 = r6.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DecryptMessageRunnable/handleDecryptionResult axolotl status="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " key="
            r1.append(r0)
            X.205 r0 = r9.A0B
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x00ea
            r2 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.A00 = r0
            if (r8 == 0) goto L_0x0033
            r8.A03 = r2
        L_0x0033:
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            if (r4 == r1) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass1PT.A01(r4)
            r7.A08 = r0
        L_0x003d:
            boolean r0 = r6.A01()
            r3 = 1
            if (r0 == 0) goto L_0x0070
            r9.A0U = r3
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            r1 = 1
            if (r4 == r0) goto L_0x005d
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            r1 = 4
            if (r4 == r0) goto L_0x005d
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            r1 = 3
            if (r4 == r0) goto L_0x005d
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r4 == r0) goto L_0x006e
            switch(r4) {
                case -1206: goto L_0x006e;
                case -1205: goto L_0x006b;
                case -1204: goto L_0x0068;
                case -1203: goto L_0x0065;
                case -1202: goto L_0x0062;
                default: goto L_0x005c;
            }
        L_0x005c:
            r1 = 0
        L_0x005d:
            r9.A02 = r1
        L_0x005f:
            if (r11 == 0) goto L_0x00e9
            return r3
        L_0x0062:
            r1 = 10
            goto L_0x005d
        L_0x0065:
            r1 = 11
            goto L_0x005d
        L_0x0068:
            r1 = 12
            goto L_0x005d
        L_0x006b:
            r1 = 13
            goto L_0x005d
        L_0x006e:
            r1 = 2
            goto L_0x005d
        L_0x0070:
            r0 = -1006(0xfffffffffffffc12, float:NaN)
            if (r4 == r0) goto L_0x009f
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r4 == r0) goto L_0x009f
            if (r4 != r1) goto L_0x009c
            if (r11 != 0) goto L_0x00ea
            boolean r0 = r9.A0U
            if (r0 != 0) goto L_0x009c
            java.lang.Integer r0 = r9.A0I
            if (r0 == 0) goto L_0x00db
            X.00H r0 = r10.A0W
            java.lang.Object r1 = r0.get()
            X.1ft r1 = (X.C31641ft) r1
            java.lang.Integer r0 = r9.A0I
            int r3 = r0.intValue()
            X.0vl r0 = r1.A03
            java.lang.Object r2 = r0.getValue()
            X.2q7 r2 = (X.C61702q7) r2
            monitor-enter(r2)
            goto L_0x00a5
        L_0x009c:
            if (r5 == 0) goto L_0x00e9
            goto L_0x005f
        L_0x009f:
            X.1N9 r0 = r10.A0M
            r0.A0D(r9)
            goto L_0x005f
        L_0x00a5:
            java.util.LinkedHashSet r1 = r2.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00d8 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x00db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DecryptMessageRunnable/maybeLogMessageDropEventAndSendAck logging DUPLICATE_MESSAGE and sending receipt using cache id="
            r1.append(r0)
            java.lang.String r0 = r9.A0h
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1PT r1 = r10.A0P
            r0 = 15
            r2 = 0
            r1.A0I(r9, r2, r0)
            X.1N9 r1 = r10.A0M
            java.lang.String r0 = "duplicate"
            r1.A0F(r9, r0, r2)
            goto L_0x00e7
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00db:
            X.10I r2 = r10.A0Q
            r1 = 49
            X.Ak0 r0 = new X.Ak0
            r0.<init>(r10, r9, r1)
            r2.CGF(r0)
        L_0x00e7:
            r0 = 2
            return r0
        L_0x00e9:
            return r2
        L_0x00ea:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35301lz.A00(X.A4S, X.2HL, X.8vJ, X.2sw, X.1lz, boolean):int");
    }

    public C35301lz(AnonymousClass190 r2, C32591hR r3, AnonymousClass11S r4, AnonymousClass120 r5, AnonymousClass181 r6, AnonymousClass1M9 r7, C26191Re r8, AnonymousClass11Q r9, AnonymousClass11P r10, AnonymousClass1P3 r11, C25571Os r12, AnonymousClass1CJ r13, AnonymousClass122 r14, C32481hG r15, AnonymousClass1MZ r16, C24661Le r17, AnonymousClass1RK r18, AnonymousClass1U5 r19, AnonymousClass1MR r20, C18030ve r21, AnonymousClass18K r22, AnonymousClass126 r23, C35241lt r24, C35291ly r25, AnonymousClass1N9 r26, C35211lq r27, AnonymousClass1N7 r28, AnonymousClass1PT r29, AnonymousClass10I r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38) {
        this.A0b = r10;
        this.A0I = r21;
        this.A00 = r2;
        this.A02 = r4;
        this.A0Q = r30;
        this.A0A = r13;
        this.A04 = r6;
        this.A0c = r22;
        this.A09 = r12;
        this.A0E = r17;
        this.A0M = r26;
        this.A0R = r31;
        this.A0U = r32;
        this.A05 = r7;
        this.A0P = r29;
        this.A0B = r14;
        this.A0C = r15;
        this.A0T = r34;
        this.A0J = r23;
        this.A0V = r33;
        this.A03 = r5;
        this.A0Y = r35;
        this.A08 = r11;
        this.A06 = r8;
        this.A0H = r20;
        this.A0O = r28;
        this.A01 = r3;
        this.A0G = r19;
        this.A0K = r24;
        this.A0X = r36;
        this.A0F = r18;
        this.A0N = r27;
        this.A0D = r16;
        this.A0L = r25;
        this.A0S = r37;
        this.A0W = r38;
        this.A07 = r9;
    }
}
