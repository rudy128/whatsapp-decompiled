package X;

public enum C0A {
    A0A("TERMINATOR", new int[]{0, 0, 0}),
    A08("NUMERIC", new int[]{10, 12, 14}),
    A01("ALPHANUMERIC", new int[]{9, 11, 13}),
    A09("STRUCTURED_APPEND", new int[]{0, 0, 0}),
    A02("BYTE", new int[]{8, 16, 16}),
    A03("ECI", new int[]{0, 0, 0}),
    A07("KANJI", new int[]{8, 10, 12}),
    A04("FNC1_FIRST_POSITION", new int[]{0, 0, 0}),
    A05("FNC1_SECOND_POSITION", new int[]{0, 0, 0}),
    A06("HANZI", new int[]{8, 10, 12});
    
    public final int bits;
    public final int[] characterCountBitsForVersions;

    public int A00(C26289Cwp cwp) {
        char c;
        int i = cwp.A01;
        if (i <= 9) {
            c = 0;
        } else {
            c = 2;
            if (i <= 26) {
                c = 1;
            }
        }
        return this.characterCountBitsForVersions[c];
    }

    /* access modifiers changed from: public */
    C0A(String str, int[] iArr) {
        this.characterCountBitsForVersions = iArr;
        this.bits = r2;
    }
}
