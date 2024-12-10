package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DIa  reason: case insensitive filesystem */
public final /* synthetic */ class C26893DIa implements E5D {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ BZ4 A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C26893DIa(Account account, Bundle bundle, BZ4 bz4, String str) {
        this.A02 = bz4;
        this.A00 = account;
        this.A03 = str;
        this.A01 = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        Account account = this.A00;
        String str = this.A03;
        Bundle bundle = this.A01;
        C26396Cyw cyw = (C26396Cyw) ((C26157CtR) obj).A04();
        C23253Be3 be3 = new C23253Be3((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        BE9.A15(be3, obtain, cyw.A00);
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString(str);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        cyw.A01(1, obtain);
    }
}
