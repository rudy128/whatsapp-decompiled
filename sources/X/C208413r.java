package X;

/* renamed from: X.13r  reason: invalid class name and case insensitive filesystem */
public class C208413r implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "sender_jid_row_id";
        obj.A00 = r5;
        obj.A02 = "receiver_jid_row_id";
        obj.A00 = r5;
        obj.A02 = "amount_with_symbol";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "remote_resource";
        obj.A00 = r3;
        obj.A02 = "remote_message_sender_jid_row_id";
        obj.A00 = r5;
        obj.A02 = "remote_message_from_me";
        obj.A00 = r5;
        obj.A02 = "remote_message_key";
        obj.A00 = r3;
        r7.CE6("message_payment", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_system", "message_payment", (String) null, "message_row_id=old.message_row_id"), "message_payment");
    }
}
