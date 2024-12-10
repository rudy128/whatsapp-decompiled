package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63c  reason: invalid class name and case insensitive filesystem */
public final class C1183463c extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C1183463c() {
        super(3600, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(6, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A05);
        r3.CHf(4, this.A03);
        r3.CHf(7, this.A00);
        r3.CHf(5, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A08(C17880vN.A0h(), this.A04, A13), this.A01, A13), this.A02, A13), this.A05, A13), this.A03, A13), this.A00, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAvatarBloksLaunch {");
        AnonymousClass186.A00(this.A04, "avatarBloksLaunchErrorReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "avatarBloksLaunchErrorType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "avatarBloksLaunchEvent", A10);
        AnonymousClass186.A00(this.A05, "avatarEditorSessionId", A10);
        AnonymousClass186.A00(this.A03, "fetchT", A10);
        AnonymousClass186.A00(this.A00, "hasAvatar", A10);
        return AnonymousClass184.A0S(this.A06, "waAvatarSessionId", A10);
    }
}
