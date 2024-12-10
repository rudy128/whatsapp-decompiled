package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.6Ln  reason: invalid class name and case insensitive filesystem */
public final class C121796Ln extends A34 {
    public final C33251iW A00;
    public final AnonymousClass34B A01;
    public final C441822l A02;
    public final File A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C441822l r4 = this.A02;
        File file = this.A03;
        if (!file.exists()) {
            return null;
        }
        ArrayList A022 = AnonymousClass70j.A02(file, 64);
        file.delete();
        int size = A022.size();
        if (size != 64) {
            return null;
        }
        byte[] bArr = new byte[size];
        int i = 0;
        do {
            bArr[i] = ((Number) A022.get(i)).byteValue();
            i++;
        } while (i < size);
        C24127Bvt bvt = C24127Bvt.A00;
        C24100BvS bvS = C24100BvS.A00;
        r4.A1H(new AnonymousClass7LG(bvS, bvS, bvt, (String) null, bArr, 0, 0, false));
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        this.A00.A0a(this.A01, this.A02);
    }

    public C121796Ln(C33251iW r1, AnonymousClass34B r2, C441822l r3, File file) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = file;
    }
}
