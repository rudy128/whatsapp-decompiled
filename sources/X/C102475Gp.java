package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet;

/* renamed from: X.5Gp  reason: invalid class name and case insensitive filesystem */
public final class C102475Gp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ LinkLongPressBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102475Gp(LinkLongPressBottomSheet linkLongPressBottomSheet) {
        super(0);
        this.this$0 = linkLongPressBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass205 A03;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (A03 = AnonymousClass4aU.A03(bundle, "")) != null) {
            return A03;
        }
        throw AnonymousClass000.A0n("Could not retrieve message key from arguments bundle.");
    }
}
