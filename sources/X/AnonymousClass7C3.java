package X;

/* renamed from: X.7C3  reason: invalid class name */
public final class AnonymousClass7C3 implements C1604788q {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ C1604788q A01;
    public final /* synthetic */ AnonymousClass721 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass7C3(AnonymousClass01E r1, C1604788q r2, AnonymousClass721 r3, String str, String str2) {
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BJB(boolean z) {
        C31081ez.A02(C17900vP.A0D("WfalLauncherProxy/launchInternal/callback: isLaunched:", AnonymousClass000.A10(), z));
        BJC((Exception) null, z);
    }

    public void BJC(Exception exc, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WfalLauncherProxy/launchInternal/callback: isLaunched:");
        A10.append(z);
        C31081ez.A02(AnonymousClass001.A1E(exc, ", e:", A10));
        AnonymousClass721 r5 = this.A02;
        AnonymousClass721.A01(r5, z);
        if (!z) {
            r5.A05.A03(exc);
            if (!(exc instanceof C122936Sm) || C122936Sm.A00((C122936Sm) exc) != 418) {
                AnonymousClass721.A00(this.A00, r5);
            } else {
                String str = this.A03;
                r5.A01.A0J(new AnonymousClass7Pq(r5, this.A04, str, 22));
            }
        }
        this.A01.BJB(z);
    }
}
