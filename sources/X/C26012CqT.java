package X;

import android.os.Handler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.CqT  reason: case insensitive filesystem */
public class C26012CqT {
    public static final Handler A0C = C17890vO.A0D();
    public C25166CaH A00;
    public final Handler A01;
    public final E86 A02;
    public final CLZ A03;
    public final CX0 A04;
    public final CQK A05;
    public final CYP A06 = new CYP();
    public final Object A07;
    public final Object A08;
    public final Runnable A09;
    public final List A0A;
    public final Executor A0B;

    public /* synthetic */ C26012CqT(E86 e86, E9K e9k, CQK cqk, CMB cmb) {
        C25167CaI caI;
        C25167CaI caI2;
        C18070vi.A0d(cmb, 2);
        Handler handler = new Handler(CFt.A00.getLooper());
        CX0 cx0 = new CX0(e9k, cqk, cmb);
        this.A02 = e86;
        this.A01 = handler;
        this.A04 = cx0;
        this.A05 = cqk;
        Object A0p = C17880vN.A0p();
        this.A08 = A0p;
        synchronized (A0p) {
            DNZ dnz = new DNZ(this, 0);
            synchronized (cqk.A02) {
                CWI cwi = cqk.A01;
                C26952DNa dNa = new C26952DNa(cqk, dnz);
                DNY dny = cwi.A02;
                DNZ dnz2 = new DNZ(dNa, 1);
                synchronized (dny.A03) {
                    caI = new C25167CaI(dny.A01.A00(dnz2), new DNX(dny.A00));
                }
                C25167CaI caI3 = new C25167CaI(caI.A01, new C25138CZo(((DNX) caI.A00).A00));
                C25166CaH caH = new C25166CaH((C25138CZo) caI3.A00, (C25138CZo) null);
                cqk.A00 = caH;
                caI2 = new C25167CaI(new C27080DTf(caI3), caH);
            }
            C25166CaH caH2 = (C25166CaH) caI2.A00;
            C18070vi.A0d(caH2, 0);
            this.A00 = caH2;
            this.A09 = caI2.A01;
        }
        this.A07 = C17880vN.A0p();
        this.A0B = new C27137DVy(handler);
        this.A0A = AnonymousClass000.A13();
        this.A03 = new CLZ(this);
    }

    public final C4E A01(String str, Map map, C22821Di r8, long j) {
        C4E A002;
        String A003 = C26177Ctv.A00(str, map);
        synchronized (this.A07) {
            A002 = A00(this, (C25166CaH) null, A003, j);
            if (A002 == null) {
                CQJ cqj = new CQJ(A003, r8, new C27978DpF(this));
                this.A0A.add(cqj);
                A002 = new C23722BoT(new C27080DTf((Object) cqj, 39));
            }
        }
        return A002;
    }

    public final void A02(String str, Map map, Set set) {
        C18070vi.A0d(str, 0);
        C18070vi.A0j(map, set);
        String A002 = C26177Ctv.A00(str, map);
        CWI cwi = this.A05.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((C24278Byb) it.next()).ordinal() == 0) {
                DNY dny = cwi.A02;
                C24157BwP bwP = new C24157BwP(A002, 1);
                synchronized (dny.A03) {
                    C20000A2o a2o = dny.A02;
                    a2o.A05(bwP, "ASYNC_COMPONENT");
                    DNY.A00(dny, a2o);
                }
            }
        }
    }

    public static final C23721BoS A00(C26012CqT cqT, C25166CaH caH, String str, long j) {
        C25138CZo cZo;
        E6F e6f;
        C23721BoS boS;
        try {
            AnonymousClass0O7.A01(C17890vO.A0Z("getCachedComponentsOrSubscribeToQuery:syncFetchResponseForKey", AnonymousClass000.A11("BloksComponentQueryStore"), ':'));
            if (caH != null) {
                cZo = caH.A00;
            } else {
                cZo = null;
            }
            CWI cwi = cqT.A05.A01;
            long now = cwi.A00.now();
            LinkedHashMap A13 = C17880vN.A13();
            LinkedHashMap A132 = C17880vN.A13();
            A132.put(C17890vO.A0Z("query_src", AnonymousClass000.A11("write_through_cache"), '_'), "cache");
            if (cZo != null) {
                e6f = new DNX(cZo.A00);
            } else {
                e6f = cwi.A02;
            }
            String str2 = str;
            CO9 COx = e6f.COx(str2);
            if (COx == null || !(COx instanceof C23727BoY) || !C26177Ctv.A02(COx, j, now)) {
                AnonymousClass0O7.A00();
                return null;
            }
            A132.put(C17890vO.A0Z("cache_src", AnonymousClass000.A11("write_through_cache"), '_'), "memory");
            AnonymousClass1D6 A012 = AnonymousClass1D6.A01(COx, new CO7(AnonymousClass1D7.A0F(A13), AnonymousClass1D7.A0F(A132)));
            CO9 co9 = (CO9) A012.first;
            if (co9 instanceof C23727BoY) {
                boS = new C23721BoS(new C23723BoU(((C23727BoY) co9).A00, (CO7) A012.second, str2));
            } else {
                boS = null;
            }
            AnonymousClass0O7.A00();
            return boS;
        } catch (Exception e) {
            Object[] A1a = AnonymousClass3MW.A1a();
            BE6.A1M(e, A1a, 0);
            String format = String.format("Exception encountered when trying to perform syncFetchResponseForKey inside BloksComponentQueryWriteThroughCache: %s", Arrays.copyOf(A1a, 1));
            C18070vi.A0X(format);
            C25913CoX.A01("BloksComponentQueryStore", format);
            return null;
        } catch (Throwable th) {
            AnonymousClass0O7.A00();
            throw th;
        }
    }
}
