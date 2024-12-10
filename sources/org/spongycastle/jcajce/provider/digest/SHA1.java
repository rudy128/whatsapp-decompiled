package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass1Bt;
import X.C27194DYt;
import X.C27267Dat;
import X.C27342DcE;
import X.C27343DcF;
import X.C28397Dyh;
import X.DZO;
import X.E03;
import java.util.Hashtable;

public class SHA1 {

    public class Mappings extends AnonymousClass1Bt {
        public static final String A00 = SHA1.class.getName();
    }

    public class HashMac extends C27343DcF {
        public HashMac() {
            Hashtable hashtable = C27194DYt.A07;
            this.A00 = new C27194DYt(new C28397Dyh());
        }
    }

    public class KeyGenerator extends C27342DcE {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.CYU, java.lang.Object] */
        public KeyGenerator() {
            super("HMACSHA1", new Object(), 160);
        }
    }

    public class PBEWithMacKeyFactory extends E03 {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", 2, 1, 160, 0, false);
        }
    }

    public class SHA1Mac extends C27343DcF {
        public SHA1Mac() {
            Hashtable hashtable = C27194DYt.A07;
            this.A00 = new C27194DYt(new C28397Dyh());
        }
    }

    public class Digest extends C27267Dat implements Cloneable {
        public Digest() {
            super(new C28397Dyh());
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [X.Dyh, X.E9q, X.DZO] */
        public Object clone() {
            C27267Dat dat = (C27267Dat) super.clone();
            C28397Dyh dyh = (C28397Dyh) this.A01;
            ? dzo = new DZO(dyh);
            dzo.A01 = new int[80];
            C28397Dyh.A0J(dzo, dyh);
            dat.A01 = dzo;
            return dat;
        }
    }
}
