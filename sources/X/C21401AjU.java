package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AjU  reason: case insensitive filesystem */
public final /* synthetic */ class C21401AjU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C190919lj A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        Long l;
        C190919lj r4 = this.A03;
        UserJid userJid = this.A04;
        String str = this.A07;
        int i = this.A00;
        Integer num = this.A06;
        int i2 = this.A01;
        Boolean bool = this.A05;
        String str2 = this.A08;
        int i3 = this.A02;
        AEW A082 = r4.A00.A08(userJid);
        if (A082 != null) {
            if (A082.A0Y) {
                str = null;
            }
            A8Q a8q = r4.A01;
            Integer valueOf = Integer.valueOf(i);
            if (num != null) {
                l = C17890vO.A0N(num);
            } else {
                l = null;
            }
            a8q.A0B.CGF(new C21402AjV(a8q, userJid, bool, valueOf, l, C17880vN.A0n(i2), str, str2, i3));
        }
    }

    public /* synthetic */ C21401AjU(C190919lj r1, UserJid userJid, Boolean bool, Integer num, String str, String str2, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = userJid;
        this.A07 = str;
        this.A00 = i;
        this.A06 = num;
        this.A01 = i2;
        this.A05 = bool;
        this.A08 = str2;
        this.A02 = i3;
    }
}
