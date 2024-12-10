package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.37i  reason: invalid class name and case insensitive filesystem */
public final class C694737i implements C22523BBg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C62092qm A02;
    public final /* synthetic */ C36001nB A03;
    public final /* synthetic */ boolean A04;

    public C694737i(Context context, C62092qm r2, C36001nB r3, int i, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = context;
        this.A00 = i;
        this.A04 = z;
    }

    public void Bti() {
        Log.e("AddAccountNavigator/updatePushConfigForCurrentAccount/sendClientConfigCallback/failed");
        C62092qm r4 = this.A02;
        AnonymousClass1KB r3 = r4.A00;
        if (r3 != null) {
            r3.A0J(new AnonymousClass3C0(r4, this.A01, 46));
        } else {
            C18070vi.A11("globalUI");
            throw null;
        }
    }

    public void onSuccess() {
        Log.i("AddAccountNavigator/updatePushConfigForCurrentAccount/sendClientConfigCallback/success");
        C62092qm r2 = this.A02;
        AnonymousClass1KB r0 = r2.A00;
        if (r0 != null) {
            r0.A0J(new C70843Cs((Object) r2, (Object) this.A03, (Object) this.A01, this.A00, 0, this.A04));
        } else {
            C18070vi.A11("globalUI");
            throw null;
        }
    }
}
