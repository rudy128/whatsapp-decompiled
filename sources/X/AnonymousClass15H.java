package X;

/* renamed from: X.15H  reason: invalid class name */
public class AnonymousClass15H implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("receipt_device", "receipt_device_table_device_index", "CREATE INDEX IF NOT EXISTS receipt_device_table_device_index ON receipt_device (receipt_device_jid_row_id)");
        r5.CDx("receipt_device", "receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_device_index ON receipt_device (message_row_id, receipt_device_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "receipt_device_jid_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "receipt_device_timestamp";
        obj.A00 = r4;
        obj.A02 = "primary_device_version";
        obj.A00 = r4;
        r7.CE6("receipt_device", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("receipt_device"), "receipt_device");
    }
}
