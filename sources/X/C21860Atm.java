package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.Atm  reason: case insensitive filesystem */
public final class C21860Atm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallPermissionRequestBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21860Atm(CallPermissionRequestBottomSheet callPermissionRequestBottomSheet) {
        super(0);
        this.this$0 = callPermissionRequestBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.this$0.A06;
        if (bundle == null || (string = bundle.getString("chatjid_raw_params")) == null) {
            throw AnonymousClass000.A0n("Could not retrieve chat jid from arguments bundle.");
        }
        C22931Dv r0 = AnonymousClass1BI.A00;
        return C22931Dv.A01(string);
    }
}
