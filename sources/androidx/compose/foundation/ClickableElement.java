package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass079;
import X.AnonymousClass0DV;
import X.AnonymousClass0JM;
import X.AnonymousClass0WA;
import X.AnonymousClass1Y1;
import X.C17210uI;
import X.C18070vi;
import X.C18090vk;

public final class ClickableElement extends AnonymousClass0WA {
    public final C17210uI A00;
    public final AnonymousClass0JM A01;
    public final String A02;
    public final C18090vk A03;
    public final boolean A04;

    public /* synthetic */ ClickableElement(C17210uI r1, AnonymousClass0JM r2, String str, C18090vk r4, AnonymousClass1Y1 r5, boolean z) {
        this(r1, r2, str, r4, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ClickableElement clickableElement = (ClickableElement) obj;
                if (!C18070vi.A18(this.A00, clickableElement.A00) || this.A04 != clickableElement.A04 || !C18070vi.A18(this.A02, clickableElement.A02) || !C18070vi.A18(this.A01, clickableElement.A01) || !C18070vi.A18(this.A03, clickableElement.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass079 A01() {
        C17210uI r1 = this.A00;
        boolean z = this.A04;
        return new AnonymousClass079(r1, this.A01, this.A02, this.A03, (AnonymousClass1Y1) null, z);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass079 r7) {
        C17210uI r1 = this.A00;
        boolean z = this.A04;
        AnonymousClass079 r0 = r7;
        r0.A0Q(r1, this.A01, this.A02, this.A03, z);
    }

    public int hashCode() {
        int i;
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A04);
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (A002 + i) * 31;
        AnonymousClass0JM r0 = this.A01;
        if (r0 != null) {
            i2 = r0.A00;
        }
        return AnonymousClass000.A0O(this.A03, (i3 + i2) * 31);
    }

    public ClickableElement(C17210uI r1, AnonymousClass0JM r2, String str, C18090vk r4, boolean z) {
        this.A00 = r1;
        this.A04 = z;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = r4;
    }
}
