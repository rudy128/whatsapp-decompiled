package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3tY  reason: invalid class name and case insensitive filesystem */
public final class C78733tY extends C79083uN {
    public boolean A00;

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public String getMessageString() {
        String string;
        Context context;
        int i;
        AnonymousClass206 fMessage = getFMessage();
        C18070vi.A0z(fMessage, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAdminRevoked");
        AnonymousClass23O r2 = (AnonymousClass23O) fMessage;
        UserJid userJid = r2.A00;
        if (this.A0U.A0O(userJid)) {
            context = getContext();
            i = 2131886554;
        } else if (userJid == null) {
            context = getContext();
            i = 2131886552;
        } else {
            int A0B = this.A0l.A0B(r2.A0v.A00);
            String A0a = this.A0l.A0a(C220618l.newArrayList((Object[]) new UserJid[]{userJid}), A0B);
            C18070vi.A0X(A0a);
            string = getContext().getString(2131886553, new Object[]{A0a});
            C18070vi.A0X(string);
            return string;
        }
        string = context.getString(i);
        C18070vi.A0X(string);
        return string;
    }
}
