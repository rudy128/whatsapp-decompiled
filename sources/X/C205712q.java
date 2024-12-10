package X;

/* renamed from: X.12q  reason: invalid class name and case insensitive filesystem */
public class C205712q implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("call_log", "call_log_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_log_key_index ON call_log (jid_row_id, from_me, call_id, transaction_id)");
        if (((AnonymousClass1F2) r4).A00) {
            r5.CDt("call_log", "call_log_ts_index", "CREATE INDEX IF NOT EXISTS call_log_ts_index ON call_log (timestamp)");
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r5;
        obj.A02 = "from_me";
        obj.A00 = r5;
        obj.A02 = "call_id";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "transaction_id";
        obj.A00 = r5;
        obj.A02 = "timestamp";
        obj.A00 = r5;
        obj.A02 = "video_call";
        obj.A00 = r5;
        obj.A02 = "duration";
        obj.A00 = r5;
        obj.A02 = "call_result";
        obj.A00 = r5;
        obj.A02 = "is_dnd_mode_on";
        obj.A00 = r5;
        obj.A02 = "bytes_transferred";
        obj.A00 = r5;
        obj.A02 = "group_jid_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "is_joinable_group_call";
        obj.A00 = r5;
        obj.A02 = "call_creator_device_jid_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "call_random_id";
        obj.A00 = r3;
        obj.A02 = "call_link_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "call_type";
        obj.A00 = r5;
        obj.A02 = "offer_silence_reason";
        obj.A00 = r5;
        obj.A02 = "scheduled_id";
        obj.A00 = r3;
        r9.CE6("call_log", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
