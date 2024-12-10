package X;

import java.util.List;

/* renamed from: X.9j6  reason: invalid class name */
public class AnonymousClass9j6 {
    public final /* synthetic */ AnonymousClass9HR A00;

    public AnonymousClass9j6(AnonymousClass9HR r1) {
        this.A00 = r1;
    }

    public byte[] A00() {
        AnonymousClass9HR r2 = this.A00;
        C17960vV.A0D(r2.A00);
        List<Object> list = r2.A06;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i = r2.A03;
        byte[] bArr = new byte[(size * i)];
        int i2 = 0;
        for (Object arraycopy : list) {
            System.arraycopy(arraycopy, 0, bArr, i2, i);
            i2 += i;
        }
        return bArr;
    }
}
