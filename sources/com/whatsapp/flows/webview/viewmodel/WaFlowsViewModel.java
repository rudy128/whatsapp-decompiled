package com.whatsapp.flows.webview.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass122;
import X.AnonymousClass18K;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1PM;
import X.C108945cZ;
import X.C125506bB;
import X.C125516bC;
import X.C125526bD;
import X.C158167zq;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C195719tn;
import X.C20051A4x;
import X.C22821Di;
import X.C33251iW;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import java.util.HashMap;

public final class WaFlowsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final AnonymousClass1DT A06 = C108945cZ.A0S();
    public final AnonymousClass1DT A07 = C108945cZ.A0S();
    public final AnonymousClass1DT A08 = C108945cZ.A0S();
    public final C125506bB A09;
    public final C125516bC A0A;
    public final C125526bD A0B;
    public final C33251iW A0C;
    public final AnonymousClass1PM A0D;
    public final AnonymousClass122 A0E;
    public final C18030ve A0F;
    public final AnonymousClass18K A0G;
    public final C20051A4x A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final HashMap A0R = C17880vN.A11();
    public final C22821Di A0S = new C158167zq(this);
    public final C18600wl A0T;
    public final AnonymousClass11P A0U;

    public static int A03(WaFlowsViewModel waFlowsViewModel) {
        C195719tn r0 = ((FlowsWebViewDataRepository) waFlowsViewModel.A0N.get()).A00;
        if (r0 != null) {
            return r0.A04.hashCode();
        }
        return 0;
    }

    public WaFlowsViewModel(C125506bB r22, C125516bC r23, C125526bD r24, C33251iW r25, AnonymousClass1PM r26, AnonymousClass11P r27, AnonymousClass122 r28, C18030ve r29, AnonymousClass18K r30, C20051A4x a4x, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, C18600wl r41) {
        C18600wl r0 = r41;
        C18030ve r13 = r29;
        C20051A4x a4x2 = a4x;
        AnonymousClass00H r10 = r32;
        AnonymousClass11P r15 = r27;
        C18070vi.A0w(r10, r15, r13, r0, a4x2);
        AnonymousClass18K r12 = r30;
        AnonymousClass00H r9 = r33;
        AnonymousClass00H r8 = r34;
        C33251iW r17 = r25;
        AnonymousClass122 r14 = r28;
        C18070vi.A0x(r9, r17, r14, r8, r12);
        AnonymousClass00H r7 = r35;
        AnonymousClass00H r6 = r36;
        C125516bC r19 = r23;
        C125526bD r18 = r24;
        C125506bB r20 = r22;
        C18070vi.A0y(r7, r20, r19, r18, r6);
        AnonymousClass00H r5 = r37;
        AnonymousClass00H r4 = r38;
        AnonymousClass00H r3 = r39;
        AnonymousClass1PM r16 = r26;
        C18070vi.A0t(r16, r5, r4, r3);
        AnonymousClass00H r2 = r40;
        C18070vi.A0d(r2, 20);
        this.A0L = r10;
        this.A0U = r15;
        this.A0F = r13;
        this.A0T = r0;
        this.A0H = a4x2;
        this.A0N = r9;
        this.A0C = r17;
        this.A0E = r14;
        this.A0M = r8;
        this.A0G = r12;
        this.A0J = r7;
        this.A09 = r20;
        this.A0A = r19;
        this.A0B = r18;
        this.A0P = r6;
        this.A0D = r16;
        this.A0K = r5;
        this.A0Q = r4;
        this.A0I = r3;
        this.A0O = r2;
    }

    public static int A00(WaFlowsViewModel waFlowsViewModel) {
        C195719tn r0 = ((FlowsWebViewDataRepository) waFlowsViewModel.A0N.get()).A00;
        if (r0 != null) {
            return r0.A04.hashCode();
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0T(android.os.Bundle r12, com.whatsapp.jid.UserJid r13, X.C30391dr r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C147657Tz
            r7 = r11
            if (r0 == 0) goto L_0x0049
            r4 = r14
            X.7Tz r4 = (X.C147657Tz) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x004f
            java.lang.Object r10 = r4.L$0
            X.1Dh r10 = (X.C22811Dh) r10
            X.C30691eM.A01(r3)
        L_0x0025:
            boolean r0 = r10.element
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002c:
            X.C30691eM.A01(r3)
            X.1Dh r10 = new X.1Dh
            r10.<init>()
            X.0wl r0 = r11.A0T
            r9 = 0
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2 r5 = new com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2
            r6 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.label = r1
            java.lang.Object r0 = X.C30451dy.A00(r4, r0, r5)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x0049:
            X.7Tz r4 = new X.7Tz
            r4.<init>(r11, r14)
            goto L_0x0013
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel.A0T(android.os.Bundle, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.8sp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.64k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.8so} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.64m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.64j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.8sl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.8sn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.64o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.6uH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.8st} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.64l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.6uH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext} */
    /* JADX WARNING: type inference failed for: r8v6, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r11v8, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0U(android.webkit.WebMessagePort r17, X.C30391dr r18, org.json.JSONObject r19) {
        /*
            r16 = this;
            java.lang.String r1 = "method"
            r0 = r19
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "data"
            org.json.JSONObject r4 = r0.optJSONObject(r1)
            if (r4 != 0) goto L_0x0014
            org.json.JSONObject r4 = X.C17880vN.A15()
        L_0x0014:
            X.C18070vi.A0b(r2)
            int r1 = r2.hashCode()
            r11 = 0
            r3 = r16
            switch(r1) {
                case -1943398688: goto L_0x0038;
                case -1723197709: goto L_0x0052;
                case -1483010279: goto L_0x00a2;
                case -1291933730: goto L_0x00e9;
                case -1065806377: goto L_0x0130;
                case -445923484: goto L_0x016f;
                case -153019303: goto L_0x018f;
                case -60583558: goto L_0x01c8;
                case -19964313: goto L_0x01ff;
                case 63780460: goto L_0x021a;
                case 490215099: goto L_0x022b;
                case 665045520: goto L_0x0262;
                case 714831445: goto L_0x02a2;
                case 717743399: goto L_0x02bd;
                case 883610163: goto L_0x02da;
                case 1345434866: goto L_0x02eb;
                case 1636133391: goto L_0x031e;
                case 2113914398: goto L_0x0341;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.64h r6 = new X.64h
            r6.<init>()
        L_0x0026:
            r1 = r17
            r6.A02(r1)
            r6.A00 = r0
            r0 = r18
            java.lang.Object r0 = r6.A04(r0)
            java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)
            return r0
        L_0x0038:
            java.lang.String r1 = "WAQPLLogger.end"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0M
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.8si r2 = (X.C172058si) r2
            int r1 = A03(r3)
            X.64l r6 = new X.64l
            r6.<init>(r2, r1)
            goto L_0x0026
        L_0x0052:
            java.lang.String r1 = "WAFlowsStoreShoppingFlowContext"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.6bB r6 = r3.A09
            X.00H r2 = r3.A0N
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x0066
            com.whatsapp.jid.UserJid r11 = r1.A02
        L_0x0066:
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x009f
            java.lang.String r5 = r1.A07
        L_0x006e:
            java.lang.Object r1 = r2.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            org.json.JSONObject r4 = r1.A02
            if (r4 != 0) goto L_0x007c
            org.json.JSONObject r4 = X.C17880vN.A15()
        L_0x007c:
            X.1pS r1 = r6.A00
            X.10E r3 = r1.A00
            X.0wl r12 = X.AnonymousClass3MZ.A1B(r3)
            X.00S r1 = r3.ABW
            java.lang.Object r2 = r1.get()
            X.4S5 r2 = (X.AnonymousClass4S5) r2
            X.10G r1 = r3.A00
            X.00S r1 = r1.A4W
            X.00H r10 = X.C000200d.A00(r1)
            com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext r6 = new com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext
            r7 = r6
            r8 = r11
            r9 = r2
            r11 = r5
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x0026
        L_0x009f:
            java.lang.String r5 = ""
            goto L_0x006e
        L_0x00a2:
            java.lang.String r1 = "WAFlowsMarketingDisclosureState"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.6bC r2 = r3.A0A
            X.00H r1 = r3.A0N
            java.lang.Object r1 = r1.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            X.206 r12 = r1.A01
            X.1pS r3 = r2.A00
            X.10E r2 = r3.A00
            X.00V r1 = r2.Ao9
            android.content.Context r7 = X.C000500i.A00(r1)
            X.00S r1 = r2.A2I
            java.lang.Object r9 = r1.get()
            X.70E r9 = (X.AnonymousClass70E) r9
            X.00S r1 = r2.A2a
            java.lang.Object r11 = r1.get()
            X.6oy r11 = (X.C133556oy) r11
            X.1pR r1 = r3.A01
            X.00S r1 = r1.A03
            java.lang.Object r10 = r1.get()
            X.4Ri r10 = (X.C86364Ri) r10
            X.11S r8 = X.AnonymousClass10E.A17(r2)
            X.0wl r13 = X.AnonymousClass3MZ.A1B(r2)
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState r6 = new com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0026
        L_0x00e9:
            java.lang.String r1 = "WAExtensionsDataChannelExchange"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.0wl r1 = r3.A0T
            X.1OY r13 = X.AnonymousClass1OW.A02(r1)
            X.A4x r7 = r3.A0H
            X.00H r2 = r3.A0N
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x012e
            java.lang.String r8 = r1.A07
        L_0x0103:
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x012c
            java.lang.String r9 = r1.A08
        L_0x010b:
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x012a
            java.lang.String r10 = r1.A04
        L_0x0113:
            X.9tn r1 = X.C108965cb.A0O(r2)
            if (r1 == 0) goto L_0x011f
            com.whatsapp.jid.UserJid r1 = r1.A02
            java.lang.String r11 = r1.getRawString()
        L_0x011f:
            java.lang.String r12 = r4.toString()
            X.8st r6 = new X.8st
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0026
        L_0x012a:
            r10 = r11
            goto L_0x0113
        L_0x012c:
            r9 = r11
            goto L_0x010b
        L_0x012e:
            r8 = r11
            goto L_0x0103
        L_0x0130:
            java.lang.String r1 = "WAExtensionsComplete"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            X.9tn r13 = X.C108965cb.A0O(r1)
            if (r13 == 0) goto L_0x0021
            X.0ve r11 = r3.A0F
            X.1iW r7 = r3.A0C
            java.lang.Object r1 = r1.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            X.206 r14 = r1.A01
            X.122 r10 = r3.A0E
            X.00H r1 = r3.A0L
            java.lang.Object r12 = X.C18070vi.A0E(r1)
            X.A5U r12 = (X.A5U) r12
            X.00H r1 = r3.A0I
            java.lang.Object r9 = X.C18070vi.A0E(r1)
            X.44b r9 = (X.C822444b) r9
            X.00H r1 = r3.A0O
            java.lang.Object r8 = X.C18070vi.A0E(r1)
            X.9uT r8 = (X.C196109uT) r8
            X.1Di r15 = r3.A0S
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete r6 = new com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0026
        L_0x016f:
            java.lang.String r1 = "WAFlowsDownloadResponse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "flow_id"
            java.lang.String r2 = r4.optString(r1)
            int r1 = X.C108955ca.A05(r2)
            if (r1 <= 0) goto L_0x0021
            X.1DT r1 = r3.A06
            r1.A0E(r2)
            X.64i r6 = new X.64i
            r6.<init>()
            goto L_0x0026
        L_0x018f:
            java.lang.String r1 = "WAFlowsMarketingDisclosureUserAction"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.6bD r2 = r3.A0B
            X.00H r1 = r3.A0N
            java.lang.Object r1 = r1.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            X.206 r5 = r1.A01
            X.1pS r4 = r2.A00
            X.10E r2 = r4.A00
            X.00S r1 = r2.A2a
            java.lang.Object r3 = r1.get()
            X.6oy r3 = (X.C133556oy) r3
            X.00S r1 = r2.A2Z
            java.lang.Object r2 = r1.get()
            X.73F r2 = (X.AnonymousClass73F) r2
            X.1pR r1 = r4.A01
            X.00S r1 = r1.A03
            java.lang.Object r1 = r1.get()
            X.4Ri r1 = (X.C86364Ri) r1
            X.64o r6 = new X.64o
            r6.<init>(r2, r1, r3, r5)
            goto L_0x0026
        L_0x01c8:
            java.lang.String r1 = "WAFlowsSetCartItem"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            X.9tn r2 = X.C108965cb.A0O(r1)
            if (r2 == 0) goto L_0x0021
            X.00H r1 = r3.A0J
            java.lang.Object r1 = r1.get()
            X.6g5 r1 = (X.AnonymousClass6g5) r1
            com.whatsapp.jid.UserJid r5 = r2.A02
            X.6b9 r1 = r1.A01
            X.1pS r1 = r1.A00
            X.10E r4 = r1.A00
            X.00S r1 = r4.A1o
            java.lang.Object r3 = r1.get()
            X.A8S r3 = (X.A8S) r3
            X.9XU r2 = X.C37381pR.A1B()
            X.0wl r1 = X.AnonymousClass3MZ.A1B(r4)
            com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem r6 = new com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem
            r6.<init>(r3, r2, r5, r1)
            goto L_0x0026
        L_0x01ff:
            java.lang.String r1 = "WAQPLLogger.annotate"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0M
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.8si r2 = (X.C172058si) r2
            int r1 = A03(r3)
            X.8sn r6 = new X.8sn
            r6.<init>(r2, r1)
            goto L_0x0026
        L_0x021a:
            java.lang.String r1 = "WAExtensionsGetClientAbProps"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.0ve r1 = r3.A0F
            X.8sl r6 = new X.8sl
            r6.<init>(r1)
            goto L_0x0026
        L_0x022b:
            java.lang.String r1 = "WAFlowsGetCart"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            X.9tn r2 = X.C108965cb.A0O(r1)
            if (r2 == 0) goto L_0x0021
            X.00H r1 = r3.A0J
            java.lang.Object r1 = r1.get()
            X.6g5 r1 = (X.AnonymousClass6g5) r1
            com.whatsapp.jid.UserJid r5 = r2.A02
            X.6b8 r1 = r1.A00
            X.1pS r1 = r1.A00
            X.10E r4 = r1.A00
            X.00S r1 = r4.A1o
            java.lang.Object r3 = r1.get()
            X.A8S r3 = (X.A8S) r3
            X.9XU r2 = X.C37381pR.A1B()
            X.0wl r1 = X.AnonymousClass3MZ.A1B(r4)
            com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart r6 = new com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart
            r6.<init>(r3, r2, r5, r1)
            goto L_0x0026
        L_0x0262:
            java.lang.String r1 = "WAExtensionsGetFlowData"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.0ve r4 = r3.A0F
            r2 = 8418(0x20e2, float:1.1796E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 == 0) goto L_0x028b
            X.00H r1 = r3.A0M
            java.lang.Object r4 = r1.get()
            X.A6h r4 = (X.C20081A6h) r4
            int r1 = A03(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "webview_js_callback_start"
            r4.A0B(r2, r1)
        L_0x028b:
            X.00H r1 = r3.A0N
            java.lang.Object r1 = r1.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            org.json.JSONObject r1 = r1.A02
            if (r1 != 0) goto L_0x029b
            org.json.JSONObject r1 = X.C17880vN.A15()
        L_0x029b:
            X.64j r6 = new X.64j
            r6.<init>(r1)
            goto L_0x0026
        L_0x02a2:
            java.lang.String r1 = "WAQPLLogger.point"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0M
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.8si r2 = (X.C172058si) r2
            int r1 = A03(r3)
            X.64m r6 = new X.64m
            r6.<init>(r2, r1)
            goto L_0x0026
        L_0x02bd:
            java.lang.String r1 = "WAQPLLogger.start"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0M
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.8si r2 = (X.C172058si) r2
            X.00H r1 = r3.A0N
            X.9tn r1 = X.C108965cb.A0O(r1)
            X.8so r6 = new X.8so
            r6.<init>(r2, r1)
            goto L_0x0026
        L_0x02da:
            java.lang.String r1 = "WAMLogger"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.18K r1 = r3.A0G
            X.64k r6 = new X.64k
            r6.<init>(r1)
            goto L_0x0026
        L_0x02eb:
            java.lang.String r1 = "WAFlowsClearCart"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            X.9tn r2 = X.C108965cb.A0O(r1)
            if (r2 == 0) goto L_0x0021
            X.00H r1 = r3.A0J
            java.lang.Object r1 = r1.get()
            X.6g5 r1 = (X.AnonymousClass6g5) r1
            com.whatsapp.jid.UserJid r3 = r2.A02
            X.6bA r1 = r1.A02
            X.1pS r1 = r1.A00
            X.10E r1 = r1.A00
            X.0wl r2 = X.AnonymousClass3MZ.A1B(r1)
            X.00S r1 = r1.A1o
            java.lang.Object r1 = r1.get()
            X.A8S r1 = (X.A8S) r1
            com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart r6 = new com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsClearCart
            r6.<init>(r1, r3, r2)
            goto L_0x0026
        L_0x031e:
            java.lang.String r1 = "WAExtensionsNavigate"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            java.lang.Object r1 = r1.get()
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r1 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r1
            X.206 r4 = r1.A01
            X.122 r2 = r3.A0E
            X.00H r1 = r3.A0P
            java.lang.Object r1 = X.C18070vi.A0E(r1)
            X.A2M r1 = (X.A2M) r1
            X.8sp r6 = new X.8sp
            r6.<init>(r2, r1, r4)
            goto L_0x0026
        L_0x0341:
            java.lang.String r1 = "WAExtensionsGetPublicKey"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0021
            X.00H r1 = r3.A0N
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository r2 = (com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository) r2
            java.lang.String r1 = "force_refresh"
            boolean r1 = r4.optBoolean(r1)
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey r6 = new com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey
            r6.<init>(r2, r1)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel.A0U(android.webkit.WebMessagePort, X.1dr, org.json.JSONObject):java.lang.Object");
    }
}
