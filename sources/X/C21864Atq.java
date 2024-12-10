package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Atq  reason: case insensitive filesystem */
public final class C21864Atq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21864Atq(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.this$0.A06;
        if (bundle == null || (string = bundle.getString("user_selected_reply_option_params")) == null) {
            return null;
        }
        return A2Y.A02.A00(C17880vN.A16(string));
    }
}
