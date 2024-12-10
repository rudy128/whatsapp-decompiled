package X;

import android.text.TextUtils;

/* renamed from: X.14c  reason: invalid class name and case insensitive filesystem */
public class C209514c implements AnonymousClass12T {
    public static final String A00;
    public static final String[] A01;

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    static {
        String[] strArr = {"sort_id", "from_me", "key_id", "status", "broadcast", "timestamp", "message_type", "origin", "recipient_count", "participant_hash", "starred", "receipt_server_timestamp", "origination_flags", "received_timestamp", "_id", "text_data", "lookup_tables", "sender_jid_row_id", "chat_row_id", "message_add_on_flags", "view_mode", "translated_text"};
        A01 = strArr;
        A00 = TextUtils.join(", ", strArr);
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message", "message_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_key_index ON message (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.CDx("message", "message_sort_id_index", "CREATE INDEX IF NOT EXISTS message_sort_id_index ON message (sort_id)");
        r5.CDx("message", "message_starred_index", "CREATE INDEX IF NOT EXISTS message_starred_index ON message(starred)");
        r5.CDx("message", "message_type_chat_index", "CREATE INDEX IF NOT EXISTS message_type_chat_index ON message(chat_row_id, message_type)");
        r5.CDx("message", "message_chat_id_index", "CREATE INDEX IF NOT EXISTS message_chat_id_index ON message (chat_row_id,_id)");
        r5.CDx("message", "message_type_index", "CREATE INDEX IF NOT EXISTS message_type_index ON message(message_type)");
        r5.CDx("message", "message_chat_sort_id_index", "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)");
        r5.CDx("message", "message_starred_sort_id_index", "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r7 = C25041Mq.INTEGER;
        obj.A00 = r7;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "from_me";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "key_id";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r7;
        obj.A02 = "status";
        obj.A00 = r7;
        obj.A02 = "broadcast";
        obj.A00 = r7;
        obj.A02 = "recipient_count";
        obj.A00 = r7;
        obj.A02 = "participant_hash";
        obj.A00 = r3;
        obj.A02 = "origination_flags";
        obj.A00 = r7;
        obj.A02 = "origin";
        obj.A00 = r7;
        obj.A02 = "timestamp";
        obj.A00 = r7;
        obj.A02 = "received_timestamp";
        obj.A00 = r7;
        obj.A02 = "receipt_server_timestamp";
        obj.A00 = r7;
        obj.A02 = "message_type";
        obj.A00 = r7;
        obj.A02 = "text_data";
        obj.A00 = r3;
        obj.A02 = "starred";
        obj.A00 = r7;
        obj.A02 = "lookup_tables";
        obj.A00 = r7;
        obj.A02 = "message_add_on_flags";
        obj.A00 = r7;
        obj.A02 = "view_mode";
        obj.A00 = r7;
        obj.A02 = "sort_id";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "translated_text";
        obj.A00 = r3;
        r9.CE6("message", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
