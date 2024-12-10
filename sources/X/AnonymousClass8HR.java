package X;

import android.view.ViewGroup;

/* renamed from: X.8HR  reason: invalid class name */
public final class AnonymousClass8HR extends C41251w3 {
    public final C20324AGg A00;
    public final C22821Di A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HR(C20324AGg aGg, C22821Di r3) {
        super((C40411uf) AnonymousClass8HL.A00);
        C18070vi.A0d(aGg, 1);
        this.A00 = aGg;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new C169458lg(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625845, false), this.A00, this.A01);
        }
        if (i == 1) {
            return new C169478li(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625852, false));
        }
        if (i == 6) {
            return new C169488lj(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625837, false), this.A01);
        }
        if (i == 7) {
            return new C42011xT(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625542, false));
        }
        throw AnonymousClass001.A13("Invalid item viewtype: ", AnonymousClass000.A10(), i);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass8IP r22 = (AnonymousClass8IP) r2;
        C18070vi.A0d(r22, 0);
        Object A0U = A0U(i);
        C18070vi.A0X(A0U);
        r22.A0B((AnonymousClass9XB) A0U);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9XB) A0U(i)).A00;
    }
}
