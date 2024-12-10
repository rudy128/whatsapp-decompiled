package X;

/* renamed from: X.7P0  reason: invalid class name */
public final class AnonymousClass7P0 implements AnonymousClass8A2 {
    public final /* synthetic */ C122196Oc A00;
    public final /* synthetic */ AnonymousClass8A2 A01;

    public AnonymousClass7P0(C122196Oc r1, AnonymousClass8A2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BrA() {
        C31081ez.A01("LinkActionIqHelper/Iq delivery fail");
        this.A01.BrA();
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C128846gm r4 = (C128846gm) obj;
        C18070vi.A0d(r4, 0);
        C31081ez.A02("LinkActionIqHelper/execute:onSuccess");
        C122196Oc r2 = this.A00;
        C146787Qp.A00(r2.A01, r2, 37);
        this.A01.onSuccess(Boolean.valueOf(r4.A02));
    }

    public void Bsx(Exception exc, Integer num) {
        StringBuilder A0K = C18070vi.A0K(exc);
        A0K.append("LinkActionIqHelper/Iq sent error with code ");
        A0K.append(num);
        C31081ez.A03(C17890vO.A0c(A0K, ' '), exc);
        this.A01.Bsx(exc, num);
    }
}
