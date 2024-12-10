package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.6sK  reason: invalid class name and case insensitive filesystem */
public final class C135516sK {
    public final Context A00;
    public final C18030ve A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C153917qI(this));

    public C135516sK(Context context, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = context;
    }

    public final int A00(Context context) {
        boolean A04 = C25291Nq.A04(this.A01, 9860);
        Resources resources = context.getResources();
        if (A04) {
            return (int) (AnonymousClass3MW.A00(resources, 2131166732) * C72453Mb.A00(this.A02));
        }
        return resources.getDimensionPixelSize(2131166731);
    }

    public final int A01(Context context) {
        boolean A04 = C25291Nq.A04(this.A01, 9860);
        Resources resources = context.getResources();
        if (A04) {
            return (int) (AnonymousClass3MW.A00(resources, 2131166734) * C72453Mb.A00(this.A02));
        }
        return resources.getDimensionPixelSize(2131166733);
    }

    public final int A02(Context context) {
        boolean A04 = C25291Nq.A04(this.A01, 9860);
        Resources resources = context.getResources();
        if (A04) {
            return (int) (AnonymousClass3MW.A00(resources, 2131166737) * C72453Mb.A00(this.A02));
        }
        return resources.getDimensionPixelSize(2131166735);
    }
}
