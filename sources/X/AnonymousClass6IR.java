package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.6IR  reason: invalid class name */
public class AnonymousClass6IR extends AnonymousClass4ZN {
    public final int A00;
    public final Object[] A01;

    public AnonymousClass6IR(Object[] objArr, int i) {
        C18070vi.A0d(objArr, 2);
        this.A00 = i;
        this.A01 = objArr;
    }

    public CharSequence A03(Context context) {
        C18070vi.A0d(context, 0);
        ArrayList A0z = C17880vN.A0z(r4);
        for (Object obj : this.A01) {
            if (obj instanceof AnonymousClass4ZN) {
                obj = ((AnonymousClass4ZN) obj).A03(context);
            }
            A0z.add(obj);
        }
        String string = context.getResources().getString(this.A00, A0z.toArray(new Object[0]));
        C18070vi.A0X(string);
        return string;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass6IR r4 = (AnonymousClass6IR) obj;
            if (this.A00 != r4.A00 || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((217 + this.A00) * 31) + Arrays.hashCode(this.A01);
    }
}
