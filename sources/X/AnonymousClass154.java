package X;

/* renamed from: X.154  reason: invalid class name */
public class AnonymousClass154 implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("priority_inbox", "priority_inbox_chat_row_index", "CREATE INDEX IF NOT EXISTS priority_inbox_chat_row_index ON priority_inbox (chat_row_id)");
        r5.CDx("priority_inbox", "priority_inbox_time_created_index", "CREATE INDEX IF NOT EXISTS priority_inbox_time_created_index ON priority_inbox (time_created)");
        r5.CDx("priority_inbox", "priority_inbox_score_index", "CREATE INDEX IF NOT EXISTS priority_inbox_score_index ON priority_inbox (priority_score)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "priority_score";
        obj.A00 = C25041Mq.DOUBLE;
        obj.A04 = true;
        obj.A02 = "version";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "is_priority";
        C25041Mq r2 = C25041Mq.BOOLEAN;
        obj.A00 = r2;
        obj.A02 = "label_removed";
        obj.A00 = r2;
        obj.A02 = "time_created";
        obj.A00 = r5;
        obj.A02 = "deep_conversion_rate";
        obj.A00 = r2;
        r7.CE6("priority_inbox", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
