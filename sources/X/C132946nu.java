package X;

import java.security.cert.X509Certificate;

/* renamed from: X.6nu  reason: invalid class name and case insensitive filesystem */
public final class C132946nu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8A2 A01;
    public final /* synthetic */ C139206yP A02;
    public final /* synthetic */ AnonymousClass61Q A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ X509Certificate A05;

    public C132946nu(AnonymousClass8A2 r1, C139206yP r2, AnonymousClass61Q r3, Object obj, X509Certificate x509Certificate, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A05 = x509Certificate;
        this.A04 = obj;
        this.A01 = r1;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass732 r19, X.AnonymousClass705 r20) {
        /*
            r18 = this;
            r7 = r18
            X.6yP r9 = r7.A02     // Catch:{ JSONException -> 0x0159 }
            X.61Q r8 = r7.A03     // Catch:{ JSONException -> 0x0159 }
            int r6 = r7.A00     // Catch:{ JSONException -> 0x0159 }
            java.security.cert.X509Certificate r3 = r7.A05     // Catch:{ JSONException -> 0x0159 }
            java.lang.Object r13 = r7.A04     // Catch:{ JSONException -> 0x0159 }
            X.8A2 r5 = r7.A01     // Catch:{ JSONException -> 0x0159 }
            r10 = 0
            java.security.KeyPair r17 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x0154 }
            X.C18070vi.A0b(r17)     // Catch:{ NoSuchAlgorithmException -> 0x0154 }
            java.lang.String r4 = X.C108985cd.A0p(r17)     // Catch:{ JSONException -> 0x0159 }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "version"
            r0 = 1
            org.json.JSONObject r12 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            X.11P r2 = r9.A00     // Catch:{ JSONException -> 0x0159 }
            long r0 = X.AnonymousClass11P.A01(r2)     // Catch:{ JSONException -> 0x0159 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r15
            java.lang.String r11 = "timestamp"
            org.json.JSONObject r12 = r12.put(r11, r0)     // Catch:{ JSONException -> 0x0159 }
            r11 = r19
            X.77e r0 = r11.A02     // Catch:{ JSONException -> 0x0159 }
            java.lang.Object r1 = r0.A00     // Catch:{ JSONException -> 0x0159 }
            X.C17960vV.A07(r1)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r0 = "access_token"
            org.json.JSONObject r1 = r12.put(r0, r1)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r0 = "client_pub_key"
            org.json.JSONObject r4 = r1.put(r0, r4)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "client_pub_key_type"
            java.lang.String r0 = "RSA 2048"
            org.json.JSONObject r4 = r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            X.C18070vi.A0X(r4)     // Catch:{ JSONException -> 0x0159 }
            boolean r0 = r9 instanceof X.C122186Ob     // Catch:{ JSONException -> 0x0159 }
            if (r0 == 0) goto L_0x006e
            r0 = 2
            X.C18070vi.A0d(r13, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r0 = "encrypted_payload"
            r4.put(r0, r13)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "action"
            java.lang.String r0 = "waffle_1"
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
        L_0x0068:
            java.lang.String r1 = X.C18070vi.A0H(r4)     // Catch:{ JSONException -> 0x0159 }
            goto L_0x0125
        L_0x006e:
            boolean r0 = r9 instanceof X.AnonymousClass6OZ     // Catch:{ JSONException -> 0x0159 }
            if (r0 == 0) goto L_0x009c
            r12 = r9
            X.6OZ r12 = (X.AnonymousClass6OZ) r12     // Catch:{ JSONException -> 0x0159 }
            X.0yx r13 = (X.C19760yx) r13     // Catch:{ JSONException -> 0x0159 }
            r0 = 2
            X.C18070vi.A0d(r13, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "bloks_versioning_id"
            java.lang.String r0 = "4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb"
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "app_id"
            java.lang.Object r0 = r13.A00     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "params"
            java.lang.Object r0 = r13.A01     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            X.11W r0 = r12.A01     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = r0.A02()     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r0 = "user_agent"
        L_0x0098:
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x0159 }
            goto L_0x0068
        L_0x009c:
            boolean r0 = r9 instanceof X.C122176Oa     // Catch:{ JSONException -> 0x0159 }
            if (r0 == 0) goto L_0x00c9
            X.6iX r13 = (X.C129886iX) r13     // Catch:{ JSONException -> 0x0159 }
            r0 = 2
            X.C18070vi.A0d(r13, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "target_account_type"
            int r0 = r13.A00     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "target_account_obid"
            java.lang.String r0 = r13.A04     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "action"
            java.lang.String r0 = "waffle_200"
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = r13.A03     // Catch:{ JSONException -> 0x0159 }
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = "new_account_password"
            goto L_0x0098
        L_0x00c9:
            r12 = r9
            X.6Oc r12 = (X.C122196Oc) r12     // Catch:{ JSONException -> 0x0159 }
            X.6iW r13 = (X.C129876iW) r13     // Catch:{ JSONException -> 0x0159 }
            r0 = 2
            X.C18070vi.A0d(r13, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "target_account_type"
            int r0 = r13.A00     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0159 }
            r1.<init>()     // Catch:{ JSONException -> 0x0159 }
            java.util.List r0 = r13.A04     // Catch:{ JSONException -> 0x0159 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ JSONException -> 0x0159 }
        L_0x00e4:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0159 }
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r14.next()     // Catch:{ JSONException -> 0x0159 }
            r1.put(r0)     // Catch:{ JSONException -> 0x0159 }
            goto L_0x00e4
        L_0x00f2:
            java.lang.String r0 = "opaque_target_accounts_to_be_linked_strings"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "linking_entry_point"
            java.lang.String r0 = r13.A01     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "family_device_id"
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "selected_age_account"
            java.lang.String r0 = r13.A03     // Catch:{ JSONException -> 0x0159 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = "action"
            java.lang.String r0 = "waffle_100"
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0159 }
            X.00H r0 = r12.A07     // Catch:{ JSONException -> 0x0159 }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x0159 }
            X.2kw r0 = (X.C58592kw) r0     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r1 = r0.A00()     // Catch:{ JSONException -> 0x0159 }
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = "machine_id"
            goto L_0x0098
        L_0x0125:
            X.A0V r0 = r9.A01     // Catch:{  }
            X.6h6 r1 = r0.A01(r1, r3)     // Catch:{  }
            long r3 = X.AnonymousClass11P.A01(r2)     // Catch:{  }
            long r3 = r3 / r15
            X.77e r0 = r11.A04     // Catch:{  }
            X.6Od r2 = new X.6Od     // Catch:{  }
            r2.<init>(r1, r0, r3)     // Catch:{  }
            java.security.PrivateKey r17 = r17.getPrivate()     // Catch:{ JSONException -> 0x0159 }
            X.C18070vi.A0X(r17)     // Catch:{ JSONException -> 0x0159 }
            X.6fP r1 = new X.6fP     // Catch:{ JSONException -> 0x0159 }
            r1.<init>(r5, r9)     // Catch:{ JSONException -> 0x0159 }
            X.7GQ r0 = new X.7GQ     // Catch:{ JSONException -> 0x0159 }
            r12 = r20
            r13 = r5
            r14 = r1
            r15 = r7
            r16 = r9
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x0159 }
            r8.CHQ(r0, r2, r6)     // Catch:{ JSONException -> 0x0159 }
            return
        L_0x0154:
            r0 = move-exception
            r5.Bsx(r0, r10)     // Catch:{ JSONException -> 0x0159 }
            return
        L_0x0159:
            r2 = move-exception
            X.8A2 r1 = r7.A01
            r0 = 0
            r1.Bsx(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132946nu.A00(X.732, X.705):void");
    }
}
