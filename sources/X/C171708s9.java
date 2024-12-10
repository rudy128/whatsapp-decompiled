package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s9  reason: invalid class name and case insensitive filesystem */
public final class C171708s9 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public C171708s9() {
        super(1342, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(22, this.A0E);
        r3.CHf(18, this.A0F);
        r3.CHf(21, this.A06);
        r3.CHf(9, this.A0G);
        r3.CHf(23, this.A0H);
        r3.CHf(12, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(7, this.A07);
        r3.CHf(10, this.A08);
        r3.CHf(16, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(14, this.A09);
        r3.CHf(6, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(8, this.A0A);
        r3.CHf(1, this.A0C);
        r3.CHf(2, this.A0D);
        r3.CHf(17, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A0E(AnonymousClass184.A0P(AnonymousClass184.A0B(AnonymousClass184.A0N(AnonymousClass184.A0K(22, this.A0E, A13), this.A0F, A13), this.A06, A13), this.A0G, A13), this.A0H, A13), this.A00, A13), this.A01, A13), this.A07, A13), this.A08);
        A13.put(AnonymousClass184.A0I(19, AnonymousClass184.A0R(A13, 13), A13), this.A02);
        A13.put(AnonymousClass184.A0J(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass184.A0A(AnonymousClass184.A05(AnonymousClass184.A08(AnonymousClass184.A0G(AnonymousClass184.A07(15, AnonymousClass184.A0R(A13, 20), A13), this.A03, A13), this.A09, A13), this.A04, A13), this.A05, A13), this.A0A, A13), this.A0C, A13), this.A0D, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamRegistrationComplete {");
        AnonymousClass186.A00(this.A0E, "accessSessionId", A10);
        AnonymousClass186.A00(this.A0F, "appCampaignDownloadSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "contactsPermissionAuthorizationStatus", A10);
        AnonymousClass186.A00(this.A0G, "deviceIdentifier", A10);
        AnonymousClass186.A00(this.A0H, "googleAccountListHashedReg", A10);
        AnonymousClass186.A00(this.A00, "registrationAllowNotifications", A10);
        AnonymousClass186.A00(this.A01, "registrationAttemptSkipWithNoVertical", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "registrationContactsPermissionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "registrationGoogleDriveBackupStatus", A10);
        AnonymousClass186.A00(this.A02, "registrationIsWfs", A10);
        AnonymousClass186.A00(this.A03, "registrationProfilePictureSet", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "registrationProfilePictureSource", A10);
        AnonymousClass186.A00(this.A04, "registrationProfilePictureTapped", A10);
        AnonymousClass186.A00(this.A05, "registrationRetryFetchingBizProfile", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "registrationStoragePermissionSource", A10);
        AnonymousClass186.A00(this.A0C, "registrationT", A10);
        AnonymousClass186.A00(this.A0D, "registrationTForFillBusinessInfoScreen", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0B), "registrationWfsSource", A10);
    }
}
