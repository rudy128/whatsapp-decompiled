package X;

import android.app.IntentService;
import com.whatsapp.backup.google.GoogleBackupService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.8Be  reason: invalid class name and case insensitive filesystem */
public abstract class C161048Be extends IntentService implements AnonymousClass009 {
    public final Object A00 = C17880vN.A0p();
    public volatile C008203r A01;

    public static void A05(A7X a7x, C188819i2 r4, C171638s2 r5, AtomicBoolean atomicBoolean) {
        r5.A01 = Double.valueOf((double) a7x.A03());
        r4.A0E.CC7(r5);
        atomicBoolean.getAndSet(false);
    }

    public abstract void A08();

    public static void A04(GoogleBackupService googleBackupService) {
        googleBackupService.A06.A09();
        ((AnonymousClass1O1) googleBackupService.A0b.get()).A01("gdrive_backup", false);
        C196239ug r2 = googleBackupService.A07;
        synchronized (r2.A0D) {
            r2.A01 = null;
        }
    }

    public static void A06(C188839i4 r4, C171678s6 r5) {
        r5.A06 = Double.valueOf((double) r4.A0N.get());
        r5.A0E = Long.valueOf(r4.A0O.get());
        r5.A05 = Double.valueOf((double) r4.A0L.get());
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C008203r(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public C161048Be(String str) {
        super(str);
    }

    public static void A07(C171638s2 r4, AtomicLong atomicLong, AtomicLong atomicLong2, long j) {
        r4.A0B = Long.valueOf(j);
        r4.A04 = Double.valueOf((double) atomicLong.get());
        r4.A03 = Double.valueOf((double) atomicLong2.get());
    }

    public void onCreate() {
        A08();
        super.onCreate();
    }
}
