package X;

import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.flows.phoenix.viewmodel.FlowsFooterViewModel;

/* renamed from: X.7ky  reason: invalid class name and case insensitive filesystem */
public final class C150617ky extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ FlowsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150617ky(FlowsInitialLoadingView flowsInitialLoadingView) {
        super(0);
        this.this$0 = flowsInitialLoadingView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1FD A00 = ViewTreeViewModelStoreOwner.A00(this.this$0);
        if (A00 != null) {
            return AnonymousClass3MW.A0N(A00).A00(FlowsFooterViewModel.class);
        }
        return null;
    }
}
