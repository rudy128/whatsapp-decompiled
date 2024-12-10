package X;

import java.security.MessageDigest;

/* renamed from: X.C6a  reason: case insensitive filesystem */
public final class C24484C6a {
    public MessageDigest A00;
    public MessageDigest A01;

    public void A00(byte[] bArr) {
        if (bArr != null) {
            try {
                MessageDigest messageDigest = this.A00;
                this.A01 = (MessageDigest) messageDigest.clone();
                messageDigest.update(bArr);
            } catch (CloneNotSupportedException e) {
                throw BE9.A0d(e);
            }
        } else {
            throw BE9.A0b("Cannot add null transcript.", (byte) 80);
        }
    }

    public byte[] A01() {
        try {
            return ((MessageDigest) this.A00.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw BEA.A0Y(e);
        }
    }

    public byte[] A02() {
        try {
            return ((MessageDigest) this.A01.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw BEA.A0Y(e);
        }
    }
}
