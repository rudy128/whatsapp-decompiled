package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aep  reason: case insensitive filesystem */
public class C21121Aep implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C21121Aep(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    public final void accept(Object obj) {
        String str;
        if (this.A00 != 0) {
            C62542rZ r2 = (C62542rZ) this.A01;
            AnonymousClass34B r1 = (AnonymousClass34B) this.A02;
            AEX aex = (AEX) this.A03;
            C55032f6 r10 = (C55032f6) this.A04;
            CountDownLatch countDownLatch = (CountDownLatch) this.A05;
            if (AnonymousClass000.A0M(obj) == 0 && r1.A03() != null) {
                C196299un r12 = r1.A03().A02;
                if (r12.A00() != null) {
                    byte[] bArr = r12.A00().A01;
                    long j = r12.A00().A00;
                    String A06 = r12.A06();
                    String A052 = r12.A05();
                    String A032 = r12.A03();
                    boolean A053 = C18020vd.A05(C18040vf.A02, r2.A03, 1084);
                    aex.A08 = bArr;
                    aex.A00 = j;
                    aex.A04 = A06;
                    aex.A03 = A052;
                    aex.A02 = A032;
                    aex.A07 = A053;
                    r10.A00 = 1;
                    countDownLatch.countDown();
                    return;
                }
            }
            r10.A01 = 3;
            countDownLatch.countDown();
            return;
        }
        AQN aqn = (AQN) this.A01;
        Context context = (Context) this.A02;
        Object obj2 = this.A03;
        Object obj3 = this.A04;
        AER aer = (AER) this.A05;
        String str2 = (String) obj;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode == -839883634) {
                str = "PERMANENT";
            } else if (hashCode != 181990675) {
                if (hashCode == 476614193) {
                    str = "TEMPORARY";
                } else {
                    return;
                }
            } else if (str2.equals("UNBLOCKED")) {
                aqn.A00.A01(aer.A00).A09(new C21120Aeo(context, aqn, obj2, obj3, 2));
                return;
            } else {
                return;
            }
            if (str2.equals(str)) {
                ((C19957A0o) aqn.A04.get()).A02(context, str2);
            }
        }
    }
}
