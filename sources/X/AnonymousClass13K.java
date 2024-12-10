package X;

import android.util.Pair;

/* renamed from: X.13K  reason: invalid class name */
public class AnonymousClass13K implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("labeled_messages", "labeled_messages_index", "CREATE UNIQUE INDEX IF NOT EXISTS labeled_messages_index ON labeled_messages (label_id, message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "label_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("labeled_messages", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A00 = C25061Ms.A00("labeled_messages");
        r5.CE8("labeled_messages", (String) A00.first, (String) A00.second);
        Pair A01 = C25071Mt.A01("labels", "labeled_messages", (String) null, "label_id=old._id");
        r5.CE8("labeled_messages", (String) A01.first, (String) A01.second);
    }
}
