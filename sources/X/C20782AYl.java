package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.AYl  reason: case insensitive filesystem */
public class C20782AYl implements BBH {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public C20782AYl(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public void Bst(C199169zY r5) {
        A7B a7b = r5.A00;
        if (a7b == null) {
            a7b = A7B.A00();
        }
        if (a7b.A00 == 25554) {
            BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
            brazilPayBloksActivity.A0F.A01(new C20785AYo(this.A00, brazilPayBloksActivity));
            return;
        }
        this.A00.A00("on_failure");
    }

    public void C3u() {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        brazilPayBloksActivity.A0F.A01(new C20785AYo(this.A00, brazilPayBloksActivity));
    }
}
