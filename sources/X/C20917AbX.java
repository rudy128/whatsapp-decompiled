package X;

import android.graphics.BitmapFactory;
import java.util.Map;

/* renamed from: X.AbX  reason: case insensitive filesystem */
public final class C20917AbX implements C22522BBf {
    public final AnonymousClass118 A00;
    public final A43 A01;

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        C1418477e r0;
        String str;
        C170278pb r5 = (C170278pb) obj;
        C179929Kl r4 = (C179929Kl) enumR;
        C18070vi.A0h(r5, r4);
        if (!(r5 instanceof AnonymousClass8pS)) {
            return null;
        }
        switch (r4.ordinal()) {
            case 0:
                r0 = ((AnonymousClass8pS) r5).A02;
                break;
            case 1:
                return ((AnonymousClass8pS) r5).A09;
            case 2:
                String str2 = ((AnonymousClass8pS) r5).A0A;
                if (str2 == null) {
                    return "UNKNOWN";
                }
                switch (str2.hashCode()) {
                    case -1704036199:
                        str = "SAVINGS";
                        break;
                    case -240997565:
                        str = "OD_SECURED";
                        break;
                    case 77569:
                        str = "NRE";
                        break;
                    case 77579:
                        str = "NRO";
                        break;
                    case 358786314:
                        str = "OD_UNSECURED";
                        break;
                    case 1844922713:
                        if (str2.equals("CURRENT")) {
                            return "CURRENT";
                        }
                        return "UNKNOWN";
                    case 1878996346:
                        str = "CREDIT_LINE";
                        break;
                    case 1996005113:
                        str = "CREDIT";
                        break;
                    default:
                        return "UNKNOWN";
                }
                if (!str2.equals(str)) {
                    return "UNKNOWN";
                }
                return str;
            case 3:
                return ((AnonymousClass8pW) r5).A03;
            case 4:
                r0 = ((AnonymousClass8pS) r5).A04;
                break;
            case 5:
                r0 = ((AnonymousClass8pS) r5).A08;
                break;
            case 6:
                return ((AnonymousClass8pS) r5).A0E;
            case 7:
                return AnonymousClass204.A0E(BitmapFactory.decodeResource(AnonymousClass3MW.A05(this.A00), A43.A00(((AnonymousClass8pS) r5).A09, (String) null).A00));
            case 8:
                r0 = ((AnonymousClass8pS) r5).A05;
                break;
            default:
                throw AnonymousClass3MW.A14();
        }
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public C20917AbX(AnonymousClass118 r1, A43 a43) {
        C18070vi.A0j(r1, a43);
        this.A00 = r1;
        this.A01 = a43;
    }

    public Class BL8() {
        return C179929Kl.class;
    }
}
