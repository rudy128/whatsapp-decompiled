package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.2yb  reason: invalid class name and case insensitive filesystem */
public class C66702yb implements C26791Tm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C63292sp A02;
    public final /* synthetic */ C129996ii A03;
    public final /* synthetic */ String A04;

    public C66702yb(C63292sp r1, C129996ii r2, String str, int i, long j) {
        this.A02 = r1;
        this.A01 = j;
        this.A03 = r2;
        this.A00 = i;
        this.A04 = str;
    }

    public void C35() {
        C63292sp r0 = this.A02;
        AnonymousClass1KB r3 = r0.A02;
        C138556xH r2 = r0.A05;
        r2.getClass();
        r3.A0J(new C98764rg((Object) r2, 22));
    }

    public void C8E() {
        Log.i("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeleted");
        C63292sp r4 = this.A02;
        r4.A0A.A0A(this.A01, true);
        r4.A08.unregisterObserver(this);
        r4.A02.A0J(new C70783Cm(this, this.A03, this.A04, this.A00, 7));
    }

    public void C8F(Pair pair) {
        C17900vP.A0X(pair, "CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeletionFailed: ", AnonymousClass000.A10());
        C63292sp r4 = this.A02;
        r4.A0A.A0A(this.A01, false);
        r4.A08.unregisterObserver(this);
        r4.A02.A0J(new C98764rg((Object) this, 21));
    }
}
