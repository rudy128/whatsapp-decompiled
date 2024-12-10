package X;

import android.os.Bundle;
import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;

/* renamed from: X.7i8  reason: invalid class name and case insensitive filesystem */
public final class C148867i8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148867i8(CreateCallLinkBottomSheet createCallLinkBottomSheet) {
        super(0);
        this.this$0 = createCallLinkBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            return C24141Ja.A00(bundle, AnonymousClass1BI.class, "chat_jid");
        }
        return null;
    }
}
