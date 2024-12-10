package X;

import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.11x  reason: invalid class name and case insensitive filesystem */
public class C203811x implements C201511a {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public void A00(AnonymousClass18L r5) {
        AnonymousClass00H r3 = this.A05;
        ((AnonymousClass10T) r3.get()).registerObserver(new C65852xD(r5, this, 2));
        if (((C23651Hc) r3.get()).A02() && !((C23651Hc) r3.get()).A01()) {
            r5.BvU();
        }
    }

    public boolean A01(byte[] bArr) {
        AnonymousClass00H r9 = this.A03;
        String A0B = ((AnonymousClass1OZ) r9.get()).A0B();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Long valueOf = Long.valueOf(currentTimeMillis);
        byte[] bArr2 = bArr;
        C18070vi.A0d(bArr2, 3);
        C29591cX r6 = new C29591cX("iq");
        r6.A04(new AnonymousClass1MD("xmlns", "w:stats"));
        r6.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        r6.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C29601cY.A04(A0B, 0, 9007199254740991L, false)) {
            r6.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B));
        }
        C29591cX r5 = new C29591cX("add");
        if (C29601cY.A03(valueOf, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1MD("t", currentTimeMillis));
        }
        C29601cY.A02(bArr2, 4, 65536);
        r5.A01 = bArr2;
        r6.A05(r5.A03());
        C29621ca A032 = r6.A03();
        Boolean bool = C17960vV.A01;
        C26981Ug r1 = new C26981Ug();
        AnonymousClass1OZ.A04((AnonymousClass1OZ) r9.get(), new C20989Ach(r1, 3), A032, A0B, 58, 32000, true);
        try {
            boolean equals = "result".equals(((C29621ca) r1.get()).A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null));
            if (!equals) {
                return equals;
            }
            AnonymousClass180 r52 = (AnonymousClass180) this.A06.get();
            int length = bArr2.length;
            if (((long) length) < 0 || r52.A00 == null) {
                return equals;
            }
            AnonymousClass180.A00(r52);
            Message.obtain(r52.A00, 2, 32, length).sendToTarget();
            AnonymousClass180.A01(r52);
            return equals;
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("FieldStatsXmppImpl/error sending fieldstats IQ");
            return false;
        }
    }

    public C203811x(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A03 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A00 = r1;
    }
}
