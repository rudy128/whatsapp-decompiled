package com.whatsapp.biz;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M6;
import X.AnonymousClass1XN;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4QR;
import X.AnonymousClass689;
import X.AnonymousClass72R;
import X.C000200d;
import X.C1417376t;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C192179nw;
import X.C20042A4l;
import X.C22941Dw;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C25181Nf;
import X.C25221Nj;
import X.C26911Ty;
import X.C28741ap;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import X.C92824hy;
import X.C92864i2;
import X.C94164k9;
import X.C95414mC;
import X.C96314ne;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;

public class BusinessProfileExtraFieldsActivity extends AnonymousClass1FY {
    public C20042A4l A00;
    public C26911Ty A01;
    public AnonymousClass72R A02;
    public AnonymousClass4QR A03;
    public C24671Lf A04;
    public C24921Me A05;
    public C18000vb A06;
    public C25181Nf A07;
    public AnonymousClass1LU A08;
    public UserJid A09;
    public AnonymousClass689 A0A;
    public AnonymousClass1XN A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass1E7 A0G;
    public Integer A0H;
    public boolean A0I;
    public final AnonymousClass1M6 A0J;
    public final C23581Gv A0K;
    public final C28741ap A0L;
    public final C25221Nj A0M;

    public BusinessProfileExtraFieldsActivity() {
        this(0);
        this.A0K = new C94164k9(this, 1);
        this.A0L = new C95414mC(this, 0);
        this.A0M = new C96314ne(this, 0);
        this.A0J = new C92864i2(this, 0);
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A0A = (AnonymousClass689) r1.A5q.get();
            this.A05 = AnonymousClass3MZ.A0g(r1);
            this.A06 = AnonymousClass10E.A6Q(r1);
            this.A04 = AnonymousClass3Ma.A0S(r1);
            this.A0E = C000200d.A00(r1.A2A);
            this.A03 = (AnonymousClass4QR) A0K2.A5F.get();
            this.A0D = C000200d.A00(r1.A1L);
            this.A01 = (C26911Ty) r1.A1J.get();
            this.A0B = (AnonymousClass1XN) r2.A0d.get();
            this.A0C = C000200d.A00(r1.A1K);
            this.A07 = AnonymousClass3MZ.A0m(r1);
            this.A0F = C000200d.A00(r1.A4u);
            this.A02 = (AnonymousClass72R) r2.A0h.get();
            this.A08 = AnonymousClass3MY.A0Z(r1);
        }
    }

    public void A4b() {
        AnonymousClass1E7 A012 = this.A07.A01(this.A09);
        this.A0G = A012;
        setTitle(this.A05.A0I(A012));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A022 = C22941Dw.A02(C72453Mb.A0u(this));
        C17960vV.A07(A022);
        this.A09 = A022;
        int intExtra = getIntent().getIntExtra("profile_entry_point", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        this.A0H = valueOf;
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A0H = valueOf;
        A4b();
        C72473Md.A18(this);
        setContentView(2131626970);
        C18030ve r8 = this.A0E;
        AnonymousClass11S r13 = this.A02;
        AnonymousClass1L9 r11 = this.A01;
        AnonymousClass689 r7 = this.A0A;
        C24921Me r6 = this.A05;
        C18000vb r5 = this.A06;
        AnonymousClass1XN r4 = this.A0B;
        AnonymousClass72R r15 = this.A02;
        Integer num = this.A0H;
        View view = this.A00;
        AnonymousClass1E7 r2 = this.A0G;
        boolean A002 = this.A03.A00(this.A09);
        AnonymousClass689 r22 = r7;
        AnonymousClass1LU r21 = this.A08;
        C18030ve r20 = r8;
        AnonymousClass1E7 r19 = r2;
        C18000vb r18 = r5;
        C24921Me r17 = r6;
        this.A00 = new C20042A4l(view, r11, this, r13, (C192179nw) this.A0D.get(), r15, (C1417376t) null, r17, r18, r19, r20, r21, r22, r4, num, 8388611, true, false, A002);
        this.A01.A0D(new C92824hy(this, 0), this.A09);
        C17880vN.A0V(this.A0E).registerObserver(this.A0L);
        this.A04.registerObserver(this.A0K);
        C17880vN.A0V(this.A0C).registerObserver(this.A0J);
        C17880vN.A0V(this.A0F).registerObserver(this.A0M);
    }

    public void onDestroy() {
        super.onDestroy();
        C17880vN.A0V(this.A0E).unregisterObserver(this.A0L);
        this.A04.unregisterObserver(this.A0K);
        C17880vN.A0V(this.A0C).unregisterObserver(this.A0J);
        C17880vN.A0V(this.A0F).unregisterObserver(this.A0M);
    }

    public BusinessProfileExtraFieldsActivity(int i) {
        this.A0I = false;
        C90994ey.A00(this, 14);
    }
}
