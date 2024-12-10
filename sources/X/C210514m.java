package X;

/* renamed from: X.14m  reason: invalid class name and case insensitive filesystem */
public final class C210514m implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_newsletter_admin_invite", "message_newsletter_admin_invite_newsletter_jid_row_id_index", "CREATE INDEX IF NOT EXISTS message_newsletter_admin_invite_newsletter_jid_row_id_index ON message_newsletter_admin_invite (newsletter_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "newsletter_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "newsletter_name";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "expiration";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("message_newsletter_admin_invite", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_newsletter_admin_invite"), "message_newsletter_admin_invite");
    }
}
