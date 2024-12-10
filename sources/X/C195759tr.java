package X;

/* renamed from: X.9tr  reason: invalid class name and case insensitive filesystem */
public final class C195759tr {
    public int A00;
    public AnonymousClass5YR A01;
    public AnonymousClass5YR A02;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C180419Ml A07;
    public final AnonymousClass5YR A08;
    public final AnonymousClass5YR A09;
    public final AnonymousClass5YR A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195759tr) {
                C195759tr r8 = (C195759tr) obj;
                if (this.A06 != r8.A06 || this.A05 != r8.A05 || this.A04 != r8.A04 || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A0A, r8.A0A) || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A09, r8.A09) || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = AnonymousClass8BV.A00(this.A06);
        return ((((((((AnonymousClass000.A0N(this.A07, ((AnonymousClass001.A0K(this.A05, A002) * 31) + this.A04) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A09)) * 31 * 31) + C17880vN.A02(this.A02);
    }

    public C195759tr(C180419Ml r1, AnonymousClass5YR r2, AnonymousClass5YR r3, AnonymousClass5YR r4, AnonymousClass5YR r5, AnonymousClass5YR r6, int i, long j, long j2) {
        this.A06 = j;
        this.A05 = j2;
        this.A04 = i;
        this.A07 = r1;
        this.A01 = r2;
        this.A0A = r3;
        this.A08 = r4;
        this.A09 = r5;
        this.A02 = r6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "AsyncBannerData(businessProfile=");
        AnonymousClass000.A1G(A10, ", merchantAccountInfoData=");
        A10.append(", totalExternalStorageSize=");
        A10.append(this.A06);
        A10.append(", availableExternalStorageSize=");
        A10.append(this.A05);
        A10.append(", linkedDeviceNumberInSmbApp=");
        A10.append(0);
        A10.append(", maxAllowedLinkedDevices=");
        A10.append(this.A04);
        A10.append(", subscriptionBannerData=");
        A10.append(this.A07);
        A10.append(", bannerQp=");
        A10.append(this.A01);
        A10.append(", settingsBannerQp=");
        A10.append(this.A0A);
        A10.append(", groupsPrivacyTipQP=");
        A10.append(this.A08);
        A10.append(", profilePrivacyTipQP=");
        A10.append(this.A09);
        AnonymousClass000.A1G(A10, ", editProfileBannerQP=");
        A10.append(", callListBannerQp=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
