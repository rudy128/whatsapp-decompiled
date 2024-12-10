package X;

import android.os.Parcelable;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.AuN  reason: case insensitive filesystem */
public final class C21897AuN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21897AuN(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable = this.this$0.A15().getParcelable("category_biz_id");
        if (parcelable != null) {
            return parcelable;
        }
        throw C17880vN.A0g();
    }
}
