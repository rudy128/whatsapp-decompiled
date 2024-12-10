package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63X  reason: invalid class name */
public final class AnonymousClass63X extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public AnonymousClass63X() {
        super(468, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A05);
        r3.CHf(9, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A06(AnonymousClass184.A0B(AnonymousClass184.A0D(10, this.A04, A13), this.A05, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C108975cc.A0S(AnonymousClass184.A07(C108975cc.A0T(C17880vN.A0h(), this.A02, A13), this.A03, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamProfilePicUpload {");
        AnonymousClass186.A00(this.A04, "profilePicAvatarRevisionId", A10);
        AnonymousClass186.A00(this.A05, "profilePicAvatarStyle", A10);
        AnonymousClass186.A00(this.A00, "profilePicIsAvatar", A10);
        AnonymousClass186.A00(this.A01, "profilePicSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "profilePicUploadResult", A10);
        return AnonymousClass184.A0S(this.A03, "profilePicUploadT", A10);
    }
}
