package X;

import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel$deleteStaticFilter$1;

/* renamed from: X.5Uw  reason: invalid class name and case insensitive filesystem */
public final class C106185Uw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Integer $updateEntryPoint;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106185Uw(ListsHomeViewModel listsHomeViewModel, Integer num) {
        super(1);
        this.this$0 = listsHomeViewModel;
        this.$updateEntryPoint = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C41761x1 r6 = (C41761x1) obj;
        C18070vi.A0d(r6, 0);
        boolean A1O = AnonymousClass000.A1O(r6.A02);
        ListsHomeViewModel listsHomeViewModel = this.this$0;
        if (A1O) {
            Integer num = this.$updateEntryPoint;
            AnonymousClass3MX.A1Q(new ListsHomeViewModel$deleteStaticFilter$1(r6, listsHomeViewModel, num, (C30391dr) null), C41561wd.A00(listsHomeViewModel));
        } else {
            C72463Mc.A1B(listsHomeViewModel.A00);
            this.this$0.A01 = r6;
        }
        return C27621Wu.A00;
    }
}
