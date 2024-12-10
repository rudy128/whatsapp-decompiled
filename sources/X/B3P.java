package X;

import java.io.File;

public final class B3P extends AnonymousClass11G implements C22821Di {
    public static final B3P A00 = new B3P();

    public B3P() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        C18070vi.A0d(file, 0);
        return Boolean.valueOf(file.isFile());
    }
}
