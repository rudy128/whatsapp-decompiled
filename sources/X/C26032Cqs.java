package X;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* renamed from: X.Cqs  reason: case insensitive filesystem */
public final class C26032Cqs {
    public final C25171CaN A00;
    public final CharsetDecoder A01;

    public C26032Cqs(byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A00 = new C25171CaN(bArr);
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        this.A01 = newDecoder;
    }

    public static final Object A01(long j) {
        Throwable th;
        C27621Wu r3 = C27621Wu.A00;
        if (j < 0) {
            th = new C23927BsN(j);
        } else if (j <= 4294967295L) {
            return r3;
        } else {
            try {
                th = new C23928BsO(j);
            } catch (Throwable th2) {
                return C108945cZ.A1J(th2);
            }
        }
        throw th;
    }

    public final Long A02() {
        C25171CaN caN = this.A00;
        int i = caN.A00;
        Object A012 = caN.A01();
        if (C30671eK.A00(A012) == null) {
            long A05 = C17880vN.A05(A012);
            if (i < 0 || i > caN.A01.length) {
                throw BE6.A0l("Offset is out of bounds.");
            }
            caN.A00 = i;
            return Long.valueOf(A05);
        } else if (i < 0 || i > caN.A01.length) {
            throw BE6.A0l("Offset is out of bounds.");
        } else {
            caN.A00 = i;
            return null;
        }
    }

    public final Object A03() {
        Object obj;
        Throwable th;
        Object A012 = this.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            if (A05 < -3) {
                long j = (-A05) - 4;
                obj = C27621Wu.A00;
                if (j >= 0) {
                    if (j > 4294967295L) {
                        th = new C23926BsM(j);
                    }
                    C30691eM.A01(obj);
                    return new C23917BsD(j);
                }
                th = new C23925BsL(j);
                throw th;
            }
            C30691eM.A01(A01(A05));
            return new C23918BsE(A05);
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }

    public final Object A04() {
        Object A012 = this.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            C30691eM.A01(A01(A05));
            return Long.valueOf(A05);
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    public final Object A05(long j) {
        Object obj = C27621Wu.A00;
        try {
            C30691eM.A01(A01(j));
            C25171CaN caN = this.A00;
            if (caN.A00 + ((int) j) > caN.A01.length) {
                throw BE6.A0l("Not enough data.");
            }
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            return C108945cZ.A1J(A002);
        }
        return this.A00.A02((int) j);
    }

    public static long A00(C26032Cqs cqs) {
        Object A04 = cqs.A04();
        C30691eM.A01(A04);
        return ((Number) A04).longValue();
    }
}
