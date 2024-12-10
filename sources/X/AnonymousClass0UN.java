package X;

import android.view.View;
import android.widget.Magnifier;

/* renamed from: X.0UN  reason: invalid class name */
public final class AnonymousClass0UN implements C17070th {
    public static final AnonymousClass0UN A00 = new Object();

    public /* bridge */ /* synthetic */ AnonymousClass0tA BH8(View view, C28644ECa eCa, float f, float f2, float f3, long j, boolean z, boolean z2) {
        return A00(view, eCa, f, f2, f3, j, z, z2);
    }

    public static AnonymousClass07B A00(View view, C28644ECa eCa, float f, float f2, float f3, long j, boolean z, boolean z2) {
        Magnifier build;
        if (z) {
            build = new Magnifier(view);
        } else {
            long CPT = eCa.CPT(j);
            float CPQ = eCa.CPQ(f);
            float CPQ2 = eCa.CPQ(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (CPT != AnonymousClass0QG.A01) {
                builder.setSize(C22339B3q.A01(AnonymousClass0QG.A02(CPT)), C22339B3q.A01(AnonymousClass0QG.A00(CPT)));
            }
            if (!Float.isNaN(CPQ)) {
                builder.setCornerRadius(CPQ);
            }
            if (!Float.isNaN(CPQ2)) {
                builder.setElevation(CPQ2);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            build = builder.build();
        }
        return new AnonymousClass07B(build);
    }

    public boolean BOG() {
        return true;
    }
}
