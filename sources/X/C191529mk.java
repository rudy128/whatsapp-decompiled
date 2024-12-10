package X;

import java.util.ArrayList;

/* renamed from: X.9mk  reason: invalid class name and case insensitive filesystem */
public class C191529mk {
    public final AnonymousClass11E A00;
    public final AnonymousClass1QD A01;
    public final C31061ex A02;
    public final AnonymousClass17E A03 = ((AnonymousClass17E) C221618v.A02(AnonymousClass17E.class));
    public final C50412Ui A04;
    public final AnonymousClass10I A05;

    public void A00(BB7 bb7, C198959zC r13, String str) {
        BB7 bb72 = bb7;
        if ("token".equals(r13.A00.A03)) {
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass3Ma.A1P("fbpay_pin", str, A13);
            AnonymousClass10I r0 = this.A05;
            AnonymousClass17E r7 = this.A03;
            AnonymousClass1QD r3 = this.A01;
            C50412Ui r8 = this.A04;
            AnonymousClass3MW.A1T(new C175528yr(this.A00, r3, this.A02, (C191069ly) null, bb72, r7, r8, A13, 0), r0, 0);
            return;
        }
        bb7.C7R(str);
    }

    public C191529mk(AnonymousClass11E r2, AnonymousClass1QD r3, C31061ex r4, C50412Ui r5, AnonymousClass10I r6) {
        this.A05 = r6;
        this.A01 = r3;
        this.A04 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }
}
