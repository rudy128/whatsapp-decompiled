package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.5dK  reason: invalid class name and case insensitive filesystem */
public class C109365dK extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public C109365dK(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onChanged() {
        this.A00.A09();
    }

    public void onInvalidated() {
        this.A00.A09();
    }
}
