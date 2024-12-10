package com.whatsapp.registration.directmigration;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.C17880vN;
import X.C19830z4;
import X.C27341Vs;
import X.C27361Vu;
import android.content.BroadcastReceiver;

public class MigrationProviderOrderedBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass190 A00;
    public AnonymousClass11S A01;
    public AnonymousClass18O A02;
    public C27341Vs A03;
    public C19830z4 A04;
    public C27361Vu A05;
    public AnonymousClass10I A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public final Object A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (X.C24211Jh.A00(r12, "com.whatsapp.w4b") <= 656) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x022e, code lost:
        if (r1 != false) goto L_0x016c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r19, android.content.Intent r20) {
        /*
            r18 = this;
            r4 = r18
            boolean r0 = r4.A0B
            r12 = r19
            if (r0 != 0) goto L_0x007b
            java.lang.Object r1 = r4.A0A
            monitor-enter(r1)
            boolean r0 = r4.A0B     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0076
            X.10G r0 = X.AnonymousClass10E.A10(r12)     // Catch:{ all -> 0x0078 }
            X.10E r2 = r0.AJU     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A63     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.11S r0 = (X.AnonymousClass11S) r0     // Catch:{ all -> 0x0078 }
            r4.A01 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.AC1     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.10I r0 = (X.AnonymousClass10I) r0     // Catch:{ all -> 0x0078 }
            r4.A06 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A9p     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.18O r0 = (X.AnonymousClass18O) r0     // Catch:{ all -> 0x0078 }
            r4.A02 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A5t     // Catch:{ all -> 0x0078 }
            X.00H r0 = X.C000200d.A00(r0)     // Catch:{ all -> 0x0078 }
            r4.A09 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A0J     // Catch:{ all -> 0x0078 }
            X.00H r0 = X.C000200d.A00(r0)     // Catch:{ all -> 0x0078 }
            r4.A07 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A0i     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.1Vs r0 = (X.C27341Vs) r0     // Catch:{ all -> 0x0078 }
            r4.A03 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.ABl     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.0z4 r0 = (X.C19830z4) r0     // Catch:{ all -> 0x0078 }
            r4.A04 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A31     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.190 r0 = (X.AnonymousClass190) r0     // Catch:{ all -> 0x0078 }
            r4.A00 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A0f     // Catch:{ all -> 0x0078 }
            X.00H r0 = X.C000200d.A00(r0)     // Catch:{ all -> 0x0078 }
            r4.A08 = r0     // Catch:{ all -> 0x0078 }
            X.00S r0 = r2.A5Q     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            X.1Vu r0 = (X.C27361Vu) r0     // Catch:{ all -> 0x0078 }
            r4.A05 = r0     // Catch:{ all -> 0x0078 }
            r0 = 1
            r4.A0B = r0     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/on-receive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r0 = r4.A01
            r0.A0I()
            com.whatsapp.Me r11 = r0.A00
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r3 = r0.A04()
            java.lang.String r1 = "com.whatsapp.w4b"
            long r7 = X.C24211Jh.A00(r12, r1)
            r5 = 231714000(0xdcfacd0, double:1.14481927E-315)
            r2 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r3 == 0) goto L_0x00a8
            if (r0 != 0) goto L_0x00a8
            r2 = 0
        L_0x00a8:
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00bf
            X.11S r0 = r4.A01
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x00bf
            long r8 = X.C24211Jh.A00(r12, r1)
            r6 = 656(0x290, double:3.24E-321)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r7 = 1
            if (r0 > 0) goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            android.os.Bundle r6 = X.C17880vN.A0D()
            r10 = r20
            if (r20 == 0) goto L_0x01d7
            java.lang.String r0 = r10.getAction()
            if (r0 == 0) goto L_0x01d7
            X.00H r0 = r4.A09
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C22881Do) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x01d7
            if (r11 == 0) goto L_0x01d7
            java.lang.String r0 = "com.whatsapp.registration.directmigration.initialMigrationInfoAction"
            boolean r0 = X.C17890vO.A1S(r10, r0)
            java.lang.String r2 = "key_backup_token"
            java.lang.String r9 = "phone_number"
            java.lang.String r8 = "me_country_code"
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-initial-migration-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r11.cc
            r6.putString(r8, r0)
            java.lang.String r0 = r11.number
            r6.putString(r9, r0)
            android.os.Bundle r1 = r4.getResultExtras(r5)
            java.lang.String r0 = "database_migration_is_enabled_on_requester_side"
            boolean r5 = r1.getBoolean(r0)
            java.lang.String r0 = "sister_app_content_provider_enabled"
            r6.putBoolean(r0, r7)
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r1 = r0.A04()
            java.lang.String r0 = "sister_app_is_auth_protected"
            r6.putBoolean(r0, r1)
            X.0z4 r0 = r4.A04
            long r0 = r0.A0Q()
            java.lang.String r3 = "sister_app_privacy_auth_timeout"
            r6.putLong(r3, r0)
            X.0z4 r0 = r4.A04
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r0)
            java.lang.String r1 = "token_used_for_migration"
            java.lang.String r0 = ""
            java.lang.String r1 = r3.getString(r1, r0)
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r1, r0)
            r6.putByteArray(r2, r0)
            if (r5 == 0) goto L_0x016c
            if (r7 == 0) goto L_0x016c
            X.18O r1 = r4.A02
            X.18Q r0 = X.AnonymousClass18O.A1T
            int r1 = r1.A04(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            r6.putInt(r0, r1)
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-database-migration-action"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vu r2 = r4.A05
            X.10I r1 = r2.A04
            X.2PL r0 = new X.2PL
            r0.<init>(r2)
            X.C17890vO.A0u(r0, r1)
            X.10I r2 = r4.A06
            r1 = 41
            X.7Pk r0 = new X.7Pk
            r0.<init>(r4, r12, r1)
            r2.CGF(r0)
        L_0x016c:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = -1
            r0 = 0
            r4.setResult(r1, r0, r6)
            return
        L_0x0177:
            if (r7 == 0) goto L_0x01d7
            java.lang.String r0 = "com.whatsapp.registration.directmigration.recoveryTokenAction"
            boolean r0 = X.C17890vO.A1S(r10, r0)
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r7 = r4.getResultExtras(r5)
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r15 = r7.getString(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01d7
            X.0z4 r0 = r4.A04
            java.lang.String r0 = r0.A0l()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x01d7
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x01d7
            X.0z4 r0 = r4.A04
            java.lang.String r0 = r0.A0n()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d7
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x01d7
            java.lang.String r0 = "auth"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            if (r0 != 0) goto L_0x01e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/verifyRequester/invalid auth intent; data="
            X.C17900vP.A0X(r7, r0, r1)
        L_0x01d7:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.setResultCode(r3)
            return
        L_0x01e0:
            java.lang.String r7 = r0.getCreatorPackage()
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x01d7
            android.content.pm.PackageManager r1 = r12.getPackageManager()
            java.lang.String r0 = r12.getPackageName()
            int r0 = r1.checkSignatures(r7, r0)
            if (r0 != 0) goto L_0x01d7
            java.lang.String r0 = X.C17900vP.A0A(r8, r15)
            java.lang.String r1 = X.C181659Ri.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x022c
            byte[] r1 = X.C17970vW.A0J(r12, r1)
            if (r1 == 0) goto L_0x022c
            java.lang.String r0 = "key_recovery_token"
            r6.putByteArray(r0, r1)
            r1 = 1
        L_0x0212:
            X.0z4 r14 = r4.A04
            X.190 r13 = r4.A00
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r16 = X.C20138A8z.A07(r12, r5)
            r17 = r5
            byte[] r0 = X.C20138A8z.A08(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x022e
            r6.putByteArray(r2, r0)
            goto L_0x016c
        L_0x022c:
            r1 = 0
            goto L_0x0212
        L_0x022e:
            if (r1 == 0) goto L_0x01d7
            goto L_0x016c
        L_0x0232:
            java.lang.String r0 = "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            boolean r0 = X.C17890vO.A1S(r10, r0)
            if (r0 == 0) goto L_0x01d7
            android.os.Bundle r0 = r4.getResultExtras(r5)
            X.0z4 r2 = r4.A04
            java.lang.String r1 = "migration_state_on_provider_side"
            int r0 = r0.getInt(r1, r3)
            X.C17900vP.A0M(r2, r1, r0)
            goto L_0x01d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public MigrationProviderOrderedBroadcastReceiver(int i) {
        this.A0B = false;
        this.A0A = C17880vN.A0p();
    }

    public MigrationProviderOrderedBroadcastReceiver() {
        this(0);
    }
}
