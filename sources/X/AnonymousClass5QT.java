package X;

import com.whatsapp.backup.encryptedbackup.CreatePasskeyBottomSheet;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.5QT  reason: invalid class name */
public final class AnonymousClass5QT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CreatePasskeyBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5QT(CreatePasskeyBottomSheet createPasskeyBottomSheet) {
        super(1);
        this.this$0 = createPasskeyBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        AnonymousClass9MT r5 = (AnonymousClass9MT) obj;
        if (r5 != null) {
            if (r5 instanceof C175348yZ) {
                this.this$0.A28();
            } else if (r5 instanceof C175338yY) {
                CreatePasskeyBottomSheet createPasskeyBottomSheet = this.this$0;
                AnonymousClass9I8 r2 = (AnonymousClass9I8) ((C175338yY) r5).A00;
                C17900vP.A0Z(r2, "encb/EnableDoneFragment/ error: ", AnonymousClass000.A10());
                int ordinal = r2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 2131889781;
                        i2 = 2131889780;
                    } else if (ordinal == 2) {
                        i = 2131889785;
                        i2 = 2131889784;
                    } else if (ordinal == 3) {
                        i = 2131889783;
                        i2 = 2131889782;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                    C73203Rj A04 = AnonymousClass4a6.A04(createPasskeyBottomSheet);
                    A04.A0E(i);
                    A04.A0D(i2);
                    C73203Rj.A06(A04);
                    AnonymousClass3MY.A0L(A04).show();
                    C17900vP.A0j("encb/EnableDoneFragment/encb/CreatePasskeyBottomSheet/error modal shown with message: ", AnonymousClass000.A10(), i2);
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
