package X;

import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;

/* renamed from: X.ALu  reason: case insensitive filesystem */
public class C20457ALu implements C37241pC {
    public final int A00;
    public final Object A01;

    public C20457ALu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BxA() {
        String str;
        Intent A012;
        if (this.A00 == 0) {
            DeleteAccountConfirmation deleteAccountConfirmation = (DeleteAccountConfirmation) this.A01;
            AnonymousClass4Yv.A00(deleteAccountConfirmation, 1);
            AnonymousClass1E2 A09 = deleteAccountConfirmation.A02.A09();
            AnonymousClass00H r0 = deleteAccountConfirmation.A0B;
            if (r0 != null) {
                if (!AnonymousClass8BV.A1S(r0) || A09 == null) {
                    if (deleteAccountConfirmation.A07 != null) {
                        A012 = AnonymousClass1LU.A01(deleteAccountConfirmation);
                    }
                    str = "waIntents";
                } else {
                    Log.i("DeleteAccountConfirmation/onLocalAccountDeletionEnded/remove current account");
                    if (deleteAccountConfirmation.A07 != null) {
                        A012 = AnonymousClass1LU.A1X(deleteAccountConfirmation, A09.getRawString(), deleteAccountConfirmation.A0B.A01(), deleteAccountConfirmation.A0A.A0E(), 13, SystemClock.elapsedRealtime());
                    }
                    str = "waIntents";
                }
                C18070vi.A0b(A012);
                deleteAccountConfirmation.A3q(A012, true);
                return;
            }
            str = "accountSwitcher";
            C18070vi.A11(str);
            throw null;
        }
    }

    public void BxB() {
        String str;
        if (this.A00 != 0) {
            Log.i("VoiceService/AccountDeleteListener/onLocalAccountDeletionStarted");
            ((A99) this.A01).A0n(30, (String) null);
            return;
        }
        DeleteAccountConfirmation deleteAccountConfirmation = (DeleteAccountConfirmation) this.A01;
        C34991lS r0 = deleteAccountConfirmation.A06;
        if (r0 != null) {
            C35021lW r3 = C35021lW.A07;
            if (r0.A00(r3) != null) {
                C34991lS r2 = deleteAccountConfirmation.A06;
                if (r2 != null) {
                    r2.A05(new C20614ARy(), r3, (AnonymousClass705) null, (String) null);
                }
            }
            Handler handler = deleteAccountConfirmation.A00;
            if (handler == null) {
                str = "timeoutHandler";
            } else {
                handler.removeMessages(0);
                C19880zA r1 = deleteAccountConfirmation.A02;
                if (r1 == null) {
                    str = "smbAdsCreationActivityRouter";
                } else if (r1.A07()) {
                    r1.A03();
                    throw AnonymousClass000.A0s("deleteWhatsappBAccount");
                } else {
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "userEntityManagement";
        C18070vi.A11(str);
        throw null;
    }
}
