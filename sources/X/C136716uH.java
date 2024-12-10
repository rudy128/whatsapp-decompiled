package X;

import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.6uH  reason: invalid class name and case insensitive filesystem */
public abstract class C136716uH {
    public JSONObject A00 = C17880vN.A15();
    public WebMessagePort A01;

    public final void A03(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        jSONObject.put("method", this.A00.get("method")).put("callbackID", this.A00.get("callbackID"));
        AnonymousClass6WN.A00(new C155907tV(this, jSONObject));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        if (r2.equals("go_back") == false) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C1186664k
            if (r0 == 0) goto L_0x009b
            r3 = r12
            X.64k r3 = (X.C1186664k) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "eventName"
            java.lang.String r0 = ""
            java.lang.String r6 = r2.optString(r1, r0)
            java.lang.String r0 = "code"
            r1 = 0
            int r9 = r2.optInt(r0, r1)
            java.lang.String r0 = "channel"
            int r4 = r2.optInt(r0, r1)
            java.lang.String r0 = "psIdKey"
            int r11 = r2.optInt(r0, r1)
            java.lang.String r0 = "fields"
            org.json.JSONArray r5 = r2.optJSONArray(r0)
            java.lang.String r0 = "sampleRate"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r0.toString()
        L_0x003c:
            java.util.HashMap r1 = X.A3M.A01(r0)
            int r0 = r1.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            java.util.Iterator r2 = X.C17890vO.A0i(r1)
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006d
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r8.put(r1, r0)
            goto L_0x0051
        L_0x006b:
            r0 = 0
            goto L_0x003c
        L_0x006d:
            X.C18070vi.A0b(r6)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            if (r5 == 0) goto L_0x0087
            int r2 = r5.length()
            r1 = 0
        L_0x007b:
            if (r1 >= r2) goto L_0x0087
            java.lang.Object r0 = r5.get(r1)
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x007b
        L_0x0087:
            r0 = 1
            if (r4 == r0) goto L_0x0099
            r0 = 2
            r10 = 2
            if (r4 == r0) goto L_0x008f
            r10 = 0
        L_0x008f:
            X.62C r1 = X.C123756Vs.A00(r6, r7, r8, r9, r10, r11)
            X.18K r0 = r3.A00
            r0.CC7(r1)
            goto L_0x00c0
        L_0x0099:
            r10 = 1
            goto L_0x008f
        L_0x009b:
            boolean r0 = r12 instanceof X.C1186864m
            if (r0 == 0) goto L_0x00c3
            r3 = r12
            X.64m r3 = (X.C1186864m) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = "UNKNOWN"
            java.lang.String r2 = r2.optString(r1, r0)
            X.8si r1 = r3.A01
            int r0 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.C18070vi.A0b(r2)
            r1.A0B(r0, r2)
        L_0x00c0:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c3:
            boolean r0 = r12 instanceof X.C1186764l
            if (r0 == 0) goto L_0x00e2
            r3 = r12
            X.64l r3 = (X.C1186764l) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "action"
            r0 = 3
            int r0 = r2.optInt(r1, r0)
            short r2 = (short) r0
            X.8si r1 = r3.A01
            int r0 = r3.A00
            r1.A0F(r0, r2)
            goto L_0x00c0
        L_0x00e2:
            boolean r0 = r12 instanceof X.C1186964o
            if (r0 == 0) goto L_0x0162
            r3 = r12
            X.64o r3 = (X.C1186964o) r3
            org.json.JSONObject r1 = r3.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "action"
            java.lang.String r2 = r1.optString(r0)
            if (r2 == 0) goto L_0x014b
            int r1 = r2.hashCode()
            r0 = 109413649(0x6858511, float:5.0224563E-35)
            if (r1 == r0) goto L_0x0123
            r0 = 192184798(0xb7481de, float:4.7090392E-32)
            if (r1 == r0) goto L_0x011a
            r0 = 1413411612(0x543ef31c, float:3.28048994E12)
            if (r1 != r0) goto L_0x014b
            java.lang.String r0 = "is_accepted"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014b
            X.C1186964o.A00(r3)
            goto L_0x00c0
        L_0x011a:
            java.lang.String r0 = "go_back"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00c0
            goto L_0x014b
        L_0x0123:
            java.lang.String r0 = "shown"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014b
            X.73F r2 = r3.A00
            X.00H r0 = r2.A06
            java.lang.Object r1 = r0.get()
            X.6pP r1 = (X.C133736pP) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A00(r0)
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x00c0
            X.C1186964o.A00(r3)
            X.4Ri r0 = r3.A01
            r0.A01()
            goto L_0x00c0
        L_0x014a:
            r2 = 0
        L_0x014b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsMarketingDisclosureUserAction/execute: unknown action received: \""
            r1.append(r0)
            r1.append(r2)
            r0 = 34
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00c0
        L_0x0162:
            boolean r0 = r12 instanceof com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState
            if (r0 == 0) goto L_0x01b1
            r3 = r12
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState r3 = (com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState) r3
            boolean r0 = r13 instanceof X.C147647Ty
            if (r0 == 0) goto L_0x01ab
            r6 = r13
            X.7Ty r6 = (X.C147647Ty) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01ab
            int r2 = r2 - r1
            r6.label = r2
        L_0x017b:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0195
            if (r0 != r4) goto L_0x01e9
            java.lang.Object r3 = r6.L$0
            X.6uH r3 = (X.C136716uH) r3
            X.C30691eM.A01(r1)
        L_0x018d:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r3.A03(r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0195:
            X.C30691eM.A01(r1)
            X.0wl r2 = r3.A06
            r1 = 0
            com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState$execute$2 r0 = new com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState$execute$2
            r0.<init>(r3, r1)
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r1 = X.C30451dy.A00(r6, r2, r0)
            if (r1 != r5) goto L_0x018d
            return r5
        L_0x01ab:
            X.7Ty r6 = new X.7Ty
            r6.<init>(r3, r13)
            goto L_0x017b
        L_0x01b1:
            boolean r0 = r12 instanceof X.C1186564j
            if (r0 == 0) goto L_0x01cc
            r3 = r12
            X.64j r3 = (X.C1186564j) r3
            org.json.JSONObject r2 = X.C17880vN.A15()
            java.lang.String r1 = "responseData"
            org.json.JSONObject r0 = r3.A00
            org.json.JSONObject r0 = r2.put(r1, r0)
            X.C18070vi.A0b(r0)
            r3.A03(r0)
            goto L_0x00c0
        L_0x01cc:
            boolean r0 = r12 instanceof X.C1186464i
            if (r0 != 0) goto L_0x00c0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsWebBridgeCallable/execute() method not implemented -- "
            r2.append(r0)
            org.json.JSONObject r1 = r12.A00
            java.lang.String r0 = "method"
            java.lang.Object r0 = r1.opt(r0)
            r2.append(r0)
            X.C17890vO.A0w(r2)
            goto L_0x00c0
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136716uH.A04(X.1dr):java.lang.Object");
    }

    public final WebMessagePort A01() {
        return this.A01;
    }

    public final void A02(WebMessagePort webMessagePort) {
        this.A01 = webMessagePort;
    }
}
