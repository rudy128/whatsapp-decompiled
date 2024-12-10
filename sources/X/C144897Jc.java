package X;

import com.whatsapp.biz.catalog.CatalogMediaViewFragment;

/* renamed from: X.7Jc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144897Jc implements C1600787a {
    public final /* synthetic */ CatalogMediaViewFragment A00;
    public final /* synthetic */ boolean A01;

    public final void C9F(boolean z) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        boolean z2 = this.A01;
        AnonymousClass1FL A1B = catalogMediaViewFragment.A1B();
        if (A1B != null && z && !A1B.isFinishing() && z2) {
            C122076Mr r0 = catalogMediaViewFragment.A0D;
            if (r0 != null) {
                r0.A0F();
            }
            C122076Mr r02 = catalogMediaViewFragment.A0D;
            if (r02 != null) {
                r02.A0E();
            }
        }
    }

    public /* synthetic */ C144897Jc(CatalogMediaViewFragment catalogMediaViewFragment, boolean z) {
        this.A00 = catalogMediaViewFragment;
        this.A01 = z;
    }
}
