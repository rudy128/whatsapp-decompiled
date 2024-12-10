package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.Aji  reason: case insensitive filesystem */
public final /* synthetic */ class C21415Aji implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C20274AEh A01;
    public final /* synthetic */ AnonymousClass1KN A02;
    public final /* synthetic */ C20284AEs A03;
    public final /* synthetic */ AnonymousClass34B A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.8pe] */
    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        String str = this.A06;
        List list = this.A0A;
        String str2 = this.A07;
        int i = this.A00;
        C20274AEh aEh = this.A01;
        AnonymousClass1KN r5 = this.A02;
        C20284AEs aEs = this.A03;
        String str3 = this.A08;
        String str4 = this.A09;
        AnonymousClass34B r7 = this.A04;
        AnonymousClass210 A4c = brazilPaymentActivity.A4c(str, list);
        ? obj = new Object();
        obj.A03 = str2;
        obj.A05 = A4c.A0v.A01;
        obj.A04 = brazilPaymentActivity.A0Z.A01();
        brazilPaymentActivity.A4s(obj, i);
        obj.A01 = aEh;
        C20323AGf aGf = brazilPaymentActivity.A0E;
        if (aGf != null) {
            aGf.A00.A09(new C21127Aev(r5, aEs, r7, obj, brazilPaymentActivity, A4c, str3, str4));
            return;
        }
        AnonymousClass1KJ A012 = brazilPaymentActivity.A08.A01("BRL");
        C17890vO.A0u(new AnonymousClass9BL(A012, r5, aEs, r7, obj, brazilPaymentActivity, A4c, str3, str4), brazilPaymentActivity.A05);
    }

    public /* synthetic */ C21415Aji(C20274AEh aEh, AnonymousClass1KN r2, C20284AEs aEs, AnonymousClass34B r4, BrazilPaymentActivity brazilPaymentActivity, String str, String str2, String str3, String str4, List list, int i) {
        this.A05 = brazilPaymentActivity;
        this.A06 = str;
        this.A0A = list;
        this.A07 = str2;
        this.A00 = i;
        this.A01 = aEh;
        this.A02 = r2;
        this.A03 = aEs;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = r4;
    }
}
