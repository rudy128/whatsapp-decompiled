package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.6IS  reason: invalid class name */
public final class AnonymousClass6IS extends AnonymousClass4ZN {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public AnonymousClass6IS(Object[] objArr, int i, int i2) {
        C18070vi.A0d(objArr, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }

    public /* bridge */ /* synthetic */ CharSequence A03(Context context) {
        C18070vi.A0d(context, 0);
        ArrayList A0z = C17880vN.A0z(r4);
        for (Object obj : this.A02) {
            if (obj instanceof AnonymousClass4ZN) {
                obj = ((AnonymousClass4ZN) obj).A03(context);
            }
            A0z.add(obj);
        }
        String quantityString = context.getResources().getQuantityString(this.A01, this.A00, A0z.toArray(new Object[0]));
        C18070vi.A0X(quantityString);
        return quantityString;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6IS)) {
            return false;
        }
        AnonymousClass6IS r4 = (AnonymousClass6IS) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && Arrays.equals(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A01);
        AnonymousClass000.A1M(A1b, this.A00);
        return (Arrays.hashCode(A1b) * 31) + Arrays.hashCode(this.A02);
    }
}
