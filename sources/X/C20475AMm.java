package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AMm  reason: case insensitive filesystem */
public final /* synthetic */ class C20475AMm implements B77 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C169888nj A02;
    public final /* synthetic */ C20279AEn A03;
    public final /* synthetic */ AnonymousClass206 A04;

    public final void Bmx(AEW aew) {
        C169888nj r3 = this.A02;
        C20279AEn aEn = this.A03;
        AnonymousClass206 r2 = this.A04;
        Activity activity = this.A01;
        int i = this.A00;
        String A002 = ((C196149uX) r3.A07.get()).A00(aew);
        if ("UNBLOCKED".equals(A002)) {
            String A0c = r3.A04.A0c(aEn);
            C18070vi.A0X(A0c);
            AnonymousClass1QO r7 = r3.A03;
            ALX alx = r3.A02;
            UserJid A0I = r2.A0I();
            C17960vV.A07(A0I);
            AnonymousClass9R5.A00(activity, A0I, alx, r7, aEn, r2.A0v, aEn.A0I, A0c, aEn.A0K, "mm_chat_message", 0, i, true);
            return;
        }
        ((C19957A0o) r3.A06.get()).A02(activity, A002);
    }

    public /* synthetic */ C20475AMm(Activity activity, C169888nj r2, C20279AEn aEn, AnonymousClass206 r4, int i) {
        this.A02 = r2;
        this.A03 = aEn;
        this.A04 = r4;
        this.A01 = activity;
        this.A00 = i;
    }
}
