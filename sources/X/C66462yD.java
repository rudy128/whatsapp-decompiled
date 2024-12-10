package X;

import java.lang.ref.SoftReference;

/* renamed from: X.2yD  reason: invalid class name and case insensitive filesystem */
public class C66462yD implements C32081gb {
    public final int A00;
    public final Object A01;

    public C66462yD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bsh(boolean z, Object obj, Object obj2, Object obj3) {
        Object obj4;
        if (this.A00 != 0) {
            C32021gV r0 = (C32021gV) this.A01;
            if (z) {
                r0.A06.put(obj, new SoftReference(obj2));
                return;
            }
            return;
        }
        C32081gb r2 = (C32081gb) this.A01;
        C43001z5 r7 = (C43001z5) obj3;
        Object obj5 = ((C43001z5) obj2).A01;
        if (r7 == null) {
            obj4 = null;
        } else {
            obj4 = r7.A01;
        }
        r2.Bsh(z, obj, obj5, obj4);
    }
}
