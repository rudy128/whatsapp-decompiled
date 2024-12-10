package X;

/* renamed from: X.14i  reason: invalid class name and case insensitive filesystem */
public class C210114i implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("missed_call_log_participant", "missed_call_log_participants_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_log_participants_key_index ON missed_call_log_participant (call_logs_row_id, jid)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "call_logs_row_id";
        obj.A00 = r3;
        obj.A02 = "jid";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "call_result";
        obj.A00 = r3;
        r7.CE6("missed_call_log_participant", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("missed_call_logs", "missed_call_log_participant", (String) null, "call_logs_row_id=old._id"), "missed_call_log_participant");
    }
}
