package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class BLl extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 A00;

    public boolean A0f(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BLl(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    public void A1c(C38021qZ r4, int[] iArr) {
        ViewPager2 viewPager2 = this.A00;
        int i = viewPager2.A01;
        if (i == -1) {
            super.A1c(r4, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * i;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public boolean A0g(Bundle bundle, C37931qQ r3, C38021qZ r4, int i) {
        return super.A0g(bundle, r3, r4, i);
    }

    public void A0Z(C26228CvK cvK, C37931qQ r2, C38021qZ r3) {
        super.A0Z(cvK, r2, r3);
    }
}
