package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass1Bt;
import X.C27194DYt;
import X.C27267Dat;
import X.C27342DcE;
import X.C27343DcF;
import X.C28396Dyg;
import X.DZO;
import X.E03;
import java.util.Hashtable;

public class SHA256 {

    public class Mappings extends AnonymousClass1Bt {
        public static final String A00 = SHA256.class.getName();
    }

    public class HashMac extends C27343DcF {
        public HashMac() {
            Hashtable hashtable = C27194DYt.A07;
            this.A00 = new C27194DYt(new C28396Dyg());
        }
    }

    public class KeyGenerator extends C27342DcE {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.CYU, java.lang.Object] */
        public KeyGenerator() {
            super("HMACSHA256", new Object(), 256);
        }
    }

    public class PBEWithMacKeyFactory extends E03 {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", 2, 4, 256, 0, false);
        }
    }

    public class Digest extends C27267Dat implements Cloneable {
        public Digest() {
            super(new C28396Dyg());
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [X.Dyg, X.E9q, X.DZO] */
        public Object clone() {
            C27267Dat dat = (C27267Dat) super.clone();
            C28396Dyg dyg = (C28396Dyg) this.A01;
            ? dzo = new DZO(dyg);
            dzo.A01 = new int[64];
            C28396Dyg.A0H(dzo, dyg);
            dat.A01 = dzo;
            return dat;
        }
    }
}
