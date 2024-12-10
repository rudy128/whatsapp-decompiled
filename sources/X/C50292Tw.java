package X;

import java.util.Random;

/* renamed from: X.2Tw  reason: invalid class name and case insensitive filesystem */
public abstract class C50292Tw {
    public static final int A00(AnonymousClass1CJ r6, C18030ve r7, AnonymousClass206 r8) {
        C46162Dk r1;
        C29691ci A0A = r6.A0A(r8.A0v.A00);
        if ((A0A instanceof C46162Dk) && (r1 = (C46162Dk) A0A) != null) {
            long j = r1.A0G;
            if (j > 1) {
                return new Random().nextInt((int) (Math.log10((double) j) * ((double) C18020vd.A00(C18040vf.A02, r7, 4369))));
            }
        }
        return 0;
    }
}
