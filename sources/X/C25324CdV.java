package X;

import android.os.Build;
import android.os.Process;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.systrace.Systrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.CdV  reason: case insensitive filesystem */
public abstract class C25324CdV {
    public static final C25324CdV $redex_init_class = null;

    static {
        Object obj = new Object();
        C25665Cjv cjv = C25927Coq.A01;
        synchronized (cjv.A01) {
            cjv.A02.add(obj);
            if (cjv.A00) {
                A00();
            }
        }
    }

    public static void A00() {
        BufferedReader bufferedReader;
        if ((64 & C25927Coq.A02) != 0) {
            Systrace.A03("thread_name", Process.myTid(), Thread.currentThread().getName());
        }
        if ((1 & C25927Coq.A02) != 0) {
            StringBuilder A0t = BE6.A0t(StringTreeSet.OFFSET_BASE_ENCODING);
            A0t.append("Android trace tags: ");
            A0t.append(C222919i.A00("debug.atrace.tags.enableflags"));
            A0t.append(", Facebook trace tags: ");
            Systrace.A03("process_labels", 0, C17880vN.A0u(A0t, C25927Coq.A02));
        }
        if ((64 & C25927Coq.A02) != 0) {
            try {
                FileReader fileReader = new FileReader("/proc/self/cmdline");
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    String readLine = bufferedReader.readLine();
                    int indexOf = readLine.indexOf(0);
                    if (indexOf >= 0) {
                        readLine = readLine.substring(0, indexOf);
                    }
                    bufferedReader.close();
                    fileReader.close();
                    Systrace.A03("process_name", 0, readLine);
                    String A02 = C222919i.A02("dalvik.vm.heapgrowthlimit");
                    String A022 = C222919i.A02("dalvik.vm.heapmaxfree");
                    String A023 = C222919i.A02("dalvik.vm.heapminfree");
                    String A024 = C222919i.A02("dalvik.vm.heapstartsize");
                    String A025 = C222919i.A02("dalvik.vm.heaptargetutilization");
                    Object[] objArr = new Object[6];
                    AnonymousClass8BS.A1B(Build.MODEL, A02, objArr);
                    AnonymousClass001.A1R(A024, A022, objArr);
                    C72453Mb.A1T(A023, A025, objArr);
                    Systrace.A03("process_labels", 0, String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", objArr));
                    return;
                } catch (Throwable th) {
                    fileReader.close();
                    throw th;
                }
            } catch (IOException e) {
                throw AnonymousClass8BR.A0x(e);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
