package X;

/* renamed from: X.15A  reason: invalid class name */
public class AnonymousClass15A implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A02 = "element_type";
        obj.A00 = r3;
        obj.A02 = "element_content";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("message_quoted_ui_elements", new C25031Mp(r3, "message_row_id", "NOT NULL PRIMARY KEY"), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_ui_elements", (String) null, "message_row_id=old.message_row_id"), "message_quoted_ui_elements");
    }
}
