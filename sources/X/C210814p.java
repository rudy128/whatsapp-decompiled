package X;

import android.util.Pair;

/* renamed from: X.14p  reason: invalid class name and case insensitive filesystem */
public final class C210814p implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r2;
        obj.A04 = true;
        r7.CE6("newsletter_message_enforcements", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("newsletter_message_enforcements");
        r4.CE8("newsletter_message_enforcements", (String) A00.first, (String) A00.second);
    }
}
