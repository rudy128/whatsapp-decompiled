package X;

/* renamed from: X.5ty  reason: invalid class name and case insensitive filesystem */
public final class C115415ty extends C123026Sv {
    public final C123006St A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115415ty) {
                C115415ty r5 = (C115415ty) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A03), this.A01), this.A02));
    }

    public C115415ty(C123006St r1, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarDetails(isDeleting=");
        A10.append(this.A03);
        A10.append(", deleteError=");
        A10.append(this.A01);
        A10.append(", isBottomSheetDraggable=");
        A10.append(this.A02);
        A10.append(", avatarPreviewBitmapState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C115415ty() {
        this(C115345tr.A00, false, false, false);
    }
}
