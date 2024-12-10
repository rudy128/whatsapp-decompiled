package X;

import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import java.util.List;

/* renamed from: X.5O6  reason: invalid class name */
public final class AnonymousClass5O6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ List $lists;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5O6(ListsHomeViewModel listsHomeViewModel, List list) {
        super(0);
        this.$lists = list;
        this.this$0 = listsHomeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1DT r0;
        int size = this.$lists.size();
        ListsHomeViewModel listsHomeViewModel = this.this$0;
        if (size >= 20) {
            r0 = listsHomeViewModel.A06;
        } else {
            r0 = listsHomeViewModel.A07;
        }
        C72463Mc.A1B(r0);
        return C27621Wu.A00;
    }
}
