package com.whatsapp.companiondevice.sync;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11E;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass1TO;
import X.AnonymousClass3MW;
import X.AnonymousClass6nX;
import X.C000100c;
import X.C108955ca;
import X.C114465qs;
import X.C125736bb;
import X.C145917Nc;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C194159rG;
import X.C20001A2q;
import X.C21472Akd;
import X.C21502AlB;
import X.C88344Zh;
import X.C98764rg;
import X.EEC;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class HistorySyncWorker extends C20001A2q {
    public C21472Akd A00;
    public AnonymousClass1TI A01;
    public Map A02 = Collections.emptyMap();
    public boolean A03 = false;
    public final C114465qs A04 = new Object();
    public final AnonymousClass1TH A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass6nX A07;
    public final AnonymousClass11E A08;
    public final C18030ve A09;
    public final AnonymousClass1TO A0A;

    public static C194159rG A00(HistorySyncWorker historySyncWorker) {
        String A012;
        AnonymousClass6nX r5 = historySyncWorker.A07;
        Map map = historySyncWorker.A02;
        C18070vi.A0d(map, 0);
        Iterator A15 = AnonymousClass000.A15(map);
        while (true) {
            if (!A15.hasNext()) {
                A012 = r5.A00.A01(2131893071);
                break;
            }
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Jid jid = (Jid) A16.getKey();
            if (AnonymousClass000.A1Y(A16.getValue())) {
                C88344Zh A052 = r5.A01.A05(jid.getDevice());
                if (A052 != null) {
                    Context context = r5.A00.A00;
                    A012 = C17880vN.A0q(context, C88344Zh.A01(context, A052, r5.A02), AnonymousClass3MW.A1a(), 0, 2131893072);
                    break;
                }
                C17900vP.A0X(jid, "HistorySyncNotificationHelper/getNotificationText companionDeviceInfo missing for ", AnonymousClass000.A10());
            }
        }
        C18070vi.A0X(A012);
        return new C194159rG(242478045, r5.A00(A012).A05(), AnonymousClass112.A06() ? 1 : 0);
    }

    public static void A01(HistorySyncWorker historySyncWorker) {
        if (Build.VERSION.SDK_INT < 31 && historySyncWorker.A03 == -256) {
            synchronized (historySyncWorker) {
                if (historySyncWorker.A03) {
                    Log.w("HistorySyncWorker/publishNotification skip setForegroundAsync");
                } else {
                    try {
                        historySyncWorker.A06(A00(historySyncWorker));
                    } catch (IllegalStateException unused) {
                        Log.w("HistorySyncWorker/publishNotification cannot start foreground notification in background");
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.EEC, java.lang.Object] */
    public EEC A07() {
        Log.i("HistorySyncWorker/getForegroundInfoAsync");
        ? obj = new Object();
        C108955ca.A1R(this.A06, this, obj, 3);
        return obj;
    }

    public EEC A08() {
        Log.i("HistorySyncWorker/startWork");
        if (Build.VERSION.SDK_INT < 31 && this.A01 == null) {
            C145917Nc r4 = new C145917Nc(this, 5);
            this.A01 = r4;
            AnonymousClass1TH r3 = this.A05;
            AnonymousClass10I r2 = this.A06;
            r2.getClass();
            r3.A05(r4, new C21502AlB(r2, 1));
        }
        C18030ve r42 = this.A09;
        AnonymousClass1TO r5 = this.A0A;
        AnonymousClass1TH r32 = this.A05;
        this.A00 = new C21472Akd(new C125736bb(this), this.A08, r32, r42, r5);
        this.A06.CGF(new C98764rg((Object) this, 46));
        return this.A04;
    }

    public void A09() {
        Log.i("HistorySyncWorker/onStopped");
        AnonymousClass1TI r1 = this.A01;
        if (r1 != null) {
            this.A05.A00.A02(r1);
        }
        C21472Akd akd = this.A00;
        if (akd != null) {
            ((AtomicBoolean) akd.A04).set(true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5qs] */
    public HistorySyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A09 = AnonymousClass10E.A8r(r1);
        this.A06 = A0H.CRy();
        this.A0A = (AnonymousClass1TO) r1.A50.get();
        this.A05 = (AnonymousClass1TH) r1.A6T.get();
        this.A08 = A0H.BFf();
        this.A07 = (AnonymousClass6nX) r1.Ao8.A00.A2Z.get();
    }
}
