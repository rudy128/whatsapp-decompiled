package X;

import java.util.Arrays;

/* renamed from: X.1u9  reason: invalid class name and case insensitive filesystem */
public abstract class C40091u9 {
    public static final C40081u8 A00;
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        C40081u8 r0 = C40081u8.A02;
        byte[] copyOf = Arrays.copyOf(new byte[0], 0);
        C18070vi.A0T(copyOf);
        A00 = new C40081u8(copyOf);
    }

    public static final C40081u8 A00(String str) {
        C40081u8 r0 = C40081u8.A02;
        byte[] bytes = str.getBytes(C26571Sq.A05);
        C18070vi.A0T(bytes);
        C40081u8 r02 = new C40081u8(bytes);
        r02.A01 = str;
        return r02;
    }
}
