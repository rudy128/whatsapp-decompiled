package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Ace  reason: case insensitive filesystem */
public abstract class C20986Ace implements AnonymousClass1O5 {
    public Long A00;
    public String A01;
    public final C191019lt A02;
    public final UserJid A03;
    public final C22548BCf A04;

    public final void A01(C29621ca r10, Integer num, Integer num2, String str, long j, boolean z) {
        int i;
        int intValue;
        int i2;
        Integer num3 = num;
        Integer num4 = num2;
        if (r10 != null) {
            C191019lt r2 = this.A02;
            UserJid userJid = this.A03;
            if (this instanceof AnonymousClass97U) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            r2.A00(userJid, num3, num4, this.A00, this.A01, i2);
        }
        this.A01 = "RESET";
        if (z) {
            if (num2 != null) {
                i = num2.intValue();
                if (417 == i) {
                    this.A04.Bsp(this.A03, i);
                    return;
                }
            } else {
                i = 0;
            }
            if (num != null && (intValue = num.intValue()) != 200) {
                this.A04.Bsp(this.A03, intValue);
                return;
            } else if (401 == i || 403 == i || 404 == i) {
                this.A04.Br3(this.A03);
                return;
            }
        } else if (str != null) {
            this.A04.C6Z(this.A03, str, j);
            return;
        }
        this.A04.BzE(this.A03);
    }

    public void BrD(String str) {
        int i;
        C191019lt r1 = this.A02;
        UserJid userJid = this.A03;
        if (this instanceof AnonymousClass97U) {
            i = 2;
        } else {
            i = 1;
        }
        r1.A00(userJid, 500, 500, this.A00, this.A01, i);
    }

    public C20986Ace(C191019lt r1, UserJid userJid, C22548BCf bCf) {
        this.A03 = userJid;
        this.A02 = r1;
        this.A04 = bCf;
    }

    public final void A00(C29621ca r9, int i) {
        A01(r9, Integer.valueOf(i), (Integer) null, (String) null, 0, true);
    }

    public void Bt9(C29621ca r2, String str) {
        A00(r2, AnonymousClass8BW.A01(r2));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
