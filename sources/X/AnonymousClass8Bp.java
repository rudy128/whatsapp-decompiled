package X;

import android.content.BroadcastReceiver;

/* renamed from: X.8Bp  reason: invalid class name */
public abstract class AnonymousClass8Bp extends BroadcastReceiver {
    public A8B A00;

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.String r1 = r15.getAction()
            r8 = 0
            if (r1 == 0) goto L_0x003c
            r0 = r13
            X.8Qm r0 = (X.AnonymousClass8Qm) r0
            X.00O r0 = r0.A00
            java.lang.Object r12 = r0.get(r1)
            r12.getClass()
            java.lang.Class<X.A6y> r1 = X.C20095A6y.class
            monitor-enter(r1)
            X.9Ub r0 = X.C20095A6y.A01     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)
            X.C20095A6y.A02(r14)
            r4 = 0
            X.C20095A6y.A02(r14)
            X.BBq r7 = r0.A00
            boolean r0 = r7.CLl()
            if (r0 == 0) goto L_0x00e0
            X.A4Z[] r6 = r7.BQ5()
            if (r6 == 0) goto L_0x00a9
            int r5 = r6.length
            if (r5 <= 0) goto L_0x00a9
            r3 = 0
            goto L_0x0060
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0036:
            boolean r0 = r9.A01(r15)
            if (r0 == 0) goto L_0x005c
        L_0x003c:
            r3 = 0
        L_0x003d:
            X.9ii r2 = X.AnonymousClass9TD.A00
            java.lang.String r0 = r14.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 47
            r1.append(r0)
            X.AnonymousClass8BW.A1M(r13, r1)
            java.lang.String r1 = r1.toString()
            if (r3 == 0) goto L_0x01c6
            java.lang.String r0 = "allow"
            r2.A00(r15, r1, r0)
            return
        L_0x005c:
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x00a9
        L_0x0060:
            r9 = r6[r3]
            java.util.regex.Pattern r1 = r9.A03
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = X.C17890vO.A0U(r12)
            boolean r0 = X.AnonymousClass8BU.A1V(r0, r1)
            if (r0 == 0) goto L_0x005c
        L_0x0070:
            X.A5J r11 = X.C196399uz.A00(r14, r15)     // Catch:{ JSONException -> 0x005c }
            X.9ze r10 = r9.A00     // Catch:{ JSONException -> 0x005c }
            if (r10 == 0) goto L_0x0036
            if (r11 == 0) goto L_0x005c
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x005c }
            java.lang.String r1 = "caller_uid"
            int r0 = r11.A00     // Catch:{ JSONException -> 0x005c }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x005c }
            java.lang.String r1 = r11.A02()     // Catch:{ JSONException -> 0x005c }
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = "caller_package_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x005c }
        L_0x0090:
            java.lang.String r1 = r11.A02     // Catch:{ JSONException -> 0x005c }
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "caller_version_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x005c }
        L_0x0099:
            java.lang.String r1 = r11.A01     // Catch:{ JSONException -> 0x005c }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = "caller_domain"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x005c }
        L_0x00a2:
            boolean r0 = r10.A01(r4, r2)     // Catch:{ JSONException -> 0x005c }
            if (r0 != 0) goto L_0x0036
            goto L_0x005c
        L_0x00a9:
            X.9y3[] r6 = r7.BT9()
            int r5 = r6.length
            r3 = 0
        L_0x00af:
            if (r3 >= r5) goto L_0x00e0
            r7 = r6[r3]
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = X.C17890vO.A0U(r12)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
        L_0x00c1:
            android.content.IntentFilter r2 = r7.A01
            if (r2 == 0) goto L_0x003c
            android.content.ContentResolver r1 = r7.A00
            java.lang.String r0 = "TAG"
            int r0 = r2.match(r1, r15, r8, r0)
            boolean r1 = X.AnonymousClass000.A1R(r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00d9
            if (r1 != 0) goto L_0x00dd
            goto L_0x003c
        L_0x00d9:
            if (r1 == 0) goto L_0x00dd
            goto L_0x003c
        L_0x00dd:
            int r3 = r3 + 1
            goto L_0x00af
        L_0x00e0:
            X.A8B r5 = r13.A00
            if (r5 == 0) goto L_0x003c
            boolean r0 = r5 instanceof X.AnonymousClass8Qh
            if (r0 == 0) goto L_0x0132
            X.A5J r3 = X.C196399uz.A00(r14, r15)
            if (r3 != 0) goto L_0x00f4
            X.A5J r3 = X.C180929Om.A00(r13, r14)
            if (r3 == 0) goto L_0x00f8
        L_0x00f4:
            java.lang.String r4 = r3.A02()
        L_0x00f8:
            java.lang.String r2 = r14.getPackageName()
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x01c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Access denied. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " cannot receive broadcasts from "
            r1.append(r0)
            if (r3 == 0) goto L_0x012f
            java.lang.String r0 = r3.toString()
        L_0x0119:
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
            X.9xA r0 = r5.A00
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.String r2 = "InternalIntentScope"
            X.BA8 r1 = r5.A01
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r3)
            r1.CFI(r2, r3, r0)
            goto L_0x003c
        L_0x012f:
            java.lang.String r0 = "null"
            goto L_0x0119
        L_0x0132:
            boolean r0 = r5 instanceof X.AnonymousClass8Qj
            if (r0 == 0) goto L_0x01b1
            X.8Qj r5 = (X.AnonymousClass8Qj) r5
            android.content.pm.ApplicationInfo r0 = r14.getApplicationInfo()
            int r7 = r0.uid
            X.A5J r3 = X.C196399uz.A00(r14, r15)
            if (r3 != 0) goto L_0x01ae
            X.A5J r3 = X.C180929Om.A00(r13, r14)
            if (r3 != 0) goto L_0x01ae
            r6 = -1
        L_0x014b:
            X.A2W r2 = r5.A00
            java.lang.String r0 = r14.getPackageName()
            X.AiQ r1 = X.C20084A6l.A02(r14, r0)
            java.util.Set r0 = X.BVL.A0b
            boolean r0 = r0.contains(r1)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            boolean r0 = r2.A02(r3, r0)
            if (r0 != 0) goto L_0x01c3
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            if (r0 == 0) goto L_0x01aa
            java.lang.String r4 = r0.getNameForUid(r7)
            java.lang.String r3 = r0.getNameForUid(r6)
        L_0x0173:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Access denied. Process "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r1 = "("
            r2.append(r1)
            r2.append(r4)
            java.lang.String r0 = ") cannot receive broadcasts from "
            X.AnonymousClass000.A1E(r0, r1, r2, r6)
            r2.append(r3)
            java.lang.String r0 = ")the event is: "
            r2.append(r0)
            java.lang.String r0 = r15.getAction()
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r2)
            X.BA8 r2 = r5.A01
            java.lang.String r1 = "FamilyIntentScope"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r3)
            r2.CFI(r1, r3, r0)
            goto L_0x003c
        L_0x01aa:
            java.lang.String r4 = "no_name_available"
            r3 = r4
            goto L_0x0173
        L_0x01ae:
            int r6 = r3.A00
            goto L_0x014b
        L_0x01b1:
            boolean r0 = r5 instanceof X.AnonymousClass8Qg
            if (r0 == 0) goto L_0x01ba
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        L_0x01ba:
            boolean r0 = r5 instanceof X.AnonymousClass8Qf
            if (r0 != 0) goto L_0x01c3
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        L_0x01c3:
            r3 = 1
            goto L_0x003d
        L_0x01c6:
            java.lang.String r0 = "deny"
            r2.A00(r15, r1, r0)
            java.lang.String r1 = "The received intent failed one or more security checks, so no further action is allowed."
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Bp.onReceive(android.content.Context, android.content.Intent):void");
    }
}
