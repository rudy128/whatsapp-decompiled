package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Cjq  reason: case insensitive filesystem */
public final class C25660Cjq {
    public static final C25660Cjq A02 = new C25660Cjq();
    public final E2D A00 = new DKE();
    public final ConcurrentMap A01 = AnonymousClass8BR.A17();

    public final EAD A00(Class cls) {
        E2A e2a;
        CHJ chj;
        CBJ cbj;
        CBH cbh;
        E28 e28;
        CBJ cbj2;
        CBH cbh2;
        Class cls2;
        Charset charset = C25462CgF.A00;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            EAD ead = (EAD) concurrentMap.get(cls);
            if (ead == null) {
                DKE dke = (DKE) this.A00;
                Class cls3 = C26301CxE.A03;
                Class<C23484Bho> cls4 = C23484Bho.class;
                if (cls4.isAssignableFrom(cls) || (cls2 = C26301CxE.A03) == null || cls2.isAssignableFrom(cls)) {
                    E29 CTG = dke.A00.CTG(cls);
                    DK5 dk5 = (DK5) CTG;
                    int i = dk5.A00;
                    if ((i & 2) == 2) {
                        if (cls4.isAssignableFrom(cls)) {
                            cbj2 = C26301CxE.A02;
                            cbh2 = CHH.A00;
                        } else {
                            cbj2 = C26301CxE.A00;
                            cbh2 = CHH.A01;
                            if (cbh2 == null) {
                                throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        ead = new DKC(cbh2, dk5.A01, cbj2);
                    } else {
                        boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                        boolean A1T = AnonymousClass000.A1T(i & 1, 1);
                        if (isAssignableFrom) {
                            e2a = CHL.A01;
                            chj = CHJ.A01;
                            cbj = C26301CxE.A02;
                            if (A1T) {
                                cbh = CHH.A00;
                                e28 = CHK.A01;
                            } else {
                                cbh = null;
                                e28 = CHK.A01;
                            }
                        } else {
                            e2a = CHL.A00;
                            chj = CHJ.A00;
                            if (A1T) {
                                cbj = C26301CxE.A00;
                                cbh = CHH.A01;
                                if (cbh != null) {
                                    e28 = CHK.A00;
                                } else {
                                    throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                cbj = C26301CxE.A01;
                                cbh = null;
                                e28 = CHK.A00;
                            }
                        }
                        ead = DKD.A0G(cbh, chj, e28, CTG, e2a, cbj);
                    }
                    EAD ead2 = (EAD) concurrentMap.putIfAbsent(cls, ead);
                    if (ead2 != null) {
                        return ead2;
                    }
                } else {
                    throw AnonymousClass000.A0k("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return ead;
        }
        throw AnonymousClass000.A0s("messageType");
    }
}
