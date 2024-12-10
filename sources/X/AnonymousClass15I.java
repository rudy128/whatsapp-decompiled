package X;

/* renamed from: X.15I  reason: invalid class name */
public class AnonymousClass15I implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("receipt_orphaned", "receipt_orphaned_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_orphaned_index ON receipt_orphaned (chat_row_id, from_me, key_id, receipt_device_jid_row_id, receipt_recipient_jid_row_id, status)");
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
        obj.A04 = true;
        obj.A02 = "from_me";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "key_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "receipt_device_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "receipt_recipient_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "status";
        obj.A00 = r3;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        r7.CE6("receipt_orphaned", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
