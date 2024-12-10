package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.13Q  reason: invalid class name */
public final class AnonymousClass13Q implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_add_on_event_response", "message_add_on_event_response_index", "CREATE INDEX IF NOT EXISTS message_add_on_event_response_index ON message_add_on_event_response (response)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_add_on_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        obj.A00 = r2;
        obj.A0E(0);
        obj.A02 = "sender_timestamp";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "extra_guest_count";
        obj.A00 = r2;
        r7.CE6("message_add_on_event_response", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_add_on", "message_add_on_event_response", (String) null, "message_add_on_row_id=old._id"), "message_add_on_event_response");
    }
}
