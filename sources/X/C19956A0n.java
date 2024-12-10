package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A0n  reason: case insensitive filesystem */
public final class C19956A0n {
    public C56602hj A00;
    public AnonymousClass1KB A01;
    public AnonymousClass10I A02;

    public static final ArrayList A00(Context context, C19956A0n a0n, String str, String str2) {
        if (str2.equals("active_account")) {
            return a0n.A01(context, str);
        }
        if (str2.equals("inactive_logged_in_accounts")) {
            return a0n.A02(context, str);
        }
        ArrayList A13 = AnonymousClass000.A13();
        A13.addAll(a0n.A01(context, str));
        A13.addAll(a0n.A02(context, str));
        return A13;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.B9t] */
    public final ArrayList A01(Context context, String str) {
        C24360Bzv bzv;
        ArrayList A13 = AnonymousClass000.A13();
        if (str.equals("Facebook")) {
            bzv = C24360Bzv.FACEBOOK;
        } else if (str.equals("Instagram")) {
            bzv = C24360Bzv.INSTAGRAM;
        } else {
            bzv = C24360Bzv.NO_SOURCE;
        }
        C56602hj r1 = this.A00;
        if (r1 != null) {
            A1J A002 = r1.A00("wa_android_bloks_native_auth", new Object(), false);
            ArrayList A132 = AnonymousClass000.A13();
            try {
                List A012 = A002.A01(context.getApplicationContext(), AnonymousClass1AP.A01(bzv));
                C18070vi.A0X(A012);
                A132.addAll(A012);
                Iterator it = A132.iterator();
                while (it.hasNext()) {
                    A0y a0y = ((C192339oD) it.next()).A01;
                    String str2 = a0y.A01.A02;
                    String str3 = a0y.A00;
                    HashMap A11 = C17880vN.A11();
                    A11.put("user_id", str2);
                    A11.put("auth_token", str3);
                    A11.put("account_type", str);
                    A11.put("app_source", str);
                    A11.put("account_source", "active_account");
                    A13.add(A11);
                }
            } catch (Throwable unused) {
            }
            return A13;
        }
        C18070vi.A11("ssoProviderRepositoryFactory");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.B9t] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(android.content.Context r42, java.lang.String r43) {
        /*
            r41 = this;
            java.lang.String r27 = "wa_android_bloks_native_auth"
            r26 = 0
            java.util.ArrayList r25 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String r0 = "Facebook"
            r14 = r43
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.Bzv r0 = X.C24360Bzv.FACEBOOK
        L_0x0018:
            r4.add(r0)
            goto L_0x0027
        L_0x001c:
            java.lang.String r0 = "Instagram"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.Bzv r0 = X.C24360Bzv.INSTAGRAM
            goto L_0x0018
        L_0x0027:
            r0 = r41
            X.2hj r3 = r0.A00     // Catch:{ all -> 0x0238 }
            if (r3 == 0) goto L_0x0231
            X.Am4 r2 = new X.Am4     // Catch:{ all -> 0x0238 }
            r2.<init>()     // Catch:{ all -> 0x0238 }
            r1 = r27
            r0 = r26
            X.A1J r11 = r3.A00(r1, r2, r0)     // Catch:{ all -> 0x0238 }
            android.content.Context r35 = r42.getApplicationContext()     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r24 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0238 }
            java.util.Iterator r23 = r4.iterator()     // Catch:{ all -> 0x0238 }
        L_0x0046:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r4 = r23.next()     // Catch:{ all -> 0x0238 }
            X.Bzv r4 = (X.C24360Bzv) r4     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0238 }
            java.util.List r0 = X.AnonymousClass9UI.A0A     // Catch:{ all -> 0x0238 }
            java.util.Iterator r2 = X.AnonymousClass8BV.A0y(r0)     // Catch:{ all -> 0x0238 }
        L_0x005c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0238 }
            X.9oe r1 = (X.C192589oe) r1     // Catch:{ all -> 0x0238 }
            X.Bzv r0 = r1.A03     // Catch:{ all -> 0x0238 }
            if (r4 != r0) goto L_0x005c
            r3.add(r1)     // Catch:{ all -> 0x0238 }
            goto L_0x005c
        L_0x0070:
            java.util.Iterator r22 = r3.iterator()     // Catch:{ all -> 0x0238 }
        L_0x0074:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0046
            java.lang.Object r8 = r22.next()     // Catch:{ all -> 0x0238 }
            X.9oe r8 = (X.C192589oe) r8     // Catch:{ all -> 0x0238 }
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A04     // Catch:{ all -> 0x0238 }
            int r0 = r0.incrementAndGet()     // Catch:{ all -> 0x0238 }
            java.lang.String r7 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0238 }
            X.9iJ r6 = r11.A00     // Catch:{ all -> 0x0238 }
            X.9IX r34 = X.AnonymousClass9IX.SAVED_ACCOUNTS     // Catch:{ all -> 0x0238 }
            r5 = 6
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = "resolver_name"
            r0[r26] = r4     // Catch:{ all -> 0x0238 }
            java.lang.Integer r38 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0238 }
            java.lang.String r3 = "LEGACY_PROVIDER"
            r2 = 1
            r0[r2] = r3     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = "caller_name"
            r21 = 2
            r0[r21] = r1     // Catch:{ all -> 0x0238 }
            r1 = 3
            r0[r1] = r27     // Catch:{ all -> 0x0238 }
            r20 = 4
            java.lang.String r19 = "instance_key"
            r0[r20] = r19     // Catch:{ all -> 0x0238 }
            r18 = 5
            r0[r18] = r7     // Catch:{ all -> 0x0238 }
            r6.A00(r0)     // Catch:{ all -> 0x0238 }
            r36 = r11
            r39 = r7
            r40 = r8
            r37 = r34
            android.content.ContentProviderClient r28 = X.A1J.A00(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0238 }
            if (r28 == 0) goto L_0x0074
            X.B9t r0 = r11.A05     // Catch:{ all -> 0x0238 }
            r0.C66(r8)     // Catch:{ all -> 0x0238 }
            X.C18070vi.A0d(r8, r2)     // Catch:{ RemoteException -> 0x01e3 }
            X.C18070vi.A0d(r7, r1)     // Catch:{ RemoteException -> 0x01e3 }
            X.Bzv r0 = r8.A03     // Catch:{ RemoteException -> 0x01e3 }
            X.Bzv r9 = X.C24360Bzv.INSTAGRAM     // Catch:{ RemoteException -> 0x01e3 }
            if (r0 != r9) goto L_0x012b
            X.9IX r12 = X.AnonymousClass9IX.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x01e3 }
            r29 = r6
            r30 = r12
            r31 = r38
            r32 = r7
            r33 = r8
            android.database.Cursor r10 = X.C197419wf.A00(r28, r29, r30, r31, r32, r33)     // Catch:{ RemoteException -> 0x01e3 }
            if (r10 == 0) goto L_0x0125
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ RemoteException -> 0x01e3 }
            java.util.Map r8 = X.CGT.A00     // Catch:{ RemoteException -> 0x01e3 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ RemoteException -> 0x01e3 }
            X.BCK r8 = (X.BCK) r8     // Catch:{ RemoteException -> 0x01e3 }
            if (r8 != 0) goto L_0x0101
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ AmW -> 0x0111 }
            java.lang.String r8 = "Can't find corresponding transformer for SsoSource ="
            java.lang.String r8 = X.AnonymousClass001.A1E(r0, r8, r9)     // Catch:{ AmW -> 0x0111 }
            X.AmW r0 = new X.AmW     // Catch:{ AmW -> 0x0111 }
            r0.<init>((java.lang.String) r8)     // Catch:{ AmW -> 0x0111 }
            throw r0     // Catch:{ AmW -> 0x0111 }
        L_0x0101:
            boolean r0 = r10.moveToNext()     // Catch:{ AmW -> 0x0111 }
            if (r0 == 0) goto L_0x01c9
            X.9ow r0 = r8.CPl(r10, r12)     // Catch:{ AmW -> 0x0111 }
            if (r0 == 0) goto L_0x0101
            r9.add(r0)     // Catch:{ AmW -> 0x0111 }
            goto L_0x0101
        L_0x0111:
            r9 = move-exception
            java.lang.String[] r8 = X.C17880vN.A1b(r4, r3, r5, r2)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "failure_reason"
            r8[r21] = r0     // Catch:{ all -> 0x01c4 }
            X.AnonymousClass8BU.A1L(r9, r8)     // Catch:{ all -> 0x01c4 }
            r8[r18] = r7     // Catch:{ all -> 0x01c4 }
            r6.A00(r8)     // Catch:{ all -> 0x01c4 }
            r10.close()     // Catch:{ RemoteException -> 0x01e3 }
        L_0x0125:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ RemoteException -> 0x01e3 }
            goto L_0x01cc
        L_0x012b:
            X.9IX r30 = X.AnonymousClass9IX.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x01e3 }
            r29 = r6
            r31 = r38
            r32 = r7
            r33 = r8
            android.database.Cursor r10 = X.C197419wf.A00(r28, r29, r30, r31, r32, r33)     // Catch:{ RemoteException -> 0x01e3 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ RemoteException -> 0x01e3 }
            if (r10 == 0) goto L_0x01cc
            boolean r8 = r10.moveToNext()     // Catch:{ RemoteException -> 0x01e3 }
            if (r8 != r2) goto L_0x01cc
            java.lang.String r8 = r10.getString(r2)     // Catch:{ JSONException -> 0x01b2 }
            java.util.ArrayList r17 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x01b2 }
            if (r8 == 0) goto L_0x0169
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01b2 }
            r13.<init>(r8)     // Catch:{ JSONException -> 0x01b2 }
            int r16 = r13.length()     // Catch:{ JSONException -> 0x01b2 }
            r12 = 0
        L_0x0159:
            r8 = r16
            if (r12 >= r8) goto L_0x0169
            java.lang.Object r15 = r13.get(r12)     // Catch:{ JSONException -> 0x01b2 }
            r8 = r17
            X.C108955ca.A1U(r15, r8)     // Catch:{ JSONException -> 0x01b2 }
            int r12 = r12 + 1
            goto L_0x0159
        L_0x0169:
            java.util.Iterator r15 = r17.iterator()     // Catch:{ JSONException -> 0x01b2 }
        L_0x016d:
            boolean r8 = r15.hasNext()     // Catch:{ JSONException -> 0x01b2 }
            if (r8 == 0) goto L_0x01c9
            java.lang.String r8 = X.C17880vN.A0v(r15)     // Catch:{ JSONException -> 0x01b2 }
            org.json.JSONObject r8 = X.C17880vN.A16(r8)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r12 = "profile"
            org.json.JSONObject r12 = r8.getJSONObject(r12)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r13 = "uid"
            java.lang.String r29 = r12.getString(r13)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r13 = "access_token"
            java.lang.String r30 = r8.getString(r13)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r31 = "FACEBOOK"
            java.util.Map r8 = X.C197419wf.A00     // Catch:{ JSONException -> 0x01b2 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ JSONException -> 0x01b2 }
            if (r8 == 0) goto L_0x01ad
            X.C00 r8 = (X.C00) r8     // Catch:{ JSONException -> 0x01b2 }
            X.Dbo r13 = new X.Dbo     // Catch:{ JSONException -> 0x01b2 }
            r13.<init>(r12)     // Catch:{ JSONException -> 0x01b2 }
            X.9ow r12 = new X.9ow     // Catch:{ JSONException -> 0x01b2 }
            r28 = r12
            r32 = r13
            r33 = r8
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x01b2 }
            r9.add(r12)     // Catch:{ JSONException -> 0x01b2 }
            goto L_0x016d
        L_0x01ad:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ JSONException -> 0x01b2 }
            throw r0     // Catch:{ JSONException -> 0x01b2 }
        L_0x01b2:
            r12 = move-exception
            java.lang.String[] r8 = X.C17880vN.A1b(r4, r3, r5, r2)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "failure_reason"
            r8[r21] = r0     // Catch:{ all -> 0x01c4 }
            X.AnonymousClass8BU.A1L(r12, r8)     // Catch:{ all -> 0x01c4 }
            r8[r18] = r7     // Catch:{ all -> 0x01c4 }
            r6.A00(r8)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c9
        L_0x01c4:
            r0 = move-exception
            r10.close()     // Catch:{ RemoteException -> 0x01e3 }
            throw r0     // Catch:{ RemoteException -> 0x01e3 }
        L_0x01c9:
            r10.close()     // Catch:{ RemoteException -> 0x01e3 }
        L_0x01cc:
            r9.isEmpty()     // Catch:{ RemoteException -> 0x01e3 }
            r0 = r20
            java.lang.String[] r0 = X.C17880vN.A1b(r4, r3, r0, r2)     // Catch:{ RemoteException -> 0x01e3 }
            r0[r21] = r19     // Catch:{ RemoteException -> 0x01e3 }
            r0[r1] = r7     // Catch:{ RemoteException -> 0x01e3 }
            r6.A00(r0)     // Catch:{ RemoteException -> 0x01e3 }
            r0 = r24
            r0.addAll(r9)     // Catch:{ RemoteException -> 0x01e3 }
            goto L_0x0074
        L_0x01e3:
            r8 = move-exception
            java.lang.String[] r1 = X.C17880vN.A1b(r4, r3, r5, r2)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "failure_reason"
            r1[r21] = r0     // Catch:{ all -> 0x0238 }
            X.AnonymousClass8BU.A1L(r8, r1)     // Catch:{ all -> 0x0238 }
            r1[r18] = r7     // Catch:{ all -> 0x0238 }
            r6.A00(r1)     // Catch:{ all -> 0x0238 }
            goto L_0x0074
        L_0x01f6:
            java.util.Iterator r5 = r24.iterator()
        L_0x01fa:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0238
            java.lang.Object r0 = r5.next()
            X.9ow r0 = (X.C192759ow) r0
            if (r0 == 0) goto L_0x01fa
            java.lang.String r4 = r0.A01
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "inactive_logged_in_accounts"
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String r0 = "user_id"
            r1.put(r0, r4)
            java.lang.String r0 = "auth_token"
            r1.put(r0, r3)
            java.lang.String r0 = "account_type"
            r1.put(r0, r14)
            java.lang.String r0 = "app_source"
            r1.put(r0, r14)
            java.lang.String r0 = "account_source"
            r1.put(r0, r2)
            r0 = r25
            r0.add(r1)
            goto L_0x01fa
        L_0x0231:
            java.lang.String r0 = "ssoProviderRepositoryFactory"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0238 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x0238 }
        L_0x0238:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19956A0n.A02(android.content.Context, java.lang.String):java.util.ArrayList");
    }
}
