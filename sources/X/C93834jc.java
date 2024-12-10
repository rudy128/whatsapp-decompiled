package X;

import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.4jc  reason: invalid class name and case insensitive filesystem */
public final class C93834jc implements C107945as {
    public SecretCodeAuthenticationBottomSheet A00;
    public final C31191fA A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void BCo(AnonymousClass1FY r4, AnonymousClass4EF r5, AnonymousClass4Q2 r6, AnonymousClass4OS r7, int i) {
        C18070vi.A0d(r6, 3);
        SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = new SecretCodeAuthenticationBottomSheet(this.A01.A04.A0N());
        this.A00 = secretCodeAuthenticationBottomSheet;
        secretCodeAuthenticationBottomSheet.A01 = new C85494Np(r4, r6, this, i);
        secretCodeAuthenticationBottomSheet.A2C(r4.getSupportFragmentManager(), "SecretCodeAuthenticationBottomSheet");
    }

    public void BEO() {
        try {
            SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = this.A00;
            if (secretCodeAuthenticationBottomSheet != null) {
                secretCodeAuthenticationBottomSheet.A29();
            }
            this.A00 = null;
        } catch (IllegalStateException e) {
            Log.e("PasscodeChatLockAuthenticator/cancelAuthentication: ", e);
        }
    }

    public C93834jc(C31191fA r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        Boolean bool = C17960vV.A01;
    }
}
