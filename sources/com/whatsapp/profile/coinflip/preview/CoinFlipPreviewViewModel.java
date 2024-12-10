package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass4OC;
import X.AnonymousClass4YE;
import X.C18070vi;
import X.C18600wl;
import X.C27071Up;
import X.C27191Vc;
import X.C34071js;
import X.C41731wy;
import X.C823145h;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;

public final class CoinFlipPreviewViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1M9 A00;
    public final C27191Vc A01;
    public final ContactAvatarCoinFlipRepository A02;
    public final MyAvatarCoinFlipRepository A03;
    public final AnonymousClass4OC A04;
    public final C27071Up A05;
    public final AnonymousClass4YE A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C18600wl A08;
    public final AnonymousClass1G4 A09;
    public final AnonymousClass1G1 A0A;

    public CoinFlipPreviewViewModel(AnonymousClass1M9 r2, C27191Vc r3, ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository, MyAvatarCoinFlipRepository myAvatarCoinFlipRepository, AnonymousClass4OC r6, C27071Up r7, AnonymousClass4YE r8, C18600wl r9) {
        C18070vi.A0w(r2, r6, r8, r7, r3);
        C18070vi.A0q(myAvatarCoinFlipRepository, contactAvatarCoinFlipRepository, r9);
        this.A00 = r2;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = myAvatarCoinFlipRepository;
        this.A02 = contactAvatarCoinFlipRepository;
        this.A08 = r9;
        AnonymousClass1G7 A002 = C34071js.A00(C823145h.A00);
        this.A09 = A002;
        this.A0A = A002;
    }
}
