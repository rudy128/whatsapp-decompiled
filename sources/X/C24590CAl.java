package X;

import java.nio.ByteBuffer;

/* renamed from: X.CAl  reason: case insensitive filesystem */
public abstract class C24590CAl {
    public static final C25527ChP A00(DNC dnc, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(dnc.A0J((EAO) null));
        C18070vi.A0b(allocateDirect);
        dnc.writeTo(new C24226Bxe(allocateDirect));
        allocateDirect.flip();
        return new C25527ChP(i, allocateDirect);
    }
}
