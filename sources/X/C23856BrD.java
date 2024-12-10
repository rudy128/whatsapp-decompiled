package X;

import com.whatsapp.util.Log;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.BrD  reason: case insensitive filesystem */
public class C23856BrD extends C25275CcQ {
    public final C25671Ck2 A00 = new C25671Ck2();
    public final List A01 = AnonymousClass000.A13();

    public void A04(List list) {
        List<Number> list2;
        List list3 = list;
        int size = list3.size();
        C25671Ck2 ck2 = this.A00;
        Set set = ck2.A03;
        if (size == set.size()) {
            list2 = this.A01;
            super.A04(list2);
        } else {
            HashSet hashSet = new HashSet(list3.size());
            int i = 0;
            for (Object next : set) {
                if (AnonymousClass3Ma.A1b(list3, i)) {
                    hashSet.add(next);
                }
                i++;
            }
            list2 = this.A01;
            for (Number number : list2) {
                int intValue = number.intValue();
                if (intValue != this.A02.A01) {
                    C25273CcL A012 = A01(intValue);
                    C26037Cqx cqx = A012.A04;
                    ByteBuffer byteBuffer = cqx.A02;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    asReadOnlyBuffer.flip();
                    int limit = asReadOnlyBuffer.limit();
                    asReadOnlyBuffer.position(8);
                    try {
                        String str = null;
                        long j = 0;
                        for (int position = asReadOnlyBuffer.position(); position < limit; position = asReadOnlyBuffer.position()) {
                            CQX A03 = C26239Cvc.A03(asReadOnlyBuffer);
                            int i2 = A03.A01;
                            if (i2 == 0) {
                                int i3 = A03.A00;
                                if (i3 == 6005) {
                                    str = (String) A03.A02;
                                } else if (i3 == 47) {
                                    long A0F = (long) BE6.A0F(A03.A02);
                                    if (A0F > j) {
                                        j = A0F;
                                    }
                                }
                            } else if (i2 == 1 && hashSet.contains(str)) {
                                cqx.A01 = Math.min(cqx.A01, position);
                                int position2 = byteBuffer.position();
                                byteBuffer.position(position);
                                byteBuffer.put((byte) 4);
                                byteBuffer.position(position2);
                            }
                        }
                        A012.A02();
                        if (C17880vN.A04(System.currentTimeMillis()) - j > 604800) {
                            super.A04(Collections.singletonList(number));
                        }
                    } catch (Throwable th) {
                        Log.e(BEA.A0j(th, "privateStatseventbuffermanager/cleanbuffer unexpected errors ", AnonymousClass000.A10()));
                        super.A04(Collections.singletonList(number));
                    }
                } else {
                    throw AnonymousClass000.A0n("Trying to compact the current buffer");
                }
            }
        }
        ck2.A01 = new byte[0];
        ck2.A00 = 0;
        set.clear();
        ck2.A02.clear();
        list2.clear();
    }

    public C23856BrD(AnonymousClass11N r2, CT0 ct0, AnonymousClass185 r4, RandomAccessFile randomAccessFile, int i, int i2) {
        super(r2, ct0, r4, randomAccessFile, i, i2);
    }
}
