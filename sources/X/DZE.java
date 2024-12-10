package X;

import java.security.Signature;

public class DZE implements E76 {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C27279Db8 A01;

    public DZE(String str, C27279Db8 db8) {
        this.A01 = db8;
        this.A00 = str;
    }

    public Signature BHr(String str) {
        String str2 = this.A00;
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }
}
