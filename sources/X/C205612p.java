package X;

/* renamed from: X.12p  reason: invalid class name and case insensitive filesystem */
public class C205612p implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("call_log_participant_v2", "call_log_participant_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_log_participant_key_index ON call_log_participant_v2 (call_log_row_id, jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "call_log_row_id";
        obj.A00 = r3;
        obj.A02 = "jid_row_id";
        obj.A00 = r3;
        obj.A02 = "call_result";
        obj.A00 = r3;
        r7.CE6("call_log_participant_v2", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("call_log", "call_log_participant_v2", (String) null, "call_log_row_id=old._id"), "call_log_participant_v2");
    }
}
