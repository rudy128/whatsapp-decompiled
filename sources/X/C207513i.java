package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.13i  reason: invalid class name and case insensitive filesystem */
public final class C207513i implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_media_interactive_annotation", "message_media_interactive_annotation_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_index ON message_media_interactive_annotation (message_row_id, sort_order)");
        r5.CDt("message_media_interactive_annotation", "message_media_interactive_annotation_type_index", "CREATE INDEX IF NOT EXISTS message_media_interactive_annotation_type_index ON message_media_interactive_annotation (type)");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r4;
        obj.A02 = "skip_confirmation";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "location_latitude";
        C25041Mq r5 = C25041Mq.REAL;
        obj.A00 = r5;
        obj.A02 = "location_longitude";
        obj.A00 = r5;
        obj.A02 = "location_name";
        C25041Mq r52 = C25041Mq.TEXT;
        obj.A00 = r52;
        obj.A02 = "newsletter_jid_row_id";
        obj.A00 = r4;
        obj.A02 = "newsletter_server_message_id";
        obj.A00 = r4;
        obj.A02 = "newsletter_name";
        obj.A00 = r52;
        obj.A02 = "newsletter_content_type";
        obj.A00 = r4;
        obj.A02 = "newsletter_accessibility_text";
        obj.A00 = r52;
        obj.A02 = "sort_order";
        obj.A00 = r4;
        obj.A02 = "child_message_row_id";
        obj.A00 = r4;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r4;
        obj.A02 = "fp_interactive_annotation";
        obj.A00 = C25041Mq.BLOB;
        r7.CE6("message_media_interactive_annotation", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_media", "message_media_interactive_annotation", (String) null, "message_row_id=old.message_row_id"), "message_media_interactive_annotation");
    }
}
