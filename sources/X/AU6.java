package X;

import com.whatsapp.conversation.conversationrow.components.contextcard.AddMembersButtonViewModel$refreshButtonVisibilityAsync$1;
import com.whatsapp.quickcontact.QuickContactActivity;

public class AU6 implements AnonymousClass3L6 {
    public final int A00;
    public final Object A01;

    public AU6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BvL(AnonymousClass1BI r5) {
        switch (this.A00) {
            case 0:
                C161548Fr r3 = (C161548Fr) this.A01;
                C18070vi.A0d(r3, 0);
                if (C18070vi.A18(r5, r3.A03)) {
                    AnonymousClass3MX.A1Q(new AddMembersButtonViewModel$refreshButtonVisibilityAsync$1(r3, (C30391dr) null), C41561wd.A00(r3));
                    return;
                }
                return;
            case 1:
                AnonymousClass97G r1 = (AnonymousClass97G) this.A01;
                AnonymousClass1E7 r0 = r1.A09;
                if (r0 != null) {
                    AnonymousClass1BI r02 = r0.A0J;
                    C17960vV.A07(r02);
                    if (r02.equals(r5)) {
                        r1.A2X();
                        return;
                    }
                    return;
                }
                return;
            default:
                A5G.A01((QuickContactActivity) this.A01);
                return;
        }
    }
}
