package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class APN implements C22432B7o {
    public final int A00;
    public final Object A01;

    public APN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Bem() {
        boolean A05;
        if (this.A00 != 0) {
            AnonymousClass8FD r0 = (AnonymousClass8FD) this.A01;
            C197639x1 r1 = r0.A0I;
            C20079A6f a6f = r0.A0N.A00.A01;
            C18030ve r2 = r1.A00.A03;
            if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 1882) && a6f != null) {
                A05 = a6f.A07();
            }
            return false;
        }
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A01;
        C197639x1 r02 = businessDirectoryContextualSearchViewModel.A0O;
        C20079A6f A04 = BusinessDirectoryContextualSearchViewModel.A04(businessDirectoryContextualSearchViewModel);
        C18030ve r12 = r02.A00.A03;
        if (AnonymousClass8BS.A1L(r12)) {
            C18040vf r22 = C18040vf.A02;
            if (C18020vd.A05(r22, r12, 1882) && A04.A07()) {
                C18030ve r13 = businessDirectoryContextualSearchViewModel.A0V.A03;
                if (AnonymousClass8BS.A1L(r13)) {
                    A05 = C18020vd.A05(r22, r13, 2038);
                }
            }
        }
        return false;
        if (!A05) {
            return false;
        }
        return true;
    }
}
