package X;

/* renamed from: X.2xW  reason: invalid class name and case insensitive filesystem */
public final class C66042xW implements AnonymousClass191 {
    public final AnonymousClass1NP A00;
    public final C18010vc A01;

    public /* synthetic */ void Blf() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f2, code lost:
        if (r1 <= 5) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r3.A07().edit().putString("backup_encryption_method", X.AnonymousClass1NP.A00(r3).persistedName).commit() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blg() {
        /*
            r7 = this;
            X.1NP r3 = r7.A00
            android.content.SharedPreferences r0 = r3.A07()
            java.lang.String r4 = "backup_encryption_method"
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0026
            X.2Qv r2 = X.AnonymousClass1NP.A00(r3)
            android.content.SharedPreferences r0 = r3.A07()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r2.persistedName
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L_0x0037
        L_0x0026:
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "encrypted_backup_enabled"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "encrypted_backup_using_encryption_key"
            X.C17880vN.A1B(r1, r0)
        L_0x0037:
            X.0vc r1 = r7.A01
            java.lang.String r0 = X.C19830z4.A06
            android.content.SharedPreferences r6 = r1.A05(r0)
            X.C18070vi.A0X(r6)
            r4 = 5
            android.content.SharedPreferences r0 = r3.A07()
            java.lang.String r2 = "backup_migrated_version"
            r1 = 0
            int r0 = r0.getInt(r2, r1)
            if (r0 >= r4) goto L_0x00e8
            android.content.SharedPreferences r0 = r3.A07()
            int r1 = r0.getInt(r2, r1)
            java.util.HashMap r5 = X.C17880vN.A11()
            if (r1 > 0) goto L_0x00e9
            java.lang.String r1 = "backup_cleanup_stages_to_skip"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r5.put(r1, r0)
        L_0x0065:
            java.lang.String r1 = "backup_restore_state"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r5.put(r1, r0)
        L_0x006c:
            java.lang.String r0 = "encrypted_backup_num_attempts_remaining"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r5.put(r0, r1)
            java.lang.String r0 = "encrypted_backup_fleet_migration_state"
            r5.put(r0, r1)
            java.lang.String r1 = "encrypted_backup_show_forced_reg_after_logout"
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r5.put(r1, r0)
        L_0x007f:
            java.lang.String r1 = "gdrive_error_code"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r5.put(r1, r0)
            java.lang.String r0 = "interface_gdrive_backup_frequency"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5.put(r0, r1)
            java.lang.String r0 = "interface_gdrive_backup_network_setting"
            r5.put(r0, r1)
            java.lang.String r1 = "gdrive_include_videos_in_backup"
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r5.put(r1, r0)
            java.lang.String r1 = "gdrive_already_downloaded_bytes"
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r5.put(r1, r0)
        L_0x00a0:
            java.lang.String r1 = "gdrive_restore_overwrite_local_files"
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r5.put(r1, r0)
            java.lang.String r1 = "gdrive_media_restore_network_setting"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r5.put(r1, r0)
            java.lang.String r0 = "gdrive_approx_media_download_size"
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r5.put(r0, r1)
            java.lang.String r0 = "gdrive_restore_start_timestamp"
            r5.put(r0, r1)
            java.lang.String r1 = "gdrive_state"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r5.put(r1, r0)
        L_0x00c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupSharedPreferences/added "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = " keys"
            X.C17890vO.A1A(r1, r0)
            android.content.SharedPreferences r0 = r3.A07()
            X.AnonymousClass2UQ.A00(r6, r0, r5)
            android.content.SharedPreferences r0 = r3.A07()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1C(r0, r2, r4)
        L_0x00e8:
            return
        L_0x00e9:
            r0 = 1
            if (r1 <= r0) goto L_0x0065
            r0 = 3
            if (r1 <= r0) goto L_0x006c
            r0 = 4
            if (r1 <= r0) goto L_0x007f
            if (r1 > r4) goto L_0x00c1
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66042xW.Blg():void");
    }

    public C66042xW(AnonymousClass1NP r1, C18010vc r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
