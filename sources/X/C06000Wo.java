package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0Wo  reason: invalid class name and case insensitive filesystem */
public final class C06000Wo implements C17440uf {
    public final int A00;
    public final AnonymousClass0OP A01;
    public final C25262Cc3 A02;
    public final C18090vk A03;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A01(r2, r3, this, i);
    }

    public C16820tH Bja(C17500ul r8, C17530uo r9, long j) {
        long A04;
        long j2 = j;
        if (r8.BjC(Constraints.A00(j)) < Constraints.A01(j)) {
            A04 = j;
        } else {
            A04 = Constraints.A04(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        AnonymousClass0XJ Bjb = r8.Bjb(A04);
        int min = Math.min(Bjb.A01, Constraints.A01(j));
        return r9.BhL(AnonymousClass1D7.A0I(), new C11360ju(this, r9, Bjb, min), min, Bjb.A00);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A03(r2, r3, this, i);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06000Wo) {
                C06000Wo r5 = (C06000Wo) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A02, (AnonymousClass000.A0L(this.A01) + this.A00) * 31));
    }

    public C06000Wo(AnonymousClass0OP r1, C25262Cc3 cc3, C18090vk r3, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = cc3;
        this.A03 = r3;
    }

    public final C25262Cc3 A00() {
        return this.A02;
    }

    public final C18090vk A01() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HorizontalScrollLayoutModifier(scrollerPosition=");
        A10.append(this.A01);
        A10.append(", cursorOffset=");
        A10.append(this.A00);
        A10.append(", transformedText=");
        A10.append(this.A02);
        A10.append(", textLayoutResultProvider=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
