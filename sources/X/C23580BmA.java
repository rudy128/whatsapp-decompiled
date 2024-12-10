package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.BmA  reason: case insensitive filesystem */
public final class C23580BmA extends C23581BmB {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public C23580BmA(byte[] bArr, int i, int i2) {
        super(bArr);
        DSQ.A00(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    public Object writeReplace() {
        return new C23581BmB(A06());
    }
}
