package X;

import java.io.IOException;

/* renamed from: X.AtZ  reason: case insensitive filesystem */
public final class C21847AtZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C218617r $fMessageIO;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21847AtZ(C218617r r2) {
        super(0);
        this.$fMessageIO = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            return this.$fMessageIO.A08().A0Q.getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
