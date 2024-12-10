package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import java.util.Map;

/* renamed from: X.8Ca  reason: invalid class name and case insensitive filesystem */
public final class C161158Ca extends CountDownTimer {
    public final /* synthetic */ AnonymousClass1DT A00;
    public final /* synthetic */ RetryCodeCountdownTimersViewModel A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161158Ca(AnonymousClass1DT r3, RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel, String str, long j) {
        super(j, 1000);
        this.A01 = retryCodeCountdownTimersViewModel;
        this.A02 = str;
        this.A00 = r3;
    }

    public void onFinish() {
        RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A01;
        Map map = retryCodeCountdownTimersViewModel.A04;
        String str = this.A02;
        Long A0L = C17890vO.A0L();
        map.put(str, A0L);
        if (retryCodeCountdownTimersViewModel.A00) {
            retryCodeCountdownTimersViewModel.A05.remove(str);
            retryCodeCountdownTimersViewModel.A02.A0E(A0L);
        }
        this.A00.A0E("complete");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r10 < 0) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTick(long r13) {
        /*
            r12 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r7 = r12.A01
            java.util.Map r4 = r7.A04
            java.lang.String r0 = r12.A02
            r4.put(r0, r1)
            X.1DT r3 = r7.A02
            java.lang.String r0 = "sms"
            java.lang.Number r0 = X.C108945cZ.A1E(r0, r4)
            long r10 = X.C17900vP.A01(r0)
            java.lang.String r0 = "voice"
            java.lang.Number r0 = X.C108945cZ.A1E(r0, r4)
            long r1 = X.C17900vP.A01(r0)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0033:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x003c:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            r10 = r1
        L_0x0041:
            X.1CM r2 = r7.A03
            r0 = 0
            int r1 = r2.A00(r0)
            r0 = 15
            if (r1 != r0) goto L_0x0069
            java.lang.String r0 = "wa_old"
        L_0x004e:
            java.lang.Number r0 = X.C108945cZ.A1E(r0, r4)
            long r1 = X.C17900vP.A01(r0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            r8 = r1
        L_0x005b:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            r10 = r8
        L_0x0060:
            r8 = r10
        L_0x0061:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r3.A0E(r0)
            return
        L_0x0069:
            r0 = 0
            int r1 = r2.A00(r0)
            r0 = 17
            if (r1 != r0) goto L_0x0075
            java.lang.String r0 = "email_otp"
            goto L_0x004e
        L_0x0075:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "email_capture"
            java.lang.Number r0 = X.C108945cZ.A1E(r0, r4)
            long r10 = X.C17900vP.A01(r0)
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161158Ca.onTick(long):void");
    }
}
