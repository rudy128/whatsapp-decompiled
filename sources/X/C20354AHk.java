package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.AHk  reason: case insensitive filesystem */
public class C20354AHk implements C22531BBo {
    public static final String A05 = A5Z.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final AnonymousClass00I A02;
    public final WorkDatabase A03;
    public final A4T A04;

    public static ArrayList A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            A5Z.A00().A08(A05, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = AnonymousClass000.A14(list);
            ComponentName componentName = new ComponentName(context, SystemJobService.class);
            for (JobInfo next : list) {
                if (componentName.equals(next.getService())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public boolean Bcf() {
        return true;
    }

    public C20354AHk(Context context, AnonymousClass00I r5, WorkDatabase workDatabase) {
        A4T a4t = new A4T(context, r5.A03);
        this.A01 = context;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A04 = a4t;
        this.A03 = workDatabase;
        this.A02 = r5;
    }

    public static void A03(Context context) {
        ArrayList A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (A002 = A00(jobScheduler, context)) != null && !A002.isEmpty()) {
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                A02(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
    }

    public static boolean A04(Context context, WorkDatabase workDatabase) {
        int i;
        String str;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList A002 = A00(jobScheduler, context);
        boolean z = false;
        AHX A003 = A3D.A00("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        C20076A6c a6c = ((C20362AHs) workDatabase.A0B()).A00;
        a6c.A06();
        Cursor A004 = AnonymousClass9OB.A00(a6c, A003, false);
        try {
            ArrayList A0w = AnonymousClass8BV.A0w(A004);
            while (A004.moveToNext()) {
                if (A004.isNull(0)) {
                    str = null;
                } else {
                    str = A004.getString(0);
                }
                A0w.add(str);
            }
            if (A002 != null) {
                i = A002.size();
            } else {
                i = 0;
            }
            HashSet hashSet = new HashSet(i);
            if (A002 != null && !A002.isEmpty()) {
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                hashSet.add(new C193279pp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0)).A01);
                            }
                        } catch (NullPointerException unused) {
                        }
                    }
                    A02(jobScheduler, jobInfo.getId());
                }
            }
            Iterator it2 = A0w.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!hashSet.contains(it2.next())) {
                    A5Z.A00().A03(A05, "Reconciling jobs");
                    z = true;
                    workDatabase.A07();
                    try {
                        BD8 A0E = workDatabase.A0E();
                        Iterator it3 = A0w.iterator();
                        while (it3.hasNext()) {
                            A0E.Biq(C17880vN.A0v(it3), -1);
                        }
                        workDatabase.A08();
                    } finally {
                        C20076A6c.A02(workDatabase);
                    }
                }
            }
            return z;
        } finally {
            A004.close();
            A003.A00();
        }
    }

    public void A05(A2t a2t, int i) {
        int i2;
        JobInfo A012 = this.A04.A01(a2t, i);
        A5Z A002 = A5Z.A00();
        String str = A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Scheduling work ID ");
        String str2 = a2t.A0M;
        A10.append(str2);
        A002.A03(str, AnonymousClass001.A1I("Job ID ", A10, i));
        try {
            if (this.A00.schedule(A012) == 0) {
                A5Z.A00().A06(str, AnonymousClass001.A1H("Unable to schedule work ID ", str2, AnonymousClass000.A10()));
                if (a2t.A0J && a2t.A0F == AnonymousClass00R.A00) {
                    a2t.A0J = false;
                    A5Z.A00().A03(str, AnonymousClass8BS.A0l(str2, "Scheduling a non-expedited job (work ID %s)", new Object[1], 0));
                    A05(a2t, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList A003 = A00(this.A00, this.A01);
            if (A003 != null) {
                i2 = A003.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] A1a = AnonymousClass8BR.A1a();
            C17880vN.A1T(A1a, i2, 0);
            C17880vN.A1T(A1a, this.A03.A0E().BYc().size(), 1);
            AnonymousClass3Ma.A1S(A1a, this.A02.A00);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", A1a);
            A5Z.A00().A04(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            A5Z.A00().A08(str, AnonymousClass001.A1E(a2t, "Unable to schedule ", AnonymousClass000.A10()), th);
        }
    }

    public void BEL(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList A012 = A01(jobScheduler, context, str);
        if (A012 != null && !A012.isEmpty()) {
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                A02(jobScheduler, C72453Mb.A0H(it));
            }
            C20362AHs aHs = (C20362AHs) this.A03.A0B();
            C20076A6c a6c = aHs.A00;
            a6c.A06();
            C19955A0m a0m = aHs.A02;
            BDc A013 = a0m.A01();
            if (str == null) {
                A013.BDA(1);
            } else {
                A013.BDB(1, str);
            }
            a6c.A07();
            try {
                AHW.A00(a6c, A013);
            } finally {
                C20076A6c.A02(a6c);
                a0m.A02(A013);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void CGu(A2t... a2tArr) {
        int A032;
        ArrayList A012;
        int A033;
        WorkDatabase workDatabase = this.A03;
        AnonymousClass9UM r9 = new AnonymousClass9UM(workDatabase);
        int length = a2tArr.length;
        int i = 0;
        while (i < length) {
            A2t a2t = a2tArr[i];
            workDatabase.A07();
            try {
                BD8 A0E = workDatabase.A0E();
                String str = a2t.A0M;
                A2t Bbs = A0E.Bbs(str);
                if (Bbs == null) {
                    A5Z.A00().A06(A05, AnonymousClass000.A0y(" because it's no longer in the DB", AnonymousClass8BW.A0o("Skipping scheduling ", str)));
                } else if (Bbs.A0G != AnonymousClass00R.A00) {
                    A5Z.A00().A06(A05, AnonymousClass000.A0y(" because it is no longer enqueued", AnonymousClass8BW.A0o("Skipping scheduling ", str)));
                } else {
                    C193279pp A002 = AnonymousClass9OL.A00(a2t);
                    C194169rH Ba3 = workDatabase.A0B().Ba3(A002);
                    if (Ba3 != null) {
                        A032 = Ba3.A01;
                    } else {
                        A032 = AnonymousClass8BU.A03(r9.A00.A04(new C21492Al1(r9, this.A02.A01, 0)));
                        workDatabase.A0B().Bde(new C194169rH(A002.A01, A002.A00, A032));
                    }
                    A05(a2t, A032);
                    if (Build.VERSION.SDK_INT == 23 && (A012 = A01(this.A00, this.A01, str)) != null) {
                        int indexOf = A012.indexOf(Integer.valueOf(A032));
                        if (indexOf >= 0) {
                            A012.remove(indexOf);
                        }
                        if (!A012.isEmpty()) {
                            A033 = ((Integer) A012.get(0)).intValue();
                        } else {
                            A033 = AnonymousClass8BU.A03(r9.A00.A04(new C21492Al1(r9, this.A02.A01, 0)));
                        }
                        A05(a2t, A033);
                    }
                }
                workDatabase.A08();
                C20076A6c.A02(workDatabase);
                i++;
            } catch (Throwable th) {
                C20076A6c.A02(workDatabase);
                throw th;
            }
        }
    }

    public static ArrayList A01(JobScheduler jobScheduler, Context context, String str) {
        C193279pp r0;
        ArrayList A002 = A00(jobScheduler, context);
        if (A002 == null) {
            return null;
        }
        ArrayList A0z = C17880vN.A0z(2);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                try {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        r0 = new C193279pp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                        if (r0 != null && str.equals(r0.A01)) {
                            C17890vO.A1D(A0z, jobInfo.getId());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
            r0 = null;
            C17890vO.A1D(A0z, jobInfo.getId());
        }
        return A0z;
    }

    public static void A02(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            A5Z A002 = A5Z.A00();
            String str = A05;
            Locale locale = Locale.getDefault();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            A002.A08(str, String.format(locale, "Exception while trying to cancel job (%d)", A1a), th);
        }
    }
}
