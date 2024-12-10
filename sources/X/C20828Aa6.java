package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;

/* renamed from: X.Aa6  reason: case insensitive filesystem */
public class C20828Aa6 implements BBS {
    public long A00;
    public AnonymousClass1FY A01;
    public C191379mV A02;
    public BD5 A03;
    public C191409mY A04;
    public PaymentCheckoutOrderDetailsViewV2 A05;
    public AnonymousClass8Gd A06;
    public C196229uf A07;
    public String A08 = "WhatsappPay";
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public BD6 A0D;
    public final AnonymousClass1KB A0E;
    public final AnonymousClass1M9 A0F;
    public final C18000vb A0G;
    public final AnonymousClass122 A0H;
    public final AnonymousClass1QR A0I;
    public final C18030ve A0J;
    public final AnonymousClass1LU A0K;
    public final C33651jA A0L;
    public final C192479oS A0M;
    public final AnonymousClass1R2 A0N;
    public final A6X A0O;
    public final AnonymousClass10I A0P;

    public void CMz(AW0 aw0, AnonymousClass1BI r11, long j) {
        AnonymousClass1FY r1;
        int i;
        C73203Rj A0E2 = AnonymousClass8BW.A0E(this.A01);
        C20155A9r.A01(A0E2, this, 23, 2131899286);
        AnonymousClass8pG r12 = aw0.A0A;
        if (r12 == null || !(r12 instanceof C170318pf) || !((C170318pf) r12).A0a) {
            A0E2.setTitle(this.A01.getString(2131893210));
            r1 = this.A01;
            i = 2131893209;
        } else {
            A0E2.setTitle(this.A01.getString(2131893454));
            r1 = this.A01;
            i = 2131893453;
        }
        A0E2.A0S(r1.getString(i));
        AnonymousClass1BI r4 = r11;
        if (this.A0N.A0n(r11)) {
            A0E2.setNegativeButton(2131887988, new A9X(r4, this, 1, j));
        }
        AnonymousClass3MY.A1G(A0E2);
    }

    public void A00(AnonymousClass1FY r6, UserJid userJid, BD5 bd5, AnonymousClass8Gd r9) {
        this.A01 = r6;
        this.A03 = bd5;
        this.A0B = r6.getIntent().getStringExtra("extra_order_id");
        this.A09 = r6.getIntent().getStringExtra("extra_order_discount_program_name");
        this.A00 = C108975cc.A06(r6.getIntent(), "extra_order_expiry_ts_in_sec");
        this.A0C = r6.getIntent().getStringExtra("extra_payment_config_id");
        if (r6.getIntent().getBooleanExtra("extra_checkout_lite_enabled", false)) {
            this.A08 = "checkout_lite";
        }
        C20859Aab aab = new C20859Aab(r6, userJid, bd5, this);
        this.A0D = aab;
        this.A07.A00 = aab;
        C191409mY r3 = new C191409mY(this.A0I, this, this.A0P);
        this.A04 = r3;
        r6.getLifecycle().A05(new C20325AGh(r3, 1));
        this.A06 = r9;
        r9.A0a(false);
        C20337AGt.A01(r6, r9.A03, this, 45);
        this.A05 = (PaymentCheckoutOrderDetailsViewV2) LayoutInflater.from(r6).inflate(2131624535, (ViewGroup) null, false);
    }

    public void A01(AnonymousClass9I2 r8, C191979nV r9) {
        if (this.A03.Bg0()) {
            this.A0O.A07(r9.A0B, this.A08, 12);
        }
        AnonymousClass10I r6 = this.A0P;
        AnonymousClass122 r1 = this.A0H;
        C33651jA r4 = this.A0L;
        A63.A02(this.A0E, r1, this.A0I, new C20598ARi(this, r8, r9), r4, r9.A0B, r6);
    }

    public boolean CMK(int i) {
        return AnonymousClass000.A1T(i, 405);
    }

    public C20828Aa6(AnonymousClass1KB r2, AnonymousClass1M9 r3, C18000vb r4, AnonymousClass122 r5, AnonymousClass1QR r6, C18030ve r7, AnonymousClass1LU r8, C33651jA r9, C196229uf r10, C192479oS r11, AnonymousClass1R2 r12, A6X a6x, AnonymousClass10I r14) {
        this.A0J = r7;
        this.A0E = r2;
        this.A0K = r8;
        this.A0P = r14;
        this.A0N = r12;
        this.A0G = r4;
        this.A0M = r11;
        this.A0F = r3;
        this.A0H = r5;
        this.A0I = r6;
        this.A0L = r9;
        this.A0O = a6x;
        this.A07 = r10;
    }
}
