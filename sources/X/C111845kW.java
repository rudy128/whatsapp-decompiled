package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;

/* renamed from: X.5kW  reason: invalid class name and case insensitive filesystem */
public final class C111845kW extends C41251w3 {
    public static final C40411uf A01 = new C111565jv(2);
    public final C22821Di A00;

    public C111845kW(C22821Di r3) {
        super(A01);
        this.A00 = r3;
        A0K(true);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113225mk(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625194));
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        int i2;
        C113225mk r72 = (C113225mk) r7;
        C18070vi.A0d(r72, 0);
        C135736sg r3 = (C135736sg) A0U(i);
        C18070vi.A0b(r3);
        C22821Di r2 = this.A00;
        AnonymousClass3Ma.A1N(r3, 0, r2);
        WaImageView waImageView = r72.A01;
        waImageView.setImageResource(r3.A01);
        C90014dO.A00(r72.A00, r2, r3, 21);
        View view = r72.A0H;
        AnonymousClass3MY.A0w(view.getContext(), waImageView, r3.A00);
        boolean z = r3.A03;
        if (z) {
            i2 = AnonymousClass1YL.A00(waImageView.getContext(), 2130971949, 2131103049);
        } else {
            i2 = 2131101222;
        }
        C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3MY.A02(view, i2)), waImageView);
        r72.A02.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public long A0M(int i) {
        return (long) ((C135736sg) A0U(i)).A02.hashCode();
    }
}
