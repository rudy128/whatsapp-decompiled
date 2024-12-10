package X;

import android.util.Pair;

/* renamed from: X.14t  reason: invalid class name and case insensitive filesystem */
public final class C211214t implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("newsletter_subscribers", "newsletter_subscribers_by_type_index", "CREATE INDEX IF NOT EXISTS newsletter_subscribers_by_type_index ON newsletter_subscribers (chat_row_id, type_of_fetch)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C18070vi.A0d(r9, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r4;
        obj.A02 = "display_name";
        C25041Mq r7 = C25041Mq.TEXT;
        obj.A00 = r7;
        obj.A02 = "profile_picture_direct_path";
        obj.A00 = r7;
        obj.A02 = "subscription_time";
        obj.A00 = r4;
        obj.A02 = "role";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "type_of_fetch";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "fetched_time";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        r9.CE6("newsletter_subscribers", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("newsletter", "newsletter_subscribers", (String) null, "chat_row_id=old.chat_row_id");
        C18070vi.A0b(A01);
        r5.CE8("newsletter_subscribers", (String) A01.first, (String) A01.second);
    }
}
