package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.6yd  reason: invalid class name and case insensitive filesystem */
public class C139316yd {
    @Deprecated
    public int A00;
    public PendingIntent A01;
    public CharSequence A02;
    public boolean A03;
    public boolean A04;
    public IconCompat A05;
    public final int A06;
    public final Bundle A07;
    public final C129536hx[] A08;
    public final C129536hx[] A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C139316yd(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(pendingIntent, C17880vN.A0D(), i != 0 ? IconCompat.A02((Resources) null, "", i) : null, charSequence, (C129536hx[]) null, (C129536hx[]) null, 0, true, true);
    }

    public IconCompat A00() {
        int i;
        IconCompat iconCompat = this.A05;
        if (iconCompat != null || (i = this.A00) == 0) {
            return iconCompat;
        }
        IconCompat A022 = IconCompat.A02((Resources) null, "", i);
        this.A05 = A022;
        return A022;
    }

    public C139316yd(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, C129536hx[] r7, C129536hx[] r8, int i, boolean z, boolean z2) {
        this.A04 = true;
        this.A05 = iconCompat;
        if (iconCompat != null && iconCompat.A06() == 2) {
            this.A00 = iconCompat.A05();
        }
        this.A02 = C1409673t.A04(charSequence);
        this.A01 = pendingIntent;
        this.A07 = bundle;
        this.A08 = r7;
        this.A09 = r8;
        this.A03 = z;
        this.A06 = i;
        this.A04 = z2;
    }
}
