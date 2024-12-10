package X;

import java.util.Map;

/* renamed from: X.2mg  reason: invalid class name and case insensitive filesystem */
public abstract class C59662mg {
    public Map A00;
    public final AnonymousClass190 A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass37L A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0378, code lost:
        if (r8 >= 0) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x045e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r2, 4923) == false) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b5, code lost:
        if (r8 != false) goto L_0x046c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C29621ca r15) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C48522Mu
            if (r0 == 0) goto L_0x0118
            r5 = r14
            X.2Mu r5 = (X.C48522Mu) r5
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r3 = r15.A0F(r1, r0)
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x002d
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            X.11S r0 = r5.A00
            boolean r0 = r0.A0P(r3)
            if (r0 == 0) goto L_0x002c
            X.37L r0 = r5.A04
            X.3LB r5 = r0.A00
            r2 = 0
            r1 = 213(0xd5, float:2.98E-43)
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r1, r2, r15)
        L_0x0029:
            r5.CAe(r0)
        L_0x002c:
            return
        L_0x002d:
            boolean r0 = X.C22971Dz.A0W(r3)
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = "count"
            r0 = 0
            int r4 = r15.A0A(r1, r0)
            if (r4 <= 0) goto L_0x0049
            X.37L r0 = r5.A04
            X.3LB r5 = r0.A00
            r2 = 0
            r1 = 271(0x10f, float:3.8E-43)
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r1, r4, r3)
            goto L_0x0029
        L_0x0049:
            java.lang.String r0 = "type"
            java.lang.String r1 = X.C29621ca.A02(r15, r0)
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0066
            X.37L r0 = r5.A04
            X.3LB r5 = r0.A00
            r2 = 0
            r1 = 272(0x110, float:3.81E-43)
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r1, r2, r3)
            goto L_0x0029
        L_0x0066:
            X.1BI r4 = X.C22971Dz.A00(r3)
            if (r4 == 0) goto L_0x002c
            java.lang.String r0 = "type"
            r2 = 0
            java.lang.String r1 = r15.A0Q(r0, r2)
            java.lang.String r0 = "name"
            java.lang.String r3 = r15.A0Q(r0, r2)
            java.lang.String r8 = "presence"
            java.lang.String r7 = r15.A0Q(r8, r2)
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            X.37L r6 = r5.A04
            long r1 = X.C60522oA.A00(r15)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unavailable "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " "
            r5.append(r0)
            r5.append(r1)
            X.C17900vP.A0f(r0, r7, r5)
            X.3LB r6 = r6.A00
            android.os.Bundle r5 = X.C17880vN.A0D()
            java.lang.String r0 = "jid"
            X.AnonymousClass2U5.A00(r5, r4, r0)
            java.lang.String r0 = "pushName"
            r5.putString(r0, r3)
            java.lang.String r0 = "lastSeen"
            r5.putLong(r0, r1)
            r5.putString(r8, r7)
            r0 = 64
            X.C17890vO.A0o(r6, r5, r0)
            return
        L_0x00c4:
            java.lang.String r0 = "unsubscribe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            X.37L r2 = r5.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unsubscribe "
            X.C17900vP.A0Y(r4, r0, r1)
            X.3LB r2 = r2.A00
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "jid"
            X.AnonymousClass2U5.A00(r1, r4, r0)
            java.lang.String r0 = "pushName"
            r1.putString(r0, r3)
            r0 = 88
            X.C17890vO.A0p(r2, r1, r0)
            return
        L_0x00ee:
            if (r1 == 0) goto L_0x00f8
            java.lang.String r0 = "available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002c
        L_0x00f8:
            X.37L r2 = r5.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/available "
            X.C17900vP.A0Y(r4, r0, r1)
            X.3LB r2 = r2.A00
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "jid"
            X.AnonymousClass2U5.A00(r1, r4, r0)
            java.lang.String r0 = "pushName"
            r1.putString(r0, r3)
            r0 = 5
            X.C17890vO.A0p(r2, r1, r0)
            return
        L_0x0118:
            boolean r0 = r14 instanceof X.C48502Ms
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = "type"
            r4 = 0
            java.lang.String r2 = r15.A0Q(r0, r4)
            java.lang.String r0 = "id"
            java.lang.String r3 = r15.A0Q(r0, r4)
            java.lang.String r0 = "xmlns"
            java.lang.String r1 = r15.A0Q(r0, r4)
            if (r2 == 0) goto L_0x0310
            java.lang.String r0 = "result"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016b
            if (r3 == 0) goto L_0x02e5
            java.util.Map r0 = r14.A00
            java.lang.Object r0 = r0.remove(r3)
            X.2S7 r0 = (X.AnonymousClass2S7) r0
            if (r0 == 0) goto L_0x014a
            r0.A01(r15)
        L_0x014a:
            X.37L r2 = r14.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-iq-response; id="
            X.C17900vP.A0f(r0, r3, r1)
            X.3LB r1 = r2.A00
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            android.os.Message r2 = r1.obtainMessage(r0, r15)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "iqId"
            r1.putString(r0, r3)
            r2.sendToTarget()
            return
        L_0x016b:
            java.lang.String r0 = "error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0183
            java.util.Map r0 = r14.A00
            java.lang.Object r0 = r0.remove(r3)
            X.2S7 r0 = (X.AnonymousClass2S7) r0
            if (r0 == 0) goto L_0x0180
            r0.A00(r15)
        L_0x0180:
            if (r3 == 0) goto L_0x002c
            goto L_0x014a
        L_0x0183:
            java.lang.String r0 = "get"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01e4
            r5 = 0
            X.1ca r2 = r15.A0J(r5)
            java.lang.String r0 = "urn:xmpp:ping"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = "t"
            java.lang.String r2 = r15.A0Q(r0, r4)
            r0 = 0
            long r1 = X.C20099A7c.A04(r2, r0)
            X.37L r4 = r14.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/onServerPingReceived"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r6 = r4.A00
            r4 = 4
            r0 = 0
            android.os.Message r5 = android.os.Message.obtain(r0, r5, r4, r5)
            android.os.Bundle r4 = r5.getData()
            java.lang.String r0 = "timestamp"
            r4.putLong(r0, r1)
            r6.CAe(r5)
            goto L_0x0180
        L_0x01c3:
            java.lang.String r0 = "relay"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "pin"
            java.lang.String r1 = r2.A0Q(r0, r4)
            java.lang.String r0 = "ip"
            r2.A0Q(r0, r4)
            java.lang.String r0 = "timeout"
            r2.A0A(r0, r5)
            if (r1 == 0) goto L_0x0180
            java.lang.String r0 = "onRelayRequest"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0180
        L_0x01e4:
            java.lang.String r0 = "set"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = "location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01fd
            X.37L r1 = r14.A04
            r0 = 206(0xce, float:2.89E-43)
            r1.A01(r15, r4, r0)
            goto L_0x0180
        L_0x01fd:
            java.lang.String r0 = "md"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            X.1ca r2 = r15.A0J(r0)
            if (r2 == 0) goto L_0x0180
            java.lang.String r0 = "pair-device"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x021d
            X.37L r1 = r14.A04
            r0 = 242(0xf2, float:3.39E-43)
        L_0x0218:
            r1.A01(r15, r4, r0)
            goto L_0x0180
        L_0x021d:
            java.lang.String r0 = "pair-success"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x02eb
            X.37L r1 = r14.A04
            r0 = 243(0xf3, float:3.4E-43)
            goto L_0x0218
        L_0x022a:
            boolean r0 = r14 instanceof X.C48492Mr
            if (r0 == 0) goto L_0x0317
            r0 = 0
            X.1ca r2 = r15.A0J(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r0 = r15.A0F(r1, r0)
            X.1BI r5 = X.C22971Dz.A00(r0)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r15.A0F(r1, r0)
            X.1BI r6 = X.C22971Dz.A00(r0)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r4 = r15.A0F(r1, r0)
            java.lang.String r0 = "composing"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x02a6
            java.lang.String r7 = "media"
            java.lang.String r8 = X.C29621ca.A02(r2, r7)
            X.37L r2 = r14.A04
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/composing "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r1.append(r4)
            X.C17900vP.A0f(r0, r8, r1)
            X.3LB r3 = r2.A00
            java.lang.String r0 = "audio"
            boolean r2 = r0.equals(r8)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "jid"
            X.AnonymousClass2U5.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.AnonymousClass2U5.A00(r1, r6, r0)
            java.lang.String r0 = "author_pn"
            X.AnonymousClass2U5.A00(r1, r4, r0)
            r1.putInt(r7, r2)
            r0 = 20
        L_0x02a2:
            X.C17890vO.A0o(r3, r1, r0)
            return
        L_0x02a6:
            java.lang.String r0 = "paused"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x002c
            X.37L r3 = r14.A04
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/paused jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " author="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " pn="
            X.C17900vP.A0Y(r4, r0, r1)
            X.3LB r3 = r3.A00
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "jid"
            X.AnonymousClass2U5.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.AnonymousClass2U5.A00(r1, r2, r0)
            java.lang.String r0 = "author_pn"
            X.AnonymousClass2U5.A00(r1, r4, r0)
            r0 = 21
            goto L_0x02a2
        L_0x02e5:
            X.3EU r0 = new X.3EU
            r0.<init>()
            throw r0
        L_0x02eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown tag in multidevice IQ: "
            r1.append(r0)
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0300:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown iq type attribute: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0310:
            java.lang.String r0 = "missing 'type' attribute in iq stanza"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0317:
            r10 = r14
            X.2Mv r10 = (X.C48532Mv) r10
            java.lang.String r11 = "offline"
            r9 = 0
            java.lang.String r1 = r15.A0Q(r11, r9)
            r0 = -1
            int r8 = X.C20099A7c.A01(r1, r0)
            java.lang.String r0 = "type"
            java.lang.String r3 = r15.A0Q(r0, r9)
            boolean r0 = r10 instanceof X.C48482Mq
            if (r0 == 0) goto L_0x037b
            java.lang.String r7 = "receipt"
        L_0x0333:
            r0 = 11
            java.lang.String r6 = "message"
            if (r8 != r0) goto L_0x0378
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r1 = "-"
            if (r3 == 0) goto L_0x0348
            r2.append(r1)
            r2.append(r3)
        L_0x0348:
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x035c
            r2.append(r1)
            java.lang.String r1 = "edit"
            java.lang.String r0 = "none"
            java.lang.String r0 = r15.A0Q(r1, r0)
            r2.append(r0)
        L_0x035c:
            X.190 r3 = r10.A01
            java.lang.String r2 = r2.toString()
            r1 = 0
            java.lang.String r0 = "offline-count-11"
            r3.A0G(r0, r2, r1)
        L_0x0368:
            X.1fW r5 = r10.A02
            X.0ve r2 = r5.A0B
            X.0vf r1 = X.C18040vf.A01
            r0 = 4353(0x1101, float:6.1E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x044d
            monitor-enter(r5)
            goto L_0x038c
        L_0x0378:
            if (r8 < 0) goto L_0x044d
            goto L_0x0368
        L_0x037b:
            boolean r0 = r10 instanceof X.C48462Mo
            if (r0 == 0) goto L_0x0382
            java.lang.String r7 = "notification"
            goto L_0x0333
        L_0x0382:
            boolean r0 = r10 instanceof X.C48452Mn
            if (r0 == 0) goto L_0x0389
            java.lang.String r7 = "message"
            goto L_0x0333
        L_0x0389:
            java.lang.String r7 = "call"
            goto L_0x0333
        L_0x038c:
            X.2lo r1 = r5.A08     // Catch:{ all -> 0x0449 }
            if (r1 == 0) goto L_0x0435
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x0449 }
            java.lang.Object r4 = r0.get(r1)     // Catch:{ all -> 0x0449 }
            X.2B0 r4 = (X.AnonymousClass2B0) r4     // Catch:{ all -> 0x0449 }
            if (r4 == 0) goto L_0x0435
            java.lang.String r1 = r15.A00     // Catch:{ all -> 0x0449 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0449 }
            switch(r0) {
                case 3045982: goto L_0x0415;
                case 595233003: goto L_0x0406;
                case 954925063: goto L_0x03ea;
                case 1082290744: goto L_0x03f7;
                default: goto L_0x03a3;
            }     // Catch:{ all -> 0x0449 }
        L_0x03a3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "Unexpected "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r2)     // Catch:{ all -> 0x0449 }
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x0449 }
        L_0x03b1:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0449 }
            X.2BZ r3 = X.C17880vN.A0W(r4)     // Catch:{ all -> 0x0449 }
            int r2 = X.AnonymousClass2BZ.ACTIVE_MODE_UPTIME_MILLIS_FIELD_NUMBER     // Catch:{ all -> 0x0449 }
            int r2 = r3.bitField0_     // Catch:{ all -> 0x0449 }
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3.bitField0_ = r2     // Catch:{ all -> 0x0449 }
            r3.lastStanzaReceivedUptimeMillis_ = r0     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "t"
            r2 = -1
            long r0 = r15.A0D(r0, r2)     // Catch:{ all -> 0x0449 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x0424
            X.Bm6 r2 = r4.A00     // Catch:{ all -> 0x0449 }
            X.2BZ r2 = (X.AnonymousClass2BZ) r2     // Catch:{ all -> 0x0449 }
            long r2 = r2.oldestStanzaTimeMillis_     // Catch:{ all -> 0x0449 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0449 }
            X.2BZ r3 = X.C17880vN.A0W(r4)     // Catch:{ all -> 0x0449 }
            int r2 = r3.bitField0_     // Catch:{ all -> 0x0449 }
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3.bitField0_ = r2     // Catch:{ all -> 0x0449 }
            r3.oldestStanzaTimeMillis_ = r0     // Catch:{ all -> 0x0449 }
            goto L_0x0424
        L_0x03ea:
            boolean r0 = r1.equals(r6)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x03a3
            int r0 = r5.A02     // Catch:{ all -> 0x0449 }
            int r0 = r0 + 1
            r5.A02 = r0     // Catch:{ all -> 0x0449 }
            goto L_0x03b1
        L_0x03f7:
            java.lang.String r0 = "receipt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x03a3
            int r0 = r5.A04     // Catch:{ all -> 0x0449 }
            int r0 = r0 + 1
            r5.A04 = r0     // Catch:{ all -> 0x0449 }
            goto L_0x03b1
        L_0x0406:
            java.lang.String r0 = "notification"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x03a3
            int r0 = r5.A03     // Catch:{ all -> 0x0449 }
            int r0 = r0 + 1
            r5.A03 = r0     // Catch:{ all -> 0x0449 }
            goto L_0x03b1
        L_0x0415:
            java.lang.String r0 = "call"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x03a3
            int r0 = r5.A01     // Catch:{ all -> 0x0449 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x0449 }
            goto L_0x03b1
        L_0x0424:
            r0 = 2
            if (r8 < r0) goto L_0x044c
            r2 = 1
            X.2BZ r1 = X.C17880vN.A0W(r4)     // Catch:{ all -> 0x0449 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0449 }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0     // Catch:{ all -> 0x0449 }
            r1.onTrickleMode_ = r2     // Catch:{ all -> 0x0449 }
            goto L_0x044c
        L_0x0435:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "OfflineResumeMetrics/onOfflineStanzaReceived no metrics for "
            r1.append(r0)     // Catch:{ all -> 0x0449 }
            X.2lo r0 = r5.A08     // Catch:{ all -> 0x0449 }
            r1.append(r0)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = ", ignoring"
            X.C17890vO.A1B(r1, r0)     // Catch:{ all -> 0x0449 }
            goto L_0x044c
        L_0x0449:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x044c:
            monitor-exit(r5)
        L_0x044d:
            X.0ve r2 = r10.A02
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L_0x0460
            X.0vf r1 = X.C18040vf.A01
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r12 = 1
            if (r0 != 0) goto L_0x0461
        L_0x0460:
            r12 = 0
        L_0x0461:
            boolean r8 = r7.equals(r6)
            r3 = 0
            if (r12 != 0) goto L_0x0470
            if (r8 != 0) goto L_0x0470
            r2 = r9
        L_0x046b:
            r3 = r9
        L_0x046c:
            r10.A04(r15, r2, r3)
            return
        L_0x0470:
            X.1MD[] r6 = r15.A0S()
            java.util.HashMap r9 = X.C17880vN.A11()
            java.lang.String r0 = "stanza-type"
            r9.put(r0, r7)
            if (r6 == 0) goto L_0x0498
            int r5 = r6.length
            r4 = 0
        L_0x0482:
            if (r4 >= r5) goto L_0x0498
            r2 = r6[r4]
            java.lang.String r0 = r2.A02
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0495
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r2.A03
            r9.put(r1, r0)
        L_0x0495:
            int r4 = r4 + 1
            goto L_0x0482
        L_0x0498:
            int r0 = r9.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r12 == 0) goto L_0x04b5
            X.1ft r0 = r10.A00
            java.util.HashSet r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x04c3 }
            if (r0 == 0) goto L_0x04ae
            goto L_0x04b8
        L_0x04ae:
            r1.add(r2)     // Catch:{ all -> 0x04c3 }
            r1.size()     // Catch:{ all -> 0x04c3 }
            monitor-exit(r1)
        L_0x04b5:
            if (r8 == 0) goto L_0x046b
            goto L_0x046c
        L_0x04b8:
            monitor-exit(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "connection/handleMessage/ignoring duplicate stanza: "
            X.C17900vP.A0Z(r9, r0, r1)
            return
        L_0x04c3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59662mg.A01(X.1ca):void");
    }

    public void A02(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        if (num != null && num.intValue() > 10) {
            AnonymousClass2GY r2 = new AnonymousClass2GY();
            r2.A04 = Long.valueOf(num.longValue());
            r2.A03 = num2;
            r2.A00 = num3;
            r2.A05 = str;
            r2.A06 = str2;
            r2.A02 = num4;
            r2.A01 = num5;
            this.A03.CC7(r2);
        }
    }

    public String[] A03() {
        String[] A1Y;
        char c;
        String str;
        if (this instanceof C48522Mu) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "presence";
        } else if (this instanceof C48502Ms) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "iq";
        } else if (this instanceof C48552Mx) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "ib";
        } else if (this instanceof C48542Mw) {
            A1Y = C17880vN.A1Z();
            A1Y[0] = "stream:error";
            c = 1;
            str = "error";
        } else if (this instanceof C48492Mr) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "chatstate";
        } else if (this instanceof C48482Mq) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "receipt";
        } else if (this instanceof C48462Mo) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "notification";
        } else if (this instanceof C48452Mn) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "message";
        } else {
            boolean z = this instanceof C48472Mp;
            A1Y = C17880vN.A1Y();
            c = 0;
            if (z) {
                str = "call";
            } else {
                str = "ack";
            }
        }
        A1Y[c] = str;
        return A1Y;
    }

    public C59662mg(AnonymousClass190 r1, C18030ve r2, AnonymousClass18K r3, AnonymousClass37L r4, Map map) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = map;
    }
}
