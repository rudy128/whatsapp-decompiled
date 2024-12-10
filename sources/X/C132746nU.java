package X;

import java.util.HashMap;

/* renamed from: X.6nU  reason: invalid class name and case insensitive filesystem */
public class C132746nU {
    public final /* synthetic */ C114485qu A00;
    public final /* synthetic */ C114125qC A01;
    public final /* synthetic */ C128236ff A02;
    public final /* synthetic */ DOZ A03;
    public final /* synthetic */ DFL A04;

    public C132746nU(C114485qu r1, C114125qC r2, C128236ff r3, DOZ doz, DFL dfl) {
        this.A00 = r1;
        this.A04 = dfl;
        this.A02 = r3;
        this.A03 = doz;
        this.A01 = r2;
    }

    public void A00(int i, String str, String str2) {
        DFL dfl = this.A04;
        E8A A0A = dfl.A0A(35);
        if (A0A != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("domain", str2);
            C17890vO.A0z("code", A11, i);
            A11.put("description", str);
            C26209Cul.A01(this.A03, dfl, new C199029zJ(C108985cd.A0J(A11).A00), A0A);
        }
    }
}
