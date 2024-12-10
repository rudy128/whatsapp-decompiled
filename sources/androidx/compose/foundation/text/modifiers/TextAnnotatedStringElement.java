package androidx.compose.foundation.text.modifiers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09H;
import X.AnonymousClass0DV;
import X.AnonymousClass0WA;
import X.AnonymousClass1Y1;
import X.C05680Vh;
import X.C15780rC;
import X.C18070vi;
import X.C22821Di;
import X.C26251Cvq;
import X.C27069DRu;
import X.E3V;
import java.util.List;

public final class TextAnnotatedStringElement extends AnonymousClass0WA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C27069DRu A03;
    public final C26251Cvq A04;
    public final E3V A05;
    public final List A06;
    public final C22821Di A07;
    public final C22821Di A08;
    public final boolean A09;

    public /* synthetic */ TextAnnotatedStringElement(C05680Vh r12, C15780rC r13, C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, C22821Di r18, C22821Di r19, AnonymousClass1Y1 r20, int i, int i2, int i3, boolean z) {
        this(dRu, cvq, e3v, list, r18, r19, i, i2, i3, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
                if (!C18070vi.A18(this.A03, textAnnotatedStringElement.A03) || !C18070vi.A18(this.A04, textAnnotatedStringElement.A04) || !C18070vi.A18(this.A06, textAnnotatedStringElement.A06) || !C18070vi.A18(this.A05, textAnnotatedStringElement.A05) || !C18070vi.A18(this.A08, textAnnotatedStringElement.A08) || this.A02 != textAnnotatedStringElement.A02 || this.A09 != textAnnotatedStringElement.A09 || this.A00 != textAnnotatedStringElement.A00 || this.A01 != textAnnotatedStringElement.A01 || !C18070vi.A18(this.A07, textAnnotatedStringElement.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass09H A01() {
        C27069DRu dRu = this.A03;
        C26251Cvq cvq = this.A04;
        E3V e3v = this.A05;
        C22821Di r7 = this.A08;
        int i = this.A02;
        boolean z = this.A09;
        return new AnonymousClass09H((C05680Vh) null, (C15780rC) null, dRu, cvq, e3v, this.A06, r7, this.A07, (AnonymousClass1Y1) null, i, this.A00, this.A01, z);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09H r14) {
        C26251Cvq cvq = this.A04;
        r14.A0N(r14.A0P(cvq), r14.A0O(this.A03), r14.A0Q(cvq, this.A05, this.A06, this.A01, this.A00, this.A02, this.A09), r14.A0R(this.A08, this.A07));
    }

    public int hashCode() {
        return (((((((AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A03))) + AnonymousClass001.A0l(this.A08)) * 31) + this.A02) * 31, this.A09) + this.A00) * 31) + this.A01) * 31) + AnonymousClass001.A0l(this.A06)) * 31) + AnonymousClass001.A0l(this.A07)) * 31 * 31;
    }

    public TextAnnotatedStringElement(C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, C22821Di r5, C22821Di r6, int i, int i2, int i3, boolean z) {
        this.A03 = dRu;
        this.A04 = cvq;
        this.A05 = e3v;
        this.A08 = r5;
        this.A02 = i;
        this.A09 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = r6;
    }
}
