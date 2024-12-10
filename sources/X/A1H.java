package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;

public class A1H {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final AnonymousClass10I A07;

    public static void A00(A1H a1h) {
        ActivityManager A042 = a1h.A02.A04();
        if (A042 == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator listIterator = A042.getHistoricalProcessExitReasons((String) null, 0, 100).listIterator();
        ArrayList A13 = AnonymousClass000.A13();
        HashMap A11 = C17880vN.A11();
        C19830z4 r4 = a1h.A04;
        long A0W = r4.A0W("last_exit_reason_sync_timestamp");
        while (listIterator.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator.next();
            if (applicationExitInfo.getTimestamp() <= A0W) {
                break;
            }
            A13.add(applicationExitInfo);
            Integer valueOf = Integer.valueOf(applicationExitInfo.getReason());
            int i = 1;
            if (A11.containsKey(valueOf)) {
                i = AnonymousClass000.A0M(A11.get(valueOf)) + 1;
            }
            C17890vO.A0z(valueOf, A11, i);
        }
        ListIterator listIterator2 = A13.listIterator(A13.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) listIterator2.previous();
            C171338rY r2 = new C171338rY();
            r2.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            r2.A01 = Double.valueOf((double) applicationExitInfo2.getPss());
            r2.A04 = C17880vN.A0n(applicationExitInfo2.getReason());
            r2.A07 = applicationExitInfo2.getDescription();
            r2.A05 = Long.valueOf(applicationExitInfo2.getTimestamp());
            r2.A02 = Double.valueOf((double) applicationExitInfo2.getRss());
            r2.A06 = C17880vN.A0n(applicationExitInfo2.getStatus());
            r2.A03 = C17880vN.A0n(applicationExitInfo2.getImportance());
            a1h.A06.CC7(r2);
            r4.A1q("last_exit_reason_sync_timestamp", applicationExitInfo2.getTimestamp());
        }
        C170858qm r22 = new C170858qm();
        r22.A01 = A11.toString();
        r22.A00 = Long.valueOf(r4.A0W("last_exit_reason_sync_timestamp"));
        a1h.A06.CC7(r22);
    }

    public File A01(String str) {
        Integer valueOf;
        int A002 = C18020vd.A00(C18040vf.A02, this.A05, 7849);
        AnonymousClass118 r0 = this.A03;
        C18070vi.A0d(r0, 0);
        File A0e = C17880vN.A0e(C108945cZ.A16(r0), "traces");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("os_stacktrace_");
        A10.append(str);
        File A0X = AnonymousClass8BW.A0X(A0e, ".stacktrace", A10);
        if (!A0X.exists()) {
            AnonymousClass00H r11 = this.A01;
            int i = C17880vN.A0C(((C190029kG) r11.get()).A01).getInt("appexitinfo_stack_top_hashcode", -1);
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(i);
            }
            ActivityManager A042 = this.A02.A04();
            if (A042 == null) {
                return null;
            }
            int i2 = 0;
            List historicalProcessExitReasons = A042.getHistoricalProcessExitReasons((String) null, 0, A002);
            if (valueOf != null) {
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext() && it.next().hashCode() != valueOf.intValue()) {
                    i2++;
                }
            } else {
                i2 = historicalProcessExitReasons.size();
            }
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i3);
                if (applicationExitInfo.getReason() == 6 && applicationExitInfo.getDescription() != null) {
                    StringBuilder sb = new StringBuilder(applicationExitInfo.getDescription());
                    sb.append(10);
                    sb.append(10);
                    JSONObject A15 = C17880vN.A15();
                    try {
                        A15.put("exit_info_pid", applicationExitInfo.getPid());
                        A15.put("exit_info_importance", applicationExitInfo.getImportance());
                        A15.put("exit_info_description", applicationExitInfo.getDescription());
                        A15.put("exit_info_reason", applicationExitInfo.getReason());
                        A15.put("exit_info_status", applicationExitInfo.getStatus());
                        A15.put("exit_info_timestamp", applicationExitInfo.getTimestamp());
                        A15.put("exit_info_pss", applicationExitInfo.getPss());
                        A15.put("exit_info_rss", applicationExitInfo.getRss());
                    } catch (Throwable unused) {
                    }
                    AnonymousClass8BS.A1D(A15, sb);
                    sb.append(10);
                    String str2 = null;
                    try {
                        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        if (traceInputStream != null) {
                            BufferedReader A0W = AnonymousClass8BW.A0W(traceInputStream);
                            while (true) {
                                String readLine = A0W.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (str2 == null && readLine.contains("job-anomaly-detector-")) {
                                    int indexOf = readLine.indexOf("job-anomaly-detector-") + 21;
                                    if (indexOf < 21) {
                                        str2 = null;
                                    } else {
                                        str2 = readLine.substring(indexOf, indexOf + 7);
                                    }
                                }
                                sb.append(readLine);
                                sb.append(10);
                            }
                            if (str2 != null) {
                                try {
                                    ((A1V) this.A00.get()).A02(C18070vi.A0H(sb), C17900vP.A0A("os_stacktrace_", str2), (String) null);
                                } catch (IOException e) {
                                    C17900vP.A0h("ANRHelper/failed-to-save/os_trace/", str2, AnonymousClass000.A10(), e);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("Android11ExitReasonReporter/could not get exit info", e2);
                    }
                    C17880vN.A1C(C17890vO.A0A(((C190029kG) r11.get()).A01), "appexitinfo_stack_top_hashcode", applicationExitInfo.hashCode());
                }
            }
            if (!A0X.exists()) {
                return null;
            }
        }
        return A0X;
    }

    public void A02() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.A07.CGF(new C70573Bq(this, 12));
        }
    }

    public A1H(AnonymousClass11C r1, AnonymousClass118 r2, C19830z4 r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = r1;
        this.A07 = r6;
        this.A00 = r7;
        this.A06 = r5;
        this.A04 = r3;
        this.A01 = r8;
    }
}
