package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.A6r  reason: case insensitive filesystem */
public abstract class C20089A6r {
    public static int A00(C20279AEn aEn) {
        return A01(aEn.A0D.A01);
    }

    public static final C20936Abq A02(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BDZ bdz = ((C20251ADj) it.next()).A00;
            if (bdz instanceof C20936Abq) {
                return (C20936Abq) bdz;
            }
        }
        return null;
    }

    public static final String A04(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((C20251ADj) it.next()).A01;
                String str2 = "upi_merchant_vpa";
                if (!C18070vi.A18(str, str2)) {
                    str2 = "upi_intent_link";
                    if (C18070vi.A18(str, str2)) {
                    }
                }
                return str2;
            }
        }
        throw new Throwable("Invalid Dynamic VPA Request");
    }

    public static final int A01(String str) {
        switch (str.hashCode()) {
            case -1402931637:
                if (str.equals("completed")) {
                    return 3;
                }
                break;
            case -951992251:
                if (str.equals("preparing_to_ship")) {
                    return 8;
                }
                break;
            case -682587753:
                if (str.equals("pending")) {
                    return 1;
                }
                break;
            case -669495070:
                if (str.equals("partially_shipped")) {
                    return 5;
                }
                break;
            case -242327420:
                if (str.equals("delivered")) {
                    return 9;
                }
                break;
            case -123173735:
                if (str.equals("canceled")) {
                    return 4;
                }
                break;
            case 385840245:
                if (str.equals("payment_requested")) {
                    return 7;
                }
                break;
            case 422194963:
                if (str.equals("processing")) {
                    return 2;
                }
                break;
            case 2061557075:
                if (str.equals("shipped")) {
                    return 6;
                }
                break;
        }
        C17900vP.A0g("CheckoutInfoContent/getOrderStatus can not recognise order status: ", str, AnonymousClass000.A10());
        return 0;
    }

    public static final String A03(AnonymousClass21K r1) {
        C20279AEn aEn;
        List list;
        C20285AEt BPK = r1.BPK();
        if (BPK == null || (aEn = BPK.A02) == null || (list = aEn.A0Q) == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            return ((C20251ADj) it.next()).A01;
        }
        return null;
    }
}
