package X;

/* renamed from: X.12t  reason: invalid class name and case insensitive filesystem */
public final class C206012t implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(r4, 1);
        r5.CDx("chat", "chat_group_type_index", "CREATE INDEX IF NOT EXISTS chat_group_type_index ON chat (group_type)");
        r5.CDt("chat", "chat_hidden_index", "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C18070vi.A0d(r9, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r3;
        obj.A06 = true;
        obj.A02 = "hidden";
        obj.A00 = r3;
        obj.A02 = "subject";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "created_timestamp";
        obj.A00 = r3;
        obj.A02 = "display_message_row_id";
        obj.A00 = r3;
        obj.A02 = "last_message_row_id";
        obj.A00 = r3;
        obj.A02 = "last_read_message_row_id";
        obj.A00 = r3;
        obj.A02 = "last_read_receipt_sent_message_row_id";
        obj.A00 = r3;
        obj.A02 = "last_important_message_row_id";
        obj.A00 = r3;
        obj.A02 = "archived";
        obj.A00 = r3;
        obj.A02 = "sort_timestamp";
        obj.A00 = r3;
        obj.A02 = "mod_tag";
        obj.A00 = r3;
        obj.A02 = "gen";
        obj.A00 = C25041Mq.REAL;
        obj.A02 = "spam_detection";
        obj.A00 = r3;
        obj.A02 = "unseen_earliest_message_received_time";
        obj.A00 = r3;
        obj.A02 = "unseen_message_count";
        obj.A00 = r3;
        obj.A02 = "unseen_missed_calls_count";
        obj.A00 = r3;
        obj.A02 = "unseen_row_count";
        obj.A00 = r3;
        obj.A02 = "plaintext_disabled";
        obj.A00 = r3;
        obj.A02 = "vcard_ui_dismissed";
        obj.A00 = r3;
        obj.A02 = "change_number_notified_message_row_id";
        obj.A00 = r3;
        obj.A02 = "show_group_description";
        obj.A00 = r3;
        obj.A02 = "ephemeral_expiration";
        obj.A00 = r3;
        obj.A02 = "last_read_ephemeral_message_row_id";
        obj.A00 = r3;
        obj.A02 = "ephemeral_setting_timestamp";
        obj.A00 = r3;
        obj.A02 = "ephemeral_displayed_exemptions";
        obj.A00 = r3;
        obj.A02 = "ephemeral_disappearing_messages_initiator";
        obj.A00 = r3;
        obj.A02 = "unseen_important_message_count";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "group_type";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "last_message_reaction_row_id";
        obj.A00 = r3;
        obj.A02 = "last_seen_message_reaction_row_id";
        obj.A00 = r3;
        obj.A02 = "unseen_message_reaction_count";
        obj.A00 = r3;
        obj.A02 = "unseen_comment_message_count";
        obj.A00 = r3;
        obj.A02 = "growth_lock_level";
        obj.A00 = r3;
        obj.A02 = "growth_lock_expiration_ts";
        obj.A00 = r3;
        obj.A02 = "last_read_message_sort_id";
        obj.A00 = r3;
        obj.A02 = "display_message_sort_id";
        obj.A00 = r3;
        obj.A02 = "last_message_sort_id";
        obj.A00 = r3;
        obj.A02 = "last_read_receipt_sent_message_sort_id";
        obj.A00 = r3;
        obj.A02 = "has_new_community_admin_dialog_been_acknowledged";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "history_sync_progress";
        obj.A00 = r3;
        obj.A02 = "chat_lock";
        obj.A00 = r3;
        obj.A02 = "chat_origin";
        obj.A00 = r5;
        obj.A02 = "participation_status";
        obj.A00 = r3;
        obj.A02 = "account_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "chat_encryption_state";
        obj.A00 = r3;
        r9.CE6("chat", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
