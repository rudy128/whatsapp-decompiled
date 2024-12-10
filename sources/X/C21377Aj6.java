package X;

import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Aj6  reason: case insensitive filesystem */
public final /* synthetic */ class C21377Aj6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SigquitBasedANRDetector A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void run() {
        AIE aie;
        ArrayList A10;
        String str;
        String str2;
        long j;
        String str3;
        boolean z;
        int i;
        int i2;
        SigquitBasedANRDetector sigquitBasedANRDetector = this.A02;
        String str4 = this.A03;
        String str5 = this.A04;
        String str6 = this.A05;
        long j2 = this.A00;
        long j3 = this.A01;
        Log.i("SigquitBasedANRDetector/processing ANR start");
        Log.i("SigquitBasedANRDetector/persisting ANR report start");
        if (str5 != null) {
            str4 = str4.replace(str5, AnonymousClass001.A1H("  | detected using Sigquit based detector\n", str5, AnonymousClass000.A10()));
        }
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        Exception exc = new Exception("ANR detected");
        exc.setStackTrace(stackTrace);
        Log.e("SigquitBasedANRDetector/Generating ANR Report", exc);
        try {
            StringBuilder A0K = C18070vi.A0K(str4);
            A0K.append("2.24.24.78");
            A0K.append('_');
            File A022 = ((A1V) sigquitBasedANRDetector.A08.get()).A02(str4, AnonymousClass000.A0y(C223919s.A00, A0K), str6);
            SigquitBasedANRDetector sigquitBasedANRDetector2 = sigquitBasedANRDetector;
            synchronized (sigquitBasedANRDetector2.A0B) {
                C22501Ai r5 = sigquitBasedANRDetector2.A04;
                synchronized (r5) {
                    try {
                        i2 = r5.A00;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                if (i2 != 0) {
                    synchronized (r5) {
                        try {
                            if (r5.A00 != 0) {
                                C178019Bm r3 = r5.A02;
                                Object obj = r3.A05;
                                synchronized (obj) {
                                    r3.A01 = true;
                                    obj.notifyAll();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                Log.i("SigquitBasedANRDetector/About to start process anr error monitor");
                C52942bj r6 = new C52942bj(sigquitBasedANRDetector, A022);
                synchronized (r5) {
                    try {
                        C178019Bm r32 = r5.A02;
                        if (!(r32 == null || r5.A00 == 0)) {
                            Object obj2 = r32.A05;
                            synchronized (obj2) {
                                r32.A01 = true;
                                obj2.notifyAll();
                            }
                        }
                        long j4 = r5.A01 + 1;
                        r5.A01 = j4;
                        C178019Bm r4 = new C178019Bm(r5, r6, r5.A03, j4);
                        r5.A02 = r4;
                        r5.A00 = 1;
                        r4.start();
                    } catch (Throwable th3) {
                        while (true) {
                            th = th3;
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("SigquitBasedANRDetector/Error saving ANR report", e);
            Log.e("SigquitBasedANRDetector/couldn't write ANR to file, aborting");
            Log.i("SigquitBasedANRDetector/abortANR");
            sigquitBasedANRDetector.A0D = false;
        }
        Log.i("SigquitBasedANRDetector/processing ANR finish");
        C18030ve r0 = sigquitBasedANRDetector.A06;
        C18030ve r26 = r0;
        C18040vf r22 = C18040vf.A01;
        if (C18020vd.A05(r22, r0, 7997) && (aie = (AIE) AIE.A07.get(Looper.getMainLooper())) != null) {
            B4V[] b4vArr = aie.A03;
            int length = b4vArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                B4V b4v = b4vArr[i3];
                if (b4v instanceof AIF) {
                    AIF aif = (AIF) b4v;
                    if (aif != null) {
                        JSONObject A15 = C17880vN.A15();
                        try {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            String str7 = aif.A03;
                            if (str7 != null) {
                                A15.put("interceptor_mode", str7);
                            }
                            A15.put("history_start_uptime", aif.A00);
                            A15.put("current_uptime_ms", uptimeMillis);
                            A15.put("anr_received_uptime_ms", j2);
                            A15.put("from_anr_time_to_current", uptimeMillis - j2);
                            long j5 = aif.A04;
                            A15.put("config_duration_ms", j5);
                            A15.put("config_threshold_ms", aif.A06);
                            List<C180179Ll> list = aif.A09;
                            for (C180179Ll r1 : list) {
                                if (!(r1 instanceof AnonymousClass8KZ)) {
                                    long[] jArr = ((AnonymousClass8KY) r1).A01;
                                    long[] jArr2 = new long[5];
                                    synchronized (jArr) {
                                        A15.put("is_currently_fg", C30221da.A02.A00.get());
                                        i = 0;
                                        System.arraycopy(jArr, 0, jArr2, 0, 5);
                                    }
                                    Arrays.sort(jArr2);
                                    JSONArray A1A = AnonymousClass8BR.A1A();
                                    A15.put("app_status_history", A1A);
                                    while (true) {
                                        long j6 = jArr2[i];
                                        if (j6 != 0) {
                                            A1A.put(uptimeMillis - j6);
                                        }
                                        i++;
                                        if (i >= 5) {
                                            break;
                                        }
                                    }
                                } else {
                                    AnonymousClass8KZ r12 = (AnonymousClass8KZ) r1;
                                    long[][] jArr3 = r12.A01;
                                    int length2 = jArr3.length;
                                    if (length2 != 0) {
                                        try {
                                            JSONArray A1A2 = AnonymousClass8BR.A1A();
                                            A15.put("gc_history", A1A2);
                                            int i4 = r12.A00;
                                            StringBuilder A102 = AnonymousClass000.A10();
                                            long j7 = uptimeMillis - 60000;
                                            int i5 = i4;
                                            do {
                                                int i6 = i5 + 1;
                                                long[] jArr4 = jArr3[i5];
                                                long j8 = jArr4[0];
                                                if (j8 != 0 && j8 >= j7) {
                                                    A102.append(j8);
                                                    A102.append(',');
                                                    A102.append(jArr4[1]);
                                                    A102.append(',');
                                                    A102.append(jArr4[2]);
                                                    A102.append(',');
                                                    A102.append(jArr4[3]);
                                                    A102.append(',');
                                                    A102.append(jArr4[4]);
                                                    A102.append(',');
                                                    A102.append(jArr4[5]);
                                                    A102.append(',');
                                                    A1A2.put(C17880vN.A0u(A102, jArr4[6]));
                                                    A102.setLength(0);
                                                }
                                                i5 = i6 % length2;
                                            } while (i5 != i4);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                            A15.put("exec_monitor_threshold_ms", aif.A05);
                            JSONArray A1A3 = AnonymousClass8BR.A1A();
                            A15.put("history", A1A3);
                            LinkedList linkedList = aif.A08;
                            synchronized (linkedList) {
                                A10 = C17880vN.A10(linkedList);
                                Iterator it = A10.iterator();
                                while (it.hasNext()) {
                                    ((AnonymousClass8Ka) it.next()).A00++;
                                }
                            }
                            long j9 = uptimeMillis - j5;
                            Iterator it2 = A10.iterator();
                            while (it2.hasNext()) {
                                AnonymousClass8Ka r9 = (AnonymousClass8Ka) it2.next();
                                JSONObject A152 = C17880vN.A15();
                                try {
                                    JSONObject A153 = C17880vN.A15();
                                    if (!r9.A09) {
                                        Class cls = r9.A08;
                                        if (cls != null) {
                                            A153.put("msg_target", cls.getName());
                                        }
                                        Class cls2 = r9.A06;
                                        if (cls2 != null) {
                                            A153.put("msg_callback", cls2.getName());
                                        }
                                        A153.put("msg_what", r9.A00);
                                        Class cls3 = r9.A07;
                                        if (cls3 != null) {
                                            A153.put("msg_obj", cls3.getName());
                                        }
                                        long j10 = r9.A05;
                                        if (j10 > 0) {
                                            long j11 = r9.A02 - j10;
                                            if (j11 > 0) {
                                                A153.put("wait_time_ms", j11);
                                            }
                                        }
                                    } else {
                                        if (r9.A02 == AnonymousClass00R.A01) {
                                            str = "nativePollOnce:bg";
                                        } else {
                                            str = "nativePollOnce";
                                        }
                                        A153.put("msg_target", str);
                                        A153.put("msg_what", 0);
                                    }
                                    long j12 = r9.A01;
                                    if (j12 != -1) {
                                        A153.put("msg_sequence", j12);
                                    }
                                    A152.put("msg", A153);
                                    long j13 = r9.A02;
                                    long j14 = uptimeMillis - j13;
                                    long j15 = j2 - j13;
                                    long j16 = -1;
                                    if (r9.A04 != -1) {
                                        A152.put("current-from_ms_ago", j14);
                                        if (j2 > r9.A02 && j2 > j9) {
                                            A152.put("sigquit-from_ms_ago", j15);
                                        }
                                        long j17 = r9.A04;
                                        if (j17 == -1) {
                                            j17 = SystemClock.uptimeMillis();
                                        }
                                        A152.put("duration_ms", j17 - r9.A02);
                                        str2 = "duration_cpu_ms";
                                        j16 = r9.A04 != -1 ? r9.A03 - r9.A01 : 0;
                                    } else {
                                        A152.put("current-running_ms", j14);
                                        if (j2 > r9.A02) {
                                            A152.put("sigquit-running_ms", j15);
                                        }
                                        str2 = "current-running_cpu_ms";
                                        AIH aih = AIH.A03;
                                        if (aih != null) {
                                            AnonymousClass8KW r52 = aih.A00;
                                            long[] jArr5 = r52.A06;
                                            if (AnonymousClass8KW.A00(r52, jArr5)) {
                                                j16 = ((jArr5[0] - r52.A01) / 1000) / 1000;
                                            }
                                        }
                                    }
                                    A152.put(str2, j16);
                                    if (r9.A04 != null) {
                                        JSONArray A1A4 = AnonymousClass8BR.A1A();
                                        long j18 = r9.A04;
                                        if (j18 != -1) {
                                            j = j18 - r9.A02;
                                        } else {
                                            j = uptimeMillis - r9.A02;
                                        }
                                        for (C188199h2 r42 : r9.A04) {
                                            long j19 = r9.A02;
                                            if (r42.A02 - j19 < j) {
                                                JSONObject A154 = C17880vN.A15();
                                                try {
                                                    A154.put("start_time", r42.A02 - j19);
                                                    A154.put("start_time_delay", r42.A00);
                                                    A154.put("time_spent_in_capture", r42.A01 - r42.A02);
                                                    A154.put("is_capture_interrupted", r42.A05);
                                                    if (r42.A07 != null) {
                                                        JSONArray A1A5 = AnonymousClass8BR.A1A();
                                                        for (StackTraceElement obj3 : r42.A07) {
                                                            A1A5.put(obj3.toString());
                                                        }
                                                        A154.put("stack_trace", A1A5);
                                                    }
                                                    String str8 = r42.A04;
                                                    if (str8 != null) {
                                                        A154.put("thread_state", str8);
                                                    }
                                                    if (r42.A06) {
                                                        str3 = "fg";
                                                    } else {
                                                        str3 = "bg";
                                                    }
                                                    A154.put("app_status", str3);
                                                    C188479hU r10 = r42.A03;
                                                    if (r10 != null) {
                                                        String str9 = r10.A09;
                                                        if (str9 != null) {
                                                            A154.put("thread_cpu_usage", str9);
                                                        }
                                                        String str10 = r10.A08;
                                                        if (str10 != null) {
                                                            A154.put("proc_cpu_usage", str10);
                                                        }
                                                        String str11 = r10.A0A;
                                                        if (str11 != null) {
                                                            A154.put("thread_sched_stat", str11);
                                                        }
                                                        if (r10.A04 > 0) {
                                                            long j20 = r10.A03;
                                                            if (j20 != 0) {
                                                                A154.put("gc_count", j20);
                                                                A154.put("gc_time", r10.A05);
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            long j21 = r10.A00;
                                                            if (j21 != 0) {
                                                                A154.put("blocking_gc_count", j21);
                                                                A154.put("blocking_gc_time", r10.A01);
                                                            } else if (z) {
                                                            }
                                                            A154.put("gc_monitor_interval", r10.A04);
                                                        }
                                                        if (r10.A07 != -1) {
                                                            A154.put("max_java_heap_size", r10.A06);
                                                            A154.put("current_java_heap_size", r10.A07);
                                                            A154.put("available_java_heap", r10.A02);
                                                            A154.put("total_available_java_heap", (r10.A06 - r10.A07) + r10.A02);
                                                            long j22 = r10.A07;
                                                            A154.put("java_heap_usage_percentage", ((j22 - r10.A02) * 100) / j22);
                                                        }
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                                A1A4.put(A154);
                                            }
                                        }
                                        if (A1A4.length() > 0) {
                                            A152.put("exec_record", A1A4);
                                        }
                                    }
                                } catch (Throwable unused3) {
                                }
                                A1A3.put(A152);
                                r9.A00();
                            }
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                        } catch (Throwable unused4) {
                        }
                        String obj4 = A15.toString();
                        if (obj4 != null) {
                            JSONObject A155 = C17880vN.A15();
                            try {
                                A155.put("mqd_collector_populated", SystemClock.uptimeMillis());
                                A155.put("mqd_collector_created", -1);
                                A155.put("mqd_collector_looper_initialized", C180539My.A02);
                                A155.put("mqd_interceptor_started", C180539My.A04);
                                A155.put("mqd_processor_started", C180539My.A05);
                                A155.put("mqd_initializer_started", C180539My.A03);
                                A155.put("mqd_disabled", false);
                                A155.put("should_enable_anr_looper_history", C180539My.A06);
                                A155.put("anr_looper_history_created", C180539My.A01);
                                A155.put("mqd_observer_count", C180539My.A00);
                            } catch (Throwable unused5) {
                            }
                            A1V a1v = (A1V) sigquitBasedANRDetector.A08.get();
                            try {
                                StringBuilder A11 = AnonymousClass000.A11("\n             ");
                                A11.append(A155);
                                A11.append("\n             ");
                                String A012 = AnonymousClass1Y7.A01(AnonymousClass001.A1H(obj4, "\n             ", A11));
                                StringBuilder A103 = AnonymousClass000.A10();
                                A103.append("ui_diagnostics_");
                                a1v.A01(A012, AnonymousClass000.A0y(C223919s.A00, A103)).exists();
                            } catch (IOException e2) {
                                StringBuilder A104 = AnonymousClass000.A10();
                                A104.append("ANRHelper/ui-diagnostics/failed-to-save/");
                                C108985cd.A1M(C223919s.A00, A104, e2);
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
        }
        if (C18020vd.A05(r22, r26, 12361) && AnonymousClass9TS.A00) {
            JSONObject A156 = C17880vN.A15();
            try {
                Class[] A002 = C199309zm.A03.A00();
                long[] A003 = C196719vX.A00(A002);
                int i7 = 0;
                while (true) {
                    Class cls4 = A002[i7];
                    if (cls4 != null && A003[i7] <= 500000) {
                        A156.put(cls4.getName(), A003[i7]);
                    }
                    i7++;
                    if (i7 >= 134) {
                        break;
                    }
                }
            } catch (Throwable unused6) {
            }
            String obj5 = A156.toString();
            if (obj5 != null) {
                A1V a1v2 = (A1V) sigquitBasedANRDetector.A08.get();
                try {
                    String A013 = AnonymousClass1Y7.A01(AnonymousClass001.A1H(obj5, "\n             ", AnonymousClass000.A11("\n             ")));
                    StringBuilder A105 = AnonymousClass000.A10();
                    A105.append("object_count_diagnostics_");
                    a1v2.A01(A013, AnonymousClass000.A0y(C223919s.A00, A105)).exists();
                } catch (IOException e3) {
                    StringBuilder A106 = AnonymousClass000.A10();
                    A106.append("ANRHelper/object-count-diagnostics/failed-to-save/");
                    C108985cd.A1M(C223919s.A00, A106, e3);
                }
            }
        }
        if (C18020vd.A05(C18040vf.A02, r26, 8838)) {
            Iterator A0h = C17890vO.A0h(sigquitBasedANRDetector.A07);
            while (A0h.hasNext()) {
                AnonymousClass19Y r2 = ((C183539Yq) A0h.next()).A00;
                if (r2.BfT(703926750)) {
                    r2.markerEnd(703926750, 404, j3, TimeUnit.NANOSECONDS);
                }
            }
        }
    }

    public /* synthetic */ C21377Aj6(SigquitBasedANRDetector sigquitBasedANRDetector, String str, String str2, String str3, long j, long j2) {
        this.A02 = sigquitBasedANRDetector;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = j;
        this.A01 = j2;
    }
}
