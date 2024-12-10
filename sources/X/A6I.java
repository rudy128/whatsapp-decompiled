package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

public class A6I {
    public int A00;
    public C010105w A01;
    public C51142Xd A02;
    public AM5 A03;
    public AQP A04;
    public AnonymousClass1M9 A05;
    public C30801eX A06;
    public String A07;
    public AnonymousClass190 A08;
    public AnonymousClass11P A09;

    public void A04(View view, C22435B7r b7r, BD3 bd3, String str) {
        View view2 = view;
        C22435B7r b7r2 = b7r;
        BD3 bd32 = bd3;
        String str2 = str;
        try {
            AnonymousClass1M9 r1 = this.A05;
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1BI A012 = C22931Dv.A01(str2);
            C17960vV.A07(A012);
            AnonymousClass1E7 A0E = r1.A0E(A012);
            if (A0E == null || !A0E.A0u) {
                A02(this);
                View A0D = AnonymousClass3MY.A0D(AnonymousClass3Ma.A05(view).getLayoutInflater(), 2131624363);
                C73203Rj A002 = AnonymousClass4a6.A00(view.getContext());
                A9Q.A00(A002, this, 7);
                A002.A0c(A0D);
                C010105w create = A002.create();
                this.A01 = create;
                create.show();
                C51142Xd r02 = this.A02;
                UserJid A022 = C22941Dw.A02(str2);
                C17960vV.A07(A022);
                C187219fS r8 = new C187219fS(view2, this, b7r2, bd32, str2);
                AnonymousClass10E r12 = r02.A00.A01;
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r12);
                AnonymousClass1OZ A0K = AnonymousClass8BU.A0K(r12);
                AQP aqp = new AQP(r8, AnonymousClass3MZ.A0d(r12), (C678831f) r12.A00.A10.get(), A022, A0K, AL1);
                this.A04 = aqp;
                if (!aqp.A01.A09()) {
                    AQP.A00(aqp, C62602rf.A04);
                }
                C17890vO.A0u(aqp.A02, aqp.A03);
                return;
            }
            A01(view, this, bd32, str2);
        } catch (AnonymousClass11T unused) {
            A00(view, this, bd32, C62602rf.A02, str2);
            if (b7r != null) {
                b7r2.Bmy();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r8.A00 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View r5, X.A6I r6, X.BD3 r7, X.C62602rf r8, java.lang.String r9) {
        /*
            if (r8 == 0) goto L_0x0009
            int r0 = r8.A00
            r4 = 2131887050(0x7f1203ca, float:1.9408696E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r4 = 2131887040(0x7f1203c0, float:1.9408676E38)
        L_0x000c:
            A02(r6)
            android.app.Activity r3 = X.AnonymousClass3Ma.A05(r5)
            android.content.Context r0 = r5.getContext()
            X.3Rj r2 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.String r1 = r3.getString(r0)
            X.1FB r3 = (X.AnonymousClass1FB) r3
            X.AGn r0 = new X.AGn
            r0.<init>(r5, r6, r7, r9)
            r2.A0i(r3, r0, r1)
            r0 = 2131887147(0x7f12042b, float:1.9408893E38)
            r2.A0E(r0)
            r2.A0D(r4)
            X.05w r0 = r2.create()
            r6.A01 = r0
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6I.A00(android.view.View, X.A6I, X.BD3, X.2rf, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.1LU, java.lang.Object] */
    public static void A01(View view, A6I a6i, BD3 bd3, String str) {
        int i;
        double d;
        Double d2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        A6I a6i2 = a6i;
        AM5 am5 = a6i2.A03;
        String str7 = null;
        if (am5.A01 == null) {
            a6i2.A08.A0G("directorySessionIdIsNull", (String) null, false);
        }
        if (bd3 != null) {
            i = bd3.CDG();
            d = bd3.CCv();
            d2 = bd3.CC2();
            str2 = bd3.CD9();
            str3 = bd3.CH5();
            str4 = bd3.CH7();
            str5 = bd3.CDH();
            str6 = bd3.CCV();
            str7 = bd3.BkK();
            i2 = bd3.BKI();
        } else {
            i = 0;
            d = 0.0d;
            d2 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            i2 = 0;
        }
        C1417376t r5 = new C1417376t(d2, str2, str3, str4, str5, str6, str7, a6i2.A07, am5.A01, d, i, i2, 0);
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(str);
        C17960vV.A07(A0l);
        AnonymousClass1E7 r3 = new AnonymousClass1E7(A0l);
        Activity A052 = AnonymousClass3Ma.A05(view);
        A052.startActivity(new Object().A1u(A052, r3).putExtra("user_actions_on_business_profile_common_fields", r5));
        C30801eX r2 = a6i2.A06;
        UserJid A022 = C22941Dw.A02(str);
        C17960vV.A07(A022);
        r2.A05(A022, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        Integer valueOf = Integer.valueOf(a6i2.A00);
        C171788sH A0J = AnonymousClass8BW.A0J(51);
        A0J.A09 = valueOf;
        AM5.A02(am5, A0J);
    }

    public static void A02(A6I a6i) {
        C010105w r0 = a6i.A01;
        if (r0 != null && !AnonymousClass1L9.A00(r0.getContext()).isFinishing()) {
            a6i.A01.cancel();
        }
    }

    public A6I(AnonymousClass190 r1, C51142Xd r2, AM5 am5, AnonymousClass1M9 r4, AnonymousClass11P r5, C30801eX r6) {
        this.A09 = r5;
        this.A08 = r1;
        this.A05 = r4;
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = am5;
    }

    public void A03() {
        A02(this);
        AQP aqp = this.A04;
        if (aqp != null) {
            aqp.A02.A0B(true);
            this.A04.A00 = null;
        }
    }
}
