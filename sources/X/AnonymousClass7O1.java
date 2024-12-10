package X;

import android.view.View;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7O1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7O1 implements AnonymousClass88T {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CatalogMediaViewFragment A01;
    public final /* synthetic */ PhotoView A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.A7D, java.lang.Object] */
    public final void CA3() {
        String str;
        View view = this.A00;
        PhotoView photoView = this.A02;
        CatalogMediaViewFragment catalogMediaViewFragment = this.A01;
        view.setVisibility(8);
        photoView.setVisibility(8);
        ? obj = new Object();
        C109005cf.A0k(catalogMediaViewFragment, obj);
        C20287AEv aEv = catalogMediaViewFragment.A04;
        if (aEv == null) {
            str = "product";
        } else {
            obj.A0H = aEv.A0H;
            obj.A00 = catalogMediaViewFragment.A0B;
            obj.A06 = 50;
            obj.A04 = 90;
            A8Q a8q = catalogMediaViewFragment.A05;
            if (a8q != null) {
                a8q.A09(obj);
                return;
            }
            str = "catalogAnalyticManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ AnonymousClass7O1(View view, CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView) {
        this.A00 = view;
        this.A02 = photoView;
        this.A01 = catalogMediaViewFragment;
    }
}
