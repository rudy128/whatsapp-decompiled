package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass00O;
import X.AnonymousClass71Y;
import X.BJL;
import X.C123396Uh;
import X.C139656zE;
import X.C17880vN;
import X.C185309cN;
import X.C21471Akc;
import X.C21490Akz;
import X.C27081DTg;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShortcutInfoCompatSaverImpl extends C123396Uh {
    public static final Object A07 = C17880vN.A0p();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = new AnonymousClass00O(0);
    public final Map A04 = new AnonymousClass00O(0);
    public final ExecutorService A05;
    public final ExecutorService A06;

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    public List A00() {
        return (List) this.A05.submit(new C21490Akz(this, 0)).get();
    }

    public /* bridge */ /* synthetic */ void A01() {
        this.A05.submit(new C21471Akc((Object) this, new Object(), 14));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.EEC, java.lang.Object] */
    public void A03(BJL bjl) {
        C21471Akc akc = new C21471Akc((Object) this, (Object) C17880vN.A10(this.A04.values()), 12);
        ? obj = new Object();
        this.A06.submit(new C27081DTg(akc, this, obj, 8));
        obj.BBG(new C27081DTg(bjl, this, obj, 6), this.A05);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.00O, java.util.Map] */
    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File A0e = C17880vN.A0e(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = C17880vN.A0e(A0e, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = C17880vN.A0e(A0e, "targets.xml");
        executorService.submit(new C21471Akc((Object) this, (Object) A0e, 13));
    }

    public /* bridge */ /* synthetic */ void A02(List list) {
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A14.add(new AnonymousClass71Y((C139656zE) it.next()).A00());
        }
        this.A05.submit(new C27081DTg(new Object(), this, A14, 7));
    }

    public void A04(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C185309cN) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                A13.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!A13.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
