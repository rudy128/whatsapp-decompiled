package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AWb  reason: case insensitive filesystem */
public final class C20721AWb implements BB1 {
    public final BB1 A00;
    public final AnonymousClass22H A01;
    public final AnonymousClass00H A02;
    public final String A03;

    public void BtD(String str, Throwable th) {
        this.A00.BtD(str, th);
    }

    public void C7h(String str, Map map) {
        Object obj;
        String str2 = this.A01.A0v.A01;
        C18070vi.A0X(str2);
        String str3 = this.A03;
        C198549yW r1 = (C198549yW) this.A02.get();
        if (str3 == null) {
            LinkedHashMap A08 = AnonymousClass1D7.A08(map);
            C198549yW.A00(r1);
            obj = r1.A02;
            synchronized (obj) {
                Map map2 = r1.A03;
                A00(str2, map2);
                C194999sd r4 = (C194999sd) map2.get(str2);
                if (r4 != null) {
                    r4.A01 = AnonymousClass11P.A01(r1.A00) + C72453Mb.A0K(r1.A05);
                    r4.A03 = A08;
                }
            }
        } else {
            Object obj2 = map.get(str3);
            if (obj2 == null) {
                obj2 = C18460wS.A00;
            }
            C198549yW.A00(r1);
            obj = r1.A02;
            synchronized (obj) {
                Map map3 = r1.A03;
                A00(str2, map3);
                C194999sd r42 = (C194999sd) map3.get(str2);
                if (r42 != null) {
                    r42.A00 = AnonymousClass11P.A01(r1.A00) + C72453Mb.A0K(r1.A04);
                    r42.A02.put(str3, obj2);
                }
            }
        }
        this.A00.C7h(str, map);
    }

    public C20721AWb(BB1 bb1, AnonymousClass22H r2, AnonymousClass00H r3, String str) {
        this.A01 = r2;
        this.A00 = bb1;
        this.A02 = r3;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9sd, java.lang.Object] */
    public static void A00(Object obj, Map map) {
        if (!map.containsKey(obj)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ? obj2 = new Object();
            obj2.A01 = 0;
            obj2.A00 = 0;
            obj2.A03 = linkedHashMap;
            obj2.A02 = linkedHashMap2;
            map.put(obj, obj2);
        }
    }
}
