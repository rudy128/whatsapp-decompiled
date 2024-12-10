package X;

/* renamed from: X.13t  reason: invalid class name and case insensitive filesystem */
public final class C208613t implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_poll_option", "message_poll_option_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_poll_option_message_row_id_index ON message_poll_option (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r4;
        obj.A02 = "option_sha256";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "option_name";
        obj.A00 = r2;
        obj.A02 = "vote_total";
        obj.A00 = r4;
        r7.CE6("message_poll_option", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_poll", "message_poll_option", (String) null, "message_row_id=old.message_row_id"), "message_poll_option");
        r5.CE9(C25071Mt.A01("message", "message_poll_option", (String) null, "message_row_id=old._id"), "message_poll_option");
    }
}
