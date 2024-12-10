package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.Baw  reason: case insensitive filesystem */
public final class C23081Baw extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        boolean A0J = DJ0.A0J(parcel, this.A02, i);
        C26293Cx2.A06(parcel, 3, this.A01);
        C26293Cx2.A09(parcel, this.A03, 4, i, A0J);
        C26293Cx2.A05(parcel, A012);
    }

    public C23081Baw(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }
}
