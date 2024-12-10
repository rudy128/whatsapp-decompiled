package X;

import android.util.Pair;

/* renamed from: X.151  reason: invalid class name */
public class AnonymousClass151 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "to_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "participant_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "message_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        r7.CE6("played_self_receipt", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("played_self_receipt");
        r4.CE8("played_self_receipt", (String) A00.first, (String) A00.second);
    }
}
