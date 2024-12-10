package X;

/* renamed from: X.3dM  reason: invalid class name and case insensitive filesystem */
public class C75023dM extends C87584Wd implements Runnable, B9K {
    public int A00 = 60;
    public C47712Jo A01;
    public final AnonymousClass1NN A02;

    public C75023dM(AnonymousClass1NN r2, C47712Jo r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BroadcastListResponseHandler/request success/");
        C17900vP.A0o(A10, this.A00);
    }

    public void CGB(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BroadcastListResponseHandler/request failed : ");
        A10.append(i);
        A10.append(" | ");
        C47712Jo r2 = this.A01;
        A10.append(r2);
        A10.append(" | ");
        A10.append(this.A00);
        C17890vO.A0w(A10);
        this.A01.cancel();
        this.A02.A03(r2, false);
    }
}
