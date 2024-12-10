package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.18O  reason: invalid class name */
public class AnonymousClass18O implements AnonymousClass18N {
    public static AnonymousClass18Q A06 = A01(43200, Integer.MAX_VALUE, "privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400);
    public static AnonymousClass18Q A07 = A01(1, 43200, "privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200);
    public static AnonymousClass18Q A08 = A01(2, Integer.MAX_VALUE, "privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 388);
    public static final AnonymousClass18R A09 = A00("fbns_disabled_for_secondary", "fbns_disabled_for_secondary", false);
    public static final AnonymousClass18R A0A = A00("fbns_enabled", "fbns_enabled", false);
    public static final AnonymousClass18R A0B = A00("group_message_notification_use_jid_instead_of_from_me", "group_message_notification_use_jid_instead_of_from_me", true);
    public static final AnonymousClass18R A0C = A00("md_pin_chat_enabled", "md_pin_chat_enabled", false);
    public static final AnonymousClass18R A0D = A00("payments_disable_switch_psp", "payments_disable_switch_psp", false);
    public static final AnonymousClass18R A0E = A00("profilo_enabled", "profilo_enabled", false);
    public static final AnonymousClass18R A0F = A00("stella_contact_ranking_enabled", "stella_contact_ranking_enabled", false);
    public static final AnonymousClass18R A0G = A00("stella_interop_enabled", "stella_interop_enabled", false);
    public static final AnonymousClass18R A0H = A00("abprops_prefs_file_rollback_usage_enabled", "abprops_prefs_file_rollback_usage_enabled", false);
    public static final AnonymousClass18R A0I = A00("abprops_rollback_enabled", "abprops_rollback_enabled", false);
    public static final AnonymousClass18R A0J = A00("google_drive_enabled", "google_drive_enabled", true);
    public static final AnonymousClass18R A0K = A00("disable_hfm_autodownload", "disable_hfm_autodownload", false);
    public static final AnonymousClass18R A0L = A00("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
    public static final AnonymousClass18R A0M = A00("syncd_android_unsupported_mutation_enabled", "syncd_android_unsupported_mutation_enabled", false);
    public static final AnonymousClass18R A0N = A00("syncd_clear_chat_delete_chat_enabled", "syncd_clear_chat_delete_chat_enabled", false);
    public static final AnonymousClass18R A0O = A00("syncd_patch_device_index_included", "syncd_patch_device_index_included", false);
    public static final AnonymousClass18R A0P = A00("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
    public static final AnonymousClass18R A0Q = A00("p2m_pay", "p2m_pay", false);
    public static final AnonymousClass18R A0R = A00("p2p_pay", "p2p_pay", false);
    public static final AnonymousClass18R A0S = A00("payments_cs_email_disabled", "payments_cs_email_disabled", false);
    public static final AnonymousClass18R A0T = A00("async_init_fts_migration", "async_init_fts_migration", false);
    public static final AnonymousClass18R A0U = A00("payments_deeplink_signup_enabled", "payments_deeplink_signup_enabled", false);
    public static final AnonymousClass18R A0V = A00("payments_request_messages", "payments_request_messages", true);
    public static final AnonymousClass18R A0W = A00("payments_upi_qr_signing", "payments_upi_qr_signing", false);
    public static final AnonymousClass18R A0X = A00("payments_upi_settings_privacy_banner_enabled", "payments_upi_settings_privacy_banner_enabled", true);
    public static final AnonymousClass18R A0Y = A00("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);
    public static final AnonymousClass18R A0Z = A00("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
    public static final AnonymousClass18R A0a = A00("payment_history_fts_enabled", "payment_history_fts_enabled", false);
    public static final AnonymousClass18R A0b = A00("quick_message_search_enabled", "quick_message_search_enabled", false);
    public static final AnonymousClass18R A0c = A00("reg_log_advertiser_id", "reg_log_advertiser_id", false);
    public static final AnonymousClass18R A0d = A00("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
    public static final AnonymousClass18R A0e = A00("audio_data_for_notification", "audio_data_for_notification", true);
    public static final AnonymousClass18R A0f = A00("wa_msys_crypto", "wa_msys_crypto", true);
    public static final AnonymousClass18R A0g = A00("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
    public static final AnonymousClass18R A0h;
    public static final AnonymousClass18R A0i = A00("force_long_connect", "force_long_connect", false);
    public static final AnonymousClass18R A0j = A00("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
    public static final AnonymousClass18R A0k = A00("gif_search_v2", "gif_search_v2", false);
    public static final AnonymousClass18T A0l;
    public static final AnonymousClass18Q A0m = A01(257, (Integer) null, "participants_size_limit", "max_participants", 257);
    public static final AnonymousClass18Q A0n = A01((Integer) null, (Integer) null, "ptt_playback_speed_hide_delay", "ptt_playback_speed_hide_delay", 1500);
    public static final AnonymousClass18Q A0o = A01(0, 20, "stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10);
    public static final AnonymousClass18Q A0p = A01((Integer) null, (Integer) null, "abprops_revert_bg_crash_count", "abprops_revert_bg_crash_count", 10);
    public static final AnonymousClass18Q A0q = A01((Integer) null, (Integer) null, "abprops_revert_fg_crash_count", "abprops_revert_fg_crash_count", 5);
    public static final AnonymousClass18Q A0r = A01((Integer) null, (Integer) null, "linked_device_max_count", "linked_device_max_count", 4);
    public static final AnonymousClass18Q A0s = A01((Integer) null, (Integer) null, "md_mhfs_days", "md_mhfs_days", 732);
    public static final AnonymousClass18Q A0t = A01((Integer) null, (Integer) null, "md_mhfs_limit", "md_mhfs_limit", 200);
    public static final AnonymousClass18Q A0u = A01(0, 100, "md_mhfs_start_progress", "md_mhfs_start_progress", 70);
    public static final AnonymousClass18Q A0v = A01((Integer) null, (Integer) null, "md_mhrs_days", "md_mhrs_days", 90);
    public static final AnonymousClass18Q A0w = A01(100, 5000, "syncd_critical_contacts_limit", "syncd_critical_contacts_limit", 1000);
    public static final AnonymousClass18Q A0x = A01(100, 2000, "syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100);
    public static final AnonymousClass18Q A0y = A01(0, 43200, "syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440);
    public static final AnonymousClass18Q A0z = A01(1, 90, "syncd_key_max_use_days", "syncd_key_max_use_days", 30);
    public static final AnonymousClass18Q A10 = A01(15, 90, "syncd_key_stale_days", "syncd_key_stale_days", 31);
    public static final AnonymousClass18Q A11 = A01((Integer) null, (Integer) null, "announcement_toggle_time_hours", "announcement_toggle_time_hours", 72);
    public static final AnonymousClass18Q A12 = A01(10, 100, "syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10);
    public static final AnonymousClass18Q A13 = A01(0, 20, "syncd_sentinel_timeout_seconds", "syncd_sentinel_timeout_seconds", 3);
    public static final AnonymousClass18Q A14 = A01(1, 15, "syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7);
    public static final AnonymousClass18Q A15 = A01(10, 300, "critical_payload_download_and_applied_timeout_secs", "critical_payload_download_and_applied_timeout_secs", 120);
    public static final AnonymousClass18Q A16 = A01(10, 300, "critical_payload_upload_timeout_secs", "critical_payload_upload_timeout_secs", 60);
    public static final AnonymousClass18Q A17 = A01(0, (Integer) null, "media_limit_auto_download_mb", "media_max_autodownload", 32);
    public static final AnonymousClass18Q A18 = A01((Integer) null, (Integer) null, "media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100);
    public static final AnonymousClass18Q A19 = A01((Integer) null, (Integer) null, "mms_vcard_autodownload_size_kb", "mms_vcard_autodownload_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final AnonymousClass18Q A1A = A01(0, 300, "overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0);
    public static final AnonymousClass18Q A1B = A01((Integer) null, (Integer) null, "payments_br_transaction_limit", "payments_transaction_limit", 1000);
    public static final AnonymousClass18Q A1C = A01((Integer) null, (Integer) null, "biz_block_reasons_version", "biz_block_reasons_version", 0);
    public static final AnonymousClass18Q A1D = A01((Integer) null, (Integer) null, "payments_upi_first_day_max_transaction_limit", "payments_upi_first_day_max_transaction_limit", 5000);
    public static final AnonymousClass18Q A1E = A01((Integer) null, (Integer) null, "payments_upi_generate_qr_amount_limit", "payments_upi_generate_qr_amount_limit", 5000);
    public static final AnonymousClass18Q A1F = A01((Integer) null, (Integer) null, "payments_upi_intent_transaction_limit", "payments_upi_intent_transaction_limit", 2000);
    public static final AnonymousClass18Q A1G = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit", "payments_upi_transaction_limit", 5000);
    public static final AnonymousClass18Q A1H = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit_request", "payments_upi_transaction_limit_request", 5000);
    public static final AnonymousClass18Q A1I = A01((Integer) null, (Integer) null, "ping_timeout_s", "ping_timeout_s", 32);
    public static final AnonymousClass18Q A1J = A01((Integer) null, (Integer) null, "vname_cert_staleness_threshold", "vname_cert_staleness_threshold", 43200);
    public static final AnonymousClass18Q A1K = A01((Integer) null, (Integer) null, "vcard_max_size_kb", "vcard_max_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final AnonymousClass18Q A1L = A01((Integer) null, (Integer) null, "vcard_as_document_size_kb", "vcard_as_document_size_kb", 0);
    public static final AnonymousClass18Q A1M = A01((Integer) null, (Integer) null, "sync_wifi_threshold_kb", "sync_wifi_threshold_kb", 5000);
    public static final AnonymousClass18Q A1N = A01(256, (Integer) null, "broadcast_list_size_limit", "max_list_recipients", 256);
    public static final AnonymousClass18Q A1O = A01((Integer) null, (Integer) null, "subject_length_limit", "max_subject", 100);
    public static final AnonymousClass18Q A1P = A01(30, 180, "prekey_expiration_days", "prekey_expiration_days", 60);
    public static final AnonymousClass18Q A1Q = A01((Integer) null, (Integer) null, "shops_required_tos_version", "shops_required_tos_version", 0);
    public static final AnonymousClass18Q A1R = A01((Integer) null, (Integer) null, "biz_profile_options", "biz_profile_options", 4);
    public static final AnonymousClass18Q A1S = A01((Integer) null, (Integer) null, "max_keys", "max_keys", 812);
    public static final AnonymousClass18Q A1T = A01((Integer) null, (Integer) null, "direct_db_migration_timeout_in_secs", "direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
    public static final AnonymousClass18Q A1U = A01((Integer) null, (Integer) null, "gif_provider", "gif_provider", -1);
    public static final AnonymousClass18Q A1V = A01((Integer) null, (Integer) null, "group_description_length", "group_description_length", EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    public static final AnonymousClass18S A1W;
    public static final AnonymousClass18S A1X;
    public static final AnonymousClass18S A1Y;
    public static final AnonymousClass18S A1Z;
    public static final List A1a = new ArrayList();
    public static final List A1b = new ArrayList();
    public final SharedPreferences A00;
    public final AnonymousClass18Y A01;
    public final AnonymousClass18X A02;
    public final AnonymousClass18U A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass188 A05;

    public static final void A02(AnonymousClass188 r2, String str) {
        C18070vi.A0d(r2, 0);
        r2.CHx(str, 2141, 0);
        r2.CHx(str, 2141, 1);
    }

    static {
        AnonymousClass18S r1 = new AnonymousClass18S("payments_cs_faq_url", "https://faq.whatsapp.com/payments");
        A1b.add(r1);
        A1Y = r1;
        AnonymousClass18S r12 = new AnonymousClass18S("payments_cs_email_address", (String) null);
        A1b.add(r12);
        A1X = r12;
        AnonymousClass18S r13 = new AnonymousClass18S("payments_cs_phone_number", (String) null);
        A1b.add(r13);
        A1Z = r13;
        AnonymousClass18S r14 = new AnonymousClass18S("ephemeral_messages_allowed_values", "604800");
        A1b.add(r14);
        A1W = r14;
        AnonymousClass18R r15 = new AnonymousClass18R("enable_export", "enable_export", true);
        A1a.add(r15);
        A0h = r15;
        AnonymousClass18T r16 = new AnonymousClass18T();
        A1b.add(r16);
        A0l = r16;
    }

    public static AnonymousClass18R A00(String str, String str2, boolean z) {
        AnonymousClass18R r1 = new AnonymousClass18R(str, str2, z);
        A1b.add(r1);
        return r1;
    }

    public static AnonymousClass18Q A01(Integer num, Integer num2, String str, String str2, int i) {
        AnonymousClass18Q r1 = new AnonymousClass18Q(num, num2, str, str2, i);
        A1b.add(r1);
        return r1;
    }

    public int A03() {
        return this.A00.getInt("server_props:last_version", 0);
    }

    public int A04(AnonymousClass18Q r5) {
        int i;
        synchronized (AnonymousClass18O.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C17970vW.A03;
            i = sharedPreferences.getInt(r5.A00, r5.A00);
        }
        return i;
    }

    public long A05() {
        return this.A00.getLong("server_props:refresh", 86400000);
    }

    public long A06() {
        return this.A00.getLong("groups_server_props_last_refresh_time", 0);
    }

    public String A07(AnonymousClass18S r5) {
        String string;
        synchronized (AnonymousClass18O.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C17970vW.A03;
            string = sharedPreferences.getString(r5.A00, r5.A00);
        }
        return string;
    }

    public void A08(AnonymousClass11P r10, String str, String str2, Map map, int i, int i2, long j) {
        boolean z;
        ArrayList arrayList;
        SharedPreferences sharedPreferences = this.A00;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (AnonymousClass18O.class) {
            edit.putLong("groups_server_props_last_refresh_time", AnonymousClass11P.A01(r10));
            edit.putInt("server_props:last_version", i);
            edit.putLong("server_props:refresh", Math.max(j, 600000));
            z = true;
            if (i2 == 1 || !TextUtils.isEmpty(str)) {
                this.A02.notifyAllObservers(new C96994ok(4));
                for (AnonymousClass18P A002 : A1b) {
                    A002.A00(edit, map);
                }
                AnonymousClass18U r1 = this.A03;
                Object value = r1.A01.getValue();
                C18070vi.A0X(value);
                SharedPreferences.Editor edit2 = ((SharedPreferences) value).edit();
                synchronized (r1.A00) {
                    try {
                        arrayList = new ArrayList(AnonymousClass18U.A02.values());
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    it.next();
                    th = new NullPointerException("remoteKey");
                    throw th;
                }
                edit2.apply();
                if (sharedPreferences.getBoolean("server_props:one_time_unlocked", true)) {
                    for (AnonymousClass18P A003 : A1a) {
                        A003.A00(edit, map);
                    }
                    edit.putBoolean("server_props:one_time_unlocked", false);
                }
            } else {
                z = false;
            }
            if (i2 == 2) {
                edit.putString("server_props:config_key", str2);
                A02(this.A05, str2);
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("server_props:config_hash", str);
                }
            } else {
                edit.remove("server_props:config_key");
                A02(this.A05, (String) null);
                edit.remove("server_props:config_hash");
            }
            edit.apply();
        }
        AnonymousClass18Y r12 = this.A01;
        r12.A01.get();
        ((SharedPreferences) r12.A00.get()).edit().putString("server_props:hash", C60602oJ.A00(((SharedPreferences) r12.A02.get()).getAll())).apply();
        if (z) {
            this.A02.notifyAllObservers(new AnonymousClass7KX(4));
        }
    }

    public boolean A09(AnonymousClass18R r5) {
        boolean z;
        synchronized (AnonymousClass18O.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C17970vW.A03;
            z = sharedPreferences.getBoolean(r5.A00, r5.A00);
        }
        return z;
    }

    public void BuU(AnonymousClass188 r5) {
        synchronized (AnonymousClass18O.class) {
            A02(r5, this.A00.getString("server_props:config_key", (String) null));
        }
    }

    public AnonymousClass18O(AnonymousClass18Y r2, AnonymousClass18X r3, AnonymousClass18U r4, AnonymousClass118 r5, AnonymousClass188 r6, C18010vc r7) {
        SharedPreferences A052 = r7.A05("server_prop_preferences");
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = A052;
        this.A02 = r3;
        this.A01 = r2;
    }
}
