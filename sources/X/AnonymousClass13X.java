package X;

import android.util.Pair;

/* renamed from: X.13X  reason: invalid class name */
public class AnonymousClass13X implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_details", "message_details_author_device_jid_index", "CREATE INDEX IF NOT EXISTS message_details_author_device_jid_index ON message_details (author_device_jid)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "author_device_jid";
        obj.A00 = r3;
        r7.CE6("message_details", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_details");
        r4.CE8("message_details", (String) A00.first, (String) A00.second);
    }
}
