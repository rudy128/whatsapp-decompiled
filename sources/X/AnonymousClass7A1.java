package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.CatalogImageListActivity;

/* renamed from: X.7A1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7A1 implements AnonymousClass1HE {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ C112595lj A01;
    public final /* synthetic */ CatalogImageListActivity A02;

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r8) {
        CatalogImageListActivity catalogImageListActivity = this.A02;
        C112595lj r4 = this.A01;
        LinearLayoutManager linearLayoutManager = this.A00;
        C18070vi.A0f(linearLayoutManager, 2, r8);
        catalogImageListActivity.A01 = AnonymousClass3MX.A00(catalogImageListActivity.getResources(), 2131165285, r8.A05());
        int A022 = r8.A02();
        int i = catalogImageListActivity.A01;
        r4.A01 = i;
        r4.A00 = A022;
        int i2 = catalogImageListActivity.A00;
        if (i2 > 0) {
            linearLayoutManager.A1a(i2, i);
        }
        return r8;
    }

    public /* synthetic */ AnonymousClass7A1(LinearLayoutManager linearLayoutManager, C112595lj r2, CatalogImageListActivity catalogImageListActivity) {
        this.A02 = catalogImageListActivity;
        this.A01 = r2;
        this.A00 = linearLayoutManager;
    }
}
