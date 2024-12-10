package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9ok  reason: invalid class name and case insensitive filesystem */
public final class C192649ok {
    public C129696iD A00;
    public Map[] A01;
    public boolean A02;
    public final AnonymousClass19T A03;
    public final C18140vp A04;

    public final C18140vp A00(AnonymousClass20E r3, int i) {
        String str;
        C18070vi.A0d(r3, 0);
        A01();
        C129696iD r1 = this.A00;
        if (r1 == null) {
            str = "metadata";
        } else if (i > r1.A00) {
            return null;
        } else {
            Map[] mapArr = this.A01;
            if (mapArr == null) {
                str = "integrationPointsFast";
            } else {
                Map map = mapArr[i];
                if (map != null) {
                    return (C18140vp) map.get(r3);
                }
                return null;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A01() {
        List list;
        String str;
        synchronized (this) {
            if (!this.A02) {
                AnonymousClass19T r5 = this.A03;
                r5.markerStart(314520282);
                C435620a.A00.A00(r5, 314520282);
                r5.markerPoint(314520282, "get_regs");
                Set<C20124A8j> set = (Set) this.A04.get();
                r5.markerPoint(314520282, "config_regs");
                C18070vi.A0b(set);
                for (C20124A8j A09 : set) {
                    A09.A09();
                }
                r5.markerPoint(314520282, "process_regs");
                C129696iD r7 = new C129696iD();
                ArrayList A0z = C17880vN.A0z(181);
                loop1:
                for (C20124A8j a8j : set) {
                    synchronized (a8j) {
                        try {
                            a8j.A09();
                            list = a8j.A03;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C172158sy r10 = (C172158sy) it.next();
                            C172138sw r0 = r10.A05;
                            if (r0 == null) {
                                str = "systemActionsBuilder";
                                break loop1;
                            }
                            ArrayList arrayList = r0.A00;
                            AnonymousClass20E r9 = r10.A07;
                            if (r9 == null) {
                                str = "messageClass";
                                break loop1;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int A0H = C72453Mb.A0H(it2);
                                AnonymousClass1D6.A02(Integer.valueOf(A0H), r9, r7.A01);
                                if (A0H > r7.A00) {
                                    r7.A00 = A0H;
                                }
                            }
                            C436520j r92 = r10.A04;
                            if (r92 == null) {
                                str = "integrationPointsBuilder";
                                break loop1;
                            }
                            LinkedHashMap A13 = C17880vN.A13();
                            for (AnonymousClass1D6 r02 : r92.A01) {
                                A13.put(r02.first, r02.second);
                            }
                            for (AnonymousClass1D6 r03 : r92.A00) {
                                A13.put(r03.first, r03.second);
                            }
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                AnonymousClass1D6.A02(Integer.valueOf(C72453Mb.A0H(it3)), A13, A0z);
                            }
                        }
                    }
                    C18070vi.A11(str);
                    th = null;
                    throw th;
                }
                r5.markerPoint(314520282, "init_state");
                this.A00 = r7;
                int i = r7.A00 + 1;
                Map[] mapArr = new Map[i];
                for (int i2 = 0; i2 < i; i2++) {
                    mapArr[i2] = null;
                }
                this.A01 = mapArr;
                Iterator it4 = A0z.iterator();
                while (it4.hasNext()) {
                    AnonymousClass1D6 r04 = (AnonymousClass1D6) it4.next();
                    int A042 = AnonymousClass3MZ.A04(r04);
                    Object obj = r04.second;
                    Object[] objArr = this.A01;
                    if (objArr == null) {
                        C18070vi.A11("integrationPointsFast");
                        throw null;
                    }
                    objArr[A042] = obj;
                }
                r5.markerPoint(314520282, "init_complete");
                this.A02 = true;
                r5.markerEnd(314520282, 2);
            }
        }
    }

    public C192649ok(AnonymousClass19T r1, C18140vp r2) {
        C18070vi.A0j(r1, r2);
        this.A03 = r1;
        this.A04 = r2;
    }
}
