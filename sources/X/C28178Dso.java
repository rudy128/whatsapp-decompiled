package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Dso  reason: case insensitive filesystem */
public final class C28178Dso extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28178Dso(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj2;
        C18070vi.A0d(view, 1);
        Rect rect = this.$model.A00;
        if (rect == null) {
            CUS cus = this.$controller.A03;
            if (cus != null) {
                rect = cus.A0B;
            } else {
                throw C17880vN.A0g();
            }
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return new AnonymousClass0I3(C27878DnF.A00);
    }
}
