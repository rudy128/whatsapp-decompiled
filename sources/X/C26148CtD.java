package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CtD  reason: case insensitive filesystem */
public final class C26148CtD {
    public final C28583E8u A00;

    public static final void A01(C25174CaQ caQ) {
        C18070vi.A0d(caQ, 0);
        new DPH(C25419CfR.A00);
        A01(caQ);
        throw null;
    }

    public final Object A02(C4Q c4q) {
        C18070vi.A0d(c4q, 0);
        if (!(c4q instanceof C23931BsR) && !(c4q instanceof C23932BsS) && !(c4q instanceof C23933BsT) && !(c4q instanceof C23934BsU)) {
            if (c4q instanceof C23937BsX) {
                C173038uQ r3 = new C173038uQ(AnonymousClass8BR.A1A());
                try {
                    Iterator it = ((C23937BsX) c4q).A00.iterator();
                    while (it.hasNext()) {
                        C4Q c4q2 = (C4Q) it.next();
                        C18070vi.A0b(c4q2);
                        Object A02 = A02(c4q2);
                        C30691eM.A01(A02);
                        r3.A00((C180759Nu) A02);
                    }
                    return r3;
                } catch (Throwable th) {
                    return C108945cZ.A1J(th);
                }
            } else if (!(c4q instanceof C23936BsW)) {
                if (c4q instanceof C23938BsY) {
                    C173028uP r32 = new C173028uP(C17880vN.A15());
                    Iterator it2 = ((C23938BsY) c4q).A00.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(it2);
                        String A0x = C17880vN.A0x(A16);
                        Object A022 = A02((C4Q) A16.getValue());
                        C30691eM.A01(A022);
                        r32.A00((C180759Nu) A022, A0x);
                    }
                    return r32;
                } else if (!(c4q instanceof C23935BsV)) {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        return this.A00.BK3(c4q);
    }

    public final Object A03(C25765Clc clc) {
        C18070vi.A0d(clc, 0);
        C173028uP r3 = new C173028uP(C17880vN.A15());
        try {
            Iterator it = clc.A00.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                String A0x = C17880vN.A0x(A16);
                Object A02 = A02((C4Q) A16.getValue());
                C30691eM.A01(A02);
                r3.A00((C180759Nu) A02, A0x);
            }
            return r3;
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    public final Object A04(C4V c4v) {
        C4V c4v2;
        C18070vi.A0d(c4v, 0);
        if (c4v instanceof C23964Bsy) {
            return A00(((C23964Bsy) c4v).A00);
        }
        if (c4v instanceof C23965Bsz) {
            C25170CaM caM = ((C23965Bsz) c4v).A00;
            return this.A00.BK2(caM.A01, caM.A00.A01);
        } else if (c4v instanceof Bt0) {
            return A02(((Bt0) c4v).A00);
        } else {
            if (c4v instanceof Bt1) {
                C25207Cb0 cb0 = ((Bt1) c4v).A00;
                C173028uP r4 = new C173028uP(C17880vN.A15());
                try {
                    r4.A00(C181389Qh.A00(cb0.A02), "message");
                    ArrayList arrayList = cb0.A03;
                    if (arrayList != null) {
                        C173038uQ r2 = new C173038uQ(AnonymousClass8BR.A1A());
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            C25174CaQ caQ = (C25174CaQ) it.next();
                            C18070vi.A0b(caQ);
                            A01(caQ);
                            throw null;
                        }
                        r4.A00(r2, "locations");
                    }
                    A2U a2u = cb0.A01;
                    if (a2u != null) {
                        C173038uQ A002 = a2u.A00();
                        C30691eM.A01(A002);
                        r4.A00(A002, "path");
                    }
                    C25765Clc clc = cb0.A00;
                    if (clc == null) {
                        return r4;
                    }
                    Object A03 = A03(clc);
                    C30691eM.A01(A03);
                    r4.A00((C180759Nu) A03, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
                    return r4;
                } catch (Throwable th) {
                    return C108945cZ.A1J(th);
                }
            } else if (c4v instanceof Bt2) {
                return A03(((Bt2) c4v).A00);
            } else {
                if (c4v instanceof Bt3) {
                    C4S c4s = ((Bt3) c4v).A00;
                    if (!(c4s instanceof C23945Bsf)) {
                        if (c4s instanceof C23947Bsh) {
                            return A04(((C23947Bsh) c4s).A00);
                        }
                        if (!(c4s instanceof C23946Bsg)) {
                            throw AnonymousClass3MW.A14();
                        }
                    }
                    return C173018uO.A00;
                } else if (c4v instanceof Bt4) {
                    return ((Bt4) c4v).A00.A00();
                } else {
                    if (c4v instanceof Bt5) {
                        C25766Cld cld = ((Bt5) c4v).A00;
                        C173028uP r42 = new C173028uP(C17880vN.A15());
                        Iterator it2 = cld.A00.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(it2);
                            String A0x = C17880vN.A0x(A16);
                            C4R c4r = (C4R) A16.getValue();
                            if (c4r instanceof C23939BsZ) {
                                c4v2 = ((C23939BsZ) c4r).A00.A00;
                            } else if (c4r instanceof C23940Bsa) {
                                c4v2 = ((C23940Bsa) c4r).A00.A00;
                            } else {
                                throw AnonymousClass3MW.A14();
                            }
                            if (c4v2 != null) {
                                Object A04 = A04(c4v2);
                                C30691eM.A01(A04);
                                r42.A00((C180759Nu) A04, A0x);
                            }
                        }
                        return r42;
                    } else if (c4v instanceof Bt6) {
                        return this.A00.BK4(((Bt6) c4v).A00);
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26148CtD) && C18070vi.A18(this.A00, ((C26148CtD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C26148CtD(C28583E8u e8u) {
        this.A00 = e8u;
    }

    private final Object A00(DST dst) {
        C173038uQ r2 = new C173038uQ(AnonymousClass8BR.A1A());
        try {
            Iterator it = dst.iterator();
            while (it.hasNext()) {
                Object A04 = A04((C4V) it.next());
                C30691eM.A01(A04);
                r2.A00((C180759Nu) A04);
            }
            return r2;
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoJsonValueEncoder(scalarEncoder=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C26148CtD() {
        this(new DPH(C25419CfR.A00));
    }
}
