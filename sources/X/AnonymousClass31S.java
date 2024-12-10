package X;

/* renamed from: X.31S  reason: invalid class name */
public final class AnonymousClass31S implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("recently_accepted_deeplink_invites", "user_jid_index", " CREATE INDEX IF NOT EXISTS user_jid_index ON recently_accepted_deeplink_invites (user_jid);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C25021Mo A06 = C18070vi.A06(r7);
        C25031Mp[] r3 = new C25031Mp[3];
        A06.A02 = "user_jid";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        C25021Mo.A09(A06, r3);
        A06.A02 = "invite_accepted_time";
        A06.A00 = C25041Mq.INTEGER;
        r3[1] = A06.A0B();
        A06.A02 = "invite_receiver_reason";
        C25021Mo.A06(A06, r2, r3);
        r7.CE5("recently_accepted_deeplink_invites", AnonymousClass1ZU.A06(r3), AnonymousClass1ZU.A06("PRIMARY KEY (user_jid)"));
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
