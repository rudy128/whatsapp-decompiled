package X;

import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: X.4Ra  reason: invalid class name and case insensitive filesystem */
public final class C86284Ra {
    public int A00 = Integer.MAX_VALUE;
    public long A01 = 1048576;
    public Drawable A02;
    public Drawable A03;
    public A2k A04;
    public boolean A05 = false;
    public final AnonymousClass1KB A06;
    public final AnonymousClass181 A07;
    public final AnonymousClass1D9 A08;
    public final AnonymousClass10I A09;
    public final File A0A;
    public final String A0B;

    public AnonymousClass4VT A00() {
        AnonymousClass10I r4 = this.A09;
        return new AnonymousClass4VT(this.A06, this.A08, this, r4, this.A00);
    }

    public C86284Ra(AnonymousClass1KB r3, AnonymousClass181 r4, AnonymousClass1D9 r5, AnonymousClass10I r6, File file, String str) {
        this.A09 = r6;
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A0A = file;
        this.A0B = str;
    }
}
