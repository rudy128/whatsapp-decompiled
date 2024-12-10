package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iv  reason: invalid class name and case insensitive filesystem */
public class C57342iv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33721jH A01;

    public C57342iv(C33721jH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void A00(Boolean bool, Exception exc) {
        Log.e("BackupTokenProtocolHelper/encryptAndSaveToken/onFailure", exc);
        C33721jH r4 = this.A01;
        AnonymousClass190 r3 = r4.A00;
        String A1E = AnonymousClass001.A1E(bool, "BackupTokenProtocolHelper/failure storing bytes/", AnonymousClass000.A10());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(exc.getClass().getCanonicalName());
        r3.A0E(A1E, C17900vP.A0C(" : ", A10, exc), exc);
        r4.A04.CGF(new C146607Px(this, bool, exc, this.A00, 2));
    }
}
