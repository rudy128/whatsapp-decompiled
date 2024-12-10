package X;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public abstract class A3O {
    public static final int A00(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i != 4) {
            return 3;
        }
        return 2;
    }

    public static final int A01(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 9;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 10;
        }
        throw AnonymousClass8BX.A0W("Unexpected status value: ", AnonymousClass000.A10(), i);
    }

    public static final int A02(Exception exc) {
        if (exc instanceof IOException) {
            return 4;
        }
        if (exc instanceof NoSuchAlgorithmException) {
            return 7;
        }
        if (exc instanceof InvalidKeyException) {
            return 5;
        }
        if (exc instanceof InvalidAlgorithmParameterException) {
            return 6;
        }
        if (exc instanceof NoSuchPaddingException) {
            return 8;
        }
        if (exc instanceof C18130vo) {
            return 9;
        }
        return 1;
    }
}
