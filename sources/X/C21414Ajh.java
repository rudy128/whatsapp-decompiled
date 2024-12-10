package X;

/* renamed from: X.Ajh  reason: case insensitive filesystem */
public final /* synthetic */ class C21414Ajh implements Runnable {
    public final /* synthetic */ C195639tf A00;
    public final /* synthetic */ AnonymousClass90E A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public final void run() {
        AnonymousClass90E r4 = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        C195639tf r3 = this.A00;
        String str3 = this.A08;
        String str4 = this.A09;
        String str5 = this.A0A;
        Long l = this.A05;
        Integer num = this.A04;
        Boolean bool = this.A02;
        Integer num2 = this.A03;
        C18070vi.A0j(str, str2);
        C20284AEs A012 = AnonymousClass1KH.A01(str, AnonymousClass8BU.A0t(r4.A04));
        if (A012 != null) {
            r4.A02.A0J(new C21413Ajg(A012, r3, r4, bool, num, num2, l, str2, str3, str4, str5));
        }
    }

    public /* synthetic */ C21414Ajh(C195639tf r1, AnonymousClass90E r2, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = r1;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A05 = l;
        this.A04 = num;
        this.A02 = bool;
        this.A03 = num2;
    }
}
