package X;

import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.ATy  reason: case insensitive filesystem */
public final class C20666ATy implements C1606989o {
    public final /* synthetic */ A2F A00;
    public final /* synthetic */ C33051iB A01;
    public final /* synthetic */ C192659ol A02;

    public void BE5(C138506xC r5) {
        C18070vi.A0d(r5, 0);
        Class cls = ((AIj) this.A00.A00).A01;
        C18070vi.A0z(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.infra.graphql.MexCall>");
        JSONObject jSONObject = r5.A05;
        Object A002 = this.A02.A00(new C199129zU(jSONObject.getJSONObject("data"), AnonymousClass8BX.A0t("errors", jSONObject)), cls);
        if (!(A002 instanceof AnonymousClass1IU)) {
            C33051iB r0 = this.A01;
            C30691eM.A01(A002);
            r0.C3V((C172768tz) A002);
            return;
        }
        Throwable A003 = C30671eK.A00(A002);
        if (A003 == null) {
            A003 = new C172808u3(cls, (Throwable) null);
        }
        this.A01.Btr(A003);
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        this.A01.Btr(iOException);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A01.Btr(exc);
    }

    public C20666ATy(A2F a2f, C33051iB r2, C192659ol r3) {
        this.A00 = a2f;
        this.A02 = r3;
        this.A01 = r2;
    }
}
