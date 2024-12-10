package X;

/* renamed from: X.14j  reason: invalid class name and case insensitive filesystem */
public class C210214j implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("missed_call_logs", "missed_call_logs_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_logs_key_index ON missed_call_logs (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A02 = "video_call";
        obj.A00 = r3;
        obj.A02 = "group_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "is_joinable_group_call";
        obj.A00 = r3;
        obj.A02 = "is_dnd_mode_on";
        obj.A00 = r3;
        obj.A02 = "offer_silence_reason";
        obj.A00 = r3;
        r7.CE6("missed_call_logs", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("missed_call_logs"), "missed_call_logs");
    }
}
