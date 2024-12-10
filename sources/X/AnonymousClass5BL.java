package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet;

/* renamed from: X.5BL  reason: invalid class name */
public final class AnonymousClass5BL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SMBSuspiciousSenderUrlClickWarningSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BL(SMBSuspiciousSenderUrlClickWarningSheet sMBSuspiciousSenderUrlClickWarningSheet) {
        super(0);
        this.this$0 = sMBSuspiciousSenderUrlClickWarningSheet;
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
