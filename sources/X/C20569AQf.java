package X;

import android.text.TextUtils;
import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import java.util.Random;

/* renamed from: X.AQf  reason: case insensitive filesystem */
public final class C20569AQf implements AnonymousClass1L0 {
    public final AnonymousClass1NP A00;
    public final AnonymousClass1NT A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass19K A04;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        AnonymousClass1NT r4 = this.A01;
        int A032 = r4.A01.A03();
        if (r4.A04() && A032 != 0 && A032 != 1) {
            C19830z4 r2 = r4.A05;
            String A0f = r2.A0f();
            if (r4.A04() && !TextUtils.isEmpty(A0f) && r2.A0M(A0f) == 1) {
                AnonymousClass19K r22 = this.A04;
                Random random = new Random();
                GoogleEncryptedReUploadWorker.A02(this.A00, this.A03, r22, AnonymousClass00R.A01, random, false);
            }
        }
    }

    public C20569AQf(AnonymousClass1NP r1, AnonymousClass1NT r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass19K r5) {
        C18070vi.A0w(r3, r5, r2, r4, r1);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }
}
