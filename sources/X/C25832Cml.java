package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cml  reason: case insensitive filesystem */
public abstract class C25832Cml {
    public static final DUI A06 = new DUI(false);
    public static final DUI A07 = new DUI(true);
    public long A00 = Long.MAX_VALUE;
    public final long A01;
    public final CZT A02;
    public final List A03 = AnonymousClass000.A13();
    public final Queue A04 = new PriorityQueue(16, A07);
    public final Set A05;

    public void A00() {
        for (C6R c6r : this.A05) {
            String str = c6r.A01;
            A02(str);
            A03(str);
        }
    }

    public final void A01(long j) {
        List list;
        boolean z;
        long j2 = j;
        if (j < this.A00) {
            Queue queue = this.A04;
            queue.clear();
            queue.addAll(this.A03);
        }
        while (true) {
            Queue queue2 = this.A04;
            if (queue2.isEmpty() || this.A01 + j < ((C6R) queue2.peek()).A00.A03(TimeUnit.MICROSECONDS)) {
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                ArrayList A133 = AnonymousClass000.A13();
                Set<C6R> set = this.A05;
            } else {
                C6R c6r = (C6R) queue2.poll();
                if (j < c6r.A00.A02(TimeUnit.MICROSECONDS)) {
                    Set set2 = this.A05;
                    if (!set2.contains(c6r)) {
                        set2.add(c6r);
                        String str = c6r.A01;
                        if (!(this instanceof BW8) && (this instanceof BW7)) {
                            C26236CvW cvW = ((BW7) this).A00;
                            int parseInt = Integer.parseInt(str);
                            C26052CrM crM = cvW.A08.A06;
                            if (crM != null) {
                                Map map = cvW.A0L;
                                Integer valueOf = Integer.valueOf(parseInt);
                                if (!map.containsKey(valueOf)) {
                                    E7q e7q = cvW.A0G;
                                    boolean A022 = cvW.A08.A08.A02();
                                    C25833Cmm A032 = crM.A03(C24322BzJ.AUDIO, parseInt);
                                    C28111Yx.A02(A032);
                                    Iterator A0y = AnonymousClass8BV.A0y(A032.A04);
                                    while (true) {
                                        if (!A0y.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                        C25271CcJ ccJ = (C25271CcJ) A0y.next();
                                        if (!ccJ.A02(A022)) {
                                            try {
                                                File file = ccJ.A05;
                                                C28111Yx.A02(file);
                                                C25092CXd A0I = BE7.A0I(e7q, file);
                                                if (A0I == null || A0I.A0K) {
                                                    break;
                                                }
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                    z = true;
                                    BE7.A1J(valueOf, map, z);
                                }
                                if (Boolean.FALSE.equals(map.get(valueOf))) {
                                }
                            }
                            C17880vN.A1O(cvW.A0M.submit(new DVi(cvW, parseInt, 0, crM)), cvW.A0K, parseInt);
                        }
                    }
                }
            }
        }
        ArrayList A134 = AnonymousClass000.A13();
        ArrayList A1322 = AnonymousClass000.A13();
        ArrayList A1332 = AnonymousClass000.A13();
        Set<C6R> set3 = this.A05;
        for (C6R c6r2 : set3) {
            A5W a5w = c6r2.A00;
            boolean A052 = a5w.A05(j2, TimeUnit.MICROSECONDS);
            boolean z2 = c6r2.A02;
            if (!A052) {
                if (z2) {
                    A1332.add(c6r2);
                }
            } else if (!z2) {
                A134.add(c6r2);
            }
            long j3 = this.A01;
            if (j - j3 > a5w.A02(TimeUnit.MICROSECONDS) || j3 + j < a5w.A03(TimeUnit.MICROSECONDS)) {
                A1322.add(c6r2);
            }
        }
        DUI dui = A06;
        Collections.sort(A1332, dui);
        Iterator it = A1332.iterator();
        while (it.hasNext()) {
            C6R c6r3 = (C6R) it.next();
            c6r3.A02 = false;
            A02(c6r3.A01);
        }
        Collections.sort(A134, A07);
        Iterator it2 = A134.iterator();
        while (it2.hasNext()) {
            C6R c6r4 = (C6R) it2.next();
            c6r4.A02 = true;
            String str2 = c6r4.A01;
            if (this instanceof BW9) {
                BW9 bw9 = (BW9) this;
                E1R e1r = bw9.A01;
                MediaEffect mediaEffect = ((C24920CPr) C26159CtX.A00(str2, bw9.A02)).A01;
                DHK dhk = (DHK) e1r;
                int i = dhk.A00;
                Object obj = dhk.A01;
                if (i != 0) {
                    C25001CTb cTb = ((C26243Cvh) obj).A0J;
                    C18070vi.A0d(mediaEffect, 1);
                    Iterator A15 = AnonymousClass000.A15(cTb.A07);
                    while (A15.hasNext()) {
                        ((DHS) C17890vO.A0P(A15)).BB9(mediaEffect);
                    }
                } else {
                    Object A0w = AnonymousClass000.A0w(((C25242Cbd) obj).A01, 0);
                    C26159CtX.A01(A0w);
                    ((EAX) A0w).BBA(mediaEffect);
                }
            } else if (this instanceof BW8) {
                BW8 bw8 = (BW8) this;
                if (bw8.A00 != 0) {
                    int parseInt2 = Integer.parseInt(str2);
                    DHM dhm = (DHM) ((E1T) bw8.A02);
                    int i2 = dhm.A00;
                    Object obj2 = dhm.A01;
                    if (i2 != 0) {
                        Object A0w2 = AnonymousClass000.A0w(((C25242Cbd) obj2).A01, 0);
                        C26159CtX.A01(A0w2);
                        ((EAX) A0w2).BBq(parseInt2);
                    } else {
                        Iterator A152 = AnonymousClass000.A15(((C25001CTb) obj2).A07);
                        while (A152.hasNext()) {
                            ((DHS) C17890vO.A0P(A152)).BBq(parseInt2);
                        }
                    }
                } else {
                    Object obj3 = ((Map) bw8.A02).get(str2);
                    C28111Yx.A02(obj3);
                    C24918CPp cPp = (C24918CPp) obj3;
                    Integer num = cPp.A02;
                    MediaEffect mediaEffect2 = cPp.A01;
                    int intValue = num.intValue();
                    C25953CpL cpL = ((C26236CvW) bw8.A01).A0F.A01;
                    if (intValue == -1) {
                        if (!(mediaEffect2 instanceof BW5)) {
                            throw BE6.A0v(AnonymousClass001.A1E(mediaEffect2, "MediaEffect: ", AnonymousClass000.A10()));
                        }
                        list = cpL.A04;
                    } else if (intValue < 0 || !(mediaEffect2 instanceof BW5)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Track Index: ");
                        A10.append(num);
                        throw BE6.A0v(AnonymousClass001.A1E(mediaEffect2, ", MediaEffect: ", A10));
                    } else {
                        list = cpL.A02[intValue];
                    }
                    list.add(mediaEffect2);
                }
            } else {
                C24994CSu cSu = ((BW7) this).A00.A0F;
                cSu.A01.A03[Integer.parseInt(str2)] = true;
            }
        }
        Collections.sort(A1322, dui);
        Iterator it3 = A1322.iterator();
        while (it3.hasNext()) {
            A03(((C6R) it3.next()).A01);
        }
        set3.removeAll(A1322);
        this.A00 = j2;
    }

    public void A02(String str) {
        List list;
        if (this instanceof BW9) {
            BW9 bw9 = (BW9) this;
            E1Q e1q = bw9.A00;
            MediaEffect mediaEffect = ((C24920CPr) C26159CtX.A00(str, bw9.A02)).A01;
            DHJ dhj = (DHJ) e1q;
            int i = dhj.A00;
            Object obj = dhj.A01;
            if (i != 0) {
                C25001CTb cTb = ((C26243Cvh) obj).A0J;
                C18070vi.A0d(mediaEffect, 1);
                Iterator A15 = AnonymousClass000.A15(cTb.A07);
                while (A15.hasNext()) {
                    ((DHS) C17890vO.A0P(A15)).CEg(mediaEffect);
                }
                return;
            }
            Object A0w = AnonymousClass000.A0w(((C25242Cbd) obj).A01, 0);
            C26159CtX.A01(A0w);
            ((EAX) A0w).CEh(mediaEffect);
        } else if (this instanceof BW8) {
            BW8 bw8 = (BW8) this;
            if (bw8.A00 != 0) {
                Integer.parseInt(str);
                DHL dhl = (DHL) ((E1S) bw8.A01);
                int i2 = dhl.A00;
                Object obj2 = dhl.A01;
                if (i2 != 0) {
                    Object A0w2 = AnonymousClass000.A0w(((C25242Cbd) obj2).A01, 0);
                    C26159CtX.A01(A0w2);
                    ((EAX) A0w2).CF6();
                    return;
                }
                Iterator A152 = AnonymousClass000.A15(((C25001CTb) obj2).A07);
                while (A152.hasNext()) {
                    ((DHS) C17890vO.A0P(A152)).CF5();
                }
                return;
            }
            Object obj3 = ((Map) bw8.A02).get(str);
            C28111Yx.A02(obj3);
            C24918CPp cPp = (C24918CPp) obj3;
            Integer num = cPp.A02;
            MediaEffect mediaEffect2 = cPp.A01;
            int intValue = num.intValue();
            C25953CpL cpL = ((C26236CvW) bw8.A01).A0F.A01;
            if (intValue == -1) {
                if (!(mediaEffect2 instanceof BW5)) {
                    throw C17880vN.A0y();
                }
                list = cpL.A04;
            } else if (intValue < 0 || !(mediaEffect2 instanceof BW5)) {
                throw C17880vN.A0y();
            } else {
                list = cpL.A02[intValue];
            }
            list.remove(mediaEffect2);
        } else {
            C24994CSu cSu = ((BW7) this).A00.A0F;
            cSu.A01.A03[Integer.parseInt(str)] = false;
        }
    }

    public void A03(String str) {
        if (!(this instanceof BW8) && (this instanceof BW7)) {
            C26236CvW cvW = ((BW7) this).A00;
            Object remove = cvW.A0K.remove(Integer.valueOf(Integer.parseInt(str)));
            if (remove != null) {
                cvW.A0J.add(cvW.A0M.submit(new DVY(cvW, remove, 14)));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.C6R, java.lang.Object] */
    public C25832Cml(CZT czt, Map map, long j) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            List list = this.A03;
            String A0x = C17880vN.A0x(A16);
            ? obj = new Object();
            obj.A01 = A0x;
            obj.A00 = (A5W) A16.getValue();
            list.add(obj);
        }
        this.A01 = TimeUnit.MILLISECONDS.toMicros(j);
        this.A05 = C17880vN.A12();
        this.A02 = czt;
    }
}
