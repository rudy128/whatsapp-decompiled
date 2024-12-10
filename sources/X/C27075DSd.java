package X;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DSd  reason: case insensitive filesystem */
public abstract class C27075DSd implements Runnable {
    public final /* synthetic */ C26905DIm A00;

    public /* synthetic */ C27075DSd(C26905DIm dIm) {
        this.A00 = dIm;
    }

    public final void run() {
        EDR edr;
        Set A12;
        C26905DIm dIm = this.A00;
        Lock lock = dIm.A0G;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                BZT bzt = (BZT) this;
                if (bzt.A00 != 0) {
                    C26905DIm dIm2 = (C26905DIm) bzt.A01;
                    C26909DIq dIq = dIm2.A0D;
                    BZB bzb = dIq.A05;
                    CTL ctl = dIm2.A0E;
                    if (ctl == null) {
                        A12 = Collections.emptySet();
                    } else {
                        A12 = AnonymousClass8BR.A12(ctl.A05);
                        Map map = ctl.A04;
                        Iterator A0x = AnonymousClass8BU.A0x(map);
                        while (A0x.hasNext()) {
                            C24924CPx cPx = (C24924CPx) A0x.next();
                            if (!dIq.A0A.containsKey(cPx.A01)) {
                                map.get(cPx);
                                throw AnonymousClass000.A0s("zaa");
                            }
                        }
                    }
                    bzb.A03 = A12;
                    ArrayList arrayList = (ArrayList) bzt.A02;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((EDS) arrayList.get(i)).BY1(dIm2.A00, bzb.A03);
                    }
                } else {
                    C26905DIm dIm3 = (C26905DIm) bzt.A01;
                    C25651Cjh cjh = new C25651Cjh(dIm3.A0C);
                    ArrayList A13 = AnonymousClass000.A13();
                    ArrayList A132 = AnonymousClass000.A13();
                    Map map2 = (Map) bzt.A02;
                    Iterator A0x2 = AnonymousClass8BU.A0x(map2);
                    while (A0x2.hasNext()) {
                        EDS eds = (EDS) A0x2.next();
                        if (!eds.CFd() || ((C26914DIv) map2.get(eds)).A00) {
                            A132.add(eds);
                        } else {
                            A13.add(eds);
                        }
                    }
                    int i2 = 0;
                    int i3 = -1;
                    if (A13.isEmpty()) {
                        int size2 = A132.size();
                        while (true) {
                            if (i2 >= size2) {
                                break;
                            }
                            i3 = cjh.A00(dIm3.A0B, (EDS) A132.get(i2));
                            i2++;
                            if (i3 == 0) {
                                break;
                            }
                        }
                        C23203Bcx bcx = new C23203Bcx(i3, (PendingIntent) null);
                        C26909DIq dIq2 = dIm3.A0D;
                        C108955ca.A1F(dIq2.A06, new BZW(bcx, bzt, dIm3), 1);
                    } else {
                        int size3 = A13.size();
                        while (true) {
                            if (i2 < size3) {
                                i3 = cjh.A00(dIm3.A0B, (EDS) A13.get(i2));
                                i2++;
                                if (i3 != 0) {
                                    break;
                                }
                            } else if (i3 != 0) {
                            }
                        }
                        C23203Bcx bcx2 = new C23203Bcx(i3, (PendingIntent) null);
                        C26909DIq dIq22 = dIm3.A0D;
                        C108955ca.A1F(dIq22.A06, new BZW(bcx2, bzt, dIm3), 1);
                    }
                    if (dIm3.A03 && (edr = dIm3.A01) != null) {
                        C23022BZy bZy = (C23022BZy) edr;
                        bZy.BFd(new C26913DIu(bZy));
                    }
                    Iterator A0x3 = AnonymousClass8BU.A0x(map2);
                    while (A0x3.hasNext()) {
                        EDS eds2 = (EDS) A0x3.next();
                        E5F e5f = (E5F) map2.get(eds2);
                        if (!eds2.CFd() || cjh.A00(dIm3.A0B, eds2) == 0) {
                            eds2.BFd(e5f);
                        } else {
                            C26909DIq dIq3 = dIm3.A0D;
                            C108955ca.A1F(dIq3.A06, new BZV(dIm3, e5f), 1);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            C108955ca.A1F(dIm.A0D.A06, e, 2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
