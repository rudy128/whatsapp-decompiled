package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7Ix  reason: invalid class name and case insensitive filesystem */
public class C144847Ix implements C1607489t {
    public final String A00;
    public final MessageDigest A01;
    public final C1607489t A02;
    public final C26551So A03;
    public final String A04;
    public final MessageDigest A05;

    public long BVb() {
        return 0;
    }

    public void CR5() {
    }

    public OutputStream CB0(AnonymousClass8BJ r8) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 == null || (messageDigest = this.A01) == null) {
            throw new C122886Sh(26);
        }
        return new DigestOutputStream(new C179249Hd(new C20583AQt(this.A03).BIV(Base64.decode(this.A04, 0)), new DigestOutputStream(this.A02.CB0(r8), messageDigest), (long) ((AUZ) r8).A01.getContentLength()), messageDigest2);
    }

    public C144847Ix(C1607489t r3, C26551So r4, String str, String str2) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        this.A02 = r3;
        this.A04 = str;
        this.A00 = str2;
        this.A03 = r4;
        try {
            messageDigest = C108945cZ.A1I();
        } catch (NoSuchAlgorithmException e) {
            Log.e("encryptedstreamdownload/digest error", e);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = C108945cZ.A1I();
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
            messageDigest2 = null;
        }
        this.A01 = messageDigest2;
    }
}
