package X;

import android.content.SharedPreferences;

/* renamed from: X.11O  reason: invalid class name */
public class AnonymousClass11O {
    public final SharedPreferences A00;

    public int A00() {
        SharedPreferences sharedPreferences = this.A00;
        int i = 1;
        if (AnonymousClass112.A06()) {
            i = -1;
        }
        return sharedPreferences.getInt("night_mode", i);
    }

    public String A01() {
        return this.A00.getString("forced_language", (String) null);
    }

    public boolean A02() {
        return this.A00.getBoolean("run_on_connect_tasks_for_version_change", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2.put("version", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r2.put("registration_state", java.lang.Integer.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r2.put("force_db_check", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r1 = java.lang.Integer.class;
        r2.put("companion_registration_state", r1);
        r2.put("registration_device_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r2.put("forced_language", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r1 = java.lang.Integer.class;
        r2.put("profile_photo_thumb_id", r1);
        r2.put("profile_photo_full_id", r1);
        r2.put("push_name", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        r2.put("async_tasks_pending_for_version_change", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r2.put("night_mode", java.lang.Integer.class);
        r1 = new java.lang.StringBuilder();
        r1.append("WaStartupSharedPreferences/added ");
        r1.append(r2.size());
        r1.append(" keys");
        com.whatsapp.util.Log.i(r1.toString());
        X.AnonymousClass2UQ.A00(r6, r5, r2);
        r5.edit().putInt("startup_migrated_version", 9).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass11O(X.C18010vc r8) {
        /*
            r7 = this;
            java.lang.String r0 = "startup_prefs"
            android.content.SharedPreferences r0 = r8.A05(r0)
            r4 = 9
            r7.<init>()
            r7.A00 = r0
            java.lang.String r3 = "startup_migrated_version"
            r1 = 0
            int r0 = r0.getInt(r3, r1)     // Catch:{ all -> 0x00c8 }
            if (r0 >= r4) goto L_0x00c7
            android.content.SharedPreferences r0 = r7.A00     // Catch:{ all -> 0x00c8 }
            r0.getInt(r3, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = X.C19830z4.A06     // Catch:{ all -> 0x00c8 }
            android.content.SharedPreferences r6 = r8.A05(r0)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c7
            android.content.SharedPreferences r5 = r7.A00     // Catch:{ all -> 0x00c8 }
            int r0 = r5.getInt(r3, r1)     // Catch:{ all -> 0x00c8 }
            if (r0 >= r4) goto L_0x00c7
            int r0 = r5.getInt(r3, r1)     // Catch:{ all -> 0x00c8 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00c8 }
            r2.<init>()     // Catch:{ all -> 0x00c8 }
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0052;
                case 2: goto L_0x005a;
                case 3: goto L_0x0061;
                case 4: goto L_0x0068;
                case 5: goto L_0x0074;
                case 6: goto L_0x007b;
                case 7: goto L_0x008e;
                case 8: goto L_0x0095;
                default: goto L_0x0039;
            }     // Catch:{ all -> 0x00c8 }
        L_0x0039:
            java.lang.String r1 = "Version bump required"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x0041:
            java.lang.String r0 = "client_server_time_diff"
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "client_ntp_time_diff"
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "last_ntp_client_time"
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
        L_0x0052:
            java.lang.String r1 = "version"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x005a:
            java.lang.String r1 = "registration_state"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x0061:
            java.lang.String r1 = "force_db_check"
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x0068:
            java.lang.String r0 = "companion_registration_state"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "registration_device_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
        L_0x0074:
            java.lang.String r1 = "forced_language"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x007b:
            java.lang.String r0 = "profile_photo_thumb_id"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "profile_photo_full_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "push_name"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x008e:
            java.lang.String r1 = "async_tasks_pending_for_version_change"
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x0095:
            java.lang.String r1 = "night_mode"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r2.put(r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r1.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "WaStartupSharedPreferences/added "
            r1.append(r0)     // Catch:{ all -> 0x00c8 }
            int r0 = r2.size()     // Catch:{ all -> 0x00c8 }
            r1.append(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = " keys"
            r1.append(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass2UQ.A00(r6, r5, r2)     // Catch:{ all -> 0x00c8 }
            android.content.SharedPreferences$Editor r0 = r5.edit()     // Catch:{ all -> 0x00c8 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r4)     // Catch:{ all -> 0x00c8 }
            r0.apply()     // Catch:{ all -> 0x00c8 }
        L_0x00c7:
            return
        L_0x00c8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11O.<init>(X.0vc):void");
    }
}
