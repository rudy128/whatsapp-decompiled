package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zo  reason: invalid class name and case insensitive filesystem */
public final class C81793zo extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;

    public C81793zo() {
        super(5994, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
    }

    public List validate() {
        if (this.A03 == null) {
            return C72483Me.A0Z("screenshot_blocked", C18460wS.A00, C18070vi.A0M("screen_name"));
        }
        return C18460wS.A00;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamScreenshotBlocked {");
        AnonymousClass186.A00(this.A00, "isContact", A10);
        AnonymousClass186.A00(this.A01, "isRecording", A10);
        AnonymousClass186.A00(this.A02, "isSmb", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "screenName", A10);
    }
}
