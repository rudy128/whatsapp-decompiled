package X;

import android.util.Pair;

/* renamed from: X.13v  reason: invalid class name and case insensitive filesystem */
public class C208813v implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A02 = "host_storage";
        obj.A00 = r5;
        obj.A02 = "actual_actors";
        obj.A00 = r5;
        obj.A02 = "privacy_mode_ts";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "business_name";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("message_privacy_state", new C25031Mp(r5, "message_row_id", "NOT NULL PRIMARY KEY"), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_privacy_state");
        r4.CE8("message_privacy_state", (String) A00.first, (String) A00.second);
    }
}
