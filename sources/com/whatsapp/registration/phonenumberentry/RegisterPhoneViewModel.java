package com.whatsapp.registration.phonenumberentry;

import X.AnonymousClass1J2;
import X.AnonymousClass99K;
import X.C120626Eo;
import com.whatsapp.registration.autoconf.AutoconfUseCase;
import com.whatsapp.registration.passkey.PasskeyUseCase;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;

public final class RegisterPhoneViewModel extends AnonymousClass1J2 {
    public final AutoconfUseCase A00;
    public final AnonymousClass99K A01;
    public final PasskeyUseCase A02;
    public final C120626Eo A03;
    public final VerifySilentAuthUseCase A04;

    public RegisterPhoneViewModel(AutoconfUseCase autoconfUseCase, AnonymousClass99K r2, PasskeyUseCase passkeyUseCase, C120626Eo r4, VerifySilentAuthUseCase verifySilentAuthUseCase) {
        this.A00 = autoconfUseCase;
        this.A02 = passkeyUseCase;
        this.A04 = verifySilentAuthUseCase;
        this.A01 = r2;
        this.A03 = r4;
    }
}
