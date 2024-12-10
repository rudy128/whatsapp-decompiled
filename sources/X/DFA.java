package X;

import android.content.Context;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class DFA implements E9D {
    public static AtomicReference A09 = new AtomicReference((Object) null);
    public C25606Cim A00;
    public MmapBufferManager A01;
    public Cn8[] A02;
    public Cn8[] A03;
    public C25392Cet A04;
    public final DF9 A05;
    public final Object A06 = C17880vN.A0p();
    public final Random A07;
    public volatile CNR A08;

    private void A00(C26552D3s d3s) {
        for (Buffer deallocateBuffer : d3s.A0F) {
            if (!this.A01.deallocateBuffer(deallocateBuffer)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Could not release memory for buffer for trace: ");
                Log.e("Profilo/TraceOrchestrator", AnonymousClass000.A0y(d3s.A0D, A10));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v57, types: [java.lang.Object, X.CTI] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r8.list().length > 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C26552D3s r19) {
        /*
            r18 = this;
            r4 = r18
            r5 = r19
            java.io.File r8 = r5.A0A
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L_0x0036
            java.lang.String[] r0 = r8.list()
            int r1 = r0.length
            r0 = 1
            if (r1 <= r0) goto L_0x0036
        L_0x0014:
            r9 = 0
            if (r0 == 0) goto L_0x006f
            java.lang.String r2 = ".zip.tmp"
            boolean r0 = r8.isDirectory()
            r7 = 0
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r0 = r8.getParent()
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r1)
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0014
        L_0x0038:
            java.io.FileOutputStream r1 = X.C108945cZ.A19(r6)     // Catch:{ IOException -> 0x008b }
            r0 = 262144(0x40000, float:3.67342E-40)
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x008b }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0065 }
            r2.<init>(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "."
            A03(r8, r0, r2)     // Catch:{ all -> 0x005b }
            r2.flush()     // Catch:{ all -> 0x005b }
            r2.finish()     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x0065 }
            r3.close()     // Catch:{ IOException -> 0x008b }
            r7 = r6
            goto L_0x008e
        L_0x005b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0065 }
        L_0x0064:
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x008b }
        L_0x006e:
            throw r1     // Catch:{ IOException -> 0x008b }
        L_0x006f:
            java.io.File[] r1 = r8.listFiles()
            if (r1 == 0) goto L_0x00ca
            int r0 = r1.length
            if (r0 == 0) goto L_0x00ca
            r2 = r1[r9]
            java.io.File r1 = r8.getParentFile()
            java.lang.String r0 = r2.getName()
            java.io.File r8 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r2.renameTo(r8)
            goto L_0x00b9
        L_0x008b:
            r6.delete()
        L_0x008e:
            java.lang.String r2 = "yyyy-MM-dd'T'HH-mm-ss"
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r2 = r7.getParentFile()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r7.getName()
            java.io.File r8 = X.AnonymousClass8BW.A0X(r2, r0, r1)
            boolean r0 = r7.renameTo(r8)
        L_0x00b9:
            if (r0 == 0) goto L_0x00ca
            X.DF9 r6 = r4.A05
            boolean r0 = r6.BEI(r5, r8)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r1 = "Profilo/TraceOrchestrator"
            java.lang.String r0 = "Not allowed to upload."
            android.util.Log.d(r1, r0)
        L_0x00ca:
            return
        L_0x00cb:
            monitor-enter(r4)
            int r0 = r5.A03     // Catch:{ all -> 0x0250 }
            r0 = r0 & 3
            if (r0 == 0) goto L_0x00d3
            r9 = 1
        L_0x00d3:
            X.Cim r2 = r4.A00     // Catch:{ all -> 0x0250 }
            java.lang.String r7 = r8.getName()     // Catch:{ all -> 0x0250 }
            r0 = 46
            int r1 = r7.lastIndexOf(r0)     // Catch:{ all -> 0x0250 }
            r0 = -1
            r3 = 0
            if (r1 == r0) goto L_0x00e7
            java.lang.String r7 = r7.substring(r3, r1)     // Catch:{ all -> 0x0250 }
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = ".log"
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0250 }
            if (r9 == 0) goto L_0x00fd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "override-"
            java.lang.String r7 = X.AnonymousClass001.A1H(r0, r7, r1)     // Catch:{ all -> 0x0250 }
        L_0x00fd:
            java.io.File r11 = r2.A04     // Catch:{ all -> 0x0250 }
            boolean r0 = r11.isDirectory()     // Catch:{ all -> 0x0250 }
            r17 = 1
            if (r0 != 0) goto L_0x0121
            boolean r0 = r11.mkdirs()     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x0121
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            int r0 = r1.A01     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x0250 }
        L_0x0115:
            X.CTI r7 = r2.A02     // Catch:{ all -> 0x0250 }
            X.CTI r0 = new X.CTI     // Catch:{ all -> 0x0250 }
            r0.<init>()     // Catch:{ all -> 0x0250 }
            r2.A02 = r0     // Catch:{ all -> 0x0250 }
            monitor-exit(r4)     // Catch:{ all -> 0x0250 }
            goto L_0x0238
        L_0x0121:
            java.io.File r0 = X.C17880vN.A0e(r11, r7)     // Catch:{ all -> 0x0250 }
            boolean r0 = r8.renameTo(r0)     // Catch:{ all -> 0x0250 }
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x01db
            int r0 = r1.A00     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0250 }
        L_0x0133:
            java.io.File r8 = r2.A06     // Catch:{ all -> 0x0250 }
            long r0 = r2.A01     // Catch:{ all -> 0x0250 }
            r7 = 2
            java.io.FilenameFilter[] r13 = new java.io.FilenameFilter[r7]     // Catch:{ all -> 0x0250 }
            java.io.FilenameFilter r16 = X.C25606Cim.A07     // Catch:{ all -> 0x0250 }
            r13[r3] = r16     // Catch:{ all -> 0x0250 }
            java.io.FilenameFilter r15 = X.C25606Cim.A08     // Catch:{ all -> 0x0250 }
            r13[r17] = r15     // Catch:{ all -> 0x0250 }
            boolean r9 = r11.exists()     // Catch:{ all -> 0x0250 }
            if (r9 != 0) goto L_0x0164
            boolean r9 = r11.isDirectory()     // Catch:{ all -> 0x0250 }
            if (r9 != 0) goto L_0x0164
        L_0x014e:
            int r9 = r2.A00     // Catch:{ all -> 0x0250 }
            java.io.FilenameFilter[] r11 = new java.io.FilenameFilter[r7]     // Catch:{ all -> 0x0250 }
            r11[r3] = r16     // Catch:{ all -> 0x0250 }
            r11[r17] = r15     // Catch:{ all -> 0x0250 }
            r10 = 2
            boolean r0 = r8.exists()     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r8.isDirectory()     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x01e3
            goto L_0x0115
        L_0x0164:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0250 }
            r12 = 0
        L_0x0169:
            r9 = r13[r12]     // Catch:{ all -> 0x0250 }
            java.io.File[] r9 = r11.listFiles(r9)     // Catch:{ all -> 0x0250 }
            if (r9 != 0) goto L_0x017b
            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0250 }
        L_0x0173:
            r10.addAll(r9)     // Catch:{ all -> 0x0250 }
            int r12 = r12 + 1
            if (r12 < r7) goto L_0x0169
            goto L_0x0180
        L_0x017b:
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x0250 }
            goto L_0x0173
        L_0x0180:
            long r13 = X.AnonymousClass8BR.A04(r0)     // Catch:{ all -> 0x0250 }
            java.util.Iterator r12 = r10.iterator()     // Catch:{ all -> 0x0250 }
        L_0x0188:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x0250 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ all -> 0x0250 }
            long r10 = r9.lastModified()     // Catch:{ all -> 0x0250 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0188
            java.lang.String r0 = r9.getName()     // Catch:{ all -> 0x0250 }
            java.io.File r0 = X.C17880vN.A0e(r8, r0)     // Catch:{ all -> 0x0250 }
            boolean r0 = r9.renameTo(r0)     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x01ac
            r0 = 1
            goto L_0x01c9
        L_0x01ac:
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            int r0 = r1.A03     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x0250 }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r9.delete()     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x01c8
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            int r0 = r1.A02     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A02 = r0     // Catch:{ all -> 0x0250 }
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x01d4
            int r0 = r1.A05     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A05 = r0     // Catch:{ all -> 0x0250 }
            goto L_0x0188
        L_0x01d4:
            int r0 = r1.A04     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x0250 }
            goto L_0x0188
        L_0x01db:
            int r0 = r1.A03     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x0250 }
            goto L_0x0133
        L_0x01e3:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0250 }
            r1 = 0
        L_0x01e8:
            r0 = r11[r1]     // Catch:{ all -> 0x0250 }
            java.io.File[] r0 = r8.listFiles(r0)     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x01fa
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0250 }
        L_0x01f2:
            r7.addAll(r0)     // Catch:{ all -> 0x0250 }
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x01e8
            goto L_0x01ff
        L_0x01fa:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0250 }
            goto L_0x01f2
        L_0x01ff:
            int r0 = r7.size()     // Catch:{ all -> 0x0250 }
            if (r0 <= r9) goto L_0x0115
            r0 = 7
            X.DUP.A00(r2, r7, r0)     // Catch:{ all -> 0x0250 }
            int r0 = r7.size()     // Catch:{ all -> 0x0250 }
            int r0 = r0 - r9
            java.util.List r0 = r7.subList(r3, r0)     // Catch:{ all -> 0x0250 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0250 }
        L_0x0216:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0250 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0250 }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x0250 }
            X.CTI r1 = r2.A02     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x0231
            int r0 = r1.A06     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ all -> 0x0250 }
            goto L_0x0216
        L_0x0231:
            int r0 = r1.A04     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x0250 }
            goto L_0x0216
        L_0x0238:
            r6.C8w(r5)
            int r3 = r7.A02
            int r0 = r7.A03
            int r3 = r3 + r0
            int r0 = r7.A01
            int r3 = r3 + r0
            int r0 = r7.A04
            int r3 = r3 + r0
            int r2 = r7.A06
            int r1 = r7.A05
            int r0 = r7.A00
            r6.C8v(r3, r2, r1, r0)
            return
        L_0x0250:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0250 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFA.A01(X.D3s):void");
    }

    public void C8z(C26552D3s d3s, int i) {
        String str;
        IllegalStateException th;
        CNR cnr;
        try {
            this.A05.C8z(d3s, i);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Trace is aborted with code: ");
            switch (i) {
                case 1:
                    str = "unknown";
                    break;
                case 2:
                    str = "controller_init";
                    break;
                case 3:
                    str = "missed_event";
                    break;
                case 4:
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                    break;
                case 5:
                    str = "new_start";
                    break;
                case 6:
                    str = "condition_not_met";
                    break;
                case 8:
                    str = "writer_exception";
                    break;
                case 9:
                    str = "logout";
                    break;
                default:
                    str = AnonymousClass001.A1I("UNKNOWN REASON ", AnonymousClass000.A10(), i);
                    break;
            }
            BE9.A1H(str, "Profilo/TraceOrchestrator", A10);
            C26238Cvb cvb = C26238Cvb.A0A;
            if (cvb != null) {
                cvb.A05(d3s.A06, i);
                File file = d3s.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                            cnr = this.A08;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                        }
                    }
                    if (cnr != null && i == 4) {
                        TreeMap treeMap = cnr.A00.intParams;
                        int i2 = 0;
                        if (treeMap != null && treeMap.containsKey("system_config.timed_out_upload_sample_rate")) {
                            i2 = treeMap.get("system_config.timed_out_upload_sample_rate");
                        }
                        int A0F = BE6.A0F(i2);
                        if (A0F != 0 && this.A07.nextInt(A0F) == 0) {
                            A01(d3s);
                        }
                    }
                    A02(file);
                }
                A00(d3s);
                return;
            }
            th = AnonymousClass000.A0n("No TraceControl when cleaning up aborted trace");
            throw th;
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th3) {
            A00(d3s);
            throw th3;
        }
    }

    public void C90(C26552D3s d3s) {
        try {
            this.A05.C90(d3s);
            File file = d3s.A0A;
            if (file.exists()) {
                A01(d3s);
                A02(file);
            }
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th) {
            A00(d3s);
            throw th;
        }
        A00(d3s);
    }

    public void C91(C26552D3s d3s, Throwable th) {
        Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A05.C91(d3s, th);
        C8z(d3s, 8);
    }

    public void C92(C26552D3s d3s) {
        this.A05.C92(d3s);
    }

    public DFA(Context context, C25392Cet cet, File file, Cn8[] cn8Arr) {
        this.A04 = cet;
        this.A08 = null;
        this.A00 = new C25606Cim(context, file);
        this.A07 = new Random();
        this.A05 = new DF9();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        int i = 0;
        do {
            Cn8 cn8 = cn8Arr[i];
            if (cn8 instanceof C22912BUx) {
                A13.add(cn8);
            } else {
                A132.add(cn8);
            }
            i++;
        } while (i < 5);
        this.A02 = (Cn8[]) A132.toArray(new Cn8[A132.size()]);
        this.A03 = (Cn8[]) A13.toArray(new Cn8[A13.size()]);
    }

    public static void A02(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String A0e : list) {
                    File A0e2 = C17880vN.A0e(file, A0e);
                    if (A0e2.isDirectory()) {
                        A02(A0e2);
                    } else {
                        A0e2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static void A03(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream A18;
        File absoluteFile = C17880vN.A0e(file, str).getAbsoluteFile();
        URI uri = file.toURI();
        for (String A0e : absoluteFile.list()) {
            File A0e2 = C17880vN.A0e(absoluteFile, A0e);
            if (A0e2.exists()) {
                String path = uri.relativize(A0e2.toURI()).getPath();
                if (A0e2.isFile()) {
                    try {
                        A18 = C108945cZ.A18(C17880vN.A0e(file, path));
                        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        zipOutputStream.putNextEntry(new ZipEntry(path));
                        while (true) {
                            int read = A18.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        A18.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th) {
                        zipOutputStream.closeEntry();
                        throw th;
                    }
                } else if (A0e2.isDirectory()) {
                    A03(file, path, zipOutputStream);
                }
            }
        }
        return;
        throw th;
    }
}
