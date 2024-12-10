package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.4gJ  reason: invalid class name and case insensitive filesystem */
public class C91824gJ implements C23521Gp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4aN A01;
    public final /* synthetic */ C18000vb A02;
    public final /* synthetic */ C18010vc A03;

    public void Bzw(int i) {
        if (i == 1 || i == 0) {
            int i2 = AnonymousClass4aN.A0X;
        }
    }

    public void Bzx(int i, float f, int i2) {
    }

    public C91824gJ(Context context, AnonymousClass4aN r2, C18000vb r3, C18010vc r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A03 = r4;
    }

    public void Bzy(int i) {
        AnonymousClass4aN r2 = this.A01;
        int i2 = AnonymousClass4aN.A0X;
        ViewPager viewPager = r2.A0J;
        View findViewWithTag = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        if (AnonymousClass3MY.A1b(this.A02)) {
            r2.A00 = i;
        } else {
            int length = (r2.A0O.length - 1) - i;
            i = length;
            r2.A00 = length;
        }
        AnonymousClass4aN.A03(r2, i);
        View findViewWithTag2 = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(r2.A0H);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new C90624eN(findViewWithTag2, this, 0));
        }
    }
}
