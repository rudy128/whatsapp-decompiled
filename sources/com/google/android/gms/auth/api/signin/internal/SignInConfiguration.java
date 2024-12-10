package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass001;
import X.C17900vP;
import X.C18210vx;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((31 + C17900vP.A00(this.A01)) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 5, i, DJ0.A0L(parcel, str));
        C26293Cx2.A05(parcel, A002);
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        C18210vx.A03(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }
}
