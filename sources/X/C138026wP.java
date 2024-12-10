package X;

import com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6wP  reason: invalid class name and case insensitive filesystem */
public final class C138026wP {
    public final Integer A00;
    public final TimeUnit A01;

    public static C162248Jv A00(A6Y a6y, AnonymousClass8Ak r6) {
        C196269uj r4 = new C196269uj(MLModelDownloadWorkerV2.class);
        r4.A04(a6y);
        r4.A03(r6.Bbr());
        C138026wP BNJ = r6.BNJ();
        r4.A06(BNJ.A00, BNJ.A01, 10000);
        return (C162248Jv) r4.A00();
    }

    public C138026wP(Integer num, TimeUnit timeUnit) {
        this.A00 = num;
        this.A01 = timeUnit;
    }
}
