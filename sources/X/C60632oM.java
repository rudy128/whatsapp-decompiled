package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* renamed from: X.2oM  reason: invalid class name and case insensitive filesystem */
public abstract class C60632oM {
    public static final C29621ca A00(C30971eo r3, byte[] bArr) {
        Object obj;
        Object obj2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            obj = C30971eo.A01(r3, new ByteArrayInputStream(bArr));
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (C29621ca) obj2;
    }

    public static final byte[] A01(C29621ca r1, ByteArrayOutputStream byteArrayOutputStream) {
        Object obj;
        byteArrayOutputStream.reset();
        try {
            AnonymousClass37M.A01(r1, byteArrayOutputStream);
            obj = C27621Wu.A00;
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (C30671eK.A00(obj) != null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
