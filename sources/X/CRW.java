package X;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

public final class CRW {
    public E57 A00;
    public final C24276ByZ A01;
    public final OutputStream A02;
    public final WritableByteChannel A03;

    public CRW(E57 e57, C24276ByZ byZ, OutputStream outputStream, WritableByteChannel writableByteChannel) {
        C18070vi.A0f(outputStream, 1, byZ);
        this.A02 = outputStream;
        this.A03 = writableByteChannel;
        this.A00 = e57;
        this.A01 = byZ;
    }
}
