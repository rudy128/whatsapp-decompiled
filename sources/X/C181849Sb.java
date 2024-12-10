package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.9Sb  reason: invalid class name and case insensitive filesystem */
public abstract class C181849Sb {
    public static final String A00(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = reader.read(cArr);
            if (read < 0) {
                return C18070vi.A0H(stringWriter);
            }
            stringWriter.write(cArr, 0, read);
        }
    }
}
