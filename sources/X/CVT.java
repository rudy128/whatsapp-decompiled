package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;

public class CVT {
    public final C24929CQc A00;

    public synchronized void A00(C24829CLx cLx) {
        C219718c r0;
        C2I c2i;
        C26189CuF cuF;
        C26189CuF cuF2;
        try {
            C24929CQc cQc = this.A00;
            C24930CQd cQd = cQc.A02;
            C24965CRp cRp = cQc.A00;
            C28476E2r e2r = cQc.A01;
            if (cQd.A02) {
                Iterator it = ((C24830CLy) cQd.A01.get(cRp)).A00.iterator();
                while (it.hasNext()) {
                    C24978CSd cSd = (C24978CSd) it.next();
                    if (cSd.A03.isInstance(cLx)) {
                        C24965CRp cRp2 = cSd.A01;
                        C24965CRp cRp3 = cQc.A00;
                        if (!(cRp2 == cRp3 || (cuF2 = cRp3.A01) == null)) {
                            cuF2.A05(e2r, cLx, cSd, 1);
                        }
                        C26189CuF cuF3 = cSd.A00;
                        if (cuF3 != null) {
                            cuF3.A05(e2r, cLx, cSd, 2);
                        }
                        if (!(cRp2 == cQc.A00 || (cuF = cRp2.A00) == null)) {
                            cuF.A05(e2r, cLx, cSd, 3);
                        }
                        cQc.A00 = cRp2;
                    }
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("No valid transition from state: ");
                c2i = new C2I(AnonymousClass000.A0y(cRp.A03, A10));
            } else {
                c2i = new C2I("State machine map is not initialized - call build()");
            }
            throw c2i;
        } catch (C2I e) {
            if (!(e.getCause() instanceof C219718c)) {
                r0 = new C219718c(new SSLException("Internal Error", BE9.A0u(e)), (byte) 80);
            } else {
                r0 = (C219718c) e.getCause();
            }
            throw r0;
        }
    }

    public CVT(C27006DPc dPc) {
        C2I c2i;
        C24930CQd cQd = new C24930CQd();
        try {
            C24965CRp[] cRpArr = CIL.A0C;
            int i = 0;
            int i2 = 0;
            while (true) {
                C24965CRp cRp = cRpArr[i2];
                HashMap hashMap = cQd.A01;
                if (hashMap.get(cRp) != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("State already added: ");
                    c2i = new C2I(AnonymousClass000.A0y(cRp.A03, A10));
                    break;
                }
                boolean z = false;
                if (cRp.A02 == AnonymousClass00R.A00) {
                    z = true;
                    if (cQd.A00 != null) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Start state already exists, new state invalid: ");
                        c2i = new C2I(AnonymousClass000.A0y(cRp.A03, A102));
                        break;
                    }
                }
                hashMap.put(cRp, new C24830CLy());
                if (z) {
                    cQd.A00 = cRp;
                }
                i2++;
                if (i2 >= 12) {
                    C24978CSd[] cSdArr = CIU.A00;
                    while (true) {
                        C24978CSd cSd = cSdArr[i];
                        C24830CLy cLy = (C24830CLy) hashMap.get(cSd.A02);
                        if (cLy != null) {
                            if (hashMap.get(cSd.A01) == null) {
                                StringBuilder A103 = AnonymousClass000.A10();
                                A103.append("Cannot find output state for transition ");
                                c2i = new C2I(AnonymousClass000.A0y(cSd.A04, A103));
                                break;
                            }
                            cLy.A00.add(cSd);
                            i++;
                            if (i >= 31) {
                                if (cQd.A00 != null) {
                                    Iterator A0k = C17890vO.A0k(hashMap);
                                    while (true) {
                                        if (!A0k.hasNext()) {
                                            c2i = new C2I("State machine must have an end state");
                                            break;
                                        }
                                        Integer num = ((C24965CRp) A0k.next()).A02;
                                        Integer num2 = AnonymousClass00R.A0C;
                                        if (num == num2) {
                                            HashSet A12 = C17880vN.A12();
                                            Iterator A0i = C17890vO.A0i(hashMap);
                                            while (true) {
                                                if (A0i.hasNext()) {
                                                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                                                    if (((C24830CLy) A16.getValue()).A00.size() == 0 && ((C24965CRp) A16.getKey()).A02 != num2) {
                                                        StringBuilder A104 = AnonymousClass000.A10();
                                                        A104.append("Non-end state with no outbound transitions: ");
                                                        c2i = new C2I(AnonymousClass000.A0y(((C24965CRp) A16.getKey()).A03, A104));
                                                        break;
                                                    }
                                                    HashSet A122 = C17880vN.A12();
                                                    Iterator it = ((C24830CLy) A16.getValue()).A00.iterator();
                                                    while (it.hasNext()) {
                                                        A122.add(((C24978CSd) it.next()).A01);
                                                    }
                                                    A12.addAll(A122);
                                                } else if (hashMap.size() - A12.size() > 1) {
                                                    c2i = new C2I("Non-start state(s) with no incoming transitions exist(s)");
                                                } else if (hashMap.size() - A12.size() != 1 || !A12.contains(cQd.A00)) {
                                                    cQd.A02 = true;
                                                    this.A00 = new C24929CQc(dPc, cQd);
                                                    return;
                                                } else {
                                                    c2i = new C2I("Non-start state(s) with no incoming transitions exist(s)");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c2i = new C2I("State machine must have a start state");
                                }
                            }
                        } else {
                            StringBuilder A105 = AnonymousClass000.A10();
                            A105.append("Cannot find input state for transition ");
                            c2i = new C2I(AnonymousClass000.A0y(cSd.A04, A105));
                            break;
                        }
                    }
                }
            }
            throw c2i;
        } catch (C2I e) {
            throw new C219718c(new SSLException("Failed to init finite state machine.", BE9.A0u(e)), (byte) 80);
        }
    }
}
