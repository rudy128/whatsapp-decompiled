package X;

import java.util.List;

/* renamed from: X.4VF  reason: invalid class name */
public final class AnonymousClass4VF {
    public final int A00;
    public final long A01;
    public final AnonymousClass4DE A02;
    public final C86724Su A03;
    public final C86724Su A04;
    public final List A05;
    public final C18090vk A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VF) {
                AnonymousClass4VF r8 = (AnonymousClass4VF) obj;
                if (!(C18070vi.A18(this.A05, r8.A05) && this.A08 == r8.A08 && this.A01 == r8.A01 && this.A07 == r8.A07 && this.A00 == r8.A00 && C18070vi.A18(this.A04, r8.A04) && C18070vi.A18(this.A03, r8.A03) && C18070vi.A18(this.A06, r8.A06) && this.A09 == r8.A09 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A05), this.A08);
        return AnonymousClass000.A0O(this.A02, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A06, (((((AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A01, A002), this.A07) + this.A00) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A03)) * 31), this.A09));
    }

    public AnonymousClass4VF(AnonymousClass4DE r3, C86724Su r4, C86724Su r5, List list, C18090vk r7, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A05 = list;
        this.A08 = z;
        this.A01 = j;
        this.A07 = z2;
        this.A00 = i;
        this.A04 = r4;
        this.A03 = r5;
        this.A06 = r7;
        this.A09 = z3;
        this.A02 = r3;
        C17960vV.A0F(AnonymousClass000.A1T(list.size(), C29431cG.A12(list).size()), "Duplicate categories in tray configuration");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsTrayCollectionConfiguration(categories=");
        A10.append(this.A05);
        A10.append(", shouldCenterSelectedTab=");
        A10.append(this.A08);
        A10.append(", dismissalTransitionMs=");
        A10.append(this.A01);
        A10.append(", enableAdditionalCenteredItemInteractions=");
        A10.append(this.A07);
        A10.append(", tabLayoutBackgroundColorRes=");
        A10.append(this.A00);
        A10.append(", startAccessoryButton=");
        A10.append(this.A04);
        A10.append(", endAccessoryButton=");
        A10.append(this.A03);
        A10.append(", noneSelectedDrawableGetter=");
        A10.append(this.A06);
        A10.append(", shouldHideNoneNameLabel=");
        A10.append(this.A09);
        A10.append(", initialCategory=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
