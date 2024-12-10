package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.4S0  reason: invalid class name */
public final class AnonymousClass4S0 {
    public int A00;
    public int A01;
    public final Context A02;

    public AnonymousClass4S0(Context context, AnonymousClass4CM r5) {
        int i;
        int i2;
        C18070vi.A0e(context, 1, r5);
        this.A02 = context;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            this.A00 = AnonymousClass1YL.A00(context, 2130971941, 2131103042);
            i = 2130971945;
            i2 = 2131103045;
        } else if (ordinal == 1) {
            this.A00 = AnonymousClass1YL.A00(context, 2130971942, 2131103043);
            i = 2130971946;
            i2 = 2131103046;
        } else {
            throw AnonymousClass3MW.A14();
        }
        this.A01 = AnonymousClass1YL.A00(context, i, i2);
    }

    public final Drawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Drawable A022 = C27831Xu.A02(drawable.mutate());
        C18070vi.A0X(A022);
        C27831Xu.A0C(A022, C19740yt.A00(this.A02, 2131103154));
        return A022;
    }

    public final C27801Xq A01() {
        Context context = this.A02;
        float dimension = context.getResources().getDimension(2131169404);
        C28041Yp r1 = new C28041Yp();
        r1.A01(dimension);
        C27801Xq r12 = new C27801Xq(new C28011Ym(r1));
        r12.A0F(C19740yt.A03(context, this.A01));
        return r12;
    }
}
