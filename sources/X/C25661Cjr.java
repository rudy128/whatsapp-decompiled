package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Cjr  reason: case insensitive filesystem */
public final class C25661Cjr {
    public static final C25661Cjr A02 = new C25661Cjr();
    public final ConcurrentMap A00 = AnonymousClass8BR.A17();
    public final C25507Ch5 A01 = new C25507Ch5();

    public EAO A00(Class cls) {
        Integer num;
        C24611CBp cBp;
        C25037CUq cUq;
        C25096CXo cXo;
        C24609CBn cBn;
        C25879Cnq cnq;
        C25096CXo cXo2;
        C24609CBn cBn2;
        Class cls2;
        Charset charset = CIC.A04;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            EAO eao = (EAO) concurrentMap.get(cls);
            if (eao == null) {
                C25507Ch5 ch5 = this.A01;
                C25096CXo cXo3 = C26298CxB.A02;
                Class<C23577Bm6> cls3 = C23577Bm6.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C26298CxB.A03) == null || cls2.isAssignableFrom(cls)) {
                    C24953CRd Bjp = ch5.A00.Bjp(cls);
                    int i = Bjp.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            cXo2 = C26298CxB.A02;
                            cBn2 = CHP.A01;
                        } else {
                            cXo2 = C26298CxB.A00;
                            cBn2 = CHP.A00;
                            if (cBn2 == null) {
                                throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        eao = new DNF(cBn2, Bjp.A01, cXo2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        if ((i & 1) == 1) {
                            num = AnonymousClass00R.A00;
                        } else {
                            num = AnonymousClass00R.A01;
                        }
                        boolean A1Z = AnonymousClass000.A1Z(num, AnonymousClass00R.A00);
                        if (isAssignableFrom) {
                            cBp = CHR.A01;
                            cUq = C25037CUq.A01;
                            cXo = C26298CxB.A02;
                            if (A1Z) {
                                cBn = CHP.A01;
                                cnq = CHQ.A01;
                            } else {
                                cBn = null;
                                cnq = CHQ.A01;
                            }
                        } else {
                            cBp = CHR.A00;
                            cUq = C25037CUq.A00;
                            if (A1Z) {
                                cXo = C26298CxB.A00;
                                cBn = CHP.A00;
                                if (cBn != null) {
                                    cnq = CHQ.A00;
                                } else {
                                    throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                cXo = C26298CxB.A01;
                                cBn = null;
                                cnq = CHQ.A00;
                            }
                        }
                        eao = DNG.A0M(cBn, cUq, cnq, cBp, Bjp, cXo);
                    }
                    EAO eao2 = (EAO) concurrentMap.putIfAbsent(cls, eao);
                    if (eao2 != null) {
                        return eao2;
                    }
                } else {
                    throw AnonymousClass000.A0k("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
            }
            return eao;
        }
        throw AnonymousClass000.A0s("messageType");
    }
}
