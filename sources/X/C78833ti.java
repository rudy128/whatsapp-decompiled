package X;

import com.whatsapp.Conversation;

/* renamed from: X.3ti  reason: invalid class name and case insensitive filesystem */
public abstract class C78833ti extends AnonymousClass3uU {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            Conversation conversation = (Conversation) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0O = AnonymousClass3MZ.A0O(r4, conversation);
            C72483Me.A0q(A0O, conversation);
            AnonymousClass10G r1 = A0O.A00;
            AnonymousClass1FB.A0K(A0O, r1, conversation, r1.A45);
            AnonymousClass1FB.A0L(A0O, r1, conversation, r1.A5A);
            conversation.A00 = C000200d.A00(r4.A63);
            conversation.A06 = AnonymousClass3Ma.A0d(A0O);
            conversation.A07 = AnonymousClass3MZ.A0o(A0O);
            conversation.A02 = AnonymousClass3Ma.A0S(A0O);
            conversation.A05 = (C29831cw) A0O.A9c.get();
            conversation.A00 = (C131296kr) r4.A17.get();
            conversation.A01 = (C85884Pc) r4.A3Q.get();
        }
    }

    public C78833ti() {
        C90994ey.A00(this, 0);
    }
}
