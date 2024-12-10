package X;

/* renamed from: X.14P  reason: invalid class name */
public class AnonymousClass14P implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "privacy_provider";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "verified_biz_name";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "biz_state_id";
        obj.A00 = r4;
        r7.CE6("message_system_initial_privacy_provider", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_system", "message_system_initial_privacy_provider", (String) null, "message_row_id=old.message_row_id"), "message_system_initial_privacy_provider");
    }
}
