package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1mH  reason: invalid class name and case insensitive filesystem */
public class C35461mH {
    public static final String[] A04 = {"biz.stachibana.TaskKiller", "cn.com.android.opda.taskman", "com.arron.taskManager", "com.arron.taskManagerFree", "com.bright.taskcleaner.activity", "com.cool.taskkiller", "com.elnware.ActiveAppsAds", "com.estrongs.android.taskmanager", "com.gau.go.launcherex.gowidget.taskmanagerex", "com.ijinshan.kbatterydoctor", "com.ijinshan.kbatterydoctor_en", "com.iobit.mobilecare", "com.james.SmartTaskManager", "com.james.SmartTaskManagerLite", "com.james.SmartTaskManagerPro", "com.latedroid.juicedefender", "com.latedroid.juicedefender.beta", "com.latedroid.juicedefender.plus", "com.latedroid.ultimatejuice", "com.latedroid.ultimatejuice.root", "com.lookout.zapper", "com.mobo.task.killer", "com.netqin.aotkiller", "com.netqin.mobileguard", "com.rechild.advancedtaskkiller", "com.rechild.advancedtaskkillerfroyo", "com.rechild.advancedtaskkillerpro", "com.rechild.cleaner", "com.rhythm.hexise.task", "com.sand.taskmanager", "com.sta_beers.auto_task", "com.symantec.monitor", "com.task.killer", "com.tni.TasKiller", "com.zdworks.android.toolbox", "com.zomut.watchdog", "com.zomut.watchdoglite", "gpc.myweb.hinet.net.TaskManager", "imoblife.memorybooster.lite", "jp.co.aplio.simpletaskkiller", "jp.co.aplio.simpletaskkillerfree", "jp.smapho.quicktaskkiller", "mobi.infolife.taskmanager", "mobi.infolife.taskmanagerpro", "net.lepeng.batterydoctor", "net.lepeng.superboxss"};
    public static final String[] A05 = {"com.agilesoftresource", "com.antivirus", "com.cleanmaster.mguard", "com.electricsheep.asi", "com.estrongs.android.pop", "com.estrongs.android.pop.cupcake", "com.metago.astro", "com.smartwho.SmartFileManager", "com.smartwho.SmartFileManagerPro", "nextapp.systempanel", "nextapp.systempanel.r1"};
    public final C35501mL A00;
    public final AnonymousClass10I A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final AtomicReference A03 = new AtomicReference(new C35491mK((Set) null, (Set) null));

    public C35491mK A01(TimeUnit timeUnit, int i) {
        C35461mH r1 = this.A00.A01;
        if (r1.A02.await((long) i, timeUnit)) {
            C35491mK r12 = (C35491mK) r1.A03.get();
            Set set = r12.A00;
            if (set != null) {
                set.size();
            }
            Set set2 = r12.A01;
            if (set2 != null) {
                set2.size();
            }
            return r12;
        }
        throw new TimeoutException();
    }

    public C35461mH(AnonymousClass118 r3, AnonymousClass10I r4) {
        this.A01 = r4;
        this.A00 = new C35501mL(r3, this);
    }

    public static HashSet A00(Context context, String str, String[] strArr) {
        CharSequence charSequence;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                try {
                    try {
                        charSequence = packageManager.getApplicationInfo(str2, 0).loadLabel(packageManager);
                    } catch (Exception e) {
                        Log.e("exception during task-killer name lookup: ", e);
                        charSequence = str2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(' ');
                    sb.append(str2);
                    Log.w(sb.toString());
                    hashSet.add(new C58452ki(charSequence, str2));
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (RuntimeException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb2.append(e2.getMessage());
                    Log.e(sb2.toString());
                }
            }
            if (!hashSet.isEmpty()) {
                return hashSet;
            }
        }
        return null;
    }
}
