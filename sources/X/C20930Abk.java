package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abk  reason: case insensitive filesystem */
public final class C20930Abk implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public C20935Abp A00;
    public final C20931Abl A01;

    public C20930Abk(C20935Abp abp, C20931Abl abl) {
        C18070vi.A0d(abl, 1);
        this.A01 = abl;
        this.A00 = abp;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20930Abk) {
                C20930Abk abk = (C20930Abk) obj;
                if (!C18070vi.A18(this.A01, abk.A01) || !C18070vi.A18(this.A00, abk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        C20935Abp abp = this.A00;
        if (abp == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        abp.writeToParcel(parcel, i);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B0C(this));
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpiMerchantVpa(internalMetadata=");
        A10.append(this.A01);
        A10.append(", dynamicVpaMerchantDetails=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
