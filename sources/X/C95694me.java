package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.instrumentation.ui.InstrumentationAuthActivity;

/* renamed from: X.4me  reason: invalid class name and case insensitive filesystem */
public class C95694me implements C107325Zg {
    public final int A00;
    public final Object A01;

    public C95694me(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Blt(int i) {
        switch (this.A00) {
            case 0:
                EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) this.A01;
                if (i == -1 || i == 4) {
                    EncBackupViewModel encBackupViewModel = encryptionKeyInputFragment.A06;
                    if (encBackupViewModel != null) {
                        encBackupViewModel.A0Y(6);
                        EncBackupViewModel encBackupViewModel2 = encryptionKeyInputFragment.A06;
                        if (encBackupViewModel2 != null) {
                            encBackupViewModel2.A0b(true);
                            return;
                        }
                    }
                    C18070vi.A11("viewModel");
                    throw null;
                }
                return;
            case 1:
                VerifyPasswordFragment.A00((VerifyPasswordFragment) this.A01, i);
                return;
            case 2:
                LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = ((AnonymousClass4RW) this.A01).A03;
                if (i == -1 || i == 4) {
                    LinkedDevicesSharedViewModel.A00(linkedDevicesSharedViewModel);
                    return;
                } else {
                    ((AnonymousClass4Qn) linkedDevicesSharedViewModel.A0V.get()).A00(3);
                    return;
                }
            case 3:
                ((C80633xb) this.A01).A07(i);
                return;
            default:
                InstrumentationAuthActivity.A03((InstrumentationAuthActivity) this.A01, i);
                return;
        }
    }
}
