package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.Bdg  reason: case insensitive filesystem */
public class C23230Bdg extends C23024Ba0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final DSS A01;
    public final DSS A02;
    public final DSS A03;
    public final DSS A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        C17880vN.A1T(objArr, AnonymousClass000.A0P(this.A00, new Object[1], 0), 0);
        C17880vN.A1T(objArr, AnonymousClass000.A0P(this.A01, new Object[1], 0), 1);
        AnonymousClass3Ma.A1S(objArr, AnonymousClass000.A0P(this.A02, new Object[1], 0));
        C17890vO.A1G(objArr, AnonymousClass000.A0P(this.A03, new Object[1], 0));
        AnonymousClass3Ma.A1T(objArr, AnonymousClass000.A0P(this.A04, new Object[1], 0));
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23230Bdg) {
            C23230Bdg bdg = (C23230Bdg) obj;
            if (!C25332Cdd.A01(this.A00, bdg.A00) || !C25332Cdd.A01(this.A01, bdg.A01) || !C25332Cdd.A01(this.A02, bdg.A02) || !C25332Cdd.A01(this.A03, bdg.A03) || !C25332Cdd.A01(this.A04, bdg.A04)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C23230Bdg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        C23362Bfo A012;
        C23362Bfo A09 = DJ0.A09(bArr);
        C23362Bfo A092 = DJ0.A09(bArr2);
        C23362Bfo A093 = DJ0.A09(bArr3);
        C23362Bfo A094 = DJ0.A09(bArr4);
        if (bArr5 == null) {
            A012 = null;
        } else {
            A012 = DSS.A01(bArr5, bArr5.length);
        }
        C18210vx.A00(A09);
        this.A00 = A09;
        C18210vx.A00(A092);
        this.A01 = A092;
        C18210vx.A00(A093);
        this.A02 = A093;
        C18210vx.A00(A094);
        this.A03 = A094;
        this.A04 = A012;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CQA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.CQA, java.lang.Object] */
    public String toString() {
        String A0x = C108955ca.A0x(this);
        ? obj = new Object();
        if (A0x != null) {
            C25038CUr cUr = C25038CUr.A00;
            CQA A08 = DJ0.A08(DJ0.A08(DJ0.A08(DJ0.A08(obj, BE8.A0g(cUr, this.A00), "keyHandle"), BE8.A0g(cUr, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA), BE8.A0g(cUr, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA), BE8.A0g(cUr, this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
            DSS dss = this.A04;
            if (dss != null) {
                String A0g = BE8.A0g(cUr, dss);
                ? obj2 = new Object();
                A08.A00 = obj2;
                obj2.A01 = A0g;
                obj2.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
            }
            return CB9.A00(obj, A0x);
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A00.A04(), 2, false);
        C26293Cx2.A0D(parcel, this.A01.A04(), 3, false);
        C26293Cx2.A0D(parcel, this.A02.A04(), 4, false);
        C26293Cx2.A0D(parcel, this.A03.A04(), 5, false);
        C26293Cx2.A0D(parcel, DJ0.A0N(this.A04), 6, false);
        C26293Cx2.A05(parcel, A002);
    }
}
