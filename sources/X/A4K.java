package X;

import java.io.UnsupportedEncodingException;

public class A4K {
    public C198169xt A00;
    public C191619mt A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass118 A04;
    public final C33711jG A05;
    public final C191529mk A06;
    public final A54 A07;
    public final AnonymousClass1QE A08 = AnonymousClass1QE.A00("PaymentPinHelper", "network", "COMMON");
    public final A5H A09;
    public final C195929uA A0A;

    public static void A00(C22460B8s b8s, C22461B8t b8t, A4K a4k, String str) {
        AZ2 A012 = a4k.A07.A01(str, "PIN");
        if (A012 == null) {
            a4k.A01.A00(new C20772AYb(b8s, b8t), str);
        } else {
            b8s.C3g(new C198959zC(A012));
        }
    }

    public static byte[] A01(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                String str = objArr[i];
                if (str == null) {
                    bArr[i] = new byte[0];
                } else if (str instanceof Long) {
                    bArr[i] = AnonymousClass8BR.A1Z(String.valueOf(C17880vN.A05(str)));
                } else if (str instanceof Integer) {
                    bArr[i] = AnonymousClass8BR.A1Z(String.valueOf(AnonymousClass000.A0M(str)));
                } else if (str instanceof byte[]) {
                    bArr[i] = str;
                } else if (str instanceof String) {
                    bArr[i] = AnonymousClass8BR.A1Z(str);
                } else {
                    throw AnonymousClass000.A0k(AnonymousClass1QE.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i2 += bArr[i].length;
                i++;
            } catch (UnsupportedEncodingException e) {
                AnonymousClass8BS.A1F("PaymentPinHelper", AnonymousClass001.A1E(e, " UTF-8 not supported: ", AnonymousClass000.A10()));
                throw new Error(e);
            }
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }

    public A4K(AnonymousClass1KB r8, AnonymousClass11S r9, AnonymousClass11E r10, AnonymousClass11P r11, AnonymousClass118 r12, C33711jG r13, C31061ex r14, C191529mk r15, A54 a54, A5H a5h, C195929uA r18) {
        this.A04 = r12;
        this.A02 = r8;
        this.A06 = r15;
        this.A0A = r18;
        this.A03 = r10;
        this.A05 = r13;
        this.A09 = a5h;
        A54 a542 = a54;
        this.A07 = a542;
        this.A00 = new C198169xt(r9, r11, r14);
        this.A01 = new C191619mt(r12.A00, r8, r13, r14, a542, "PIN");
    }
}
