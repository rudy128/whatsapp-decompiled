package X;

import android.util.Pair;

/* renamed from: X.15O  reason: invalid class name */
public final class AnonymousClass15O implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("scheduled_reminder_message", "scheduled_reminder_message_chat_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_reminder_message_chat_row_id_index ON scheduled_reminder_message (chat_row_id)");
        r5.CDx("scheduled_reminder_message", "scheduled_reminder_message_timestamp_index", "CREATE INDEX IF NOT EXISTS scheduled_reminder_message_timestamp_index ON scheduled_reminder_message (scheduled_reminder_timestamp_ms)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "scheduled_reminder_timestamp_ms";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r2;
        r7.CE6("scheduled_reminder_message", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("scheduled_reminder_message");
        r4.CE8("scheduled_reminder_message", (String) A00.first, (String) A00.second);
    }
}
