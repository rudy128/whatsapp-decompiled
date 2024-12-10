package X;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.7IE  reason: invalid class name */
public abstract class AnonymousClass7IE implements AnonymousClass894 {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public AnonymousClass7IE(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public void Bub(C128396fv r10, Set set) {
        String str;
        String A0F;
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        IdentityVerificationActivity.A0d(identityVerificationActivity);
        if (r10 != null) {
            if (identityVerificationActivity.A0F != null) {
                C128396fv r0 = identityVerificationActivity.A0C;
                if (r0 == r10) {
                    return;
                }
                if (r0 != null) {
                    C133506os r1 = r0.A01;
                    C133506os r02 = r10.A01;
                    if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                        return;
                    }
                }
            } else {
                C18070vi.A11("fingerprintUtil");
                throw null;
            }
        }
        identityVerificationActivity.A0C = r10;
        identityVerificationActivity.A4b().A0A = r10;
        identityVerificationActivity.A00 = set.size() - 1;
        if (!identityVerificationActivity.A0R) {
            C1192467i r12 = (C1192467i) this;
            if (r12.A00 != 0) {
                IdentityVerificationActivity identityVerificationActivity2 = (IdentityVerificationActivity) r12.A01;
                AnonymousClass1E7 r13 = identityVerificationActivity2.A0D;
                if (r13 == null) {
                    str = "contact";
                } else {
                    C24921Me r03 = identityVerificationActivity2.A08;
                    if (r03 != null) {
                        String A0I = r03.A0I(r13);
                        if (A0I == null) {
                            A0F = null;
                        } else {
                            A0F = identityVerificationActivity2.A00.A0F(A0I);
                        }
                        String A0x = AnonymousClass3MW.A0x(identityVerificationActivity2.getResources(), A0F, new Object[1], 0, 2131895575);
                        C18070vi.A0X(A0x);
                        String A0x2 = AnonymousClass3MW.A0x(identityVerificationActivity2.getResources(), A0F, new Object[1], 0, 2131895574);
                        C18070vi.A0X(A0x2);
                        LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                        Bundle A0D = C17880vN.A0D();
                        A0D.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 101);
                        A0D.putCharSequence("title", A0x);
                        A0D.putCharSequence("message", A0x2);
                        legacyMessageDialogFragment.A1R(A0D);
                        identityVerificationActivity2.CMk(legacyMessageDialogFragment, (String) null);
                        identityVerificationActivity2.A0R = true;
                        return;
                    }
                    str = "waContactNames";
                }
                C18070vi.A11(str);
                throw null;
            }
            IdentityVerificationActivity.A0t((IdentityVerificationActivity) r12.A01);
        }
    }

    public void C1J() {
        String str;
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        C139306yc A4c = identityVerificationActivity.A4c();
        UserJid userJid = identityVerificationActivity.A0J;
        if (userJid == null) {
            str = "jid";
        } else if (!A4c.A00(userJid)) {
            ProgressBar progressBar = identityVerificationActivity.A03;
            if (progressBar == null) {
                str = "progressBar";
            } else {
                progressBar.setVisibility(0);
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }
}
