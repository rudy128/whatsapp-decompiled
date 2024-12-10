package X;

import android.text.TextUtils;

/* renamed from: X.1yV  reason: invalid class name and case insensitive filesystem */
public class C42641yV implements AnonymousClass12T {
    public static final String A00;
    public static final String[] A01;

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    static {
        String[] strArr = {"wa_contacts._id", "wa_contacts.jid", "is_whatsapp_user", "status", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "status_timestamp", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported", "is_sidelist_synced", "is_business_synced", "disappearing_mode_duration", "disappearing_mode_timestamp", "history_sync_initial_phash", "is_starred", "is_wa_created_contact", "sync_policy", "status_emoji", "is_contact_synced", "is_reachable", "verified_name", "expires", "verified_level", "issuer", "identity_unconfirmed_since", "serial", "host_storage", "actual_actors", "privacy_mode_ts", "description", "description_id_string", "description_time", "description_setter_jid", "restrict_mode", "announcement_group", "no_frequently_forwarded", "ephemeral_duration", "creator_jid", "in_app_support", "is_suspended", "require_membership_approval", "member_add_mode", "incognito", "group_state", "is_pending_requests_banner_acknowledged", "addressing_mode", "is_report_to_admin_enabled", "allow_non_admin_subgroup_creation", "is_pending_suggestions_banner_acknowledged", "history_enabled", "auto_add_disabled", "automated_type", "is_hidden_subgroup", "e2ee_state"};
        A01 = strArr;
        A00 = TextUtils.join(", ", strArr);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "jid";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "is_whatsapp_user";
        C25041Mq r6 = C25041Mq.BOOLEAN;
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "status";
        obj.A00 = r5;
        obj.A02 = "status_timestamp";
        obj.A00 = r3;
        obj.A02 = "number";
        obj.A00 = r5;
        obj.A02 = "raw_contact_id";
        obj.A00 = r3;
        obj.A02 = "display_name";
        obj.A00 = r5;
        obj.A02 = "phone_type";
        obj.A00 = r3;
        obj.A02 = "phone_label";
        obj.A00 = r5;
        obj.A02 = "photo_ts";
        obj.A00 = r3;
        obj.A02 = "thumb_ts";
        obj.A00 = r3;
        obj.A02 = "photo_id_timestamp";
        obj.A00 = r3;
        obj.A02 = "given_name";
        obj.A00 = r5;
        obj.A02 = "family_name";
        obj.A00 = r5;
        obj.A02 = "wa_name";
        obj.A00 = r5;
        obj.A02 = "sort_name";
        obj.A00 = r5;
        obj.A02 = "nickname";
        obj.A00 = r5;
        obj.A02 = "company";
        obj.A00 = r5;
        obj.A02 = "title";
        obj.A00 = r5;
        obj.A02 = "status_autodownload_disabled";
        obj.A00 = r3;
        obj.A02 = "keep_timestamp";
        obj.A00 = r3;
        obj.A02 = "is_spam_reported";
        obj.A00 = r3;
        obj.A02 = "is_sidelist_synced";
        obj.A00 = r6;
        obj.A0E(0);
        obj.A02 = "is_business_synced";
        obj.A00 = r6;
        obj.A0E(0);
        obj.A02 = "disappearing_mode_duration";
        obj.A00 = r3;
        obj.A02 = "disappearing_mode_timestamp";
        obj.A00 = C25041Mq.LONG;
        obj.A02 = "history_sync_initial_phash";
        obj.A00 = r5;
        obj.A02 = "is_starred";
        obj.A00 = r6;
        obj.A02 = "is_wa_created_contact";
        obj.A00 = r6;
        obj.A02 = "sync_policy";
        obj.A00 = r3;
        obj.A02 = "status_emoji";
        obj.A00 = r5;
        obj.A02 = "is_contact_synced";
        obj.A00 = r3;
        obj.A02 = "is_reachable";
        obj.A00 = r3;
        r9.CE6("wa_contacts", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_contacts", "is_wa_index", " CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        r5.CDx("wa_contacts", "jid_index", " CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        r5.CDx("wa_contacts", "is_contact_synced_index", " CREATE INDEX IF NOT EXISTS is_contact_synced_index ON wa_contacts (is_contact_synced);");
    }
}
