package X;

import java.util.Arrays;

/* renamed from: X.3In  reason: invalid class name and case insensitive filesystem */
public final class C71833In extends AnonymousClass11G implements C22821Di {
    public static final C71833In A00 = new C71833In();

    public C71833In() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        C18070vi.A0X(format);
        return format;
    }
}
