package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1NP  reason: invalid class name */
public final class AnonymousClass1NP {
    public final C19830z4 A00;
    public final C18010vc A01;
    public final AnonymousClass11N A02;
    public final C18100vl A03 = new C18110vm(new AnonymousClass1NQ(this));

    public AnonymousClass1NP(AnonymousClass11N r3, C19830z4 r4, C18010vc r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r5;
    }

    public final synchronized void A0A() {
        A07().edit().remove("google_backup_retry_count").commit();
    }

    public final void A0G(int i) {
        if (C200410p.A0S(new Integer[]{0, 1, 2, 3, 4}).contains(Integer.valueOf(i))) {
            A07().edit().putString("interface_gdrive_backup_frequency", String.valueOf(i)).apply();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/cannot set invalid frequency=");
        sb.append(i);
        Log.e(sb.toString());
    }

    public final void A0M(String str) {
        C18070vi.A0d(str, 0);
        A07().edit().putLong(str, System.currentTimeMillis()).apply();
    }

    public final boolean A0R(String str, long j) {
        C18070vi.A0d(str, 1);
        long j2 = A07().getLong(str, -1);
        if (j2 == -1 || System.currentTimeMillis() > j2 + j) {
            return true;
        }
        return false;
    }

    public static final C49532Qv A00(AnonymousClass1NP r3) {
        AnonymousClass00H r32 = r3.A00.A00;
        if (!((SharedPreferences) r32.get()).getBoolean("encrypted_backup_enabled", false)) {
            return C49532Qv.UNENCRYPTED;
        }
        if (((SharedPreferences) r32.get()).getBoolean("encrypted_backup_using_encryption_key", false)) {
            return C49532Qv.ENCRYPTION_KEY_ENCRYPTED;
        }
        return C49532Qv.PASSWORD_ENCRYPTED;
    }

    public final SharedPreferences A07() {
        return (SharedPreferences) this.A03.getValue();
    }

    public final void A0B(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/set-backup-restore-state/");
        sb.append(i);
        Log.i(sb.toString());
        A07().edit().putInt("backup_restore_state", i).apply();
    }

    public final void A0D(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/set-encrypted-backups-fleet-migration-state/");
        sb.append(i);
        Log.i(sb.toString());
        A07().edit().putInt("encrypted_backup_fleet_migration_state", i).apply();
    }

    public final void A0E(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/set-encrypted-backups-num-attempts-remaining/");
        sb.append(i);
        Log.i(sb.toString());
        A07().edit().putInt("encrypted_backup_num_attempts_remaining", i).apply();
    }

    public final void A0H(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/set-google-backup-state/");
        sb.append(i);
        Log.i(sb.toString());
        A07().edit().putInt("gdrive_state", i).apply();
    }

    public final void A0K(C59502mP r5, String str) {
        if (str != null && str.length() != 0) {
            SharedPreferences.Editor edit = A07().edit();
            StringBuilder sb = new StringBuilder();
            sb.append("backup_stats_media_size:");
            sb.append(str);
            SharedPreferences.Editor putLong = edit.putLong(sb.toString(), r5.A00);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("backup_stats_timestamp:");
            sb2.append(str);
            SharedPreferences.Editor putLong2 = putLong.putLong(sb2.toString(), r5.A03);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("backup_stats_msg_id:");
            sb3.append(str);
            SharedPreferences.Editor putLong3 = putLong2.putLong(sb3.toString(), r5.A01);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("backup_stats_prem_msg_id:");
            sb4.append(str);
            putLong3.putLong(sb4.toString(), r5.A02).apply();
        }
    }

    public final void A0L(String str) {
        if (str != null && str.length() != 0) {
            SharedPreferences.Editor edit = A07().edit();
            StringBuilder sb = new StringBuilder();
            sb.append("backup_stats_media_size:");
            sb.append(str);
            SharedPreferences.Editor remove = edit.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("backup_stats_timestamp:");
            sb2.append(str);
            SharedPreferences.Editor remove2 = remove.remove(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("backup_stats_msg_id:");
            sb3.append(str);
            SharedPreferences.Editor remove3 = remove2.remove(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("backup_stats_prem_msg_id:");
            sb4.append(str);
            remove3.remove(sb4.toString()).apply();
        }
    }

    public final void A0N(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSharedPreferences/set-encrypted-backup-force-reg-after-logout/");
        sb.append(z);
        Log.i(sb.toString());
        A07().edit().putBoolean("encrypted_backup_show_forced_reg_after_logout", z).apply();
    }

    public final int A01() {
        int i = A07().getInt("backup_restore_state", -1);
        if (i < 0) {
            return ((SharedPreferences) this.A00.A00.get()).getInt("backup_restore_state", 0);
        }
        return i;
    }

    public final int A02() {
        SharedPreferences sharedPreferences;
        if (A07().contains("gdrive_error_code")) {
            sharedPreferences = A07();
        } else {
            sharedPreferences = (SharedPreferences) this.A00.A00.get();
        }
        return sharedPreferences.getInt("gdrive_error_code", 10);
    }

    public final int A03() {
        int i;
        String valueOf;
        Integer A032;
        if (A07().contains("interface_gdrive_backup_frequency")) {
            valueOf = A07().getString("interface_gdrive_backup_frequency", "0");
        } else {
            try {
                i = Integer.parseInt(((SharedPreferences) this.A00.A00.get()).getString("interface_gdrive_backup_frequency", String.valueOf(0)));
            } catch (NumberFormatException e) {
                Log.e("wa-shared-preferences/get-backup-freq", e);
                i = 0;
            }
            valueOf = String.valueOf(i);
        }
        if (valueOf == null || (A032 = AnonymousClass1YD.A03(valueOf)) == null) {
            return 0;
        }
        return A032.intValue();
    }

    public final int A04() {
        int i;
        String valueOf;
        Integer A032;
        if (A07().contains("interface_gdrive_backup_network_setting")) {
            valueOf = A07().getString("interface_gdrive_backup_network_setting", "0");
        } else {
            try {
                i = Integer.parseInt(((SharedPreferences) this.A00.A00.get()).getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
            } catch (NumberFormatException e) {
                Log.w("wa-shared-preferences/get-backup-network-settings", e);
                i = 0;
            }
            valueOf = String.valueOf(i);
        }
        if (valueOf == null || (A032 = AnonymousClass1YD.A03(valueOf)) == null) {
            return 0;
        }
        return A032.intValue();
    }

    public final int A05() {
        int i = A07().getInt("gdrive_state", -1);
        if (i < 0) {
            return ((SharedPreferences) this.A00.A00.get()).getInt("gdrive_state", 0);
        }
        return i;
    }

    public final long A06() {
        if (A07().contains("gdrive_restore_start_timestamp")) {
            return A07().getLong("gdrive_restore_start_timestamp", -1);
        }
        return this.A00.A0W("gdrive_restore_start_timestamp");
    }

    public final C49532Qv A08() {
        Object obj;
        String string = A07().getString("backup_encryption_method", (String) null);
        if (string != null) {
            try {
                Iterator it = C49532Qv.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C18070vi.A18(((C49532Qv) obj).persistedName, string)) {
                        break;
                    }
                }
                C49532Qv r1 = (C49532Qv) obj;
                if (r1 != null) {
                    return r1;
                }
            } catch (IllegalArgumentException unused) {
                return C49532Qv.UNENCRYPTED;
            }
        }
        return A00(this);
    }

    public final void A09() {
        A07().edit().remove("media_restore_start_timestamp").remove("pending_media_restore_already_downloaded_file_count").remove("media_restore_overall_exec_time").remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_media_restore_network_setting").remove("gdrive_approx_media_download_size").remove("gdrive_restore_start_timestamp").apply();
    }

    public final void A0C(int i) {
        A07().edit().putInt("backup_current_banner_type", i).apply();
        A07().edit().putBoolean("backup_current_banner_shown", false).apply();
    }

    public final void A0F(int i) {
        A07().edit().putInt("gdrive_error_code", i).apply();
    }

    public final void A0I(long j) {
        A07().edit().putLong("media_restore_overall_exec_time", j).apply();
    }

    public final void A0J(C49532Qv r4) {
        A07().edit().putString("backup_encryption_method", r4.persistedName).apply();
    }

    public final void A0O(boolean z) {
        A07().edit().putBoolean("gdrive_include_videos_in_backup", z).apply();
    }

    public final boolean A0P() {
        SharedPreferences sharedPreferences;
        if (A07().contains("gdrive_include_videos_in_backup")) {
            sharedPreferences = A07();
        } else {
            sharedPreferences = (SharedPreferences) this.A00.A00.get();
        }
        return sharedPreferences.getBoolean("gdrive_include_videos_in_backup", false);
    }

    public final boolean A0Q() {
        SharedPreferences sharedPreferences;
        if (A07().contains("gdrive_restore_overwrite_local_files")) {
            sharedPreferences = A07();
        } else {
            sharedPreferences = (SharedPreferences) this.A00.A00.get();
        }
        return sharedPreferences.getBoolean("gdrive_restore_overwrite_local_files", false);
    }
}
