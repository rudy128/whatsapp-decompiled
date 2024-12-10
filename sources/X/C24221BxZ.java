package X;

import java.io.InputStream;

/* renamed from: X.BxZ  reason: case insensitive filesystem */
public abstract class C24221BxZ extends InputStream {
    public int A00;
    public final InputStream A01;

    public C24221BxZ(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }

    public static StringBuilder A00(C28371DyH dyH) {
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(dyH.A01);
        return sb;
    }

    public void A02() {
        InputStream inputStream = this.A01;
        if (inputStream instanceof C28370DyG) {
            C28370DyG dyG = (C28370DyG) inputStream;
            dyG.A00 = true;
            C28370DyG.A01(dyG);
        }
    }
}
