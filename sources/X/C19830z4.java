package X;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0z4  reason: invalid class name and case insensitive filesystem */
public class C19830z4 {
    public static final String A06;
    public final AnonymousClass00H A00;
    public final Object A01 = new Object();
    public final AnonymousClass11N A02;
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final Object A05 = new Object();

    public int A0C() {
        return ((SharedPreferences) this.A00.get()).getInt("connection_sequence_state", 0);
    }

    public int A0N(String str) {
        return ((SharedPreferences) this.A00.get()).getInt(str, 0);
    }

    public void A16() {
        A00(this).putBoolean("show_statuses_education", false).apply();
    }

    public /* synthetic */ void A1z(JSONObject jSONObject) {
        int ordinal;
        String str;
        StringBuilder sb;
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 1);
        SharedPreferences sharedPreferences = (SharedPreferences) this.A00.get();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = A0s().iterator();
        while (it.hasNext()) {
            C19760yx r1 = (C19760yx) it.next();
            String str2 = (String) r1.A00;
            if (jSONObject2.has(str2)) {
                C19770yy r0 = (C19770yy) r1.A01;
                if (r0 == null) {
                    ordinal = -1;
                } else {
                    ordinal = r0.ordinal();
                }
                if (ordinal == 0) {
                    try {
                        edit.putInt(str2, jSONObject2.getInt(str2));
                    } catch (JSONException e) {
                        e = e;
                        int i = sharedPreferences.getInt(str2, 0);
                        sb = new StringBuilder();
                        sb.append('$');
                        sb.append("WaSharedPreferences");
                        sb.append("/restoreData/error in restoring int/key: ");
                        sb.append(str2);
                        sb.append("/value: ");
                        sb.append(i);
                    }
                } else if (ordinal == 1) {
                    try {
                        edit.putBoolean(str2, jSONObject2.getBoolean(str2));
                    } catch (JSONException e2) {
                        e = e2;
                        boolean z = sharedPreferences.getBoolean(str2, false);
                        sb = new StringBuilder();
                        sb.append('$');
                        sb.append("WaSharedPreferences");
                        sb.append("/restoreData/error in restoring bool/key: ");
                        sb.append(str2);
                        sb.append("/value: ");
                        sb.append(z);
                    }
                } else if (ordinal == 2) {
                    try {
                        edit.putString(str2, jSONObject2.getString(str2));
                    } catch (JSONException e3) {
                        e = e3;
                        String string = sharedPreferences.getString(str2, (String) null);
                        sb = new StringBuilder();
                        sb.append('$');
                        sb.append("WaSharedPreferences");
                        sb.append("/restoreData/error in restoring string/key: ");
                        sb.append(str2);
                        sb.append("/value: ");
                        sb.append(string);
                    }
                } else if (ordinal == 3) {
                    try {
                        JSONArray jSONArray = jSONObject2.getJSONArray(str2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            linkedHashSet.add(jSONArray.get(i2).toString());
                        }
                        edit.putStringSet(str2, linkedHashSet);
                    } catch (JSONException e4) {
                        e = e4;
                        Set<String> stringSet = sharedPreferences.getStringSet(str2, (Set) null);
                        sb = new StringBuilder();
                        sb.append('$');
                        sb.append("WaSharedPreferences");
                        sb.append("/restoreData/error in restoring string set/key: ");
                        sb.append(str2);
                        sb.append("/value: ");
                        sb.append(stringSet);
                        str = sb.toString();
                        Log.e(str, e);
                    }
                } else if (ordinal == 4) {
                    try {
                        edit.putLong(str2, jSONObject2.getLong(str2));
                    } catch (JSONException e5) {
                        e = e5;
                        long j = sharedPreferences.getLong(str2, -1);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('$');
                        sb2.append("WaSharedPreferences");
                        sb2.append("/restoreData/error in restoring long/key: ");
                        sb2.append(str2);
                        sb2.append("/value: ");
                        sb2.append(j);
                        str = sb2.toString();
                    }
                }
            }
        }
        edit.apply();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19620yd.A09);
        sb.append("_light");
        A06 = sb.toString();
    }

    public static SharedPreferences.Editor A00(C19830z4 r0) {
        return ((SharedPreferences) r0.A00.get()).edit();
    }

    public static ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        C19770yy r2 = C19770yy.BOOL;
        arrayList.add(new C19760yx("security_notifications", r2));
        arrayList.add(new C19760yx("input_enter_send", r2));
        C19770yy r4 = C19770yy.STRING;
        arrayList.add(new C19760yx("interface_font_size", r4));
        arrayList.add(new C19760yx("settings_language", r4));
        arrayList.add(new C19760yx("conversation_sound", r2));
        C19770yy r42 = C19770yy.INT;
        arrayList.add(new C19760yx("autodownload_wifi_mask", r42));
        arrayList.add(new C19760yx("autodownload_cellular_mask", r42));
        arrayList.add(new C19760yx("autodownload_roaming_mask", r42));
        arrayList.add(new C19760yx("voip_low_data_usage", r2));
        arrayList.add(new C19760yx("lock_folder_hidden", r2));
        arrayList.add(new C19760yx("does_user_have_passcode", r2));
        arrayList.add(new C19760yx("chat_lock_broken_encoding_checked", r2));
        arrayList.add(new C19760yx("adv_paired_hosted_device_atleast_once", r2));
        arrayList.add(new C19760yx("smb_coex_lazy_sys_msg_enabled", r2));
        return arrayList;
    }

    public int A02() {
        return ((SharedPreferences) this.A00.get()).getInt("adv_current_key_index", -1);
    }

    public int A03() {
        return ((SharedPreferences) this.A00.get()).getInt("adv_raw_id", -1);
    }

    public int A04() {
        return ((SharedPreferences) this.A00.get()).getInt("autodownload_cellular_mask", 1);
    }

    public int A05() {
        return ((SharedPreferences) this.A00.get()).getInt("connection_sequence_attempts", 0);
    }

    public int A06() {
        return ((SharedPreferences) this.A00.get()).getInt("create_group_tool_tip_nudge_count", 0);
    }

    public int A07() {
        return ((SharedPreferences) this.A00.get()).getInt("expressions_tray_peek_height_landscape", 0);
    }

    public int A08() {
        return ((SharedPreferences) this.A00.get()).getInt("expressions_tray_peek_height_portrait", 0);
    }

    public int A09() {
        return ((SharedPreferences) this.A00.get()).getInt("pref_flash_call_call_log_permission_granted", -1);
    }

    public int A0A() {
        return ((SharedPreferences) this.A00.get()).getInt("pref_flash_call_education_link_clicked", -1);
    }

    public int A0B() {
        return ((SharedPreferences) this.A00.get()).getInt("pref_flash_call_manage_call_permission_granted", -1);
    }

    public int A0D() {
        return ((SharedPreferences) this.A00.get()).getInt("native_contacts_integrity_pending", 0);
    }

    public int A0E() {
        return ((SharedPreferences) this.A00.get()).getInt("number_of_inactive_accounts", 0);
    }

    public int A0F() {
        return ((SharedPreferences) this.A00.get()).getInt("original_media_quality", 0);
    }

    public int A0G() {
        return ((SharedPreferences) this.A00.get()).getInt("photo_quality", 0);
    }

    public int A0H() {
        return ((SharedPreferences) this.A00.get()).getInt("migrate_from_other_app_attempt_count", 0);
    }

    public int A0I() {
        return ((SharedPreferences) this.A00.get()).getInt("privacy_profile_photo", 0);
    }

    public int A0J() {
        return ((SharedPreferences) this.A00.get()).getInt("reg_attempts_verify_code", 0);
    }

    public int A0K() {
        return ((SharedPreferences) this.A00.get()).getInt("gdrive_successive_backup_failed_count", 0);
    }

    public int A0L() {
        return ((SharedPreferences) this.A00.get()).getInt("video_quality", 0);
    }

    public long A0O() {
        return ((SharedPreferences) this.A00.get()).getLong("native_contacts_download_timestamp", 0);
    }

    public long A0P() {
        return ((SharedPreferences) this.A00.get()).getLong("native_contacts_enter_integrity_pass_timestamp", 0);
    }

    public long A0Q() {
        return ((SharedPreferences) this.A00.get()).getLong("privacy_fingerprint_timeout", 60000);
    }

    public long A0R() {
        return ((SharedPreferences) this.A00.get()).getLong("registration_initialized_time", 0);
    }

    public long A0S(AnonymousClass1BI r6) {
        if (r6 == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("show_expired_group_dialog");
        sb.append(r6.getRawString());
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public long A0U(String str) {
        if (str == null) {
            Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public long A0V(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), -1);
    }

    public long A0W(String str) {
        return ((SharedPreferences) this.A00.get()).getLong(str, -1);
    }

    public Point A0X(int i) {
        Point point = new Point();
        AnonymousClass00H r2 = this.A00;
        point.x = ((SharedPreferences) r2.get()).getInt("foldable_max_display_width", i);
        point.y = ((SharedPreferences) r2.get()).getInt("foldable_max_display_height", i);
        return point;
    }

    public Point A0Y(int i) {
        Point point = new Point();
        AnonymousClass00H r2 = this.A00;
        point.x = ((SharedPreferences) r2.get()).getInt("foldable_min_display_width", i);
        point.y = ((SharedPreferences) r2.get()).getInt("foldable_min_display_height", i);
        return point;
    }

    public Integer A0Z() {
        AnonymousClass00H r1 = this.A00;
        if (((SharedPreferences) r1.get()).contains("get_groups_params")) {
            return Integer.valueOf(((SharedPreferences) r1.get()).getInt("get_groups_params", 0));
        }
        return null;
    }

    public String A0a() {
        AnonymousClass00H r9 = this.A00;
        String string = ((SharedPreferences) r9.get()).getString("app_install_source", "unknown|unknown");
        String string2 = ((SharedPreferences) r9.get()).getString("app_install_source_from_app_manager", (String) null);
        if (((SharedPreferences) r9.get()).getLong("referrer_clicked_time_for_app_manager", 0) < ((SharedPreferences) r9.get()).getLong("referrer_clicked_time", 0) || TextUtils.isEmpty(string2)) {
            return string;
        }
        return string2;
    }

    public String A0b() {
        return ((SharedPreferences) this.A00.get()).getString("block_list_v2_dhash", (String) null);
    }

    public String A0c() {
        return ((SharedPreferences) this.A00.get()).getString("brigading_banner_state", (String) null);
    }

    public String A0d() {
        return ((SharedPreferences) this.A00.get()).getString("encrypted_rid", "");
    }

    public String A0e() {
        return ((SharedPreferences) this.A00.get()).getString("fbns_token", (String) null);
    }

    public String A0f() {
        return ((SharedPreferences) this.A00.get()).getString("gdrive_account_name", (String) null);
    }

    public String A0g() {
        return ((SharedPreferences) this.A00.get()).getString("c2dm_reg_id", (String) null);
    }

    public String A0h() {
        return ((SharedPreferences) this.A00.get()).getString("pref_graphql_domain", "whatsapp.com");
    }

    public String A0i() {
        return ((SharedPreferences) this.A00.get()).getString("account_switching_logged_out_phone_number", (String) null);
    }

    public String A0j() {
        String string = ((SharedPreferences) this.A00.get()).getString("perf_device_id", (String) null);
        if (string != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        A00(this).putString("perf_device_id", obj).apply();
        return obj;
    }

    public String A0k() {
        return ((SharedPreferences) this.A00.get()).getString("email_address", (String) null);
    }

    public String A0l() {
        return ((SharedPreferences) this.A00.get()).getString("cc", "");
    }

    public String A0m() {
        return ((SharedPreferences) this.A00.get()).getString("registration_jid", (String) null);
    }

    public String A0n() {
        return ((SharedPreferences) this.A00.get()).getString("ph", "");
    }

    public String A0o() {
        return ((SharedPreferences) this.A00.get()).getString("settings_verification_email_address", (String) null);
    }

    public String A0p() {
        return ((SharedPreferences) this.A00.get()).getString("pref_wfs_user", (String) null);
    }

    public String A0q(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("dc_user_postcode_");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getString(sb.toString(), (String) null);
    }

    public ArrayList A0r() {
        String string = ((SharedPreferences) this.A00.get()).getString("dismissed_missed_call_notification_key_list", (String) null);
        if (string != null) {
            return new ArrayList(Arrays.asList(string.split(",")));
        }
        return new ArrayList();
    }

    public ArrayList A0t() {
        return new ArrayList(((SharedPreferences) this.A00.get()).getStringSet("pref_nta_target_accounts", new HashSet()));
    }

    public ArrayList A0u() {
        String string = ((SharedPreferences) this.A00.get()).getString("pref_reg_methods_order", (String) null);
        if (string != null) {
            return new ArrayList(Arrays.asList(string.split(",")));
        }
        return null;
    }

    public List A0v() {
        String string = ((SharedPreferences) this.A00.get()).getString("network:last_blocked_session_ids", "");
        if (string.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.asList(string.split(",", 0));
    }

    public Set A0w(String str) {
        Set<String> stringSet = ((SharedPreferences) this.A00.get()).getStringSet(str, new HashSet());
        C17960vV.A07(stringSet);
        return stringSet;
    }

    public void A12() {
        ((SharedPreferences) this.A00.get()).edit().remove("flash_call_eligible").remove("is_first_flash_call_request").remove("pref_flash_call_education_link_clicked").remove("pref_flash_call_manage_call_permission_granted").remove("pref_flash_call_call_log_permission_granted").remove("pref_flash_call_education_screen_displayed").remove("pref_prefer_sms_over_flash").apply();
    }

    public void A13() {
        int i = ((SharedPreferences) this.A00.get()).getInt("connection_lc", 0);
        if (i == Integer.MAX_VALUE) {
            i = -1;
        }
        A00(this).putInt("connection_lc", i + 1).apply();
    }

    public void A17(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("pref_autoconf_verification_status", i).apply();
    }

    public void A18(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("autoconf_type", i).apply();
    }

    public void A1D(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/getgroupsparams ");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("get_groups_params", i).apply();
    }

    public void A1F(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("native_contacts_integrity_pending", i).apply();
    }

    public void A1G(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("native_contacts_phone_number_change_state", i).apply();
    }

    public void A1H(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setNumberOfInactiveAccounts/");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("number_of_inactive_accounts", i).apply();
    }

    public void A1I(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("flash_call_eligible", i).apply();
    }

    public void A1K(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/");
        sb.append(j);
        sb.append(" ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        sb.append(simpleDateFormat.format(instance.getTime()));
        Log.i(sb.toString());
        A1q("gdrive_next_prompt_for_setup_timestamp", j);
    }

    public void A1M(long j) {
        ((SharedPreferences) this.A00.get()).edit().putLong("native_contacts_download_timestamp", j).apply();
    }

    public void A1N(long j) {
        ((SharedPreferences) this.A00.get()).edit().putLong("native_contacts_enter_integrity_pass_timestamp", j).apply();
    }

    public void A1O(long j) {
        ((SharedPreferences) this.A00.get()).edit().putLong("native_contacts_enter_integrity_pending_timestamp", j).apply();
    }

    public void A1P(long j) {
        ((SharedPreferences) this.A00.get()).edit().putLong("native_contacts_enter_integrity_timelock_timestamp", j).apply();
    }

    public void A1R(AnonymousClass1BI r4, long j) {
        if (r4 != null) {
            SharedPreferences.Editor A002 = A00(this);
            StringBuilder sb = new StringBuilder();
            sb.append("show_expired_group_dialog");
            sb.append(r4.getRawString());
            A002.putLong(sb.toString(), j).apply();
        }
    }

    public void A1W(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_autoconf_feo2_query_status", str).apply();
    }

    public void A1X(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_autoconf_status", str).apply();
    }

    public void A1Y(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_email_otp_status", str).apply();
    }

    public void A1b(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_primary_flash_call_status", str).apply();
    }

    public void A1e(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_secondary_flash_call_status", str).apply();
    }

    public void A1g(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_silent_auth_status", str).apply();
    }

    public void A1h(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_sms_otp_code_when_app_killed", str).apply();
    }

    public void A1j(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_wa_old_status", str).apply();
    }

    public void A1m(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-media-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_media_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1n(String str, long j) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            sb.append(j);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gdrive_last_successful_backup_timestamp:");
        sb2.append(str);
        A002.putLong(sb2.toString(), j).apply();
    }

    public void A1o(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1p(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_video_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1x(String str, boolean z) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("wa-shared-preferences/set-encrypted is set to ");
            sb.append(z);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gdrive_last_successful_backup_encrypted:");
        sb2.append(str);
        A002.putBoolean(sb2.toString(), z).apply();
    }

    public void A1y(List list) {
        SharedPreferences.Editor remove;
        if (list == null || list.size() == 0) {
            remove = A00(this).remove("pref_reg_methods_order");
        } else {
            remove = A00(this).putString("pref_reg_methods_order", AnonymousClass1EG.A08(",", (CharSequence[]) list.toArray(new String[0])));
        }
        remove.apply();
    }

    public void A25(boolean z) {
        ((SharedPreferences) this.A00.get()).edit().putBoolean("native_contacts_backup_contacts", z).apply();
    }

    public void A26(boolean z) {
        ((SharedPreferences) this.A00.get()).edit().putBoolean("native_contacts_nux_shown", z).apply();
    }

    public void A2A(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setshouldgetprekeydigest/");
        sb.append(z);
        Log.i(sb.toString());
        synchronized (this.A04) {
            A00(this).putBoolean("need_to_get_pre_key_digest", z).apply();
        }
    }

    public void A2B(boolean z) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor A002 = A00(this);
        if (z) {
            remove = A002.putBoolean("first_party_migration_initiated", true);
        } else {
            remove = A002.remove("first_party_migration_initiated");
        }
        remove.apply();
    }

    public void A2D(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setsignalprotocolstoreisnew/");
        sb.append(z);
        Log.i(sb.toString());
        synchronized (this.A05) {
            A00(this).putBoolean("signal_protocol_store_is_new", z).apply();
        }
    }

    public void A2E(boolean z) {
        ((SharedPreferences) this.A00.get()).edit().putBoolean("silent_auth_verification_status", z).apply();
    }

    public void A2G(byte[] bArr) {
        synchronized (this.A03) {
            A00(this).putString("token_used_during_reg", Base64.encodeToString(bArr, 3)).apply();
        }
    }

    public boolean A2H() {
        return ((SharedPreferences) this.A00.get()).getBoolean("autoplay_animated_images_enabled", true);
    }

    public boolean A2I() {
        return ((SharedPreferences) this.A00.get()).getBoolean("conversation_sound", true);
    }

    public boolean A2J() {
        return ((SharedPreferences) this.A00.get()).getBoolean("native_contacts_backup_contacts", true);
    }

    public boolean A2K() {
        return ((SharedPreferences) this.A00.get()).getBoolean("native_contacts_nux_shown", false);
    }

    public boolean A2L() {
        return ((SharedPreferences) this.A00.get()).getBoolean("reg_abprop_enable_topbar", false);
    }

    public boolean A2M() {
        return ((SharedPreferences) this.A00.get()).getBoolean("security_notifications", false);
    }

    public boolean A2N() {
        return ((SharedPreferences) this.A00.get()).getBoolean("settings_verification_email_address_verified", false);
    }

    public boolean A2O() {
        return ((SharedPreferences) this.A00.get()).getBoolean("migrate_from_consumer_app_directly", false);
    }

    public boolean A2P() {
        return ((SharedPreferences) this.A00.get()).getBoolean("username_ever_set", false);
    }

    public boolean A2Q() {
        return ((SharedPreferences) this.A00.get()).getBoolean("archive_v2_enabled", false);
    }

    public boolean A2R() {
        return ((SharedPreferences) this.A00.get()).getBoolean("notify_new_message_for_archived_chats", false);
    }

    public boolean A2S() {
        return ((SharedPreferences) this.A00.get()).getBoolean("companion_reg_opt_in_enabled", false);
    }

    public boolean A2T() {
        return ((SharedPreferences) this.A00.get()).getBoolean("privacy_fingerprint_enabled", false);
    }

    public boolean A2U() {
        return ((SharedPreferences) this.A00.get()).getBoolean("read_receipts_enabled", true);
    }

    public boolean A2V() {
        return ((SharedPreferences) this.A00.get()).getBoolean("tos_2016_opt_out_state", false);
    }

    public boolean A2W() {
        boolean z;
        synchronized (this.A04) {
            z = ((SharedPreferences) this.A00.get()).getBoolean("need_to_get_pre_key_digest", true);
        }
        return z;
    }

    public boolean A2X() {
        boolean z;
        synchronized (this.A05) {
            z = ((SharedPreferences) this.A00.get()).getBoolean("signal_protocol_store_is_new", false);
        }
        return z;
    }

    public boolean A2Y(String str) {
        return ((SharedPreferences) this.A00.get()).getBoolean(str, false);
    }

    public boolean A2a(String str) {
        return ((SharedPreferences) this.A00.get()).getBoolean(str, false);
    }

    public boolean A2c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("dc_customer_sent_message_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return ((SharedPreferences) this.A00.get()).getBoolean(sb.toString(), false);
    }

    public byte[] A2d() {
        byte[] decode;
        synchronized (this.A03) {
            decode = Base64.decode(((SharedPreferences) this.A00.get()).getString("token_used_during_reg", ""), 3);
        }
        return decode;
    }

    public C19830z4(AnonymousClass11N r4, C18010vc r5) {
        this.A02 = r4;
        this.A00 = new C18150vq((Object) null, new C70943Dc(r5, 5));
    }

    public int A0M(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_status:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getInt(sb.toString(), 0);
    }

    public long A0T(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_start_time:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public ArrayList A0s() {
        ArrayList A012 = A01();
        A012.add(new C19760yx("smb_priority_inbox_label_id", C19770yy.LONG));
        A012.add(new C19760yx("smb_priority_inbox_label_switch", C19770yy.BOOL));
        A012.add(new C19760yx("wamo_user_identifier", C19770yy.STRING));
        return A012;
    }

    public void A0x() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        A00(this).remove("c2dm_reg_id").remove("c2dm_app_vers").remove("saved_gcm_token_server_unreg").apply();
    }

    public void A0y() {
        A00(this).remove("connection_sequence_state").apply();
    }

    public void A0z() {
        A00(this).remove("pref_wfs_name").apply();
        A00(this).remove("pref_nta_target_accounts").apply();
        A00(this).remove("pref_nta_source").apply();
        A00(this).remove("pref_nta_disclosure_id").apply();
        A00(this).remove("pref_nta_profile_pic").apply();
    }

    public void A10() {
        A00(this).remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts").remove("pref_fail_too_many_guesses").apply();
    }

    public void A11() {
        A00(this).remove("pref_wfs_blob").apply();
        A00(this).remove("pref_wfs_user").apply();
        A00(this).remove("pref_wfs_pw").apply();
        A00(this).remove("pref_wfs_id_sign").apply();
        A00(this).remove("pref_wfs_name").apply();
        A00(this).remove("pref_wfs_source").apply();
    }

    public void A14() {
        A00(this).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A00(this).remove("registration_wipe_info_timestamp").apply();
    }

    public void A15() {
        A00(this).remove("business_activity_report_expiration_timestamp").remove("business_activity_report_size").remove("business_activity_report_name").remove("business_activity_report_url").remove("business_activity_report_direct_url").remove("business_activity_report_media_key").remove("business_activity_report_file_sha").remove("business_activity_report_file_enc_sha").remove("business_activity_report_timestamp").remove("business_activity_report_state").apply();
    }

    public void A19(int i) {
        A00(this).putInt("business_activity_report_state", i).apply();
    }

    public void A1A(int i) {
        A00(this).putInt("connection_sequence_attempts", i).apply();
    }

    public void A1B(int i) {
        A00(this).putInt("education_banner_count", i).apply();
    }

    public void A1C(int i) {
        A00(this).putInt("external_dir_migration_stage", i).commit();
    }

    public void A1E(int i) {
        A00(this).putInt("connection_sequence_state", i).apply();
    }

    public void A1J(int i) {
        A00(this).putInt("skin_emoji_tip", i).apply();
    }

    public void A1L(long j) {
        A00(this).putLong("last_login_time", j).apply();
    }

    public void A1Q(AnonymousClass1BI r4) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("show_expired_group_dialog");
        sb.append(r4.getRawString());
        A002.remove(sb.toString()).apply();
    }

    public void A1S(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_enc_string_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1T(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_enc_string_expired_timestamp_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1U(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_public_key_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1V(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        SharedPreferences.Editor remove = A002.remove(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gdrive_last_successful_backup_total_size:");
        sb2.append(str);
        SharedPreferences.Editor remove2 = remove.remove(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("gdrive_last_successful_backup_media_size:");
        sb3.append(str);
        SharedPreferences.Editor remove3 = remove2.remove(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("gdrive_last_successful_backup_video_size:");
        sb4.append(str);
        SharedPreferences.Editor remove4 = remove3.remove(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("gdrive_last_successful_backup_encrypted:");
        sb5.append(str);
        remove4.remove(sb5.toString()).apply();
    }

    public void A1Z(String str) {
        A00(this).putString("gdrive_account_name", str).apply();
    }

    public void A1a(String str) {
        SharedPreferences.Editor putString;
        if (TextUtils.isEmpty(str)) {
            putString = A00(this).remove("last_datacenter");
        } else {
            putString = A00(this).putString("last_datacenter", str);
        }
        putString.apply();
    }

    public void A1c(String str) {
        A00(this).putString("registration_code", str).apply();
    }

    public void A1d(String str) {
        A00(this).putString("registration_jid", str).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A00(this).remove("registration_wipe_info_timestamp").apply();
    }

    public void A1f(String str) {
        A00(this).putString("settings_verification_email_address", str).apply();
    }

    public void A1i(String str) {
        A1q(str, System.currentTimeMillis());
    }

    public void A1k(String str, int i) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_status:");
        sb.append(str);
        A002.putInt(sb.toString(), i).apply();
        if (i == 1) {
            SharedPreferences.Editor A003 = A00(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gdrive_old_media_encryption_start_time:");
            sb2.append(str);
            A003.putLong(sb2.toString(), System.currentTimeMillis()).apply();
        }
    }

    public void A1l(String str, int i) {
        A00(this).putInt(str, i).apply();
    }

    public void A1q(String str, long j) {
        A00(this).putLong(str, j).apply();
    }

    public void A1r(String str, String str2) {
        SharedPreferences.Editor A002 = A00(this);
        if (str == null) {
            A002.remove("my_current_status");
        } else {
            A002.putString("my_current_status", str);
            if (!TextUtils.isEmpty(str2)) {
                A002.putString("my_current_status_hash", str2);
                A002.apply();
            }
        }
        A002.remove("my_current_status_hash");
        A002.apply();
    }

    public void A1s(String str, String str2) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("downloadable_category_local_info_json_");
        sb.append(str);
        A002.putString(sb.toString(), str2).apply();
    }

    public void A1t(String str, String str2) {
        A00(this).putString("cc", str).putString("ph", str2).apply();
    }

    public void A1u(String str, String str2) {
        A00(this).putString(str, str2).apply();
    }

    public void A1v(String str, String str2, long j, long j2, long j3, long j4) {
        A00(this).putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j).putLong("registration_wipe_expiry", j2).putLong("registration_wipe_server_time", j3).apply();
        A1q("registration_wipe_info_timestamp", j4);
    }

    public void A1w(String str, boolean z) {
        A00(this).putBoolean(str, z).apply();
    }

    public void A20(boolean z) {
        SharedPreferences.Editor remove = A00(this).remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A21(boolean z) {
        A00(this).putBoolean("future_proof_processing_needed", z).apply();
    }

    public void A22(boolean z) {
        A00(this).putBoolean("net_new_jid", z).apply();
    }

    public void A23(boolean z) {
        A00(this).putBoolean("new_jid", z).apply();
    }

    public void A24(boolean z) {
        A00(this).putBoolean("live_location_is_new_user", z).apply();
    }

    public void A27(boolean z) {
        A00(this).putBoolean("privacy_fingerprint_enabled", z).apply();
    }

    public void A28(boolean z) {
        A00(this).putBoolean("settings_verification_email_address_confirmed", z).apply();
    }

    public void A29(boolean z) {
        A00(this).putBoolean("settings_verification_email_address_verified", z).apply();
    }

    public void A2C(boolean z) {
        SharedPreferences.Editor A002 = A00(this);
        if (z) {
            A002.putBoolean("show_post_reg_logged_out_dialog", true);
        } else {
            A002.remove("show_post_reg_logged_out_dialog");
        }
        A002.apply();
    }

    public void A2F(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        A00(this).putBoolean("pref_fail_too_many", z).putBoolean("pref_no_route_sms", z2).putBoolean("pref_no_route_voice", z3).putBoolean("pref_fail_too_many_attempts", z4).putBoolean("pref_fail_too_many_guesses", z5).apply();
    }

    public boolean A2Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_encrypted:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getBoolean(sb.toString(), false);
    }

    public boolean A2b(String str, long j) {
        long A0W = A0W(str);
        if (A0W == -1 || System.currentTimeMillis() > A0W + j) {
            return true;
        }
        return false;
    }
}
