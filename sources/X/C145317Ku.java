package X;

import android.content.Context;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.consent.ConsentNavigationViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.7Ku  reason: invalid class name and case insensitive filesystem */
public class C145317Ku implements C160848Ae {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C145317Ku(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void BzG() {
        if (this.A00 != 0) {
            ((ConsentNavigationViewModel) this.A02).A01.A0H(C18070vi.A0F((Context) this.A01, 2131886573), 1);
            return;
        }
        Log.e("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onNoEligibleDisclosure");
        ((C108195bI) this.A01).Bsl();
    }

    public void C3C(Integer num) {
        String str;
        if (this.A00 != 0) {
            ((ConsentNavigationViewModel) this.A02).A01.A0H(C18070vi.A0F((Context) this.A01, 2131886575), 1);
            return;
        }
        StringBuilder A0K = C18070vi.A0K(num);
        A0K.append("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onRenderingFailed: ");
        switch (num.intValue()) {
            case 1:
                str = "ERROR_MISMATCHED_TEMPLATE";
                break;
            case 2:
                str = "ERROR_CORRUPTED_DISCLOSURE_CONTENT";
                break;
            case 3:
                str = "ERROR_UNKNOWN";
                break;
            default:
                str = "ERROR_FAIL_TO_DOWNLOAD";
                break;
        }
        C17890vO.A19(A0K, str);
        ((C108195bI) this.A01).Bsl();
    }

    public void C9h() {
        if (this.A00 == 0) {
            Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserAcknowledged");
        }
    }

    public void C9i() {
        if (this.A00 == 0) {
            Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserApproved");
        }
    }

    public void C9j() {
        if (this.A00 != 0) {
            ((ConsentNavigationViewModel) this.A02).A01.A0H(C18070vi.A0F((Context) this.A01, 2131886573), 1);
            return;
        }
        Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserDenied");
    }

    public void C9l() {
        if (this.A00 != 0) {
            ((ConsentNavigationViewModel) this.A02).A04.A01.A08.A01(25);
            return;
        }
        Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserDismissed");
        ((C108195bI) this.A01).onDismiss();
    }

    public void C9m() {
        if (this.A00 == 0) {
            Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserOptedIn");
            AnonymousClass3MY.A1Y(((ArEffectsFlmConsentManager) this.A02).A07, true);
            ((C108195bI) this.A01).Bzd();
        }
    }

    public void C9o() {
        if (this.A00 == 0) {
            Log.i("ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet/onUserOptedOut");
        }
    }
}
