package X;

/* renamed from: X.1ax  reason: invalid class name and case insensitive filesystem */
public abstract class C28821ax {
    public static final String A00;
    public static final String[] A01 = {"_id", "jid_row_id", "hidden", "subject", "created_timestamp", "last_message_row_id", "display_message_row_id", "last_read_message_row_id", "last_read_receipt_sent_message_row_id", "last_important_message_row_id", "archived", "sort_timestamp", "mod_tag", "gen", "spam_detection", "unseen_earliest_message_received_time", "unseen_message_count", "unseen_missed_calls_count", "unseen_row_count", "unseen_message_reaction_count", "unseen_comment_message_count", "last_message_reaction_row_id", "last_seen_message_reaction_row_id", "plaintext_disabled", "vcard_ui_dismissed", "change_number_notified_message_row_id", "show_group_description", "ephemeral_expiration", "last_read_ephemeral_message_row_id", "ephemeral_setting_timestamp", "ephemeral_displayed_exemptions", "ephemeral_disappearing_messages_initiator", "unseen_important_message_count", "group_type", "growth_lock_level", "growth_lock_expiration_ts", "last_read_message_sort_id", "display_message_sort_id", "last_message_sort_id", "last_read_receipt_sent_message_sort_id", "has_new_community_admin_dialog_been_acknowledged", "history_sync_progress", "chat_lock", "chat_origin", "participation_status", "chat_encryption_state"};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(AnonymousClass1H2.A01("message", C209514c.A01));
        sb.append(" FROM available_message_view AS message JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE message.from_me = 0 AND status != 16 AND status != 10 AND (chat.last_read_message_sort_id >= message.sort_id OR status = 17) AND chat.last_read_receipt_sent_message_sort_id < message.sort_id AND chat.last_read_receipt_sent_message_row_id > 0 AND message.message_type NOT IN ('8', '10', '15') AND (chat.hidden IS NULL OR chat.hidden = 0) ORDER BY message.sort_id DESC LIMIT 4096");
        A00 = sb.toString();
    }
}
