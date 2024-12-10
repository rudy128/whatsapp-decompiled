package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.7kl  reason: invalid class name and case insensitive filesystem */
public final class C150487kl extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ExpressionsSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150487kl(ExpressionsSearchView expressionsSearchView) {
        super(0);
        this.this$0 = expressionsSearchView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A06;
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("arg_search_opener", 0);
        }
        return Integer.valueOf(i);
    }
}
