package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6xz  reason: invalid class name and case insensitive filesystem */
public final class C138966xz {
    public final String A00 = C108985cd.A0f();
    public final List A01 = AnonymousClass000.A13();
    public final Map A02 = C17880vN.A13();

    public static final String A00(String str) {
        return AnonymousClass1YE.A07(AnonymousClass1YE.A07(str, "\\", "\\\\", false), "\"", "\\\"", false);
    }

    public final byte[] A01() {
        String obj;
        ByteArrayOutputStream A15 = C108945cZ.A15();
        byte[] bArr = {13, 10};
        for (C134356qS r9 : this.A01) {
            String A1H = AnonymousClass001.A1H(this.A00, "\r\n", AnonymousClass000.A11("--"));
            Charset charset = C26571Sq.A05;
            A15.write(C18070vi.A1A(A1H, charset));
            String A002 = A00("events");
            if ("events.gz".length() == 0) {
                obj = C17900vP.A0H("Content-Disposition: form-data; name=\"", A002, "\"\r\n").toString();
            } else {
                String A003 = A00("events.gz");
                StringBuilder A11 = AnonymousClass000.A11("Content-Disposition: form-data; name=\"");
                A11.append(A002);
                C17890vO.A10("\"; filename=\"", A003, "\"\r\n", A11);
                obj = A11.toString();
            }
            A15.write(C18070vi.A1A(obj, charset));
            String[] strArr = new String[2];
            strArr[0] = "Content-Type: application/x-gzip";
            Iterator it = C18070vi.A0O("Content-Encoding: gzip", strArr, 1).iterator();
            while (it.hasNext()) {
                A15.write(C18070vi.A1A(C17900vP.A0A(C17880vN.A0v(it), "\r\n"), charset));
            }
            A15.write(bArr);
            InputStream inputStream = r9.A00;
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                A15.write(bArr2, 0, read);
            }
            A15.write(bArr);
        }
        Iterator A152 = AnonymousClass000.A15(this.A02);
        while (A152.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A152);
            String A004 = A00(C17880vN.A0x(A16));
            String A1H2 = AnonymousClass001.A1H(this.A00, "\r\n", AnonymousClass000.A11("--"));
            Charset charset2 = C26571Sq.A05;
            A15.write(C18070vi.A1A(A1H2, charset2));
            StringBuilder A112 = AnonymousClass000.A11("Content-Disposition: form-data; name=\"");
            A112.append(A004);
            A15.write(C18070vi.A1A(AnonymousClass000.A0y("\"\r\n\r\n", A112), charset2));
            A15.write(C18070vi.A1A((String) A16.getValue(), charset2));
            A15.write(bArr);
        }
        StringBuilder A113 = AnonymousClass000.A11("--");
        A113.append(this.A00);
        A15.write(C108975cc.A1O(AnonymousClass000.A0y("--\r\n", A113)));
        byte[] byteArray = A15.toByteArray();
        C18070vi.A0X(byteArray);
        return byteArray;
    }
}
