package X;

import java.util.HashMap;

/* renamed from: X.8t3  reason: invalid class name and case insensitive filesystem */
public abstract class C172208t3 extends C20462ALz {
    public String A00 = "1.0";
    public final AnonymousClass16M A01;
    public final BAD A02;
    public final C18000vb A03;
    public final C24521Kq A04;

    public C172208t3(AnonymousClass190 r10, C22416B6y b6y, AnonymousClass16M r12, BAD bad, C24521Kq r14, C18000vb r15, C22508BAp bAp, C191659mx r17, C19989A2b a2b, AnonymousClass10I r19) {
        super(r10, b6y, bAp, r17, a2b, r19, "WA_BizDirectorySearch");
        this.A03 = r15;
        this.A01 = r12;
        this.A04 = r14;
        this.A02 = bad;
    }

    public static void A00(C20079A6f a6f, HashMap hashMap) {
        Double d;
        Double d2;
        String str;
        Object obj;
        String str2 = a6f.A08;
        hashMap.put("location_type", str2);
        if (str2.equals("country_default")) {
            obj = a6f.A06;
            C17960vV.A07(obj);
            str = "country_code";
        } else {
            boolean A06 = a6f.A06();
            if (A06) {
                d = a6f.A03;
            } else {
                d = a6f.A01;
            }
            hashMap.put("wa_biz_directory_lat", d);
            if (A06) {
                d2 = a6f.A04;
            } else {
                d2 = a6f.A02;
            }
            hashMap.put("wa_biz_directory_long", d2);
            str = "radius";
            obj = a6f.A05;
        }
        hashMap.put(str, obj);
    }
}
