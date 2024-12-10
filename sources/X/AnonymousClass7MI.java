package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.List;

/* renamed from: X.7MI  reason: invalid class name */
public class AnonymousClass7MI implements AnonymousClass89O {
    public final int A00;
    public final Object A01;

    public AnonymousClass7MI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bqq() {
        if (this.A00 == 0) {
            AnonymousClass6KP r2 = (AnonymousClass6KP) this.A01;
            List list = C42011xT.A0I;
            C108945cZ.A0a(r2.A06).A0J(new AnonymousClass7RS(r2));
        }
    }

    public /* synthetic */ void CAG(List list, String str) {
        if (this.A00 != 0 && C18070vi.A18(str, "UpdatesViewModel")) {
            UpdatesViewModel.A0M((UpdatesViewModel) this.A01, list);
        }
    }
}
