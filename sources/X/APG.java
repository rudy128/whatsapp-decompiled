package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class APG implements C22429B7l {
    public final int A00;
    public final Object A01;

    public APG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C20079A6f BYh() {
        switch (this.A00) {
            case 0:
                return BusinessDirectoryContextualSearchViewModel.A04((BusinessDirectoryContextualSearchViewModel) this.A01);
            case 1:
                AnonymousClass8FG r1 = (AnonymousClass8FG) this.A01;
                C18070vi.A0d(r1, 0);
                return r1.A05;
            default:
                return ((AnonymousClass8FD) this.A01).A0N.A00.A01;
        }
    }
}
