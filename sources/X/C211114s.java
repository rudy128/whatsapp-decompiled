package X;

/* renamed from: X.14s  reason: invalid class name and case insensitive filesystem */
public final class C211114s implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter_my_reaction_orphan_message", "newsletter_my_reaction_orphan_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_my_reaction_orphan_message_index ON newsletter_my_reaction_orphan_message (chat_row_id, server_message_id)");
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
        obj.A02 = "chat_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "server_message_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "reaction_from_me";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "reactions_from_me_ts";
        obj.A00 = r4;
        obj.A02 = "votes_from_me";
        obj.A00 = r2;
        obj.A02 = "votes_from_me_ts";
        obj.A00 = r4;
        r7.CE6("newsletter_my_reaction_orphan_message", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
