package X;

import android.accounts.Account;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.Aj5  reason: case insensitive filesystem */
public class C21376Aj5 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C21376Aj5(Object obj, Object obj2, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void run() {
        C18020vd r2;
        int i;
        if (this.A00 != 0) {
            String str = this.A03;
            C196159uY r6 = (C196159uY) this.A01;
            boolean z = this.A05;
            C22560BCt bCt = (C22560BCt) this.A02;
            String str2 = this.A04;
            C178709Ed r4 = null;
            if (str.length() != 0 && str.endsWith("gmail.com")) {
                if (z) {
                    r2 = r6.A03;
                    i = 10821;
                } else {
                    r2 = r6.A04;
                    i = 10820;
                }
                if (C18020vd.A05(C18040vf.A02, r2, i)) {
                    try {
                        bCt.C8k();
                        Context context = r6.A01.A00;
                        Account account = new Account(str, "com.google");
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("audience:server:client_id:");
                        String A022 = C26266CwB.A02(account, context, AnonymousClass000.A0y(C197569wu.A0M, A10));
                        C18070vi.A0X(A022);
                        bCt.C8l();
                        r4 = new C178709Ed(A022, 0);
                    } catch (Exception e) {
                        bCt.C8j();
                        Log.i("Error fetching email id token", e);
                        AnonymousClass190 r22 = r6.A00;
                        StringBuilder A102 = AnonymousClass000.A10();
                        C17900vP.A0a(e, A102);
                        r22.A0E("EmailVerificationXmppMethods/getIdToken", C17900vP.A0C(" : ", A102, e), e);
                    }
                }
            }
            AnonymousClass9F6 r1 = new AnonymousClass9F6(r4, str2, str);
            C17880vN.A0U(r6.A05).A0N(new C20996Aco(bCt, r1, 6), (C29621ca) r1.A00, str2, 415, 32000);
            return;
        }
        UserJid userJid = (UserJid) this.A01;
        A4F a4f = (A4F) this.A02;
        boolean z2 = this.A05;
        String str3 = this.A03;
        String str4 = this.A04;
        if (userJid != null) {
            a4f.A00 = C17890vO.A0Q();
            C17880vN.A1D(C19830z4.A00(C17880vN.A0K(a4f.A05)), "pref_deeplink_journey_logging_counter", 0);
            int i2 = 7;
            if (z2) {
                i2 = 1;
            }
            C171138rE A002 = A4F.A00(a4f, userJid, i2, z2);
            A002.A05 = str3;
            A002.A04 = str4;
            a4f.A02.CC7(A002);
        }
    }
}
