package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7CV  reason: invalid class name */
public class AnonymousClass7CV implements B7H {
    public boolean A00;
    public final int A01 = 1;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7CV(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i) {
        this.A04 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A02 = i;
    }

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        String str;
        if (this.A01 != 0) {
            C18070vi.A0d(bitmap, 1);
            if (this.A00) {
                CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this.A04;
                C144917Je r1 = new C144917Je(bitmap, catalogMediaViewFragment, (PhotoView) this.A03);
                if (!catalogMediaViewFragment.A0F) {
                    r1.C9F(true);
                    return;
                } else {
                    catalogMediaViewFragment.A0A = r1;
                    return;
                }
            } else {
                this.A00 = true;
                ((PhotoView) this.A03).A0A(bitmap);
                CatalogMediaViewFragment catalogMediaViewFragment2 = (CatalogMediaViewFragment) this.A04;
                C20287AEv aEv = catalogMediaViewFragment2.A04;
                if (aEv != null) {
                    if (C18070vi.A18(A1M.A00(aEv.A0H, this.A02), catalogMediaViewFragment2.A0F)) {
                        AnonymousClass1KB r2 = catalogMediaViewFragment2.A03;
                        if (r2 != null) {
                            r2.A0J(new C21424Ajr(catalogMediaViewFragment2, 31));
                            return;
                        }
                        str = "globalUI";
                        C18070vi.A11(str);
                        throw null;
                    }
                    return;
                }
            }
        } else {
            CatalogMediaViewFragment catalogMediaViewFragment3 = (CatalogMediaViewFragment) this.A04;
            int i = this.A02;
            boolean z2 = this.A00;
            C18070vi.A0d(bitmap, 5);
            ((PhotoView) this.A03).A0A(bitmap);
            C20287AEv aEv2 = catalogMediaViewFragment3.A04;
            if (aEv2 != null) {
                if (C18070vi.A18(A1M.A00(aEv2.A0H, i), catalogMediaViewFragment3.A0F)) {
                    AnonymousClass1KB r22 = catalogMediaViewFragment3.A03;
                    if (r22 != null) {
                        r22.A0J(new C21424Ajr(catalogMediaViewFragment3, 30));
                        C144897Jc r12 = new C144897Jc(catalogMediaViewFragment3, z2);
                        if (!catalogMediaViewFragment3.A0F) {
                            r12.C9F(true);
                            return;
                        } else {
                            catalogMediaViewFragment3.A0A = r12;
                            return;
                        }
                    }
                    str = "globalUI";
                    C18070vi.A11(str);
                    throw null;
                }
                return;
            }
        }
        str = "product";
        C18070vi.A11(str);
        throw null;
    }

    public AnonymousClass7CV(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i, boolean z) {
        this.A03 = photoView;
        this.A04 = catalogMediaViewFragment;
        this.A02 = i;
        this.A00 = z;
    }
}
