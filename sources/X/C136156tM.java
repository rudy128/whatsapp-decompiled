package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6tM  reason: invalid class name and case insensitive filesystem */
public final class C136156tM {
    public final int A00;
    public final Fragment A01;
    public final AnonymousClass1FL A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136156tM) {
                C136156tM r5 = (C136156tM) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C108955ca.A06(this.A04)) * 31) + this.A00;
    }

    public C136156tM(Fragment fragment, AnonymousClass1FL r2, Boolean bool, String str, String str2, int i) {
        this.A02 = r2;
        this.A01 = fragment;
        this.A05 = str;
        this.A03 = bool;
        this.A04 = str2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GalleryPickerListenerData(activity=");
        A10.append(this.A02);
        A10.append(", fragment=");
        A10.append(this.A01);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", isGroup=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        A10.append(this.A04);
        A10.append(", stickerOrigin=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
