package X;

import android.view.View;

/* renamed from: X.DsP  reason: case insensitive filesystem */
public final class C28160DsP extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28160DsP(BTQ btq) {
        super(2);
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C26574D4o d4o;
        View view = (View) obj2;
        C18070vi.A0d(view, 1);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof C26574D4o) {
            d4o = (C26574D4o) onFocusChangeListener;
        } else {
            d4o = null;
        }
        C98494rF A00 = C98494rF.A00();
        if (d4o != null) {
            BTQ btq = this.$model;
            if (!(btq.A0J == null && btq.A0K == null)) {
                C26575D4p d4p = new C26575D4p(btq, 2);
                A00.element = d4p;
                d4o.A00.add(d4p);
            }
        }
        return new AnonymousClass0I3(new C27802Dle(d4o, A00));
    }
}
