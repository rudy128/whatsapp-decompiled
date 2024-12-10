package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3CX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C36161nR A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ C42691ya A06;
    public final /* synthetic */ C42691ya A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.2kB] */
    public final void run() {
        C36161nR r10 = this.A04;
        UserJid userJid = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        C42691ya r4 = this.A06;
        C42691ya r3 = this.A07;
        int i3 = this.A02;
        int i4 = this.A03;
        AnonymousClass1M9 r0 = r10.A00;
        r0.A0H(userJid);
        r0.A0S();
        ? obj = new Object();
        obj.A03 = i;
        obj.A01 = i2;
        obj.A07 = str;
        obj.A06 = str2;
        obj.A05 = r4;
        obj.A04 = r3;
        obj.A02 = i3;
        obj.A00 = i4;
        r10.A01.BAz(userJid, obj.A00());
    }

    public /* synthetic */ AnonymousClass3CX(C36161nR r1, UserJid userJid, C42691ya r3, C42691ya r4, String str, String str2, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A05 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = i3;
        this.A03 = i4;
    }
}
