package X;

import java.util.List;

/* renamed from: X.0LA  reason: invalid class name */
public abstract class AnonymousClass0LA {
    public static final void A00(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Index ");
            A10.append(i);
            A10.append(" is out of bounds. The list has ");
            A10.append(size);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0y(" elements.", A10));
        }
    }

    public static final void A01(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Indices are out of order. fromIndex (");
            A10.append(i);
            A10.append(") is greater than toIndex (");
            A10.append(i2);
            throw AnonymousClass001.A12(").", A10);
        } else if (i < 0) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("fromIndex (");
            A102.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0y(") is less than 0.", A102));
        } else if (i2 > size) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("toIndex (");
            A103.append(i2);
            A103.append(") is more than than the list size (");
            throw new IndexOutOfBoundsException(AnonymousClass001.A1L(A103, size));
        }
    }
}
