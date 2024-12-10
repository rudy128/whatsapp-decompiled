package X;

import com.meta.common.monad.railway.Result;
import java.util.UUID;

/* renamed from: X.DqV  reason: case insensitive filesystem */
public final class C28055DqV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C24496C6o $ioLink;
    public final /* synthetic */ C26127Csp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28055DqV(C24496C6o c6o, C26127Csp csp) {
        super(1);
        this.this$0 = csp;
        this.$ioLink = c6o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BTX btx = (BTX) obj;
        C18070vi.A0d(btx, 0);
        C26127Csp csp = this.this$0;
        C24496C6o c6o = this.$ioLink;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("handleLinkSetup: info=");
        A10.append(btx);
        A10.append(" ioLink=");
        C26294Cx6.A06("lam:LinkedDevice", C17890vO.A0V(csp.A00, A10));
        C26149CtE ctE = csp.A06;
        ctE.A03();
        ctE.A04();
        csp.A08.reset();
        UUID uuid = btx.A05;
        UUID uuid2 = btx.A04;
        E57 e57 = btx.A01;
        E57 e572 = btx.A02;
        C18070vi.A0d(c6o, 0);
        BWE bwe = new BWE(c6o, e57, e572, uuid, uuid2);
        csp.A00 = bwe;
        C24374C0r c0r = btx.A03;
        C24374C0r c0r2 = C24374C0r.MAIN;
        if (c0r == c0r2) {
            C26294Cx6.A06("lam:LinkedDevice", "handleLinkSetup: Attach and activate on pipeline");
            C26149CtE ctE2 = csp.A05;
            CL6 A04 = ctE2.A04();
            if (A04 != null) {
                try {
                    A04.A00.flush();
                } catch (Throwable th) {
                    C30691eM.A00(th);
                }
            }
            ctE2.A06(bwe);
            if (AnonymousClass8BV.A1Z(ctE2.A0D)) {
                C26294Cx6.A06(ctE2.A0A, "Output activated");
            }
            ctE2.A03();
            ctE2.A07(bwe, btx.A00);
            ctE2.A05();
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("handleLinkSetup: newLink tx=");
        A102.append(bwe.A07);
        A102.append(" rx=");
        A102.append(bwe.A06);
        A102.append(", type=");
        C24276ByZ byZ = bwe.A02;
        A102.append(byZ);
        C26294Cx6.A06("lam:LinkedDevice", AnonymousClass001.A1E(c0r, ", state=", A102));
        C26256Cw0 cw0 = csp.A01;
        if (cw0 == null) {
            cw0 = new C26256Cw0(bwe, csp.A05, csp.A07);
            C26294Cx6.A06("lam:LinkedDevice", "handleLinkSetup: linkManager created");
            csp.A01 = cw0;
            cw0.A02 = new C27446DfX(csp, 11);
            cw0.A03 = new C27985DpM(csp);
            csp.A0A.add(new C27556DhN(csp));
        }
        if (c0r != c0r2) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Starting link switch, targetState=");
            A103.append(c0r);
            C26294Cx6.A06("lam:LinkedDevice", AnonymousClass001.A1E(byZ, ", type=", A103));
            Result A01 = C26127Csp.A01(bwe, btx.A00, cw0, csp, c0r);
            C27983DpK dpK = new C27983DpK(csp);
            boolean z = A01.A01;
            if (z) {
                dpK.invoke(A01.A00);
            }
            C27984DpL dpL = new C27984DpL(csp);
            if (!z) {
                dpL.invoke(A01.A00);
            }
        } else {
            csp.A0F.invoke(csp);
            C25691CkM ckM = csp.A03;
            if (ckM != null) {
                ckM.A01();
            }
            C26193CuL cuL = csp.A02;
            if (cuL != null) {
                cuL.A04();
            }
        }
        return C27621Wu.A00;
    }
}
