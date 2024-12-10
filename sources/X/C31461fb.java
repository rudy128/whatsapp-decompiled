package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1fb  reason: invalid class name and case insensitive filesystem */
public class C31461fb implements C26181Rd {
    public final C31451fa A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;
    public final AtomicReference A03 = new AtomicReference();
    public final AnonymousClass190 A04;
    public final C23651Hc A05;
    public final C18030ve A06;

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public void A00() {
        String str = (String) this.A03.getAndSet((Object) null);
        if (str != null) {
            A01(str);
        }
    }

    public void A01(String str) {
        if (!this.A05.A02()) {
            this.A03.set(str);
            return;
        }
        AnonymousClass00H r2 = this.A02;
        String A0B = ((AnonymousClass1OZ) r2.get()).A0B();
        try {
            AnonymousClass9F7 r1 = new AnonymousClass9F7(A0B, str, 17);
            ((AnonymousClass1OZ) r2.get()).A0I(new AnonymousClass374(this, r1, str, 1), (C29621ca) r1.A00, A0B, 314, 32000);
        } catch (IllegalArgumentException unused) {
            Log.e("ClientAuthTokenManager/failed to create request for auth_token");
        }
    }

    public C31461fb(AnonymousClass190 r2, C23651Hc r3, C31451fa r4, C19830z4 r5, C18030ve r6, AnonymousClass00H r7) {
        this.A06 = r6;
        this.A04 = r2;
        this.A02 = r7;
        this.A05 = r3;
        this.A01 = r5;
        this.A00 = r4;
    }

    public void BvR() {
        A00();
    }
}
