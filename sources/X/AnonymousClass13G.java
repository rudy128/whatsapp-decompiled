package X;

/* renamed from: X.13G  reason: invalid class name */
public class AnonymousClass13G implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("joinable_call_log", "joinable_call_log_group_jid_row_id_index", "CREATE INDEX IF NOT EXISTS joinable_call_log_group_jid_row_id_index ON joinable_call_log (group_jid_row_id)");
        r5.CDx("joinable_call_log", "joinable_call_log_call_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS joinable_call_log_call_id_index ON joinable_call_log (call_id)");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "call_log_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "call_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "joinable_video_call";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "group_jid_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A01 = "0";
        r8.CE6("joinable_call_log", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("call_log", "joinable_call_log", (String) null, "call_log_row_id=old._id"), "joinable_call_log");
    }
}
