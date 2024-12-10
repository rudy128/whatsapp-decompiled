package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.PaymentBottomSheet;

public class AYJ implements BBC {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ B90 A01;
    public final /* synthetic */ B91 A02;
    public final /* synthetic */ B92 A03;
    public final /* synthetic */ AnonymousClass92s A04;
    public final /* synthetic */ PaymentBottomSheet A05;
    public final /* synthetic */ Runnable A06;

    public AYJ(ARR arr, B90 b90, B91 b91, B92 b92, AnonymousClass92s r5, PaymentBottomSheet paymentBottomSheet, Runnable runnable) {
        this.A04 = r5;
        this.A00 = arr;
        this.A03 = b92;
        this.A06 = runnable;
        this.A05 = paymentBottomSheet;
        this.A01 = b90;
        this.A02 = b91;
    }

    public void Bss(A7B a7b) {
        AnonymousClass92s r2 = this.A04;
        r2.A08.get();
        int i = a7b.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            this.A06.run();
            AnonymousClass92s.A0c(a7b, this.A01, r2, this.A05);
            return;
        }
        this.A02.Bss(a7b);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9NG, java.lang.Object] */
    public void C3k(AnonymousClass9FM r8) {
        AnonymousClass9DM r0;
        AnonymousClass9DA r6 = r8.A02;
        ARR arr = this.A00;
        ? obj = new Object();
        obj.A01 = arr;
        if (r6 != null) {
            AnonymousClass92s r5 = this.A04;
            r5.A0A = r6.A07;
            r5.A0a = r6.A03;
            r5.A0d = r6.A05;
            Class<String> cls = String.class;
            r5.A0J = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), r6.A06);
            String str = r6.A04;
            if (!TextUtils.isEmpty(str)) {
                r5.A0H = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, str, "accountHolderName");
            }
            r5.A0n = r6.A02;
            AnonymousClass9DM r4 = r8.A03;
            if (C18020vd.A05(C18040vf.A02, r5.A0E, 11893) && r4 != null) {
                AnonymousClass1KI r1 = r5.A07;
                AnonymousClass9DD r2 = (AnonymousClass9DD) r4.A00;
                AnonymousClass1KJ A012 = r1.A01(r2.A02);
                int parseInt = Integer.parseInt(r2.A04);
                int parseInt2 = Integer.parseInt(r2.A03);
                long j = (long) parseInt;
                if (parseInt2 <= 0) {
                    parseInt2 = 1;
                }
                C17960vV.A07(A012);
                obj.A01 = C196669vR.A00(A012, parseInt2, j);
                AnonymousClass9DP r02 = r8.A00;
                if (!(r02 == null || (r0 = (AnonymousClass9DM) r02.A00) == null)) {
                    AnonymousClass9DD r22 = (AnonymousClass9DD) r0.A00;
                    int parseInt3 = Integer.parseInt(r22.A04);
                    int parseInt4 = Integer.parseInt(r22.A03);
                    long j2 = (long) parseInt3;
                    if (parseInt4 <= 0) {
                        parseInt4 = 1;
                    }
                    C17960vV.A07(A012);
                    obj.A00 = C196669vR.A00(A012, parseInt4, j2);
                }
            }
        }
        this.A03.C7M(obj);
    }
}
