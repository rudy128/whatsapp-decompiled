package X;

/* renamed from: X.13B  reason: invalid class name */
public class AnonymousClass13B implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDt("message_ui_elements", "message_ui_elements_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_ui_elements_message_row_id_index ON message_ui_elements (message_row_id)");
        r5.CDt("message_ui_elements", "message_ui_elements_element_type_index", "CREATE INDEX IF NOT EXISTS message_ui_elements_element_type_index ON message_ui_elements (element_type)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A04 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "element_type";
        obj.A00 = r3;
        obj.A02 = "element_content";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("message_ui_elements", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_ui_elements"), "message_ui_elements");
    }
}
