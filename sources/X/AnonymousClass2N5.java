package X;

import android.content.Context;
import android.graphics.Paint;

/* renamed from: X.2N5  reason: invalid class name */
public final class AnonymousClass2N5 extends C145527Lp {
    public final AnonymousClass12F A00;

    public AnonymousClass2N5(AnonymousClass12F r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public CharSequence BXo(Context context, Paint paint, AnonymousClass206 r6) {
        C18070vi.A0n(context, paint, r6);
        AnonymousClass12F r2 = this.A00;
        String str = ((AnonymousClass24N) r6).A02;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = r2.A00.A00.getString(2131892506);
        }
        C18070vi.A0b(str);
        CharSequence A03 = C72813Np.A03(paint, AnonymousClass12F.A00(context, 2131233379), str);
        C18070vi.A0X(A03);
        return A03;
    }
}
