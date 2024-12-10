package X;

import com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1;
import java.util.Map;

/* renamed from: X.Abd  reason: case insensitive filesystem */
public final class C20923Abd implements C22522BBf {
    public String A00;
    public String A01;
    public String A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass118 A06;
    public final C20074A6a A07;
    public final C33711jG A08;
    public final C31061ex A09;
    public final AnonymousClass1QS A0A;
    public final C191389mW A0B;

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        C197689x6 r5 = (C197689x6) obj;
        C179949Kn r4 = (C179949Kn) enumR;
        C18070vi.A0h(r5, r4);
        AnonymousClass8pK r0 = ((C176218zy) r5).A00;
        if (r0 != null) {
            return AnonymousClass4GT.A00(AnonymousClass1OR.A00, new BrazilDeviceResolver$resolve$1(r0, this, r4, (C30391dr) null));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        C17890vO.A19(A10, "/resolveObject credential does not exists");
        return null;
    }

    public C20923Abd(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass118 r5, C20074A6a a6a, C33711jG r7, C31061ex r8, AnonymousClass1QS r9, C191389mW r10) {
        C18070vi.A0w(r4, r2, r5, r3, r9);
        C18070vi.A0q(r8, r10, a6a);
        C18070vi.A0d(r7, 9);
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A04 = r3;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = r10;
        this.A07 = a6a;
        this.A08 = r7;
    }

    public Class BL8() {
        return C179949Kn.class;
    }
}
