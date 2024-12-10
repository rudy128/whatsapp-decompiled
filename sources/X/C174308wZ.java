package X;

import java.util.AbstractCollection;

/* renamed from: X.8wZ  reason: invalid class name and case insensitive filesystem */
public class C174308wZ extends C174358we {
    public final int A00;
    public final C22557BCq A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((C174308wZ) obj).A00;
        }
        return true;
    }

    public C174308wZ(C22557BCq bCq, int i) {
        super(16);
        this.A00 = i;
        this.A01 = bCq;
    }

    public static void A00(C22557BCq bCq, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C174308wZ(bCq, i));
    }
}
