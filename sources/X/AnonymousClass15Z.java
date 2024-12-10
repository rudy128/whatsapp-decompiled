package X;

/* renamed from: X.15Z  reason: invalid class name */
public class AnonymousClass15Z implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_template_button", "message_template_button_index", "CREATE INDEX IF NOT EXISTS message_template_button_index ON message_template_button (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "text_data";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "extra_data";
        obj.A00 = r5;
        obj.A02 = "button_type";
        obj.A00 = r3;
        obj.A02 = "used";
        obj.A00 = r3;
        obj.A02 = "selected_index";
        obj.A00 = r3;
        obj.A02 = "selected_carousel_card_index";
        obj.A00 = r3;
        obj.A02 = "otp_button_type";
        obj.A00 = r3;
        obj.A02 = "extra_consent_data";
        obj.A00 = r5;
        obj.A02 = "otp_matched_package_name";
        obj.A00 = r5;
        obj.A02 = "webview_presentation";
        obj.A00 = r3;
        obj.A02 = "webview_interaction";
        obj.A00 = r3;
        r8.CE6("message_template_button", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_template", "message_template_button", (String) null, "message_row_id=old.message_row_id"), "message_template_button");
        r5.CE9(C25061Ms.A00("message_template_button"), "message_template_button");
    }
}
