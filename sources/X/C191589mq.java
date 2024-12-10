package X;

/* renamed from: X.9mq  reason: invalid class name and case insensitive filesystem */
public class C191589mq {
    public final /* synthetic */ C20375AIg A00;
    public final /* synthetic */ C188409hN A01;
    public final /* synthetic */ C180189Lm A02;
    public final /* synthetic */ BA6 A03;
    public final /* synthetic */ AnonymousClass9OY A04;
    public final /* synthetic */ C20282AEq A05;
    public final /* synthetic */ A4D A06;

    public C191589mq(C20375AIg aIg, C188409hN r2, C180189Lm r3, BA6 ba6, AnonymousClass9OY r5, C20282AEq aEq, A4D a4d) {
        this.A00 = aIg;
        this.A05 = aEq;
        this.A03 = ba6;
        this.A02 = r3;
        this.A06 = a4d;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void A00(C199099zQ r9, Exception exc) {
        if (exc != null) {
            C20375AIg.A02(this.A00, this.A03, this.A05, this.A06, exc);
            return;
        }
        C188409hN r2 = this.A01;
        r2.A00 = r9;
        r2.A05 = true;
        if (r2.A04 && r2.A06) {
            C20375AIg aIg = this.A00;
            C20282AEq aEq = this.A05;
            AnonymousClass9OY r5 = this.A04;
            C20375AIg.A01(aIg, r2, this.A02, this.A03, r5, aEq, AnonymousClass000.A1W(r2.A02));
        }
    }
}
