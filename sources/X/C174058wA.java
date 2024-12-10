package X;

import java.util.Arrays;

/* renamed from: X.8wA  reason: invalid class name and case insensitive filesystem */
public abstract class C174058wA extends C174358we {
    public final int A00;
    public final C22419B7b A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C174058wA r5 = (C174058wA) obj;
            return this.A00 == r5.A00 && this.A01 == r5.A01;
        }
        return false;
    }

    public C174058wA(C22419B7b b7b, Integer num, int i) {
        super(num.intValue());
        this.A00 = i;
        this.A01 = b7b;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
