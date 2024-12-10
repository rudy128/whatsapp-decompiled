package X;

import java.util.Map;

/* renamed from: X.2Mv  reason: invalid class name and case insensitive filesystem */
public abstract class C48532Mv extends C59662mg {
    public final C31641ft A00;
    public final AnonymousClass1OZ A01;
    public final C31411fW A02;

    public C48532Mv(AnonymousClass190 r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass37L r10, C31641ft r11, AnonymousClass1OZ r12, C31411fW r13, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r12;
        this.A02 = r13;
        this.A00 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r6 != -1) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C29621ca r22, java.lang.Integer r23, java.util.Map r24) {
        /*
            r21 = this;
            r0 = r21
            boolean r2 = r0 instanceof X.C48462Mo
            r1 = r22
            r14 = r23
            if (r2 == 0) goto L_0x00f0
            X.2Mo r0 = (X.C48462Mo) r0
            long r19 = android.os.SystemClock.uptimeMillis()
            X.C17960vV.A07(r1)
            java.lang.String r2 = "id"
            java.lang.String r15 = r1.A0P(r2)
            java.lang.String r2 = "type"
            r7 = 0
            java.lang.String r3 = r1.A0Q(r2, r7)
            java.lang.String r2 = "offline"
            java.lang.String r6 = r1.A0Q(r2, r7)
            if (r6 == 0) goto L_0x0038
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x002e }
            goto L_0x0039
        L_0x002e:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            X.C17900vP.A0h(r2, r6, r4, r5)
        L_0x0038:
            r13 = 0
        L_0x0039:
            java.lang.Integer r6 = X.C17880vN.A0k()
            r9 = r7
            r11 = r7
            r4 = r0
            r5 = r13
            r8 = r7
            r10 = r3
            r4.A02(r5, r6, r7, r8, r9, r10, r11)
            X.1fZ r2 = r0.A01
            if (r3 != 0) goto L_0x00a3
            java.lang.String r16 = ""
        L_0x004c:
            java.util.concurrent.atomic.AtomicLong r4 = r2.A06
            long r17 = r4.getAndIncrement()
            X.11P r8 = r2.A01
            X.0ve r10 = r2.A02
            X.190 r7 = r2.A00
            X.18K r11 = r2.A03
            X.1N7 r12 = r2.A04
            X.00H r2 = r2.A05
            java.lang.Object r9 = r2.get()
            X.1CP r9 = (X.AnonymousClass1CP) r9
            X.8vI r6 = new X.8vI
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            r12.A04(r6)
            long r4 = r6.A03
            r2 = 2
            r6.A05(r2)
            if (r3 == 0) goto L_0x00a6
            java.lang.String r2 = "devices"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = "update"
            X.1ca r2 = r1.A0K(r2)
            if (r2 == 0) goto L_0x0091
            r6 = 261(0x105, float:3.66E-43)
        L_0x0087:
            X.37L r2 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.A01(r1, r0, r6)
            return
        L_0x0091:
            java.util.Map r2 = r0.A02
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x00a6
            int r6 = r2.intValue()
            r2 = -1
            if (r6 == r2) goto L_0x00a6
            goto L_0x0087
        L_0x00a3:
            r16 = r3
            goto L_0x004c
        L_0x00a6:
            java.lang.Class<com.whatsapp.jid.Jid> r7 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r6 = r1.A0F(r7, r2)
            java.lang.String r2 = "participant"
            com.whatsapp.jid.Jid r2 = r1.A0F(r7, r2)
            X.2lD r1 = new X.2lD
            r1.<init>()
            r1.A02 = r6
            java.lang.String r6 = "notification"
            r1.A06 = r6
            r1.A08 = r15
            r1.A09 = r3
            r1.A01 = r2
            r1.A00 = r4
            X.2nR r1 = r1.A00()
            X.2lD r2 = r1.A00()
            r1 = 490(0x1ea, float:6.87E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.A01(r1)
            X.2nR r2 = r2.A00()
            X.1OZ r1 = r0.A01
            r1.A0K(r2)
            X.2FH r1 = new X.2FH
            r1.<init>()
            r1.A00 = r6
            r1.A01 = r3
            X.18K r0 = r0.A03
            r0.CC7(r1)
            return
        L_0x00f0:
            X.2Mn r0 = (X.C48452Mn) r0
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r6 = r1.A0G(r3, r2)
            java.lang.String r2 = "offline"
            r4 = 0
            java.lang.String r5 = r1.A0Q(r2, r4)
            r3 = 1
            r2 = 0
            int r2 = X.C20099A7c.A01(r5, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            X.1BI r2 = X.C22971Dz.A00(r6)
            int r2 = X.C64002u3.A04(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r11 = X.C64002u3.A0A(r1)
            r12 = r4
            r13 = r4
            r6 = r0
            r9 = r4
            r6.A02(r7, r8, r9, r10, r11, r12, r13)
            X.0ve r5 = r0.A02
            r3 = 4146(0x1032, float:5.81E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r5, r3)
            r5 = r24
            if (r2 == 0) goto L_0x015d
            X.37L r3 = r0.A01
            X.11P r0 = r0.A00
            android.os.SystemClock.uptimeMillis()
            X.AnonymousClass11P.A01(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/onMessageStanzaReceived id="
            r2.append(r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A0Q(r0, r4)
            X.C17890vO.A1A(r2, r0)
            X.3LB r3 = r3.A00
            X.6gI r2 = new X.6gI
            r2.<init>(r1, r14, r5)
            r0 = 264(0x108, float:3.7E-43)
            X.C17890vO.A0p(r3, r2, r0)
            return
        L_0x015d:
            X.1m7 r0 = r0.A02
            r0.A00(r1, r14, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48532Mv.A04(X.1ca, java.lang.Integer, java.util.Map):void");
    }
}
