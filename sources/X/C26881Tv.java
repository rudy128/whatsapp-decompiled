package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1Tv  reason: invalid class name and case insensitive filesystem */
public final class C26881Tv {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1M9 A01;
    public final C24671Lf A02;
    public final C24791Lr A03;
    public final AnonymousClass121 A04;
    public final AnonymousClass1R3 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass11O A08;
    public final AnonymousClass00H A09;

    public C26881Tv(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1M9 r4, C24671Lf r5, C24791Lr r6, AnonymousClass11O r7, AnonymousClass121 r8, AnonymousClass1R3 r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r8, 9);
        C18070vi.A0d(r7, 10);
        this.A00 = r2;
        this.A07 = r3;
        this.A01 = r4;
        this.A09 = r10;
        this.A02 = r5;
        this.A06 = r11;
        this.A05 = r9;
        this.A03 = r6;
        this.A04 = r8;
        this.A08 = r7;
    }

    public final void A00(AnonymousClass1E7 r2) {
        C18070vi.A0d(r2, 0);
        this.A03.A04(r2);
    }

    public final void A02(AnonymousClass1E7 r4, byte[] bArr, byte[] bArr2) {
        try {
            C24791Lr r1 = this.A03;
            r1.A05(r4, bArr, true);
            r1.A05(r4, bArr2, false);
        } catch (IOException e) {
            Log.e("ContactPhotoUpdater/updatePhotoFiles", e);
        }
    }

    public final void A03(AnonymousClass1BI r4) {
        C18070vi.A0d(r4, 0);
        ((C58362kZ) this.A09.get()).A01(new C70623Bv(this, r4, 43));
    }

    public final void A01(AnonymousClass1E7 r3, int i, int i2) {
        boolean A0O = this.A07.A0O(r3.A0J);
        r3.A07 = i;
        r3.A08 = i2;
        if (A0O) {
            this.A08.A00.edit().putInt("profile_photo_full_id", i).putInt("profile_photo_thumb_id", i2).apply();
            return;
        }
        r3.A0E = System.currentTimeMillis();
        AnonymousClass1M9 r1 = this.A01;
        r1.A04.A0T(r3);
        r1.A03.A0B(r3);
    }

    public final void A04(C55782gM r4) {
        ((C58362kZ) this.A09.get()).A01(new C70623Bv(this, r4, 42));
    }
}
