package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ZU  reason: invalid class name */
public abstract class AnonymousClass1ZU extends AnonymousClass1ZT {
    public static final int A03(Comparable comparable, List list, int i) {
        int i2 = 0;
        int size = list.size();
        if (0 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex (");
            sb.append(0);
            sb.append(") is greater than toIndex (");
            sb.append(i);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= size) {
            int i3 = i - 1;
            while (i2 <= i3) {
                int i4 = (i2 + i3) >>> 1;
                int A00 = C40151uF.A00((Comparable) list.get(i4), comparable);
                if (A00 < 0) {
                    i2 = i4 + 1;
                } else if (A00 <= 0) {
                    return i4;
                } else {
                    i3 = i4 - 1;
                }
            }
            return -(i2 + 1);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toIndex (");
            sb2.append(i);
            sb2.append(") is greater than size (");
            sb2.append(size);
            sb2.append(").");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public static final int A04(List list) {
        C18070vi.A0d(list, 0);
        return list.size() - 1;
    }

    public static final ArrayList A05(Object... objArr) {
        return new ArrayList(new AnonymousClass1ZV(objArr, true));
    }

    public static final ArrayList A06(Object... objArr) {
        C18070vi.A0d(objArr, 0);
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new AnonymousClass1ZV(objArr, true));
    }

    public static final List A07(List list) {
        int size = list.size();
        if (size == 0) {
            return C18460wS.A00;
        }
        if (size != 1) {
            return list;
        }
        List singletonList = Collections.singletonList(list.get(0));
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final void A0A() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A0B() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final List A08(Object... objArr) {
        List asList = Arrays.asList(objArr);
        C18070vi.A0X(asList);
        return asList;
    }

    public static final C18460wS A09() {
        return C18460wS.A00;
    }
}
