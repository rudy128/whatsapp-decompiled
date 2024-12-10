package X;

import com.whatsapp.newsletter.insights.viewmodel.NewsletterInsightsViewModel$fetchNewsletterInsights$1;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3VG  reason: invalid class name */
public final class AnonymousClass3VG extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass11P A02;
    public final C29681ch A03;
    public final C85014Lt A04;
    public final C35681md A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1CJ A07;
    public final C18030ve A08;

    public final Integer A0T(C87234Uu r5, C22821Di r6) {
        Object obj;
        C18070vi.A0d(r5, 0);
        List A0U = A0U(r5);
        if (A0U == null) {
            return null;
        }
        Iterator it = A0U.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass000.A1Y(r6.invoke(obj))) {
                break;
            }
        }
        C87104Uh r1 = (C87104Uh) obj;
        if (r1 != null) {
            return Integer.valueOf((int) r1.A00);
        }
        return null;
    }

    public final List A0U(C87234Uu r2) {
        AnonymousClass4UM r0;
        C18070vi.A0d(r2, 0);
        Map map = (Map) this.A00.A06();
        if (map == null || (r0 = (AnonymousClass4UM) map.get(r2)) == null) {
            return null;
        }
        return r0.A02;
    }

    public final void A0V(Set set, boolean z) {
        long j;
        C46162Dk r1;
        C18070vi.A0d(set, 0);
        C29691ci A0A = this.A07.A0A(this.A03);
        if (!(A0A instanceof C46162Dk) || (r1 = (C46162Dk) A0A) == null) {
            j = 0;
        } else {
            j = r1.A0G;
        }
        if (j >= ((long) C18020vd.A00(C18040vf.A02, this.A08, 9447))) {
            AnonymousClass3MX.A1Q(new NewsletterInsightsViewModel$fetchNewsletterInsights$1(this, set, (C30391dr) null, z), C41561wd.A00(this));
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A03(this, (C87234Uu) it.next(), C821643h.A0D);
        }
        A00(this);
    }

    public static final void A00(AnonymousClass3VG r3) {
        Object obj;
        AnonymousClass1DT r2 = r3.A06;
        C85014Lt r0 = r3.A04;
        C29681ch r1 = r3.A03;
        Map map = (Map) r0.A00.A06();
        if (map != null) {
            obj = map.get(r1);
        } else {
            obj = null;
        }
        r2.A0E(obj);
    }

    public static final void A03(AnonymousClass3VG r3, C87234Uu r4, AnonymousClass4UM r5) {
        Map map;
        C85014Lt r0 = r3.A04;
        C29681ch r32 = r3.A03;
        C18070vi.A0j(r4, r5);
        AnonymousClass1DT r2 = r0.A00;
        Map map2 = (Map) r2.A06();
        if (map2 == null || (map = (Map) map2.get(r32)) == null) {
            map = C17880vN.A13();
            Map map3 = (Map) r2.A06();
            if (map3 != null) {
                map3.put(r32, map);
            }
        }
        map.put(r4, r5);
    }

    public static final boolean A04(AnonymousClass3VG r5) {
        C46162Dk r1;
        C29691ci A0A = r5.A07.A0A(r5.A03);
        Long l = null;
        if ((A0A instanceof C46162Dk) && (r1 = (C46162Dk) A0A) != null) {
            l = Long.valueOf(r5.A02.A09(r1.A0E));
        }
        Calendar instance = Calendar.getInstance();
        instance.add(5, -30);
        long timeInMillis = instance.getTimeInMillis();
        if (l == null || l.longValue() >= timeInMillis) {
            return false;
        }
        return true;
    }

    public final boolean A0W(String str) {
        Collection<AnonymousClass4UM> values;
        Map map = (Map) this.A00.A06();
        if (map == null || (values = map.values()) == null || values.isEmpty()) {
            return false;
        }
        for (AnonymousClass4UM r0 : values) {
            if (C18070vi.A18(r0.A01, str)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3VG(AnonymousClass11P r3, AnonymousClass1CJ r4, C18030ve r5, C29681ch r6, C35681md r7) {
        Map map;
        C18070vi.A0s(r3, r5, r4, r7);
        this.A02 = r3;
        this.A08 = r5;
        this.A07 = r4;
        this.A05 = r7;
        this.A03 = r6;
        C85014Lt r0 = (C85014Lt) C221618v.A01(16499);
        this.A04 = r0;
        DVM dvm = new DVM();
        Map map2 = (Map) r0.A00.A06();
        if (!(map2 == null || (map = (Map) map2.get(r6)) == null)) {
            dvm.putAll(map);
        }
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(C200610r.A05(dvm));
        this.A06 = A0M;
        this.A00 = A0M;
        this.A01 = AnonymousClass3MW.A0L();
    }
}
