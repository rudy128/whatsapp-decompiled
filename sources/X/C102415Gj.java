package X;

import com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Gj  reason: invalid class name and case insensitive filesystem */
public final class C102415Gj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ PrivacyInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102415Gj(PrivacyInfoBottomSheet privacyInfoBottomSheet) {
        super(0);
        this.this$0 = privacyInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22941Dw r0 = UserJid.Companion;
        PrivacyInfoBottomSheet privacyInfoBottomSheet = this.this$0;
        UserJid A01 = C22941Dw.A01(privacyInfoBottomSheet.A03);
        if (A01 != null) {
            AnonymousClass00H r02 = privacyInfoBottomSheet.A03;
            if (r02 != null) {
                r02.get();
                privacyInfoBottomSheet.A1k(AnonymousClass1LU.A1B(privacyInfoBottomSheet.A14(), A01));
                privacyInfoBottomSheet.A29();
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
