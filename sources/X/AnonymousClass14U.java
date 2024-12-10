package X;

/* renamed from: X.14U  reason: invalid class name */
public class AnonymousClass14U implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "new_photo_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "old_photo";
        C25041Mq r2 = C25041Mq.BLOB;
        obj.A00 = r2;
        obj.A02 = "new_photo";
        obj.A00 = r2;
        r6.CE6("message_system_photo_change", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_system", "message_system_photo_change", (String) null, "message_row_id=old.message_row_id"), "message_system_photo_change");
    }
}
