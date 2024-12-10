package X;

import java.util.Arrays;

/* renamed from: X.Cli  reason: case insensitive filesystem */
public final class C25771Cli {
    public static final C25771Cli A01;
    public static final C201110w A02;
    public static final C25771Cli A03 = new C25771Cli(new int[]{2, 5, 6});
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C25771Cli) && Arrays.equals(this.A00, ((C25771Cli) obj).A00);
        }
        return true;
    }

    public int hashCode() {
        return 8 + (Arrays.hashCode(this.A00) * 31);
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 2;
        A01 = new C25771Cli(A1X);
        C201210x r3 = new C201210x();
        r3.put(C17880vN.A0l(), 6);
        r3.put(17, 6);
        r3.put(C108955ca.A0e(), 6);
        r3.put(18, 6);
        r3.put(6, 8);
        r3.put(8, 8);
        r3.put(14, 8);
        A02 = r3.build();
    }

    public C25771Cli(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioCapabilities[maxChannelCount=");
        A10.append(8);
        A10.append(", supportedEncodings=");
        return BEA.A0m(Arrays.toString(this.A00), A10);
    }
}
