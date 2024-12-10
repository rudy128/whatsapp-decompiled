package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;

public class AVM implements BCY {
    public final /* synthetic */ SendE2EMessageJob A00;
    public final /* synthetic */ C192429oN A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public AVM(SendE2EMessageJob sendE2EMessageJob, C192429oN r2, Integer num, String str, String str2, boolean z) {
        this.A00 = sendE2EMessageJob;
        this.A01 = r2;
        this.A03 = str;
        this.A02 = num;
        this.A05 = z;
        this.A04 = str2;
    }

    public C29621ca BHE(UserJid userJid) {
        return C181459Qo.A00(userJid, this.A01, this.A03);
    }

    public C29621ca BHK(C194059r6 r8) {
        SendE2EMessageJob sendE2EMessageJob = this.A00;
        C194059r6 r1 = r8;
        if (r8 != null) {
            int i = sendE2EMessageJob.retryCount;
            String str = this.A03;
            return A83.A02(r1, this.A02, str, this.A04, i, this.A05);
        }
        int i2 = sendE2EMessageJob.retryCount;
        String str2 = this.A03;
        return AnonymousClass8BR.A0k("enc", (AnonymousClass1MD[]) A83.A04(this.A02, "none", str2, this.A04, i2, this.A05).toArray(A83.A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r0.A00 != 2) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List BHi(com.whatsapp.jid.Jid r17, X.C194589ry r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            com.whatsapp.jobqueue.job.SendE2EMessageJob r0 = r1.A00
            int r10 = r0.retryCount
            java.lang.String r4 = r1.A03
            java.lang.Integer r3 = r1.A02
            boolean r12 = r1.A05
            java.lang.String r5 = r1.A04
            X.9oN r2 = r1.A01
            r1 = r18
            X.9s0 r0 = r1.A01
            java.util.Map r7 = r0.A01
            java.util.Map r8 = r0.A02
            java.util.List r6 = r0.A00
            java.util.Map r9 = r1.A02
            boolean r13 = X.C22971Dz.A0e(r17)
            boolean r14 = X.C22971Dz.A0a(r17)
            X.9r6 r0 = r1.A00
            if (r0 == 0) goto L_0x002e
            int r1 = r0.A00
            r0 = 2
            r15 = 1
            if (r1 == r0) goto L_0x002f
        L_0x002e:
            r15 = 0
        L_0x002f:
            r11 = r19
            java.util.ArrayList r0 = X.A83.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVM.BHi(com.whatsapp.jid.Jid, X.9ry, boolean):java.util.List");
    }

    public C29621ca BHp() {
        C192429oN r2 = this.A01;
        if (!"url".equals(this.A03) || r2 == null) {
            return null;
        }
        return new C29621ca("sender_content_binding", r2.A02, (AnonymousClass1MD[]) null);
    }
}
