package X;

/* renamed from: X.134  reason: invalid class name */
public final class AnonymousClass134 implements AnonymousClass12T {
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
        obj.A02 = "newsletter_jid_row_id";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "newsletter_server_message_id";
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "newsletter_name";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A01 = "''";
        r7.CE6("forwarded_newsletter_message_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("forwarded_newsletter_message_info"), "forwarded_newsletter_message_info");
    }
}
