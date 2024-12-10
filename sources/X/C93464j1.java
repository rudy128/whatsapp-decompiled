package X;

/* renamed from: X.4j1  reason: invalid class name and case insensitive filesystem */
public final class C93464j1 implements AnonymousClass5X0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass4ZN A05;
    public final AnonymousClass4DG A06;
    public final C27881Xz A07;
    public final boolean A08;
    public final boolean A09;

    public C93464j1() {
        this((AnonymousClass4ZN) null, (AnonymousClass4DG) null, (C27881Xz) null, 0, 0, 0, 0, 0, false, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93464j1) {
                C93464j1 r5 = (C93464j1) obj;
                if (!(this.A09 == r5.A09 && this.A08 == r5.A08 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A04 == r5.A04 && C18070vi.A18(this.A05, r5.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A09), this.A08) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A04) * 31) + C17880vN.A02(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(selected=");
        A10.append(this.A09);
        A10.append(", enabled=");
        A10.append(this.A08);
        A10.append(", variant=");
        A10.append(this.A07);
        A10.append(", action=");
        A10.append(this.A06);
        A10.append(", iconTintResId=");
        A10.append(this.A03);
        A10.append(", iconResId=");
        A10.append(this.A02);
        A10.append(", contentDescription=");
        A10.append(this.A01);
        A10.append(", clickDescription=");
        A10.append(this.A00);
        A10.append(", onChangeA11yAnnouncement=");
        A10.append(this.A04);
        A10.append(", text=");
        return AnonymousClass001.A1F(this.A05, A10);
    }

    public C93464j1(AnonymousClass4ZN r1, AnonymousClass4DG r2, C27881Xz r3, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.A09 = z;
        this.A08 = z2;
        this.A07 = r3;
        this.A06 = r2;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A04 = i5;
        this.A05 = r1;
    }
}
