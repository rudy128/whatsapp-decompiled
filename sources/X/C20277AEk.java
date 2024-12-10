package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AEk  reason: case insensitive filesystem */
public final class C20277AEk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public ADE A00;
    public final int A01;
    public final String A02;
    public final List A03;
    public final List A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20277AEk(List list) {
        this((ADE) null, "{}", list, (List) null, 0);
        C18070vi.A0d(list, 1);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20277AEk) {
                C20277AEk aEk = (C20277AEk) obj;
                if (this.A01 != aEk.A01 || !C18070vi.A18(this.A03, aEk.A03) || !C18070vi.A18(this.A02, aEk.A02) || !C18070vi.A18(this.A04, aEk.A04) || !C18070vi.A18(this.A00, aEk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        Iterator A0r = C108985cd.A0r(parcel, this.A03);
        while (A0r.hasNext()) {
            ((C20253ADl) A0r.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r2 = C108985cd.A0r(parcel, list);
            while (A0r2.hasNext()) {
                AnonymousClass8BU.A14(parcel, A0r2, i);
            }
        }
        ADE ade = this.A00;
        if (ade == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        ade.writeToParcel(parcel, i);
    }

    public final boolean A00() {
        try {
            JSONObject optJSONObject = C17880vN.A16(this.A02).optJSONObject("media_thumbnail_configuration");
            if (optJSONObject == null || !optJSONObject.has("use_custom_video_thumbnail")) {
                return false;
            }
            return optJSONObject.getBoolean("use_custom_video_thumbnail");
        } catch (JSONException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InteractiveMessageContent/isCustomThumbnailEnabled/invalid json=");
            C108985cd.A1M(this.A02, A10, e);
            return false;
        }
    }

    public final boolean A01() {
        String str = this.A02;
        if (str != null && AnonymousClass1YF.A0T(str)) {
            return false;
        }
        try {
            return C17880vN.A16(str).has("limited_time_offer");
        } catch (JSONException e) {
            C17900vP.A0h("InteractiveMessageContent/isLimitedTimeOffer/invalid json=", str, AnonymousClass000.A10(), e);
            return false;
        }
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A03, this.A01 * 31) + C17900vP.A00(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeFlowContent(contentOfNfmSubtype=");
        A10.append(this.A01);
        A10.append(", buttons=");
        A10.append(this.A03);
        A10.append(", messageParamsJson=");
        A10.append(this.A02);
        A10.append(", formElements=");
        A10.append(this.A04);
        A10.append(", formState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C20277AEk(ADE ade, String str, List list, List list2, int i) {
        this.A01 = i;
        this.A03 = list;
        this.A02 = str;
        this.A04 = list2;
        this.A00 = ade;
    }
}
