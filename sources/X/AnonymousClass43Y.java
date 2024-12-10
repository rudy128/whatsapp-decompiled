package X;

import android.view.View;
import android.widget.TextView;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.43Y  reason: invalid class name */
public final class AnonymousClass43Y extends AnonymousClass4VW {
    public final LinkedHashSet A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43Y(C18000vb r6, C29681ch r7, AnonymousClass4QX r8, AnonymousClass74D r9, AnonymousClass4XM r10, AnonymousClass1K3 r11, long j) {
        super(r6, r7, r8, r9, r10, r11, j);
        int A0G = C72453Mb.A0G(r11, r6, 1);
        C72473Md.A1M(r9, r10, r8, 3);
        C18070vi.A0d(r7, 6);
        C87234Uu[] r2 = new C87234Uu[3];
        r2[0] = C821643h.A04;
        r2[1] = C821643h.A06;
        r2[A0G] = C821643h.A03;
        this.A00 = AnonymousClass1AP.A02(r2);
    }

    public void A02(View.OnClickListener onClickListener, View view, AnonymousClass1FU r10, AnonymousClass3VG r11) {
        Float f;
        C18070vi.A0d(r10, 0);
        C18070vi.A0o(view, r11, onClickListener);
        super.A02(onClickListener, view, r10, r11);
        C87234Uu r0 = C821643h.A04;
        AnonymousClass5W1 r1 = AnonymousClass5W1.A00;
        int A0B = C72463Mc.A0B(r11.A0T(r0, r1));
        Integer A0T = r11.A0T(C821643h.A06, r1);
        List A0U = r11.A0U(C821643h.A03);
        Integer valueOf = Integer.valueOf(A0B);
        if (valueOf == null || A0T == null || valueOf.equals(A0T) || !AnonymousClass3VG.A04(r11)) {
            f = null;
        } else {
            int intValue = A0T.intValue();
            f = Float.valueOf(((float) intValue) / ((float) (A0B - intValue)));
        }
        C17880vN.A0E(view, 2131431671).setText(this.A02.A0L().format(valueOf));
        TextView A0E = C17880vN.A0E(view, 2131431669);
        if (f == null) {
            C18070vi.A0b(A0E);
            A0E.setVisibility(8);
        } else {
            C18070vi.A0b(A0E);
            A0E.setVisibility(0);
            A0E.setText(A01(AnonymousClass3MY.A04(A0E), f.floatValue(), 2131892697));
        }
        A04(view, A0U, A0B);
    }
}
