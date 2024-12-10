package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: X.4Py  reason: invalid class name and case insensitive filesystem */
public final class C86044Py {
    public final Context A00;

    public final Drawable A00(boolean z) {
        Context context = this.A00;
        Drawable A002 = C24261Jm.A00(context, 2131233607);
        if (!z) {
            return A002;
        }
        int[][] iArr = {new int[]{16842919}, new int[]{16842908}, new int[0]};
        int[] iArr2 = new int[3];
        C18070vi.A0d(context, 0);
        iArr2[0] = AnonymousClass3Ma.A00(context, 2130972004, 2131103214);
        iArr2[1] = AnonymousClass3Ma.A00(context, 2130972001, 2131103207);
        AnonymousClass3MW.A1O(context, iArr2, 2131103368, 2);
        return new RippleDrawable(new ColorStateList(iArr, iArr2), A002, C24261Jm.A00(context, 2131233608));
    }

    public C86044Py(Context context) {
        this.A00 = context;
    }
}
