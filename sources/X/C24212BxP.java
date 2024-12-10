package X;

import java.io.IOException;

/* renamed from: X.BxP  reason: case insensitive filesystem */
public class C24212BxP extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C24212BxP(String str, Throwable th) {
        super(AnonymousClass001.A1H("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str, AnonymousClass000.A10()), th);
    }

    public C24212BxP(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C24212BxP() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
