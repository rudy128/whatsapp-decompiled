package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.AtY  reason: case insensitive filesystem */
public final class C21846AtY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C218617r $fMessageIO;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21846AtY(C218617r r2) {
        super(0);
        this.$fMessageIO = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            File file = this.$fMessageIO.A08().A0P;
            C218617r.A07(file, false);
            return file.getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
