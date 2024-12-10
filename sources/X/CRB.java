package X;

import java.util.List;

public final class CRB {
    public final float A00;
    public final int A01;
    public final String A02;
    public final List A03;

    public CRB(String str, List list, float f, int i) {
        this.A03 = list;
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }
}
