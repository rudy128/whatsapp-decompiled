package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.7Nj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145987Nj implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C21132Af0 A01;
    public final /* synthetic */ C133116oC A02;
    public final /* synthetic */ AnonymousClass34B A03;
    public final /* synthetic */ boolean A04;

    public final void accept(Object obj) {
        String str;
        byte[] bArr;
        byte[] bArr2;
        String str2;
        long j;
        short s;
        File file;
        AnonymousClass34B r5 = this.A03;
        C133116oC r2 = this.A02;
        boolean z = this.A04;
        int i = this.A00;
        C21132Af0 af0 = this.A01;
        Integer num = (Integer) obj;
        C18070vi.A0g(af0, 4, num);
        C55612g5 A032 = r5.A03();
        String str3 = null;
        if (A032 != null) {
            C196299un r0 = A032.A02;
            str = r0.A07();
            bArr = r0.A0D();
            bArr2 = r0.A0C();
        } else {
            str = null;
            bArr = null;
            bArr2 = null;
        }
        if (bArr != null) {
            str2 = Base64.encodeToString(bArr, 2);
        } else {
            str2 = null;
        }
        if (bArr2 != null) {
            str3 = Base64.encodeToString(bArr2, 2);
        }
        C54942ex r3 = (C54942ex) r5.A0B.A00();
        if (!(r3 == null || r3.A02.get() || (file = r3.A01) == null)) {
            file.delete();
        }
        r2.A01.A0J(new AnonymousClass7QA(af0, num, str, str2, str3, z ? 1 : 0));
        C85954Po r6 = (C85954Po) r2.A07.get();
        int intValue = num.intValue();
        C81493zK r32 = new C81493zK();
        int i2 = 13;
        if (intValue == 0) {
            i2 = 14;
        }
        r32.A01 = Integer.valueOf(i2);
        r6.A00.CC4(r32);
        if (A032 != null) {
            j = A032.A01.A02.A03;
        } else {
            j = 0;
        }
        AnonymousClass00H r8 = r2.A08;
        ((C131966lx) r8.get()).A00.markerAnnotate(476716874, i, "media_size", String.valueOf(((double) j) / 1024.0d));
        C131966lx r22 = (C131966lx) r8.get();
        r8.get();
        if (intValue != 0) {
            s = 4;
            if (intValue != 1) {
                s = 87;
            }
        } else {
            s = 2;
        }
        r22.A00.markerEnd(476716874, i, s);
        r5.A05();
    }

    public /* synthetic */ C145987Nj(C21132Af0 af0, C133116oC r2, AnonymousClass34B r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = z;
        this.A00 = i;
        this.A01 = af0;
    }
}
