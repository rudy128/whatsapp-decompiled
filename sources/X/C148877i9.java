package X;

import android.os.Bundle;
import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;

/* renamed from: X.7i9  reason: invalid class name and case insensitive filesystem */
public final class C148877i9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148877i9(CreateCallLinkBottomSheet createCallLinkBottomSheet) {
        super(0);
        this.this$0 = createCallLinkBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            return Boolean.valueOf(bundle.getBoolean("invoke_from_chat", false));
        }
        throw AnonymousClass000.A0n("invoke from chat is null");
    }
}
