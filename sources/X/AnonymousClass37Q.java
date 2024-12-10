package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.37Q  reason: invalid class name */
public final class AnonymousClass37Q implements AnonymousClass3M6 {
    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.34m, X.B5K] */
    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r6, C29621ca r7) {
        C29621ca A0A = C18070vi.A0A(r7);
        if (A0A == null) {
            return null;
        }
        String A0Q = A0A.A0Q("thread_msg_id", (String) null);
        UserJid userJid = (UserJid) A0A.A0F(UserJid.class, "thread_msg_sender_jid");
        if (A0Q == null && userJid == null) {
            return null;
        }
        ? obj = new Object();
        obj.A01 = A0Q;
        obj.A00 = userJid;
        return obj;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
