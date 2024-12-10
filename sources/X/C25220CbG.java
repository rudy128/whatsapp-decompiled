package X;

import android.net.Uri;

/* renamed from: X.CbG  reason: case insensitive filesystem */
public final class C25220CbG {
    public final Uri A00;
    public final Uri A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25220CbG) {
                C25220CbG cbG = (C25220CbG) obj;
                if (!(C18070vi.A18(this.A00, cbG.A00) && C18070vi.A18(this.A01, cbG.A01) && this.A03 == cbG.A03 && this.A02 == cbG.A02 && this.A04 == cbG.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(((AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01)) * 31, this.A03), this.A02), this.A04);
    }

    public C25220CbG(Uri uri, Uri uri2, boolean z, boolean z2, boolean z3) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksVideoPlayerConfig(videoHdUri=");
        A10.append(this.A00);
        A10.append(", videoRegularUri=");
        A10.append(this.A01);
        A10.append(", loop=");
        A10.append(this.A03);
        A10.append(", autoplay=");
        A10.append(this.A02);
        A10.append(", muteOnMount=");
        return C17900vP.A0F(A10, this.A04);
    }
}
