package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2p4  reason: invalid class name and case insensitive filesystem */
public abstract class C61072p4 {
    public static SparseArray A00 = new SparseArray();
    public static HashMap A01;

    static {
        HashMap A11 = C17880vN.A11();
        A01 = A11;
        C17890vO.A0z(C19300xz.DEFAULT, A11, 0);
        C17890vO.A0z(C19300xz.VERY_LOW, A01, 1);
        C17890vO.A0z(C19300xz.HIGHEST, A01, 2);
        Iterator A0k = C17890vO.A0k(A01);
        while (A0k.hasNext()) {
            Object next = A0k.next();
            A00.append(AnonymousClass000.A0M(A01.get(next)), next);
        }
    }

    public static int A00(C19300xz r2) {
        Number number = (Number) A01.get(r2);
        if (number != null) {
            return number.intValue();
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1E(r2, "PriorityMapping is missing known Priority value ", AnonymousClass000.A10()));
    }
}
