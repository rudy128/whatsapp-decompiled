package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.DFm  reason: case insensitive filesystem */
public final class C26830DFm implements C16890tO {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ E8A A02;

    public C26830DFm(DOZ doz, DFL dfl, E8A e8a) {
        this.A01 = dfl;
        this.A02 = e8a;
        this.A00 = doz;
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C18070vi.A0d(view, 1);
        view.setOnClickListener(new C90084dV(this.A00, this.A01, this.A02, 0));
        return null;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C18070vi.A0d(view, 1);
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
