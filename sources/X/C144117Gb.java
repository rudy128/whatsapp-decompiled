package X;

import java.util.List;

/* renamed from: X.7Gb  reason: invalid class name and case insensitive filesystem */
public final class C144117Gb implements C1606789m {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ C1604788q A01;
    public final /* synthetic */ C131806lh A02;
    public final /* synthetic */ AnonymousClass721 A03;
    public final /* synthetic */ C135566sP A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        C31081ez.A02("WfalLauncherProxy/pingIfNeeded - onError");
        AnonymousClass721 r1 = this.A03;
        r1.A05.A03(exc);
        AnonymousClass721.A01(r1, false);
        AnonymousClass721.A00(this.A00, r1);
        this.A01.BJC(exc, false);
    }

    public C144117Gb(AnonymousClass01E r1, C1604788q r2, C131806lh r3, AnonymousClass721 r4, C135566sP r5, String str, String str2, String str3, String str4, List list) {
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = list;
        this.A01 = r2;
    }

    public void BrA() {
        C31081ez.A02("WfalLauncherProxy/pingIfNeeded - onDeliveryFailure");
        AnonymousClass721 r3 = this.A03;
        r3.A05.A03(new RuntimeException("pingIfNeeded - OnDeliveryFailure"));
        AnonymousClass721.A01(r3, false);
        AnonymousClass721.A00(this.A00, r3);
        this.A01.BJB(false);
    }

    public void C7I(AnonymousClass732 r13) {
        AnonymousClass721 r5 = this.A03;
        AnonymousClass1KB r0 = r5.A01;
        AnonymousClass01E r2 = this.A00;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A08;
        r0.CGP(new AnonymousClass7QW(r2, this.A01, this.A02, r5, this.A04, str, str2, str3, str4, this.A09));
    }
}
