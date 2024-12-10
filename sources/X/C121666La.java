package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import java.lang.ref.WeakReference;

/* renamed from: X.6La  reason: invalid class name and case insensitive filesystem */
public class C121666La extends A34 {
    public final C27191Vc A00;
    public final AnonymousClass1E7 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        View A0O = C108945cZ.A0O(this.A02);
        if (A0O != null) {
            return this.A00.A04(A0O.getContext(), this.A01, "CatalogHeader.doInBackground", 0.0f, 640, true);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
        if (catalogHeader == null) {
            return;
        }
        if (bitmap == null) {
            catalogHeader.A00.setImageResource(2131231049);
        } else {
            catalogHeader.A00.setImageBitmap(bitmap);
        }
    }

    public C121666La(CatalogHeader catalogHeader, C27191Vc r3, AnonymousClass1E7 r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass3MW.A0z(catalogHeader);
    }
}
