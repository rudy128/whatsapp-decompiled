package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;
import java.io.IOException;

/* renamed from: X.7I3  reason: invalid class name */
public final class AnonymousClass7I3 implements C1606989o {
    public final /* synthetic */ AnonymousClass705 A00;
    public final /* synthetic */ AnonymousClass77S A01;
    public final /* synthetic */ C132566n1 A02;
    public final /* synthetic */ C138076wU A03;
    public final /* synthetic */ Integer A04;

    public void BE5(C138506xC r12) {
        Long A012;
        C18070vi.A0d(r12, 0);
        if (!(!C22781De.A03())) {
            throw AnonymousClass000.A0n("Check failed.");
        } else if (r12.A00 != 0) {
            C138076wU r6 = this.A03;
            C137916wE r2 = (C137916wE) r6.A00.get();
            AnonymousClass163 r1 = r12.A04;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            AnonymousClass705 r5 = this.A00;
            Integer num = this.A04;
            AnonymousClass77S r7 = this.A01;
            C132566n1 r9 = this.A02;
            C21468AkZ akZ = new C21468AkZ(r5, r6, r7, num, r9, 34);
            C18070vi.A0d(r1, 0);
            int A05 = C108995ce.A05(r1);
            if (A05 != 3489014 || (A012 = r5.A01()) == null) {
                r9.A00(A05, (Integer) null);
            } else {
                r2.A00.CGv(akZ, A012.longValue());
            }
        } else {
            C134456qc r13 = (C134456qc) r12.A03.A00;
            if (r13 == null) {
                this.A02.A00(2, (Integer) null);
                return;
            }
            C132566n1 r4 = this.A02;
            C108945cZ.A11(r4.A00.A01).A02(new C134466qd(r13.A00), r4.A02);
            C128146fW r14 = r4.A01;
            r14.A01.A00();
            AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = r14.A00;
            accountLinkingNativeAuthActivity.A05.A0J(new C21429Ajw(accountLinkingNativeAuthActivity, 8));
        }
    }

    public void Bsw(Exception exc) {
        int i;
        Integer num;
        C18070vi.A0d(exc, 0);
        boolean z = exc instanceof C122816Sa;
        C132566n1 r2 = this.A02;
        if (z) {
            C1404571m r0 = ((C122816Sa) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public AnonymousClass7I3(AnonymousClass705 r1, AnonymousClass77S r2, C132566n1 r3, C138076wU r4, Integer num) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = num;
        this.A01 = r2;
    }

    public void BrB(IOException iOException) {
        C128146fW r1 = this.A02.A01;
        r1.A01.A00();
        AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = r1.A00;
        accountLinkingNativeAuthActivity.A05.A0J(new C146857Qw(accountLinkingNativeAuthActivity, -1, (Object) null, 2));
    }
}
