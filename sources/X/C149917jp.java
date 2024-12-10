package X;

import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel;

/* renamed from: X.7jp  reason: invalid class name and case insensitive filesystem */
public final class C149917jp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ExpressionsTrayView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149917jp(ExpressionsTrayView expressionsTrayView) {
        super(0);
        this.this$0 = expressionsTrayView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1FD A00 = ViewTreeViewModelStoreOwner.A00(this.this$0);
        C18070vi.A0b(A00);
        return AnonymousClass3MW.A0N(A00).A00(ExpressionsTrayViewModel.class);
    }
}
