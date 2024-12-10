package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import java.util.List;

/* renamed from: X.AkU  reason: case insensitive filesystem */
public class C21463AkU implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C21463AkU(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A06 = str;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d5, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ExcHandler: IOException | RuntimeException | URISyntaxException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:20:0x0151] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r0 = r31
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x0025;
                case 2: goto L_0x00ce;
                case 3: goto L_0x013a;
                case 4: goto L_0x01ee;
                case 5: goto L_0x0328;
                case 6: goto L_0x03e9;
                case 7: goto L_0x0428;
                case 8: goto L_0x047f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A01
            X.6wz r4 = (X.C138386wz) r4
            java.lang.Object r2 = r0.A02
            X.77S r2 = (X.AnonymousClass77S) r2
            java.lang.String r5 = r0.A06
            java.lang.Object r6 = r0.A03
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = r0.A04
            X.6n3 r3 = (X.AnonymousClass6n3) r3
            java.lang.Object r1 = r0.A05
            X.705 r1 = (X.AnonymousClass705) r1
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.C138386wz.A00(r1, r2, r3, r4, r5, r6)
        L_0x0024:
            return
        L_0x0025:
            java.lang.String r3 = "lam:LinkedDeviceManager"
            java.lang.Object r2 = r0.A02     // Catch:{ IOException -> 0x0548 }
            android.bluetooth.BluetoothAdapter r2 = (android.bluetooth.BluetoothAdapter) r2     // Catch:{ IOException -> 0x0548 }
            java.lang.String r1 = r0.A06     // Catch:{ IOException -> 0x0548 }
            android.bluetooth.BluetoothDevice r2 = r2.getRemoteDevice(r1)     // Catch:{ IOException -> 0x0548 }
            java.lang.String r1 = "8B0D2687-42A4-44CB-9436-FBA3B9B96DE2"
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch:{ IOException -> 0x0548 }
            android.bluetooth.BluetoothSocket r6 = r2.createRfcommSocketToServiceRecord(r1)     // Catch:{ IOException -> 0x0548 }
            if (r6 == 0) goto L_0x0024
            java.lang.Object r4 = r0.A05     // Catch:{ IOException -> 0x0548 }
            X.9hg r4 = (X.C188599hg) r4     // Catch:{ IOException -> 0x0548 }
            java.lang.Object r8 = r0.A01     // Catch:{ IOException -> 0x0548 }
            java.util.UUID r8 = (java.util.UUID) r8     // Catch:{ IOException -> 0x0548 }
            java.lang.Object r12 = r0.A03     // Catch:{ IOException -> 0x0548 }
            X.1Di r12 = (X.C22821Di) r12     // Catch:{ IOException -> 0x0548 }
            java.lang.Object r5 = r0.A04     // Catch:{ IOException -> 0x0548 }
            X.BTW r5 = (X.BTW) r5     // Catch:{ IOException -> 0x0548 }
            java.lang.String r1 = "Connecting to bluetooth socket..."
            X.C26294Cx6.A06(r3, r1)     // Catch:{ IOException -> 0x0548 }
            java.util.ArrayDeque r2 = r4.A06     // Catch:{ IOException -> 0x0548 }
            X.AtI r1 = new X.AtI     // Catch:{ IOException -> 0x0548 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0548 }
            r2.add(r1)     // Catch:{ IOException -> 0x0548 }
            r6.connect()     // Catch:{ IOException -> 0x0548 }
            java.lang.String r1 = "CONNECTED to bluetooth socket..."
            X.C26294Cx6.A06(r3, r1)     // Catch:{ IOException -> 0x0548 }
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ IOException -> 0x0548 }
            byte[] r1 = X.C24591CAm.A00(r8)     // Catch:{ IOException -> 0x0548 }
            r7.write(r1)     // Catch:{ IOException -> 0x0548 }
            X.Csp r7 = r4.A00     // Catch:{ IOException -> 0x0548 }
            if (r7 != 0) goto L_0x0095
            java.lang.String r1 = "connectSecureBtcSocket: Creating LinkedDevice object"
            X.C26294Cx6.A06(r3, r1)     // Catch:{ IOException -> 0x0548 }
            java.util.UUID r9 = r4.A07     // Catch:{ IOException -> 0x0548 }
            r1 = 2
            X.Are r10 = new X.Are     // Catch:{ IOException -> 0x0548 }
            r10.<init>(r4, r1)     // Catch:{ IOException -> 0x0548 }
            r1 = 3
            X.Are r11 = new X.Are     // Catch:{ IOException -> 0x0548 }
            r11.<init>(r4, r1)     // Catch:{ IOException -> 0x0548 }
            r1 = 1
            X.Arh r13 = new X.Arh     // Catch:{ IOException -> 0x0548 }
            r13.<init>(r4, r1)     // Catch:{ IOException -> 0x0548 }
            X.CCP r8 = r4.A03     // Catch:{ IOException -> 0x0548 }
            X.Csp r7 = new X.Csp     // Catch:{ IOException -> 0x0548 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0548 }
            r4.A00 = r7     // Catch:{ IOException -> 0x0548 }
        L_0x0095:
            X.8Qv r1 = X.C180959Op.A00(r6)     // Catch:{ IOException -> 0x0548 }
            r7.A03(r1, r5)     // Catch:{ IOException -> 0x0548 }
            X.AtJ r1 = new X.AtJ     // Catch:{ IOException -> 0x0548 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0548 }
            r2.add(r1)     // Catch:{ IOException -> 0x0548 }
            goto L_0x0547
        L_0x00a6:
            java.lang.Object r2 = r0.A03
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r2 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r2
            X.D8B r4 = r2.A03
            java.lang.String r1 = "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior"
            X.C18070vi.A0z(r4, r1)
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r8 = "com.bloks.www.avatar.editor.cds.launcher"
            java.lang.Object r5 = r0.A04
            X.BDM r5 = (X.BDM) r5
            java.lang.Object r7 = r0.A01
            X.B4m r7 = (X.C22358B4m) r7
            r6 = 0
            X.EAQ r1 = X.A8X.A01(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.A05
            X.8d6 r0 = (X.AnonymousClass8d6) r0
            r2.A2E(r1, r0)
            return
        L_0x00ce:
            java.lang.Object r3 = r0.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r1 = r0.A02
            X.3TA r1 = (X.AnonymousClass3TA) r1
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.String r11 = r0.A06
            r6 = 0
            java.lang.Object r13 = r0.A05
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r5 = r0.A04
            X.7Fe r5 = (X.C143887Fe) r5
            r17 = 0
            X.36w r4 = r1.A05
            X.36w r1 = r1.A04
            boolean r0 = r2 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0117
            X.1Sb r5 = r3.A0j
            X.205 r0 = r2.A0v
            X.1BI r8 = r0.A00
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r7 = r0.A02
            int r15 = r2.A0u
            int r4 = r2.A09
            java.lang.String r12 = r2.A0Q()
            r0 = 4
            boolean r18 = r2.A11(r0)
            r10 = r6
            r14 = r6
            r9 = r6
            r19 = r17
            r16 = r4
            X.21V r0 = r5.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0113:
            X.C33251iW.A0B(r3, r2, r0)
            return
        L_0x0117:
            X.205 r0 = r2.A0v
            X.1BI r0 = r0.A00
            r22 = r6
            r25 = r6
            r29 = r17
            r30 = r17
            r18 = r3
            r19 = r5
            r20 = r0
            r21 = r6
            r23 = r4
            r24 = r1
            r26 = r11
            r27 = r13
            r28 = r17
            X.210 r0 = X.C33251iW.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0113
        L_0x013a:
            java.lang.Object r8 = r0.A01
            X.7Fe r8 = (X.C143887Fe) r8
            java.lang.Object r1 = r0.A02
            X.0vb r1 = (X.C18000vb) r1
            java.lang.Object r5 = r0.A03
            X.0ve r5 = (X.C18030ve) r5
            java.lang.Object r4 = r0.A04
            X.1KB r4 = (X.AnonymousClass1KB) r4
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A05
            X.18K r2 = (X.AnonymousClass18K) r2
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            java.lang.String r0 = r1.A05()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r8.A0J(r5, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            boolean r0 = r8.A0K()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            if (r0 == 0) goto L_0x01d0
            r0 = 9584(0x2570, float:1.343E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            boolean r0 = X.C18020vd.A05(r6, r5, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            if (r0 == 0) goto L_0x01c4
            X.0ve r1 = r8.A0R     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r0 = 12193(0x2fa1, float:1.7086E-41)
            int r0 = X.C18020vd.A00(r6, r1, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            int r7 = r0 * 1024
            r0 = 5
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r1 = 0
            java.lang.String r0 = "icon"
            r6[r1] = r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r1 = 1
            java.lang.String r0 = "apple-touch-icon"
            r6[r1] = r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r1 = 2
            java.lang.String r0 = "default_favicon_link"
            r6[r1] = r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r1 = 3
            java.lang.String r0 = "shortcut icon"
            r6[r1] = r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r1 = 4
            java.lang.String r0 = "apple-touch-icon-precomposed"
            java.util.List r0 = X.C18070vi.A0O(r0, r6, r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
        L_0x0197:
            boolean r0 = r6.hasNext()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r1 = r6.next()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            java.util.HashMap r0 = r8.A0C     // Catch:{ 6QU -> 0x01b0, IOException -> 0x0197, IOException | RuntimeException | URISyntaxException -> 0x01d9, IOException | RuntimeException | URISyntaxException -> 0x01d9 }
            java.lang.String r1 = X.C108945cZ.A1G(r1, r0)     // Catch:{ 6QU -> 0x01b0, IOException -> 0x0197, IOException | RuntimeException | URISyntaxException -> 0x01d9, IOException | RuntimeException | URISyntaxException -> 0x01d9 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ 6QU -> 0x01b0, IOException -> 0x0197, IOException | RuntimeException | URISyntaxException -> 0x01d9, IOException | RuntimeException | URISyntaxException -> 0x01d9 }
            byte[] r9 = X.C143887Fe.A0B(r8, r0, r1, r7)     // Catch:{ 6QU -> 0x01b0, IOException -> 0x0197, IOException | RuntimeException | URISyntaxException -> 0x01d9, IOException | RuntimeException | URISyntaxException -> 0x01d9 }
            if (r9 == 0) goto L_0x0197
            goto L_0x01b6
        L_0x01b0:
            java.lang.String r0 = "WebPageInfo/loadFavicon Image too large to fetch"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            goto L_0x0197
        L_0x01b6:
            r10 = 16
            r12 = 32
            r14 = 0
            r15 = 1
            r11 = r10
            r13 = r12
            byte[] r0 = r8.A0N(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r8.A0I = r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
        L_0x01c4:
            r1 = 0
            X.4rN r0 = new X.4rN     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r0.<init>(r8, r3, r1, r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r4.A0J(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            r8.A0H(r5)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
        L_0x01d0:
            r8.A0E()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x01d9, all -> 0x01d4 }
            goto L_0x01d9
        L_0x01d4:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01d9:
            android.net.TrafficStats.clearThreadStatsTag()
            X.64L r0 = r8.A04
            if (r0 == 0) goto L_0x01e3
            r2.CC7(r0)
        L_0x01e3:
            r2 = 1
            r1 = 0
            X.4rN r0 = new X.4rN
            r0.<init>(r8, r3, r1, r2)
            r4.A0J(r0)
            return
        L_0x01ee:
            java.lang.Object r5 = r0.A01
            X.9yk r5 = (X.C198689yk) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r9 = r0.A03
            X.9qa r9 = (X.C193739qa) r9
            java.lang.String r1 = r0.A06
            r17 = r1
            java.lang.Object r3 = r0.A04
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r6 = r0.A05
            X.AEW r6 = (X.AEW) r6
            r0 = 1
            X.C18070vi.A0f(r4, r0, r3)
            X.00H r0 = r5.A06
            r18 = r0
            java.lang.Object r2 = r18.get()
            X.A2z r2 = (X.C20009A2z) r2
            X.00H r0 = r2.A0D
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass8BV.A0F(r4, r0)
            X.0z4 r0 = r2.A06
            java.lang.String r7 = r1.getRawString()
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dc_business_domain_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r1)
            java.lang.String r14 = X.C17880vN.A0r(r2, r0)
            java.lang.String r13 = r9.A01
            r7 = 0
            if (r14 == 0) goto L_0x0311
            X.0ve r2 = r5.A04
            r1 = 3401(0xd49, float:4.766E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r5.A01
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x0265
            if (r17 == 0) goto L_0x0265
        L_0x0251:
            r5.A01 = r13
            r5.A00 = r0
            java.lang.String r10 = "V1"
            r7 = r9
            r8 = r6
            r9 = r0
            r11 = r17
            r6 = r5
            X.9hY r7 = X.C198689yk.A00(r6, r7, r8, r9, r10, r11)
        L_0x0261:
            r3.invoke(r7)
            return
        L_0x0265:
            java.lang.Object r12 = r18.get()
            X.A2z r12 = (X.C20009A2z) r12
            java.lang.String r16 = "direct-connection-fail-to-generate-encryption-string"
            java.lang.String r11 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/"
            r8 = 0
            r1 = 2
            X.00H r0 = r12.A0D
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass8BV.A0F(r4, r0)
            java.lang.String r0 = r12.A01(r2)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r10 = ""
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/Null certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.190 r1 = r12.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = "direct-connection-failed-to-load-certificate-from-preferences"
            r1.A0G(r0, r10, r8)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            goto L_0x030e
        L_0x028d:
            java.lang.String r15 = "X.509"
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r15)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            byte[] r1 = android.util.Base64.decode(r0, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.security.cert.Certificate r1 = r15.generateCertificate(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            X.C18070vi.A0z(r1, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            javax.security.auth.x500.X500Principal r0 = r1.getSubjectX500Principal()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.C18070vi.A0X(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = X.AnonymousClass9PH.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            boolean r0 = r14.equals(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/Incorrect CN in certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.190 r1 = r12.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = "direct-connection-certificate-common-name-mismatch"
            r1.A0G(r0, r10, r8)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.0z4 r1 = r12.A06     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = r2.getRawString()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            r1.A1U(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            goto L_0x030e
        L_0x02d2:
            X.00H r0 = r12.A0A     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.Object r14 = r0.get()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.A4Q r14 = (X.A4Q) r14     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.C18070vi.A0X(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            X.9cd r10 = X.A4Q.A00(r13)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            javax.crypto.SecretKey r0 = r10.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            byte[] r2 = X.A4Q.A01(r1, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            r14.A00 = r0     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            byte[] r1 = r10.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            r14.A01 = r1     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            byte[] r0 = r10.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            java.lang.String r0 = X.AnonymousClass9PI.A00(r0, r2, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x02ff }
            if (r0 == 0) goto L_0x030e
            goto L_0x0251
        L_0x02ff:
            r0 = move-exception
            com.whatsapp.util.Log.e(r11, r0)
            X.190 r2 = r12.A04
            java.lang.String r1 = r0.toString()
            r0 = r16
            r2.A0G(r0, r1, r8)
        L_0x030e:
            java.lang.String r0 = "CatalogSearchCatalogPageRequestFactory/createRequest/EN"
            goto L_0x0313
        L_0x0311:
            java.lang.String r0 = "CatalogSearchCatalogPageRequestFactory/createRequest/DN"
        L_0x0313:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r18.get()
            X.A2z r2 = (X.C20009A2z) r2
            r0 = 1
            X.AMr r1 = new X.AMr
            r1.<init>(r5, r0)
            r0 = 0
            r2.A05(r1, r6, r4, r0)
            goto L_0x0261
        L_0x0328:
            java.lang.Object r8 = r0.A01
            X.4aY r8 = (X.AnonymousClass4aY) r8
            java.lang.Object r1 = r0.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r15 = r0.A06
            java.lang.Object r11 = r0.A04
            java.lang.Object r12 = r0.A05
            X.00H r0 = r8.A5l
            java.lang.Object r0 = r0.get()
            X.4X5 r0 = (X.AnonymousClass4X5) r0
            X.00H r0 = r0.A0H
            java.lang.Object r3 = r0.get()
            X.6t8 r3 = (X.C136016t8) r3
            java.util.LinkedList r10 = X.AnonymousClass8BR.A14()
            java.util.LinkedList r13 = X.AnonymousClass8BR.A14()
            X.73D r14 = new X.73D
            r14.<init>()
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Iterator r7 = r1.iterator()
        L_0x035f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03dc
            X.206 r1 = X.C17880vN.A0Y(r7)
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            X.25J r4 = X.C29681ch.A03
            boolean r4 = r0 instanceof X.C29681ch
            if (r4 == 0) goto L_0x035f
            X.1ch r0 = (X.C29681ch) r0
            if (r0 == 0) goto L_0x035f
            long r4 = r1.A0y
            int r6 = (int) r4
            X.5cQ r4 = r8.A2Q
            X.1Me r5 = r4.getWAContactNames()
            X.1E7 r4 = r8.A35
            java.lang.String r19 = r5.A0I(r4)
            if (r19 != 0) goto L_0x038a
            java.lang.String r19 = ""
        L_0x038a:
            boolean r4 = r1 instanceof X.AnonymousClass21V
            if (r4 == 0) goto L_0x03cd
            r4 = r1
            X.21V r4 = (X.AnonymousClass21V) r4
            java.lang.String r20 = r4.A18()
        L_0x0395:
            X.9Id r18 = X.AnonymousClass9Id.UPDATE_CARD
            X.Ac1 r4 = new X.Ac1
            r21 = r6
            r17 = r0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            X.1E7 r5 = r8.A35
            r21 = 1
            r0 = 0
            X.AnonymousClass3Ma.A1O(r2, r0, r5)
            r16 = r3
            r17 = r2
            r18 = r5
            r19 = r1
            r20 = r4
            X.72S r5 = r16.A01(r17, r18, r19, r20, r21)
            if (r5 == 0) goto L_0x035f
            android.net.Uri r1 = r5.A0X
            r10.add(r1)
            java.io.File r0 = r5.A0C()
            r13.add(r0)
            r14.A06(r5)
            r9.put(r1, r4)
            goto L_0x035f
        L_0x03cd:
            boolean r4 = r1 instanceof X.AnonymousClass210
            if (r4 == 0) goto L_0x03d9
            r4 = r1
            X.210 r4 = (X.AnonymousClass210) r4
            java.lang.String r20 = r4.A17()
            goto L_0x0395
        L_0x03d9:
            r20 = 0
            goto L_0x0395
        L_0x03dc:
            X.1KB r0 = r8.A1L
            r16 = 0
            X.7RG r7 = new X.7RG
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A0J(r7)
            return
        L_0x03e9:
            java.lang.Object r12 = r0.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r12 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r12
            java.lang.Object r2 = r0.A02
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.lang.String r15 = r0.A06
            java.lang.Object r11 = r0.A03
            com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment r11 = (com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment) r11
            java.lang.Object r13 = r0.A04
            com.whatsapp.payments.ui.PaymentBottomSheet r13 = (com.whatsapp.payments.ui.PaymentBottomSheet) r13
            java.lang.Object r14 = r0.A05
            X.21L r14 = (X.AnonymousClass21L) r14
            r1 = 1
            r0 = 2
            X.AnonymousClass3Ma.A1O(r15, r0, r11)
            X.A2C r3 = r12.A0G
            if (r3 == 0) goto L_0x0421
            int r7 = r2.get(r1)
            int r8 = r2.get(r0)
            int r9 = X.AnonymousClass8BT.A02(r2)
            X.AYu r4 = new X.AYu
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r5 = "p2m-lite-buyer-check"
            r6 = 0
            r3.A02(r4, r5, r6, r7, r8, r9)
            return
        L_0x0421:
            java.lang.String r0 = "paymentsComplianceManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0428:
            java.lang.Object r1 = r0.A01
            X.9dd r1 = (X.C186089dd) r1
            java.lang.Object r3 = r0.A02
            X.8Gd r3 = (X.AnonymousClass8Gd) r3
            java.lang.String r2 = r0.A06
            java.lang.Object r6 = r0.A03
            X.21K r6 = (X.AnonymousClass21K) r6
            java.lang.Object r5 = r0.A04
            X.122 r5 = (X.AnonymousClass122) r5
            java.lang.Object r4 = r0.A05
            X.BBR r4 = (X.BBR) r4
            X.8zf r1 = (X.C176028zf) r1
            java.util.List r1 = r1.A01
            boolean r0 = X.C137476vW.A00(r1)
            if (r0 != 0) goto L_0x0451
            X.1QS r0 = r3.A07
            X.1QR r0 = X.AnonymousClass8BR.A0O(r0)
            r0.A0g(r1)
        L_0x0451:
            X.BCp r0 = r3.A08
            X.AW0 r3 = r0.BL7(r2)
            X.AEt r0 = r6.BPK()
            r2 = 0
            if (r0 == 0) goto L_0x0479
            X.AEn r1 = r0.A02
        L_0x0460:
            if (r3 == 0) goto L_0x047b
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x047b
            if (r1 == 0) goto L_0x047b
            java.lang.String r0 = "captured"
            r1.A07 = r0
            r1.A06 = r2
            X.206 r6 = (X.AnonymousClass206) r6
            r5.CQw(r6)
            r4.C97(r3)
            return
        L_0x0479:
            r1 = r2
            goto L_0x0460
        L_0x047b:
            r4.C96()
            return
        L_0x047f:
            java.lang.Object r9 = r0.A01
            X.1x7 r9 = (X.C41821x7) r9
            java.lang.Object r7 = r0.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r12 = r0.A03
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r10 = r0.A04
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r8 = r0.A05
            X.6hU r8 = (X.C129246hU) r8
            r0 = 2
            X.C18070vi.A0g(r12, r0, r8)
            java.lang.String r11 = X.AnonymousClass74B.A02()
            X.6QI r6 = new X.6QI
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.00H r0 = r9.A0F
            java.lang.Object r8 = r0.get()
            X.73A r8 = (X.AnonymousClass73A) r8
            r5 = 1
            X.00H r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.716 r0 = (X.AnonymousClass716) r0
            android.content.SharedPreferences r0 = X.AnonymousClass716.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_debug_session_id"
            X.C17880vN.A1E(r1, r0, r11)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest called for session: "
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = " with message "
            r3.append(r0)
            java.util.ArrayList r2 = X.C29351c6.A0E(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x04d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04e1
            X.C108995ce.A1Q(r2, r1)
            goto L_0x04d7
        L_0x04e1:
            java.lang.String r0 = X.C17890vO.A0V(r2, r3)
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            boolean r0 = X.AnonymousClass74B.A08(r12)
            if (r0 == 0) goto L_0x04fa
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest skip for audio status"
            X.C18070vi.A0d(r0, r4)
            r1 = -4
            r0 = 0
            r6.A01(r0, r11, r1, r5)
            return
        L_0x04fa:
            X.00H r0 = r8.A0A
            java.lang.Object r0 = r0.get()
            X.6p6 r0 = (X.AnonymousClass6p6) r0
            r0.A00(r11)
            X.00H r0 = r8.A08
            java.lang.Object r0 = r0.get()
            X.1dS r0 = (X.C30141dS) r0
            X.0ve r2 = r0.A01
            r1 = 10743(0x29f7, float:1.5054E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0536
            X.00H r0 = r8.A09
            java.lang.Object r3 = r0.get()
            X.72Q r3 = (X.AnonymousClass72Q) r3
            java.util.ArrayList r2 = X.C29351c6.A0E(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x0529:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0533
            X.C108995ce.A1Q(r2, r1)
            goto L_0x0529
        L_0x0533:
            r3.A07(r2, r11)
        L_0x0536:
            X.7PM r9 = new X.7PM
            r9.<init>(r6, r11)
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest start text status re-burning and eligibility"
            X.C18070vi.A0d(r0, r4)
            r10 = r11
            r11 = r12
            r12 = r5
            X.AnonymousClass73A.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x0547:
            return
        L_0x0548:
            r2 = move-exception
            java.lang.String r1 = "Failed to connect to BTC RFCOMM socket"
            X.C26294Cx6.A0A(r3, r1, r2)
            java.lang.Object r1 = r0.A03
            X.1Di r1 = (X.C22821Di) r1
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_CONNECT_SOCKET
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21463AkU.run():void");
    }

    public C21463AkU(C33251iW r2, C143887Fe r3, AnonymousClass3TA r4, AnonymousClass206 r5, String str, List list) {
        this.A00 = 2;
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = str;
        this.A05 = list;
        this.A04 = r3;
    }

    public C21463AkU(DialogFragment dialogFragment, AnonymousClass1FL r3, BDM bdm, C22358B4m b4m, AnonymousClass8d6 r6) {
        this.A00 = 0;
        this.A03 = dialogFragment;
        this.A02 = r3;
        this.A06 = "com.bloks.www.avatar.editor.cds.launcher";
        this.A04 = bdm;
        this.A01 = b4m;
        this.A05 = r6;
    }

    public C21463AkU(Context context, C129246hU r3, C41821x7 r4, Integer num, List list) {
        this.A00 = 8;
        this.A01 = r4;
        this.A02 = context;
        this.A03 = list;
        this.A04 = num;
        this.A06 = "status_fragment";
        this.A05 = r3;
    }
}
