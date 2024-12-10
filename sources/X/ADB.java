package X;

import android.os.Parcelable;

public abstract class ADB implements Parcelable {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.data.payments.StringData");
                if (!C18070vi.A18(A00(), ((ADB) obj).A00())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String A00() {
        if (this instanceof C170428pq) {
            return ((C170428pq) this).A00;
        }
        if (this instanceof C170418pp) {
            return ((C170418pp) this).A00;
        }
        if (this instanceof C170408po) {
            return ((C170408po) this).A00;
        }
        if (this instanceof C170398pn) {
            return ((C170398pn) this).A00;
        }
        if (this instanceof C170388pm) {
            return ((C170388pm) this).A00;
        }
        if (this instanceof C170378pl) {
            return ((C170378pl) this).A00;
        }
        if (this instanceof C170368pk) {
            return ((C170368pk) this).A00;
        }
        if (this instanceof C170358pj) {
            return ((C170358pj) this).A00;
        }
        if (this instanceof C170348pi) {
            return ((C170348pi) this).A00;
        }
        if (this instanceof C170338ph) {
            return ((C170338ph) this).A00;
        }
        return ((C170328pg) this).A00;
    }

    public final boolean A01() {
        return AnonymousClass000.A1R(A00().length());
    }

    public int hashCode() {
        return A00().hashCode();
    }

    public String toString() {
        return A00();
    }
}
