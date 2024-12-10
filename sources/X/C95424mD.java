package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4mD  reason: invalid class name and case insensitive filesystem */
public final class C95424mD implements C28741ap {
    public final AnonymousClass1DT A00;
    public final AnonymousClass1CJ A01;

    private final C86924Tp A01(AnonymousClass1BI r9) {
        C46162Dk r4;
        C29691ci A0A = this.A01.A0A(r9);
        if (!(A0A instanceof C46162Dk) || (r4 = (C46162Dk) A0A) == null) {
            return null;
        }
        C86924Tp r3 = new C86924Tp(C46162Dk.A00((C29691ci) null, (C179509Ig) null, r4, -1, 0), true);
        AnonymousClass1DT r2 = this.A00;
        Map map = (Map) r2.A06();
        if (map != null) {
            map.put(r3.A00.A08(), r3);
        }
        r2.A0F(r2.A06());
        return r3;
    }

    public /* synthetic */ void BoD(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public void BoG(AnonymousClass1BI r5, boolean z) {
        C18070vi.A0d(r5, 0);
        C86924Tp A012 = A01(r5);
        if (A012 != null) {
            AnonymousClass1DT r2 = this.A00;
            Map map = (Map) r2.A06();
            if (map != null) {
                map.put(A012.A00.A08(), A012);
            }
            r2.A0F(r2.A06());
        }
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoO(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
    }

    public void BoR(AnonymousClass1BI r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass1DT r1 = this.A00;
        Map map = (Map) r1.A06();
        if (map != null && map.remove(r4) != null) {
            C18070vi.A0d(r1, 0);
            r1.A0F(r1.A06());
        }
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public static C22801Dg A00(AnonymousClass440 r2) {
        return C22791Df.A01(r2.A02.A00, new C105765Tg(r2));
    }

    public final C86924Tp A02(AnonymousClass1BI r2) {
        C86924Tp r0;
        Map map = (Map) this.A00.A06();
        if (map == null || (r0 = (C86924Tp) map.get(r2)) == null) {
            return A01(r2);
        }
        return r0;
    }

    public C95424mD(AnonymousClass1CJ r3, AnonymousClass00H r4) {
        C18070vi.A0j(r3, r4);
        this.A01 = r3;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A00 = A0L;
        A0L.A0F(new ConcurrentHashMap());
        C72453Mb.A1Q(r4, this);
    }
}
