package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.1bD  reason: invalid class name and case insensitive filesystem */
public class C28881bD extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public C28881bD(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void onChanged() {
        this.A00.A0E();
    }

    public void onInvalidated() {
        this.A00.A0E();
    }
}
