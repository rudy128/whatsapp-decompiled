package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7Df  reason: invalid class name and case insensitive filesystem */
public class C143397Df implements BCS {
    public int A00;
    public long A01;
    public String A02;
    public C129996ii A03;
    public final C26371Rw A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass18K A06;
    public final C18030ve A07;
    public final AnonymousClass10I A08;

    public void BiE(int i, int i2, String str) {
        String str2 = str;
        A00(str2, (String) null, i, (long) i2);
    }

    public void BiF(int i, int i2) {
        A00((String) null, (String) null, i, (long) i2);
    }

    public void C2p(C129996ii r10, String str, int i) {
        String str2;
        this.A01 = AnonymousClass11P.A00(this.A05);
        this.A03 = r10;
        this.A00 = i;
        this.A02 = str;
        if (i == 1) {
            try {
                String str3 = r10.A03;
                C18070vi.A0d(str3, 0);
                byte[] digest = MessageDigest.getInstance("SHA-1").digest(C108975cc.A1O(str3));
                C18070vi.A0b(digest);
                str2 = C137496vY.A01(digest);
            } catch (NoSuchAlgorithmException e) {
                Log.e((Throwable) e);
            }
            A00((String) null, str2, 1, 0);
        }
        str2 = null;
        A00((String) null, str2, 1, 0);
    }

    private void A00(String str, String str2, int i, long j) {
        this.A08.CGF(new AnonymousClass7Q8(this.A03, this, str, str2, i, j));
    }

    public void Bia(int i) {
        A00((String) null, (String) null, i, 0);
    }

    public C143397Df(C26371Rw r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass10I r5) {
        this.A05 = r2;
        this.A07 = r3;
        this.A08 = r5;
        this.A06 = r4;
        this.A04 = r1;
    }
}
