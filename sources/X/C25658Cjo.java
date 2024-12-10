package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Cjo  reason: case insensitive filesystem */
public final class C25658Cjo {
    public static final C25658Cjo A02 = new C25658Cjo();
    public final C28455E1v A00 = new DJQ();
    public final ConcurrentMap A01 = AnonymousClass8BR.A17();

    public final E9l A00(Class cls) {
        CB4 cb4;
        CH2 ch2;
        CB6 cb6;
        CB2 cb2;
        CB3 cb3;
        CB6 cb62;
        CB2 cb22;
        Class cls2;
        Charset charset = CI7.A02;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            E9l e9l = (E9l) concurrentMap.get(cls);
            if (e9l == null) {
                DJQ djq = (DJQ) this.A00;
                CB6 cb63 = C25451Cg2.A01;
                Class<C23267BeH> cls3 = C23267BeH.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C25451Cg2.A02) == null || cls2.isAssignableFrom(cls)) {
                    C28453E1t CTD = djq.A00.CTD(cls);
                    DJJ djj = (DJJ) CTD;
                    int i = djj.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            cb62 = C25451Cg2.A01;
                            cb22 = CH1.A00;
                        } else {
                            cb62 = C25451Cg2.A00;
                            cb22 = CH1.A01;
                            if (cb22 == null) {
                                throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        e9l = new DJO(cb22, djj.A01, cb62);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        boolean A1O = AnonymousClass000.A1O(i & 1);
                        if (isAssignableFrom) {
                            cb4 = CH4.A01;
                            ch2 = CH2.A01;
                            cb6 = C25451Cg2.A01;
                            if (A1O) {
                                cb2 = CH1.A00;
                                cb3 = CH3.A01;
                            } else {
                                cb2 = null;
                                cb3 = CH3.A01;
                            }
                        } else {
                            cb4 = CH4.A00;
                            ch2 = CH2.A00;
                            cb6 = C25451Cg2.A00;
                            if (A1O) {
                                cb2 = CH1.A01;
                                if (cb2 != null) {
                                    cb3 = CH3.A00;
                                } else {
                                    throw AnonymousClass000.A0n("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                cb2 = null;
                                cb3 = CH3.A00;
                            }
                        }
                        e9l = DJP.A06(cb2, ch2, cb3, CTD, cb4, cb6);
                    }
                    E9l e9l2 = (E9l) concurrentMap.putIfAbsent(cls, e9l);
                    if (e9l2 != null) {
                        return e9l2;
                    }
                } else {
                    throw AnonymousClass000.A0k("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return e9l;
        }
        throw AnonymousClass000.A0s("messageType");
    }
}
