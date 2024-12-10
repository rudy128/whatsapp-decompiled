package X;

/* renamed from: X.139  reason: invalid class name */
public class AnonymousClass139 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "group_jid_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "admin_jid_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "group_name";
        C25041Mq r7 = C25041Mq.TEXT;
        obj.A00 = r7;
        obj.A02 = "invite_code";
        obj.A00 = r7;
        obj.A02 = "expiration";
        obj.A00 = r5;
        obj.A02 = "invite_time";
        obj.A00 = r5;
        obj.A02 = "expired";
        obj.A00 = r5;
        obj.A02 = "group_type";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A0E(0);
        r9.CE6("message_group_invite", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_group_invite"), "message_group_invite");
    }
}
