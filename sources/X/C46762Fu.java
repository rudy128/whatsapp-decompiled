package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fu  reason: invalid class name and case insensitive filesystem */
public final class C46762Fu extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A01);
    }

    public C46762Fu() {
        super(3300, new C18180vt(1, 200, 1000, false), 2, 56300709);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A03, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsAppLaunch {");
        AnonymousClass186.A00(this.A02, "psAppLaunchCpuT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "psAppLaunchDestination", A10);
        AnonymousClass186.A00(this.A03, "psAppLaunchT", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "psAppLaunchTypeT", A10);
    }
}
