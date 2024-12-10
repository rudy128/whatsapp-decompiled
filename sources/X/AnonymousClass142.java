package X;

/* renamed from: X.142  reason: invalid class name */
public class AnonymousClass142 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "latitude";
        C25041Mq r1 = C25041Mq.REAL;
        obj.A00 = r1;
        obj.A02 = "longitude";
        obj.A00 = r1;
        obj.A02 = "place_name";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "place_address";
        obj.A00 = r2;
        obj.A02 = "url";
        obj.A00 = r2;
        obj.A02 = "thumbnail";
        obj.A00 = C25041Mq.BLOB;
        r6.CE6("message_quoted_location", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_location", (String) null, "message_row_id=old.message_row_id"), "message_quoted_location");
    }
}
