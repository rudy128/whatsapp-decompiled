package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.CeB  reason: case insensitive filesystem */
public abstract class C25352CeB {
    public static byte[] A00(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A01 = C26287Cwn.A01(bArr2);
                byte[] bArr3 = new byte[A01];
                wrap.get(bArr3);
                if (CGK.A00.contains(Byte.valueOf(b)) && A01 <= 16777215) {
                    return bArr3;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Received an invalid handshake - type ");
                A10.append(b);
                throw BE9.A0b(AnonymousClass001.A1I(" len ", A10, A01), (byte) 80);
            } catch (BufferUnderflowException e) {
                throw BE9.A0c("Invalid handshake message", e, (byte) 80);
            }
        } else {
            throw BE9.A0b("Illegal argument - handshake is null", (byte) 80);
        }
    }

    public static byte[] A01(byte[] bArr, byte b) {
        int length;
        if (!CGK.A00.contains(Byte.valueOf(b)) || bArr == null || (length = bArr.length) > 16777215) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Illegal arguments -  type ");
            A10.append(b);
            throw BEA.A0X(AnonymousClass001.A1I(" msg is null or bigger than", A10, 16777215));
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.put(b);
        allocate.put(C26287Cwn.A07(length));
        allocate.put(bArr);
        return allocate.array();
    }
}
