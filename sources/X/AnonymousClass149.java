package X;

import android.util.Pair;

/* renamed from: X.149  reason: invalid class name */
public class AnonymousClass149 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A02 = "campaign_id";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "duration";
        obj.A00 = r6;
        obj.A02 = "first_seen_timestamp";
        obj.A00 = r6;
        obj.A02 = "action_link_url";
        obj.A00 = r3;
        obj.A02 = "action_link_button_title";
        obj.A00 = r3;
        r8.CE6("message_status_psa_campaign", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_status_psa_campaign");
        r4.CE8("message_status_psa_campaign", (String) A00.first, (String) A00.second);
    }
}
