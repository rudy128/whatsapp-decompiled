package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8ht  reason: invalid class name and case insensitive filesystem */
public final class C167858ht extends C167898hx {
    public final C20009A2z A00;
    public final BAL A01;
    public final AnonymousClass1OZ A02;
    public final C195049si A03;
    public final AnonymousClass4S5 A04;
    public final AnonymousClass10I A05;
    public final String A06;
    public final C182929Wg A07;
    public final UserJid A08;

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A03.A00(str);
        this.A00.A03();
        this.A01.C1G("error", 440);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167858ht(C26911Ty r2, C20009A2z a2z, C182929Wg r4, BAL bal, UserJid userJid, AnonymousClass1OZ r7, C195049si r8, AnonymousClass4S5 r9, AnonymousClass10I r10, String str) {
        super(r2, userJid);
        C18070vi.A0o(r2, r7, a2z);
        C18070vi.A0d(r8, 5);
        C72473Md.A1K(r10, r9);
        this.A02 = r7;
        this.A00 = a2z;
        this.A07 = r4;
        this.A03 = r8;
        this.A06 = str;
        this.A08 = userJid;
        this.A01 = bal;
        this.A05 = r10;
        this.A04 = r9;
    }

    public void C7Z(C29621ca r8, String str) {
        String str2;
        String str3;
        int i;
        String A0M;
        C18070vi.A0h(str, r8);
        UserJid userJid = this.A00;
        C182929Wg r1 = this.A07;
        C29621ca A0K = r8.A0K("result_code");
        if (A0K == null || (str2 = A0K.A0M()) == null) {
            str2 = "invalid_postcode";
        }
        C29621ca A0K2 = r8.A0K("encrypted_location_name");
        String str4 = null;
        if (!(A0K2 == null || (A0M = A0K2.A0M()) == null)) {
            byte[] decode = Base64.decode(A0M, 0);
            C18070vi.A0X(decode);
            String A022 = ((A4Q) r1.A00.get()).A02(decode);
            if (A022 == null) {
                str2 = "error";
            } else {
                str4 = A022;
            }
        }
        C183899a0 r2 = new C183899a0(str2, str4);
        if (r2.A00 == null) {
            this.A03.A00(str);
            str3 = r2.A01;
            i = 1001;
        } else {
            boolean A09 = this.A00.A09(userJid);
            C195049si r0 = this.A03;
            if (A09) {
                r0.A01(str);
                this.A01.C1H(r2);
                return;
            }
            r0.A00(str);
            str3 = "error";
            i = 1002;
        }
        this.A00.A03();
        this.A01.C1G(str3, i);
    }
}
