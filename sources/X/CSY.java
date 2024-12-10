package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public final class CSY {
    public E57 A00;
    public final C25057CVn A01;
    public final C24276ByZ A02;
    public final InputStream A03;
    public final ReadableByteChannel A04;

    public CSY(C25057CVn cVn, E57 e57, C24276ByZ byZ, InputStream inputStream, ReadableByteChannel readableByteChannel) {
        C18070vi.A0g(inputStream, 2, byZ);
        this.A01 = cVn;
        this.A03 = inputStream;
        this.A04 = readableByteChannel;
        this.A00 = e57;
        this.A02 = byZ;
    }
}
