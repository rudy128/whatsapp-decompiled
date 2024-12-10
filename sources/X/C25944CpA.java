package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.CpA  reason: case insensitive filesystem */
public final class C25944CpA {
    public static final byte[] A01 = {3, 0, 8, 0};
    public static final byte[] A02;
    public static final byte[] A03 = {73, 73, 42, 0};
    public static final byte[] A04 = {77, 77, 0, 42};
    public static final byte[] A05 = A00("GIF87a");
    public static final byte[] A06 = A00("GIF89a");
    public static final byte[] A07 = A00("ftyp");
    public static final byte[] A08 = {0, 0, 1, 0};
    public static final byte[] A09 = {-1, -40, -1};
    public static final byte[] A0A = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[][] A0B = {A00("heic"), A00("heix"), A00("hevc"), A00("hevx"), A00("mif1"), A00("msf1")};
    public static final int A0C;
    public final int A00;

    static {
        byte[] A002 = A00("BM");
        A02 = A002;
        A0C = A002.length;
    }

    public static final byte[] A00(String str) {
        try {
            return AnonymousClass8BX.A1a("ASCII", str);
        } catch (UnsupportedEncodingException e) {
            throw BE6.A0o("ASCII not found!", e);
        }
    }

    public C25944CpA() {
        Integer[] numArr = new Integer[9];
        AnonymousClass000.A1L(numArr, 21);
        AnonymousClass000.A1M(numArr, 20);
        AnonymousClass3Ma.A1S(numArr, 3);
        C17890vO.A1G(numArr, 8);
        numArr[4] = 6;
        AnonymousClass3Ma.A1U(numArr, A0C);
        numArr[6] = 4;
        C17890vO.A1I(numArr, 12);
        numArr[8] = 4;
        Integer num = numArr[0];
        int i = 1;
        while (true) {
            Integer num2 = numArr[i];
            num = num.compareTo(num2) < 0 ? num2 : num;
            if (i == 8) {
                break;
            }
            i++;
        }
        if (num != null) {
            this.A00 = num.intValue();
            return;
        }
        throw C17880vN.A0g();
    }
}
