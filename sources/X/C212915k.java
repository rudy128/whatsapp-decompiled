package X;

import android.util.Pair;

/* renamed from: X.15k  reason: invalid class name and case insensitive filesystem */
public class C212915k implements AnonymousClass12T {
    public static final String[] A00 = {"keep_in_chat_state", "sender_timestamp", "keep_count", "actor_device_jid_row_id"};

    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_add_on_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "keep_in_chat_state";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "sender_timestamp";
        obj.A00 = r4;
        obj.A02 = "keep_count";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "actor_device_jid_row_id";
        obj.A00 = r4;
        r8.CE6("message_add_on_keep_in_chat", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_add_on", "message_add_on_keep_in_chat", (String) null, "message_add_on_row_id=old._id");
        r5.CE8("message_add_on_keep_in_chat", (String) A01.first, (String) A01.second);
    }
}
