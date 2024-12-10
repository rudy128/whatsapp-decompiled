package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0PP  reason: invalid class name */
public class AnonymousClass0PP {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;
    public final IdentityCredential A03;

    public AnonymousClass0PP(IdentityCredential identityCredential) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = identityCredential;
    }

    public IdentityCredential A00() {
        return this.A03;
    }

    public AnonymousClass0PP(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public AnonymousClass0PP(Cipher cipher) {
        this.A00 = null;
        this.A01 = cipher;
        this.A02 = null;
        this.A03 = null;
    }

    public AnonymousClass0PP(Mac mac) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = mac;
        this.A03 = null;
    }
}
