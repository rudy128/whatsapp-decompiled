package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.7N8  reason: invalid class name */
public class AnonymousClass7N8 implements AnonymousClass3LO {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final boolean A0A;

    public AnonymousClass7N8(Context context, Uri uri, AnonymousClass1FR r3, C72433Ly r4, C34531kd r5, C692236j r6, String str, List list, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = r5;
        this.A01 = i;
        this.A04 = uri;
        this.A0A = z;
        this.A05 = context;
        this.A09 = str;
        this.A06 = list;
        this.A07 = r4;
        this.A08 = r3;
        this.A03 = r6;
    }

    public final void BuX(File file) {
        AnonymousClass10I r0;
        AnonymousClass7R8 r1;
        int i = this.A00;
        C34531kd r6 = (C34531kd) this.A02;
        File file2 = file;
        if (i != 0) {
            int i2 = this.A01;
            boolean z = this.A0A;
            Context context = (Context) this.A05;
            C72433Ly r5 = (C72433Ly) this.A07;
            AnonymousClass1FR r4 = (AnonymousClass1FR) this.A08;
            C692236j r7 = (C692236j) this.A03;
            r0 = r6.A0G;
            r1 = new AnonymousClass7R8(context, (Uri) this.A04, r4, r5, r6, r7, file2, this.A09, (List) this.A06, i2, z);
        } else {
            int i3 = this.A01;
            boolean z2 = this.A0A;
            Context context2 = (Context) this.A05;
            C72433Ly r52 = (C72433Ly) this.A07;
            AnonymousClass1FR r42 = (AnonymousClass1FR) this.A08;
            C692236j r72 = (C692236j) this.A03;
            r0 = r6.A0G;
            r1 = new AnonymousClass7R8(context2, (Uri) this.A04, r42, r52, r6, r72, file2, (Long) null, this.A09, (List) this.A06, i3, 1, z2);
        }
        r0.CGF(r1);
    }
}
