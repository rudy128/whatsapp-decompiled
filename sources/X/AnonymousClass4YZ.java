package X;

import java.util.List;

/* renamed from: X.4YZ  reason: invalid class name */
public final class AnonymousClass4YZ {
    public final C445823z A00;
    public final C82954Cu A01;
    public final List A02;
    public final List A03;
    public final boolean A04;

    public AnonymousClass4YZ() {
        this((C445823z) null, C82954Cu.MAIN, AnonymousClass000.A13(), AnonymousClass000.A13(), true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YZ) {
                AnonymousClass4YZ r5 = (AnonymousClass4YZ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass001.A0k(this.A00) * 31))), this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(message=");
        A10.append(this.A00);
        A10.append(", responses=");
        A10.append(this.A03);
        A10.append(", eventInfoItems=");
        A10.append(this.A02);
        A10.append(", currentStep=");
        A10.append(this.A01);
        A10.append(", shouldAnimate=");
        return C17900vP.A0F(A10, this.A04);
    }

    public AnonymousClass4YZ(C445823z r1, C82954Cu r2, List list, List list2, boolean z) {
        this.A00 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = r2;
        this.A04 = z;
    }
}
