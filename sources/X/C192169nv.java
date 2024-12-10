package X;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.9nv  reason: invalid class name and case insensitive filesystem */
public abstract class C192169nv {
    public final byte[] A00;
    public final byte[] A01;

    public C166288ce A00() {
        C165178ai r1;
        if (this instanceof AnonymousClass8h4) {
            r1 = ((AnonymousClass8h4) this).A00;
        } else if (!(this instanceof AnonymousClass8h3)) {
            return null;
        } else {
            r1 = ((AnonymousClass8h3) this).A00;
        }
        if ((r1.bitField0_ & 8) == 0) {
            return null;
        }
        C166288ce r0 = r1.backupMetadata_;
        if (r0 == null) {
            return C166288ce.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public void A01(OutputStream outputStream) {
        C165178ai r0;
        if (this instanceof AnonymousClass8h3) {
            r0 = ((AnonymousClass8h3) this).A00;
        } else {
            AnonymousClass8h5 r1 = (AnonymousClass8h5) this;
            if (r1 instanceof AnonymousClass8h4) {
                r0 = ((AnonymousClass8h4) r1).A00;
            } else {
                C191279mJ r5 = r1.A00;
                String str = r5.A00;
                C18070vi.A0W(str);
                int i = 0;
                byte[][] bArr = {A85.A00, new byte[]{Byte.parseByte(str)}, r5.A04, r5.A02, r5.A01};
                do {
                    byte[] bArr2 = bArr[i];
                    Arrays.toString(bArr2);
                    outputStream.write(bArr2);
                    i++;
                } while (i < 5);
                return;
            }
        }
        r0.A0L(outputStream);
    }

    public C192169nv(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }
}
