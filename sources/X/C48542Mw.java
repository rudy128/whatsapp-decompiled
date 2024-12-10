package X;

import java.util.Map;

/* renamed from: X.2Mw  reason: invalid class name and case insensitive filesystem */
public class C48542Mw extends C59662mg {
    public final AnonymousClass190 A00;
    public final AnonymousClass1N7 A01;
    public final C20003A2s A02;
    public final Map A03;
    public final C54762ef A04;

    public C48542Mw(AnonymousClass190 r7, C54762ef r8, C18030ve r9, AnonymousClass18K r10, AnonymousClass37L r11, AnonymousClass1N7 r12, C20003A2s a2s, Map map, Map map2) {
        super(r7, r9, r10, r11, map);
        this.A00 = r7;
        this.A01 = r12;
        this.A02 = a2s;
        this.A04 = r8;
        this.A03 = map2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C29621ca r28) {
        /*
            r27 = this;
            java.lang.String r0 = "stream:error"
            r3 = r28
            boolean r0 = X.C29621ca.A07(r3, r0)
            r8 = r27
            if (r0 == 0) goto L_0x0277
            X.2ef r4 = r8.A04
            X.1Dn r0 = r4.A02
            boolean r0 = r0.A02()
            r5 = 0
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "code"
            int r1 = r3.A0A(r0, r2)     // Catch:{ 1UI -> 0x005d }
            r0 = 515(0x203, float:7.22E-43)
            if (r1 == r0) goto L_0x002b
            r0 = 516(0x204, float:7.23E-43)
            if (r1 != r0) goto L_0x0033
            r1 = 245(0xf5, float:3.43E-43)
            goto L_0x002d
        L_0x002b:
            r1 = 244(0xf4, float:3.42E-43)
        L_0x002d:
            X.37L r0 = r4.A03     // Catch:{ 1UI -> 0x005d }
            r0.A01(r3, r5, r1)     // Catch:{ 1UI -> 0x005d }
            return
        L_0x0033:
            X.11S r0 = r4.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "conflict"
            X.1ca r1 = r3.A0K(r0)
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "type"
            java.lang.String r1 = r1.A0Q(r0, r5)
            java.lang.String r0 = "device_removed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "CompanionXmppReadInterceptorImpl/handleStreamError deregister"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Tf r0 = r4.A01
            r0.A02(r5, r2, r9)
            return
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "CompanionConnectionInterceptor/handleStreamError"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            java.lang.String r0 = "ack"
            X.1ca r1 = r3.A0K(r0)
            if (r1 == 0) goto L_0x01c8
            java.lang.String r0 = "id"
            java.lang.String r4 = r3.A0Q(r0, r5)
            java.lang.String r0 = r1.A0Q(r0, r5)
            if (r4 != 0) goto L_0x0078
            r4 = r0
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ErrorStanzaHandler/received ack-kick id="
            X.C17900vP.A0g(r0, r4, r1)
            X.2H4 r10 = new X.2H4
            r10.<init>()
            X.1N7 r7 = r8.A01
            monitor-enter(r7)
            int[] r15 = r7.A05     // Catch:{ all -> 0x01ad }
            r14 = 4
            r25 = 0
            r6 = 0
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
            r21 = 0
            r19 = 0
        L_0x0099:
            r0 = r15[r13]     // Catch:{ all -> 0x01ad }
            java.util.Map r1 = r7.A02(r0)     // Catch:{ all -> 0x01ad }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            java.util.Iterator r18 = X.C17890vO.A0i(r0)     // Catch:{ all -> 0x01ad }
        L_0x00a8:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x00e8
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)     // Catch:{ all -> 0x01ad }
            java.lang.Object r11 = r0.getKey()     // Catch:{ all -> 0x01ad }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x01ad }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01ad }
            X.2tQ r1 = (X.C63622tQ) r1     // Catch:{ all -> 0x01ad }
            if (r1 == 0) goto L_0x00a8
            r16 = 1
            long r25 = r25 + r16
            java.lang.Integer r0 = r1.A08     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.intValue()     // Catch:{ all -> 0x01ad }
            if (r0 <= 0) goto L_0x00d0
            long r21 = r21 + r16
        L_0x00d0:
            if (r4 == 0) goto L_0x00a8
            java.lang.String r0 = r1.A0A     // Catch:{ all -> 0x01ad }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x00a8
            long r19 = r19 + r16
            long r11 = r11.longValue()     // Catch:{ all -> 0x01ad }
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            r23 = r11
            r6 = r1
            goto L_0x00a8
        L_0x00e8:
            int r13 = r13 + 1
            if (r13 < r14) goto L_0x0099
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x01ad }
            r10.A05 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x01ad }
            r10.A04 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x01ad }
            r10.A07 = r0     // Catch:{ all -> 0x01ad }
            if (r6 == 0) goto L_0x012a
            int r0 = r6.A02     // Catch:{ all -> 0x01ad }
            java.util.Map r0 = r7.A02(r0)     // Catch:{ all -> 0x01ad }
            int r0 = r0.size()     // Catch:{ all -> 0x01ad }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x01ad }
            r10.A06 = r0     // Catch:{ all -> 0x01ad }
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01ad }
            long r0 = r6.A04     // Catch:{ all -> 0x01ad }
            long r11 = r11 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01ad }
            r10.A09 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Integer r0 = r6.A08     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0127
            java.lang.Long r0 = X.C17890vO.A0N(r0)     // Catch:{ all -> 0x01ad }
            r10.A08 = r0     // Catch:{ all -> 0x01ad }
        L_0x0127:
            r6.A06(r10)     // Catch:{ all -> 0x01ad }
        L_0x012a:
            monitor-exit(r7)
            X.18K r0 = r8.A03
            r0.CC7(r10)
            X.A2s r6 = r8.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A01 = r0
            if (r4 == 0) goto L_0x01c8
            java.lang.Integer r10 = r10.A03
            if (r10 == 0) goto L_0x01b0
            int r1 = r10.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x01b0
            r13 = 0
            java.util.HashSet r6 = X.C17880vN.A12()
            monitor-enter(r7)
            java.util.Map r1 = r7.A04     // Catch:{ all -> 0x01ad }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            monitor-exit(r7)
            java.util.Iterator r12 = X.C17890vO.A0j(r0)
        L_0x0157:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r11 = r12.next()
            X.8vK r11 = (X.C173588vK) r11
            java.lang.String r0 = r11.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0157
            java.util.Set r0 = r11.A04
            if (r0 == 0) goto L_0x0157
            r6.addAll(r0)
            goto L_0x0157
        L_0x0173:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x017a
            r6 = r5
        L_0x017a:
            monitor-enter(r7)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            monitor-exit(r7)
            java.util.Iterator r16 = X.C17890vO.A0j(r0)
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L_0x018b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r12 = r16.next()
            X.8vK r12 = (X.C173588vK) r12
            long r0 = r12.A03
            java.lang.String r11 = r12.A0A
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto L_0x018b
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x018b
            r13 = r12
            r14 = r0
            goto L_0x018b
        L_0x01a8:
            if (r13 == 0) goto L_0x01b2
            java.lang.String r7 = r13.A03
            goto L_0x01b2
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01b0:
            r6 = 0
            r7 = r5
        L_0x01b2:
            java.util.Map r11 = r8.A03
            boolean r0 = r11.containsKey(r4)
            if (r0 != 0) goto L_0x01f7
            boolean r0 = r11.containsKey(r7)
            if (r0 != 0) goto L_0x01f7
            r11.put(r4, r6)
            if (r7 == 0) goto L_0x01c8
            r11.put(r7, r6)
        L_0x01c8:
            X.37L r6 = r8.A04
            X.1ca[] r1 = r3.A02
            if (r1 == 0) goto L_0x01f4
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01f4
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error "
            r4.append(r0)
            r1 = r1[r2]
            java.lang.String r0 = r1.A00
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            byte[] r0 = r1.A01
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
        L_0x01f0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0257
        L_0x01f4:
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error"
            goto L_0x01f0
        L_0x01f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ErrorStanzaHandler/received multiple ack-kick for id="
            X.C17900vP.A0g(r0, r4, r1)
            if (r10 == 0) goto L_0x0216
            int r1 = r10.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0216
            if (r7 == 0) goto L_0x020c
            r4 = r7
        L_0x020c:
            java.lang.Object r0 = r11.put(r4, r6)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r6 != 0) goto L_0x0248
            if (r0 != 0) goto L_0x0254
        L_0x0216:
            java.lang.String r0 = "multi-kick-"
        L_0x0218:
            X.190 r7 = r8.A00
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r0)
            java.lang.String r4 = "unknown"
            if (r10 == 0) goto L_0x022b
            int r1 = r10.intValue()
            if (r1 != r9) goto L_0x0236
            java.lang.String r4 = "message"
        L_0x022b:
            java.lang.String r1 = X.AnonymousClass000.A0y(r4, r6)
            java.lang.String r0 = "unacked-stanza"
            r7.A0G(r0, r1, r2)
            goto L_0x01c8
        L_0x0236:
            r0 = 2
            if (r1 != r0) goto L_0x023c
            java.lang.String r4 = "receipt"
            goto L_0x022b
        L_0x023c:
            r0 = 4
            if (r1 != r0) goto L_0x0242
            java.lang.String r4 = "notification"
            goto L_0x022b
        L_0x0242:
            r0 = 3
            if (r1 != r0) goto L_0x022b
            java.lang.String r4 = "call"
            goto L_0x022b
        L_0x0248:
            if (r0 == 0) goto L_0x0254
            boolean r0 = java.util.Collections.disjoint(r6, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0216
        L_0x0254:
            java.lang.String r0 = "multi-kick-fp-"
            goto L_0x0218
        L_0x0257:
            java.lang.String r0 = "code"
            int r4 = r3.A0A(r0, r2)     // Catch:{ 1UI -> 0x0272 }
            X.3LB r3 = r6.A00     // Catch:{ 1UI -> 0x0272 }
            r0 = 158(0x9e, float:2.21E-43)
            android.os.Message r2 = android.os.Message.obtain(r5, r2, r0, r2)     // Catch:{ 1UI -> 0x0272 }
            android.os.Bundle r1 = r2.getData()     // Catch:{ 1UI -> 0x0272 }
            java.lang.String r0 = "errorCode"
            r1.putInt(r0, r4)     // Catch:{ 1UI -> 0x0272 }
            r3.CAe(r2)     // Catch:{ 1UI -> 0x0272 }
            return
        L_0x0272:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        L_0x0277:
            java.lang.String r0 = "error"
            boolean r0 = X.C29621ca.A07(r3, r0)
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = "code"
            r4 = 0
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "479"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x02a1
            X.37L r1 = r8.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/smax/invalid"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r2 = r1.A00
            r1 = 0
            r0 = 237(0xed, float:3.32E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1)
            r2.CAe(r0)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48542Mw.A01(X.1ca):void");
    }
}
