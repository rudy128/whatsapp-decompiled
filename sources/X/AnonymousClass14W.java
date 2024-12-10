package X;

import android.util.Pair;

/* renamed from: X.14W  reason: invalid class name */
public final class AnonymousClass14W implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r1 = C25041Mq.INTEGER;
        obj.A00 = r1;
        obj.A05 = true;
        obj.A02 = "original_message_row_id";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A06 = true;
        obj.A02 = "reminder_timestamp_ms";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "reminder_content";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        r7.CE6("message_system_reminder_setup", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message_system", "message_system_reminder_setup", (String) null, "message_row_id=old.message_row_id");
        C18070vi.A0b(A01);
        r5.CE8("message_system_reminder_setup", (String) A01.first, (String) A01.second);
    }
}
