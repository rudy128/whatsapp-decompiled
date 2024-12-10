package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import java.util.Set;

/* renamed from: X.5kP  reason: invalid class name and case insensitive filesystem */
public final class C111775kP extends C41251w3 {
    public Integer A00 = AnonymousClass00R.A00;
    public final Set A01 = C17880vN.A14();
    public final C22821Di A02;
    public final C22821Di A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113335mv(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626056), this, this.A02, this.A03);
    }

    public C111775kP(C22821Di r2, C22821Di r3) {
        super((C40411uf) C111575jw.A00);
        this.A02 = r2;
        this.A03 = r3;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C113335mv r62 = (C113335mv) r6;
        C18070vi.A0d(r62, 0);
        C134486qf r4 = (C134486qf) A0U(i);
        r62.A01.setText(r4.A01);
        ImageButton imageButton = r62.A00;
        int i2 = 8;
        if (this.A00 == AnonymousClass00R.A01) {
            i2 = 0;
        }
        imageButton.setVisibility(i2);
        if (this.A01.contains(r4.A00)) {
            View view = r62.A0H;
            view.setBackgroundColor(AnonymousClass000.A0Y(view).getColor(2131103278));
            return;
        }
        r62.A0H.setBackground((Drawable) null);
    }
}
