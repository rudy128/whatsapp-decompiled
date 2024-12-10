package X;

import android.widget.EditText;

/* renamed from: X.Dsi  reason: case insensitive filesystem */
public final class C28173Dsi extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28173Dsi(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        EditText editText = (EditText) obj2;
        C18070vi.A0d(editText, 1);
        C98494rF A00 = C98494rF.A00();
        String str = this.$model.A0I;
        if (!(str == null || str.length() == 0)) {
            D4N d4n = new D4N(editText, str);
            A00.element = d4n;
            this.$controller.A01.A02.add(d4n);
        }
        return new AnonymousClass0I3(new C27805Dlh(this.$controller, A00));
    }
}
