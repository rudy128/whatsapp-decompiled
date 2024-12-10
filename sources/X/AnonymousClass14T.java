package X;

import android.util.Pair;

/* renamed from: X.14T  reason: invalid class name */
public class AnonymousClass14T implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "service";
        obj.A00 = r3;
        obj.A02 = "invite_used";
        obj.A00 = r3;
        r7.CE6("message_system_payment_invite_setup", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_system", "message_system_payment_invite_setup", (String) null, "message_row_id=old.message_row_id");
        r5.CE8("message_system_payment_invite_setup", (String) A01.first, (String) A01.second);
    }
}
