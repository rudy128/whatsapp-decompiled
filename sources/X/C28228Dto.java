package X;

import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dto  reason: case insensitive filesystem */
public final class C28228Dto extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $this_toTextInputModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28228Dto(DOZ doz, DFL dfl) {
        super(3);
        this.$this_toTextInputModel = dfl;
        this.$bloksContext = doz;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        C18070vi.A0d(obj, 0);
        boolean z = false;
        if (obj instanceof TextInputView) {
            C20046A4p a4p = new C20046A4p();
            a4p.A03(this.$this_toTextInputModel, 0);
            C199029zJ A0R = BE7.A0R(a4p, this.$bloksContext, 1);
            DFL dfl = this.$this_toTextInputModel;
            C25681CkC.A03(this.$bloksContext, dfl, A0R, dfl.A0A(46));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
