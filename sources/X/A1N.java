package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class A1N {
    public final C20922Abc A00;
    public final AnonymousClass1QJ A01;
    public final C20919AbZ A02;
    public final C20921Abb A03;
    public final C20912AbS A04;
    public final C20918AbY A05;
    public final C20913AbT A06;
    public final C20920Aba A07;
    public final C20915AbV A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;

    public final LinkedHashMap A01(C198239y1 r13, C22522BBf bBf, Object obj, Map map) {
        C198239y1[] r5;
        C198239y1 r0;
        C198239y1 r02;
        C18070vi.A0d(bBf, 1);
        LinkedHashMap A13 = C17880vN.A13();
        if (!(r13 == null || (r5 = r13.A02) == null)) {
            for (C198239y1 r9 : r5) {
                Enum[] enumArr = (Enum[]) bBf.BL8().getEnumConstants();
                if (enumArr != null) {
                    int length = enumArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Enum enumR = enumArr[i];
                        String BRa = ((B9I) enumR).BRa();
                        String str = r9.A00;
                        if (!C18070vi.A18(BRa, str)) {
                            i++;
                        } else if (enumR != null) {
                            Map map2 = map;
                            Object CFt = bBf.CFt(enumR, obj, map2);
                            if (CFt instanceof List) {
                                CFt = ((Collection) CFt).toArray(new Object[0]);
                            }
                            if (CFt instanceof Object[]) {
                                ArrayList A132 = AnonymousClass000.A13();
                                for (Object obj2 : (Object[]) CFt) {
                                    C18070vi.A0d(str, 0);
                                    Map map3 = r13.A01;
                                    if (map3 != null) {
                                        r02 = (C198239y1) map3.get(str);
                                    } else {
                                        r02 = null;
                                    }
                                    A132.add(A00(r02, obj2, map2));
                                }
                                A13.put(str, A132);
                            } else {
                                C18070vi.A0d(str, 0);
                                Map map4 = r13.A01;
                                if (map4 != null) {
                                    r0 = (C198239y1) map4.get(str);
                                } else {
                                    r0 = null;
                                }
                                A13.put(str, A00(r0, CFt, map2));
                            }
                        }
                    }
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Field not supported: ");
                String str2 = r9.A00;
                C17890vO.A19(A10, str2);
                A13.put(str2, (Object) null);
            }
        }
        return A13;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.AbS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.AbT, java.lang.Object] */
    public A1N(AnonymousClass1M9 r24, C24921Me r25, C27191Vc r26, AnonymousClass118 r27, C219217x r28, C18000vb r29, C26021Qn r30, C18030ve r31, AnonymousClass18K r32, AnonymousClass1QD r33, AnonymousClass1QJ r34, AnonymousClass1QS r35, A27 a27, A56 a56, C30931ek r38, AnonymousClass19U r39, Map map, Map map2, Map map3) {
        AnonymousClass118 r7 = r27;
        AnonymousClass1M9 r11 = r24;
        C18030ve r21 = r31;
        AnonymousClass18K r20 = r32;
        C24921Me r8 = r25;
        C18070vi.A0w(r21, r7, r20, r11, r8);
        C30931ek r2 = r38;
        AnonymousClass1QS r5 = r35;
        C18000vb r10 = r29;
        C26021Qn r13 = r30;
        AnonymousClass1QD r6 = r33;
        C18070vi.A0x(r10, r2, r5, r6, r13);
        A27 a272 = a27;
        AnonymousClass1QJ r9 = r34;
        C219217x r22 = r28;
        AnonymousClass19U r19 = r39;
        A56 a562 = a56;
        C18070vi.A0y(r22, a562, a272, r19, r9);
        Map map4 = map3;
        Map map5 = map2;
        Map map6 = map;
        C27191Vc r12 = r26;
        C18070vi.A0t(r12, map6, map5, map4);
        this.A01 = r9;
        this.A0B = map6;
        this.A09 = map5;
        this.A0A = map4;
        this.A00 = new C20922Abc(r11, r13, r5, a272, r2);
        this.A07 = new C20920Aba(r7, r6, r9, a562);
        this.A08 = new C20915AbV(r10);
        this.A02 = new C20919AbZ(r8, r12, r7, r5);
        this.A04 = new Object();
        C219217x r82 = r22;
        this.A03 = new C20921Abb(r82, r21, r20, r5, r19);
        this.A06 = new Object();
        this.A05 = new C20918AbY(r6, r5);
    }

    public Object A00(C198239y1 r4, Object obj, Map map) {
        C198239y1[] r0;
        C22522BBf bBf;
        C22522BBf bBf2;
        StringBuilder A10;
        String str;
        String str2;
        String str3;
        if (r4 == null || (r0 = r4.A02) == null || r0.length == 0) {
            return obj;
        }
        if (obj instanceof C20284AEs) {
            bBf = this.A07;
        } else if (obj instanceof ARR) {
            bBf = this.A08;
        } else if (obj instanceof AnonymousClass1QK) {
            bBf = this.A05;
        } else {
            if (obj instanceof C170278pb) {
                Map map2 = this.A0B;
                C63572tK A022 = this.A01.A02();
                if (A022 != null) {
                    str3 = A022.A03;
                } else {
                    str3 = null;
                }
                bBf2 = (C22522BBf) map2.get(str3);
                if (bBf2 == null) {
                    Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentMethodCountryData country not supported");
                    return null;
                }
            } else if (obj instanceof AnonymousClass1E7) {
                bBf = this.A02;
            } else if (obj instanceof AnonymousClass21L) {
                bBf = this.A04;
            } else if (obj instanceof AnonymousClass8pI) {
                Map map3 = this.A09;
                C63572tK A023 = this.A01.A02();
                if (A023 != null) {
                    str2 = A023.A03;
                } else {
                    str2 = null;
                }
                bBf2 = (C22522BBf) map3.get(str2);
                if (bBf2 == null) {
                    Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentContactInfoCountryData country not supported");
                    return null;
                }
            } else if (obj instanceof C197689x6) {
                if (obj instanceof C176208zx) {
                    bBf2 = (C22522BBf) this.A0A.get("IN");
                    if (bBf2 == null) {
                        A10 = AnonymousClass000.A10();
                        C17900vP.A0a(this, A10);
                        str = "/resolveObject Country Specific Device resolver does not exists";
                    }
                } else if (obj instanceof C176218zy) {
                    bBf2 = (C22522BBf) this.A0A.get("BR");
                    if (bBf2 == null) {
                        A10 = AnonymousClass000.A10();
                        C17900vP.A0a(this, A10);
                        str = "/resolveObject Brazil Specific Device resolver does not exists";
                    }
                } else {
                    bBf = this.A03;
                }
                C17890vO.A19(A10, str);
                return C27621Wu.A00;
            } else if (obj instanceof C186109df) {
                bBf = this.A06;
            } else {
                Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject Object type not supported");
                return null;
            }
            return A01(r4, bBf2, obj, map);
        }
        bBf2 = bBf;
        return A01(r4, bBf2, obj, map);
    }

    public A1N() {
    }
}
