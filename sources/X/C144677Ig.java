package X;

import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.7Ig  reason: invalid class name and case insensitive filesystem */
public final class C144677Ig implements AnonymousClass87K {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public void BpN(Integer num) {
        C18070vi.A0d(num, 0);
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        identityVerificationActivity.runOnUiThread(new C146507Pj(identityVerificationActivity, num, 16));
    }

    public C144677Ig(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }
}
