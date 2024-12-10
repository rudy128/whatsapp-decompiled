package X;

import com.whatsapp.backup.encryptedbackup.EnableInfoFragment;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.5QW  reason: invalid class name */
public final class AnonymousClass5QW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EnableInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5QW(EnableInfoFragment enableInfoFragment) {
        super(1);
        this.this$0 = enableInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        AnonymousClass9MT r5 = (AnonymousClass9MT) obj;
        if (r5 != null) {
            if (!(r5 instanceof C175348yZ) && (r5 instanceof C175338yY)) {
                EnableInfoFragment enableInfoFragment = this.this$0;
                AnonymousClass9II r2 = (AnonymousClass9II) ((C175338yY) r5).A00;
                C17900vP.A0Z(r2, "encb/EnableDoneFragment/ error: ", AnonymousClass000.A10());
                int ordinal = r2.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 1) {
                        i = 2131889859;
                        i2 = 2131889858;
                    } else if (ordinal == 2) {
                        i = 2131889865;
                        i2 = 2131889864;
                    } else if (ordinal == 4) {
                        i = 2131889863;
                        i2 = 2131889862;
                    } else if (ordinal == 5) {
                        i = 2131889861;
                        i2 = 2131889860;
                    }
                    C73203Rj A04 = AnonymousClass4a6.A04(enableInfoFragment);
                    A04.A0E(i);
                    A04.A0D(i2);
                    C73203Rj.A06(A04);
                    AnonymousClass3MY.A0L(A04).show();
                    C17900vP.A0j("encb/EnableDoneFragment/error modal shown with message: ", AnonymousClass000.A10(), i2);
                } else {
                    new WDSBottomSheetDialogFragment().A2C(enableInfoFragment.A1F(), "encb/CreatePasskeyBottomSheet");
                }
            }
            EncBackupViewModel encBackupViewModel = this.this$0.A00;
            if (encBackupViewModel != null) {
                encBackupViewModel.A0C.A0E((Object) null);
            } else {
                AnonymousClass3MW.A1H();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
