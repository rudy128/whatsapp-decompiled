package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Czc  reason: case insensitive filesystem */
public final class C26437Czc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList = C26300CxD.A0G(parcel, Scope.CREATOR, readInt);
                    break;
                case 3:
                    account = (Account) C26300CxD.A0A(parcel, Account.CREATOR, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 7:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 8:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = C26300CxD.A0G(parcel, C23070Bal.CREATOR, readInt);
                    break;
                case 10:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
        HashMap A11 = C17880vN.A11();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C23070Bal bal = (C23070Bal) it.next();
                C108955ca.A1V(bal, A11, bal.A00);
            }
        }
        return new GoogleSignInOptions(account, str, str2, str3, arrayList, A11, i, z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
