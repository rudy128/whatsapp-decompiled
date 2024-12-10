package X;

import android.content.Context;
import android.view.TextureView;

public final class BTP extends C3J {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final TextureView A03;
    public final C28574E8g A04;
    public final E49 A05;
    public final E94 A06;
    public final CQQ A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTP) {
                BTP btp = (BTP) obj;
                if (!(C18070vi.A18(this.A02, btp.A02) && C18070vi.A18(this.A03, btp.A03) && this.A01 == btp.A01 && C18070vi.A18(this.A07, btp.A07) && C18070vi.A18(this.A06, btp.A06) && C18070vi.A18(this.A04, btp.A04) && C18070vi.A18(this.A05, btp.A05) && this.A0C == btp.A0C && this.A0K == btp.A0K && this.A0L == btp.A0L && this.A00 == btp.A00 && this.A0H == btp.A0H && this.A0D == btp.A0D && this.A0J == btp.A0J && this.A0I == btp.A0I && this.A0F == btp.A0F && this.A0B == btp.A0B && this.A0M == btp.A0M && this.A0G == btp.A0G && this.A0A == btp.A0A && this.A0E == btp.A0E && this.A09 == btp.A09 && C18070vi.A18(this.A08, btp.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L2 = AnonymousClass000.A0L(this.A02);
        return C108945cZ.A09(this.A08, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A07, (AnonymousClass000.A0N(this.A03, A0L2) + this.A01) * 31)))) + 1237) * 31, this.A0C), this.A0K), this.A0L), this.A00), this.A0H), this.A0D), this.A0J), this.A0I), this.A0F), this.A0B), this.A0M), this.A0G), this.A0A), this.A0E), this.A09));
    }

    public BTP(Context context, TextureView textureView, C28574E8g e8g, E49 e49, E94 e94, CQQ cqq, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A02 = context;
        this.A03 = textureView;
        this.A01 = i;
        this.A07 = cqq;
        this.A06 = e94;
        this.A04 = e8g;
        this.A05 = e49;
        this.A0C = z;
        this.A0K = z2;
        this.A0L = z3;
        this.A00 = z4;
        this.A0H = z5;
        this.A0D = z6;
        this.A0J = z7;
        this.A0I = z8;
        this.A0F = z9;
        this.A0B = z10;
        this.A0M = z11;
        this.A0G = z12;
        this.A0A = z13;
        this.A0E = z14;
        this.A09 = z15;
        this.A08 = str;
    }
}
