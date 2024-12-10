package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet;

/* renamed from: X.5Gs  reason: invalid class name and case insensitive filesystem */
public final class C102505Gs extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ LinkLongPressBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102505Gs(LinkLongPressBottomSheet linkLongPressBottomSheet) {
        super(0);
        this.this$0 = linkLongPressBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            z = bundle.getBoolean("arg-should-show-suspicious-banner-on-link-open");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
