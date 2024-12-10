package X;

import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.6o5  reason: invalid class name and case insensitive filesystem */
public class C133046o5 {
    public float A00;
    public float A01;
    public boolean A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CallGridViewModel A07;

    public void A00() {
        int i;
        int i2 = this.A05;
        int i3 = this.A06;
        int i4 = i2 + i3;
        boolean z = this.A02;
        if (z) {
            i = this.A03;
        } else {
            i = 0;
        }
        float f = this.A01;
        if (f < 0.0f) {
            i4 = (int) (((float) i4) + (((float) i3) * f));
            if (z) {
                i = (int) (((float) i) + (((float) this.A03) * f));
            }
        }
        float f2 = this.A00;
        if (f2 > 0.0f) {
            i = (int) (((float) i) + (((float) this.A04) * f2));
        }
        AnonymousClass1DT r1 = this.A07.A0U;
        Object A062 = r1.A06();
        C17960vV.A07(A062);
        C130786k0 r0 = (C130786k0) A062;
        r0.A05 = i4;
        r0.A03 = i;
        r1.A0F(r0);
    }

    public C133046o5(CallGridViewModel callGridViewModel, int i, int i2, int i3, int i4, boolean z) {
        this.A07 = callGridViewModel;
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A02 = z;
    }
}
