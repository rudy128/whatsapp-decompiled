package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.Aev  reason: case insensitive filesystem */
public final /* synthetic */ class C21127Aev implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass1KN A00;
    public final /* synthetic */ C20284AEs A01;
    public final /* synthetic */ AnonymousClass34B A02;
    public final /* synthetic */ C170308pe A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ AnonymousClass210 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        C170308pe r6 = this.A03;
        AnonymousClass1KN r3 = this.A00;
        C20284AEs aEs = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        AnonymousClass34B r5 = this.A02;
        AnonymousClass210 r8 = this.A05;
        r6.A02 = (Boolean) obj;
        AnonymousClass1KJ A012 = brazilPaymentActivity.A08.A01("BRL");
        C17890vO.A0u(new AnonymousClass9BL(A012, r3, aEs, r5, r6, brazilPaymentActivity, r8, str, str2), brazilPaymentActivity.A05);
    }

    public /* synthetic */ C21127Aev(AnonymousClass1KN r1, C20284AEs aEs, AnonymousClass34B r3, C170308pe r4, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass210 r6, String str, String str2) {
        this.A04 = brazilPaymentActivity;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = aEs;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = r3;
        this.A05 = r6;
    }
}
