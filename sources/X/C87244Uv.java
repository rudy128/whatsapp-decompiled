package X;

import android.net.Uri;

/* renamed from: X.4Uv  reason: invalid class name and case insensitive filesystem */
public final class C87244Uv {
    public final Uri A00;
    public final AnonymousClass1E2 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87244Uv) {
                C87244Uv r5 = (C87244Uv) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)), this.A03), this.A02), this.A04);
    }

    public C87244Uv(Uri uri, AnonymousClass1E2 r2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoneNumberRequestData(jid=");
        A10.append(this.A01);
        A10.append(", learnMoreUri=");
        A10.append(this.A00);
        A10.append(", isPhoneNumberKnown=");
        A10.append(this.A03);
        A10.append(", isMyPhoneNumberShared=");
        A10.append(this.A02);
        A10.append(", wasPhoneNumberRequested=");
        return C17900vP.A0F(A10, this.A04);
    }
}
