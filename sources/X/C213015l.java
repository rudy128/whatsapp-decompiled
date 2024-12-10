package X;

import android.util.Pair;

/* renamed from: X.15l  reason: invalid class name and case insensitive filesystem */
public final class C213015l implements AnonymousClass12T {
    public static String[] A00 = {"pin_in_chat_state", "sender_timestamp"};

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_add_on_pin_in_chat", "message_add_on_pin_in_chat_state_index", "CREATE INDEX IF NOT EXISTS message_add_on_pin_in_chat_state_index ON message_add_on_pin_in_chat (pin_in_chat_state)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_add_on_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "pin_in_chat_state";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "sender_timestamp";
        obj.A00 = r2;
        r7.CE6("message_add_on_pin_in_chat", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message_add_on", "message_add_on_pin_in_chat", (String) null, "message_add_on_row_id=old._id");
        C18070vi.A0b(A01);
        r5.CE8("message_add_on_pin_in_chat", (String) A01.first, (String) A01.second);
    }
}
