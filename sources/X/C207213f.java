package X;

/* renamed from: X.13f  reason: invalid class name and case insensitive filesystem */
public class C207213f implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "latitude";
        C25041Mq r5 = C25041Mq.REAL;
        obj.A00 = r5;
        obj.A02 = "longitude";
        obj.A00 = r5;
        obj.A02 = "place_name";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        obj.A02 = "place_address";
        obj.A00 = r6;
        obj.A02 = "url";
        obj.A00 = r6;
        obj.A02 = "live_location_share_duration";
        obj.A00 = r3;
        obj.A02 = "live_location_sequence_number";
        obj.A00 = r3;
        obj.A02 = "live_location_final_latitude";
        obj.A00 = r5;
        obj.A02 = "live_location_final_longitude";
        obj.A00 = r5;
        obj.A02 = "live_location_final_timestamp";
        obj.A00 = r3;
        obj.A02 = "map_download_status";
        obj.A00 = r3;
        r8.CE6("message_location", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_location"), "message_location");
    }
}
