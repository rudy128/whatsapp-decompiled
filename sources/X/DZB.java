package X;

import java.util.Date;

public class DZB implements E8M {
    public Date A00 = null;
    public C25597Cic A01;
    public final E3R A02;

    public DZB(E3R e3r) {
        this.A02 = e3r;
    }

    public void BdV(C25597Cic cic) {
        this.A01 = cic;
        this.A00 = new Date();
    }

    /* JADX WARNING: type inference failed for: r0v66, types: [X.DxU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v12, types: [X.DxT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v68, types: [X.Dwt, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0179 A[Catch:{ C2W -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0189 A[Catch:{ C2W -> 0x01fb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void check(java.security.cert.Certificate r31) {
        /*
            r30 = this;
            r11 = r31
            r10 = r30
            X.Cic r9 = r10.A01     // Catch:{ C2W -> 0x01fb }
            X.DU9 r8 = r9.A05     // Catch:{ C2W -> 0x01fb }
            java.util.Date r0 = r10.A00     // Catch:{ C2W -> 0x01fb }
            r21 = r0
            java.util.Date r0 = r9.A04     // Catch:{ C2W -> 0x01fb }
            long r0 = r0.getTime()     // Catch:{ C2W -> 0x01fb }
            java.util.Date r7 = new java.util.Date     // Catch:{ C2W -> 0x01fb }
            r7.<init>(r0)     // Catch:{ C2W -> 0x01fb }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ C2W -> 0x01fb }
            X.Cic r1 = r10.A01     // Catch:{ C2W -> 0x01fb }
            java.security.cert.X509Certificate r0 = r1.A03     // Catch:{ C2W -> 0x01fb }
            r20 = r0
            java.security.PublicKey r0 = r1.A01     // Catch:{ C2W -> 0x01fb }
            r18 = r0
            java.security.cert.CertPath r0 = r1.A02     // Catch:{ C2W -> 0x01fb }
            java.util.List r23 = r0.getCertificates()     // Catch:{ C2W -> 0x01fb }
            X.E3R r0 = r10.A02     // Catch:{ C2W -> 0x01fb }
            r17 = r0
            java.lang.String r0 = X.C26295Cx7.A04     // Catch:{ Exception -> 0x01eb }
            X.1Bz r0 = X.C26284Cwf.A05(r0, r11)     // Catch:{ Exception -> 0x01eb }
            X.DxG r16 = X.C28308DxG.A01(r0)     // Catch:{ Exception -> 0x01eb }
            X.CpU r14 = new X.CpU     // Catch:{ C2W -> 0x01fb }
            r14.<init>((X.DU9) r8)     // Catch:{ C2W -> 0x01fb }
            java.util.Map r3 = r8.A06     // Catch:{ C2W -> 0x01e3 }
            if (r16 != 0) goto L_0x0056
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ C2W -> 0x01e3 }
        L_0x0042:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ C2W -> 0x01e3 }
        L_0x0046:
            boolean r0 = r2.hasNext()     // Catch:{ C2W -> 0x01e3 }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()     // Catch:{ C2W -> 0x01e3 }
            java.util.List r0 = r14.A01     // Catch:{ C2W -> 0x01e3 }
            r0.add(r1)     // Catch:{ C2W -> 0x01e3 }
            goto L_0x0046
        L_0x0056:
            X.Dwt[] r12 = r16.A0D()     // Catch:{ Exception -> 0x01db }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ C2W -> 0x01e3 }
            r2 = 0
        L_0x005f:
            int r6 = r12.length     // Catch:{ C2W -> 0x01e3 }
            if (r2 >= r6) goto L_0x0087
            r0 = r12[r2]     // Catch:{ C2W -> 0x01e3 }
            X.DxT r1 = r0.A00     // Catch:{ C2W -> 0x01e3 }
            if (r1 == 0) goto L_0x0084
            int r0 = r1.A00     // Catch:{ C2W -> 0x01e3 }
            if (r0 != 0) goto L_0x0084
            X.1Bx r0 = r1.A01     // Catch:{ C2W -> 0x01e3 }
            X.DxU[] r4 = X.C28317DxP.A01(r0)     // Catch:{ C2W -> 0x01e3 }
            r1 = 0
        L_0x0073:
            int r0 = r4.length     // Catch:{ C2W -> 0x01e3 }
            if (r1 >= r0) goto L_0x0084
            r0 = r4[r1]     // Catch:{ C2W -> 0x01e3 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ C2W -> 0x01e3 }
            if (r0 == 0) goto L_0x0081
            r13.add(r0)     // Catch:{ C2W -> 0x01e3 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0087:
            boolean r0 = r13.isEmpty()     // Catch:{ C2W -> 0x01e3 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C25917Cob.A01(r0)     // Catch:{ C2W -> 0x01e3 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "X.509"
            r0 = r17
            X.DZI r0 = (X.DZI) r0     // Catch:{ Exception -> 0x01cb }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x01cb }
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x01cb }
            r5 = 0
        L_0x00a2:
            if (r5 >= r6) goto L_0x0042
            r0 = r12[r5]     // Catch:{ C2W -> 0x01e3 }
            X.DxT r1 = r0.A00     // Catch:{ C2W -> 0x01e3 }
            if (r1 == 0) goto L_0x00d7
            int r0 = r1.A00     // Catch:{ C2W -> 0x01e3 }
            if (r0 != 0) goto L_0x00d7
            X.1Bx r0 = r1.A01     // Catch:{ C2W -> 0x01e3 }
            X.DxU[] r4 = X.C28317DxP.A01(r0)     // Catch:{ C2W -> 0x01e3 }
            r3 = 0
        L_0x00b5:
            int r0 = r4.length     // Catch:{ C2W -> 0x01e3 }
            if (r3 >= r0) goto L_0x00d7
            r2 = r4[r5]     // Catch:{ C2W -> 0x01e3 }
            int r1 = r2.A00     // Catch:{ C2W -> 0x01e3 }
            r0 = 6
            if (r1 != r0) goto L_0x00d4
            X.1Bx r0 = r2.A01     // Catch:{ Exception -> 0x00d4 }
            X.E74 r0 = (X.E74) r0     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r0.BZl()     // Catch:{ Exception -> 0x00d4 }
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00d4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d4 }
            X.DSI r0 = X.C26085Cs2.A01(r0, r15, r7)     // Catch:{ Exception -> 0x00d4 }
            r13.add(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00d7
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00d7:
            int r5 = r5 + 1
            goto L_0x00a2
        L_0x00da:
            X.COn r3 = new X.COn     // Catch:{ C2W -> 0x01fb }
            r3.<init>()     // Catch:{ C2W -> 0x01fb }
            X.Cp7 r2 = new X.Cp7     // Catch:{ C2W -> 0x01fb }
            r2.<init>()     // Catch:{ C2W -> 0x01fb }
            X.DU9 r6 = new X.DU9     // Catch:{ C2W -> 0x01fb }
            r6.<init>(r14)     // Catch:{ C2W -> 0x01fb }
            r4 = 11
            r5 = 0
            if (r16 == 0) goto L_0x011d
            X.Dwt[] r12 = r16.A0D()     // Catch:{ Exception -> 0x01f3 }
            r1 = 0
            r14 = 0
        L_0x00f4:
            int r0 = r12.length     // Catch:{ C2W -> 0x01fb }
            if (r1 >= r0) goto L_0x011e
            int r0 = r3.A00     // Catch:{ C2W -> 0x01fb }
            if (r0 != r4) goto L_0x011e
            int r13 = r2.A00     // Catch:{ C2W -> 0x01fb }
            X.Cp7 r0 = X.C25941Cp7.A01     // Catch:{ C2W -> 0x01fb }
            int r0 = r0.A00     // Catch:{ C2W -> 0x01fb }
            if (r13 == r0) goto L_0x011e
            r24 = r12[r1]     // Catch:{ C2W -> 0x0117 }
            r22 = r7
            r25 = r9
            r26 = r6
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C26295Cx7.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ C2W -> 0x0117 }
            goto L_0x0119
        L_0x0117:
            r5 = move-exception
            goto L_0x011a
        L_0x0119:
            r14 = 1
        L_0x011a:
            int r1 = r1 + 1
            goto L_0x00f4
        L_0x011d:
            r14 = 0
        L_0x011e:
            int r0 = r3.A00     // Catch:{ C2W -> 0x01fb }
            if (r0 != r4) goto L_0x0170
            int r1 = r2.A00     // Catch:{ C2W -> 0x01fb }
            X.Cp7 r0 = X.C25941Cp7.A01     // Catch:{ C2W -> 0x01fb }
            int r0 = r0.A00     // Catch:{ C2W -> 0x01fb }
            if (r1 == r0) goto L_0x0170
            X.DxW r5 = X.C26068Cri.A01(r11)     // Catch:{ RuntimeException -> 0x0167 }
            r1 = 4
            X.DxU r0 = new X.DxU     // Catch:{ C2W -> 0x016f }
            r0.<init>()     // Catch:{ C2W -> 0x016f }
            r0.A01 = r5     // Catch:{ C2W -> 0x016f }
            r0.A00 = r1     // Catch:{ C2W -> 0x016f }
            X.DxP r1 = new X.DxP     // Catch:{ C2W -> 0x016f }
            r1.<init>((X.C28322DxU) r0)     // Catch:{ C2W -> 0x016f }
            r0 = 0
            X.DxT r5 = new X.DxT     // Catch:{ C2W -> 0x016f }
            r5.<init>()     // Catch:{ C2W -> 0x016f }
            r5.A00 = r0     // Catch:{ C2W -> 0x016f }
            r5.A01 = r1     // Catch:{ C2W -> 0x016f }
            r1 = 0
            X.Dwt r0 = new X.Dwt     // Catch:{ C2W -> 0x016f }
            r0.<init>()     // Catch:{ C2W -> 0x016f }
            r0.A00 = r5     // Catch:{ C2W -> 0x016f }
            r0.A02 = r1     // Catch:{ C2W -> 0x016f }
            r0.A01 = r1     // Catch:{ C2W -> 0x016f }
            r22 = r7
            r24 = r0
            r25 = r9
            r26 = r8
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C26295Cx7.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ C2W -> 0x016f }
            goto L_0x0175
        L_0x0167:
            r1 = move-exception
            java.lang.String r0 = "Issuer from certificate for CRL could not be reencoded."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x016f }
            throw r0     // Catch:{ C2W -> 0x016f }
        L_0x016f:
            r5 = move-exception
        L_0x0170:
            if (r14 != 0) goto L_0x0175
            if (r5 != 0) goto L_0x01fa
            goto L_0x01c4
        L_0x0175:
            int r0 = r3.A00     // Catch:{ C2W -> 0x01fb }
            if (r0 != r4) goto L_0x0189
            int r1 = r2.A00     // Catch:{ C2W -> 0x01fb }
            X.Cp7 r0 = X.C25941Cp7.A01     // Catch:{ C2W -> 0x01fb }
            int r0 = r0.A00     // Catch:{ C2W -> 0x01fb }
            if (r1 != r0) goto L_0x0182
            return
        L_0x0182:
            java.lang.String r0 = "Certificate status could not be determined."
            X.C2W r5 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x01fb }
            goto L_0x01fa
        L_0x0189:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss Z"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ C2W -> 0x01fb }
            r2.<init>(r0)     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ C2W -> 0x01fb }
            r2.setTimeZone(r0)     // Catch:{ C2W -> 0x01fb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = "Certificate revocation after "
            r1.append(r0)     // Catch:{ C2W -> 0x01fb }
            java.util.Date r0 = r3.A01     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = r2.format(r0)     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ C2W -> 0x01fb }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = ", reason: "
            r2.append(r0)     // Catch:{ C2W -> 0x01fb }
            java.lang.String[] r1 = X.C26295Cx7.A0D     // Catch:{ C2W -> 0x01fb }
            int r0 = r3.A00     // Catch:{ C2W -> 0x01fb }
            r0 = r1[r0]     // Catch:{ C2W -> 0x01fb }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ C2W -> 0x01fb }
            X.C2W r0 = X.C2W.A00(r0)     // Catch:{ C2W -> 0x01fb }
            goto L_0x01ca
        L_0x01c4:
            java.lang.String r0 = "No valid CRL found."
            X.C2W r0 = X.C2W.A01(r0, r5)     // Catch:{ C2W -> 0x01fb }
        L_0x01ca:
            throw r0     // Catch:{ C2W -> 0x01fb }
        L_0x01cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2W -> 0x01e3 }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ C2W -> 0x01e3 }
            X.C2W r0 = X.C2W.A01(r0, r2)     // Catch:{ C2W -> 0x01e3 }
            goto L_0x01e2
        L_0x01db:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.C2W r0 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x01e3 }
        L_0x01e2:
            throw r0     // Catch:{ C2W -> 0x01e3 }
        L_0x01e3:
            r1 = move-exception
            java.lang.String r0 = "No additional CRL locations could be decoded from CRL distribution point extension."
            X.C2W r5 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x01fb }
            goto L_0x01fa
        L_0x01eb:
            r1 = move-exception
            java.lang.String r0 = "CRL distribution point extension could not be read."
            X.C2W r5 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x01fb }
            goto L_0x01fa
        L_0x01f3:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.C2W r5 = X.C2W.A01(r0, r1)     // Catch:{ C2W -> 0x01fb }
        L_0x01fa:
            throw r5     // Catch:{ C2W -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            java.lang.Throwable r2 = r0._underlyingException
            if (r2 != 0) goto L_0x0201
            r2 = r0
        L_0x0201:
            java.lang.String r1 = r0.getMessage()
            X.Cic r0 = r10.A01
            java.security.cert.CertPathValidatorException r0 = X.C25597Cic.A00(r1, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZB.check(java.security.cert.Certificate):void");
    }
}
