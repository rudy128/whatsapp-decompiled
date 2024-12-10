package X;

import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dsy  reason: case insensitive filesystem */
public final class C28188Dsy extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;
    public final /* synthetic */ C22821Di $onStateUpdate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28188Dsy(CTH cth, BTQ btq, C22821Di r4) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
        this.$onStateUpdate = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextInputView textInputView = (TextInputView) obj2;
        C18070vi.A0d(textInputView, 1);
        C98494rF A00 = C98494rF.A00();
        if (this.$model.A0P) {
            D4O d4o = new D4O(textInputView, new C28172Dsh(textInputView, this.$onStateUpdate));
            A00.element = d4o;
            this.$controller.A01.A02.add(d4o);
        }
        return new AnonymousClass0I3(new C27804Dlg(this.$controller, A00));
    }
}
