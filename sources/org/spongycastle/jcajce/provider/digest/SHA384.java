package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass1Bt;
import X.C27194DYt;
import X.C27267Dat;
import X.C27342DcE;
import X.C27343DcF;
import X.DZM;
import java.util.Hashtable;

public class SHA384 {

    public class Mappings extends AnonymousClass1Bt {
        public static final String A00 = SHA384.class.getName();
    }

    public class Digest extends C27267Dat implements Cloneable {
        public Digest() {
            super(new DZM());
        }

        public Object clone() {
            C27267Dat dat = (C27267Dat) super.clone();
            dat.A01 = new DZM((DZM) this.A01);
            return dat;
        }
    }

    public class HashMac extends C27343DcF {
        public HashMac() {
            Hashtable hashtable = C27194DYt.A07;
            this.A00 = new C27194DYt(new DZM());
        }
    }

    public class KeyGenerator extends C27342DcE {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.CYU, java.lang.Object] */
        public KeyGenerator() {
            super("HMACSHA384", new Object(), 384);
        }
    }

    public class OldSHA384 extends C27343DcF {
        /* JADX WARNING: type inference failed for: r2v0, types: [X.E9r, X.DYq, java.lang.Object] */
        public OldSHA384() {
            DZM dzm = new DZM();
            ? obj = new Object();
            obj.A02 = new byte[64];
            obj.A03 = new byte[64];
            obj.A01 = dzm;
            obj.A00 = 48;
            this.A00 = obj;
        }
    }
}
