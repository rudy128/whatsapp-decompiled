package X;

import android.util.Pair;

/* renamed from: X.15r  reason: invalid class name and case insensitive filesystem */
public class C213615r implements AnonymousClass12T {
    public static final String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_message_row_id", "timestamp", "status", "message_add_on_type", "received_timestamp", "expiry_duration_in_secs", "server_timestamp", "expiry_timestamp", "expiry_type"};

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_add_on", "message_add_on_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_key_index ON message_add_on (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.CDx("message_add_on", "message_add_on_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_status_index ON message_add_on (status)");
        r5.CDx("message_add_on", "message_add_on_chat_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_chat_status_index ON message_add_on (chat_row_id, status)");
        r5.CDx("message_add_on", "message_add_on_parent_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_parent_message_row_id_index ON message_add_on (parent_message_row_id)");
        r5.CDx("message_add_on", "message_add_on_expiry_timestamp_index", "CREATE INDEX IF NOT EXISTS message_add_on_expiry_timestamp_index ON message_add_on (expiry_timestamp)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "from_me";
        obj.A00 = r3;
        obj.A02 = "key_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "parent_message_row_id";
        obj.A00 = r3;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A02 = "status";
        obj.A00 = r3;
        obj.A02 = "message_add_on_type";
        obj.A00 = r3;
        obj.A02 = "received_timestamp";
        obj.A00 = r3;
        obj.A02 = "expiry_duration_in_secs";
        obj.A00 = r3;
        obj.A02 = "server_timestamp";
        obj.A00 = r3;
        obj.A02 = "expiry_timestamp";
        obj.A00 = r3;
        obj.A02 = "expiry_type";
        obj.A00 = r3;
        r7.CE6("message_add_on", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message", "message_add_on", (String) null, "parent_message_row_id=old._id");
        r5.CE8("message_add_on", (String) A01.first, (String) A01.second);
    }
}
