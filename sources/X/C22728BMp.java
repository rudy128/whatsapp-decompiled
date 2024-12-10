package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.BMp  reason: case insensitive filesystem */
public final class C22728BMp extends BMq {
    public final Intent A00;
    public final C25644CjX A01;
    public final Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22728BMp(Intent intent, C25780Clr clr, C25780Clr clr2, C25773Clk clk, C25644CjX cjX, Set set) {
        super(clr, clr2, clk);
        C18070vi.A0d(cjX, 5);
        C18070vi.A0d(clr2, 10);
        boolean z = !cjX.equals(C25644CjX.A03);
        Object[] A1Z = BE6.A1Z();
        if (z) {
            this.A02 = C29431cG.A12(set);
            this.A00 = intent;
            this.A01 = cjX;
            return;
        }
        throw BE8.A0X("NEVER is not a valid configuration for SplitPlaceholderRule. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API.", A1Z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C22728BMp) && super.equals(obj)) {
                C22728BMp bMp = (C22728BMp) obj;
                if (!C18070vi.A18(this.A00, bMp.A00) || !C18070vi.A18(this.A01, bMp.A01) || !C18070vi.A18(this.A02, bMp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, (AnonymousClass000.A0N(this.A00, hashCode) + 1237) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "SplitPlaceholderRule{tag=");
        BMq.A00(this, A10);
        A10.append(", placeholderIntent=");
        A10.append(this.A00);
        C108975cc.A15(A10, ", isSticky=");
        A10.append(", finishPrimaryWithPlaceholder=");
        A10.append(this.A01);
        A10.append(", filters=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
