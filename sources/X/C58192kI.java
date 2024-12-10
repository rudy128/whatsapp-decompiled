package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2kI  reason: invalid class name and case insensitive filesystem */
public final class C58192kI {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C25811CmO A04;
    public final AnonymousClass6nF A05;
    public final C26551So A06;
    public final AnonymousClass73B A07;
    public final File A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final File A00() {
        Uri parse;
        String str = this.A0C;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return C64062u9.A04(parse);
    }

    public C58192kI(C25811CmO cmO, AnonymousClass6nF r4, C26551So r5, AnonymousClass73B r6, File file, String str, String str2, String str3, String str4, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A09 = str;
        this.A08 = file;
        this.A0C = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = cmO;
        this.A0G = z;
        this.A0F = z2;
        this.A0L = z3;
        this.A0D = z4;
        this.A07 = r6;
        this.A05 = r4;
        this.A0J = z5;
        this.A0K = z6;
        this.A0H = z7;
        this.A0I = z8;
        this.A0E = z9;
        if (!z4) {
            return;
        }
        if (r5 == C26551So.A0E || r5 == C26551So.A0t || r5 == C26551So.A0K || r5 == C26551So.A0h || r5 == C26551So.A09 || r5 == C26551So.A0Q || r5 == C26551So.A0A || r5 == C26551So.A0V || r5 == C26551So.A0H || r5 == C26551So.A0I) {
            C17960vV.A0H(AnonymousClass000.A1W(r4), "Image transcoding should have quality settings");
        }
    }
}
