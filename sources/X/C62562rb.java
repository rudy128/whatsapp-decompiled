package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2rb  reason: invalid class name and case insensitive filesystem */
public final class C62562rb {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C62562rb(String str, String str2, String str3, String str4, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        C18070vi.A0d(str2, 2);
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A00 = i;
        this.A0A = z;
        this.A01 = i2;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = j3;
        this.A09 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62562rb) {
                C62562rb r8 = (C62562rb) obj;
                if (!(C18070vi.A18(this.A05, r8.A05) && C18070vi.A18(this.A07, r8.A07) && C18070vi.A18(this.A06, r8.A06) && C18070vi.A18(this.A08, r8.A08) && this.A00 == r8.A00 && this.A0A == r8.A0A && this.A01 == r8.A01 && this.A03 == r8.A03 && this.A04 == r8.A04 && this.A02 == r8.A02 && this.A09 == r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C62562rb A00(C62562rb r15, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, long j2, boolean z) {
        boolean z2;
        long j3;
        int i4 = i3;
        boolean z3 = z;
        long j4 = j2;
        long j5 = j;
        int i5 = i2;
        int i6 = i;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        C62562rb r3 = r15;
        if ((i3 & 1) != 0) {
            str8 = r15.A05;
        }
        if ((i3 & 2) != 0) {
            str7 = r15.A07;
        }
        if ((i3 & 4) != 0) {
            str6 = r15.A06;
        }
        if ((i3 & 8) != 0) {
            str5 = r15.A08;
        }
        if ((i3 & 16) != 0) {
            i6 = r15.A00;
        }
        if ((i3 & 32) != 0) {
            z2 = r15.A0A;
        } else {
            z2 = false;
        }
        if ((i3 & 64) != 0) {
            i5 = r15.A01;
        }
        if ((i4 & 128) != 0) {
            j5 = r15.A03;
        }
        if ((i4 & 256) != 0) {
            j4 = r15.A04;
        }
        if ((i4 & 512) != 0) {
            j3 = r15.A02;
        } else {
            j3 = 0;
        }
        if ((i4 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            z3 = r3.A09;
        }
        C18070vi.A0o(str7, str6, str5);
        return new C62562rb(str8, str7, str6, str5, i6, i5, j5, j4, j3, z2, z3);
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A06, C17890vO.A02(this.A07, C17900vP.A00(this.A05) * 31));
        return C17880vN.A01(AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A03, (AnonymousClass0DV.A00((C17890vO.A02(this.A08, A022) + this.A00) * 31, this.A0A) + this.A01) * 31))), this.A09);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingModel(dirId=");
        A10.append(this.A05);
        A10.append(", lid=");
        A10.append(this.A07);
        A10.append(", jid=");
        A10.append(this.A06);
        A10.append(", name=");
        A10.append(this.A08);
        A10.append(", badgeCount=");
        A10.append(this.A00);
        A10.append(", isLoggedIn=");
        A10.append(this.A0A);
        A10.append(", unreadMessageCount=");
        A10.append(this.A01);
        A10.append(", lastActiveTimestampMs=");
        A10.append(this.A03);
        A10.append(", lastBuzzedTimestampMs=");
        A10.append(this.A04);
        A10.append(", accountAddedTimestampMs=");
        A10.append(this.A02);
        A10.append(", isExternalMediaLocationUserScoped=");
        return C17900vP.A0F(A10, this.A09);
    }
}
