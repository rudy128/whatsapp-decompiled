package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Tq  reason: invalid class name and case insensitive filesystem */
public abstract class C50232Tq {
    public static final AnonymousClass1ED A00(String str) {
        AnonymousClass1ED r1;
        C18070vi.A0d(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "interop");
        C18070vi.A0X(A04);
        if ((A04 instanceof AnonymousClass1ED) && (r1 = (AnonymousClass1ED) A04) != null) {
            return r1;
        }
        throw new AnonymousClass11T(AnonymousClass001.A1H("Invalid interop JID: ", str, AnonymousClass000.A10()));
    }
}
