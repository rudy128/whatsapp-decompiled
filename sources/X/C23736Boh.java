package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Boh  reason: case insensitive filesystem */
public class C23736Boh extends C25681CkC {
    public static final C9N A0B = new Object();
    public final DOZ A00;
    public final C26050CrK A01;
    public final C24807CLa A02;
    public final CFu A03;
    public final E8A A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;
    public final Map A09;
    public final Map A0A;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.CFu, java.lang.Object] */
    public static C23736Boh A01(DOZ doz, E8A e8a, List list) {
        C22415B6x A032 = C26272CwJ.A03(doz);
        Integer num = AnonymousClass00R.A01;
        return new C23736Boh((E9O) null, doz, (DOZ) null, (C26050CrK) null, (C24807CLa) null, new Object(), C199029zJ.A01, e8a, A032, num, (String) DOZ.A00(doz, 2131428171), (String) null, list, (Map) null, (Map) null);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.CBv] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23736Boh(E9O e9o, DOZ doz, DOZ doz2, C26050CrK crK, C24807CLa cLa, CFu cFu, C199029zJ r17, E8A e8a, C22415B6x b6x, Integer num, String str, String str2, List list, Map map, Map map2) {
        super(e9o, A0B, new Object(), r17, b6x, list);
        String str3 = str2;
        this.A00 = doz;
        this.A04 = e8a;
        this.A09 = map;
        this.A01 = crK;
        this.A02 = cLa;
        this.A0A = map2;
        this.A03 = cFu;
        this.A07 = str;
        this.A05 = num;
        this.A08 = AnonymousClass3MW.A0z(doz2);
        this.A04.A00.add(new Object());
        this.A06 = str2 == null ? Long.toString(new Random().nextLong()) : str3;
    }

    public static C23736Boh A00(E9O e9o, C23736Boh boh, List list) {
        C23736Boh boh2 = boh;
        List list2 = list;
        E9O e9o2 = e9o;
        DOZ doz = boh2.A00;
        E8A e8a = boh2.A04;
        if (list == null) {
            list2 = boh2.A06;
        }
        Map map = boh2.A09;
        C26050CrK crK = boh2.A01;
        C24807CLa cLa = boh2.A02;
        Map map2 = boh2.A0A;
        C22415B6x b6x = boh2.A01;
        CFu cFu = boh2.A03;
        String str = boh2.A07;
        if (e9o == null) {
            e9o2 = boh2.A02;
        }
        String str2 = boh2.A06;
        Map map3 = map;
        List list3 = list2;
        String str3 = str2;
        String str4 = str;
        Integer num = boh2.A05;
        C22415B6x b6x2 = b6x;
        E8A e8a2 = e8a;
        return new C23736Boh(e9o2, doz, (DOZ) boh2.A08.get(), crK, cLa, cFu, boh2.A05, e8a2, b6x2, num, str4, str3, list3, map3, map2);
    }

    public static C23736Boh A02(C23736Boh boh, List list) {
        C23736Boh boh2 = boh;
        List list2 = list;
        if (list2 == boh2.A06) {
            return boh;
        }
        DOZ doz = boh2.A00;
        E8A e8a = boh2.A04;
        Map map = boh2.A09;
        C26050CrK crK = boh2.A01;
        C24807CLa cLa = boh2.A02;
        Map map2 = boh2.A0A;
        C22415B6x b6x = boh2.A01;
        CFu cFu = boh2.A03;
        String str = boh2.A07;
        String str2 = boh2.A06;
        String str3 = str;
        Integer num = boh2.A05;
        C22415B6x b6x2 = b6x;
        E8A e8a2 = e8a;
        C199029zJ r20 = boh2.A05;
        CFu cFu2 = cFu;
        C24807CLa cLa2 = cLa;
        C26050CrK crK2 = crK;
        C23736Boh boh3 = new C23736Boh((E9O) null, doz, (DOZ) null, crK2, cLa2, cFu2, r20, e8a2, b6x2, num, str3, str2, list2, map, map2);
        C26968DNq dNq = boh3.A04;
        CopyOnWriteArraySet copyOnWriteArraySet = boh2.A04.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            dNq.A00.addAll(copyOnWriteArraySet);
        }
        return boh3;
    }

    public Object A04(C199029zJ r2, String str) {
        if (str.startsWith("#")) {
            return CCJ.A00(r2, C25881Cns.A01(this, str.substring(1)), this);
        }
        return super.A04(r2, str);
    }
}
