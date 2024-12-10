package X;

import java.security.Signature;

public class DZD implements E76 {
    public final /* synthetic */ C27279Db8 A00;

    public DZD(C27279Db8 db8) {
        this.A00 = db8;
    }

    public Signature BHr(String str) {
        try {
            return Signature.getInstance(str, ((DZI) this.A00.A02).A00);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
