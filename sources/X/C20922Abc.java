package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Abc  reason: case insensitive filesystem */
public final class C20922Abc implements C22522BBf {
    public final AnonymousClass1M9 A00;
    public final C26021Qn A01;
    public final AnonymousClass1QS A02;
    public final A27 A03;
    public final C30931ek A04;

    /* JADX WARNING: type inference failed for: r1v30, types: [X.2r3, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        Object obj2;
        Object obj3;
        Boolean bool;
        Object obj4;
        String str;
        Object obj5;
        String str2;
        Object obj6;
        String str3;
        Object obj7;
        String obj8;
        Object obj9;
        Object obj10;
        Number number;
        Object obj11;
        long A05;
        AnonymousClass1KJ r0;
        switch (C108955ca.A04((C179939Km) enumR, 1)) {
            case 0:
                if (map != null) {
                    obj2 = map.get("scenario");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                if (map != null) {
                    obj3 = map.get("is_debit");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof Boolean) {
                    bool = (Boolean) obj3;
                } else {
                    bool = null;
                }
                if (obj2 == null || bool == null) {
                    return null;
                }
                boolean equals = "P2P".equals(obj2);
                if (equals && bool.booleanValue()) {
                    return AnonymousClass8BR.A0R(this.A02).A07();
                }
                if (!equals || bool.booleanValue()) {
                    boolean equals2 = "P2M".equals(obj2);
                    if (equals2 && bool.booleanValue()) {
                        Iterator it = AnonymousClass8BU.A0t(this.A02).iterator();
                        while (it.hasNext()) {
                            C20284AEs A0P = AnonymousClass8BR.A0P(it);
                            if (A0P.A03 == 2) {
                                return A0P;
                            }
                        }
                        return null;
                    } else if (!equals2 || bool.booleanValue()) {
                        return null;
                    } else {
                        AnonymousClass1KH A0R = AnonymousClass8BR.A0R(this.A02);
                        synchronized (A0R) {
                            Iterator it2 = A0R.A0B().iterator();
                            while (it2.hasNext()) {
                                C20284AEs A0P2 = AnonymousClass8BR.A0P(it2);
                                if (A0P2.A02 == 2) {
                                    return A0P2;
                                }
                            }
                            return null;
                        }
                    }
                } else {
                    Iterator it3 = AnonymousClass8BU.A0t(this.A02).iterator();
                    while (it3.hasNext()) {
                        C20284AEs A0P3 = AnonymousClass8BR.A0P(it3);
                        if (A0P3.A00 == 2) {
                            return A0P3;
                        }
                    }
                    return null;
                }
            case 1:
                if (map != null) {
                    obj4 = map.get("credential_id");
                } else {
                    obj4 = null;
                }
                if (!(obj4 instanceof String) || (str = (String) obj4) == null) {
                    return null;
                }
                return AnonymousClass1KH.A01(str, AnonymousClass8BU.A0t(this.A02));
            case 2:
                return AnonymousClass8BU.A0t(this.A02);
            case 3:
                C22941Dw r2 = UserJid.Companion;
                if (map != null) {
                    obj5 = map.get("jid");
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str2 = (String) obj5;
                } else {
                    str2 = null;
                }
                UserJid A042 = r2.A04(str2);
                if (A042 != null) {
                    return this.A00.A0H(A042);
                }
                return null;
            case 4:
                if (map != null) {
                    obj6 = map.get("message_id");
                } else {
                    obj6 = null;
                }
                if (!(obj6 instanceof String) || (str3 = (String) obj6) == null) {
                    return null;
                }
                return this.A01.A01(str3);
            case 5:
                return new C197689x6(this.A04.A01());
            case 6:
                if (map != null) {
                    obj7 = map.get("code");
                } else {
                    obj7 = null;
                }
                if (!(obj7 instanceof Integer) || obj7 == null || (obj8 = obj7.toString()) == null) {
                    return null;
                }
                A27 a27 = this.A03;
                if (A27.A00(a27)) {
                    return a27.A00.get(obj8);
                }
                return null;
            case 7:
                if (map != null) {
                    obj9 = map.get("currency_code");
                } else {
                    obj9 = null;
                }
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                if (map != null) {
                    obj10 = map.get("offset");
                } else {
                    obj10 = null;
                }
                if (!(obj10 instanceof Integer) || (number = (Number) obj10) == null) {
                    return null;
                }
                int intValue = number.intValue();
                if (map != null) {
                    obj11 = map.get("value");
                } else {
                    obj11 = null;
                }
                if (obj11 instanceof Integer) {
                    A05 = (long) AnonymousClass000.A0M(obj11);
                } else if (!(obj11 instanceof Long)) {
                    return null;
                } else {
                    A05 = C17880vN.A05(obj11);
                }
                ? obj12 = new Object();
                obj12.A01 = A05;
                obj12.A00 = intValue;
                if (C18070vi.A18(obj9, "INR")) {
                    r0 = AnonymousClass1KL.A0B;
                } else if (!C18070vi.A18(obj9, "BRL")) {
                    return null;
                } else {
                    r0 = AnonymousClass1KL.A0A;
                }
                obj12.A02 = r0;
                return obj12.A00();
            case 8:
                AnonymousClass1QK A022 = this.A02.A02("p2p_context");
                C18070vi.A0X(A022);
                return A022;
            default:
                throw AnonymousClass3MW.A14();
        }
    }

    public C20922Abc(AnonymousClass1M9 r1, C26021Qn r2, AnonymousClass1QS r3, A27 a27, C30931ek r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = a27;
    }

    public Class BL8() {
        return C179939Km.class;
    }
}
