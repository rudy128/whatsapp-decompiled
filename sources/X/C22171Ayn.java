package X;

import android.widget.TextView;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.Ayn  reason: case insensitive filesystem */
public final class C22171Ayn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22171Ayn(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        TextView textView = this.this$0.A05;
        if (textView != null) {
            textView.setText(str);
        }
        return C27621Wu.A00;
    }
}
