package X;

import android.widget.Magnifier;

/* renamed from: X.0UL  reason: invalid class name */
public class AnonymousClass0UL implements AnonymousClass0tA {
    public final Magnifier A00;

    public long BZM() {
        Magnifier magnifier = this.A00;
        return C25293Ccv.A00(magnifier.getWidth(), magnifier.getHeight());
    }

    public void CQO(float f, long j, long j2) {
        this.A00.show(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
    }

    public void CQd() {
        this.A00.update();
    }

    public void dismiss() {
        this.A00.dismiss();
    }

    public AnonymousClass0UL(Magnifier magnifier) {
        this.A00 = magnifier;
    }

    public final Magnifier A00() {
        return this.A00;
    }
}
