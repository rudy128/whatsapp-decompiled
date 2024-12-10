package X;

import com.whatsapp.util.Log;

/* renamed from: X.Alc  reason: case insensitive filesystem */
public class C21529Alc implements C18080vj, C22821Di {
    public final int A00;

    public C21529Alc(int i) {
        this.A00 = i;
    }

    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                return C27621Wu.A00;
            case 1:
                byte[] bArr = (byte[]) obj;
                C18070vi.A0d(bArr, 0);
                return C200310o.A09(bArr, 0, 32);
            case 2:
                Iterable iterable = (Iterable) obj;
                C18070vi.A0d(iterable, 0);
                return C108995ce.A0X(" ", iterable);
            case 3:
                A6Z a6z = (A6Z) obj;
                C18070vi.A0d(a6z, 0);
                Log.e("OhaiKeyConfigManager/getKeyConfigFromMex/error", new C26941Uc(a6z));
                return AnonymousClass000.A0i();
            case 4:
                return String.valueOf(obj);
            default:
                return AnonymousClass000.A0h();
        }
    }
}
