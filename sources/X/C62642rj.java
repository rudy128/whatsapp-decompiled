package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2rj  reason: invalid class name and case insensitive filesystem */
public class C62642rj {
    public static final AnonymousClass1MD[] A0E = new AnonymousClass1MD[0];
    public int A00;
    public long A01;
    public long A02;
    public Map A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass37L A08;
    public final C63062sR A09;
    public final AnonymousClass3MD A0A;
    public final AtomicBoolean A0B = new AtomicBoolean(false);
    public final AnonymousClass18O A0C;
    public final AnonymousClass1N7 A0D;

    public void A00() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "available";
        List A0O = C18070vi.A0O("unavailable", A1Z, 1);
        C29591cX r1 = new C29591cX("presence");
        r1.A08("available", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        ((AnonymousClass37M) this.A0A).CSL(r1.A03(), 1);
    }

    public void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        AnonymousClass9F5 r3 = new AnonymousClass9F5(hexString);
        this.A03.put(hexString, new AnonymousClass2M7(this, r3, 2));
        ((AnonymousClass37M) this.A0A).CSL(r3.BVP(), 1);
    }

    public void A02(C29621ca r3) {
        ((AnonymousClass37M) this.A0A).CSL(r3, 1);
    }

    public void A03(C29621ca r8, long j) {
        C63622tQ A012 = this.A0D.A01(j);
        if (A012 != null) {
            synchronized (A012) {
                int i = A012.A00;
                if (i == 0) {
                    AnonymousClass190 r3 = A012.A05;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("tag=");
                    r3.A0G("loggable_stanza_already_acked", AnonymousClass000.A0y(A012.A04(), A10), true);
                } else {
                    C63622tQ.A02(A012, i, 0, SystemClock.uptimeMillis() - A012.A01);
                    A012.A00 = 0;
                    C63622tQ.A02(A012, 0, -1, SystemClock.uptimeMillis() - A012.A04);
                    AnonymousClass1N7 r32 = A012.A07;
                    synchronized (r32) {
                        r32.A02(A012.A02).remove(Long.valueOf(A012.A03));
                        C17890vO.A0s(r32.A01, A012, 21);
                    }
                }
            }
        }
        ((AnonymousClass37M) this.A0A).CSL(r8, 1);
    }

    public void A04(boolean z) {
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        this.A03.put(hexString, new AnonymousClass2M3(this, 2));
        String A0r = C17880vN.A0r(this.A0C.A00, "server_props:config_hash");
        if (A0r == null || z) {
            A0r = "";
        }
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        boolean A1W = C17890vO.A1W("protocol", "2", r2);
        C17880vN.A1Q("hash", A0r, r2, 1);
        C29621ca r3 = new C29621ca("props", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, hexString, r22, A1W ? 1 : 0);
        C17880vN.A1Q("xmlns", "w", r22, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 2);
        ((AnonymousClass37M) this.A0A).CSL(C29621ca.A00(C173438v4.A00, r3, r22), 1);
    }

    public boolean A05() {
        byte[] decode;
        String A0r = C17880vN.A0r(C17890vO.A0B(this.A06), "pref_client_auth_token");
        if (TextUtils.isEmpty(A0r) || (decode = Base64.decode(A0r, 3)) == null) {
            return false;
        }
        C29591cX r5 = new C29591cX("ib");
        C29591cX r4 = new C29591cX("cat");
        C29601cY.A02(decode, 1, 1024);
        r4.A01 = decode;
        ((AnonymousClass37M) this.A0A).CSL(C29591cX.A00(r4, r5), 1);
        return true;
    }

    public C62642rj(AnonymousClass190 r3, AnonymousClass18O r4, AnonymousClass118 r5, C19830z4 r6, C18030ve r7, AnonymousClass2U1 r8, AnonymousClass37L r9, AnonymousClass1N7 r10, AnonymousClass3MD r11, AnonymousClass10I r12, Map map) {
        this.A07 = r7;
        this.A04 = r3;
        this.A05 = r5;
        this.A0C = r4;
        this.A0D = r10;
        this.A06 = r6;
        this.A08 = r9;
        this.A03 = map;
        this.A09 = new C63062sR(r3, r8, r12);
        this.A0A = r11;
    }
}
