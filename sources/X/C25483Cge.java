package X;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.Cge  reason: case insensitive filesystem */
public class C25483Cge {
    public BlockingDeque A00 = new LinkedBlockingDeque();

    public static String A00(List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (Object A05 : list) {
            long A0L = BE9.A0L(C17880vN.A05(A05));
            while (A0L >= 128) {
                A0L >>= 7;
                A10.append((char) ((int) ((127 & A0L) | 128)));
            }
            A10.append((char) ((int) A0L));
        }
        StringBuilder A0u = BE6.A0u(A10.toString());
        StringBuilder A102 = AnonymousClass000.A10();
        StringBuilder A103 = AnonymousClass000.A10();
        int length = A0u.length() % 3;
        if (length > 0) {
            while (length < 3) {
                A103.append('=');
                A0u.append(0);
                length++;
            }
        }
        for (int i = 0; i < A0u.length(); i += 3) {
            int charAt = (A0u.charAt(i) << 16) + (A0u.charAt(i + 1) << 8) + A0u.charAt(i + 2);
            A102.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 18) & 63));
            A102.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 12) & 63));
            A102.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 6) & 63));
            A102.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(charAt & 63));
        }
        return AnonymousClass001.A1E(A103, A102.substring(0, A102.length() - A103.length()), AnonymousClass000.A10());
    }
}
