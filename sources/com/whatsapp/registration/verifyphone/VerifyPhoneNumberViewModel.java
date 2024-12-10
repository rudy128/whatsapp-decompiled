package com.whatsapp.registration.verifyphone;

import X.AnonymousClass1J2;
import X.AnonymousClass99H;
import X.AnonymousClass99I;
import X.AnonymousClass99J;
import X.AnonymousClass99K;
import X.C120626Eo;
import com.whatsapp.registration.autoconf.AutoconfUseCase;
import com.whatsapp.registration.passkey.PasskeyUseCase;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;

public final class VerifyPhoneNumberViewModel extends AnonymousClass1J2 {
    public final AutoconfUseCase A00;
    public final AnonymousClass99J A01;
    public final AnonymousClass99K A02;
    public final PasskeyUseCase A03;
    public final C120626Eo A04;
    public final VerifySilentAuthUseCase A05;
    public final AnonymousClass99H A06;
    public final AnonymousClass99I A07;

    public VerifyPhoneNumberViewModel(AutoconfUseCase autoconfUseCase, AnonymousClass99J r2, AnonymousClass99K r3, PasskeyUseCase passkeyUseCase, C120626Eo r5, VerifySilentAuthUseCase verifySilentAuthUseCase, AnonymousClass99H r7, AnonymousClass99I r8) {
        this.A07 = r8;
        this.A06 = r7;
        this.A00 = autoconfUseCase;
        this.A05 = verifySilentAuthUseCase;
        this.A03 = passkeyUseCase;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }
}
