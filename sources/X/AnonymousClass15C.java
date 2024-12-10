package X;

/* renamed from: X.15C  reason: invalid class name */
public class AnonymousClass15C implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "order_id";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "thumbnail";
        obj.A00 = C25041Mq.BLOB;
        obj.A02 = "order_title";
        obj.A00 = r3;
        obj.A02 = "item_count";
        obj.A00 = r5;
        obj.A02 = "status";
        obj.A00 = r5;
        obj.A02 = "surface";
        obj.A00 = r5;
        obj.A02 = "message";
        obj.A00 = r3;
        obj.A02 = "seller_jid";
        obj.A00 = r5;
        obj.A02 = "token";
        obj.A00 = r3;
        obj.A02 = "currency_code";
        obj.A00 = r3;
        obj.A02 = "total_amount_1000";
        obj.A00 = r5;
        obj.A02 = "message_version";
        obj.A00 = r5;
        obj.A02 = "catalog_type";
        obj.A00 = r3;
        r8.CE6("message_quoted_order", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_order", (String) null, "message_row_id=old.message_row_id"), "message_quoted_order");
    }
}
