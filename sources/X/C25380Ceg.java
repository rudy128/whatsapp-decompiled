package X;

import java.util.Random;

/* renamed from: X.Ceg  reason: case insensitive filesystem */
public abstract class C25380Ceg {
    public static final Random A00 = new Random();

    public static final String A00(long j) {
        if (j < 0) {
            throw AnonymousClass000.A0k(C17890vO.A0a("Cannot internalEncode negative integer ", AnonymousClass000.A10(), j));
        } else if (j <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder A10 = AnonymousClass000.A10();
            int i = 0;
            do {
                A10.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j % 64)));
                j >>= 6;
                i++;
            } while (i < 11);
            if (j <= 0) {
                A10.reverse();
                return C18070vi.A0H(A10);
            }
            throw AnonymousClass000.A0k("Number won't fit in string");
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Cannot internalEncode integer ");
            A102.append(j);
            A102.append(" in ");
            A102.append(11);
            throw AnonymousClass001.A12(" chars", A102);
        }
    }
}
