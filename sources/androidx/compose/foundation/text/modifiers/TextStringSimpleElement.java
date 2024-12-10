package androidx.compose.foundation.text.modifiers;

import X.AnonymousClass000;
import X.AnonymousClass09I;
import X.AnonymousClass0DV;
import X.AnonymousClass0WA;
import X.AnonymousClass1Y1;
import X.C15780rC;
import X.C18070vi;
import X.C26251Cvq;
import X.E3V;

public final class TextStringSimpleElement extends AnonymousClass0WA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C26251Cvq A03;
    public final E3V A04;
    public final String A05;
    public final boolean A06;

    public /* synthetic */ TextStringSimpleElement(C15780rC r9, C26251Cvq cvq, E3V e3v, String str, AnonymousClass1Y1 r13, int i, int i2, int i3, boolean z) {
        this(cvq, e3v, str, i, i2, i3, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
                if (!(C18070vi.A18(this.A05, textStringSimpleElement.A05) && C18070vi.A18(this.A03, textStringSimpleElement.A03) && C18070vi.A18(this.A04, textStringSimpleElement.A04) && this.A02 == textStringSimpleElement.A02 && this.A06 == textStringSimpleElement.A06 && this.A00 == textStringSimpleElement.A00 && this.A01 == textStringSimpleElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A03 */
    public AnonymousClass09I A01() {
        String str = this.A05;
        return new AnonymousClass09I((C15780rC) null, this.A03, this.A04, str, (AnonymousClass1Y1) null, this.A02, this.A00, this.A01, this.A06);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09I r11) {
        C26251Cvq cvq = this.A03;
        r11.A0N(r11.A0O(cvq), r11.A0Q(this.A05), r11.A0P(cvq, this.A04, this.A01, this.A00, this.A02, this.A06));
    }

    public int hashCode() {
        return (((AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, this.A05.hashCode() * 31)) + this.A02) * 31, this.A06) + this.A00) * 31) + this.A01) * 31;
    }

    public TextStringSimpleElement(C26251Cvq cvq, E3V e3v, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = cvq;
        this.A04 = e3v;
        this.A02 = i;
        this.A06 = z;
        this.A00 = i2;
        this.A01 = i3;
    }
}
