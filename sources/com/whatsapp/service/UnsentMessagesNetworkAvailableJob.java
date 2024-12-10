package com.whatsapp.service;

import X.AnonymousClass009;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1Cd;
import X.AnonymousClass1WR;
import X.AnonymousClass3MZ;
import X.AnonymousClass7FH;
import X.C008203r;
import X.C008503u;
import X.C146777Qo;
import X.C17880vN;
import X.C219017v;
import X.C24681Lg;
import X.C31221fD;
import X.C34591kk;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import com.whatsapp.util.Log;

public class UnsentMessagesNetworkAvailableJob extends JobService implements AnonymousClass009 {
    public JobParameters A00;
    public C24681Lg A01;
    public AnonymousClass1Cd A02;
    public C34591kk A03;
    public C219017v A04;
    public AnonymousClass10I A05;
    public boolean A06;
    public final Handler A07;
    public final AnonymousClass1WR A08;
    public final Object A09;
    public final Runnable A0A;
    public volatile C008203r A0B;

    public final Object generatedComponent() {
        if (this.A0B == null) {
            synchronized (this.A09) {
                if (this.A0B == null) {
                    this.A0B = new C008203r(this);
                }
            }
        }
        return this.A0B.generatedComponent();
    }

    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A04 = (C219017v) r1.A91.get();
            this.A01 = AnonymousClass3MZ.A0o(r1);
            this.A03 = (C34591kk) r1.AB5.get();
            this.A02 = (AnonymousClass1Cd) r1.A6i.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.A00 == null) {
            return true;
        }
        this.A01.unregisterObserver(this.A08);
        this.A07.removeCallbacks(this.A0A);
        this.A00 = null;
        return true;
    }

    public UnsentMessagesNetworkAvailableJob(int i) {
        this.A09 = C17880vN.A0p();
        this.A06 = false;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getJobId() != 6 || this.A00 != null) {
            return false;
        }
        this.A00 = jobParameters;
        AnonymousClass3MZ.A1U(this.A05, this, 32);
        return true;
    }

    public UnsentMessagesNetworkAvailableJob() {
        this(0);
        this.A07 = new Handler();
        this.A08 = new AnonymousClass7FH(this, 8);
        this.A0A = new C146777Qo((Object) this, 33);
    }
}
