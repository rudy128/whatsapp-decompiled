package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcP  reason: case insensitive filesystem */
public class C23169BcP extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C23144Bbx A00;
    public final C23116BbV A01;
    public final C23115BbU A02;
    public final C23118BbX A03;
    public final C23119BbY A04;
    public final C23120BbZ A05;
    public final C23159BcF A06;
    public final C23206Bd0 A07;
    public final C23121Bba A08;
    public final C23122Bbb A09;
    public final C23027Ba3 A0A;
    public final C23123Bbc A0B;

    public boolean equals(Object obj) {
        if (obj instanceof C23169BcP) {
            C23169BcP bcP = (C23169BcP) obj;
            if (!C25332Cdd.A01(this.A00, bcP.A00) || !C25332Cdd.A01(this.A09, bcP.A09) || !C25332Cdd.A01(this.A01, bcP.A01) || !C25332Cdd.A01(this.A0B, bcP.A0B) || !C25332Cdd.A01(this.A03, bcP.A03) || !C25332Cdd.A01(this.A04, bcP.A04) || !C25332Cdd.A01(this.A0A, bcP.A0A) || !C25332Cdd.A01(this.A05, bcP.A05) || !C25332Cdd.A01(this.A02, bcP.A02) || !C25332Cdd.A01(this.A07, bcP.A07) || !C25332Cdd.A01(this.A08, bcP.A08) || !C25332Cdd.A01(this.A06, bcP.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 12);
        A1b[1] = this.A09;
        A1b[2] = this.A01;
        A1b[3] = this.A0B;
        A1b[4] = this.A03;
        A1b[5] = this.A04;
        A1b[6] = this.A0A;
        A1b[7] = this.A05;
        A1b[8] = this.A02;
        A1b[9] = this.A07;
        A1b[10] = this.A08;
        return AnonymousClass000.A0P(this.A06, A1b, 11);
    }

    public final String toString() {
        C23121Bba bba = this.A08;
        C23206Bd0 bd0 = this.A07;
        C23115BbU bbU = this.A02;
        C23120BbZ bbZ = this.A05;
        C23027Ba3 ba3 = this.A0A;
        C23119BbY bbY = this.A04;
        C23118BbX bbX = this.A03;
        C23123Bbc bbc = this.A0B;
        C23116BbV bbV = this.A01;
        C23122Bbb bbb = this.A09;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(bbb);
        String valueOf3 = String.valueOf(bbV);
        String valueOf4 = String.valueOf(bbc);
        String valueOf5 = String.valueOf(bbX);
        String valueOf6 = String.valueOf(bbY);
        String valueOf7 = String.valueOf(ba3);
        String valueOf8 = String.valueOf(bbZ);
        String valueOf9 = String.valueOf(bbU);
        String valueOf10 = String.valueOf(bd0);
        String valueOf11 = String.valueOf(bba);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AuthenticationExtensions{\n fidoAppIdExtension=");
        A10.append(valueOf);
        A10.append(", \n cableAuthenticationExtension=");
        A10.append(valueOf2);
        A10.append(", \n userVerificationMethodExtension=");
        A10.append(valueOf3);
        A10.append(", \n googleMultiAssertionExtension=");
        A10.append(valueOf4);
        A10.append(", \n googleSessionIdExtension=");
        A10.append(valueOf5);
        A10.append(", \n googleSilentVerificationExtension=");
        A10.append(valueOf6);
        A10.append(", \n devicePublicKeyExtension=");
        A10.append(valueOf7);
        A10.append(", \n googleTunnelServerIdExtension=");
        A10.append(valueOf8);
        A10.append(", \n googleThirdPartyPaymentExtension=");
        A10.append(valueOf9);
        A10.append(", \n prfExtension=");
        A10.append(valueOf10);
        A10.append(", \n simpleTransactionAuthorizationExtension=");
        return BEA.A0n(valueOf11, A10);
    }

    public C23169BcP(C23144Bbx bbx, C23115BbU bbU, C23116BbV bbV, C23118BbX bbX, C23119BbY bbY, C23120BbZ bbZ, C23159BcF bcF, C23206Bd0 bd0, C23121Bba bba, C23122Bbb bbb, C23027Ba3 ba3, C23123Bbc bbc) {
        this.A00 = bbx;
        this.A01 = bbV;
        this.A09 = bbb;
        this.A0B = bbc;
        this.A03 = bbX;
        this.A04 = bbY;
        this.A0A = ba3;
        this.A05 = bbZ;
        this.A02 = bbU;
        this.A07 = bd0;
        this.A08 = bba;
        this.A06 = bcF;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A00, i);
        C26293Cx2.A09(parcel, this.A09, 3, i, A0J);
        C26293Cx2.A09(parcel, this.A01, 4, i, A0J);
        C26293Cx2.A09(parcel, this.A0B, 5, i, A0J);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0J);
        C26293Cx2.A09(parcel, this.A04, 7, i, A0J);
        C26293Cx2.A09(parcel, this.A0A, 8, i, A0J);
        C26293Cx2.A09(parcel, this.A05, 9, i, A0J);
        C26293Cx2.A09(parcel, this.A02, 10, i, A0J);
        C26293Cx2.A09(parcel, this.A07, 11, i, A0J);
        C26293Cx2.A09(parcel, this.A08, 12, i, A0J);
        C26293Cx2.A09(parcel, this.A06, 13, i, A0J);
        C26293Cx2.A05(parcel, A002);
    }
}
