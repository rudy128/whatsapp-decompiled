package X;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.2q4  reason: invalid class name and case insensitive filesystem */
public class C61672q4 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final X509Certificate A04;
    public final X509Certificate A05;

    public C61672q4(String str) {
        JSONObject A16 = C17880vN.A16(str);
        byte[] decode = Base64.decode(A16.getString("e_cert"), 3);
        byte[] decode2 = Base64.decode(A16.getString("s_cert"), 3);
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        this.A04 = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(decode));
        this.A05 = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(decode2));
        this.A00 = A16.optInt("ttl");
        this.A01 = A16.optLong("ts");
        this.A03 = A16.optString("ppk");
        this.A02 = Integer.valueOf(A16.optInt("ppk_id"));
    }

    public C61672q4(Integer num, String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, int i, long j) {
        this.A04 = x509Certificate;
        this.A05 = x509Certificate2;
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A02 = num;
    }
}
