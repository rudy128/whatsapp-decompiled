package X;

import java.util.Iterator;

/* renamed from: X.4rK  reason: invalid class name and case insensitive filesystem */
public class C98544rK implements Iterable, C18450wR {
    public final int A00;
    public final Object A01;

    public C98544rK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public Iterator iterator() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return AnonymousClass4I0.A00((Object[]) obj);
            case 1:
                return new C99824tW((int[]) obj);
            default:
                return ((AnonymousClass1JQ) obj).iterator();
        }
    }
}
