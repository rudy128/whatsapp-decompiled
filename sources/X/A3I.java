package X;

public abstract class A3I {
    public static void A00(C62572rc r3, AnonymousClass21V r4, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            C185849dF BIV = new C20583AQt(C63972u0.A02(r4)).BIV(bArr);
            r3.A0a = bArr;
            r3.A0W = BIV.A00;
            r3.A0Y = BIV.A02;
            r3.A0Z = BIV.A01;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
        A10.append(length);
        AnonymousClass8BX.A1F(r4, "; message.key=", A10);
        throw AnonymousClass8BT.A0d();
    }

    public static boolean A02(AnonymousClass206 r4) {
        if (!(r4 instanceof C438921i)) {
            return false;
        }
        C62572rc r2 = ((AnonymousClass21V) r4).A02;
        if (r4.A09 != 7 || r2 == null || r2.A01 <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A01(AnonymousClass206 r2) {
        if ((!A02(r2) || !r2.A11(1)) && r2.A09 != 3) {
            return false;
        }
        return true;
    }
}
