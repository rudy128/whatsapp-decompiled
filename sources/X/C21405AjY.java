package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.AjY  reason: case insensitive filesystem */
public final /* synthetic */ class C21405AjY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C190579lB A03;
    public final /* synthetic */ Jid A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        boolean z = this.A08;
        C190579lB r10 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        String str = this.A06;
        Integer num = this.A05;
        Jid jid = this.A04;
        String str2 = this.A07;
        C171308rV r1 = new C171308rV();
        r1.A01 = Integer.valueOf(i);
        r1.A03 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(i3);
        r1.A05 = str;
        if (num != null) {
            r1.A00 = num;
        }
        if (jid != null) {
            r1.A04 = r10.A01.A00(jid);
        }
        if (str2 != null) {
            r1.A06 = str2;
        }
        AnonymousClass18K r0 = r10.A00;
        if (z) {
            r0.CC4(r1);
        } else {
            r0.CC7(r1);
        }
    }

    public /* synthetic */ C21405AjY(C190579lB r1, Jid jid, Integer num, String str, String str2, int i, int i2, int i3, boolean z) {
        this.A08 = z;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A06 = str;
        this.A05 = num;
        this.A04 = jid;
        this.A07 = str2;
    }
}
