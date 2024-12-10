package X;

/* renamed from: X.CfL  reason: case insensitive filesystem */
public abstract class C25413CfL {
    public static final char[] A00 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static char A00(int i) {
        char[] cArr = A00;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C23675Bni.A00();
    }
}
