package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.4cZ  reason: invalid class name and case insensitive filesystem */
public final class C89504cZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass4DE A00;
    public final C89304cF A01;
    public final Float A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89504cZ) {
                C89504cZ r5 = (C89504cZ) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass3MY.A18(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f.floatValue());
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)), this.A03) + AnonymousClass001.A0k(this.A02);
    }

    public C89504cZ(C108345bY r5) {
        this(r5.BOO(), r5.BR7().BUq().BSi(), r5.BZk(), r5.Bet());
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("category", this.A00.name());
        A15.put("effectId", this.A01.A00);
        A15.put("isFromButton", this.A03);
        A15.put("effectStrength", this.A02);
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsSavedState(category=");
        A10.append(this.A00);
        A10.append(", effectId=");
        A10.append(this.A01);
        A10.append(", isFromButton=");
        A10.append(this.A03);
        A10.append(", effectStrength=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public C89504cZ(AnonymousClass4DE r1, C89304cF r2, Float f, boolean z) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = f;
    }
}
