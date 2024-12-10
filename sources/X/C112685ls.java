package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CatalogImageListActivity;

/* renamed from: X.5ls  reason: invalid class name and case insensitive filesystem */
public final class C112685ls extends C39711tW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C003401n A03;
    public final /* synthetic */ LinearLayoutManager A04;
    public final /* synthetic */ C112595lj A05;
    public final /* synthetic */ CatalogImageListActivity A06;

    public void A04(RecyclerView recyclerView, int i, int i2) {
        C18070vi.A0d(recyclerView, 0);
        LinearLayoutManager linearLayoutManager = this.A04;
        float f = 1.0f;
        if (linearLayoutManager.A1O() == 0) {
            View A0j = linearLayoutManager.A0j(0);
            if (A0j != null) {
                int top = A0j.getTop();
                int i3 = this.A05.A01;
                f = Math.min(Math.max(0.0f, ((float) (i3 - top)) / ((float) i3)), 1.0f);
            } else {
                throw C17880vN.A0g();
            }
        }
        int i4 = this.A00;
        int i5 = this.A01;
        this.A03.A0N(new ColorDrawable(AnonymousClass1Z2.A03(f, i4, i5)));
        this.A06.getWindow().setStatusBarColor(AnonymousClass1Z2.A03(f, this.A02, i5));
    }

    public C112685ls(C003401n r1, LinearLayoutManager linearLayoutManager, C112595lj r3, CatalogImageListActivity catalogImageListActivity, int i, int i2, int i3) {
        this.A04 = linearLayoutManager;
        this.A05 = r3;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = i3;
        this.A06 = catalogImageListActivity;
    }
}
