package X;

import android.util.Pair;

/* renamed from: X.14r  reason: invalid class name and case insensitive filesystem */
public final class C211014r implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter_message", "newsletter_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_message_index ON newsletter_message (chat_row_id, server_message_id)");
        r5.CDx("newsletter_message", "is_autodelete_eligible_index", "CREATE INDEX IF NOT EXISTS is_autodelete_eligible_index ON newsletter_message (is_autodelete_eligible)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "server_message_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "comments_count";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "reaction_from_me";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "extra_newsletter_tables";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "extra_table_last_update_ts";
        obj.A00 = r3;
        obj.A02 = "reactions_from_me_ts";
        obj.A00 = r3;
        obj.A02 = "view_count";
        obj.A00 = r3;
        obj.A02 = "is_autodelete_eligible";
        obj.A00 = r3;
        obj.A02 = "is_wamo_sub";
        obj.A00 = r3;
        r8.CE6("newsletter_message", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("newsletter_message");
        r4.CE8("newsletter_message", (String) A00.first, (String) A00.second);
    }
}
