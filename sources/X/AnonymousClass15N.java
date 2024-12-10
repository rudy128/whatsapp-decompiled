package X;

/* renamed from: X.15N  reason: invalid class name */
public class AnonymousClass15N implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("scheduled_calls", "scheduled_calls_chat_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_chat_row_id_index ON scheduled_calls (key_chat_row_id, scheduled_timestamp, is_upcoming)");
        r5.CDx("scheduled_calls", "scheduled_calls_key_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_key_id_index ON scheduled_calls (key_chat_row_id, key_id)");
        r5.CDx("scheduled_calls", "scheduled_calls_timestamp_index_v2", "CREATE INDEX IF NOT EXISTS scheduled_calls_timestamp_index_v2 ON scheduled_calls (is_upcoming, scheduled_timestamp)");
        r5.CDx("scheduled_calls", "scheduled_calls_call_log_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_call_log_row_id_index ON scheduled_calls (call_log_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "creation_message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "key_id";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "key_from_me";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "key_chat_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "call_type";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "scheduled_timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "call_title";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "creator_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "is_upcoming";
        obj.A00 = C25041Mq.BOOLEAN;
        obj.A04 = true;
        obj.A02 = "call_log_row_id";
        obj.A00 = r3;
        r8.CE6("scheduled_calls", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
