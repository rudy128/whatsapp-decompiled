package X;

/* renamed from: X.15c  reason: invalid class name and case insensitive filesystem */
public class C212115c implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "content_text_data";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "footer_text_data";
        obj.A00 = r5;
        obj.A02 = "template_id";
        obj.A00 = r5;
        obj.A02 = "csat_trigger_expiration_ts";
        obj.A00 = r3;
        obj.A02 = "category";
        obj.A00 = r5;
        obj.A02 = "tag";
        obj.A00 = r5;
        obj.A02 = "mask_linked_devices";
        obj.A00 = r3;
        r8.CE6("message_template", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_template"), "message_template");
    }
}
