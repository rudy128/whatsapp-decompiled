package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

public final class AEV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C170328pg A00;
    public final C170338ph A01;
    public final C170348pi A02;
    public final C170358pj A03;
    public final C170368pk A04;
    public final C170378pl A05;
    public final C170388pm A06;
    public final C170398pn A07;
    public final C170408po A08;
    public final C170418pp A09;
    public final C170428pq A0A;
    public final boolean A0B;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEV) {
                AEV aev = (AEV) obj;
                if (!C18070vi.A18(this.A07, aev.A07) || !C18070vi.A18(this.A00, aev.A00) || !C18070vi.A18(this.A06, aev.A06) || !C18070vi.A18(this.A02, aev.A02) || !C18070vi.A18(this.A09, aev.A09) || !C18070vi.A18(this.A08, aev.A08) || !C18070vi.A18(this.A05, aev.A05) || !C18070vi.A18(this.A03, aev.A03) || !C18070vi.A18(this.A0A, aev.A0A) || !C18070vi.A18(this.A04, aev.A04) || !C18070vi.A18(this.A01, aev.A01) || this.A0B != aev.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A07.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        this.A06.writeToParcel(parcel, i);
        this.A02.writeToParcel(parcel, i);
        this.A09.writeToParcel(parcel, i);
        this.A08.writeToParcel(parcel, i);
        this.A05.writeToParcel(parcel, i);
        this.A03.writeToParcel(parcel, i);
        this.A0A.writeToParcel(parcel, i);
        this.A04.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A0A, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A08, AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A07))))))))))), this.A0B);
    }

    public AEV(C170328pg r2, C170338ph r3, C170348pi r4, C170358pj r5, C170368pk r6, C170378pl r7, C170388pm r8, C170398pn r9, C170408po r10, C170418pp r11, C170428pq r12, boolean z) {
        C18070vi.A0w(r9, r2, r8, r4, r11);
        C18070vi.A0x(r10, r7, r5, r12, r6);
        C18070vi.A0d(r3, 11);
        this.A07 = r9;
        this.A00 = r2;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A08 = r10;
        this.A05 = r7;
        this.A03 = r5;
        this.A0A = r12;
        this.A04 = r6;
        this.A01 = r3;
        this.A0B = z;
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A07);
        A15.put("in_pin_code", this.A05);
        A15.put("phone_number", this.A08);
        A15.put("address", this.A00);
        A15.put("city", this.A02);
        C170388pm r1 = this.A06;
        if (r1.A01()) {
            A15.put("landmark_area", r1);
        }
        C170418pp r12 = this.A09;
        if (r12.A01()) {
            A15.put("state", r12);
        }
        C170368pk r13 = this.A04;
        if (r13.A01()) {
            A15.put("house_number", r13);
        }
        C170358pj r14 = this.A03;
        if (r14.A01()) {
            A15.put("floor_number", r14);
        }
        C170338ph r15 = this.A01;
        if (r15.A01()) {
            A15.put("building_name", r15);
        }
        C170428pq r16 = this.A0A;
        if (r16.A01()) {
            A15.put("tower_number", r16);
        }
        boolean z = this.A0B;
        if (z) {
            A15.put("is_default", z);
        }
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShippingAddressData(name=");
        A10.append(this.A07);
        A10.append(", address=");
        A10.append(this.A00);
        A10.append(", landmarkArea=");
        A10.append(this.A06);
        A10.append(", city=");
        A10.append(this.A02);
        A10.append(", state=");
        A10.append(this.A09);
        A10.append(", phoneNumber=");
        A10.append(this.A08);
        A10.append(", inPinCode=");
        A10.append(this.A05);
        A10.append(", floorNumber=");
        A10.append(this.A03);
        A10.append(", towerNumber=");
        A10.append(this.A0A);
        A10.append(", houseNumber=");
        A10.append(this.A04);
        A10.append(", buildingName=");
        A10.append(this.A01);
        A10.append(", isDefault=");
        return C17900vP.A0F(A10, this.A0B);
    }
}
