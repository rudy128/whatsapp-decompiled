package X;

import java.io.IOException;

public class AU4 implements C1606989o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AU4(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9zw] */
    public static void A00(C185439ca r3, Throwable th) {
        ? obj = new Object();
        obj.A00 = C179629Is.SCRIPTING_METADATA_DOWNLOAD_FAILURE;
        obj.A03 = th;
        AnonymousClass9LV A012 = obj.A01();
        C191579mp r0 = r3.A00;
        C20375AIg.A02(r0.A00, r0.A03, r0.A05, r0.A06, A012);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r3v10, types: [X.1IU] */
    /* JADX WARNING: type inference failed for: r6v6, types: [X.AS6] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
        if (r0 == 0) goto L_0x00e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r21) {
        /*
            r20 = this;
            r4 = r20
            int r0 = r4.A00
            r3 = r21
            switch(r0) {
                case 0: goto L_0x029e;
                case 1: goto L_0x028c;
                case 2: goto L_0x027a;
                case 3: goto L_0x0082;
                case 4: goto L_0x0072;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            int r0 = r3.A00
            if (r0 != 0) goto L_0x018e
            X.161 r5 = r3.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlDataProcessor"
            X.C18070vi.A0z(r5, r0)
            X.8tK r5 = (X.C172378tK) r5
            java.lang.Object r7 = r4.A02
            X.AS6 r7 = (X.AS6) r7
            X.9ng r4 = r7.A08
            java.lang.Object r3 = r5.A00
            X.C18070vi.A0b(r3)
            java.lang.String r3 = (java.lang.String) r3
            X.9t0 r0 = r7.A07
            javax.crypto.SecretKey r1 = r0.A03
            byte[] r0 = r0.A04
            r6 = 0
            java.lang.String r9 = r4.A00(r3, r1, r0)
            int r0 = r5.A00
            if (r0 != 0) goto L_0x004f
            if (r9 != 0) goto L_0x004c
            r11 = 1
            java.lang.String r10 = "extensions-decryption-failed-exception"
        L_0x003b:
            android.app.Activity r4 = r7.A00
            X.9kz r5 = r7.A03
            X.1KB r0 = r7.A02
            X.Ajb r3 = new X.Ajb
            r8 = r6
            r12 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.CGP(r3)
            return
        L_0x004c:
            r11 = 0
            r10 = 0
            goto L_0x003b
        L_0x004f:
            java.lang.String r8 = X.A25.A00(r9)
            if (r8 != 0) goto L_0x005e
            android.app.Activity r1 = r7.A00
            r0 = 2131890453(0x7f121115, float:1.9415598E38)
            java.lang.String r8 = X.C18070vi.A0F(r1, r0)
        L_0x005e:
            android.app.Activity r4 = r7.A00
            X.9kz r5 = r7.A03
            java.lang.String r10 = "extensions-invalid-flow-token-error"
            r11 = 1
            X.1KB r0 = r7.A02
            X.Ajb r3 = new X.Ajb
            r9 = r6
            r12 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.CGP(r3)
            return
        L_0x0072:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r1 = r4.A02
            X.A0I r1 = (X.A0I) r1
            java.lang.Object r0 = r4.A01
            X.9XS r0 = (X.AnonymousClass9XS) r0
            X.A0I.A00(r1, r0, r3)
            return
        L_0x0082:
            r6 = 0
            X.C18070vi.A0d(r3, r6)
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0118
            X.161 r7 = r3.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlDataProcessor"
            X.C18070vi.A0z(r7, r0)
            X.8tK r7 = (X.C172378tK) r7
            java.lang.Object r5 = r4.A02
            X.AS5 r5 = (X.AS5) r5
            X.9t0 r3 = r5.A04
            byte[] r4 = r3.A04
            r2 = 16
            r1 = 0
        L_0x009e:
            byte r0 = r4[r1]
            r0 = r0 ^ -1
            byte r0 = (byte) r0
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x009e
            X.9ng r2 = r5.A05
            java.lang.Object r1 = r7.A00
            X.C18070vi.A0b(r1)
            java.lang.String r1 = (java.lang.String) r1
            javax.crypto.SecretKey r0 = r3.A03
            r3 = 0
            java.lang.String r1 = r2.A00(r1, r0, r4)
            int r0 = r7.A00
            if (r0 != 0) goto L_0x00cf
            if (r1 == 0) goto L_0x00c5
            X.BAm r0 = r5.A03
            r0.C7k(r1)
            return
        L_0x00c5:
            X.BAm r2 = r5.A03
            java.lang.String r1 = "extensions-decryption-failed-exception"
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2.Bt6(r0, r1, r3)
            return
        L_0x00cf:
            X.BAm r5 = r5.A03
            r4 = 0
            if (r1 == 0) goto L_0x0107
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "error_msg"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ all -> 0x00e8 }
            if (r3 == 0) goto L_0x00e6
            int r0 = r3.length()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00ed
        L_0x00e6:
            r3 = r4
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r0)
        L_0x00ed:
            java.lang.Throwable r2 = X.C30671eK.A00(r3)
            if (r2 == 0) goto L_0x0100
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowDataExchangeRequest/processErrorPayload() - null payload "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0100:
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0105
            r4 = r3
        L_0x0105:
            java.lang.String r4 = (java.lang.String) r4
        L_0x0107:
            java.lang.Integer r0 = r7.A01
            X.C18070vi.A0d(r0, r6)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r0 != r1) goto L_0x0112
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x0112:
            java.lang.String r0 = "extensions-invalid-flow-token-error"
            r5.Bt6(r1, r0, r4)
            return
        L_0x0118:
            java.lang.Object r7 = r4.A02
            X.AS5 r7 = (X.AS5) r7
            java.lang.Object r10 = r4.A01
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            X.163 r5 = r3.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlErrorProcessor"
            X.C18070vi.A0z(r5, r0)
            java.util.Map r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x018c
            java.util.Set r2 = r0.keySet()
        L_0x0130:
            X.C18070vi.A0b(r2)
            r0 = 2498061(0x261e0d, float:3.500529E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0189
            java.lang.String r3 = "extensions-business-decryption-error"
        L_0x0142:
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0271
            java.util.Map r0 = r5.A00
            if (r0 == 0) goto L_0x014e
            java.util.Set r4 = r0.keySet()
        L_0x014e:
            X.C18070vi.A0b(r4)
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0271
            X.0ve r5 = r7.A02
            X.1KB r4 = r7.A01
            X.10I r3 = r7.A06
            X.9ng r8 = r7.A05
            X.9t0 r2 = r7.A04
            X.BAm r1 = r7.A03
            X.9ir r0 = r7.A00
            X.AS5 r9 = new X.AS5
            r11 = r9
            r12 = r0
            r13 = r4
            r14 = r5
            r15 = r1
            r16 = r2
            r17 = r8
            r18 = r3
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r11 = r2.A00
            java.lang.String r12 = r2.A02
            javax.crypto.SecretKey r14 = r2.A03
            byte[] r15 = r2.A04
            r16 = 1
            java.lang.String r13 = "UNKNOWN"
            r17 = r6
            r18 = r6
            goto L_0x0209
        L_0x0189:
            java.lang.String r3 = "extensions-business-endpoint-response-error"
            goto L_0x0142
        L_0x018c:
            r2 = r4
            goto L_0x0130
        L_0x018e:
            java.lang.Object r0 = r4.A02
            X.AS6 r0 = (X.AS6) r0
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.163 r9 = r3.A04
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlErrorProcessor"
            X.C18070vi.A0z(r9, r3)
            X.8tN r9 = (X.C172408tN) r9
            java.util.Map r3 = r9.A00
            r6 = 0
            if (r3 == 0) goto L_0x0212
            java.util.Set r5 = r3.keySet()
        L_0x01a8:
            X.C18070vi.A0b(r5)
            r3 = 2498061(0x261e0d, float:3.500529E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r3 = r5.contains(r4)
            if (r3 == 0) goto L_0x020f
            java.lang.String r13 = "extensions-business-decryption-error"
        L_0x01ba:
            boolean r3 = r0.A0B
            if (r3 == 0) goto L_0x0214
            java.util.Map r3 = r9.A00
            if (r3 == 0) goto L_0x020d
            java.util.Set r3 = r3.keySet()
        L_0x01c6:
            X.C18070vi.A0b(r3)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0214
            X.9t0 r14 = r0.A07
            android.app.Activity r7 = r0.A00
            X.9kz r10 = r0.A03
            boolean r4 = r0.A0C
            X.9ng r15 = r0.A08
            X.9ir r8 = r0.A01
            X.1KB r9 = r0.A02
            X.10I r3 = r0.A0A
            X.122 r12 = r0.A05
            X.0ve r13 = r0.A06
            X.A25 r11 = r0.A04
            X.1W6 r0 = r0.A09
            X.AS6 r6 = new X.AS6
            r17 = r3
            r18 = r2
            r19 = r4
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r5 = r14.A00
            java.lang.String r4 = r14.A02
            javax.crypto.SecretKey r3 = r14.A03
            byte[] r0 = r14.A04
            r16 = 1
            java.lang.String r13 = "UNKNOWN"
            r8 = r15
            r9 = r6
            r10 = r1
            r11 = r5
            r12 = r4
            r14 = r3
            r15 = r0
            r17 = r2
        L_0x0209:
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x020d:
            r3 = r6
            goto L_0x01c6
        L_0x020f:
            java.lang.String r13 = "extensions-business-endpoint-response-error"
            goto L_0x01ba
        L_0x0212:
            r5 = r6
            goto L_0x01a8
        L_0x0214:
            X.0ve r2 = r0.A06
            r1 = 3192(0xc78, float:4.473E-42)
            java.lang.String r1 = r2.A0I(r1)
            r5 = 1
            if (r1 == 0) goto L_0x0234
            java.util.List r2 = X.C108985cd.A0s(r1, r5)
            if (r2 == 0) goto L_0x0234
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x024b
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x024b
        L_0x022f:
            r5 = 0
        L_0x0230:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
        L_0x0234:
            android.app.Activity r7 = r0.A00
            X.9kz r8 = r0.A03
            boolean r15 = X.C72453Mb.A1Y(r6)
            r11 = 0
            r14 = 1
            X.1KB r1 = r0.A02
            X.Ajb r6 = new X.Ajb
            r12 = r11
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.CGP(r6)
            return
        L_0x024b:
            java.util.Iterator r4 = r2.iterator()
        L_0x024f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x022f
            java.lang.String r3 = X.C17880vN.A0v(r4)
            java.util.Map r1 = r9.A00
            if (r1 == 0) goto L_0x026f
            java.util.Set r2 = r1.keySet()
        L_0x0261:
            X.C18070vi.A0b(r2)
            int r1 = java.lang.Integer.parseInt(r3)
            boolean r1 = X.C108965cb.A1b(r2, r1)
            if (r1 == 0) goto L_0x024f
            goto L_0x0230
        L_0x026f:
            r2 = r6
            goto L_0x0261
        L_0x0271:
            X.BAm r2 = r7.A03
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2.Bt6(r0, r3, r1)
            return
        L_0x027a:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r4.A02
            X.9ct r0 = (X.C185629ct) r0
            X.1KB r2 = r0.A01
            java.lang.Object r1 = r4.A01
            r0 = 24
            X.C21450AkH.A00(r2, r3, r1, r0)
            return
        L_0x028c:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r4.A02
            X.9cs r0 = (X.C185619cs) r0
            X.1KB r2 = r0.A01
            java.lang.Object r1 = r4.A01
            r0 = 20
            X.C21450AkH.A00(r2, r1, r3, r0)
            return
        L_0x029e:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.161 r2 = r3.A03
            X.C18070vi.A0X(r2)
            X.163 r1 = r3.A04
            X.C18070vi.A0X(r1)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x02d1
            r2 = 0
            java.lang.Object r1 = r1.A00()
            boolean r0 = r1 instanceof X.C179969Kp
            if (r0 == 0) goto L_0x02bc
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x02bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ArdScriptingMetadataDownloader Error response: "
            X.C17900vP.A0X(r2, r0, r1)
            java.lang.Object r0 = r4.A01
            X.9ca r0 = (X.C185439ca) r0
            if (r2 != 0) goto L_0x02cd
            X.8fR r2 = X.C167118fR.A00
        L_0x02cd:
            A00(r0, r2)
            return
        L_0x02d1:
            java.lang.String r0 = "ArdScriptingMetadataDownloader Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r2.A00
            X.9pK r0 = (X.C192969pK) r0
            if (r0 != 0) goto L_0x02e3
            java.lang.Object r0 = r4.A01
            X.9ca r0 = (X.C185439ca) r0
            X.8fQ r2 = X.C167108fQ.A00
            goto L_0x02cd
        L_0x02e3:
            java.lang.Object r4 = r4.A01
            X.9ca r4 = (X.C185439ca) r4
            X.9px r0 = r0.A00
            java.lang.String r3 = "0061d80511e92ac2cf5a223b747610eb2f8729ee"
            int r2 = r0.A00
            java.lang.String r1 = r0.A01
            com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata r0 = new com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata
            r0.<init>(r3, r2, r1)
            X.9yL r2 = r4.A02
            X.A4D r7 = r4.A01
            X.9mp r1 = r4.A00
            X.A8i r3 = r2.A00
            java.lang.String r0 = r0.mCdnUrl
            X.C18070vi.A0X(r0)
            X.AEq r0 = X.C20282AEq.A00(r0)
            java.util.List r8 = X.C18070vi.A0M(r0)
            X.9OY r6 = new X.9OY
            r6.<init>()
            r0 = 1
            X.AIP r5 = new X.AIP
            r5.<init>(r1, r7, r2, r0)
            r4 = 0
            r3.A09(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU4.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        AnonymousClass1KB r3;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(iOException, 0);
                A00((C185439ca) this.A01, iOException);
                return;
            case 1:
                r3 = ((C185619cs) this.A02).A01;
                runnable = new C21445AkC(this.A01, 2);
                break;
            case 2:
                C18070vi.A0d(iOException, 0);
                r3 = ((C185629ct) this.A02).A01;
                runnable = new C21450AkH(this.A01, iOException, 25);
                break;
            case 3:
                ((AS5) this.A02).A03.Bt6(AnonymousClass00R.A00, "extensions-no-network-error", (String) null);
                return;
            case 4:
                C18070vi.A0d(iOException, 0);
                A0I a0i = (A0I) this.A02;
                a0i.A02.set(false);
                a0i.A01(C171978sa.A00, (AnonymousClass9XS) this.A01, iOException.getMessage(), iOException);
                return;
            default:
                AS6 as6 = (AS6) this.A02;
                as6.A02.CGP(new C21408Ajb(as6.A00, as6.A03, (C172408tN) null, as6, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", true, false));
                return;
        }
        r3.A0J(runnable);
    }

    public void Bsw(Exception exc) {
        AnonymousClass1KB r3;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(exc, 0);
                A00((C185439ca) this.A01, exc);
                return;
            case 1:
                r3 = ((C185619cs) this.A02).A01;
                runnable = new C21445AkC(this.A01, 1);
                break;
            case 2:
                C18070vi.A0d(exc, 0);
                r3 = ((C185629ct) this.A02).A01;
                runnable = new C21450AkH(this.A01, exc, 23);
                break;
            case 3:
                ((AS5) this.A02).A03.Bt6(AnonymousClass00R.A00, "extensions-data-exchange-graphql-response-error", (String) null);
                return;
            case 4:
                C18070vi.A0d(exc, 0);
                A0I a0i = (A0I) this.A02;
                a0i.A02.set(false);
                a0i.A01(C171978sa.A00, (AnonymousClass9XS) this.A01, exc.getMessage(), exc);
                return;
            default:
                AS6 as6 = (AS6) this.A02;
                as6.A02.CGP(new C21408Ajb(as6.A00, as6.A03, (C172408tN) null, as6, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", true, false));
                return;
        }
        r3.A0J(runnable);
    }
}
