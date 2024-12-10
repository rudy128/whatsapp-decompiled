package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transfer.ui.P2pTransferViewModel$onCreatorSetupComplete$1", f = "P2pTransferViewModel.kt", i = {0}, l = {308, 338}, m = "invokeSuspend", n = {"builder"}, s = {"L$0"})
public final class P2pTransferViewModel$onCreatorSetupComplete$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ P2pTransferViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2pTransferViewModel$onCreatorSetupComplete$1(P2pTransferViewModel p2pTransferViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = p2pTransferViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new P2pTransferViewModel$onCreatorSetupComplete$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new P2pTransferViewModel$onCreatorSetupComplete$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Dx0, java.lang.Object, X.1Bx] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            r2 = r34
            X.1g4 r17 = X.C31751g4.COROUTINE_SUSPENDED
            r9 = r33
            int r0 = r9.label
            r8 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r11) goto L_0x002d
            if (r0 != r8) goto L_0x0233
            X.C30691eM.A01(r2)
        L_0x0013:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            X.C30691eM.A01(r2)
            X.CRn r1 = new X.CRn
            r1.<init>()
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r9.this$0
            r9.L$0 = r1
            r9.label = r11
            java.lang.Object r2 = r0.A0U(r1, r9)
            r0 = r17
            if (r2 != r0) goto L_0x0034
            return r17
        L_0x002d:
            java.lang.Object r1 = r9.L$0
            X.CRn r1 = (X.C24963CRn) r1
            X.C30691eM.A01(r2)
        L_0x0034:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            if (r0 == 0) goto L_0x022c
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r2 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x020f }
            r0 = 1024(0x400, float:1.435E-42)
            r2.initialize(r0)     // Catch:{ NoSuchAlgorithmException -> 0x020f }
            java.security.KeyPair r0 = r2.generateKeyPair()     // Catch:{ NoSuchAlgorithmException -> 0x020f }
            r16 = 0
            if (r0 == 0) goto L_0x0215
            java.security.PrivateKey r4 = r0.getPrivate()
            java.security.PublicKey r2 = r0.getPublic()
            X.1C0 r0 = X.C25509Ch7.A01
            X.Dx0 r5 = new X.Dx0
            r5.<init>()
            r5.A01 = r0
            X.C18070vi.A0b(r4)
            X.C18070vi.A0b(r2)
            byte[] r0 = r2.getEncoded()     // Catch:{ IOException -> 0x0209 }
            java.io.ByteArrayInputStream r2 = X.BE6.A0h(r0)     // Catch:{ IOException -> 0x0209 }
            X.Bwo r0 = new X.Bwo     // Catch:{ IOException -> 0x0209 }
            r0.<init>((java.io.InputStream) r2)     // Catch:{ IOException -> 0x0209 }
            X.1Bz r0 = r0.A05()     // Catch:{ IOException -> 0x0209 }
            X.Dx2 r7 = X.C28294Dx2.A01(r0)     // Catch:{ IOException -> 0x0209 }
            X.CZY r2 = X.C28324DxW.A05
            X.DxF[] r0 = X.C26254Cvu.A07(r2)
            X.DxW r12 = new X.DxW
            r12.<init>((X.CZY) r2, (X.C28307DxF[]) r0)
            r12.A01 = r2
            X.DxF[] r0 = X.C26254Cvu.A07(r2)
            X.DxW r6 = new X.DxW
            r6.<init>((X.CZY) r2, (X.C28307DxF[]) r0)
            r6.A01 = r2
            r2 = 2
            X.Dxj r0 = new X.Dxj
            r0.<init>((long) r2)
            r10 = 0
            X.Dy9 r14 = new X.Dy9
            r14.<init>(r0, r10, r11)
            long r2 = java.lang.System.currentTimeMillis()
            X.Dxj r13 = new X.Dxj
            r13.<init>((long) r2)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Locale r15 = java.util.Locale.US
            X.DxV r3 = new X.DxV
            r3.<init>(r0, r15)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r0 = 6
            r2.add(r0, r11)
            java.util.Date r0 = r2.getTime()
            X.C18070vi.A0X(r0)
            X.DxV r11 = new X.DxV
            r11.<init>(r0, r15)
            if (r7 == 0) goto L_0x0238
            r0 = 10
            X.Csy r2 = new X.Csy
            r2.<init>(r0)
            r2.A02(r14)
            r2.A02(r13)
            r2.A02(r5)
            r2.A02(r12)
            X.Csy r0 = new X.Csy
            r0.<init>(r8)
            r0.A02(r3)
            X.Dy3 r0 = X.C28339Dxl.A07(r11, r0)
            r2.A02(r0)
            r2.A02(r6)
            X.Dy3 r0 = X.C28339Dxl.A07(r7, r2)
            X.Dx8 r7 = X.C28300Dx8.A01(r0)
            if (r7 == 0) goto L_0x0222
            java.lang.String r6 = "DER"
            X.1C0 r0 = r5.A01     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0117 }
            java.security.Signature r2 = java.security.Signature.getInstance(r0)     // Catch:{ all -> 0x0117 }
            r2.initSign(r4)     // Catch:{ all -> 0x0117 }
            X.1Bz r0 = r7.CP9()     // Catch:{ all -> 0x0117 }
            byte[] r0 = r0.A0C(r6)     // Catch:{ all -> 0x0117 }
            r2.update(r0)     // Catch:{ all -> 0x0117 }
            byte[] r16 = r2.sign()     // Catch:{ all -> 0x0117 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0117 }
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x011c:
            java.lang.Throwable r2 = X.C30671eK.A00(r0)
            boolean r0 = r2 instanceof java.security.NoSuchAlgorithmException
            if (r0 != 0) goto L_0x0218
            boolean r0 = r2 instanceof java.security.SignatureException
            if (r0 != 0) goto L_0x0218
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 != 0) goto L_0x0218
            boolean r0 = r2 instanceof java.security.InvalidKeyException
            if (r0 != 0) goto L_0x0218
            X.Csy r3 = new X.Csy
            r3.<init>()
            r3.A02(r7)
            r3.A02(r5)
            X.Dwd r2 = new X.Dwd
            r0 = r16
            r2.<init>(r0, r10)
            r3.A02(r2)
            X.Dy3 r0 = new X.Dy3     // Catch:{ IOException -> 0x0202 }
            r0.<init>((X.C26135Csy) r3)     // Catch:{ IOException -> 0x0202 }
            byte[] r3 = r0.A0C(r6)     // Catch:{ IOException -> 0x0202 }
            if (r3 == 0) goto L_0x021d
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ CertificateException -> 0x01fb }
            java.io.ByteArrayInputStream r0 = X.BE6.A0h(r3)     // Catch:{ CertificateException -> 0x01fb }
            java.security.cert.Certificate r0 = r2.generateCertificate(r0)     // Catch:{ CertificateException -> 0x01fb }
            if (r0 == 0) goto L_0x0222
            X.1D6 r7 = X.AnonymousClass1D6.A01(r0, r4)
            r6 = 0
            java.lang.Object r0 = r7.first
            if (r0 == 0) goto L_0x022c
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            byte[] r2 = r0.getEncoded()
            X.C18070vi.A0X(r2)
            X.A8M r0 = X.A8M.A00
            java.lang.String r0 = "SHA-256"
            byte[] r0 = X.AnonymousClass8BW.A1W(r2, r0)
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r8)
            X.C18070vi.A0X(r11)
            r3 = 32
            byte[] r0 = X.C17970vW.A0I(r3)
            r2 = 10
            java.lang.String r5 = android.util.Base64.encodeToString(r0, r2)
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r9.this$0
            X.C18070vi.A0b(r5)
            r0.A0i(r5)
            byte[] r0 = X.C17970vW.A0I(r3)
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r2)
            r1.A00 = r11
            X.C18070vi.A0d(r5, r10)
            r1.A03 = r5
            X.C18070vi.A0b(r4)
            X.C18070vi.A0d(r4, r10)
            java.lang.String r19 = "whatsapp-consumer://"
            java.lang.String r20 = "fpm"
            java.lang.String r21 = "android"
            java.lang.String r22 = "cert"
            java.lang.String r10 = r1.A03
            java.lang.String r3 = r1.A00
            java.lang.String r2 = r1.A02
            java.lang.String r1 = r1.A01
            r31 = 1
            r32 = 8988(0x231c, float:1.2595E-41)
            X.AEj r0 = new X.AEj
            r30 = r6
            r28 = r6
            r29 = r6
            r18 = r0
            r23 = r10
            r24 = r3
            r25 = r4
            r26 = r2
            r27 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r1 = r9.this$0
            r1.A01 = r0
            boolean r1 = r1.A0l()
            if (r1 != 0) goto L_0x01ec
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r1 = r9.this$0
            boolean r0 = r1.A0m(r0)
            if (r0 == 0) goto L_0x022c
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r9.this$0
            r0.A0a()
        L_0x01ec:
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r9.this$0
            r9.L$0 = r6
            r9.label = r8
            java.lang.Object r1 = r0.A0V(r4, r5, r7, r9)
            r0 = r17
            if (r1 != r0) goto L_0x0013
            return r17
        L_0x01fb:
            r1 = move-exception
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-x509-certificate/failed to generate certificate"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0222
        L_0x0202:
            r1 = move-exception
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/sign-certificate/Failed to encode signed vector"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x021d
        L_0x0209:
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-unsigned-certificate-properties/failed to read public key info with ASN input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0222
        L_0x020f:
            r1 = move-exception
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-keys/no such algorithm found RSA"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0215:
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-self-signed-certificate/key pair was not generated"
            goto L_0x0229
        L_0x0218:
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/sign-certificate/Failed to sign certificate"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x021d:
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-self-signed-certificate/failed to sign certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0222:
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-self-signed-certificate/failed to create unsigned certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "p2p/SelfSignedCertificateFactory/generate-self-signed-certificate/certificate was not generated"
        L_0x0229:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x022c:
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r9.this$0
            r0.A0Z()
            goto L_0x0013
        L_0x0233:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0238:
            java.lang.String r0 = "not all mandatory fields set in V3 TBScertificate generator"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.P2pTransferViewModel$onCreatorSetupComplete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
