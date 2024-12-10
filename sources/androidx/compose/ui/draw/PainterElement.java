package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0DV;
import X.AnonymousClass0HD;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C04640Oe;
import X.C17050tf;
import X.C18070vi;
import androidx.compose.ui.Alignment;

public final class PainterElement extends AnonymousClass0WA {
    public final float A00;
    public final Alignment A01;
    public final AnonymousClass0HD A02;
    public final C04640Oe A03;
    public final C17050tf A04;
    public final boolean A05 = true;

    public PainterElement(Alignment alignment, AnonymousClass0HD r3, C04640Oe r4, C17050tf r5, float f) {
        this.A03 = r4;
        this.A01 = alignment;
        this.A04 = r5;
        this.A00 = f;
        this.A02 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) obj;
                if (!C18070vi.A18(this.A03, painterElement.A03) || this.A05 != painterElement.A05 || !C18070vi.A18(this.A01, painterElement.A01) || !C18070vi.A18(this.A04, painterElement.A04) || Float.compare(this.A00, painterElement.A00) != 0 || !C18070vi.A18(this.A02, painterElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.09F] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C04640Oe r6 = this.A03;
        boolean z = this.A05;
        Alignment alignment = this.A01;
        C17050tf r3 = this.A04;
        float f = this.A00;
        AnonymousClass0HD r1 = this.A02;
        ? r0 = new AnonymousClass0XW();
        r0.A03 = r6;
        r0.A05 = z;
        r0.A01 = alignment;
        r0.A04 = r3;
        r0.A00 = f;
        r0.A02 = r1;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (r4 == r2) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.AnonymousClass0XW r8) {
        /*
            r7 = this;
            X.09F r8 = (X.AnonymousClass09F) r8
            boolean r0 = r8.A05
            boolean r6 = r7.A05
            if (r0 != r6) goto L_0x003c
            if (r6 == 0) goto L_0x001c
            X.0Oe r0 = r8.A03
            long r4 = r0.A02()
            X.0Oe r0 = r7.A03
            long r2 = r0.A02()
            long r0 = X.AnonymousClass0QG.A02
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
        L_0x001c:
            r1 = 0
        L_0x001d:
            X.0Oe r0 = r7.A03
            r8.A03 = r0
            r8.A05 = r6
            androidx.compose.ui.Alignment r0 = r7.A01
            r8.A01 = r0
            X.0tf r0 = r7.A04
            r8.A04 = r0
            float r0 = r7.A00
            r8.A00 = r0
            X.0HD r0 = r7.A02
            r8.A02 = r0
            if (r1 == 0) goto L_0x0038
            X.AnonymousClass0QV.A08(r8)
        L_0x0038:
            X.AnonymousClass0F0.A00(r8)
            return
        L_0x003c:
            r1 = 1
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterElement.A02(X.0XW):void");
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A03), this.A05))), this.A00) + AnonymousClass001.A0k(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PainterElement(painter=");
        A10.append(this.A03);
        A10.append(", sizeToIntrinsics=");
        A10.append(this.A05);
        A10.append(", alignment=");
        A10.append(this.A01);
        A10.append(", contentScale=");
        A10.append(this.A04);
        A10.append(", alpha=");
        A10.append(this.A00);
        A10.append(", colorFilter=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
