package X;

import java.security.Provider;
import java.security.Signature;

public class DZF implements E76 {
    public final /* synthetic */ Provider A00;
    public final /* synthetic */ C27279Db8 A01;

    public DZF(Provider provider, C27279Db8 db8) {
        this.A01 = db8;
        this.A00 = provider;
    }

    public Signature BHr(String str) {
        Provider provider = this.A00;
        String str2 = this.A01.A00;
        if (provider != null) {
            return Signature.getInstance(str2, provider);
        }
        return Signature.getInstance(str2);
    }
}
