package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.7Qa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146637Qa implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass72R A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void run() {
        String str = this.A07;
        AnonymousClass72R r8 = this.A01;
        int i = this.A00;
        Integer num = this.A02;
        boolean z = this.A09;
        Integer num2 = this.A03;
        Integer num3 = this.A04;
        Integer num4 = this.A05;
        boolean z2 = this.A0A;
        Integer num5 = this.A06;
        String str2 = this.A08;
        Jid A022 = Jid.Companion.A02(str);
        AnonymousClass64B r1 = new AnonymousClass64B();
        A8Q a8q = r8.A00;
        r1.A09 = C17880vN.A0n(a8q.A0E.getAndIncrement());
        r1.A06 = Integer.valueOf(i);
        r1.A0C = a8q.A03;
        r1.A0B = r8.A02.A00(A022);
        r1.A07 = num;
        r1.A01 = Boolean.valueOf(z);
        r1.A02 = num2;
        r1.A03 = num3;
        r1.A04 = num4;
        r1.A00 = Boolean.valueOf(z2);
        r1.A05 = num5;
        r1.A0A = str2;
        r8.A01.CC7(r1);
    }

    public /* synthetic */ C146637Qa(AnonymousClass72R r1, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, int i, boolean z, boolean z2) {
        this.A07 = str;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = num;
        this.A09 = z;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = num4;
        this.A0A = z2;
        this.A06 = num5;
        this.A08 = str2;
    }
}
