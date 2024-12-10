package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Atp  reason: case insensitive filesystem */
public final class C21863Atp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21863Atp(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            str = bundle.getString("reply_options_params");
        } else {
            str = null;
        }
        return new C183029Wq(str);
    }
}
