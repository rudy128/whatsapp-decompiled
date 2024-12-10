package X;

import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4kw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94634kw implements AnonymousClass5ZL {
    public final /* synthetic */ InteractiveMessageButton A00;
    public final /* synthetic */ AnonymousClass206 A01;
    public final /* synthetic */ C20285AEt A02;
    public final /* synthetic */ boolean A03;

    public final void Bn2(int i) {
        String str;
        InteractiveMessageButton interactiveMessageButton = this.A00;
        boolean z = this.A03;
        C20285AEt aEt = this.A02;
        AnonymousClass206 r4 = this.A01;
        if (!z) {
            int i2 = 0;
            if (aEt.A03()) {
                i2 = 5;
            }
            C94854lI A002 = AnonymousClass4GK.A00(r4, Integer.valueOf(i2));
            if (aEt.A06.A03.size() > 1) {
                AnonymousClass3Ma.A0V(interactiveMessageButton).A01(interactiveMessageButton.getContext(), A002, r4, i);
                return;
            }
            if (aEt.A03()) {
                C20941Abv A003 = C60532oB.A00(r4);
                String str2 = null;
                if (A003 != null) {
                    str = A003.A0C;
                } else {
                    str = null;
                }
                AnonymousClass3MW.A0b(interactiveMessageButton.A0C).A06(r4.A0I(), str);
                if (!r4.A0v.A02) {
                    C88654aI A0b = AnonymousClass3MW.A0b(interactiveMessageButton.A0C);
                    UserJid A0I = r4.A0I();
                    if (A003 != null) {
                        str2 = A003.A03;
                    }
                    C88654aI.A02(A0b, A0I, str2, 45);
                }
            }
            AnonymousClass3Ma.A0V(interactiveMessageButton).A00(interactiveMessageButton.getContext(), A002, r4);
        }
    }

    public /* synthetic */ C94634kw(InteractiveMessageButton interactiveMessageButton, AnonymousClass206 r2, C20285AEt aEt, boolean z) {
        this.A00 = interactiveMessageButton;
        this.A03 = z;
        this.A02 = aEt;
        this.A01 = r2;
    }
}
