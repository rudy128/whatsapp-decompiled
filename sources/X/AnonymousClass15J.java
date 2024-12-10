package X;

/* renamed from: X.15J  reason: invalid class name */
public class AnonymousClass15J implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("receipt_user", "receipt_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_user_index ON receipt_user(message_row_id,receipt_user_jid_row_id)");
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
        obj.A04 = true;
        obj.A02 = "receipt_user_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "receipt_timestamp";
        obj.A00 = r3;
        obj.A02 = "read_timestamp";
        obj.A00 = r3;
        obj.A02 = "played_timestamp";
        obj.A00 = r3;
        r7.CE6("receipt_user", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("receipt_user"), "receipt_user");
    }
}
