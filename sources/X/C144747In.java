package X;

import java.io.File;

/* renamed from: X.7In  reason: invalid class name and case insensitive filesystem */
public final class C144747In implements AnonymousClass3MN {
    public final AnonymousClass85B A00;
    public final int A01;
    public final AnonymousClass736 A02;
    public final C58032k2 A03;
    public final String A04;

    public void run() {
        File file;
        File file2;
        AnonymousClass736 r0 = this.A02;
        String str = this.A04;
        int i = this.A01;
        C17960vV.A00();
        AnonymousClass6L3 A002 = AnonymousClass736.A00(r0);
        AnonymousClass66L r3 = new AnonymousClass66L(r0.A03, r0.A05, r0.A07, r0.A08, r0.A09, r0.A0B, A002, AnonymousClass736.A0J, r0.A0D, str);
        C132626nC A0J = r3.A0J();
        AnonymousClass892 r4 = r3.A01;
        String str2 = r3.A03;
        byte[] bArr = null;
        if (A0J == null) {
            file = null;
        } else {
            file = A0J.A00;
            bArr = A0J.A01;
        }
        r4.BuY(file, str2, bArr);
        C128506gA BM6 = A002.BM6(str);
        if (BM6 != null) {
            file2 = C108945cZ.A17(BM6.A00);
        } else {
            file2 = null;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaLoadGifJob/failed to load, name: ");
            A10.append(str);
            C17900vP.A0i(", attribution:", A10, i);
        }
        this.A03.A00(file2, true);
    }

    public C144747In(AnonymousClass736 r1, AnonymousClass85B r2, C58032k2 r3, String str, int i) {
        this.A02 = r1;
        this.A00 = r2;
        this.A04 = str;
        this.A01 = i;
        this.A03 = r3;
    }

    public AnonymousClass85B BUa() {
        return this.A00;
    }
}
