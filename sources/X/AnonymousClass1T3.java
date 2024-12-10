package X;

import android.content.Context;

/* renamed from: X.1T3  reason: invalid class name */
public class AnonymousClass1T3 extends AnonymousClass1T2 {
    public final C218617r A00;
    public final AnonymousClass1KW A01;
    public final AnonymousClass1T1 A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final C25291Nq A05;
    public final C26631Sw A06;

    public void A0A(Context context, AnonymousClass3LA r15, AnonymousClass85B r16, String str) {
        AnonymousClass3LA r9 = r15;
        String str2 = str;
        if (str == null) {
            r15.Bwz((C1409573s) null);
            return;
        }
        C218617r r4 = this.A00;
        AnonymousClass1KW r6 = this.A01;
        C18000vb r5 = this.A03;
        C26631Sw r11 = this.A06;
        Context context2 = context;
        AnonymousClass68J r1 = new AnonymousClass68J(context2, this.A02, r4, r5, r6, this.A04, this.A05, r9, r16, r11, str2);
        A04(r1.BUa(), r1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1T3(AnonymousClass1T1 r4, C218617r r5, C18000vb r6, AnonymousClass1KW r7, C18030ve r8, C25291Nq r9, C26631Sw r10, AnonymousClass10I r11) {
        super(new C18150vq((Object) null, new C70943Dc(new AnonymousClass1T4(r11, "ProcessDoodleQueue"), 12)));
        C18070vi.A0d(r11, 0);
        this.A00 = r5;
        this.A01 = r7;
        this.A03 = r6;
        this.A06 = r10;
        this.A04 = r8;
        this.A05 = r9;
        this.A02 = r4;
    }
}
