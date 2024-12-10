package X;

import android.util.Pair;

/* renamed from: X.15p  reason: invalid class name and case insensitive filesystem */
public class C213415p implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_add_on_receipt_device", "message_add_on_receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_receipt_device_index ON message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id)");
        r5.CDx("message_add_on_receipt_device", "message_add_on_receipt_device_jid_index", "CREATE INDEX IF NOT EXISTS message_add_on_receipt_device_jid_index ON message_add_on_receipt_device (receipt_device_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "receipt_device_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_add_on_row_id";
        obj.A00 = r4;
        obj.A02 = "receipt_device_jid_row_id";
        obj.A00 = r4;
        obj.A02 = "receipt_device_timestamp";
        obj.A00 = r4;
        obj.A02 = "primary_device_version";
        obj.A00 = r4;
        r7.CE6("message_add_on_receipt_device", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_add_on", "message_add_on_receipt_device", (String) null, "message_add_on_row_id=old._id");
        r5.CE8("message_add_on_receipt_device", (String) A01.first, (String) A01.second);
    }
}
