package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* renamed from: X.0A9  reason: invalid class name */
public final class AnonymousClass0A9 extends C02170Cz {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public float A02 = 4.0f;
    public float A03;
    public float A04 = 1.0f;
    public float A05;
    public float A06;
    public int A07 = 0;
    public int A08 = 0;
    public C03380Hv A09;
    public C03380Hv A0A;
    public C17040te A0B;
    public List A0C = AnonymousClass0GD.A00;
    public boolean A0D = true;
    public boolean A0E = true;
    public boolean A0F;
    public C016809l A0G;
    public final C17040te A0H;
    public final C18100vl A0I;

    private final C15790rD A00() {
        return (C15790rD) this.A0I.getValue();
    }

    private final void A01() {
        Path.FillType fillType;
        if (this.A06 == 0.0f && this.A04 == 1.0f) {
            this.A0B = this.A0H;
            return;
        }
        C17040te r0 = this.A0B;
        C17040te r4 = this.A0H;
        if (C18070vi.A18(r0, r4)) {
            this.A0B = AnonymousClass0WS.A00();
        } else {
            boolean A1Z = AnonymousClass000.A1Z(((AnonymousClass0WS) this.A0B).A03.getFillType(), Path.FillType.EVEN_ODD);
            ((AnonymousClass0WS) this.A0B).A03.rewind();
            Path path = ((AnonymousClass0WS) this.A0B).A03;
            if (A1Z) {
                fillType = Path.FillType.EVEN_ODD;
            } else {
                fillType = Path.FillType.WINDING;
            }
            path.setFillType(fillType);
        }
        ((AnonymousClass0WT) A00()).A00.setPath(((AnonymousClass0WS) r4).A03, false);
        float length = ((AnonymousClass0WT) A00()).A00.getLength();
        float f = this.A06;
        float f2 = this.A05;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.A04 + f2) % 1.0f) * length;
        int i = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
        C15790rD A002 = A00();
        C17040te r02 = this.A0B;
        PathMeasure pathMeasure = ((AnonymousClass0WT) A002).A00;
        Path path2 = ((AnonymousClass0WS) r02).A03;
        if (i > 0) {
            pathMeasure.getSegment(f3, length, path2, true);
            ((AnonymousClass0WT) A00()).A00.getSegment(0.0f, f4, ((AnonymousClass0WS) this.A0B).A03, true);
            return;
        }
        pathMeasure.getSegment(f3, f4, path2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r11.A0F != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C17770vC r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x0049
            java.util.List r1 = r11.A0C
            X.0te r0 = r11.A0H
            X.AnonymousClass0LK.A01(r0, r1)
        L_0x000b:
            r11.A01()
        L_0x000e:
            r4 = 0
            r11.A0D = r4
            r11.A0F = r4
            X.0Hv r5 = r11.A09
            r7 = r12
            if (r5 == 0) goto L_0x0022
            X.0te r6 = r11.A0B
            float r9 = r11.A00
            r10 = 56
            r8 = 0
            X.C04820Pb.A00(r5, r6, r7, r8, r9, r10)
        L_0x0022:
            X.0Hv r5 = r11.A0A
            if (r5 == 0) goto L_0x0048
            X.09l r8 = r11.A0G
            boolean r0 = r11.A0E
            if (r0 != 0) goto L_0x002e
            if (r8 != 0) goto L_0x003f
        L_0x002e:
            float r3 = r11.A03
            float r2 = r11.A02
            int r1 = r11.A07
            int r0 = r11.A08
            X.09l r8 = new X.09l
            r8.<init>(r3, r2, r1, r0)
            r11.A0G = r8
            r11.A0E = r4
        L_0x003f:
            X.0te r6 = r11.A0B
            float r9 = r11.A01
            r10 = 48
            X.C04820Pb.A00(r5, r6, r7, r8, r9, r10)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A9.A05(X.0vC):void");
    }

    public String toString() {
        return this.A0H.toString();
    }

    public AnonymousClass0A9() {
        AnonymousClass0WS A002 = AnonymousClass0WS.A00();
        this.A0H = A002;
        this.A0B = A002;
        this.A0I = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C08990fz.A00);
    }
}
