package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AcP  reason: case insensitive filesystem */
public final class C20971AcP implements AnonymousClass1O5 {
    public BAN A00;
    public final UserJid A01;
    public final AnonymousClass1OZ A02;

    public C20971AcP(UserJid userJid, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 2);
        this.A01 = userJid;
        this.A02 = r3;
    }

    public void C7Z(C29621ca r6, String str) {
        C29621ca A0K;
        String A0M;
        String str2;
        C18070vi.A0d(r6, 1);
        C29621ca A0K2 = r6.A0K("public_key");
        if (A0K2 == null || (A0K = A0K2.A0K("pem")) == null || (A0M = A0K.A0M()) == null || A0M.length() == 0) {
            BAN ban = this.A00;
            if (ban != null) {
                ban.Bv6(this.A01);
                return;
            }
            return;
        }
        C29621ca A0K3 = r6.A0K("public_key_with_signature");
        String str3 = null;
        if (A0K3 != null) {
            String A0e = AnonymousClass8BW.A0e(A0K3, "public_key_pem");
            C29621ca A0K4 = A0K3.A0K("public_key_signature");
            if (A0K4 != null) {
                str3 = A0K4.A0M();
            }
            str2 = str3;
            str3 = A0e;
        } else {
            str2 = null;
        }
        BAN ban2 = this.A00;
        if (ban2 != null) {
            UserJid userJid = this.A01;
            C17960vV.A07(A0M);
            ban2.Bv7(userJid, A0M, str3, str2);
        }
    }

    public void BrD(String str) {
        C17900vP.A0g("GetBusinessPublicKeyProtocol/delivery-error with iqId ", str, C18070vi.A0K(str));
        BAN ban = this.A00;
        if (ban != null) {
            ban.Bv6(this.A01);
        }
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0h(str, r4);
        C17900vP.A0g("GetBusinessPublicKeyProtocol/onError with iqId ", str, AnonymousClass000.A10());
        Pair A012 = C60482o6.A01(r4);
        if (A012 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetBusinessPublicKeyProtocol/onError error_code=");
            AnonymousClass8BW.A1N(A012.first, A10);
        }
        BAN ban = this.A00;
        if (ban != null) {
            ban.Bv6(this.A01);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
