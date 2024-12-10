package X;

import java.nio.MappedByteBuffer;
import java.util.Iterator;

/* renamed from: X.25l  reason: invalid class name and case insensitive filesystem */
public class C449625l implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C449625l(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void run() {
        if (this.A00 != 0) {
            C223819r r4 = (C223819r) this.A01;
            String str = this.A02;
            if (r4.A06) {
                byte[] bytes = str.getBytes();
                int length = bytes.length;
                boolean z = false;
                if (length < 100) {
                    z = true;
                }
                C17960vV.A0F(z, "Log entry too large");
                if (((long) (length + 1 + r4.A01.position())) >= 1024) {
                    MappedByteBuffer mappedByteBuffer = r4.A01;
                    int i = C223819r.A07;
                    mappedByteBuffer.position(i);
                    MappedByteBuffer mappedByteBuffer2 = r4.A01;
                    byte[] bArr = C223819r.A08;
                    mappedByteBuffer2.put(bArr);
                    int i2 = i + r4.A00.byteSize;
                    r4.A01.position(i2);
                    r4.A01.put(bArr);
                    Iterator it = r4.A00.iterator();
                    while (it.hasNext()) {
                        byte[] bArr2 = (byte[]) it.next();
                        r4.A01.position(i2 - 1);
                        r4.A01.put((byte) 10);
                        MappedByteBuffer mappedByteBuffer3 = r4.A01;
                        int length2 = bArr2.length;
                        mappedByteBuffer3.position((mappedByteBuffer3.position() - 1) - length2);
                        r4.A01.put(bArr2);
                        i2 -= length2 + 1;
                    }
                    r4.A01.position(i + r4.A00.byteSize + 2);
                }
                MappedByteBuffer mappedByteBuffer4 = r4.A01;
                mappedByteBuffer4.position((mappedByteBuffer4.position() - 2) + length);
                r4.A01.put((byte) 10);
                r4.A01.put(C223819r.A08);
                MappedByteBuffer mappedByteBuffer5 = r4.A01;
                mappedByteBuffer5.position(((mappedByteBuffer5.position() - 2) - 1) - length);
                r4.A01.put(bytes);
                MappedByteBuffer mappedByteBuffer6 = r4.A01;
                mappedByteBuffer6.position(mappedByteBuffer6.position() + 1 + 2);
                r4.A00.add(bytes);
                return;
            }
            return;
        }
        C30051dJ.A00((C30051dJ) this.A01, "background", this.A02);
    }
}
