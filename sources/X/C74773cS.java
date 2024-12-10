package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/* renamed from: X.3cS  reason: invalid class name and case insensitive filesystem */
public class C74773cS extends AnonymousClass290 {
    public final C18000vb A00;
    public final /* synthetic */ AnonymousClass4aN A01;

    public C74773cS(AnonymousClass4aN r1, C18000vb r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A0E() {
        AnonymousClass4aN r1 = this.A01;
        int i = AnonymousClass4aN.A0X;
        return r1.A0O.length;
    }

    public /* bridge */ /* synthetic */ Object A0J(ViewGroup viewGroup, int i) {
        AnonymousClass4aN r4 = this.A01;
        int i2 = AnonymousClass4aN.A0X;
        View A0D = AnonymousClass3MY.A0D(r4.A0B, 2131625186);
        AbsListView absListView = (AbsListView) A0D.findViewById(16908298);
        C18000vb r6 = this.A00;
        if (!AnonymousClass3MY.A1b(r6)) {
            i = (r4.A0O.length - 1) - i;
        }
        C72993Oo[] r5 = r4.A0O;
        if (r5[i] == null) {
            r5[i] = new C72993Oo(r4.A09, r4, r6, i);
        }
        absListView.setAdapter(r5[i]);
        absListView.setEmptyView(A0D.findViewById(16908292));
        AnonymousClass3MY.A19(absListView, i);
        if (i == r4.A00) {
            absListView.setOnScrollListener(r4.A0H);
        }
        viewGroup.addView(A0D, 0);
        return A0D;
    }

    public /* bridge */ /* synthetic */ void A0K(ViewGroup viewGroup, Object obj, int i) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((AbsListView) view.findViewById(16908298)).setOnScrollListener((AbsListView.OnScrollListener) null);
    }

    public /* bridge */ /* synthetic */ boolean A0L(View view, Object obj) {
        return AnonymousClass000.A1Z(view, obj);
    }
}
