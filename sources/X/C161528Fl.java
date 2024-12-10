package X;

import android.accounts.Account;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8Fl  reason: invalid class name and case insensitive filesystem */
public final class C161528Fl extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();

    public final void A0T(Context context, int i) {
        if (C19740yt.A01(context, "android.permission.GET_ACCOUNTS") == 0) {
            Account[] A01 = C41371wF.A01(context);
            C18070vi.A0X(A01);
            ArrayList A0z = C17880vN.A0z(r3);
            for (Account account : A01) {
                A0z.add(account.name);
            }
            this.A00.A0E(C29431cG.A0v(A0z, i));
            return;
        }
        Log.i("AddOrUpdateEmailViewModel/fetchEmails/permission not granted");
    }
}
