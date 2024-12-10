package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AjV  reason: case insensitive filesystem */
public final /* synthetic */ class C21402AjV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A8Q A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        String str = this.A07;
        A8Q a8q = this.A01;
        UserJid userJid = this.A02;
        Integer num = this.A04;
        Long l = this.A05;
        Long l2 = this.A06;
        Boolean bool = this.A03;
        String str2 = this.A08;
        int i = this.A00;
        C171448rj r1 = new C171448rj();
        r1.A06 = str;
        r1.A07 = a8q.A0A.A00(userJid);
        r1.A08 = a8q.A03;
        r1.A01 = num;
        r1.A03 = l;
        r1.A04 = l2;
        r1.A00 = bool;
        r1.A09 = str2;
        r1.A05 = C17880vN.A0n(a8q.A0E.getAndIncrement());
        r1.A02 = Integer.valueOf(i);
        a8q.A09.CC7(r1);
    }

    public /* synthetic */ C21402AjV(A8Q a8q, UserJid userJid, Boolean bool, Integer num, Long l, Long l2, String str, String str2, int i) {
        this.A07 = str;
        this.A01 = a8q;
        this.A02 = userJid;
        this.A04 = num;
        this.A05 = l;
        this.A06 = l2;
        this.A03 = bool;
        this.A08 = str2;
        this.A00 = i;
    }
}
