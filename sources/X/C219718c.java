package X;

import javax.net.ssl.SSLException;

/* renamed from: X.18c  reason: invalid class name and case insensitive filesystem */
public class C219718c extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C219718c(SSLException sSLException, byte b) {
        this.description = b;
        this.ex = sSLException;
    }

    public C219718c(SSLException sSLException, byte b, boolean z) {
        this.description = b;
        this.ex = sSLException;
    }
}
