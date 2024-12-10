package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class DSN implements Iterable, Serializable {
    public static final DSN A00 = new C23271BeL(CI7.A05);
    public int zzc = 0;

    public int A01() {
        C23271BeL beL = (C23271BeL) this;
        if (beL instanceof C23270BeK) {
            return ((C23270BeK) beL).zzc;
        }
        return beL.zza.length;
    }

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new C27114DUx(this);
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (i2 < i) {
                A10.append("Beginning index larger than ending index: ");
                A10.append(i);
                throw BE6.A0l(AnonymousClass001.A1I(", ", A10, i2));
            }
            A10.append("End index: ");
            A10.append(i2);
            throw BE6.A0l(AnonymousClass001.A1I(" >= ", A10, i3));
        }
        throw BEB.A0U(AnonymousClass000.A10(), i);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A01 = A01();
            byte[] bArr = ((C23271BeL) this).zza;
            i = A01;
            Charset charset = CI7.A02;
            for (int i2 = 0; i2 < A01; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        DSN beK;
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = BE8.A0h(this);
        int A01 = A01();
        AnonymousClass000.A1M(A1a, A01);
        if (A01 <= 50) {
            concat = CB5.A00(this);
        } else {
            C23271BeL beL = (C23271BeL) this;
            int A002 = A00(0, 47, beL.A01());
            if (A002 == 0) {
                beK = A00;
            } else {
                beK = new C23270BeK(beL.zza, A002);
            }
            concat = CB5.A00(beK).concat("...");
        }
        A1a[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1a);
    }
}
