package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.Czb  reason: case insensitive filesystem */
public final class C26436Czb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 3:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 4:
                    str3 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    str4 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C26300CxD.A0A(parcel2, Uri.CREATOR, readInt);
                    break;
                case 7:
                    str5 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 8:
                    j = C26300CxD.A07(parcel2, readInt);
                    break;
                case 9:
                    str6 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 10:
                    arrayList = C26300CxD.A0G(parcel2, Scope.CREATOR, readInt);
                    break;
                case 11:
                    str7 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 12:
                    str8 = C26300CxD.A0D(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new GoogleSignInAccount(uri, str, str2, str3, str4, str5, str6, str7, str8, arrayList, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
