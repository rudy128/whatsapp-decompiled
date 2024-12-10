package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class APF implements C22428B7k {
    public final int A00;
    public final Object A01;

    public APF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Bfl() {
        C20079A6f A04;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            A04 = ((AnonymousClass8FD) obj).A0N.A00.A01;
        } else {
            A04 = BusinessDirectoryContextualSearchViewModel.A04((BusinessDirectoryContextualSearchViewModel) obj);
        }
        return C197639x1.A00(A04);
    }
}
