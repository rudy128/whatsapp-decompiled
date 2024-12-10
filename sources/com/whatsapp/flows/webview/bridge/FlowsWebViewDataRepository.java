package com.whatsapp.flows.webview.bridge;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass206;
import X.AnonymousClass8BW;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C191319mO;
import X.C195719tn;
import X.C196109uT;
import X.C19830z4;
import X.C27191Vc;
import X.C30801eX;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

public final class FlowsWebViewDataRepository {
    public C195719tn A00;
    public AnonymousClass206 A01;
    public JSONObject A02;
    public final AnonymousClass1M9 A03;
    public final C27191Vc A04;
    public final AnonymousClass118 A05;
    public final C196109uT A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18600wl A0D;
    public final AnonymousClass1PM A0E;
    public final AnonymousClass11P A0F;
    public final C19830z4 A0G;
    public final C30801eX A0H;
    public final C191319mO A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r11, com.whatsapp.jid.UserJid r12, X.C30391dr r13) {
        /*
            r6 = r12
            boolean r0 = r13 instanceof X.C21695AoO
            if (r0 == 0) goto L_0x0087
            r2 = r13
            X.AoO r2 = (X.C21695AoO) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0087
            int r3 = r3 - r1
            r2.label = r3
        L_0x0013:
            java.lang.Object r4 = r2.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r2.label
            r10 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r10) goto L_0x0095
            int r1 = r2.I$0
            java.lang.Object r6 = r2.L$1
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.Object r11 = r2.L$0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r11 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r11
            X.C30691eM.A01(r4)
        L_0x002b:
            X.9sX r4 = (X.C194939sX) r4
            X.00H r0 = r11.A0N
            X.8sh r2 = X.AnonymousClass8BR.A0U(r0)
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r1)
            java.lang.Short r0 = r4.A00
            r2.A0G(r1, r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x008d
            X.9uT r1 = r11.A06
            java.lang.String r0 = r6.user
            java.lang.String r0 = r1.A03(r0)
            X.8sk r1 = new X.8sk
            r1.<init>(r0)
            return r1
        L_0x004e:
            X.C30691eM.A01(r4)
            X.00H r0 = r11.A0N
            X.8sh r1 = X.AnonymousClass8BR.A0U(r0)
            java.lang.String r0 = "prefetch_conversation"
            r8 = 0
            int r1 = r1.A0E(r12, r0)
            X.00H r0 = r11.A0L
            java.lang.Object r5 = r0.get()
            X.9hF r5 = (X.C188329hF) r5
            java.lang.Integer r7 = X.AnonymousClass3MW.A0v(r1)
            X.9tn r0 = r11.A00
            if (r0 == 0) goto L_0x0070
            java.lang.String r8 = r0.A04
        L_0x0070:
            r2.L$0 = r11
            r2.L$1 = r12
            r2.I$0 = r1
            r2.label = r10
            X.0wl r0 = r5.A07
            r9 = 0
            com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 r4 = new com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r4 = X.C30451dy.A00(r2, r0, r4)
            if (r4 != r3) goto L_0x002b
            return r3
        L_0x0087:
            X.AoO r2 = new X.AoO
            r2.<init>(r11, r13)
            goto L_0x0013
        L_0x008d:
            java.lang.String r0 = r4.A01
            X.8sj r1 = new X.8sj
            r1.<init>(r0)
            return r1
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository.A01(com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }

    public FlowsWebViewDataRepository(AnonymousClass1M9 r25, AnonymousClass1PM r26, C27191Vc r27, AnonymousClass11P r28, AnonymousClass118 r29, C196109uT r30, C19830z4 r31, C30801eX r32, C18030ve r33, C191319mO r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, C18600wl r46) {
        C18030ve r15 = r33;
        AnonymousClass00H r14 = r35;
        AnonymousClass00H r13 = r36;
        AnonymousClass00H r12 = r37;
        AnonymousClass118 r19 = r29;
        C18070vi.A0w(r19, r15, r14, r13, r12);
        AnonymousClass00H r9 = r39;
        C19830z4 r17 = r31;
        AnonymousClass00H r11 = r38;
        AnonymousClass1PM r22 = r26;
        AnonymousClass11P r20 = r28;
        C18070vi.A0x(r22, r17, r20, r11, r9);
        AnonymousClass00H r8 = r40;
        AnonymousClass00H r7 = r41;
        AnonymousClass1M9 r23 = r25;
        C27191Vc r21 = r27;
        C196109uT r18 = r30;
        C18070vi.A0y(r18, r23, r21, r8, r7);
        AnonymousClass00H r6 = r42;
        AnonymousClass00H r5 = r43;
        C18600wl r2 = r46;
        C30801eX r16 = r32;
        C18070vi.A0t(r16, r6, r2, r5);
        AnonymousClass00H r4 = r44;
        C191319mO r10 = r34;
        AnonymousClass8BW.A1J(r4, r10);
        AnonymousClass00H r3 = r45;
        C18070vi.A0d(r3, 22);
        this.A05 = r19;
        this.A07 = r15;
        this.A09 = r14;
        this.A0A = r13;
        this.A0O = r12;
        this.A0E = r22;
        this.A0G = r17;
        this.A0F = r20;
        this.A0N = r11;
        this.A0M = r9;
        this.A06 = r18;
        this.A03 = r23;
        this.A04 = r21;
        this.A0B = r8;
        this.A08 = r7;
        this.A0H = r16;
        this.A0J = r6;
        this.A0D = r2;
        this.A0C = r5;
        this.A0L = r4;
        this.A0I = r10;
        this.A0K = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C195709tm r8, X.C185899dK r9, com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r10, com.whatsapp.jid.UserJid r11, java.lang.String r12, X.C30391dr r13, org.json.JSONObject r14) {
        /*
            boolean r0 = r13 instanceof X.C21681AoA
            if (r0 == 0) goto L_0x00a8
            r4 = r13
            X.AoA r4 = (X.C21681AoA) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a8
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r2) goto L_0x00af
            java.lang.Object r14 = r4.L$1
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            java.lang.Object r10 = r4.L$0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r10 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r10
            X.C30691eM.A01(r1)
        L_0x0028:
            X.9MM r1 = (X.AnonymousClass9MM) r1
            boolean r0 = r1 instanceof X.C172078sk
            if (r0 == 0) goto L_0x00b7
            X.8sk r1 = (X.C172078sk) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "public_key"
            r14.put(r0, r1)
        L_0x0037:
            r10.A02 = r14
            X.64g r1 = X.C1186264g.A00
            return r1
        L_0x003c:
            X.C30691eM.A01(r1)
            X.00H r0 = r10.A0B
            java.lang.Object r1 = r0.get()
            X.9zA r1 = (X.C198939zA) r1
            r0 = 0
            if (r9 == 0) goto L_0x004c
            X.A1p r0 = r9.A01
        L_0x004c:
            java.lang.Integer r0 = r1.A01(r8, r0, r12)
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x005c
            if (r1 == r2) goto L_0x00b4
            java.lang.String r0 = "extensions-metadata-unknown-version"
            goto L_0x00c3
        L_0x005c:
            org.json.JSONArray r7 = X.AnonymousClass8BR.A1A()
            java.lang.String[] r6 = r8.A09
            if (r6 == 0) goto L_0x0070
            int r3 = r6.length
            r1 = 0
        L_0x0066:
            if (r1 >= r3) goto L_0x0070
            r0 = r6[r1]
            r7.put(r0)
            int r1 = r1 + 1
            goto L_0x0066
        L_0x0070:
            java.lang.String r0 = "categories"
            r14.put(r0, r7)
            X.0ve r3 = r10.A07
            r1 = 9622(0x2596, float:1.3483E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = r8.A02
            if (r1 == 0) goto L_0x00a3
            java.lang.String r0 = "PUBLIC_KEY"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0037
        L_0x008d:
            r4.L$0 = r10
            r4.L$1 = r14
            r4.label = r2
            r3 = 0
            X.0wl r2 = r10.A0D
            r1 = 0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r10, r11, r1, r3)
            java.lang.Object r1 = X.C30451dy.A00(r4, r2, r0)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x00a3:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0037
            goto L_0x008d
        L_0x00a8:
            X.AoA r4 = new X.AoA
            r4.<init>(r10, r13)
            goto L_0x0012
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00b4:
            java.lang.String r0 = "extensions-metadata-not-compatible"
            goto L_0x00c3
        L_0x00b7:
            boolean r0 = r1 instanceof X.C172068sj
            if (r0 == 0) goto L_0x00c9
            X.8sj r1 = (X.C172068sj) r1
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "UNKNOWN"
        L_0x00c3:
            X.64e r1 = new X.64e
            r1.<init>(r0)
            return r1
        L_0x00c9:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository.A00(X.9tm, X.9dK, com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository, com.whatsapp.jid.UserJid, java.lang.String, X.1dr, org.json.JSONObject):java.lang.Object");
    }

    private final void A02(String str) {
        C195719tn r0;
        C195719tn r02 = this.A00;
        if (r02 != null) {
            UserJid userJid = r02.A02;
            String str2 = r02.A04;
            String str3 = r02.A07;
            long j = r02.A01;
            int i = r02.A00;
            r0 = new C195719tn(userJid, str2, str3, r02.A08, r02.A05, r02.A03, str, i, j, r02.A09);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A03(java.lang.String r9, java.lang.String r10, org.json.JSONObject r11) {
        /*
            r8 = this;
            X.0ve r2 = r8.A07
            r1 = 8552(0x2168, float:1.1984E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r6 = 1
            if (r0 == 0) goto L_0x0091
            X.9mO r7 = r8.A0I
            boolean r3 = X.AnonymousClass8BV.A1T(r9, r10, r6)
            X.0vq r0 = r7.A04
            java.lang.Object r2 = r0.get()
            X.AiK r2 = (X.AiK) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            r0 = 95
            java.lang.String r0 = X.C17890vO.A0Z(r10, r1, r0)
            X.AiB r1 = r2.A0B(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0061
            java.io.InputStream[] r0 = r1.A00
            r3 = r0[r3]
            int r0 = r3.available()     // Catch:{ all -> 0x0057 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0057 }
            r3.read(r1)     // Catch:{ all -> 0x0057 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0057 }
            r0.<init>(r1)     // Catch:{ all -> 0x0057 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0057 }
            r2.<init>(r0)     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r2.readObject()     // Catch:{ all -> 0x0050 }
            X.AnonymousClass8BR.A1I(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005e
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x005e:
            r3.close()
        L_0x0061:
            java.lang.String r5 = "flow_json"
            if (r0 == 0) goto L_0x0069
            r11.put(r5, r0)
            return r6
        L_0x0069:
            X.00H r4 = r8.A0C
            X.A6h r1 = X.AnonymousClass8BR.A0V(r4)
            int r0 = r10.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "flow_json_fetch_start"
            r1.A0B(r3, r0)
            java.lang.String r2 = r7.A00(r9, r10)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r4)
            java.lang.String r0 = "flow_json_fetch_end"
            r1.A0B(r3, r0)
            if (r2 == 0) goto L_0x008f
            r11.put(r5, r2)
            return r6
        L_0x008f:
            r0 = 0
            return r0
        L_0x0091:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository.A03(java.lang.String, java.lang.String, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013e, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0141, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0484 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x052c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0530 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v3 java.lang.Object), (r6v1 java.lang.Object) binds: [B:139:0x052a, B:141:0x052d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(android.os.Bundle r47, com.whatsapp.jid.UserJid r48, X.C30391dr r49) {
        /*
            r46 = this;
            r4 = r48
            r8 = 0
            r6 = r49
            boolean r0 = r6 instanceof X.C21715Aoi
            r3 = r46
            if (r0 == 0) goto L_0x0036
            r2 = r6
            X.Aoi r2 = (X.C21715Aoi) r2
            int r5 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0036
            int r5 = r5 - r1
            r2.label = r5
        L_0x0019:
            java.lang.Object r6 = r2.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r12 = r2.label
            r11 = 5
            r10 = 4
            r7 = 3
            r1 = 2
            r0 = 1
            r9 = 0
            if (r12 == 0) goto L_0x003c
            if (r12 == r0) goto L_0x03e1
            if (r12 == r1) goto L_0x052d
            if (r12 == r7) goto L_0x052d
            if (r12 == r10) goto L_0x0485
            if (r12 == r11) goto L_0x052d
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0036:
            X.Aoi r2 = new X.Aoi
            r2.<init>(r3, r6)
            goto L_0x0019
        L_0x003c:
            X.C30691eM.A01(r6)
            java.lang.String r1 = "flow_id"
            java.lang.String r30 = ""
            r6 = r47
            r0 = r30
            java.lang.String r1 = r6.getString(r1, r0)
            X.0ve r0 = r3.A07
            r45 = r0
            r10 = 5333(0x14d5, float:7.473E-42)
            X.0vf r29 = X.C18040vf.A02
            r7 = r29
            boolean r0 = X.C18020vd.A05(r7, r0, r10)
            if (r0 == 0) goto L_0x0078
            boolean r0 = X.AnonymousClass8BS.A1N(r45)
            if (r0 == 0) goto L_0x0078
            X.00H r0 = r3.A0C
            X.A6h r2 = X.AnonymousClass8BR.A0V(r0)
            int r0 = r1.hashCode()
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r2.A0A(r0)
            X.64e r5 = new X.64e
            r5.<init>(r8)
            return r5
        L_0x0078:
            java.lang.String r7 = "message_id"
            r0 = r30
            java.lang.String r0 = r6.getString(r7, r0)
            java.lang.String r7 = "message_is_from_me"
            boolean r7 = r6.getBoolean(r7, r9)
            if (r0 == 0) goto L_0x0110
            X.205 r9 = X.AnonymousClass205.A01(r4, r0, r7)
            X.00H r7 = r3.A08
            X.206 r7 = X.AnonymousClass1W2.A01(r9, r7)
        L_0x0092:
            r3.A01 = r7
            if (r7 == 0) goto L_0x010d
            long r9 = r7.A0x
        L_0x0098:
            java.lang.String r7 = "message_row_id"
            long r40 = r6.getLong(r7, r9)
            java.lang.String r9 = "session_id"
            r7 = r30
            java.lang.String r9 = r6.getString(r9, r7)
            java.lang.String r7 = "flow_message_version"
            java.lang.String r7 = r6.getString(r7, r8)
            java.lang.String r28 = "flow_action_payload"
            r10 = r28
            java.lang.String r27 = r6.getString(r10, r8)
            java.lang.String r10 = "flow_cta"
            java.lang.String r37 = r6.getString(r10, r8)
            java.lang.String r26 = "response_viewer"
            r10 = r26
            java.lang.String r25 = r6.getString(r10, r8)
            java.lang.String r24 = "response_message"
            r10 = r24
            java.lang.String r23 = r6.getString(r10, r8)
            java.lang.String r11 = "is_response_flow"
            r10 = 0
            boolean r22 = r6.getBoolean(r11, r10)
            java.lang.String r11 = "message_card_index"
            r10 = -1
            int r39 = r6.getInt(r11, r10)
            r21 = 0
            r44 = r30
            X.C108995ce.A1H(r1, r0, r9, r7)
            boolean r42 = X.AnonymousClass000.A1X(r27)
            r43 = r8
            X.9tn r10 = new X.9tn
            r31 = r10
            r32 = r4
            r33 = r1
            r34 = r0
            r35 = r9
            r36 = r7
            r38 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
            r3.A00 = r10
            X.206 r11 = r3.A01
            if (r11 == 0) goto L_0x0142
            X.00H r10 = r3.A0O
            java.lang.Object r12 = r10.get()
            X.2qT r12 = (X.C61902qT) r12
            long r10 = r11.A0x
            android.database.Cursor r12 = X.C61902qT.A00(r12, r10)
            goto L_0x0112
        L_0x010d:
            r9 = 0
            goto L_0x0098
        L_0x0110:
            r7 = 0
            goto L_0x0092
        L_0x0112:
            java.lang.String r10 = "message_template_id"
            int r13 = r12.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x013b }
            java.lang.String r10 = "message_hsm_tag"
            int r11 = r12.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x013b }
            boolean r10 = r12.moveToLast()     // Catch:{ all -> 0x013b }
            if (r10 == 0) goto L_0x012d
            r12.getString(r13)     // Catch:{ all -> 0x013b }
            java.lang.String r8 = r12.getString(r11)     // Catch:{ all -> 0x013b }
            r10 = 1
            goto L_0x012e
        L_0x012d:
            r10 = 0
        L_0x012e:
            r12.close()
            if (r10 == 0) goto L_0x0135
            r21 = 1
        L_0x0135:
            if (r10 != 0) goto L_0x0138
            r8 = 0
        L_0x0138:
            r44 = r8
            goto L_0x0147
        L_0x013b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            X.CDX.A00(r12, r1)
            throw r0
        L_0x0142:
            java.lang.String r8 = "FlowsLogger/FlowsWebViewDataRepository/FMessage is not accessible"
            com.whatsapp.util.Log.e((java.lang.String) r8)
        L_0x0147:
            java.lang.String r20 = "is_draft"
            r10 = 0
            r8 = r20
            boolean r8 = r6.getBoolean(r8, r10)
            if (r8 == 0) goto L_0x0305
            java.lang.String r10 = "DRAFT"
        L_0x0154:
            X.1eX r8 = r3.A0H
            X.2nM r11 = r8.A03(r4)
            if (r11 == 0) goto L_0x02ff
            java.lang.String r8 = r11.A08
            r18 = r8
            java.lang.String r8 = r11.A05
            r17 = r8
        L_0x0164:
            X.00H r8 = r3.A0J
            java.lang.Object r8 = r8.get()
            X.9o1 r8 = (X.C192229o1) r8
            java.lang.Integer r16 = r8.A00(r4)
            X.00H r8 = r3.A0C
            r38 = r8
            X.A6h r11 = X.AnonymousClass8BR.A0V(r38)
            int r19 = r1.hashCode()
            r8 = r19
            r11.A0C(r10, r8)
            org.json.JSONObject r14 = X.C17880vN.A15()
            X.A4O r12 = X.A4O.A00
            r11 = 0
            X.C18070vi.A0d(r9, r11)
            java.lang.String r13 = X.AnonymousClass8BY.A0Y(r9)
            X.C18070vi.A0X(r13)
            java.lang.String r8 = "wam_session_id"
            org.json.JSONObject r14 = r14.put(r8, r13)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r8 = "wae"
            java.lang.String r8 = X.AnonymousClass001.A1H(r8, r9, r13)
            X.C18070vi.A0d(r8, r11)
            java.lang.String r13 = X.AnonymousClass8BY.A0Y(r8)
            X.C18070vi.A0X(r13)
            java.lang.String r8 = "qpl_session_id"
            org.json.JSONObject r15 = r14.put(r8, r13)
            X.9uT r8 = r3.A06
            r37 = r8
            java.lang.String r14 = r12.A01(r8, r0, r11)
            java.lang.String r13 = "wam_message_id"
            org.json.JSONObject r13 = r15.put(r13, r14)
            r14 = 1
            r8 = r37
            java.lang.String r12 = r12.A01(r8, r0, r14)
            java.lang.String r8 = "qpl_message_id"
            org.json.JSONObject r12 = r13.put(r8, r12)
            java.lang.String r8 = "extension_status"
            org.json.JSONObject r12 = r12.put(r8, r10)
            java.lang.String r10 = "flow_token"
            r8 = r30
            java.lang.String r8 = r6.getString(r10, r8)
            org.json.JSONObject r12 = r12.put(r10, r8)
            java.lang.String r10 = "business_jid"
            r8 = r30
            java.lang.String r10 = r6.getString(r10, r8)
            java.lang.String r8 = "biz_jid"
            org.json.JSONObject r12 = r12.put(r8, r10)
            X.1PM r13 = r3.A0E
            X.1yf r8 = r13.A01(r4)
            int r10 = X.AnonymousClass9Q5.A00(r8)
            java.lang.String r8 = "biz_platform"
            org.json.JSONObject r10 = r12.put(r8, r10)
            java.lang.String r8 = "extension_id"
            org.json.JSONObject r12 = r10.put(r8, r1)
            X.1yf r8 = r13.A01(r4)
            if (r8 == 0) goto L_0x02fc
            java.lang.String r10 = r8.A08
        L_0x020b:
            java.lang.String r8 = "business_name"
            org.json.JSONObject r15 = r12.put(r8, r10)
            java.lang.String r14 = "biz_logo"
            X.1M9 r8 = r3.A03
            X.1E7 r33 = r8.A0E(r4)
            X.118 r8 = r3.A05
            android.content.Context r10 = r8.A00
            android.content.res.Resources r12 = r10.getResources()
            r8 = 2131168737(0x7f070de1, float:1.7951784E38)
            float r35 = r12.getDimension(r8)
            android.content.res.Resources r12 = r10.getResources()
            r8 = 2131166219(0x7f07040b, float:1.7946677E38)
            int r36 = r12.getDimensionPixelSize(r8)
            if (r33 == 0) goto L_0x02f9
            X.1Vc r8 = r3.A04
            java.lang.String r34 = "FlowsWebViewDataRepository.getBusinessProfileLogo"
            r31 = r8
            r32 = r10
            android.graphics.Bitmap r13 = r31.BX4(r32, r33, r34, r35, r36)
        L_0x0241:
            java.io.ByteArrayOutputStream r12 = X.C108945cZ.A15()
            if (r13 == 0) goto L_0x024e
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG
            r8 = 100
            r13.compress(r10, r8, r12)
        L_0x024e:
            byte[] r8 = r12.toByteArray()
            java.lang.String r12 = android.util.Base64.encodeToString(r8, r11)
            org.json.JSONObject r12 = r15.put(r14, r12)
            java.lang.String r10 = "is_template"
            r8 = r21
            org.json.JSONObject r12 = r12.put(r10, r8)
            java.lang.String r10 = "hsm_tag"
            r8 = r44
            org.json.JSONObject r12 = r12.put(r10, r8)
            java.lang.String r10 = "entry_point_conversion_source"
            r8 = r18
            org.json.JSONObject r12 = r12.put(r10, r8)
            java.lang.String r10 = "entry_point_conversion_app"
            r8 = r17
            org.json.JSONObject r12 = r12.put(r10, r8)
            java.lang.String r10 = "entry_point_conversation_initiated"
            r8 = r16
            org.json.JSONObject r12 = r12.put(r10, r8)
            r10 = r26
            r8 = r25
            org.json.JSONObject r12 = r12.put(r10, r8)
            r10 = r23
            r8 = r24
            org.json.JSONObject r10 = r12.put(r8, r10)
            java.lang.String r12 = "surface_request"
            java.lang.String r8 = r6.getString(r12)
            org.json.JSONObject r10 = r10.put(r12, r8)
            boolean r8 = r6.containsKey(r12)
            if (r8 == 0) goto L_0x02c1
            r13 = 11785(0x2e09, float:1.6514E-41)
            r12 = r29
            r8 = r45
            boolean r8 = X.C18020vd.A05(r12, r8, r13)
            if (r8 == 0) goto L_0x02c1
            X.00H r8 = r3.A0K
            java.lang.Object r14 = r8.get()
            X.A0p r14 = (X.C19958A0p) r14
            r12 = 2
            X.9rh r8 = new X.9rh
            r13 = r43
            r8.<init>(r13, r13, r12)
            r14.A02(r8, r0)
        L_0x02c1:
            java.lang.String r13 = "flow_action"
            if (r27 == 0) goto L_0x02ee
            java.lang.String r8 = "navigate"
            java.lang.String r8 = r6.getString(r13, r8)
            r10.put(r13, r8)
            r12 = r28
            r8 = r30
            java.lang.String r8 = r6.getString(r12, r8)
            X.C18070vi.A0X(r8)
            byte[] r8 = X.C108975cc.A1O(r8)
            r12 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r8, r12)
            r8 = r28
            r10.put(r8, r13)
        L_0x02e7:
            if (r22 == 0) goto L_0x0309
            r3.A02 = r10
            X.64g r5 = X.C1186264g.A00
            return r5
        L_0x02ee:
            r12 = 2
            java.lang.String r8 = "data_exchange"
            java.lang.String r8 = r6.getString(r13, r8)
            r10.put(r13, r8)
            goto L_0x02e7
        L_0x02f9:
            r13 = 0
            goto L_0x0241
        L_0x02fc:
            r10 = 0
            goto L_0x020b
        L_0x02ff:
            r17 = 0
            r18 = 0
            goto L_0x0164
        L_0x0305:
            java.lang.String r10 = "PUBLISHED"
            goto L_0x0154
        L_0x0309:
            X.11P r8 = r3.A0F
            long r17 = X.AnonymousClass11P.A01(r8)
            java.lang.String r13 = r4.user
            r8 = r37
            long r15 = r8.A02(r13, r1)
            r13 = 0
            int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0326
            r13 = 2892(0xb4c, float:4.053E-42)
            r8 = r45
            long r13 = X.AnonymousClass8BW.A07(r8, r13)
            long r13 = r13 + r15
        L_0x0326:
            int r8 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x0332
            java.lang.String r0 = "extensions-banned-id-error"
            X.64e r5 = new X.64e
            r5.<init>(r0)
            return r5
        L_0x0332:
            X.00H r14 = r3.A0N
            X.8sh r15 = X.AnonymousClass8BR.A0U(r14)
            java.lang.String r13 = "user_interaction"
            r8 = 0
            int r16 = r15.A0E(r4, r13)
            r13 = r20
            boolean r6 = r6.getBoolean(r13, r11)
            if (r6 != 0) goto L_0x0432
            X.00H r6 = r3.A0M
            r17 = r6
            X.A5U r11 = X.AnonymousClass8BR.A0S(r17)
            java.lang.Integer r6 = X.AnonymousClass3MW.A0v(r16)
            X.9dK r11 = r11.A03(r6, r1)
            if (r11 == 0) goto L_0x0432
            java.util.List r6 = r11.A02
            java.util.Iterator r15 = r6.iterator()
        L_0x035f:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x03a1
            java.lang.Object r13 = r15.next()
            r6 = r13
            X.9tm r6 = (X.C195709tm) r6
            java.lang.String r6 = r6.A04
            boolean r6 = X.C18070vi.A18(r6, r1)
            if (r6 == 0) goto L_0x035f
        L_0x0374:
            X.9tm r13 = (X.C195709tm) r13
            if (r13 == 0) goto L_0x0432
            X.8sh r15 = X.AnonymousClass8BR.A0U(r14)
            java.lang.Integer r14 = X.AnonymousClass3MW.A0v(r16)
            java.lang.Short r6 = new java.lang.Short
            r6.<init>(r12)
            r15.A0G(r14, r6)
            java.lang.String r6 = r13.A05
            r3.A02(r6)
            r6 = r45
            boolean r6 = X.A4O.A00(r6, r13)
            if (r6 != 0) goto L_0x0531
            boolean r6 = r3.A03(r0, r1, r10)
            if (r6 != 0) goto L_0x03a3
            X.64e r5 = new X.64e
            r5.<init>(r8)
            return r5
        L_0x03a1:
            r13 = r8
            goto L_0x0374
        L_0x03a3:
            if (r27 == 0) goto L_0x050d
            X.A5U r17 = X.AnonymousClass8BR.A0S(r17)
            r2.L$0 = r3
            r2.L$1 = r4
            r2.L$2 = r1
            r2.L$3 = r0
            r2.L$4 = r9
            r2.L$5 = r7
            r2.L$6 = r10
            r2.L$7 = r11
            r2.L$8 = r13
            r2.L$9 = r13
            r6 = r16
            r2.I$0 = r6
            r6 = 1
            r2.label = r6
            X.3Dp r14 = X.C108975cc.A0k(r2)
            X.B3W r6 = new X.B3W
            r6.<init>(r14)
            r18 = r4
            r19 = r1
            r20 = r0
            r21 = r9
            r22 = r6
            r17.A06(r18, r19, r20, r21, r22)
            java.lang.Object r6 = r14.A00()
            if (r6 != r5) goto L_0x040d
            return r5
        L_0x03e1:
            int r0 = r2.I$0
            r16 = r0
            java.lang.Object r13 = r2.L$9
            X.9tm r13 = (X.C195709tm) r13
            java.lang.Object r11 = r2.L$7
            X.9dK r11 = (X.C185899dK) r11
            java.lang.Object r10 = r2.L$6
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r7 = r2.L$5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r2.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r2.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.L$1
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r2.L$0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r3 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r3
            X.C30691eM.A01(r6)
            r12 = 2
        L_0x040d:
            X.1D6 r6 = (X.AnonymousClass1D6) r6
            java.lang.Object r6 = r6.first
            boolean r6 = X.AnonymousClass000.A1Y(r6)
            if (r6 == 0) goto L_0x0432
            X.C18070vi.A0b(r10)
            r2.L$0 = r8
            r2.L$1 = r8
            r2.L$2 = r8
            r2.L$3 = r8
            r2.L$4 = r8
            r2.L$5 = r8
            r2.L$6 = r8
            r2.L$7 = r8
            r2.L$8 = r8
            r2.L$9 = r8
            r2.label = r12
            goto L_0x051c
        L_0x0432:
            X.00H r6 = r3.A0C
            X.8si r13 = X.AnonymousClass8BR.A0T(r6)
            int r11 = r1.hashCode()
            r12 = 0
            java.lang.String r6 = "metadata_cache_hit"
            r13.A07(r11, r6, r12)
            X.00H r6 = r3.A0M
            X.A5U r11 = X.AnonymousClass8BR.A0S(r6)
            java.lang.Integer r20 = X.AnonymousClass3MW.A0v(r16)
            r2.L$0 = r3
            r2.L$1 = r4
            r2.L$2 = r1
            r2.L$3 = r0
            r2.L$4 = r7
            r2.L$5 = r10
            r2.L$6 = r8
            r2.L$7 = r8
            r2.L$8 = r8
            r2.L$9 = r8
            r6 = r16
            r2.I$0 = r6
            r6 = 4
            r2.label = r6
            X.0wl r8 = r11.A06
            r24 = 0
            com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r6 = new com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r17 = r6
            r18 = r11
            r19 = r4
            r21 = r1
            r22 = r0
            r23 = r9
            r25 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r6 = X.C30451dy.A00(r2, r8, r6)
            if (r6 != r5) goto L_0x04a4
            return r5
        L_0x0485:
            int r0 = r2.I$0
            r16 = r0
            java.lang.Object r10 = r2.L$5
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r7 = r2.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r2.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.L$1
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r2.L$0
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r3 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r3
            X.C30691eM.A01(r6)
        L_0x04a4:
            X.9sY r6 = (X.C194949sY) r6
            X.00H r8 = r3.A0N
            X.8sh r11 = X.AnonymousClass8BR.A0U(r8)
            java.lang.Integer r9 = X.AnonymousClass3MW.A0v(r16)
            java.lang.Short r8 = r6.A01
            r11.A0G(r9, r8)
            X.9dK r11 = r6.A00
            if (r11 == 0) goto L_0x0534
            java.util.List r8 = r11.A02
            java.util.Iterator r9 = r8.iterator()
        L_0x04bf:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x04fc
            java.lang.Object r13 = r9.next()
            r8 = r13
            X.9tm r8 = (X.C195709tm) r8
            java.lang.String r8 = r8.A04
            boolean r8 = X.C18070vi.A18(r8, r1)
            if (r8 == 0) goto L_0x04bf
        L_0x04d4:
            X.9tm r13 = (X.C195709tm) r13
            if (r13 == 0) goto L_0x0534
            java.lang.String r6 = r13.A05
            r3.A02(r6)
            X.0ve r6 = r3.A07
            boolean r6 = X.A4O.A00(r6, r13)
            if (r6 != 0) goto L_0x0531
            X.C18070vi.A0b(r0)
            X.C18070vi.A0b(r1)
            X.C18070vi.A0b(r10)
            boolean r0 = r3.A03(r0, r1, r10)
            if (r0 != 0) goto L_0x04fe
            java.lang.String r0 = "flow-json-fetch-error"
            X.64e r5 = new X.64e
            r5.<init>(r0)
            return r5
        L_0x04fc:
            r13 = 0
            goto L_0x04d4
        L_0x04fe:
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r0
            r2.L$3 = r0
            r2.L$4 = r0
            r2.L$5 = r0
            r0 = 5
            goto L_0x051a
        L_0x050d:
            X.8si r8 = X.AnonymousClass8BR.A0T(r38)
            r6 = 1
            java.lang.String r1 = "metadata_cache_hit"
            r0 = r19
            r8.A07(r0, r1, r6)
            r0 = 3
        L_0x051a:
            r2.label = r0
        L_0x051c:
            r12 = r13
            r13 = r11
            r14 = r3
            r15 = r4
            r16 = r7
            r17 = r2
            r18 = r10
            java.lang.Object r6 = A00(r12, r13, r14, r15, r16, r17, r18)
            if (r6 != r5) goto L_0x0530
            return r5
        L_0x052d:
            X.C30691eM.A01(r6)
        L_0x0530:
            return r6
        L_0x0531:
            X.64f r5 = X.C1186164f.A00
            return r5
        L_0x0534:
            if (r11 == 0) goto L_0x053e
            java.lang.String r0 = "extensions-invalid-extensions-id"
        L_0x0538:
            X.64e r6 = new X.64e
            r6.<init>(r0)
            return r6
        L_0x053e:
            java.lang.String r0 = r6.A02
            goto L_0x0538
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository.A04(android.os.Bundle, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }
}
