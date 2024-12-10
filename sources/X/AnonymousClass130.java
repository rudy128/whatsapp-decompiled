package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.130  reason: invalid class name */
public final class AnonymousClass130 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_event", "message_event_name_index", "CREATE INDEX IF NOT EXISTS message_event_name_index ON message_event (name)");
        r5.CDx("message_event", "message_event_chat_row_id_and_start_time_index", "CREATE INDEX IF NOT EXISTS message_event_chat_row_id_and_start_time_index ON message_event (chat_row_id, start_time)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r10) {
        C18070vi.A0d(r10, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "is_canceled";
        obj.A00 = r3;
        obj.A0E(0);
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "description";
        obj.A00 = r5;
        obj.A02 = "location_latitude";
        C25041Mq r8 = C25041Mq.REAL;
        obj.A00 = r8;
        obj.A02 = "location_longitude";
        obj.A00 = r8;
        obj.A02 = "location_name";
        obj.A00 = r5;
        obj.A02 = "location_address";
        obj.A00 = r5;
        obj.A02 = "join_link";
        obj.A00 = r5;
        obj.A02 = "start_time";
        C25041Mq r52 = C25041Mq.DATETIME;
        obj.A00 = r52;
        obj.A04 = true;
        obj.A02 = "end_time";
        obj.A00 = r52;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "event_state";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "allow_extra_guests";
        obj.A00 = r3;
        r10.CE6("message_event", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_event"), "message_event");
    }
}
