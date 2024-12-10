package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AYo  reason: case insensitive filesystem */
public class C20785AYo implements BBI {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ AnonymousClass91q A01;

    public C20785AYo(C194839sN r1, AnonymousClass91q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bss(A7B a7b) {
        AnonymousClass91q.A0q(this.A00, (Map) null, a7b.A00);
    }

    public void BpT(String str) {
        HashMap A11 = C17880vN.A11();
        A11.put("compliance_status", str);
        this.A00.A01("on_success", A11);
    }
}
