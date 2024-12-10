package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2oL  reason: invalid class name and case insensitive filesystem */
public abstract class C60622oL {
    public static boolean A01(C42691ya r4, C42691ya r5) {
        int A00;
        if (r5 == null) {
            return false;
        }
        if (r4 == null) {
            A00 = 1;
        } else {
            A00 = AnonymousClass2US.A00(r4.hostStorage, r4.actualActors);
        }
        if (A00 == AnonymousClass2US.A00(r5.hostStorage, r5.actualActors)) {
            return false;
        }
        Arrays.toString(Thread.currentThread().getStackTrace());
        return true;
    }

    public static boolean A00(C35771mm r8, AnonymousClass1M9 r9, C24751Ln r10, C18030ve r11, AnonymousClass12L r12, AnonymousClass1MB r13, AnonymousClass1BI r14) {
        boolean z;
        boolean z2;
        if (C22971Dz.A0e(r14) || C42761yh.A01(r12, r14) || C43381zi.A01(r11, r14) || r13.A03(r14)) {
            return false;
        }
        if ((r14 instanceof AnonymousClass1E2) && r10.A0D((AnonymousClass1E1) r14) == null) {
            return false;
        }
        AnonymousClass1E7 A0E = r9.A0E(r14);
        if (A0E != null) {
            if (A0E.A0H != null || A0E.A0I != null) {
                return false;
            }
            if (A0E.A0C()) {
                C42741yf r2 = A0E.A0G;
                if (r2 != null) {
                    boolean z3 = true;
                    if (!r2.A02()) {
                        z3 = false;
                    }
                    boolean z4 = !z3;
                    if (r2 != null && r2.A02()) {
                        int i = r2.A03;
                        boolean z5 = true;
                        if (i != 3) {
                            z5 = false;
                            if (i == 2 || i == 1) {
                                z2 = true;
                                C18040vf r22 = C18040vf.A02;
                                boolean A05 = C18020vd.A05(r22, r11, 12709);
                                boolean A052 = C18020vd.A05(r22, r11, 12708);
                                if (((A05 && z5) || (A052 && z2)) && (!C18020vd.A05(r22, r11, 12710) || r8.A07((UserJid) A0E.A0J))) {
                                    z = true;
                                    if (!z4 && !z) {
                                        return false;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        C18040vf r222 = C18040vf.A02;
                        boolean A053 = C18020vd.A05(r222, r11, 12709);
                        boolean A0522 = C18020vd.A05(r222, r11, 12708);
                        z = true;
                        return false;
                    }
                    z = false;
                    return false;
                }
                if (C18020vd.A05(C18040vf.A02, r11, 5263)) {
                    return true;
                }
                return false;
            }
        }
        return C18020vd.A05(C18040vf.A02, r11, 3962);
    }
}
