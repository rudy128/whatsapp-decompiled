package X;

/* renamed from: X.B0i  reason: case insensitive filesystem */
public final class C22254B0i extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33781jN $callback;
    public final /* synthetic */ C179329Hn $requestType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22254B0i(C179329Hn r2, C33781jN r3) {
        super(1);
        this.$requestType = r2;
        this.$callback = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r2)
            java.lang.String r0 = "MexClientIplsHandshakeInitRequestApi/clientIplsHandshakeInit/requestType: "
            r1.append(r0)
            r3 = r17
            X.9Hn r0 = r3.$requestType
            r1.append(r0)
            java.lang.String r0 = " success"
            X.C17890vO.A1A(r1, r0)
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "xwa2_ipls_client_init"
            java.lang.Class<com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHandshakeInitRequestResponseImpl$Xwa2IplsClientInit> r0 = com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHandshakeInitRequestResponseImpl.Xwa2IplsClientInit.class
            X.A8k r1 = X.C108985cd.A0I(r2, r0, r1)
            java.lang.String r0 = "server_hello_payload"
            java.lang.String r2 = X.C72453Mb.A0z(r1, r0)
            r4 = 1
            r9 = 0
            X.1jN r3 = r3.$callback
            X.1jO r3 = (X.C33791jO) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ClientIplsHandshakeManager/handleClientIplsInitSuccessResponse "
            r1.append(r0)
            X.9Hn r0 = r3.A00
            java.lang.String r16 = "requestType"
            if (r0 != 0) goto L_0x0040
            X.C18070vi.A11(r16)
            throw r9
        L_0x0040:
            X.C17900vP.A0b(r0, r1)
            byte[] r1 = android.util.Base64.decode(r2, r4)
            X.8c1 r0 = X.AnonymousClass8c1.DEFAULT_INSTANCE
            X.Bm6 r2 = X.C23577Bm6.A07(r0, r1)
            X.8c1 r2 = (X.AnonymousClass8c1) r2
            X.1jK r13 = r3.A07
            X.C18070vi.A0b(r2)
            X.1jP r7 = X.C33791jO.A0C
            X.C108975cc.A12(r2, r7, r4)
            X.DSQ r0 = r2.hekPub_
            byte[] r6 = X.AnonymousClass8BS.A1P(r0)
            X.DSQ r0 = r2.hkPub_
            byte[] r5 = X.AnonymousClass8BS.A1P(r0)
            X.DSQ r0 = r2.hkKeySignature_
            byte[] r4 = X.AnonymousClass8BS.A1P(r0)
            X.DSQ r0 = r2.hekKeySignature_
            byte[] r1 = X.AnonymousClass8BS.A1P(r0)
            boolean r0 = java.util.Arrays.equals(r6, r5)
            if (r0 != 0) goto L_0x00d1
            byte[] r0 = r7.A00
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 == 0) goto L_0x00d1
            boolean r0 = X.C63962tz.A07(r7, r5, r4)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "INVALID_HSM_HK_PUB_SIGNATURE_ERROR"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x008c:
            X.8nH r4 = new X.8nH
            r4.<init>(r0)
        L_0x0091:
            boolean r0 = r4 instanceof X.AnonymousClass8nI
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r4 instanceof X.AnonymousClass8nH
            if (r0 == 0) goto L_0x00b6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "hsmAssertion failure: "
            r1.append(r0)
            X.8nH r4 = (X.AnonymousClass8nH) r4
            java.lang.Integer r0 = r4.A00
            java.lang.String r0 = X.AnonymousClass9Q3.A00(r0)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.8nL r0 = new X.8nL
            r0.<init>(r1, r9)
            X.C33791jO.A01(r3, r0)
        L_0x00b6:
            X.1P3 r0 = r3.A09
            X.9Hn r1 = r3.A00
            if (r1 != 0) goto L_0x00d9
            X.C18070vi.A11(r16)
            throw r9
        L_0x00c0:
            boolean r0 = X.C63962tz.A07(r7, r6, r1)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "INVALID_HSM_HEK_PUB_SIGNATURE_ERROR"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x008c
        L_0x00ce:
            X.8nI r4 = X.AnonymousClass8nI.A00
            goto L_0x0091
        L_0x00d1:
            java.lang.String r0 = "INVALID_HSM_KEY_HEK_AND_HK_IS_EQUAL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x008c
        L_0x00d9:
            java.lang.String r8 = r3.A03
            if (r8 != 0) goto L_0x00e3
            java.lang.String r0 = "sessionId"
            X.C18070vi.A11(r0)
            throw r9
        L_0x00e3:
            X.8XJ r12 = r3.A02
            r4 = 0
            X.1PJ r0 = r0.A01
            X.2cG r5 = r0.A03()
            X.2cF r0 = X.C63962tz.A00()
            X.1jP r10 = r0.A01
            X.2kN r11 = r0.A00
            X.DSQ r0 = r2.hsmChallenge_
            byte[] r0 = r0.A06()
            byte[] r0 = X.C63962tz.A09(r11, r0)
            X.BmB r14 = X.AnonymousClass8BR.A0F(r0, r4)
            int r6 = r1.ordinal()
            if (r6 == r4) goto L_0x025a
            r0 = 1
            if (r6 != r0) goto L_0x043c
            X.9KC r15 = X.AnonymousClass9KC.PUT
        L_0x010d:
            X.8c0 r0 = X.AnonymousClass8c0.DEFAULT_INSTANCE
            X.Bmt r7 = X.AnonymousClass8BS.A08(r0)
            X.Bm6 r1 = r7.A00
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.challengeResponse_ = r14
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.sessionId_ = r8
            X.11S r0 = r13.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            java.lang.String r8 = X.C72463Mc.A0n(r0)
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            r8.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.accountJid_ = r8
            X.2kO r0 = r5.A01
            X.1jP r0 = r0.A00
            byte[] r0 = r0.A00
            X.BmB r8 = X.AnonymousClass8BU.A0A(r7, r0, r4)
            X.Bm6 r1 = r7.A00
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.cikPub_ = r8
            byte[] r0 = r10.A00
            X.BmB r8 = X.AnonymousClass8BU.A0A(r7, r0, r4)
            X.Bm6 r1 = r7.A00
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.cekPub_ = r8
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8c0 r1 = (X.AnonymousClass8c0) r1
            int r0 = r15.BVW()
            r1.requestType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            X.Bm6 r8 = r7.A0C()
            X.8c0 r8 = (X.AnonymousClass8c0) r8
            X.C18070vi.A0b(r8)
            X.DSQ r0 = r2.hekPub_
            byte[] r10 = X.AnonymousClass8BS.A1P(r0)
            X.DSQ r0 = r2.hkPub_
            byte[] r2 = X.AnonymousClass8BS.A1P(r0)
            X.1jP r1 = new X.1jP
            r1.<init>(r10)
            X.2kN r0 = r5.A00
            byte[] r7 = X.C63962tz.A08(r0, r1)
            X.C18070vi.A0X(r7)
            X.1jP r0 = new X.1jP
            r0.<init>(r2)
            byte[] r5 = X.C63962tz.A08(r11, r0)
            X.C18070vi.A0X(r5)
            X.1jP r0 = new X.1jP
            r0.<init>(r10)
            byte[] r2 = X.C63962tz.A08(r11, r0)
            X.C18070vi.A0X(r2)
            r0 = 3
            byte[][] r1 = new byte[r0][]
            X.AnonymousClass8BS.A1B(r7, r5, r1)
            r0 = 2
            r1[r0] = r2
            byte[] r2 = X.A8G.A05(r1)
            java.lang.String r7 = "IPLS"
            java.nio.charset.Charset r5 = X.C26571Sq.A05
            byte[] r1 = X.C18070vi.A1A(r7, r5)
            r0 = 64
            byte[] r10 = X.C20058A5h.A00(r2, r1, r0)
            X.C18070vi.A0b(r10)
            r1 = 31
            X.1Oc r0 = new X.1Oc
            r0.<init>(r4, r1)
            java.util.List r4 = X.C200410p.A0K(r0, r10)
            r2 = 32
            r1 = 63
            X.1Oc r0 = new X.1Oc
            r0.<init>(r2, r1)
            java.util.List r1 = X.C200410p.A0K(r0, r10)
            byte[] r0 = X.C29431cG.A1A(r4)
            java.lang.String r4 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r0, r4)
            byte[] r1 = X.C29431cG.A1A(r1)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            r0.<init>(r1, r4)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r2, r0)
            java.lang.Object r4 = r0.first
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            java.lang.Object r2 = r0.second
            javax.crypto.SecretKey r2 = (javax.crypto.SecretKey) r2
            r0 = 0
            if (r6 == r0) goto L_0x0279
            r11 = 0
            X.C18070vi.A0d(r8, r0)
            r6 = 32
            java.security.SecureRandom r0 = X.C22691Cv.A00()
            byte[] r1 = new byte[r6]
            r0.nextBytes(r1)
            byte[] r0 = X.C18070vi.A1A(r7, r5)
            byte[] r10 = X.C20058A5h.A00(r1, r0, r6)
            r6 = 1
            if (r12 == 0) goto L_0x02a4
            X.EE9 r0 = r12.clientSecretKey_
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02a4
            X.EE9 r0 = r12.clientSecretKey_
            X.C18070vi.A0X(r0)
            java.util.ArrayList r13 = X.C29351c6.A0D(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0246:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x025e
            java.lang.Object r0 = r14.next()
            X.BDj r0 = (X.C22568BDj) r0
            long r0 = r0.BTk()
            X.C17880vN.A1R(r13, r0)
            goto L_0x0246
        L_0x025a:
            X.9KC r15 = X.AnonymousClass9KC.GET
            goto L_0x010d
        L_0x025e:
            r0 = 20
            java.util.List r0 = X.C21486Akr.A00(r13, r0)
            java.lang.Object r0 = X.C29431cG.A0b(r0)
            long r0 = X.C17880vN.A05(r0)
            long r0 = r0 + r6
            X.8ct r6 = X.C166438ct.DEFAULT_INSTANCE
            X.Bmt r13 = r6.A0N()
            X.8XA r13 = (X.AnonymousClass8XA) r13
            r13.A0G(r0)
            goto L_0x02af
        L_0x0279:
            X.8aN r0 = X.C164968aN.DEFAULT_INSTANCE
            X.Bmt r7 = r0.A0N()
            X.9KC r0 = X.AnonymousClass9KC.GET
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8aN r1 = (X.C164968aN) r1
            int r0 = r0.BVW()
            r1.requestType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8aN r1 = (X.C164968aN) r1
            r8.getClass()
            r1.handshakeMaterial_ = r8
            int r0 = r1.bitField0_
            r0 = r0 | 2
            goto L_0x0364
        L_0x02a4:
            X.8ct r0 = X.C166438ct.DEFAULT_INSTANCE
            X.Bmt r13 = r0.A0N()
            X.8XA r13 = (X.AnonymousClass8XA) r13
            r13.A0G(r6)
        L_0x02af:
            X.BmB r0 = X.AnonymousClass8BR.A0F(r10, r11)
            r13.A0H(r0)
            X.Bm6 r7 = r13.A0C()
            X.C18070vi.A0b(r7)
            X.8XJ r0 = X.AnonymousClass8XJ.DEFAULT_INSTANCE
            X.Bmt r10 = X.AnonymousClass8BS.A08(r0)
            X.Bm6 r6 = r10.A00
            X.8XJ r6 = (X.AnonymousClass8XJ) r6
            r7.getClass()
            X.EE9 r1 = r6.clientSecretKey_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02d9
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r6.clientSecretKey_ = r1
        L_0x02d9:
            r1.add(r7)
            if (r12 == 0) goto L_0x0302
            X.EE9 r0 = r12.clientSecretKey_
            if (r0 == 0) goto L_0x0302
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0302
            X.EE9 r7 = r12.clientSecretKey_
            X.Bm6 r6 = X.C17880vN.A0G(r10)
            X.8XJ r6 = (X.AnonymousClass8XJ) r6
            X.EE9 r1 = r6.clientSecretKey_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02ff
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r6.clientSecretKey_ = r1
        L_0x02ff:
            X.DND.A09(r7, r1)
        L_0x0302:
            X.Bm6 r1 = r10.A0C()
            X.8XI r0 = X.AnonymousClass8XI.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            java.lang.String r0 = "native_contacts"
            java.util.Map r7 = X.C108975cc.A0h(r0, r1)
            X.Bm6 r6 = X.C17880vN.A0G(r10)
            X.8XI r6 = (X.AnonymousClass8XI) r6
            X.Dbz r1 = r6.clientSecretMap_
            boolean r0 = r1.isMutable
            if (r0 != 0) goto L_0x0324
            X.Dbz r1 = r1.A01()
            r6.clientSecretMap_ = r1
        L_0x0324:
            r1.putAll(r7)
            X.Bm6 r6 = r10.A0C()
            X.8XI r6 = (X.AnonymousClass8XI) r6
            X.8aN r0 = X.C164968aN.DEFAULT_INSTANCE
            X.Bmt r7 = r0.A0N()
            X.9KC r0 = X.AnonymousClass9KC.PUT
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8aN r1 = (X.C164968aN) r1
            int r0 = r0.BVW()
            r1.requestType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8aN r1 = (X.C164968aN) r1
            r1.handshakeMaterial_ = r8
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8aN r1 = (X.C164968aN) r1
            r6.getClass()
            r1.iplsClientSecretData_ = r6
            int r0 = r1.bitField0_
            r0 = r0 | 4
        L_0x0364:
            r1.bitField0_ = r0
            X.Bm6 r7 = r7.A0C()
            X.8aN r7 = (X.C164968aN) r7
            byte[] r11 = r7.A0M()
            r1 = 12
            java.security.SecureRandom r0 = X.C22691Cv.A00()
            byte[] r10 = new byte[r1]
            r0.nextBytes(r10)
            javax.crypto.Cipher r6 = X.AnonymousClass8BR.A18()
            X.C18070vi.A0X(r6)
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r10)
            r0 = 1
            byte[] r0 = X.AnonymousClass8BS.A1Q(r4, r1, r6, r11, r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r10)
            java.lang.Object r6 = r0.first
            byte[] r6 = (byte[]) r6
            java.lang.Object r11 = r0.second
            byte[] r11 = (byte[]) r11
            X.8aM r0 = X.C164958aM.DEFAULT_INSTANCE
            X.Bmt r10 = X.AnonymousClass8BS.A08(r0)
            X.Bm6 r1 = r10.A00
            X.8aM r1 = (X.C164958aM) r1
            r1.clientHelloHandshakeMaterial_ = r8
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.BmB r6 = X.C17900vP.A03(r10, r6)
            X.Bm6 r1 = r10.A00
            X.8aM r1 = (X.C164958aM) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.iplsClientRequestEncryptedPayload_ = r6
            X.BmB r6 = X.C17900vP.A03(r10, r11)
            X.Bm6 r1 = r10.A00
            X.8aM r1 = (X.C164958aM) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.iv_ = r6
            X.Bm6 r1 = r10.A0C()
            X.8XI r0 = r7.iplsClientSecretData_
            if (r0 != 0) goto L_0x03d3
            X.8XI r0 = X.AnonymousClass8XI.DEFAULT_INSTANCE
        L_0x03d3:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Object r1 = r0.first
            X.8aM r1 = (X.C164958aM) r1
            java.lang.Object r0 = r0.second
            X.8XI r0 = (X.AnonymousClass8XI) r0
            X.9sT r6 = new X.9sT
            r6.<init>(r1, r0, r2, r4)
            X.9Hn r1 = r3.A00
            if (r1 != 0) goto L_0x03ec
            X.C18070vi.A11(r16)
            throw r9
        L_0x03ec:
            X.9Hn r0 = X.C179329Hn.PUT
            if (r1 != r0) goto L_0x03f4
            X.8XI r0 = r6.A01
            r3.A01 = r0
        L_0x03f4:
            javax.crypto.SecretKey r0 = r6.A03
            r3.A04 = r0
            X.1jJ r4 = r3.A08
            X.8aM r0 = r6.A00
            r1 = 1
            byte[] r0 = r0.A0M()
            byte[] r0 = android.util.Base64.encode(r0, r1)
            X.C18070vi.A0X(r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r5)
            X.9ju r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "client_hello_payload"
            X.8Kx r1 = X.C162478Kx.A00(r1, r2, r0)
            X.A7K r2 = X.A7K.A00()
            java.lang.String r0 = "input"
            X.C108975cc.A0z(r1, r2, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHelloPayloadResponseImpl> r1 = com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHelloPayloadResponseImpl.class
            java.lang.String r0 = "IplsClientHelloPayload"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            java.lang.String r0 = "MexClientHelloMutationRequestApi/sendClientHelloMutationRequest start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1PY r0 = r4.A00
            X.A2g r1 = r0.A01(r1)
            X.Ayv r0 = new X.Ayv
            r0.<init>(r3)
            r1.A04(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x043c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22254B0i.invoke(java.lang.Object):java.lang.Object");
    }
}
