package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.D6z  reason: case insensitive filesystem */
public class C26629D6z implements AnonymousClass3LW {
    public final /* synthetic */ ViewPager2 A00;

    public void Bod(View view) {
    }

    public C26629D6z(ViewPager2 viewPager2) {
        this.A00 = viewPager2;
    }

    public void Boc(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw AnonymousClass000.A0n("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
