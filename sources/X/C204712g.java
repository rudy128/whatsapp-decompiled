package X;

import java.util.Locale;

/* renamed from: X.12g  reason: invalid class name and case insensitive filesystem */
public class C204712g implements AnonymousClass12T {
    public static String A00(String str, String str2) {
        return String.format("%s_%s_for_%s_trigger", new Object[]{str2, str, "backup_changes"}).toLowerCase(Locale.getDefault());
    }

    public static String A02(String str, String str2, String str3, String str4) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{str3, str4});
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", new Object[]{str2, str3, str4});
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ");
        sb.append(format);
        sb.append(format2);
        sb.append(" END");
        return String.format(locale, sb.toString(), new Object[]{str, str2, str3});
    }

    public static String A01(String str, String str2, String str3) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{"message", str3});
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", new Object[]{str2, "message", str3});
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ");
        sb.append(format);
        sb.append(format2);
        sb.append(" END");
        return String.format(locale, sb.toString(), new Object[]{str, str2, "message_add_on"});
    }

    private void A03(AnonymousClass1F4 r6, String str, String str2) {
        String A00 = A00("INSERT", str);
        StringBuilder sb = new StringBuilder();
        sb.append("NEW.");
        sb.append(str2);
        r6.CE8("backup_changes", A00, A02(A00, "INSERT", str, sb.toString()));
        String A002 = A00("UPDATE", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NEW.");
        sb2.append(str2);
        r6.CE8("backup_changes", A002, A02(A002, "UPDATE", str, sb2.toString()));
        String A003 = A00("DELETE", str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("OLD.");
        sb3.append(str2);
        r6.CE8("backup_changes", A003, A02(A003, "DELETE", str, sb3.toString()));
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("backup_changes", "backup_changes_operation_index", "CREATE INDEX IF NOT EXISTS backup_changes_operation_index ON backup_changes (operation, table_name, table_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "operation";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "table_name";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "table_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("backup_changes", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r9) {
        A03(r9, "message", "_id");
        String A00 = A00("INSERT", "message_add_on");
        StringBuilder sb = new StringBuilder();
        sb.append("NEW.");
        sb.append("parent_message_row_id");
        r9.CE8("backup_changes", A00, A01(A00, "INSERT", sb.toString()));
        String A002 = A00("UPDATE", "message_add_on");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NEW.");
        sb2.append("parent_message_row_id");
        r9.CE8("backup_changes", A002, A01(A002, "UPDATE", sb2.toString()));
        String A003 = A00("DELETE", "message_add_on");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("OLD.");
        sb3.append("parent_message_row_id");
        r9.CE8("backup_changes", A003, A01(A003, "DELETE", sb3.toString()));
        A03(r9, "receipt_user", "_id");
        A03(r9, "receipt_device", "_id");
        A03(r9, "message_add_on_receipt_device", "receipt_device_id");
        A03(r9, "receipt_orphaned", "_id");
        A03(r9, "played_self_receipt", "message_row_id");
        A03(r9, "jid", "_id");
        A03(r9, "chat", "_id");
        A03(r9, "community_chat", "chat_row_id");
        A03(r9, "parent_group_participants", "rowid");
        A03(r9, "props", "_id");
        A03(r9, "user_device", "_id");
        A03(r9, "user_device_info", "user_jid_row_id");
        A03(r9, "group_notification_version", "group_jid_row_id");
        A03(r9, "group_participant_device", "_id");
        A03(r9, "group_participant_user", "_id");
        A03(r9, "group_past_participant_user", "_id");
        A03(r9, "frequent", "_id");
        A03(r9, "lid_chat_state", "jid_row_id");
        A03(r9, "lid_display_name", "lid_row_id");
        A03(r9, "call_log", "_id");
        A03(r9, "call_link", "_id");
        A03(r9, "call_log_participant_v2", "_id");
        A03(r9, "joinable_call_log", "call_log_row_id");
        A03(r9, "primary_device_version", "user_jid_row_id");
        A03(r9, "payment_background", "rowid");
        A03(r9, "payment_background_order", "rowid");
        A03(r9, "pay_transaction", "_id");
        A03(r9, "media_refs", "_id");
        A03(r9, "agent_chat_assignment", "jid_row_id");
        A03(r9, "agent_devices", "rowid");
        A03(r9, "agent_message_attribution", "message_row_id");
        A03(r9, "away_messages", "_id");
        A03(r9, "keywords", "_id");
        A03(r9, "labeled_jid", "_id");
        A03(r9, "labels", "_id");
        A03(r9, "quick_replies", "_id");
        A03(r9, "quick_reply_attachments", "_id");
        A03(r9, "quick_reply_keywords", "_id");
        A03(r9, "quick_reply_usage", "_id");
    }
}
