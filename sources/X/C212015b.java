package X;

/* renamed from: X.15b  reason: invalid class name and case insensitive filesystem */
public class C212015b implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "content_text_data";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "footer_text_data";
        obj.A00 = r1;
        r6.CE6("message_template_quoted", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_template_quoted", (String) null, "message_row_id=old.message_row_id"), "message_template_quoted");
    }
}
