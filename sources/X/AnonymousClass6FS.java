package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.6FS  reason: invalid class name */
public class AnonymousClass6FS extends AnonymousClass6Fc {
    public C824146n A00;
    public boolean A01;
    public final C37451pZ A02;

    public /* bridge */ /* synthetic */ CharSequence A05(AnonymousClass1E7 r10, AnonymousClass206 r11) {
        String str;
        AnonymousClass218 r112 = (AnonymousClass218) r11;
        if (!(r112 instanceof AnonymousClass219) || (str = ((AnonymousClass219) r112).A03) == null) {
            str = "";
        }
        int i = 2131232017;
        if (r112 instanceof AnonymousClass21B) {
            i = 2131232062;
        }
        Drawable A022 = AnonymousClass4aX.A02(getContext(), i, 2131101888);
        TextPaint paint = this.A01.getPaint();
        AnonymousClass1E7 r5 = r10;
        if (TextUtils.isEmpty(str)) {
            return super.A05(r10, r112);
        }
        CharSequence A03 = C72813Np.A03(paint, A022, "");
        Context context = getContext();
        boolean z = r112.A0v.A02;
        return AnonymousClass25G.A02(context, this.A01, this.A03, this.A06, r5, this.A08, A03, z);
    }

    public AnonymousClass6FS(Context context, C37451pZ r2, C37471pb r3) {
        super(context, r3);
        A03();
        this.A02 = r2;
        A04();
    }

    public void A0A(AnonymousClass218 r2, List list) {
        super.A08(r2, list);
        this.A00.setMessage(r2, list);
    }
}
