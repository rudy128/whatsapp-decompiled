package X;

import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1NM  reason: invalid class name */
public class AnonymousClass1NM {
    public final AnonymousClass1NL A00;
    public final AnonymousClass00H A01;
    public final List A02 = new CopyOnWriteArrayList();
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1L7 A04;
    public final C219217x A05;
    public final AnonymousClass11Z A06;
    public final C219317y A07;
    public final AnonymousClass10I A08;

    public C219417z A00() {
        return (C219417z) ((C54212dm) this.A01.get()).A02.get();
    }

    public File A01(File file) {
        C219417z r1;
        if (this.A04.A0D(file)) {
            r1 = A00();
        } else {
            r1 = this.A07.A00;
        }
        return r1.A01("");
    }

    public boolean A02() {
        AnonymousClass00H r1 = this.A01;
        if (((C54212dm) r1.get()).A00 || ((C54212dm) r1.get()).A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass1NM(AnonymousClass190 r9, AnonymousClass1L7 r10, C219217x r11, AnonymousClass11Z r12, C219317y r13, AnonymousClass1NL r14, AnonymousClass10I r15) {
        this.A08 = r15;
        this.A04 = r10;
        this.A06 = r12;
        this.A05 = r11;
        this.A00 = r14;
        this.A07 = r13;
        AnonymousClass190 r3 = r9;
        this.A01 = new C18150vq((Object) null, new C70963De(r3, r10, r11, r12, 1));
    }

    public boolean A03(C23501Gn r6) {
        Handler handler;
        Runnable runnable;
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            if (Build.VERSION.SDK_INT < 23 || AnonymousClass112.A07() || this.A05.A04(AnonymousClass73I.A04()) != -1) {
                return true;
            }
            if (C22781De.A03()) {
                r6.C9S();
                return false;
            }
            handler = this.A03;
            r6.getClass();
            runnable = new C70573Bq(r6, 7);
        } else if (C22781De.A03()) {
            r6.C9R();
            return false;
        } else {
            handler = this.A03;
            runnable = new C146817Qs(15, externalStorageState, r6);
        }
        handler.post(runnable);
        return false;
    }

    public boolean A04(C23501Gn r6) {
        Handler handler;
        Runnable runnable;
        int i;
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            if (C22781De.A03()) {
                r6.C2V();
                return false;
            }
            handler = this.A03;
            i = 13;
        } else if (!"mounted".equals(externalStorageState)) {
            if (C22781De.A03()) {
                r6.C9R();
                return false;
            }
            handler = this.A03;
            i = 14;
        } else if (AnonymousClass112.A07() || this.A05.A02("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            if (C22781De.A03()) {
                r6.C2W();
                return false;
            }
            handler = this.A03;
            r6.getClass();
            runnable = new C70573Bq(r6, 6);
            handler.post(runnable);
            return false;
        }
        runnable = new C146817Qs(i, externalStorageState, r6);
        handler.post(runnable);
        return false;
    }
}
