package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Es  reason: invalid class name and case insensitive filesystem */
public final class C143767Es implements AnonymousClass1L0 {
    public final AnonymousClass1Q0 A00;
    public final AnonymousClass1VE A01;
    public final A8A A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1RN A04;
    public final AnonymousClass1SS A05;
    public final AnonymousClass1U9 A06;
    public final C131066kS A07;
    public final C138606xN A08;
    public final AnonymousClass10I A09;

    public /* synthetic */ void Bqg() {
    }

    public void Bqh() {
        File[] listFiles;
        C41851xA BD0;
        C41851xA BD02;
        AnonymousClass1SS r5 = this.A05;
        synchronized (r5) {
            C17960vV.A00();
            r5.A00.A07(-1);
            try {
                C28791au A062 = r5.A02.A06();
                try {
                    BD02 = A062.BD0();
                    C23141Ev r8 = ((C28801av) A062).A02;
                    String[] A1Y = C17880vN.A1Y();
                    C17890vO.A1J(A1Y, AnonymousClass11P.A01(r5.A01) - 1209600000);
                    r8.A04("media_job", "last_update_time < ?", "MediaJobDataStore/deleteStaleMediaJobData", A1Y);
                    BD02.A00();
                    BD02.close();
                    A062.close();
                } catch (Throwable th) {
                    A062.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("MediaJobDataStore/delete All Older than", e);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        AnonymousClass1RN r52 = this.A04;
        synchronized (r52) {
            C17960vV.A00();
            try {
                C28791au A063 = r52.A01.A06();
                try {
                    BD0 = A063.BD0();
                    C23141Ev r82 = ((C28801av) A063).A02;
                    String[] A1Y2 = C17880vN.A1Y();
                    C17890vO.A1J(A1Y2, AnonymousClass11P.A01(r52.A00) - 300000);
                    r82.A04("express_path_download_data", "last_update_time < ?", "ExpressPathDownloadDataStore/deleteStaleExpressPathDownloadData", A1Y2);
                    BD0.A00();
                    BD0.close();
                    A063.close();
                } catch (Throwable th3) {
                    A063.close();
                    throw th3;
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                Log.e("ExpressPathDownloadDataStore/delete All Older than", e2);
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
            }
        }
        Context context = this.A03.A00;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        HashMap hashMap = C121936Mb.A0A;
        synchronized (hashMap) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                C121936Mb r2 = (C121936Mb) hashMap.get(C17880vN.A0Q(it));
                if (r2 != null) {
                    if (r2.A09() != 1) {
                        C108985cd.A1C(C121936Mb.A00(context, r2));
                        A13.add(r2);
                    } else {
                        File A002 = C121936Mb.A00(context, r2);
                        if (A002.exists()) {
                            A132.add(A002);
                        }
                    }
                }
            }
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                hashMap.remove(((C121936Mb) it2.next()).A05.A03);
            }
        }
        File A0e = C17880vN.A0e(context.getCacheDir(), "ProfilePictureTemp");
        A0e.mkdirs();
        File[] listFiles2 = A0e.listFiles();
        if (listFiles2 != null) {
            for (File file : listFiles2) {
                if (!A132.contains(file)) {
                    file.delete();
                }
            }
        }
        AnonymousClass1U9 r0 = this.A06;
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        HashMap hashMap2 = r0.A0B;
        synchronized (hashMap2) {
            Iterator A0i = C17890vO.A0i(hashMap2);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                C1195168l r1 = (C1195168l) A16.getValue();
                if (r1 != null) {
                    if (!r1.A0B) {
                        C55782gM r02 = r1.A04;
                        C108985cd.A1C(AnonymousClass1U9.A00(context, r02.A04, r02.A06, r02.A02));
                        A133.add(C17880vN.A0x(A16));
                    } else {
                        C55782gM r03 = r1.A04;
                        File A003 = AnonymousClass1U9.A00(context, r03.A04, r03.A06, r03.A02);
                        if (A003.exists()) {
                            A134.add(A003);
                        }
                    }
                }
            }
            Iterator it3 = A133.iterator();
            while (it3.hasNext()) {
                hashMap2.remove(C17880vN.A0v(it3));
            }
        }
        File A0e2 = C17880vN.A0e(context.getCacheDir(), "ProfilePictureTemp");
        A0e2.mkdirs();
        File[] listFiles3 = A0e2.listFiles();
        if (listFiles3 != null) {
            for (File file2 : listFiles3) {
                if (!A134.contains(file2)) {
                    C64062u9.A0Q(file2);
                }
            }
        }
        C17880vN.A1B(AnonymousClass3MZ.A08(this.A01), "enable_gcall_codec_nego_fix");
        File A064 = C40811vJ.A06(this.A02.A02.A00);
        if (A064 != null && (listFiles = A064.listFiles()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file3 : listFiles) {
                long lastModified = currentTimeMillis - file3.lastModified();
                if (lastModified > TimeUnit.DAYS.toMillis(1) || lastModified < 0) {
                    C64062u9.A0R(file3);
                }
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void Bqi() {
        this.A09.CGF(new C146447Pd(this, 43));
        C131066kS r4 = this.A07;
        if (C18020vd.A05(C18040vf.A02, r4.A09, 394)) {
            AnonymousClass64Q r3 = new AnonymousClass64Q();
            AnonymousClass1Be BDn = r4.A0A.BDn(r3, (C18180vt) null);
            if (BDn.A00()) {
                AnonymousClass7RO.A02(r4.A0D, r4, r3, BDn, 11);
            }
        }
        C138606xN r2 = this.A08;
        Log.i("storage-usage-prefetcher/prefetch storage data");
        AnonymousClass7RI.A01(r2.A05, r2, 44);
    }

    public C143767Es(AnonymousClass1VE r2, A8A a8a, AnonymousClass1Q0 r4, AnonymousClass118 r5, AnonymousClass1RN r6, AnonymousClass1SS r7, AnonymousClass1U9 r8, C131066kS r9, C138606xN r10, AnonymousClass10I r11) {
        C18070vi.A0w(r5, r11, r4, r9, r7);
        C18070vi.A0q(a8a, r2, r10);
        C18070vi.A0d(r8, 10);
        this.A03 = r5;
        this.A09 = r11;
        this.A00 = r4;
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = a8a;
        this.A01 = r2;
        this.A08 = r10;
        this.A04 = r6;
        this.A06 = r8;
    }
}
