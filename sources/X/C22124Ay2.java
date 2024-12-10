package X;

import com.whatsapp.util.Log;

/* renamed from: X.Ay2  reason: case insensitive filesystem */
public final class C22124Ay2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C168578j9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22124Ay2(C168578j9 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        C168578j9 r4 = this.this$0;
        Log.i("CatalogListBaseActivity handleFetchCollectionsResult, fetch business profile");
        C26911Ty r3 = r4.A03;
        if (r3 != null) {
            r3.A0D(new C20471AMi(r4, obj, 4), r4.A4f());
            return C27621Wu.A00;
        }
        C18070vi.A11("businessProfileManager");
        throw null;
    }
}
