package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.A4m  reason: case insensitive filesystem */
public class C20043A4m {
    public int A00 = 0;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public C186719ee A05;
    public C54452eA A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public byte[] A0Q;
    public final AnonymousClass1E7 A0R;
    public final AnonymousClass1E2 A0S;
    public final UserJid A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;

    public C188899iB A00() {
        boolean z;
        UserJid userJid = this.A0T;
        if (userJid instanceof AnonymousClass1E2) {
            AnonymousClass1E7 r0 = this.A0R;
            if (r0 == null || (!r0.A0o && !this.A0E)) {
                z = true;
            } else {
                z = false;
            }
            this.A0H = z;
        }
        this.A0I &= true ^ C22971Dz.A0T(userJid);
        return new C188899iB(this);
    }

    public C20043A4m(AnonymousClass1E2 r3, String str, String str2) {
        this.A0V = str;
        this.A0W = str2;
        this.A0S = r3;
        this.A0T = null;
        this.A0U = null;
        this.A0R = null;
    }

    public C20043A4m(AnonymousClass1E7 r4) {
        this.A0T = AnonymousClass3MZ.A0x(r4);
        this.A0R = r4;
        C59042lf r0 = r4.A0H;
        if (r0 != null) {
            this.A0U = r0.A01;
        } else {
            this.A0U = null;
        }
        if (r4.A10) {
            this.A04 = r4.A0F;
        }
        this.A0V = null;
        this.A0W = null;
        this.A0S = null;
    }

    public C20043A4m(UserJid userJid, String str) {
        this.A0T = userJid;
        this.A0U = str;
        this.A0R = null;
        this.A0V = null;
        this.A0W = null;
        this.A0S = null;
    }
}
