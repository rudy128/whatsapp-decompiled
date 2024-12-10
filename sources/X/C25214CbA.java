package X;

import android.graphics.RectF;

/* renamed from: X.CbA  reason: case insensitive filesystem */
public final class C25214CbA {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final C24344Bzf A03;
    public final C24339Bza A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25214CbA) {
                C25214CbA cbA = (C25214CbA) obj;
                if (!C18070vi.A18(this.A02, cbA.A02) || !C18070vi.A18(this.A01, cbA.A01) || !C18070vi.A18(this.A00, cbA.A00) || this.A04 != cbA.A04 || this.A03 != cbA.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)))));
    }

    public C25214CbA(RectF rectF, RectF rectF2, RectF rectF3, C24344Bzf bzf, C24339Bza bza) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = bza;
        this.A03 = bzf;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TooltipPositionInfo(tooltipRect=");
        A10.append(this.A02);
        A10.append(", contentRect=");
        A10.append(this.A01);
        A10.append(", arrowRect=");
        A10.append(this.A00);
        A10.append(", tooltipPosition=");
        A10.append(this.A04);
        A10.append(", arrowLocation=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
