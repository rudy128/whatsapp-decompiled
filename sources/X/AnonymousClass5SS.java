package X;

import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5SS  reason: invalid class name */
public final class AnonymousClass5SS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AlertCardListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SS(AlertCardListFragment alertCardListFragment) {
        super(1);
        this.this$0 = alertCardListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        AnonymousClass8HX r3 = this.this$0.A01;
        if (r3 == null) {
            C18070vi.A11("alertsListAdapter");
            throw null;
        }
        C18070vi.A0b(iterable);
        ArrayList A0m = C29431cG.A0m(C29431cG.A0s(iterable));
        List list = r3.A01;
        C72473Md.A1B(new AnonymousClass3Vr(list, A0m), r3, A0m, list);
        return C27621Wu.A00;
    }
}
