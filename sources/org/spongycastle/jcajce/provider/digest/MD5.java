package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass1Bt;
import X.C27194DYt;
import X.C27267Dat;
import X.C27342DcE;
import X.C27343DcF;
import X.C28394Dye;
import X.DZO;
import java.util.Hashtable;

public class MD5 {

    public class Mappings extends AnonymousClass1Bt {
        public static final String A00 = MD5.class.getName();
    }

    public class HashMac extends C27343DcF {
        public HashMac() {
            Hashtable hashtable = C27194DYt.A07;
            this.A00 = new C27194DYt(new C28394Dye());
        }
    }

    public class KeyGenerator extends C27342DcE {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.CYU, java.lang.Object] */
        public KeyGenerator() {
            super("HMACMD5", new Object(), 128);
        }
    }

    public class Digest extends C27267Dat implements Cloneable {
        public Digest() {
            super(new C28394Dye());
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [X.Dye, X.E9q, X.DZO] */
        public Object clone() {
            C27267Dat dat = (C27267Dat) super.clone();
            C28394Dye dye = (C28394Dye) this.A01;
            ? dzo = new DZO(dye);
            dzo.A01 = new int[16];
            C28394Dye.A0F(dzo, dye);
            dat.A01 = dzo;
            return dat;
        }
    }
}
