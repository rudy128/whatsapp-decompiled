package X;

import android.util.Pair;

/* renamed from: X.12b  reason: invalid class name and case insensitive filesystem */
public class C204212b implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "agent_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        r6.CE6("agent_message_attribution", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("agent_message_attribution");
        r4.CE8("agent_message_attribution", (String) A00.first, (String) A00.second);
    }
}
