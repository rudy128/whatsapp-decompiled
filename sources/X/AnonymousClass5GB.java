package X;

import android.os.Bundle;
import com.whatsapp.conversation.ForwardMessagesRouter;
import java.util.ArrayList;

/* renamed from: X.5GB  reason: invalid class name */
public final class AnonymousClass5GB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ForwardMessagesRouter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GB(ForwardMessagesRouter forwardMessagesRouter) {
        super(0);
        this.this$0 = forwardMessagesRouter;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A04;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (A04 = AnonymousClass4aU.A04(bundle)) != null) {
            return A04;
        }
        throw AnonymousClass000.A0n("Could not retrieve message key from arguments bundle.");
    }
}
