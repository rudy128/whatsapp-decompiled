package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Cl6  reason: case insensitive filesystem */
public class C25736Cl6 {
    public static final Charset A06 = Charset.forName(DefaultCrypto.UTF_8);
    public final String A00;
    public final ByteBuffer A01;
    public final Map A02;
    public final CQO[] A03;
    public final AtomicReferenceArray A04;
    public final AtomicReferenceArray A05;

    public C24956CRg A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A04;
        C24956CRg cRg = (C24956CRg) atomicReferenceArray.get(i);
        if (cRg == null) {
            int i2 = this.A03[0].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            short s = byteBuffer.getShort(i2 + 8);
            byteBuffer.getShort(i2 + 10);
            cRg = new C24956CRg(this, i3, i4, s);
            if (!C24565C9m.A00((Object) null, cRg, atomicReferenceArray, i)) {
                return (C24956CRg) atomicReferenceArray.get(i);
            }
        }
        return cRg;
    }

    public Object A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A05;
        Object obj = atomicReferenceArray.get(i);
        if (obj != null) {
            return obj;
        }
        int i2 = this.A03[1].A02 + (i * 16);
        ByteBuffer byteBuffer = this.A01;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i3);
        duplicate.limit(i3 + i4);
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        String A0q = BE6.A0q(A06, bArr);
        if (C24565C9m.A00((Object) null, A0q, atomicReferenceArray, i)) {
            return A0q;
        }
        return atomicReferenceArray.get(i);
    }

    public C25736Cl6(String str, ByteBuffer byteBuffer, Map map, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, CQO[] cqoArr) {
        this.A01 = byteBuffer;
        this.A03 = cqoArr;
        this.A00 = str;
        this.A04 = atomicReferenceArray;
        this.A05 = atomicReferenceArray2;
        this.A02 = map;
    }
}
