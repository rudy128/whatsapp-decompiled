package X;

import com.whatsapp.lists.ListsManagerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5O4  reason: invalid class name */
public final class AnonymousClass5O4 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1BI $it;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5O4(AnonymousClass1BI r2, ListsManagerViewModel listsManagerViewModel) {
        super(0);
        this.$it = r2;
        this.this$0 = listsManagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ListsManagerViewModel listsManagerViewModel = this.this$0;
        AnonymousClass1BI r5 = this.$it;
        C72453Mb.A1R(r5);
        AnonymousClass1G4 r4 = listsManagerViewModel.A0B;
        ArrayList A10 = C17880vN.A10(((C88334Zg) r4.getValue()).A01);
        Iterator it = A10.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            AnonymousClass5Y3 r1 = (AnonymousClass5Y3) it.next();
            if ((r1 instanceof C96674oE) && C18070vi.A18(((C96674oE) r1).A00.A0J, r5)) {
                break;
            }
            i++;
        }
        A10.remove(i);
        listsManagerViewModel.A08.add(listsManagerViewModel.A09.remove(i));
        ListsManagerViewModel.A05(listsManagerViewModel, C88334Zg.A00(r4), A10, (List) null, true, true);
        return C27621Wu.A00;
    }
}
