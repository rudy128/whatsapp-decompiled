package X;

import java.util.Arrays;

public final class B2A extends AnonymousClass11G implements C22821Di {
    public static final B2A A00 = new B2A();

    public B2A() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = Byte.valueOf(byteValue);
        String format = String.format("%02X", Arrays.copyOf(A1a, 1));
        C18070vi.A0X(format);
        return format;
    }
}
