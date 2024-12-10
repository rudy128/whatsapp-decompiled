package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: X.Czd  reason: case insensitive filesystem */
public final class C26438Czd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 4) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 7) {
                str2 = C26300CxD.A0E(parcel, str2, c, 8, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C26300CxD.A0A(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new SignInAccount(googleSignInAccount, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
