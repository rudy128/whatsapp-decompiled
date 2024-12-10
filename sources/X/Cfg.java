package X;

public abstract class Cfg {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static int A00(C25726Ckw ckw) {
        int A012 = ckw.A01(4);
        if (A012 == 15) {
            return ckw.A01(24);
        }
        if (A012 < 13) {
            return A01[A012];
        }
        throw new C24215BxS((String) null, (Throwable) null, true);
    }
}
