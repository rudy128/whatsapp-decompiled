package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class APV implements C22435B7r {
    public final int A00;
    public final Object A01;

    public APV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bmy() {
        if (this.A00 != 0) {
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A01;
            businessDirectoryContextualSearchViewModel.A0L.A05(Integer.valueOf(BusinessDirectoryContextualSearchViewModel.A04(businessDirectoryContextualSearchViewModel).A03()), 28, 7);
            return;
        }
        AP5 ap5 = (AP5) this.A01;
        ap5.A09.A03 = 5;
        ap5.A0B();
    }
}
