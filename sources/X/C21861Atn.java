package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Atn  reason: case insensitive filesystem */
public final class C21861Atn extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21861Atn(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            z = bundle.getBoolean("is_outgoing_call_missed_params");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
