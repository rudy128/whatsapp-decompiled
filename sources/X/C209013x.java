package X;

/* renamed from: X.13x  reason: invalid class name and case insensitive filesystem */
public class C209013x implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "amount";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "note";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "status";
        obj.A00 = r5;
        obj.A02 = "attachment_jpeg_thumbnail";
        obj.A00 = C25041Mq.BLOB;
        r7.CE6("message_quote_invoice", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
