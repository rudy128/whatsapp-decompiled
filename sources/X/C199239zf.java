package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.9zf  reason: invalid class name and case insensitive filesystem */
public final class C199239zf {
    public final AnonymousClass190 A00;
    public final C25411Oc A01;
    public final AnonymousClass1PY A02;

    public C199239zf(AnonymousClass190 r4, AnonymousClass1PY r5) {
        int A0G = C72453Mb.A0G(r5, r4, 1);
        this.A02 = r5;
        this.A00 = r4;
        this.A01 = new C25411Oc(A0G, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013f, code lost:
        if (r9 != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26981Ug A01(X.AnonymousClass1UP r29, X.A01 r30, java.lang.String r31) {
        /*
            r28 = this;
            r0 = 0
            r5 = r31
            X.C18070vi.A0d(r5, r0)
            r23 = r29
            boolean r22 = X.AnonymousClass8BU.A1X(r23)
            X.1Ug r25 = new X.1Ug
            r25.<init>()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r6 = r30
            java.util.List r0 = r6.A02
            java.util.Iterator r21 = r0.iterator()
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x002a:
            boolean r0 = r21.hasNext()
            r9 = 1
            if (r0 == 0) goto L_0x0146
            java.lang.Object r8 = r21.next()
            X.9iB r8 = (X.C188899iB) r8
            com.whatsapp.jid.UserJid r0 = r8.A09
            if (r0 == 0) goto L_0x0120
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput r7 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput
            r7.<init>()
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()
            r7.A05(r1, r0)
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0068
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            long r0 = r8.A05
            long r0 = X.C17880vN.A04(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dhash"
            X.8Kx r2 = X.C162478Kx.A00(r2, r1, r0)
            java.lang.String r1 = "about_status"
            X.8Kx r0 = r7.A02()
            r0.A06(r2, r1)
        L_0x0068:
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0085
            int r0 = r8.A02
            if (r0 <= 0) goto L_0x0085
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "id"
            X.8Kx r2 = X.C162478Kx.A00(r2, r1, r0)
            java.lang.String r1 = "picture"
            X.8Kx r0 = r7.A02()
            r0.A06(r2, r1)
        L_0x0085:
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x00b4
            X.9ju r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r2 = 0
            java.lang.String r1 = r8.A0H
            if (r1 == 0) goto L_0x0143
            java.lang.String r0 = "serial"
            X.8Kx r2 = X.C162478Kx.A00(r3, r1, r0)
        L_0x0096:
            java.lang.String r1 = r8.A0C
            if (r1 == 0) goto L_0x013f
            java.lang.String r0 = "tag"
            if (r2 != 0) goto L_0x00a2
            X.8Kx r2 = r3.A00()
        L_0x00a2:
            X.C162478Kx.A01(r2, r1, r0)
        L_0x00a5:
            java.lang.String r1 = "business"
            X.8Kx r0 = r7.A02()
            if (r2 != 0) goto L_0x00b1
            X.8Kx r2 = r3.A00()
        L_0x00b1:
            r0.A06(r2, r1)
        L_0x00b4:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x00f3
            java.lang.String r2 = r8.A0D
            if (r2 == 0) goto L_0x00f3
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00f3
            X.9ju r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "hash"
            X.8Kx r10 = X.C162478Kx.A00(r1, r2, r0)
            long r2 = r8.A04
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "timestamp"
            X.C162478Kx.A01(r10, r1, r0)
            long r0 = r8.A03
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ea
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "expected_timestamp"
            X.C162478Kx.A01(r10, r1, r0)
        L_0x00ea:
            java.lang.String r1 = "devices"
            X.8Kx r0 = r7.A02()
            r0.A06(r10, r1)
        L_0x00f3:
            X.2eA r0 = r8.A0A
            if (r0 == 0) goto L_0x011d
            X.2lX r3 = r0.A00
            if (r3 == 0) goto L_0x011d
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            byte[] r0 = r3.A01
            java.lang.String r1 = X.C197019w1.A00(r0)
            java.lang.String r0 = "tctoken"
            X.8Kx r2 = X.C162478Kx.A00(r2, r1, r0)
            long r0 = r3.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "timestamp"
            X.C162478Kx.A01(r2, r1, r0)
            java.lang.String r1 = "privacy_token"
            X.8Kx r0 = r7.A02()
            r0.A06(r2, r1)
        L_0x011d:
            r4.add(r7)
        L_0x0120:
            boolean r0 = r8.A0W
            r20 = r20 | r0
            boolean r0 = r8.A0S
            r19 = r19 | r0
            boolean r0 = r8.A0P
            r18 = r18 | r0
            boolean r0 = r8.A0U
            r17 = r17 | r0
            boolean r0 = r8.A0R
            r16 = r16 | r0
            boolean r0 = r8.A0J
            r15 = r15 | r0
            boolean r0 = r8.A0N
            r14 = r14 | r0
            boolean r0 = r8.A0M
            r13 = r13 | r0
            goto L_0x002a
        L_0x013f:
            if (r9 == 0) goto L_0x00b4
            goto L_0x00a5
        L_0x0143:
            r9 = 0
            goto L_0x0096
        L_0x0146:
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput r1 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput
            r1.<init>()
            java.lang.String r0 = "query_input"
            r1.A06(r0, r4)
            X.9ju r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            X.2R1 r2 = r6.A01
            X.2Qy r0 = r2.context
            java.lang.String r0 = r0.contextString
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass8BW.A0j(r0)
            X.C162478Kx.A02(r3, r1, r0)
            X.A7K r7 = X.A7K.A01(r1)
            if (r20 == 0) goto L_0x0171
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_username"
            r7.A06(r0, r1)
        L_0x0171:
            if (r19 == 0) goto L_0x017c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_reachability"
            r7.A06(r0, r1)
        L_0x017c:
            if (r18 == 0) goto L_0x0187
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_lid"
            r7.A06(r0, r1)
        L_0x0187:
            if (r17 == 0) goto L_0x0192
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_about_status"
            r7.A06(r0, r1)
        L_0x0192:
            if (r16 == 0) goto L_0x01b7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_picture"
            r7.A06(r0, r1)
            java.lang.String r1 = "image"
            X.2R1 r0 = X.AnonymousClass2R1.A06
            if (r2 != r0) goto L_0x021e
            r0 = r1
        L_0x01a4:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x021b
            java.lang.String r1 = "IMAGE"
        L_0x01ac:
            java.lang.String r0 = "type"
            X.8Kx r1 = X.C162478Kx.A00(r3, r1, r0)
            java.lang.String r0 = "picture_field_input"
            X.C108975cc.A0z(r1, r7, r0)
        L_0x01b7:
            if (r15 == 0) goto L_0x01dd
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_biz"
            r7.A06(r0, r2)
            int r0 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "profile_version"
            X.8Kx r1 = X.C162478Kx.A00(r3, r1, r0)
            java.lang.String r0 = "include_vname"
            X.C162478Kx.A01(r1, r2, r0)
            java.lang.String r0 = "include_profile"
            X.C162478Kx.A01(r1, r2, r0)
            java.lang.String r0 = "business_input"
            X.C108975cc.A0z(r1, r7, r0)
        L_0x01dd:
            if (r14 == 0) goto L_0x01e8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_ddm"
            r7.A06(r0, r1)
        L_0x01e8:
            if (r13 == 0) goto L_0x01f3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "include_devices"
            r7.A06(r0, r1)
        L_0x01f3:
            java.util.HashMap r27 = X.C17880vN.A11()
            X.9au r4 = new X.9au
            r4.<init>(r6)
            r3 = r28
            X.1PY r2 = r3.A02
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl.class
            java.lang.String r0 = "UsyncQuery"
            X.A2g r1 = X.AIj.A01(r7, r2, r1, r0)
            X.B1p r0 = new X.B1p
            r20 = r0
            r21 = r4
            r22 = r3
            r24 = r6
            r26 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r1.A04(r0)
            return r25
        L_0x021b:
            java.lang.String r1 = "PREVIEW"
            goto L_0x01ac
        L_0x021e:
            java.lang.String r0 = "preview"
            goto L_0x01a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199239zf.A01(X.1UP, X.A01, java.lang.String):X.1Ug");
    }

    public static final void A00(C20678AUk aUk, HashMap hashMap) {
        long j;
        String optString;
        String obj = AnonymousClass8BX.A0t("path", aUk.A01).get(1).toString();
        JSONObject jSONObject = aUk.A00;
        if (jSONObject == null || (optString = jSONObject.optString("backoff")) == null) {
            j = 7200;
        } else {
            j = AnonymousClass8BW.A08(optString);
            if (j > 3600000) {
                j = 3600000;
            }
        }
        hashMap.put(C108955ca.A0q(0, AnonymousClass1YF.A0F(obj, "_info", 0, false), obj), new A00(Integer.valueOf(aUk.BOq()), Long.valueOf(j), false));
        C17900vP.A0X(aUk, "MexUsyncQueryHelper: protocol error: ", AnonymousClass000.A10());
    }
}
