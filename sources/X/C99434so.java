package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4so  reason: invalid class name and case insensitive filesystem */
public class C99434so implements AnonymousClass1JQ {
    public final int A00;
    public final Object A01;

    public C99434so(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Iterator A00(Object obj, int i) {
        return new C99434so(obj, i).iterator();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.1dr, java.util.Iterator, X.Akx, java.lang.Object] */
    public Iterator iterator() {
        switch (this.A00) {
            case 0:
                return new C99034s9(this.A01, 0);
            case 1:
                return new C99034s9(this.A01, 1);
            case 2:
                return new C99024s8(A00(this.A01, 1), C106225Va.A00);
            case 3:
                return AnonymousClass4I0.A00((Object[]) this.A01);
            case 4:
                return ((Iterable) this.A01).iterator();
            case 5:
                ? obj = new Object();
                obj.A01 = C30581eB.A01(obj, obj, (AnonymousClass1OS) this.A01);
                return obj;
            case 6:
                return (Iterator) this.A01;
            default:
                List A07 = AnonymousClass1b2.A07((AnonymousClass1JQ) this.A01);
                C29391cC.A0G(A07);
                return A07.iterator();
        }
    }
}
