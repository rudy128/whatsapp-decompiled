package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;

/* renamed from: X.80u  reason: invalid class name and case insensitive filesystem */
public final class C1584680u extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1584680u(ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        UserJid A00 = C22941Dw.A00((Jid) obj);
        if (A00 != null) {
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = this.this$0;
            AnonymousClass1MZ r1 = reactionsBottomSheetDialogFragment.A0E;
            if (r1 != null) {
                C36321nh r0 = GroupJid.Companion;
                AnonymousClass1BI r02 = reactionsBottomSheetDialogFragment.A0I;
                if (r02 == null) {
                    str = "chatJid";
                } else {
                    AnonymousClass7AS.A00(this.this$0.A1G(), r1.A03(A00, C36321nh.A00(r02)), new C1584580t(this.this$0), 10);
                }
            } else {
                str = "groupParticipantsManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
