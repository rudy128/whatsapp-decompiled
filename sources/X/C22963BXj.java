package X;

import com.facebook.wearable.mediastream.model.SUPToggleState;

/* renamed from: X.BXj  reason: case insensitive filesystem */
public final class C22963BXj extends SUPToggleState {
    public final C22873BTh A00;
    public final boolean A01;

    public SUPToggleState getUpdatedStatusIndicatorAttributes(Boolean bool, C24867CNl cNl, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new C22963BXj(this.A00.A00(cNl, bool, bool2, bool3, bool4), this.A01);
    }

    public SUPToggleState toConnected(boolean z) {
        return new C22959BXf(new C22873BTh(new BY9(100), false, false, false, this.A00.A04), z);
    }

    public C22963BXj(C22873BTh bTh, boolean z) {
        this.A01 = z;
        this.A00 = bTh;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Connecting(isStreamingOverWifi=");
        A10.append(this.A01);
        A10.append(", statusIndicatorAttributes=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C22963BXj() {
        this(new C22873BTh(new BY9(100), false, false, false, false), false);
    }
}
