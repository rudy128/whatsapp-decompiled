package X;

import java.util.RandomAccess;

/* renamed from: X.3F3  reason: invalid class name */
public final class AnonymousClass3F3 extends C19800z1<Byte> implements RandomAccess {
    public final /* synthetic */ byte[] A00;

    public AnonymousClass3F3(byte[] bArr) {
        this.A00 = bArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            byte[] bArr = this.A00;
            int length = bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (byteValue != bArr[i]) {
                    i++;
                } else if (i < 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.A00.length);
    }
}
