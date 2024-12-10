package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9zG  reason: invalid class name and case insensitive filesystem */
public abstract class C198999zG {
    public C29621ca A00;

    public static AnonymousClass1UI A01(StringBuilder sb) {
        sb.append(1);
        sb.append('.');
        return new AnonymousClass1UI(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9NC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.9NH, java.lang.Object] */
    public static void A02(C185669cx r5, UserJid userJid, String str) {
        ? obj = new Object();
        obj.A01 = str;
        obj.A00 = userJid;
        C98494rF r3 = r5.A02;
        boolean A18 = C18070vi.A18(r5.A01, "unblock");
        ? obj2 = new Object();
        obj2.A01 = 0;
        obj2.A00 = A18 ? 1 : 0;
        obj2.A02 = obj;
        r3.element = obj2;
    }

    public final C29621ca A03() {
        C29621ca r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("protocolTreeNode");
        throw null;
    }
}
