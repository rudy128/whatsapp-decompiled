package X;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

public final class CYS {
    public final C25171CaN A00;
    public final CharsetDecoder A01;

    public final Object A00(long j) {
        Throwable th;
        try {
            Object obj = C27621Wu.A00;
            Object obj2 = obj;
            if (j >= 0) {
                if (j > 4294967295L) {
                    try {
                        th = new C23913Bs9(j);
                    } catch (Throwable th2) {
                        obj = C108945cZ.A1J(th2);
                    }
                }
                C30691eM.A01(obj2);
                C25171CaN caN = this.A00;
                if (caN.A00 + ((int) j) > caN.A01.length) {
                    throw BE6.A0l("Not enough data.");
                }
                C30691eM.A01(obj);
                Object A02 = this.A00.A02((int) j);
                C30691eM.A01(A02);
                return (byte[]) A02;
            }
            th = new C23912Bs8(j);
            throw th;
        } catch (Throwable th3) {
            return C108945cZ.A1J(th3);
        }
    }

    public CYS(byte[] bArr) {
        this.A00 = new C25171CaN(bArr);
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        this.A01 = newDecoder;
    }

    public final Object A01(long j, boolean z) {
        Object A002;
        Object A003 = A00(j);
        if (!(!(A003 instanceof AnonymousClass1IU))) {
            return A003;
        }
        try {
            String A0H = C18070vi.A0H(this.A01.decode(ByteBuffer.wrap((byte[]) A003)));
            if (!z) {
                return A0H;
            }
            A002 = this.A00.A00();
            if (!(A002 instanceof AnonymousClass1IU)) {
                byte b = ((DSD) A002).A00;
                if ((b & 255) == 0) {
                    A002 = C27621Wu.A00;
                } else {
                    throw new C23911Bs7(b);
                }
            }
            C30691eM.A01(A002);
            return A0H;
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }
}
