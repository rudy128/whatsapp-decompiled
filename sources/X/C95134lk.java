package X;

import java.util.List;

/* renamed from: X.4lk  reason: invalid class name and case insensitive filesystem */
public class C95134lk implements C107265Za {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C102575Gz(this));

    public static final int A00(C95134lk r1, int i) {
        Number number = (Number) AnonymousClass000.A0w(AnonymousClass3MW.A12(r1.A00), i);
        if (number != null) {
            return number.intValue();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unknown actionId ");
        A10.append(i);
        throw AnonymousClass001.A12(". Add it to getSortList().", A10);
    }

    public List A01() {
        Integer[] numArr = new Integer[43];
        AnonymousClass000.A1L(numArr, 35);
        AnonymousClass3MX.A1R(numArr, 1);
        numArr[2] = 39;
        numArr[3] = 2;
        numArr[4] = 3;
        numArr[5] = 41;
        numArr[6] = 42;
        numArr[7] = 43;
        numArr[8] = 19;
        numArr[9] = 20;
        numArr[10] = 4;
        numArr[11] = 26;
        numArr[12] = 44;
        numArr[13] = 37;
        numArr[14] = 40;
        numArr[15] = 21;
        C17880vN.A1T(numArr, 5, 16);
        C17880vN.A1T(numArr, 6, 17);
        C17880vN.A1T(numArr, 7, 18);
        C17880vN.A1T(numArr, 8, 19);
        C17880vN.A1T(numArr, 34, 20);
        numArr[21] = 33;
        numArr[22] = 32;
        C17880vN.A1T(numArr, 9, 23);
        C17880vN.A1T(numArr, 12, 24);
        numArr[25] = 24;
        C17880vN.A1T(numArr, 25, 26);
        numArr[27] = 38;
        numArr[28] = 17;
        numArr[29] = 18;
        C17880vN.A1T(numArr, 10, 30);
        C17880vN.A1T(numArr, 11, 31);
        C17880vN.A1T(numArr, 13, 32);
        numArr[33] = 36;
        numArr[34] = 14;
        C17880vN.A1T(numArr, 31, 35);
        numArr[36] = 15;
        C17880vN.A1T(numArr, 16, 37);
        numArr[38] = 22;
        C17880vN.A1T(numArr, 23, 39);
        numArr[40] = 27;
        C17880vN.A1T(numArr, 28, 41);
        return C18070vi.A0O(30, numArr, 42);
    }

    public C95134lk() {
        Boolean bool = C17960vV.A01;
    }

    public Integer BXA(int i) {
        switch (i) {
            case 8:
            case 21:
            case 34:
                return AnonymousClass00R.A00;
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 18:
            case 22:
            case 23:
            case 26:
            case 27:
            case 30:
            case 31:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return AnonymousClass00R.A0C;
            default:
                return AnonymousClass00R.A01;
        }
    }
}
