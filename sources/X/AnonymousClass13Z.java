package X;

import android.util.Pair;

/* renamed from: X.13Z  reason: invalid class name */
public class AnonymousClass13Z implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "setting_duration";
        obj.A00 = r3;
        obj.A02 = "setting_reason";
        obj.A00 = r3;
        obj.A02 = "user_jid_row_id_csv";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "ephemeral_trigger";
        obj.A00 = r3;
        obj.A02 = "ephemeral_initiated_by_me";
        obj.A00 = r3;
        r7.CE6("message_ephemeral_setting", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_ephemeral_setting");
        r4.CE8("message_ephemeral_setting", (String) A00.first, (String) A00.second);
    }
}
