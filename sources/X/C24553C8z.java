package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.C8z  reason: case insensitive filesystem */
public abstract class C24553C8z {
    public static Object A00(C26048CrF crF) {
        CountDownLatch A0u = BE7.A0u();
        C24767CJj cJj = new C24767CJj();
        C24767CJj cJj2 = new C24767CJj();
        crF.A04(new DBS(cJj, cJj2, A0u), new C27134DVv(1));
        A0u.await();
        Object obj = cJj2.A00;
        if (obj == null) {
            return cJj.A00;
        }
        throw ((Throwable) obj);
    }
}
