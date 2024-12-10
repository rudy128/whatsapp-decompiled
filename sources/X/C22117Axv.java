package X;

import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;

/* renamed from: X.Axv  reason: case insensitive filesystem */
public final class C22117Axv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22117Axv(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        WaTextView waTextView = this.this$0.A04;
        if (waTextView != null) {
            waTextView.setText(str);
        }
        return C27621Wu.A00;
    }
}
