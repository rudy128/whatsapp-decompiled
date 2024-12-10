package X;

import java.io.File;

/* renamed from: X.9of  reason: invalid class name and case insensitive filesystem */
public final class C192599of {
    public C191239mF A00;
    public boolean A01;
    public final String A02;
    public final long[] A03;
    public final /* synthetic */ C21334AiJ A04;

    public File A00() {
        File file = this.A04.A06;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        return C17880vN.A0e(file, AnonymousClass001.A1I(".", A10, 0));
    }

    public File A01() {
        File file = this.A04.A06;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append(".");
        A10.append(0);
        return AnonymousClass8BW.A0X(file, ".tmp", A10);
    }

    public C192599of(C21334AiJ aiJ, String str) {
        this.A04 = aiJ;
        this.A02 = str;
        this.A03 = new long[aiJ.A05];
    }
}
