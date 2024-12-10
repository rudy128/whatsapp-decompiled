package X;

import com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Gi  reason: invalid class name and case insensitive filesystem */
public final class C102405Gi extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BusinessTransitionInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102405Gi(BusinessTransitionInfoBottomSheet businessTransitionInfoBottomSheet) {
        super(0);
        this.this$0 = businessTransitionInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22941Dw r0 = UserJid.Companion;
        BusinessTransitionInfoBottomSheet businessTransitionInfoBottomSheet = this.this$0;
        UserJid A01 = C22941Dw.A01(businessTransitionInfoBottomSheet.A06);
        if (A01 != null) {
            AnonymousClass00H r02 = businessTransitionInfoBottomSheet.A03;
            if (r02 != null) {
                r02.get();
                businessTransitionInfoBottomSheet.A1k(AnonymousClass1LU.A1B(businessTransitionInfoBottomSheet.A14(), A01));
                businessTransitionInfoBottomSheet.A29();
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
