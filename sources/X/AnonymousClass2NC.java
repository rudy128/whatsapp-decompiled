package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.2NC  reason: invalid class name */
public final class AnonymousClass2NC extends C145527Lp {
    public final AnonymousClass12F A00;

    public AnonymousClass2NC(AnonymousClass12F r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public CharSequence BXo(Context context, Paint paint, AnonymousClass206 r5) {
        String str;
        C445823z r52;
        C18070vi.A0n(context, paint, r5);
        if (!(r5 instanceof C445823z) || (r52 = (C445823z) r5) == null || (str = r52.A06) == null) {
            str = "";
        }
        CharSequence A03 = C72813Np.A03(paint, AnonymousClass12F.A00(context, 2131233223), str);
        C18070vi.A0X(A03);
        return A03;
    }

    public void CFF(View view, AnonymousClass724 r2, AnonymousClass206 r3) {
        C18070vi.A0S(view, r2, r3);
    }
}
