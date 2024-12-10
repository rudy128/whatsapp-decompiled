package X;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

public class DZH implements EAE {
    public static final Constructor A01;
    public EA8 A00;

    public int BJ4(byte[] bArr, int i) {
        try {
            return this.A00.BJ4(bArr, i);
        } catch (C28379DyP e) {
            Constructor constructor = A01;
            if (constructor != null) {
                try {
                    BadPaddingException badPaddingException = (BadPaddingException) constructor.newInstance(new Object[]{e.getMessage()});
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                } catch (Exception unused) {
                }
            }
            throw new BadPaddingException(e.getMessage());
        }
    }

    public String BMl() {
        EA8 ea8 = this.A00;
        return ea8 instanceof EEQ ? ((EEQ) ea8).Bax().BMl() : ea8.BMl();
    }

    public int BVw(int i) {
        return this.A00.BVw(i);
    }

    public E9Y Bax() {
        EA8 ea8 = this.A00;
        if (ea8 instanceof EEQ) {
            return ((EEQ) ea8).Bax();
        }
        return null;
    }

    public int Bb2(int i) {
        return this.A00.Bb2(i);
    }

    public void BdC(E3O e3o, boolean z) {
        this.A00.BdC(e3o, z);
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.A00.CCg(bArr, i, i2, bArr2, i3);
    }

    public void CQP(byte[] bArr, int i, int i2) {
        this.A00.CCd(bArr, i, i2);
    }

    public boolean CSJ() {
        return false;
    }

    static {
        Class A002 = AnonymousClass1Br.A00("javax.crypto.AEADBadTagException", C28408Dzr.class);
        Constructor constructor = null;
        if (A002 != null) {
            try {
                constructor = BE6.A0w(A002, String.class, new Class[1], 0);
            } catch (Exception unused) {
                constructor = null;
            }
        }
        A01 = constructor;
    }
}
