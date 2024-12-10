package X;

import java.util.HashMap;

/* renamed from: X.B1n  reason: case insensitive filesystem */
public final class C22285B1n extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $deliveryCallbackFuture;
    public final /* synthetic */ HashMap $protocolErrors;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AnonymousClass1UP $uniSyncResultDataHandler;
    public final /* synthetic */ A01 $usyncRequestData;
    public final /* synthetic */ C199239zf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22285B1n(C199239zf r2, AnonymousClass1UP r3, A01 a01, C26981Ug r5, String str, HashMap hashMap) {
        super(1);
        this.$deliveryCallbackFuture = r5;
        this.this$0 = r2;
        this.$uniSyncResultDataHandler = r3;
        this.$usyncRequestData = a01;
        this.$sessionId = str;
        this.$protocolErrors = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (X.AnonymousClass8BX.A0t("path", ((X.C20678AUk) r5).A01).length() == 1) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r1 > r2) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r19
            X.A6Z r7 = (X.A6Z) r7
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            boolean r0 = r7.A06()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r4 = r18
            if (r0 != 0) goto L_0x0110
            boolean r0 = r7.A04()
            if (r0 != 0) goto L_0x0110
            java.util.List r3 = r7.A01
            java.util.Iterator r10 = r3.iterator()
        L_0x0020:
            boolean r0 = r10.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x010b
            java.lang.Object r5 = r10.next()
            X.BC4 r5 = (X.BC4) r5
            boolean r9 = r5 instanceof X.C20678AUk
            if (r9 == 0) goto L_0x0108
            r0 = r5
            X.AUk r0 = (X.C20678AUk) r0
            org.json.JSONObject r1 = r0.A01
            java.lang.String r0 = "path"
            org.json.JSONArray r0 = X.AnonymousClass8BX.A0t(r0, r1)
            int r1 = r0.length()
            r0 = 1
            if (r1 != r2) goto L_0x0108
        L_0x0043:
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.infra.graphql.error.MexExtensionError"
            if (r0 == 0) goto L_0x0094
            X.C18070vi.A0z(r5, r8)
            r0 = r5
            X.AUk r0 = (X.C20678AUk) r0
            org.json.JSONObject r1 = r0.A00
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = "backoff"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x0091
            long r16 = X.AnonymousClass8BW.A08(r0)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            r16 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x0067:
            X.1UP r12 = r4.$uniSyncResultDataHandler
            X.A01 r0 = r4.$usyncRequestData
            X.2R1 r13 = r0.A01
            java.lang.String r14 = r4.$sessionId
            int r15 = r5.BOq()
            r12.BcQ(r13, r14, r15, r16)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MexUsyncQueryHelper: request error: "
            X.C17900vP.A0X(r5, r0, r1)
            X.1Ug r1 = r4.$deliveryCallbackFuture
            r0 = 0
            r1.BrF(r0)
            int r0 = r3.size()
            if (r0 <= r2) goto L_0x0090
            java.lang.String r0 = "MexUsyncQueryHelper: Unexpected multiple errors when there is a request error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0090:
            return r11
        L_0x0091:
            r16 = -1
            goto L_0x0067
        L_0x0094:
            X.9zf r2 = r4.this$0
            if (r9 == 0) goto L_0x00ba
            int r1 = r5.BOq()
            r0 = 575(0x23f, float:8.06E-43)
            if (r1 != r0) goto L_0x00ba
            X.1Oc r0 = r2.A01
            int r6 = r0.A00
            int r2 = r0.A01
            r0 = r5
            X.AUk r0 = (X.C20678AUk) r0
            org.json.JSONObject r1 = r0.A01
            java.lang.String r0 = "path"
            org.json.JSONArray r0 = X.AnonymousClass8BX.A0t(r0, r1)
            int r1 = r0.length()
            if (r6 > r1) goto L_0x00ba
            r0 = 1
            if (r1 <= r2) goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            X.9zf r2 = r4.this$0
            if (r0 == 0) goto L_0x00cb
            X.C18070vi.A0z(r5, r8)
            X.AUk r5 = (X.C20678AUk) r5
            java.util.HashMap r0 = r4.$protocolErrors
            X.C199239zf.A00(r5, r0)
            goto L_0x0020
        L_0x00cb:
            if (r9 == 0) goto L_0x00fd
            int r1 = r5.BOq()
            r0 = 599(0x257, float:8.4E-43)
            if (r1 != r0) goto L_0x00fd
            X.1Oc r0 = r2.A01
            int r6 = r0.A00
            int r2 = r0.A01
            X.AUk r5 = (X.C20678AUk) r5
            org.json.JSONObject r1 = r5.A01
            java.lang.String r0 = "path"
            org.json.JSONArray r0 = X.AnonymousClass8BX.A0t(r0, r1)
            int r0 = r0.length()
            if (r6 > r0) goto L_0x00fd
            if (r0 > r2) goto L_0x00fd
            java.util.HashMap r2 = r4.$protocolErrors
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MexUsyncQueryHelper: user error: "
            X.C17900vP.A0X(r5, r0, r1)
            X.C199239zf.A00(r5, r2)
            goto L_0x0020
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MexUsyncQueryHelper: ignoring "
            X.C17900vP.A0Z(r7, r0, r1)
            goto L_0x0020
        L_0x0108:
            r0 = 0
            goto L_0x0043
        L_0x010b:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        L_0x0110:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MexUsyncQueryHelper: Mex error: "
            X.C17900vP.A0X(r7, r0, r1)
            X.1Ug r1 = r4.$deliveryCallbackFuture
            X.1Uc r0 = new X.1Uc
            r0.<init>(r7)
            r1.BrC(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22285B1n.invoke(java.lang.Object):java.lang.Object");
    }
}
