package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.Cce  reason: case insensitive filesystem */
public final class C25281Cce {
    public final C28503E4l A00;
    public final C199410f A01;

    public void A00(CKR ckr) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A00(ckr);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onAuthenticateRequest", e);
            }
        }
    }

    public void A01(CKS cks) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A01(cks);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onAuthenticateResult", e);
            }
        }
    }

    public void A02(CKT ckt) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A02(ckt);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onQueryRequest", e);
            }
        }
    }

    public void A03(CKU cku) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A03(cku);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onQueryResult", e);
            }
        }
    }

    public void A04(CKV ckv) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A04(ckv);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onRegisterRequest", e);
            }
        }
    }

    public void A05(CKW ckw) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A05(ckw);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onRegisterResult", e);
            }
        }
    }

    public void A06(CKX ckx) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A06(ckx);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onStartRequest", e);
            }
        }
    }

    public void A07(CKY cky) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A07(cky);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onStartResult", e);
            }
        }
    }

    public void A08(Throwable th) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A08(th);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onAuthenticateError", e);
            }
        }
    }

    public void A09(Throwable th) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A09(th);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onQueryError", e);
            }
        }
    }

    public void A0A(Throwable th) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A0A(th);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onRegisterError", e);
            }
        }
    }

    public void A0B(Throwable th) {
        AnonymousClass1IZ it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                ((C25281Cce) it.next()).A0B(th);
            } catch (Exception e) {
                this.A00.CFJ("ClientListenerRouter.onStartError", e);
            }
        }
    }

    public C25281Cce(C28503E4l e4l, Set set) {
        this.A01 = C199410f.copyOf((Collection) set);
        this.A00 = e4l;
    }
}
