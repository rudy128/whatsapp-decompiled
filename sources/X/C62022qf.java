package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2qf  reason: invalid class name and case insensitive filesystem */
public final class C62022qf {
    public final UserJid A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C62022qf(boolean z, boolean z2, boolean z3) {
        this((UserJid) null, (Integer) null, z, z2, z3);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[interactive=");
        A10.append(this.A04);
        A10.append(", has_status=");
        A10.append(this.A03);
        A10.append(", has_nonstatus=");
        A10.append(this.A02);
        A10.append(", media_quality=");
        A10.append(this.A01);
        return AnonymousClass000.A0z(A10);
    }

    public C62022qf(UserJid userJid, Integer num, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A01 = num;
        this.A00 = userJid;
    }
}
