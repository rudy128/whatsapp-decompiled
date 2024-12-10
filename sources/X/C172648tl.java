package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;

/* renamed from: X.8tl  reason: invalid class name and case insensitive filesystem */
public final class C172648tl extends C161778Hs {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172648tl(Context context, AnonymousClass1L9 r3, C24921Me r4, C27201Vd r5, AnonymousClass11C r6, AnonymousClass11P r7, C18000vb r8, C18030ve r9, C36401np r10) {
        super(context, r3, r4, r5, r6, r7, r8, r9, r10);
        C18070vi.A0d(r7, 1);
        C72473Md.A1M(r9, r10, r3, 2);
        C18070vi.A0q(r5, r6, r4);
        C18070vi.A0d(r8, 9);
    }

    public void Bmc(C42011xT r5, int i) {
        C18070vi.A0d(r5, 0);
        B5D b5d = (B5D) this.A01.get(i);
        if (b5d instanceof AU9) {
            C162108Iz r52 = (C162108Iz) r5;
            AnonymousClass1E7 r0 = ((AU9) b5d).A01;
            A0U(r0, r52);
            r52.A00.setTag(r0.A0J);
            r52.A07.setVisibility(8);
            r52.A08.setVisibility(8);
            WaTextView waTextView = r52.A03;
            waTextView.setVisibility(0);
            Context context = this.A04;
            AnonymousClass3MX.A1C(context, waTextView, 2131101148);
            AnonymousClass3MY.A0v(context, waTextView, 2131231561);
            waTextView.setText(2131894117);
            return;
        }
        super.Bmc(r5, i);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new C161928Ih(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625503, false), this);
        }
        return super.BqY(viewGroup, i);
    }
}
