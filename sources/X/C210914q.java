package X;

import android.util.Pair;

/* renamed from: X.14q  reason: invalid class name and case insensitive filesystem */
public final class C210914q implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter_message_reaction", "newsletter_message_reaction_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_message_reaction_index ON newsletter_message_reaction (message_row_id, reaction)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "reaction";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "reaction_count";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("newsletter_message_reaction", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("newsletter_message_reaction");
        r4.CE8("newsletter_message_reaction", (String) A00.first, (String) A00.second);
    }
}
