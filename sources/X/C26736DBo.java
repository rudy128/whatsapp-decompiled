package X;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: X.DBo  reason: case insensitive filesystem */
public final class C26736DBo implements C28603E9u {
    public DRN A00;
    public final SparseArray A01 = BE6.A0Q();
    public final CRI A02;
    public final boolean A03;

    public synchronized boolean BFj(int i) {
        boolean containsKey;
        CRI cri = this.A02;
        C28658ECt eCt = cri.A02;
        DAL dal = new DAL(cri.A00, i);
        C26757DCm dCm = (C26757DCm) eCt;
        synchronized (dCm) {
            C25248Cbn cbn = dCm.A02;
            synchronized (cbn) {
                containsKey = cbn.A02.containsKey(dal);
            }
        }
        return containsKey;
    }

    public synchronized DRN BNQ() {
        C28573E8e e8e;
        DRN drn;
        CSN csn;
        boolean z;
        if (!this.A03) {
            return null;
        }
        CRI cri = this.A02;
        while (true) {
            synchronized (cri) {
                try {
                    Iterator it = cri.A03.iterator();
                    if (it.hasNext()) {
                        e8e = (C28573E8e) it.next();
                        it.remove();
                    } else {
                        e8e = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            if (e8e != null) {
                C26757DCm dCm = (C26757DCm) cri.A02;
                synchronized (dCm) {
                    try {
                        csn = (CSN) dCm.A03.A02(e8e);
                        z = false;
                        if (csn != null) {
                            CSN csn2 = (CSN) dCm.A02.A02(e8e);
                            C26208Cuj.A01(csn2);
                            if (csn2.A00 == 0) {
                                z = true;
                            }
                            C26208Cuj.A05(z);
                            drn = csn2.A02;
                            z = true;
                        } else {
                            drn = null;
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                if (z) {
                    C26757DCm.A02(csn);
                    continue;
                }
                if (drn != null) {
                    break;
                }
            } else {
                drn = null;
                break;
            }
        }
        return A00(drn);
    }

    public synchronized DRN BNy(int i) {
        CRI cri;
        cri = this.A02;
        return A00(cri.A02.BMF(new DAL(cri.A00, i)));
    }

    public synchronized DRN BRZ() {
        DRN drn;
        DRN drn2 = this.A00;
        if (drn2 != null) {
            drn = drn2.A04();
        } else {
            drn = null;
        }
        return A00(drn);
    }

    public synchronized void Bv3(DRN drn, int i) {
        DRN drn2 = null;
        try {
            DRN A012 = DRN.A01(new BSE(drn, C25112CYh.A03, 0, 0));
            CRI cri = this.A02;
            DRN BDh = cri.A02.BDh(A012, cri.A01, new DAL(cri.A00, i));
            if (DRN.A02(BDh)) {
                SparseArray sparseArray = this.A01;
                DRN drn3 = (DRN) sparseArray.get(i);
                if (drn3 != null) {
                    drn3.close();
                }
                sparseArray.put(i, BDh);
                C26265CwA.A01(C26736DBo.class, Integer.valueOf(i), sparseArray, "cachePreparedFrame(%d) cached. Pending frames: %s");
            }
            A012.close();
        } catch (Throwable th) {
            if (drn2 != null) {
                drn2.close();
            }
            throw th;
        }
    }

    public synchronized void Bv4(DRN drn, int i) {
        synchronized (this) {
            try {
                SparseArray sparseArray = this.A01;
                DRN drn2 = (DRN) sparseArray.get(i);
                if (drn2 != null) {
                    sparseArray.delete(i);
                    drn2.close();
                    C26265CwA.A01(C26736DBo.class, Integer.valueOf(i), sparseArray, "removePreparedReference(%d) removed. Pending frames: %s");
                }
                DRN drn3 = null;
                try {
                    DRN A012 = DRN.A01(new BSE(drn, C25112CYh.A03, 0, 0));
                    DRN drn4 = this.A00;
                    if (drn4 != null) {
                        drn4.close();
                    }
                    CRI cri = this.A02;
                    this.A00 = cri.A02.BDh(A012, cri.A01, new DAL(cri.A00, i));
                    A012.close();
                } catch (Throwable th) {
                    th = th;
                    if (drn3 != null) {
                        drn3.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public synchronized void clear() {
        DRN drn = this.A00;
        if (drn != null) {
            drn.close();
        }
        this.A00 = null;
        SparseArray sparseArray = this.A01;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            DRN drn2 = (DRN) sparseArray.valueAt(i);
            if (drn2 != null) {
                drn2.close();
            }
        }
        sparseArray.clear();
    }

    public C26736DBo(CRI cri, boolean z) {
        this.A02 = cri;
        this.A03 = z;
    }

    public static final DRN A00(DRN drn) {
        try {
            if (DRN.A02(drn)) {
                C18070vi.A0b(drn);
                if (drn.A05() instanceof BSF) {
                    Object A05 = drn.A05();
                    C18070vi.A0z(A05, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                    DRN A002 = ((BSF) A05).A00();
                    drn.close();
                    return A002;
                }
            } else if (drn == null) {
                return null;
            }
            return null;
        } finally {
            if (drn != null) {
                drn.close();
            }
        }
    }
}
