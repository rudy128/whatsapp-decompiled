package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass092;
import X.AnonymousClass0AU;
import X.AnonymousClass0CI;
import X.AnonymousClass0DV;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.AnonymousClass0t9;
import X.C16080rg;
import X.C16840tJ;
import X.C17010ta;
import X.C17210uI;
import X.C18070vi;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

public final class ScrollableElement extends AnonymousClass0WA {
    public final AnonymousClass0t9 A00;
    public final C17010ta A01;
    public final C16080rg A02;
    public final AnonymousClass0CI A03;
    public final C16840tJ A04;
    public final C17210uI A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) obj;
                if (!C18070vi.A18(this.A04, scrollableElement.A04) || this.A03 != scrollableElement.A03 || !C18070vi.A18(this.A00, scrollableElement.A00) || this.A06 != scrollableElement.A06 || this.A07 != scrollableElement.A07 || !C18070vi.A18(this.A02, scrollableElement.A02) || !C18070vi.A18(this.A05, scrollableElement.A05) || !C18070vi.A18(this.A01, scrollableElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C16840tJ r5 = this.A04;
        AnonymousClass0CI r4 = this.A03;
        AnonymousClass0t9 r1 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A07;
        return new AnonymousClass0AU(r1, this.A01, this.A02, r4, r5, this.A05, z, z2);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r12) {
        C16080rg r2;
        AnonymousClass0AU r122 = (AnonymousClass0AU) r12;
        C16840tJ r10 = this.A04;
        AnonymousClass0CI r9 = this.A03;
        AnonymousClass0t9 r8 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A07;
        C16080rg r5 = this.A02;
        C17210uI r4 = this.A05;
        C17010ta r3 = this.A01;
        if (r122.A05 != z) {
            r122.A0B.A00 = z;
            r122.A09.A00 = z;
        }
        if (r5 == null) {
            r2 = r122.A08;
        } else {
            r2 = r5;
        }
        ScrollingLogic scrollingLogic = r122.A0C;
        NestedScrollDispatcher nestedScrollDispatcher = r122.A0D;
        scrollingLogic.A03 = r10;
        scrollingLogic.A02 = r9;
        scrollingLogic.A00 = r8;
        scrollingLogic.A05 = z2;
        scrollingLogic.A01 = r2;
        scrollingLogic.A04 = nestedScrollDispatcher;
        r122.A0A.A0O(r9, r4, z);
        AnonymousClass092 r0 = r122.A07;
        r0.A02 = r9;
        r0.A03 = r10;
        r0.A06 = z2;
        r0.A01 = r3;
        r122.A03 = r10;
        r122.A02 = r9;
        r122.A00 = r8;
        r122.A05 = z;
        r122.A06 = z2;
        r122.A01 = r5;
        r122.A04 = r4;
    }

    public int hashCode() {
        int i = 0;
        int A002 = (AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A04)) + AnonymousClass001.A0l(this.A00)) * 31, this.A06), this.A07) + AnonymousClass001.A0l(this.A02)) * 31;
        C17210uI r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return AnonymousClass000.A0O(this.A01, (A002 + i) * 31);
    }

    public ScrollableElement(AnonymousClass0t9 r1, C17010ta r2, C16080rg r3, AnonymousClass0CI r4, C16840tJ r5, C17210uI r6, boolean z, boolean z2) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }
}
