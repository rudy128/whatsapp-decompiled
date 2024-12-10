package com.google.android.gms.auth.api.signin;

import X.C18210vx;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final GoogleSignInAccount A00;
    @Deprecated
    public final String A01;
    @Deprecated
    public final String A02;

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, str, 4, false);
        C26293Cx2.A09(parcel, this.A00, 7, i, false);
        C26293Cx2.A0A(parcel, this.A02, 8, false);
        C26293Cx2.A05(parcel, A002);
    }

    public SignInAccount(GoogleSignInAccount googleSignInAccount, String str, String str2) {
        this.A00 = googleSignInAccount;
        C18210vx.A05(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        C18210vx.A05(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }
}
