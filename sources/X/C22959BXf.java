package X;

import com.facebook.wearable.mediastream.model.SUPToggleState;

/* renamed from: X.BXf  reason: case insensitive filesystem */
public final class C22959BXf extends SUPToggleState {
    public final C22873BTh A00;
    public final boolean A01;

    public C24867CNl getCurrentStatusIndicatorState() {
        return this.A00.A00;
    }

    public SUPToggleState getUpdatedStatusIndicatorAttributes(Boolean bool, C24867CNl cNl, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new C22959BXf(this.A00.A00(cNl, bool, bool2, bool3, bool4), this.A01);
    }

    public SUPToggleState toConnected(boolean z) {
        C22873BTh bTh = this.A00;
        C18070vi.A0d(bTh, 1);
        return new C22959BXf(bTh, z);
    }

    public C22959BXf(C22873BTh bTh, boolean z) {
        this.A01 = z;
        this.A00 = bTh;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Connected(isSelected=");
        A10.append(this.A01);
        A10.append(", statusIndicatorAttributes=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
