package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Ato  reason: case insensitive filesystem */
public final class C21862Ato extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21862Ato(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
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
