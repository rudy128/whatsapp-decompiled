package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Map;

public final class A16 {
    public final C26031Qo A00;
    public final C18030ve A01;
    public final C192499oV A02;
    public final C50442Ul A03;

    public static void A00(C185169c8 r5, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        for (C183629Yz r3 : C29431cG.A0t(C21486Akr.A00(r5.A01, 47))) {
            if (r3 instanceof C1775599f) {
                C1775599f r32 = (C1775599f) r3;
                int i = r32.A00;
                for (int i2 = r32.A01; i2 < i; i2++) {
                    byteArrayOutputStream.write(bArr[i2]);
                }
            } else if (r3 instanceof C1775499e) {
                int i3 = r3.A00.A00.A01;
                while ((i3 & -128) != 0) {
                    byteArrayOutputStream.write((i3 & StringTreeSet.OFFSET_BASE_ENCODING) | -128);
                    i3 >>>= 7;
                }
                byteArrayOutputStream.write(i3);
                C185169c8 r4 = ((C1775499e) r3).A00;
                int i4 = r4.A00;
                int i5 = i4;
                int i6 = 0;
                while (true) {
                    i6++;
                    if ((i5 & -128) == 0) {
                        break;
                    }
                    i5 >>>= 7;
                }
                int i7 = new C194119rC(i4, i6).A01;
                while ((i7 & -128) != 0) {
                    byteArrayOutputStream.write((i7 & StringTreeSet.OFFSET_BASE_ENCODING) | -128);
                    i7 >>>= 7;
                }
                byteArrayOutputStream.write(i7);
                A00(r4, byteArrayOutputStream, bArr);
            }
        }
    }

    public final boolean A01(AnonymousClass206 r5) {
        int i = r5.A0u;
        if (C18020vd.A05(C18040vf.A02, this.A01, 9818)) {
            if (i == 0 || i == 78 || i == 1 || i == 42 || i == 3 || i == 43 || i == 2 || i == 82 || i == 20 || i == 9 || i == 13) {
                return true;
            }
            return false;
        } else if ((r5 instanceof AnonymousClass212) || (r5 instanceof AnonymousClass23N) || (r5 instanceof C444223j) || (r5 instanceof C436420i) || (r5 instanceof C439721q) || (r5 instanceof AnonymousClass23U) || (r5 instanceof C442522s) || (r5 instanceof C442422r)) {
            return false;
        }
        return true;
    }

    public final byte[] A02(Integer num, byte[] bArr) {
        if (num == null) {
            this.A00.A00(AnonymousClass8oI.A04, (String) null);
            return null;
        }
        C199289zk r3 = new C199289zk(C182099Tb.A00, bArr, num.intValue());
        int length = r3.A01.length;
        Map unmodifiableMap = Collections.unmodifiableMap(r3.A00.field_);
        C18070vi.A0X(unmodifiableMap);
        C185169c8 A012 = r3.A01(unmodifiableMap, 0, length);
        int i = A012.A00;
        int i2 = i;
        int i3 = 0;
        while (true) {
            i3++;
            if ((i2 & -128) == 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(new C194119rC(i, i3).A01);
                A00(A012, byteArrayOutputStream, bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C18070vi.A0X(byteArray);
                return byteArray;
            }
            i2 >>>= 7;
        }
    }

    public A16(C26031Qo r1, C18030ve r2, C192499oV r3, C50442Ul r4) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
