package X;

import android.text.ParcelableSpan;

/* renamed from: X.CpM  reason: case insensitive filesystem */
public class C25954CpM {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final ParcelableSpan A04;
    public final CharSequence A05;

    public C25954CpM(ParcelableSpan parcelableSpan, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = 1;
        this.A05 = null;
        this.A04 = parcelableSpan;
        this.A02 = 0;
    }

    public C25954CpM(ParcelableSpan parcelableSpan, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A05 = null;
        this.A04 = parcelableSpan;
        this.A02 = i4;
    }

    public C25954CpM(ParcelableSpan parcelableSpan, CharSequence charSequence, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A05 = charSequence;
        this.A04 = parcelableSpan;
        this.A02 = i4;
    }
}
