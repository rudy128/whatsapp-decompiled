package X;

import android.util.Pair;

/* renamed from: X.13o  reason: invalid class name and case insensitive filesystem */
public final class C208113o implements AnonymousClass12T {
    public static String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data", "orphan_message_type", "orphan_message_stanza_data", "orphan_message_reason"};

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_orphan", "message_orphan_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphan_key_index ON message_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.CDx("message_orphan", "message_orphan_parent_key_index", "CREATE INDEX IF NOT EXISTS message_orphan_parent_key_index ON message_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
        r5.CDx("message_orphan", "message_orphan_message_type_index", "CREATE INDEX IF NOT EXISTS message_orphan_message_type_index ON message_orphan (orphan_message_type)");
        r5.CDx("message_orphan", "message_orphan_reason_index", "CREATE INDEX IF NOT EXISTS message_orphan_reason_index ON message_orphan (orphan_message_reason)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r4;
        obj.A02 = "from_me";
        obj.A00 = r4;
        obj.A02 = "key_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r4;
        obj.A02 = "parent_chat_row_id";
        obj.A00 = r4;
        obj.A02 = "parent_from_me";
        obj.A00 = r4;
        obj.A02 = "parent_key_id";
        obj.A00 = r2;
        obj.A02 = "parent_sender_jid_row_id";
        obj.A00 = r4;
        obj.A02 = "timestamp";
        obj.A00 = r4;
        obj.A02 = "orphan_message_data";
        C25041Mq r22 = C25041Mq.BLOB;
        obj.A00 = r22;
        obj.A02 = "orphan_message_type";
        obj.A00 = r4;
        obj.A02 = "orphan_message_stanza_data";
        obj.A00 = r22;
        obj.A02 = "orphan_message_reason";
        obj.A00 = r4;
        r8.CE6("message_orphan", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("chat", "message_orphan", (String) null, "parent_chat_row_id=old._id");
        r5.CE8("message_orphan", (String) A01.first, (String) A01.second);
    }
}
