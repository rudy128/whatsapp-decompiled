package X;

/* renamed from: X.14v  reason: invalid class name and case insensitive filesystem */
public class C211414v implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_orphaned_edit", "message_orphaned_edit_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphaned_edit_key_index ON message_orphaned_edit (key_id, from_me, chat_row_id, sender_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "key_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "from_me";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "timestamp";
        obj.A00 = r4;
        obj.A02 = "message_type";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "revoked_key_id";
        obj.A00 = r2;
        obj.A02 = "retry_count";
        obj.A00 = r4;
        obj.A02 = "admin_jid_row_id";
        obj.A00 = r4;
        obj.A02 = "orphan_message_data";
        C25041Mq r22 = C25041Mq.BLOB;
        obj.A00 = r22;
        obj.A02 = "reporting_token";
        obj.A00 = r22;
        obj.A02 = "reporting_tag";
        obj.A00 = r22;
        obj.A02 = "reporting_version";
        obj.A00 = r4;
        r9.CE6("message_orphaned_edit", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
