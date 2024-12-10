package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class A52 {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public A52(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public Signature A00() {
        return this.A00;
    }

    public Cipher A01() {
        return this.A01;
    }

    public Mac A02() {
        return this.A02;
    }

    public A52(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public A52(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
