package X;

import android.os.Process;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.DaM  reason: case insensitive filesystem */
public class C27242DaM extends Thread {
    public final long A00;
    public final NativeTraceWriter A01;
    public final String A02;
    public final String A03;
    public final Buffer[] A04;
    public final DFC A05;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.profilo.writer.NativeTraceWriter, java.lang.Object] */
    public void run() {
        try {
            Process.setThreadPriority(5);
            this.A01.loop();
            Buffer[] bufferArr = this.A04;
            int length = bufferArr.length;
            if (length > 1) {
                String str = this.A03;
                StringBuilder A0t = BE6.A0t(str.length() + 2);
                int i = 1;
                while (true) {
                    A0t.setLength(0);
                    A0t.append(str);
                    A0t.append('-');
                    A0t.append(i);
                    Buffer buffer = bufferArr[i];
                    String str2 = this.A02;
                    String obj = A0t.toString();
                    ? obj2 = new Object();
                    obj2.mHybridData = NativeTraceWriter.initHybrid(buffer, str2, obj, (NativeTraceWriterCallbacks) null);
                    obj2.dump(this.A00);
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            }
        } catch (RuntimeException e) {
            this.A05.onTraceWriteException(this.A00, e);
        } catch (Throwable th) {
            this.A05.A00();
            throw th;
        }
        this.A05.A00();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.facebook.profilo.writer.NativeTraceWriter, java.lang.Object] */
    public C27242DaM(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String str, String str2, Buffer[] bufferArr, long j) {
        super("Prflo:Logger");
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bufferArr;
        DFC dfc = new DFC(nativeTraceWriterCallbacks, bufferArr.length <= 1 ? false : true);
        this.A05 = dfc;
        NativeTraceWriter nativeTraceWriter = NativeTraceWriter.$redex_init_class;
        Buffer buffer = bufferArr[0];
        String A0y = AnonymousClass000.A0y("-0", AnonymousClass000.A11(str2));
        ? obj = new Object();
        obj.mHybridData = NativeTraceWriter.initHybrid(buffer, str, A0y, dfc);
        this.A01 = obj;
    }
}
