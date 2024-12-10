package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* renamed from: X.Cza  reason: case insensitive filesystem */
public final class C26435Cza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 5) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C26300CxD.A0A(parcel, GoogleSignInOptions.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new SignInConfiguration(googleSignInOptions, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
