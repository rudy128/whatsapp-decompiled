package X;

/* renamed from: X.9A0  reason: invalid class name */
public class AnonymousClass9A0 extends C21327AiC {
    public final C196179ua A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r2 == X.AnonymousClass00R.A0C) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface A00() {
        /*
            r14 = this;
            X.9ua r6 = r14.A00
            r12 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r5 = "GoogleMigrateClient"
            monitor-enter(r6)
            X.AA2 r0 = r6.A01     // Catch:{ all -> 0x0281 }
            r8 = 1
            if (r0 != 0) goto L_0x0026
            android.content.Context r4 = r6.A03     // Catch:{ all -> 0x0281 }
            X.190 r3 = r6.A04     // Catch:{ all -> 0x0281 }
            X.9Z0 r2 = new X.9Z0     // Catch:{ all -> 0x0281 }
            r2.<init>(r6)     // Catch:{ all -> 0x0281 }
            X.9Z1 r1 = new X.9Z1     // Catch:{ all -> 0x0281 }
            r1.<init>(r6)     // Catch:{ all -> 0x0281 }
            X.AA2 r0 = new X.AA2     // Catch:{ all -> 0x0281 }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ all -> 0x0281 }
            r6.A01 = r0     // Catch:{ all -> 0x0281 }
        L_0x0021:
            X.AA2 r3 = r6.A01     // Catch:{ all -> 0x0281 }
            if (r8 == 0) goto L_0x01d5
            goto L_0x0065
        L_0x0026:
            java.lang.Object r3 = r0.A05     // Catch:{ all -> 0x0281 }
            monitor-enter(r3)     // Catch:{ all -> 0x0281 }
            java.lang.Integer r2 = r0.A01     // Catch:{ all -> 0x0278 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0278 }
            if (r2 == r0) goto L_0x0034
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0278 }
            r0 = 0
            if (r2 != r1) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0278 }
            r7 = 0
            if (r0 != 0) goto L_0x0063
            X.AA2 r0 = r6.A01     // Catch:{ all -> 0x0281 }
            r0.A01(r7)     // Catch:{ all -> 0x0281 }
            android.content.Context r4 = r6.A03     // Catch:{ all -> 0x0281 }
            X.190 r3 = r6.A04     // Catch:{ all -> 0x0281 }
            X.9Z0 r2 = new X.9Z0     // Catch:{ all -> 0x0281 }
            r2.<init>(r6)     // Catch:{ all -> 0x0281 }
            X.9Z1 r1 = new X.9Z1     // Catch:{ all -> 0x0281 }
            r1.<init>(r6)     // Catch:{ all -> 0x0281 }
            X.AA2 r0 = new X.AA2     // Catch:{ all -> 0x0281 }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ all -> 0x0281 }
            r6.A01 = r0     // Catch:{ all -> 0x0281 }
            java.lang.String r2 = "svc-client-inconsistent-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "name="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0281 }
            r3.A0G(r2, r0, r7)     // Catch:{ all -> 0x0281 }
            goto L_0x0021
        L_0x0063:
            r8 = 0
            goto L_0x0021
        L_0x0065:
            java.lang.String r1 = r6.A02     // Catch:{ all -> 0x01d0 }
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = "com.google.android.apps.restore"
            boolean r0 = r6.A04(r1)     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "com.google.android.apps.pixelmigrate"
            boolean r0 = r6.A04(r1)     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x007f
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x01d0 }
            r0.<init>()     // Catch:{ all -> 0x01d0 }
            throw r0     // Catch:{ all -> 0x01d0 }
        L_0x007f:
            r6.A02 = r1     // Catch:{ all -> 0x01d0 }
        L_0x0081:
            android.content.Intent r10 = X.C17880vN.A0A()     // Catch:{ NameNotFoundException -> 0x01d2 }
            r10.setPackage(r1)     // Catch:{ NameNotFoundException -> 0x01d2 }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.IOS_APP_DATA_READER_SERVICE"
            r10.setAction(r0)     // Catch:{ NameNotFoundException -> 0x01d2 }
            r7 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "svc-connection/start-connect; service="
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0281 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = ", intent="
            X.C17900vP.A0Y(r10, r0, r1)     // Catch:{ all -> 0x0281 }
            java.lang.Object r2 = r3.A05     // Catch:{ all -> 0x0281 }
            monitor-enter(r2)     // Catch:{ all -> 0x0281 }
            java.lang.Integer r8 = r3.A01     // Catch:{ all -> 0x01cc }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x01cc }
            if (r8 != r0) goto L_0x01a3
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x01cc }
            r3.A01 = r0     // Catch:{ all -> 0x01cc }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r1 = " -> state="
            r8.append(r1)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "CONNECTING"
            X.C17890vO.A1A(r8, r0)     // Catch:{ all -> 0x01cc }
            monitor-exit(r2)     // Catch:{ all -> 0x01cc }
            android.content.Context r8 = r3.A03     // Catch:{ all -> 0x0281 }
            boolean r0 = r8.bindService(r10, r3, r7)     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x01d5
            monitor-enter(r2)     // Catch:{ all -> 0x0281 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x019f }
            r3.A01 = r0     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r4, r1)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "CLOSED"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x019f }
            monitor-exit(r2)     // Catch:{ all -> 0x019f }
            android.content.ComponentName r9 = r10.getComponent()     // Catch:{ all -> 0x0281 }
            r3 = 0
            if (r9 != 0) goto L_0x0149
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0281 }
            java.util.List r2 = r0.queryIntentServices(r10, r3)     // Catch:{ all -> 0x0281 }
            int r0 = r2.size()     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x0120
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "No services found for "
            r1.append(r0)     // Catch:{ all -> 0x0281 }
            r1.append(r10)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = ". Did you update AndroidManifest/queries to enable package visibility for target service?"
            r1.append(r0)     // Catch:{ all -> 0x0281 }
        L_0x00fa:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0281 }
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = ", failed to bind; "
            X.C17900vP.A0g(r0, r2, r1)     // Catch:{ all -> 0x0281 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "Failed to bind to "
            r1.append(r0)     // Catch:{ all -> 0x0281 }
            r1.append(r5)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0281 }
            X.9LP r1 = new X.9LP     // Catch:{ all -> 0x0281 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0281 }
            goto L_0x0280
        L_0x0120:
            int r0 = r2.size()     // Catch:{ all -> 0x0281 }
            if (r0 <= r7) goto L_0x0138
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "Multiple services ("
            X.C17890vO.A15(r0, r1, r2)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = ") found for "
            r1.append(r0)     // Catch:{ all -> 0x0281 }
            r1.append(r10)     // Catch:{ all -> 0x0281 }
            goto L_0x00fa
        L_0x0138:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0281 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ all -> 0x0281 }
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = r0.packageName     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x0281 }
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ all -> 0x0281 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0281 }
        L_0x0149:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ all -> 0x0281 }
            java.lang.String r8 = r9.getPackageName()     // Catch:{ all -> 0x0281 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r8, r3)     // Catch:{ NameNotFoundException -> 0x0188 }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0188 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0188 }
            if (r0 != 0) goto L_0x0168
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0188 }
            java.lang.String r1 = "Package %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ NameNotFoundException -> 0x0188 }
            r0[r3] = r8     // Catch:{ NameNotFoundException -> 0x0188 }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x0188 }
            goto L_0x00fe
        L_0x0168:
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r9, r3)     // Catch:{ NameNotFoundException -> 0x0191 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0191 }
            if (r0 != 0) goto L_0x017d
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0191 }
            java.lang.String r1 = "Service %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ NameNotFoundException -> 0x0191 }
            r0[r3] = r9     // Catch:{ NameNotFoundException -> 0x0191 }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x0191 }
            goto L_0x00fe
        L_0x017d:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0281 }
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r8, r3)     // Catch:{ all -> 0x0281 }
            r1[r7] = r9     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "Package %s is present and enabled; service %s is present and enabled."
            goto L_0x0199
        L_0x0188:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0281 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x0281 }
            r1[r3] = r8     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "Package %s is not present."
            goto L_0x0199
        L_0x0191:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0281 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x0281 }
            r1[r3] = r9     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "Service %s is not present."
        L_0x0199:
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0281 }
            goto L_0x00fe
        L_0x019f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019f }
            goto L_0x0280
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = ", cannot start from state="
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = X.C181739Rq.A00(r8)     // Catch:{ all -> 0x01cc }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x01cc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "Cannot start connection from state: "
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            java.lang.Integer r0 = r3.A01     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = X.C181739Rq.A00(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x01cc }
            X.9LP r0 = new X.9LP     // Catch:{ all -> 0x01cc }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01cc }
            goto L_0x0280
        L_0x01d0:
            r0 = move-exception
            throw r0     // Catch:{ NameNotFoundException -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            goto L_0x027b
        L_0x01d5:
            monitor-exit(r6)     // Catch:{ all -> 0x0281 }
            boolean r0 = X.C22781De.A03()
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot be called from main thread, will deadlock."
            X.C17960vV.A0H(r1, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r8 = "svc-connection/await-binder; service="
            java.lang.String r11 = X.AnonymousClass001.A1H(r8, r5, r0)
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r12
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
        L_0x01f3:
            java.lang.Integer r4 = r3.A01     // Catch:{ all -> 0x0275 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0275 }
            if (r4 != r0) goto L_0x01ff
            android.os.IInterface r0 = r3.A00     // Catch:{ all -> 0x0275 }
            if (r0 == 0) goto L_0x0264
            monitor-exit(r2)     // Catch:{ all -> 0x0275 }
            goto L_0x0213
        L_0x01ff:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0275 }
            if (r4 != r0) goto L_0x023b
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0275 }
            long r0 = r9 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0214
            r2.wait(r0)     // Catch:{ all -> 0x0275 }
            goto L_0x01f3
        L_0x0213:
            return r0
        L_0x0214:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = ", timed out when in state="
            r1.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = "CONNECTING"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0275 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = "Timed out. Connection state: "
            r1.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.Integer r0 = r3.A01     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = X.C181739Rq.A00(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0275 }
            X.9LP r1 = new X.9LP     // Catch:{ all -> 0x0275 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0275 }
            goto L_0x0274
        L_0x023b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = ", not in CONNECTING state; state="
            r1.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = X.C181739Rq.A00(r4)     // Catch:{ all -> 0x0275 }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0275 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = "Cannot wait for binder from state: "
            r1.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.Integer r0 = r3.A01     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = X.C181739Rq.A00(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0275 }
            X.9LP r1 = new X.9LP     // Catch:{ all -> 0x0275 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0275 }
            goto L_0x0274
        L_0x0264:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r8, r5)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = ", null binder"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = "Unexpected failure. Connected with null binder."
            X.9LP r1 = new X.9LP     // Catch:{ all -> 0x0275 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0275 }
        L_0x0274:
            throw r1     // Catch:{ all -> 0x0275 }
        L_0x0275:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0275 }
            throw r0
        L_0x0278:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0278 }
            goto L_0x0280
        L_0x027b:
            X.9LP r1 = new X.9LP     // Catch:{ all -> 0x0281 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0281 }
        L_0x0280:
            throw r1     // Catch:{ all -> 0x0281 }
        L_0x0281:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0281 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9A0.A00():android.os.IInterface");
    }

    public AnonymousClass9A0(C196179ua r1) {
        super(r1);
        this.A00 = r1;
    }
}
