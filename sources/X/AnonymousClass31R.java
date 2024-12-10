package X;

/* renamed from: X.31R  reason: invalid class name */
public class AnonymousClass31R implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("quick_promotion_payload", "quick_promotion_payload_index", " CREATE UNIQUE INDEX IF NOT EXISTS quick_promotion_payload_index ON quick_promotion_payload (surface_id, trigger_id);");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[5];
        obj.A02 = "surface_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A04 = true;
        r3[0] = obj.A0B();
        obj.A02 = "trigger_id";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        C25021Mo.A07(obj, r3);
        obj.A02 = "trigger_context";
        C25021Mo.A06(obj, r1, r3);
        obj.A02 = "qp_details";
        obj.A00 = C25041Mq.BLOB;
        obj.A04 = true;
        C25021Mo.A08(obj, r3);
        obj.A02 = "insertion_time";
        C25021Mo.A05(obj, C25041Mq.DATETIME, r3);
        r6.CE6("quick_promotion_payload", r3);
    }
}
