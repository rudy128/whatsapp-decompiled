package X;

/* renamed from: X.AiW  reason: case insensitive filesystem */
public final class C21343AiW implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21343AiW aiW = (C21343AiW) obj;
        C18070vi.A0d(aiW, 0);
        int i = this.A00 - aiW.A00;
        if (i == 0) {
            return this.A01 - aiW.A01;
        }
        return i;
    }

    public C21343AiW(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
