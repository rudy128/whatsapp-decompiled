package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.Czq  reason: case insensitive filesystem */
public final class C26451Czq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                account = (Account) C26300CxD.A0A(parcel, Account.CREATOR, readInt);
            } else if (c == 3) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C26300CxD.A0A(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23081Baw(account, googleSignInAccount, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23081Baw[i];
    }
}
