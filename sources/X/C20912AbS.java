package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.AbS  reason: case insensitive filesystem */
public final class C20912AbS implements C22522BBf {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.2r3, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        C20279AEn aEn;
        C20279AEn aEn2;
        C20279AEn aEn3;
        C20279AEn aEn4;
        C20279AEn aEn5;
        byte[] bArr;
        C20279AEn aEn6;
        C20279AEn aEn7;
        AnonymousClass21L r7 = (AnonymousClass21L) obj;
        C179919Kk r6 = (C179919Kk) enumR;
        boolean A15 = C18070vi.A15(r7, r6);
        switch (r6.ordinal()) {
            case 0:
                C20285AEt aEt = r7.A00;
                if (aEt == null || (aEn7 = aEt.A02) == null) {
                    return null;
                }
                return aEn7.A0K;
            case 1:
                C20285AEt aEt2 = r7.A00;
                if (aEt2 == null || (aEn6 = aEt2.A02) == null) {
                    return null;
                }
                return aEn6.A04();
            case 2:
                C20285AEt aEt3 = r7.A00;
                if (aEt3 == null || (aEn5 = aEt3.A02) == null || (bArr = aEn5.A0U) == null) {
                    return null;
                }
                return Base64.encodeToString(bArr, A15 ? 1 : 0);
            case 3:
                C20285AEt aEt4 = r7.A00;
                if (aEt4 == null || (aEn4 = aEt4.A02) == null) {
                    return null;
                }
                return aEn4.A0L;
            case 4:
                C20285AEt aEt5 = r7.A00;
                if (aEt5 == null || (aEn3 = aEt5.A02) == null) {
                    return null;
                }
                AE1 ae1 = aEn3.A0F;
                AnonymousClass1KJ r3 = aEn3.A0A;
                if (ae1 == null || r3 == null) {
                    return null;
                }
                ? obj2 = new Object();
                obj2.A01 = ae1.A01;
                obj2.A00 = ae1.A00;
                obj2.A02 = r3;
                return obj2.A00();
            case 5:
                C20285AEt aEt6 = r7.A00;
                if (aEt6 == null || (aEn = aEt6.A02) == null) {
                    return "UNKNOWN";
                }
                switch (C20089A6r.A00(aEn)) {
                    case 1:
                        return "PENDING";
                    case 2:
                        return "PROCESSING";
                    case 3:
                        return "COMPLETED";
                    case 4:
                        return "CANCELED";
                    case 5:
                        return "PARTIALLY_SHIPPED";
                    case 6:
                        return "SHIPPED";
                    case 7:
                        return "PAYMENT_REQUESTED";
                    case 8:
                        return "PREPARING_TO_SHIP";
                    case 9:
                        return "DELIVERED";
                    default:
                        return "UNKNOWN";
                }
            case 6:
                C20285AEt aEt7 = r7.A00;
                if (aEt7 == null || (aEn2 = aEt7.A02) == null) {
                    return "UNKNOWN";
                }
                int A01 = aEn2.A01();
                if (A01 == 1) {
                    return "DIGITAL_GOODS";
                }
                if (A01 == 2) {
                    return "PHYSICAL_GOODS";
                }
                return "UNKNOWN";
            default:
                throw AnonymousClass3MW.A14();
        }
    }

    public Class BL8() {
        return C179919Kk.class;
    }
}
