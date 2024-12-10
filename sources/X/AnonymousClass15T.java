package X;

import android.util.Pair;

/* renamed from: X.15T  reason: invalid class name */
public final class AnonymousClass15T implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "status_distribution_mode";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "is_mentioned";
        obj.A00 = r3;
        obj.A02 = "status_mentions";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "status_mention_source";
        obj.A00 = r5;
        obj.A02 = "cannot_receive_reactions";
        obj.A00 = r3;
        obj.A02 = "cannot_be_ranked";
        obj.A00 = r3;
        obj.A02 = "has_embedded_music";
        obj.A00 = r3;
        obj.A02 = "status_attribution_type";
        obj.A00 = r3;
        r7.CE6("status_message_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("status_message_info");
        r4.CE8("status_message_info", (String) A00.first, (String) A00.second);
    }
}
