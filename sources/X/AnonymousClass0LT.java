package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.0LT  reason: invalid class name */
public abstract class AnonymousClass0LT {
    public static final String A00(C17130tn r1, int i) {
        r1.BFh(AnonymousClass0PK.A00);
        return ((Context) r1.BFh(AnonymousClass0PK.A01)).getResources().getString(i);
    }

    public static final String A01(C17130tn r1, Object[] objArr, int i) {
        r1.BFh(AnonymousClass0PK.A00);
        return ((Context) r1.BFh(AnonymousClass0PK.A01)).getResources().getString(i, Arrays.copyOf(objArr, 1));
    }
}
