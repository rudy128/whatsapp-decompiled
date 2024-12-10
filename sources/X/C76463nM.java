package X;

/* renamed from: X.3nM  reason: invalid class name and case insensitive filesystem */
public final class C76463nM extends AnonymousClass4ME {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76463nM) {
                C76463nM r5 = (C76463nM) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A03), this.A02);
    }

    public C76463nM(boolean z, boolean z2) {
        super(z2, z);
        this.A03 = z;
        this.A02 = z2;
        int i = z ? 2131898226 : 2131898206;
        this.A00 = i;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MuteToggle(isMuted=");
        A10.append(this.A03);
        A10.append(", canToggleMute=");
        return C17900vP.A0F(A10, this.A02);
    }
}
