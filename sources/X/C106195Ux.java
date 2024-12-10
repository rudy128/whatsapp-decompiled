package X;

import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel$addStaticFilterRow$1;

/* renamed from: X.5Ux  reason: invalid class name and case insensitive filesystem */
public final class C106195Ux extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Integer $updateEntryPoint;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106195Ux(ListsHomeViewModel listsHomeViewModel, Integer num) {
        super(1);
        this.this$0 = listsHomeViewModel;
        this.$updateEntryPoint = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C41761x1 r6 = (C41761x1) obj;
        C18070vi.A0d(r6, 0);
        ListsHomeViewModel listsHomeViewModel = this.this$0;
        Integer num = this.$updateEntryPoint;
        AnonymousClass3MX.A1Q(new ListsHomeViewModel$addStaticFilterRow$1(r6, listsHomeViewModel, num, (C30391dr) null), C41561wd.A00(listsHomeViewModel));
        return C27621Wu.A00;
    }
}
