package com.whatsapp.flows.webview.bridge.factory.impl;

import X.A6n;
import X.AnonymousClass00H;
import X.AnonymousClass4S5;
import X.C136716uH;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C31751g4;
import X.C72473Md;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

public final class StoreShoppingFlowContext extends C136716uH {
    public final UserJid A00;
    public final AnonymousClass4S5 A01;
    public final AnonymousClass00H A02;
    public final String A03;
    public final C18600wl A04;
    public final JSONObject A05;

    public StoreShoppingFlowContext(UserJid userJid, AnonymousClass4S5 r3, AnonymousClass00H r4, String str, C18600wl r6, JSONObject jSONObject) {
        C18070vi.A0d(r6, 4);
        C72473Md.A1J(r3, r4);
        this.A05 = jSONObject;
        this.A00 = userJid;
        this.A03 = str;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
    }

    public Object A04(C30391dr r10) {
        String str;
        JSONObject jSONObject = this.A05;
        if (C18070vi.A18(jSONObject.optString("extension_status", "PUBLISHED"), "DRAFT")) {
            Log.w("StoreShoppingFlowContext/execute: active cart FAB launches only published drafts. The draft shopping flow context is not stored.");
        } else {
            String A032 = A6n.A03("extension_id", jSONObject, true);
            String optString = jSONObject.optString("flow_token");
            String A033 = A6n.A03("flow_action", jSONObject, true);
            String A034 = A6n.A03("flow_action_payload", jSONObject, C18070vi.A15(jSONObject, "flow_action_payload"));
            if (this.A00 == null) {
                str = "StoreShoppingFlowContext/execute: business id is not provided";
            } else if (A032 == null) {
                str = "StoreShoppingFlowContext/execute: cannot find flow id";
            } else if (A033 == null) {
                str = "StoreShoppingFlowContext/execute: cannot find flow action";
            } else {
                Object A002 = C30451dy.A00(r10, this.A04, new StoreShoppingFlowContext$execute$2(this, A032, optString, A033, A034, (C30391dr) null));
                if (A002 == C31751g4.COROUTINE_SUSPENDED) {
                    return A002;
                }
            }
            Log.e(str);
        }
        return C27621Wu.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext r11, com.whatsapp.jid.UserJid r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.C30391dr r17) {
        /*
            r4 = r17
            r7 = r13
            r8 = r14
            r9 = r15
            boolean r0 = r4 instanceof X.C21709Aoc
            if (r0 == 0) goto L_0x0092
            r3 = r4
            X.Aoc r3 = (X.C21709Aoc) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0092
            int r2 = r2 - r1
            r3.label = r2
        L_0x0017:
            java.lang.Object r5 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r1) goto L_0x0098
            java.lang.Object r4 = r3.L$4
            java.lang.Object r9 = r3.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r3.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r3.L$0
            com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext r11 = (com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext) r11
            X.C30691eM.A01(r5)
        L_0x0038:
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.00H r0 = r11.A02
            java.lang.Object r1 = r0.get()
            X.A5T r1 = (X.A5T) r1
            java.lang.String r6 = r11.A03
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0049
            r10 = r4
        L_0x0049:
            java.lang.String r10 = (java.lang.String) r10
            X.4V3 r4 = new X.4V3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A07(r4)
        L_0x0053:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0056:
            X.C30691eM.A01(r5)
            if (r16 == 0) goto L_0x0066
            byte[] r0 = X.AnonymousClass8BT.A1a(r16)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r4 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x006d
        L_0x0066:
            r4 = r10
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x006d:
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0088
            X.4S5 r0 = r11.A01
            r3.L$0 = r11
            r3.L$1 = r13
            r3.L$2 = r14
            r3.L$3 = r15
            r3.L$4 = r4
            r3.label = r1
            java.lang.Object r5 = r0.A01(r12, r3)
            if (r5 != r2) goto L_0x0038
            return r2
        L_0x0088:
            java.lang.String r1 = "StoreShoppingFlowContext/execute: cannot decode flow_action_payload."
            java.lang.Throwable r0 = X.C30671eK.A00(r4)
            com.whatsapp.util.Log.e(r1, r0)
            goto L_0x0053
        L_0x0092:
            X.Aoc r3 = new X.Aoc
            r3.<init>(r11, r4)
            goto L_0x0017
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext.A00(com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }
}
