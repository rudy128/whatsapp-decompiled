package X;

import java.io.File;

public final class B3O extends AnonymousClass11G implements C22821Di {
    public static final B3O A00 = new B3O();

    public B3O() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        C18070vi.A0d(file, 0);
        return Boolean.valueOf(file.isFile());
    }
}
