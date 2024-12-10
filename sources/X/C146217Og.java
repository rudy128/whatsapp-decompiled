package X;

import org.json.JSONObject;

/* renamed from: X.7Og  reason: invalid class name and case insensitive filesystem */
public final class C146217Og implements AnonymousClass89Y {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ C1418477e A01;
    public final /* synthetic */ C1418477e A02;
    public final /* synthetic */ C35081lc A03;

    public void Bsu(C122936Sm r3) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/refreshTokenForWfsLogin/sendData/onError", 0);
        this.A00.Bsw(r3);
    }

    public C146217Og(C1606789m r1, C1418477e r2, C1418477e r3, C35081lc r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void C7b(C29621ca r8, JSONObject jSONObject) {
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/refreshTokenForWfsLogin/sendData/onSuccess", 0);
        this.A03.A05.get();
        C17960vV.A07(jSONObject);
        Object obj = this.A01.A00;
        C17960vV.A07(obj);
        C17960vV.A07(obj);
        AnonymousClass732 A002 = C137206v5.A00(C35081lc.A0D, (String) obj, jSONObject);
        Number number = (Number) AnonymousClass732.A00(A002);
        long A09 = C108985cd.A09(this.A02);
        if (number == null || number.longValue() != A09) {
            C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/refreshTokenForWfsLogin/sendData/error ids do not match", 0);
            C108965cb.A1C(this.A00, "ids do not match");
            return;
        }
        this.A00.C7I(A002);
    }
}
