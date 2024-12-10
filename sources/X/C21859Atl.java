package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Atl  reason: case insensitive filesystem */
public final class C21859Atl extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21859Atl(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (string = bundle.getString("call_id")) != null) {
            return string;
        }
        throw AnonymousClass000.A0n("Could not retrieve call id from arguments bundle.");
    }
}
