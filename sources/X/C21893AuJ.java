package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;

/* renamed from: X.AuJ  reason: case insensitive filesystem */
public final class C21893AuJ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21893AuJ(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(0);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        AnonymousClass9VQ r0 = catalogAllCategoryFragment.A02;
        if (r0 != null) {
            return new C20324AGg(catalogAllCategoryFragment, (C20005A2v) r0.A00.A00.A0X.get());
        }
        C18070vi.A11("thumbnailLoaderFactory");
        throw null;
    }
}
