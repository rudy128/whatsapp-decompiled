package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.4mm  reason: invalid class name and case insensitive filesystem */
public class C95774mm implements C107345Zi {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C95774mm r5 = (C95774mm) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public Drawable BQt(Context context) {
        Drawable A012 = AnonymousClass03S.A01(context, this.A00);
        if (A012 == null) {
            return null;
        }
        Drawable A02 = C27831Xu.A02(A012);
        int i = this.A01;
        if (i == 2131102055) {
            i = AnonymousClass1YL.A00(context, 2130970666, 2131102055);
        }
        C27831Xu.A0C(A02, context.getResources().getColor(i));
        return A02;
    }

    public C95774mm(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        AnonymousClass000.A1M(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }
}
