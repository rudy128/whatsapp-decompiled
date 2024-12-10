package com.whatsapp.profile.coinflip.nux;

import X.AGE;
import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass1FL;
import X.AnonymousClass5YI;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C18070vi;
import X.C20098A7b;
import X.C24051Ir;
import android.os.Bundle;

public final class CoinFlipNUXBottomSheetLauncher extends AnonymousClass1FL implements AnonymousClass009, AnonymousClass5YI {
    public CoinFlipNUXBottomSheet A00;
    public C006302u A01;
    public boolean A02;
    public final Object A03;
    public volatile C006002q A04;

    public final C006002q A2m() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C006002q(this);
                }
            }
        }
        return this.A04;
    }

    public CoinFlipNUXBottomSheetLauncher(int i) {
        this.A03 = C17880vN.A0p();
        this.A02 = false;
        AGE.A00(this, 18);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2m().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2m().A00();
            this.A01 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        CoinFlipNUXBottomSheet coinFlipNUXBottomSheet = this.A00;
        if (coinFlipNUXBottomSheet != null) {
            coinFlipNUXBottomSheet.A05 = this;
            C20098A7b.A01(coinFlipNUXBottomSheet, getSupportFragmentManager());
            return;
        }
        C18070vi.A11("coinFlipNUXBottomSheet");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A01);
        CoinFlipNUXBottomSheet coinFlipNUXBottomSheet = this.A00;
        if (coinFlipNUXBottomSheet != null) {
            coinFlipNUXBottomSheet.A05 = null;
        } else {
            C18070vi.A11("coinFlipNUXBottomSheet");
            throw null;
        }
    }

    public CoinFlipNUXBottomSheetLauncher() {
        this(0);
    }
}
