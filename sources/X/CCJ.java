package X;

import java.util.Collections;
import java.util.List;

public abstract class CCJ {
    /* JADX INFO: finally extract failed */
    public static Object A00(C199029zJ r13, E8A e8a, C25681CkC ckC) {
        Object obj;
        boolean z;
        C26299CxC cxC;
        C24809CLc cLc;
        C26968DNq dNq = ckC.A04;
        if (e8a instanceof C26972DNu) {
            if (AnonymousClass0O7.A01.A02()) {
                AnonymousClass0O7.A01("Parse script");
            }
            C26972DNu dNu = (C26972DNu) e8a;
            try {
                dNu.BKO();
                BE9.A13();
                C56 c56 = dNu.A01;
                COJ coj = dNu.A02;
                Object obj2 = c56.A00.A00;
                if (obj2 instanceof C25736Cl6) {
                    e8a = new C26971DNt(((C25736Cl6) obj2).A00(0), coj, (Object[]) null, (Object[]) null);
                } else {
                    e8a = null;
                    if (coj != null) {
                        throw AnonymousClass000.A0s("copy");
                    }
                }
            } catch (Throwable th) {
                BE9.A13();
                throw th;
            }
        }
        if (e8a instanceof C28669EDl) {
            C28669EDl eDl = (C28669EDl) e8a;
            eDl.BKO();
            C26971DNt CQH = eDl.CQH();
            dNq.BmZ(r13, e8a);
            try {
                List<Object> unmodifiableList = Collections.unmodifiableList(r13.A00);
                ThreadLocal threadLocal = CFw.A00;
                if (threadLocal.get() == null) {
                    cxC = new C26299CxC();
                    threadLocal.set(cxC);
                    z = true;
                } else {
                    cxC = (C26299CxC) threadLocal.get();
                    z = false;
                }
                try {
                    C24809CLc cLc2 = new C24809CLc(ckC);
                    int i = cxC.A01;
                    C26299CxC.A0G(cxC, unmodifiableList.size() + 1 + 5);
                    C26299CxC.A0H(cxC, (Object) null);
                    for (Object A0H : unmodifiableList) {
                        C26299CxC.A0H(cxC, A0H);
                    }
                    C26299CxC.A0I(cxC, new C25488Cgj(CQH), (Object) null, unmodifiableList.size(), cxC.A02);
                    cLc = cxC.A03;
                    cxC.A03 = cLc2;
                    C26299CxC.A0E(cxC);
                    cxC.A03 = cLc;
                    obj = BE8.A0c(cxC);
                    C26299CxC.A0F(cxC);
                    int i2 = cxC.A01;
                    if (i2 != i) {
                        Object[] A1b = AnonymousClass3MW.A1b();
                        BEA.A1V(A1b, i2, 0, i, 1);
                        throw new C27231DaA(AnonymousClass001.A1H("InvalidBytecode: ", String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", A1b), AnonymousClass000.A10()));
                    } else if (z) {
                        threadLocal.remove();
                    }
                } catch (C27231DaA e) {
                    throw e;
                } catch (RuntimeException e2) {
                    try {
                        throw new C27231DaA((Throwable) e2);
                    } catch (C27231DaA e3) {
                        if (z) {
                            try {
                                throw new C27230Da9(e3);
                            } catch (Throwable th2) {
                                if (z) {
                                    threadLocal.remove();
                                }
                                throw th2;
                            }
                        } else {
                            throw e3;
                        }
                    }
                } catch (Throwable th3) {
                    cxC.A03 = cLc;
                    throw th3;
                }
            } catch (C27230Da9 e4) {
                C27230Da9 da9 = new C27230Da9(e8a.BZU(), e4);
                dNq.C4Z(da9, e8a);
                throw da9;
            }
        } else {
            obj = null;
        }
        dNq.BlG(r13, e8a, obj);
        return obj;
    }
}
