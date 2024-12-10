package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.6ve  reason: invalid class name and case insensitive filesystem */
public abstract class C137556ve {
    public static final int[][] A00 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};

    public static final float[] A00(float[] fArr, int i, int i2) {
        int i3;
        int i4;
        Object next;
        Number number;
        float[] fArr2 = fArr;
        HashMap A11 = C17880vN.A11();
        int length = fArr2.length;
        int[] iArr = new int[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i5 >= i4) {
                break;
            }
            for (int i7 = 0; i7 < i3; i7++) {
                if (!zArr[(i5 * i) + i7]) {
                    float f = 0.0f;
                    if (fArr2[(i5 * i) + i7] != 0.0f) {
                        Stack stack = new Stack();
                        C17890vO.A1D(stack, (i5 * i) + i7);
                        i6++;
                        while (!stack.isEmpty()) {
                            int A03 = AnonymousClass3MY.A03((Number) stack.pop());
                            if (A03 < 0 || A03 >= length || zArr[A03] || fArr2[A03] == f) {
                                f = 0.0f;
                            } else {
                                zArr[A03] = true;
                                iArr[A03] = i6;
                                Number A1D = C108945cZ.A1D(Integer.valueOf(i6), A11);
                                if (A1D == null) {
                                    A1D = 0;
                                }
                                C17890vO.A0z(Integer.valueOf(i6), A11, A1D.intValue() + 1);
                                int[][] iArr2 = A00;
                                int i8 = 0;
                                do {
                                    int[] iArr3 = iArr2[i8];
                                    stack.push(Integer.valueOf((((A03 / i) + iArr3[0]) * i) + (A03 % i) + iArr3[1]));
                                    i8++;
                                } while (i8 < 4);
                                f = 0.0f;
                            }
                        }
                    }
                }
            }
            i5++;
        }
        Set entrySet = A11.entrySet();
        C18070vi.A0X(entrySet);
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Object value = ((Map.Entry) next).getValue();
                C18070vi.A0X(value);
                int A0M = AnonymousClass000.A0M(value);
                do {
                    Object next2 = it.next();
                    Object value2 = ((Map.Entry) next2).getValue();
                    C18070vi.A0X(value2);
                    int A0M2 = AnonymousClass000.A0M(value2);
                    if (A0M < A0M2) {
                        next = next2;
                        A0M = A0M2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (!(entry == null || (number = (Number) entry.getKey()) == null)) {
            int intValue = number.intValue();
            fArr2 = new float[length];
            for (int i9 = 0; i9 < i4; i9++) {
                for (int i10 = 0; i10 < i3; i10++) {
                    if (iArr[(i9 * i) + i10] == intValue) {
                        fArr2[(i9 * i) + i10] = 1.0f;
                    }
                }
            }
        }
        return fArr2;
    }
}
