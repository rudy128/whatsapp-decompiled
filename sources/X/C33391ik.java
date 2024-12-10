package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import java.util.HashMap;

/* renamed from: X.1ik  reason: invalid class name and case insensitive filesystem */
public class C33391ik {
    public final AnonymousClass11P A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass1NG A02;
    public final AnonymousClass1QD A03;
    public final C31061ex A04;
    public final AnonymousClass1QO A05;
    public final AnonymousClass1QS A06;
    public final C33381ij A07;
    public final C25001Mm A08;
    public final C18030ve A09;

    public static void A00(UserJid userJid, C33391ik r6, int i, boolean z) {
        r6.A08.A01(new SendPaymentInviteSetupJob(userJid, i, z));
        AnonymousClass1QD r4 = r6.A03;
        HashMap A022 = AnonymousClass1QD.A02(r4, r4.A03().getString("payments_inviter_jids_with_expiry", ""));
        A022.remove(userJid);
        r4.A03().edit().putString("payments_inviter_jids_with_expiry", AnonymousClass1QD.A01(A022)).apply();
    }

    public C33391ik(C25001Mm r1, AnonymousClass11P r2, AnonymousClass121 r3, AnonymousClass1NG r4, C18030ve r5, AnonymousClass1QD r6, C31061ex r7, AnonymousClass1QO r8, AnonymousClass1QS r9, C33381ij r10) {
        this.A00 = r2;
        this.A09 = r5;
        this.A08 = r1;
        this.A06 = r9;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = r10;
    }
}
