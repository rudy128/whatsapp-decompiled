package X;

import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.3vC  reason: invalid class name */
public abstract class AnonymousClass3vC extends C79333vF {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0O = AnonymousClass3MZ.A0O(r4, starredMessagesActivity);
            C72483Me.A0q(A0O, starredMessagesActivity);
            AnonymousClass10G r1 = A0O.A00;
            AnonymousClass1FB.A0K(A0O, r1, starredMessagesActivity, r1.A45);
            AnonymousClass1FB.A0L(A0O, r1, starredMessagesActivity, r1.A5A);
            starredMessagesActivity.A00 = C000200d.A00(r4.A63);
            starredMessagesActivity.A03 = AnonymousClass3MZ.A0R(A0O);
            C74803cp.A0u(r4, A0O, r1, starredMessagesActivity, A0O.ABd);
            starredMessagesActivity.A02 = AnonymousClass3MY.A0S(A0O);
            starredMessagesActivity.A01 = (AnonymousClass4JB) r4.A2L.get();
            starredMessagesActivity.A04 = (C28521aN) A0O.AA6.get();
            starredMessagesActivity.A03 = A0O.A6j();
        }
    }

    public AnonymousClass3vC() {
        C91004ez.A00(this, 32);
    }
}
