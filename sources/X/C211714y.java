package X;

import android.util.Pair;

/* renamed from: X.14y  reason: invalid class name and case insensitive filesystem */
public class C211714y implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "background_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A05 = true;
        obj.A02 = "background_order";
        obj.A00 = C25041Mq.INTEGER;
        r6.CE6("payment_background_order", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("payment_background", "payment_background_order", (String) null, "background_id=old.background_id");
        r5.CE8("payment_background_order", (String) A01.first, (String) A01.second);
    }
}
