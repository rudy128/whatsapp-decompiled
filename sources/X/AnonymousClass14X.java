package X;

import android.util.Pair;

/* renamed from: X.14X  reason: invalid class name */
public class AnonymousClass14X implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "creation_message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A06 = true;
        obj.A02 = "call_title";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "call_timestamp_ms";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("message_system_scheduled_call_start", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_system", "message_system_scheduled_call_start", (String) null, "message_row_id=old.message_row_id");
        r5.CE8("message_system_scheduled_call_start", (String) A01.first, (String) A01.second);
    }
}
