package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5N7  reason: invalid class name */
public final class AnonymousClass5N7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ List $composingJids;
    public final /* synthetic */ C73133Pz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N7(C73133Pz r2, List list) {
        super(0);
        this.$composingJids = list;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        List list;
        AnonymousClass1BI r0;
        AnonymousClass1E7 r02;
        if (this.$composingJids.size() <= 5) {
            i = this.$composingJids.size();
        } else {
            i = 4;
        }
        int A02 = AnonymousClass3MX.A02(this.$composingJids, i);
        List<C53732d0> A0v = C29431cG.A0v(this.$composingJids, i);
        C73133Pz r3 = this.this$0;
        ArrayList A0D = C29351c6.A0D(A0v);
        for (C53732d0 r03 : A0v) {
            AnonymousClass3MY.A1O(r3.getContactManager(), r03.A01, A0D);
        }
        C73133Pz r2 = this.this$0;
        C63312sr r6 = null;
        if (r2.A01 >= 3) {
            list = C73133Pz.A02(r2.A0O, A0D);
        } else {
            list = null;
        }
        C22941Dw r04 = UserJid.Companion;
        if (list == null || (r02 = (AnonymousClass1E7) C29431cG.A0e(list)) == null) {
            r0 = null;
        } else {
            r0 = r02.A0J;
        }
        UserJid A01 = C22941Dw.A01(r0);
        if (A01 != null) {
            C73133Pz r05 = this.this$0;
            AnonymousClass1MZ groupParticipantsManager = r05.getGroupParticipantsManager();
            AnonymousClass1BI r1 = r05.A0I;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
            r6 = groupParticipantsManager.A05((AnonymousClass1E9) r1, A01);
        }
        this.this$0.getGlobalUI().A0J(new AnonymousClass7Q7(this.this$0, A0D, list, r6, A02, 7));
        return C27621Wu.A00;
    }
}
