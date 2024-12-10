package X;

import android.content.Context;
import android.os.Bundle;

public class A0R {
    public AnonymousClass1KB A00;
    public AnonymousClass11E A01;
    public AnonymousClass122 A02;
    public C33711jG A03;
    public AnonymousClass1QD A04;
    public C31061ex A05;
    public C33701jF A06;
    public AnonymousClass1QS A07;
    public C195929uA A08;
    public C30931ek A09;
    public AnonymousClass10I A0A;
    public final C18030ve A0B;
    public final C20751AXg A0C;
    public final AnonymousClass1QO A0D;
    public final C175998zc A0E;
    public final A27 A0F;
    public final AnonymousClass1QE A0G = AnonymousClass1QE.A00("BrazilPaymentAccountActionsContainerPresenter", "payment-settings", "COMMON");
    public final C31071ey A0H;

    public A0R(AnonymousClass1KB r4, AnonymousClass11E r5, AnonymousClass122 r6, C18030ve r7, C20751AXg aXg, C33711jG r9, AnonymousClass1QD r10, C31061ex r11, AnonymousClass1QO r12, C33701jF r13, AnonymousClass1QS r14, C175998zc r15, A27 a27, C195929uA r17, C31071ey r18, C30931ek r19, AnonymousClass10I r20) {
        this.A00 = r4;
        this.A0A = r20;
        this.A09 = r19;
        this.A07 = r14;
        this.A02 = r6;
        this.A04 = r10;
        this.A05 = r11;
        this.A08 = r17;
        this.A06 = r13;
        this.A01 = r5;
        this.A03 = r9;
        this.A0B = r7;
        this.A0C = aXg;
        this.A0D = r12;
        this.A0F = a27;
        this.A0H = r18;
        this.A0E = r15;
    }

    private C010105w A00(AnonymousClass1FY r6, CharSequence charSequence, CharSequence charSequence2, int i) {
        Context applicationContext = r6.getApplicationContext();
        C73203Rj A012 = AnonymousClass4a6.A01(r6, 2132083283);
        A012.A0S(charSequence);
        A012.A0k(charSequence2);
        A012.A0T(true);
        String string = applicationContext.getString(2131898766);
        A012.A00.A0J(new A9V(r6, i, 6), string);
        A012.A0L(new C20139A9a(this, i, 3, r6), applicationContext.getString(2131888332));
        A012.A0G(new A9O(r6, i, 4));
        return A012.create();
    }

    public C010105w A01(Bundle bundle, AnonymousClass1FY r6, int i) {
        Context applicationContext = r6.getApplicationContext();
        String str = null;
        switch (i) {
            case 100:
                C73203Rj A002 = AnonymousClass4a6.A00(r6);
                C108955ca.A1D(applicationContext, A002, 2131893598);
                A002.A0L(new C20155A9r(r6, 31), applicationContext.getString(2131899286));
                return A002.create();
            case 101:
                String string = r6.getString(2131889333);
                if (bundle != null) {
                    string = bundle.getString("message");
                    str = bundle.getString("title");
                }
                return A00(r6, string, str, i);
            case 102:
                return A00(r6, r6.getString(2131895306), r6.getString(2131895307), i);
            default:
                return null;
        }
    }
}
