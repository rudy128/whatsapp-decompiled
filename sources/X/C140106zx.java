package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.6zx  reason: invalid class name and case insensitive filesystem */
public final class C140106zx {
    public final Bitmap A00;
    public final Bitmap A01;
    public final C135456sE A02;
    public final C136236tU A03;
    public final C134896rK A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140106zx) {
                C140106zx r5 = (C140106zx) obj;
                if (this.A09 != r5.A09 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || this.A08 != r5.A08 || this.A07 != r5.A07 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A06, AnonymousClass3MX.A03(this.A09));
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A04, (((((AnonymousClass000.A0N(this.A05, A0N) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A01)) * 31), this.A08), this.A07) + C17880vN.A02(this.A00);
    }

    public C140106zx(Bitmap bitmap, Bitmap bitmap2, C135456sE r4, C136236tU r5, C134896rK r6, List list, List list2, boolean z, boolean z2, boolean z3) {
        C18070vi.A0k(list, list2);
        C18070vi.A0d(r6, 7);
        this.A09 = z;
        this.A06 = list;
        this.A05 = list2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = bitmap;
        this.A04 = r6;
        this.A08 = z2;
        this.A07 = z3;
        this.A00 = bitmap2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isSaving=");
        A10.append(this.A09);
        A10.append(", avatarPoses=");
        A10.append(this.A06);
        A10.append(", avatarBackgrounds=");
        A10.append(this.A05);
        A10.append(", selectedBackground=");
        A10.append(this.A02);
        A10.append(", selectedPose=");
        A10.append(this.A03);
        A10.append(", selectedPoseBitmap=");
        A10.append(this.A01);
        A10.append(", fetchedPosesData=");
        C108965cb.A1T(this.A04, A10);
        A10.append(this.A08);
        A10.append(", isError=");
        A10.append(this.A07);
        A10.append(", profilePicBitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C140106zx() {
        /*
            r11 = this;
            r1 = 0
            r8 = 0
            X.0wS r6 = X.C18460wS.A00
            X.6rK r5 = new X.6rK
            r5.<init>(r6, r6)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r6
            r9 = r8
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140106zx.<init>():void");
    }
}
