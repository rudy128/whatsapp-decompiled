package X;

import android.os.Build;
import android.os.ConditionVariable;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1mQ  reason: invalid class name and case insensitive filesystem */
public class C35551mQ {
    public C19880zA A00;
    public C19880zA A01;
    public final C31361fR A02;
    public final C218617r A03;
    public final AnonymousClass11S A04;
    public final C33621j7 A05;
    public final AnonymousClass1L7 A06;
    public final AnonymousClass1NM A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass118 A09;
    public final C19830z4 A0A;
    public final AnonymousClass11Z A0B;
    public final AnonymousClass1RK A0C;
    public final C35541mP A0D;
    public final C35461mH A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C19880zA A0H;
    public final C22701Cw A0I;
    public final AnonymousClass1LA A0J;
    public final AnonymousClass190 A0K;
    public final C23651Hc A0L;
    public final AnonymousClass1VE A0M;
    public final AnonymousClass1VJ A0N;
    public final AnonymousClass11E A0O;
    public final AnonymousClass1PM A0P;
    public final C219217x A0Q;
    public final AnonymousClass1Cd A0R;
    public final C24621La A0S;
    public final AnonymousClass1DN A0T;
    public final C18030ve A0U;
    public final C23641Hb A0V;
    public final C219317y A0W;
    public final AnonymousClass1SV A0X;
    public final AnonymousClass1QO A0Y;
    public final C35531mO A0Z;
    public final AnonymousClass1Nb A0a;
    public final AnonymousClass1KE A0b;
    public final AnonymousClass11W A0c;
    public final C35511mM A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final AnonymousClass00H A0k;
    public final AnonymousClass00H A0l;

    public String A05(String str) {
        List latestLogs = Log.getLatestLogs(1);
        if (latestLogs.size() < 1) {
            Log.e("debug-builder/upload-logs no logs found to be uploaded.");
        } else {
            Pair A032 = C64062u9.A03(this.A0W, (File) latestLogs.get(0), 8388608, 41943040);
            boolean booleanValue = ((Boolean) A032.first).booleanValue();
            File file = (File) A032.second;
            if (file != null) {
                String A002 = A00(this, file, str, false);
                if (booleanValue) {
                    file.delete();
                }
                return A002;
            }
        }
        return null;
    }

    public static String A00(C35551mQ r19, File file, String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        ConditionVariable conditionVariable = new ConditionVariable();
        C35551mQ r1 = r19;
        C20669AUb aUb = new C20669AUb(conditionVariable, r1, stringBuffer, 2);
        try {
            File file2 = file;
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                A7N A002 = r1.A0X.A00(aUb, (C184599bD) null, "https://crashlogs.whatsapp.net/wa_clb_data", (String) null, (String) null, 6, false);
                A002.A07("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                int i = 2;
                if (z) {
                    i = 1;
                }
                try {
                    A002.A0E.add(new C187689gD(fileInputStream, "file", file2.getName(), i, 0, file2.length()));
                    A002.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "support");
                    AnonymousClass190 r5 = r1.A0K;
                    A002.A07("from_jid", r5.A0A());
                    A002.A07("forced", "true");
                    A002.A07("android_hprof_extras", r5.A0B((String) null));
                    String str2 = str;
                    if (str != null) {
                        A002.A07("ticket_id", str2);
                    }
                    A002.A04((C191779nA) null);
                    fileInputStream.close();
                    conditionVariable.block(100000);
                    if (stringBuffer.length() == 0) {
                        return null;
                    }
                    return stringBuffer.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream.close();
                throw th;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("debug-builder/uploadLogsInternal/error-uploading-logs exception:");
            sb.append(e);
            Log.e(sb.toString());
            return null;
        }
    }

    public static void A01(Object obj, Object obj2, String str) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e("debug-builder/json/error ", e);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static boolean A02(File file) {
        if (!new File(file, ".nomedia").exists()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("debug-builder/unexpected .nomedia in ");
        sb.append(file.getName());
        Log.w(sb.toString());
        return true;
    }

    public File A03(File file, int i, boolean z, boolean z2, boolean z3) {
        List<File> arrayList;
        File file2;
        BufferedInputStream bufferedInputStream;
        if (z) {
            arrayList = Log.getLatestLogs(i);
        } else {
            arrayList = new ArrayList<>();
        }
        if (file != null) {
            arrayList.add(file);
        }
        if (z2) {
            File[] A002 = A1V.A00(this.A09);
            if (A002.length > 0) {
                Collections.addAll(arrayList, A002);
            } else {
                Log.w("debug-builder/getZippedInfoFiles no ANR traces to send");
            }
        }
        if (arrayList.size() != 0) {
            if (z3) {
                file2 = this.A03.A0Z("logs");
            } else {
                file2 = this.A06.A08("logs.zip");
            }
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    byte[] bArr = new byte[16384];
                    for (File file3 : arrayList) {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file3), 16384);
                            zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 16384);
                                if (read == -1) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, read);
                            }
                            bufferedInputStream.close();
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("debug-builder/cant zip file ");
                            sb.append(file3.getName());
                            Log.e(sb.toString(), e);
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                        }
                    }
                    zipOutputStream.close();
                    return file2;
                } catch (Throwable th2) {
                    zipOutputStream.close();
                    throw th2;
                }
            } catch (IOException e2) {
                Log.e("debug-builder/zip ", e2);
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
            }
        }
        return null;
        throw th;
    }

    public void A06() {
        Log.e("app-state: APP STATE DEBUG INFO BEGIN");
        for (C72413Lv Bi5 : (Set) this.A0G.get()) {
            Bi5.Bi5("app-state");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder();
            sb.append("app-state/auth-keystore-result:");
            sb.append(this.A0I.A0D().A00);
            Log.i(sb.toString());
        }
        AnonymousClass1DN r1 = this.A0T;
        AnonymousClass1Cd r4 = r1.A05;
        r4.A06();
        if (r4.A08) {
            C28781at A042 = r4.get();
            try {
                AnonymousClass1IZ it = r1.A06.A00().values().iterator();
                while (it.hasNext()) {
                    C28381a4 r2 = (C28381a4) it.next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("app-state");
                    sb2.append("/db-migration-status/");
                    sb2.append(r2.A05);
                    sb2.append(":");
                    sb2.append(r2.A02());
                    Log.i(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("app-state");
                sb3.append("/db-migration-status-overall: true");
                Log.i(sb3.toString());
                r4.A06();
                if (r4.A02.A00 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("app-state");
                    sb4.append("/");
                    sb4.append("available_message_view");
                    sb4.append(":");
                    C23141Ev r3 = ((C28801av) A042).A02;
                    C17960vV.A07(r3);
                    sb4.append(C28331Zy.A00(r3, "view", "available_message_view"));
                    Log.i(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("app-state");
                    sb5.append("/");
                    sb5.append("deleted_messages_view");
                    sb5.append(":");
                    C17960vV.A07(r3);
                    sb5.append(C28331Zy.A00(r3, "view", "deleted_messages_view"));
                    Log.i(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("app-state");
                    sb6.append("/");
                    sb6.append("deleted_messages_ids_view");
                    sb6.append(":");
                    C17960vV.A07(r3);
                    sb6.append(C28331Zy.A00(r3, "view", "deleted_messages_ids_view"));
                    Log.i(sb6.toString());
                }
                A042.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("app-state");
            sb7.append("/db-migration-status-not-ready");
            Log.i(sb7.toString());
        }
        Log.e("app-state: APP STATE DEBUG INFO END");
    }

    public C35551mQ(C19880zA r2, C19880zA r3, C22701Cw r4, C31361fR r5, AnonymousClass1LA r6, AnonymousClass190 r7, C218617r r8, AnonymousClass11S r9, C23651Hc r10, C33621j7 r11, AnonymousClass1VE r12, AnonymousClass1VJ r13, AnonymousClass11E r14, AnonymousClass1PM r15, AnonymousClass1L7 r16, AnonymousClass1NM r17, AnonymousClass11C r18, AnonymousClass118 r19, C219217x r20, C19830z4 r21, AnonymousClass11Z r22, AnonymousClass1Cd r23, C24621La r24, AnonymousClass1RK r25, AnonymousClass1DN r26, C18030ve r27, C23641Hb r28, C219317y r29, AnonymousClass1SV r30, C35541mP r31, AnonymousClass1QO r32, C35531mO r33, AnonymousClass1Nb r34, AnonymousClass1KE r35, C35461mH r36, AnonymousClass11W r37, C35511mM r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48) {
        this.A09 = r19;
        this.A0U = r27;
        this.A0K = r7;
        this.A04 = r9;
        this.A0c = r37;
        this.A03 = r8;
        this.A06 = r16;
        this.A0E = r36;
        this.A0I = r4;
        this.A0h = r39;
        this.A05 = r11;
        this.A0l = r40;
        this.A0f = r41;
        this.A08 = r18;
        this.A0e = r42;
        this.A0d = r38;
        this.A0J = r6;
        this.A0L = r10;
        this.A0a = r34;
        this.A0i = r43;
        this.A0S = r24;
        this.A02 = r5;
        this.A0R = r23;
        this.A0P = r15;
        this.A0Q = r20;
        this.A0A = r21;
        this.A0G = r44;
        this.A0N = r13;
        this.A0Y = r32;
        this.A0Z = r33;
        this.A0M = r12;
        this.A0C = r25;
        this.A0X = r30;
        this.A0F = r45;
        this.A0T = r26;
        this.A0O = r14;
        this.A0H = r2;
        this.A0g = r46;
        this.A0W = r29;
        this.A0b = r35;
        this.A0V = r28;
        this.A00 = r3;
        this.A0D = r31;
        this.A0B = r22;
        this.A07 = r17;
        this.A0j = r47;
        this.A0k = r48;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0334 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x033f A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0353 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x036e A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036f A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0375 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0380 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0382 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x038c A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03a5 A[SYNTHETIC, Splitter:B:151:0x03a5] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04e1 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04e2 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x055f A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x056e A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0588 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0599 A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05bb A[Catch:{ all -> 0x0b30, Exception -> 0x0b35 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0789 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x07c6 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x07e1 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07f8 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x089d A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x08a8 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x08ba A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x08c5 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08f0 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0953 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0954 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x096e A[Catch:{ Exception -> 0x0b1d }, LOOP:12: B:411:0x0968->B:413:0x096e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x098c A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x09ab A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x09c5 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09f1 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a3b A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0a6c A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a85 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab1 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad4 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0ae3 A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b0e A[Catch:{ Exception -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0b43  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0a56 A[SYNTHETIC] */
    public java.lang.String A04(android.content.Context r36, android.util.Pair r37, X.AnonymousClass1EC r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.List r44, java.util.List r45, org.json.JSONObject r46, long r47, long r49, boolean r51, boolean r52, boolean r53) {
        /*
            r35 = this;
            java.lang.String r26 = "%s:%s"
            java.lang.String r16 = ""
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r17.<init>()
            r2 = r35
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x0b35 }
            java.text.SimpleDateFormat r20 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0b35 }
            r0 = r20
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0b35 }
            X.0z4 r0 = r2.A0A     // Catch:{ Exception -> 0x0b35 }
            r32 = r0
            java.lang.String r7 = r32.A0l()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r4 = r32.A0n()     // Catch:{ Exception -> 0x0b35 }
            X.1Hc r1 = r2.A0L     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r8 = "UP"
            goto L_0x004a
        L_0x002e:
            int r1 = r1.A05     // Catch:{ Exception -> 0x0b35 }
            r0 = 1
            if (r1 == r0) goto L_0x0034
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            java.lang.String r8 = "SC/XC"
            goto L_0x004a
        L_0x0039:
            X.00H r0 = r2.A0h     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b35 }
            X.1Do r0 = (X.C22881Do) r0     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r0.A01     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r8 = "PW"
            goto L_0x004a
        L_0x0048:
            java.lang.String r8 = "DN"
        L_0x004a:
            java.lang.String r19 = ")"
            java.lang.String r6 = " ("
            java.lang.String r3 = "Not Calculated"
            r10 = -1
            r0 = r49
            int r5 = (r49 > r10 ? 1 : (r49 == r10 ? 0 : -1))
            r34 = r36
            if (r5 != 0) goto L_0x006a
            r12 = r3
        L_0x005b:
            r0 = r47
            int r5 = (r47 > r10 ? 1 : (r47 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00d1
            r9 = -2
            int r3 = (r47 > r9 ? 1 : (r47 == r9 ? 0 : -1))
            r5 = r42
            if (r3 != 0) goto L_0x008c
            goto L_0x00c7
        L_0x006a:
            java.lang.String r5 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r9.<init>()     // Catch:{ Exception -> 0x0b35 }
            r9.append(r5)     // Catch:{ Exception -> 0x0b35 }
            r9.append(r6)     // Catch:{ Exception -> 0x0b35 }
            r5 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r5, r0)     // Catch:{ Exception -> 0x0b35 }
            r9.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = r19
            r9.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r12 = r9.toString()     // Catch:{ Exception -> 0x0b35 }
            goto L_0x005b
        L_0x008c:
            java.lang.String r3 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r9.<init>()     // Catch:{ Exception -> 0x0b35 }
            r9.append(r3)     // Catch:{ Exception -> 0x0b35 }
            r9.append(r6)     // Catch:{ Exception -> 0x0b35 }
            r3 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r3, r0)     // Catch:{ Exception -> 0x0b35 }
            r9.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = r19
            r9.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r0.<init>()     // Catch:{ Exception -> 0x0b35 }
            r0.append(r3)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = " (read-only)"
            r0.append(r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0b35 }
            goto L_0x00d1
        L_0x00c7:
            java.lang.String r0 = "removed"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r3 = "Not present"
        L_0x00d1:
            X.1PM r0 = r2.A0P     // Catch:{ Exception -> 0x0b35 }
            X.1PL r0 = r0.A03     // Catch:{ Exception -> 0x0b35 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0b35 }
            r10.<init>()     // Catch:{ Exception -> 0x0b35 }
            X.1Lt r0 = r0.A00     // Catch:{ Exception -> 0x0b35 }
            X.1at r5 = r0.get()     // Catch:{ Exception -> 0x0b35 }
            goto L_0x00e3
        L_0x00e1:
            r3 = r5
            goto L_0x00d1
        L_0x00e3:
            java.lang.String r9 = X.AnonymousClass2WV.A00     // Catch:{ all -> 0x0b2b }
            java.lang.String r1 = "CONTACT_VNAMES"
            r0 = 0
            android.database.Cursor r9 = X.C24861Ly.A03(r5, r9, r1, r0)     // Catch:{ all -> 0x0b2b }
        L_0x00ec:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0b1f }
            if (r0 == 0) goto L_0x00fc
            X.1yf r0 = X.AnonymousClass2T3.A00(r9)     // Catch:{ all -> 0x0b1f }
            if (r0 == 0) goto L_0x00ec
            r10.add(r0)     // Catch:{ all -> 0x0b1f }
            goto L_0x00ec
        L_0x00fc:
            r9.close()     // Catch:{ all -> 0x0b2b }
            r5.close()     // Catch:{ Exception -> 0x0b35 }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ Exception -> 0x0b35 }
            r14 = 0
            r13 = 0
        L_0x0108:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x0b35 }
            X.1yf r1 = (X.C42741yf) r1     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r1.A07     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0108
            boolean r0 = r1.A03()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0121
            int r14 = r14 + 1
            goto L_0x0108
        L_0x0121:
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0108
            int r13 = r13 + 1
            goto L_0x0108
        L_0x012a:
            if (r51 != 0) goto L_0x0138
            java.lang.String r1 = "\n\n\n\n"
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "--Support Info--\n"
            r0.append(r1)     // Catch:{ Exception -> 0x0b35 }
        L_0x0138:
            org.json.JSONObject r18 = new org.json.JSONObject     // Catch:{ Exception -> 0x0b35 }
            r18.<init>()     // Catch:{ Exception -> 0x0b35 }
            r5 = r17
            if (r51 == 0) goto L_0x0143
            r5 = r18
        L_0x0143:
            r1 = r46
            if (r46 == 0) goto L_0x014c
            java.lang.String r0 = "Calling debug info"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x014c:
            X.9dx r1 = new X.9dx     // Catch:{ Exception -> 0x0b35 }
            r9 = r52
            r0 = r34
            r1.<init>(r0, r9)     // Catch:{ Exception -> 0x0b35 }
            X.00H r0 = r2.A0G     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b35 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0b35 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0b35 }
        L_0x0161:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0b35 }
            X.3Lv r0 = (X.C72413Lv) r0     // Catch:{ Exception -> 0x0b35 }
            r0.BiC(r1)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x0161
        L_0x0171:
            java.util.Map r0 = r1.A01     // Catch:{ Exception -> 0x0b35 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0b35 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0b35 }
        L_0x017b:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0b35 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x017b
        L_0x0195:
            if (r52 != 0) goto L_0x01f2
            java.lang.String r11 = "Debug info"
            X.11S r10 = r2.A04     // Catch:{ Exception -> 0x0b35 }
            r10.A0I()     // Catch:{ Exception -> 0x0b35 }
            com.whatsapp.jid.PhoneUserJid r9 = r10.A0E     // Catch:{ Exception -> 0x0b35 }
            if (r9 == 0) goto L_0x0272
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r1.<init>()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r9.user     // Catch:{ Exception -> 0x0b35 }
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0b35 }
        L_0x01b5:
            X.1fR r0 = r2.A02     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x01ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r1.<init>()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "chnum "
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r1.append(r9)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0b35 }
            com.whatsapp.Me r0 = r10.A07()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = r0.jabber_id     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x01ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r1.<init>()     // Catch:{ Exception -> 0x0b35 }
            r1.append(r9)     // Catch:{ Exception -> 0x0b35 }
            r1.append(r6)     // Catch:{ Exception -> 0x0b35 }
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = r19
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0b35 }
        L_0x01ef:
            A01(r9, r5, r11)     // Catch:{ Exception -> 0x0b35 }
        L_0x01f2:
            java.lang.String r1 = "MDEnabled"
            X.00H r0 = r2.A0i     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b35 }
            X.1HV r0 = (X.AnonymousClass1HV) r0     // Catch:{ Exception -> 0x0b35 }
            X.0z4 r0 = r0.A01     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r0.A2S()     // Catch:{ Exception -> 0x0b35 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "HasMdCompanion"
            X.1RK r0 = r2.A0C     // Catch:{ Exception -> 0x0b35 }
            r31 = r0
            java.util.ArrayList r0 = r31.A06()     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0b35 }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "Context"
            r33 = r39
            r0 = r33
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "useragent"
            X.11W r0 = r2.A0c     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r0.A02()     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "Socket Conn"
            A01(r8, r5, r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "Free Space Built-In"
            A01(r12, r5, r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "Free Space Removable"
            A01(r3, r5, r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "Smb count"
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "Ent count"
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            X.0zA r1 = r2.A0H     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r1.A07()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0277
            X.1Cd r0 = r2.A0R     // Catch:{ Exception -> 0x0b35 }
            r0.A06()     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = r0.A08     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0277
            r1.A03()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "getAwayState"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0b35 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0b35 }
            throw r0     // Catch:{ Exception -> 0x0b35 }
        L_0x0272:
            java.lang.String r9 = "unregistered"
            goto L_0x01b5
        L_0x0277:
            X.11C r0 = r2.A08     // Catch:{ Exception -> 0x0b35 }
            r30 = r0
            android.net.ConnectivityManager r27 = r30.A0E()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r9 = "Connection"
            X.11E r0 = r2.A0O     // Catch:{ Exception -> 0x0b35 }
            r29 = r0
            X.1LR r10 = r29.A04()     // Catch:{ Exception -> 0x0b35 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r8.<init>()     // Catch:{ Exception -> 0x0b35 }
            if (r10 == 0) goto L_0x02cd
            java.lang.String r3 = r10.A02     // Catch:{ Exception -> 0x0b35 }
            if (r3 == 0) goto L_0x02aa
            r1 = 0
        L_0x0295:
            int r0 = r3.length()     // Catch:{ Exception -> 0x0b35 }
            if (r1 >= r0) goto L_0x02aa
            char r0 = r3.charAt(r1)     // Catch:{ Exception -> 0x0b35 }
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = 46
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            int r1 = r1 + 1
            goto L_0x0295
        L_0x02aa:
            java.lang.String r3 = r10.A01     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0b35 }
            if (r0 != 0) goto L_0x02d8
            r8.append(r6)     // Catch:{ Exception -> 0x0b35 }
            if (r3 == 0) goto L_0x02d3
            r1 = 0
        L_0x02b8:
            int r0 = r3.length()     // Catch:{ Exception -> 0x0b35 }
            if (r1 >= r0) goto L_0x02d3
            char r0 = r3.charAt(r1)     // Catch:{ Exception -> 0x0b35 }
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = 46
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            int r1 = r1 + 1
            goto L_0x02b8
        L_0x02cd:
            java.lang.String r0 = "NONE"
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x02d8
        L_0x02d3:
            r0 = 41
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x02d8:
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r9)     // Catch:{ Exception -> 0x0b35 }
            r1 = r40
            if (r40 == 0) goto L_0x02e8
            java.lang.String r0 = "Server"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x02e8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r8.<init>()     // Catch:{ Exception -> 0x0b35 }
            X.1mH r3 = r2.A0E     // Catch:{ Exception -> 0x031f }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x031f }
            r0 = 0
            X.1mK r9 = r3.A01(r1, r0)     // Catch:{ Exception -> 0x031f }
            java.util.Set r3 = r9.A00     // Catch:{ Exception -> 0x031f }
            r1 = 32
            if (r3 == 0) goto L_0x030b
            java.lang.String r0 = "TK-NP-"
            r8.append(r0)     // Catch:{ Exception -> 0x031f }
            int r0 = r3.size()     // Catch:{ Exception -> 0x031f }
            r8.append(r0)     // Catch:{ Exception -> 0x031f }
            r8.append(r1)     // Catch:{ Exception -> 0x031f }
        L_0x030b:
            java.util.Set r3 = r9.A01     // Catch:{ Exception -> 0x031f }
            if (r3 == 0) goto L_0x0324
            java.lang.String r0 = "TK-NS-"
            r8.append(r0)     // Catch:{ Exception -> 0x031f }
            int r0 = r3.size()     // Catch:{ Exception -> 0x031f }
            r8.append(r0)     // Catch:{ Exception -> 0x031f }
            r8.append(r1)     // Catch:{ Exception -> 0x031f }
            goto L_0x0324
        L_0x031f:
            java.lang.String r0 = "TK-FG-0 "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0324:
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x032e }
            java.lang.String r0 = "NW-WAP-1 "
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x032e }
        L_0x032e:
            boolean r0 = X.C17970vW.A0G(r30)     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = "DC-RTED "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0339:
            boolean r0 = X.C17970vW.A0B()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = "DC-BACRM "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0344:
            java.lang.String r0 = "FE-GDE "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            X.118 r1 = r2.A09     // Catch:{ Exception -> 0x0b35 }
            android.content.Context r3 = r1.A00     // Catch:{ Exception -> 0x0b35 }
            boolean r0 = X.C41361wE.A09(r3)     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x036f
            java.lang.String r0 = "FE-GDC "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-capable"
        L_0x035a:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "FE-VIDC "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "debug-builder/generate-diagnostics/video-call-capable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0b35 }
            int r3 = X.C41371wF.A00(r3)     // Catch:{ Exception -> 0x0b35 }
            r0 = 0
            if (r3 != 0) goto L_0x0373
            goto L_0x0372
        L_0x036f:
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-not-capable"
            goto L_0x035a
        L_0x0372:
            r0 = 1
        L_0x0373:
            if (r0 == 0) goto L_0x037a
            java.lang.String r0 = "FE-SMSRTV "
            r8.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x037a:
            int r0 = r8.length()     // Catch:{ Exception -> 0x0b35 }
            if (r0 != 0) goto L_0x0382
            r3 = 0
            goto L_0x0386
        L_0x0382:
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0b35 }
        L_0x0386:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0b35 }
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = "Diagnostic Codes"
            A01(r3, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0391:
            android.telephony.TelephonyManager r25 = r30.A0K()     // Catch:{ Exception -> 0x0b35 }
            X.11S r0 = r2.A04     // Catch:{ Exception -> 0x0b35 }
            r28 = r0
            r28.A0I()     // Catch:{ Exception -> 0x0b35 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r14 = "unknown"
            r23 = r14
            if (r0 != 0) goto L_0x04d5
            X.17x r3 = r2.A0Q     // Catch:{ Exception -> 0x0b35 }
            r0 = r30
            java.lang.String r9 = X.C20056A5f.A01(r0, r1, r3)     // Catch:{ Exception -> 0x0b35 }
            if (r25 == 0) goto L_0x03c7
            int r0 = r25.getSimState()     // Catch:{ Exception -> 0x0b35 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x03b7:
            java.lang.String r3 = "Sim"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r1.<init>()     // Catch:{ Exception -> 0x0b35 }
            r1.append(r9)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x03c9
        L_0x03c7:
            r8 = 0
            goto L_0x03b7
        L_0x03c9:
            if (r8 != 0) goto L_0x03cd
            r8 = r16
        L_0x03cd:
            r1.append(r8)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r3)     // Catch:{ Exception -> 0x0b35 }
            if (r9 == 0) goto L_0x04d5
            java.lang.String r1 = "\\D"
            r0 = r16
            java.lang.String r11 = r9.replaceAll(r1, r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r15 = "L Distance"
            int r10 = r11.length()     // Catch:{ Exception -> 0x0b35 }
            if (r10 != 0) goto L_0x0400
            int r10 = r4.length()     // Catch:{ Exception -> 0x0b35 }
        L_0x03ed:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r15)     // Catch:{ Exception -> 0x0b35 }
            r0 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
            int r3 = X.A9B.A00(r4, r11)     // Catch:{ Exception -> 0x0b35 }
            if (r3 == 0) goto L_0x0474
            goto L_0x0472
        L_0x0400:
            int r9 = r4.length()     // Catch:{ Exception -> 0x0b35 }
            if (r9 == 0) goto L_0x03ed
            r12 = 1
            int r8 = r9 + 1
            int r3 = r10 + 1
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ Exception -> 0x0b35 }
            r1[r12] = r3     // Catch:{ Exception -> 0x0b35 }
            r3 = 0
            r1[r3] = r8     // Catch:{ Exception -> 0x0b35 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0b35 }
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch:{ Exception -> 0x0b35 }
            int[][] r8 = (int[][]) r8     // Catch:{ Exception -> 0x0b35 }
            r0 = 0
        L_0x041c:
            if (r0 > r9) goto L_0x0425
            r1 = r8[r0]     // Catch:{ Exception -> 0x0b35 }
            r1[r3] = r0     // Catch:{ Exception -> 0x0b35 }
            int r0 = r0 + 1
            goto L_0x041c
        L_0x0425:
            r0 = 0
        L_0x0426:
            if (r0 > r10) goto L_0x042f
            r1 = r8[r3]     // Catch:{ Exception -> 0x0b35 }
            r1[r0] = r0     // Catch:{ Exception -> 0x0b35 }
            int r0 = r0 + 1
            goto L_0x0426
        L_0x042f:
            r3 = 1
        L_0x0430:
            if (r3 > r10) goto L_0x046c
            r1 = 1
        L_0x0433:
            if (r1 > r9) goto L_0x0469
            int r0 = r1 + -1
            char r13 = r4.charAt(r0)     // Catch:{ Exception -> 0x0b35 }
            int r12 = r3 + -1
            char r12 = r11.charAt(r12)     // Catch:{ Exception -> 0x0b35 }
            r24 = r8[r1]     // Catch:{ Exception -> 0x0b35 }
            r22 = r8[r0]     // Catch:{ Exception -> 0x0b35 }
            if (r13 != r12) goto L_0x044e
            int r0 = r3 + -1
            r0 = r22[r0]     // Catch:{ Exception -> 0x0b35 }
            r24[r3] = r0     // Catch:{ Exception -> 0x0b35 }
            goto L_0x0466
        L_0x044e:
            int r21 = r3 + -1
            r0 = r22[r21]     // Catch:{ Exception -> 0x0b35 }
            int r13 = r0 + 1
            r0 = r22[r3]     // Catch:{ Exception -> 0x0b35 }
            int r12 = r0 + 1
            r0 = r24[r21]     // Catch:{ Exception -> 0x0b35 }
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r12, r0)     // Catch:{ Exception -> 0x0b35 }
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ Exception -> 0x0b35 }
            r24[r3] = r0     // Catch:{ Exception -> 0x0b35 }
        L_0x0466:
            int r1 = r1 + 1
            goto L_0x0433
        L_0x0469:
            int r3 = r3 + 1
            goto L_0x0430
        L_0x046c:
            r0 = r8[r9]     // Catch:{ Exception -> 0x0b35 }
            r10 = r0[r10]     // Catch:{ Exception -> 0x0b35 }
            goto L_0x03ed
        L_0x0472:
            if (r3 != r0) goto L_0x04d5
        L_0x0474:
            X.1LA r8 = r2.A0J     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = X.A9B.A0E(r8, r4, r7, r11)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = "Mistyped"
            if (r0 != 0) goto L_0x0484
            java.lang.String r0 = "false"
        L_0x0480:
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x0488
        L_0x0484:
            java.lang.String r0 = "true"
            goto L_0x0480
        L_0x0488:
            if (r3 != 0) goto L_0x04c8
            java.lang.String r3 = X.C63942tw.A03(r8, r7, r11)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r1 = X.C63942tw.A03(r8, r7, r4)     // Catch:{ Exception -> 0x0b35 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r0.<init>()     // Catch:{ Exception -> 0x0b35 }
            r0.append(r7)     // Catch:{ Exception -> 0x0b35 }
            r0.append(r1)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0b35 }
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x0b35 }
            if (r1 != 0) goto L_0x04c3
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0b35 }
            if (r0 != 0) goto L_0x04c3
            boolean r0 = X.C63942tw.A07(r11, r4, r3, r7)     // Catch:{ Exception -> 0x0b35 }
            if (r0 != 0) goto L_0x04c3
            boolean r0 = r4.endsWith(r3)     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x04c8
            r0 = 0
            int r1 = X.C63942tw.A00(r8, r0, r7, r3)     // Catch:{ Exception -> 0x0b35 }
            r0 = 5
            if (r1 != r0) goto L_0x04c8
            r9 = 0
            goto L_0x04c8
        L_0x04c3:
            r0 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x04c8:
            java.lang.String r1 = "Mistyped Last6"
            if (r9 != 0) goto L_0x04ce
            r0 = r14
            goto L_0x04d2
        L_0x04ce:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0b35 }
        L_0x04d2:
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
        L_0x04d5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r11.<init>()     // Catch:{ Exception -> 0x0b35 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b35 }
            r10.<init>()     // Catch:{ Exception -> 0x0b35 }
            if (r27 != 0) goto L_0x04e2
            goto L_0x0542
        L_0x04e2:
            android.net.Network[] r9 = r27.getAllNetworks()     // Catch:{ Exception -> 0x0b35 }
            int r8 = r9.length     // Catch:{ Exception -> 0x0b35 }
            r7 = 0
            r15 = 0
        L_0x04e9:
            if (r7 >= r8) goto L_0x0547
            r4 = r9[r7]     // Catch:{ Exception -> 0x0b35 }
            if (r15 == 0) goto L_0x04f7
            r0 = 59
            r11.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r10.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x04f7:
            r0 = r27
            android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r4)     // Catch:{ Exception -> 0x0b35 }
            if (r3 == 0) goto L_0x053d
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0b35 }
            r13 = 0
            r1[r13] = r0     // Catch:{ Exception -> 0x0b35 }
            r0 = 11
            boolean r0 = r3.hasCapability(r0)     // Catch:{ Exception -> 0x0b35 }
            r12 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
            r1[r12] = r0     // Catch:{ Exception -> 0x0b35 }
            r0 = r26
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0b35 }
            r11.append(r0)     // Catch:{ Exception -> 0x0b35 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0b35 }
            r0[r13] = r4     // Catch:{ Exception -> 0x0b35 }
            r1 = 13
            boolean r1 = r3.hasCapability(r1)     // Catch:{ Exception -> 0x0b35 }
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0b35 }
            r0[r12] = r1     // Catch:{ Exception -> 0x0b35 }
            r1 = r26
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x0b35 }
            r10.append(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x053d:
            int r15 = r15 + 1
            int r7 = r7 + 1
            goto L_0x04e9
        L_0x0542:
            java.lang.String r0 = "debug-builder/get-debug-info cm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0547:
            java.lang.String r0 = "Network metered"
            java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x0b35 }
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "Network restricted"
            java.lang.String r1 = r10.toString()     // Catch:{ Exception -> 0x0b35 }
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
            X.2mn r0 = r29.A05()     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x056a
            java.lang.String r1 = "Data roaming"
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
        L_0x056a:
            java.lang.String r1 = "Tel roaming"
            if (r25 == 0) goto L_0x0576
            boolean r0 = r25.isNetworkRoaming()     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0576:
            A01(r14, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            X.1VE r4 = r2.A0M     // Catch:{ Exception -> 0x0b35 }
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r4)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "previous_call_tslog_call_id"
            r3 = 0
            java.lang.String r1 = r1.getString(r0, r3)     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x058d
            java.lang.String r0 = "Last CR ID"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x058d:
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r4)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "previous_relay_call_uuid"
            java.lang.String r1 = r1.getString(r0, r3)     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x059e
            java.lang.String r0 = "Last Relay Call UUID"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x059e:
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r4)     // Catch:{ Exception -> 0x0b35 }
            java.lang.String r0 = "previous_self_participant_uuid"
            java.lang.String r1 = r1.getString(r0, r3)     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05b5
            int r0 = r1.length()     // Catch:{ Exception -> 0x0b35 }
            if (r0 <= 0) goto L_0x05b5
            java.lang.String r0 = "Last Call Self Participant UUID"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05b5:
            X.1Hb r0 = r2.A0V     // Catch:{ Exception -> 0x0b35 }
            com.whatsapp.fieldstats.events.WamCall r3 = r0.A01     // Catch:{ Exception -> 0x0b35 }
            if (r3 == 0) goto L_0x0608
            java.lang.Integer r1 = r3.callSide     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05c5
            java.lang.String r0 = "voip call side"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05c5:
            java.lang.Integer r1 = r3.callResult     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05cf
            java.lang.String r0 = "voip call result"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05cf:
            java.lang.Integer r1 = r3.callSetupErrorType     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05d9
            java.lang.String r0 = "voip call setup error"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05d9:
            java.lang.Integer r1 = r3.callTermReason     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05e3
            java.lang.String r0 = "voip call terminate reason"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05e3:
            java.lang.String r1 = r3.callTestBucket     // Catch:{ Exception -> 0x0b35 }
            if (r1 == 0) goto L_0x05ed
            java.lang.String r0 = "voip call test bucket"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x05ed:
            java.lang.Integer r0 = r3.callRelayBindStatus     // Catch:{ Exception -> 0x0b35 }
            if (r0 == 0) goto L_0x05f9
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x0b35 }
            r1 = 2
            r0 = 1
            if (r3 == r1) goto L_0x05fa
        L_0x05f9:
            r0 = 0
        L_0x05fa:
            java.lang.String r1 = "voip bind to any relay"
            if (r0 == 0) goto L_0x0605
            java.lang.String r0 = "Yes"
        L_0x0601:
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b35 }
            goto L_0x0608
        L_0x0605:
            java.lang.String r0 = "No"
            goto L_0x0601
        L_0x0608:
            r4 = 1
            r1 = r41
            if (r41 == 0) goto L_0x0612
            java.lang.String r0 = "ref"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x0612:
            java.lang.String r1 = "ABprops hash state"
            X.1mO r3 = r2.A0Z     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = r3.A00()     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "Serverprops hash state"
            java.lang.String r0 = r3.A01()     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Class<X.DPW> r7 = X.DPW.class
            monitor-enter(r7)     // Catch:{ Exception -> 0x0b1d }
            X.CUm r0 = X.DPW.A0V     // Catch:{ all -> 0x0b1a }
            int r3 = r0.A00()     // Catch:{ all -> 0x0b1a }
            monitor-exit(r7)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "Video transcode"
            if (r3 == r4) goto L_0x0644
            r0 = 2
            if (r3 == r0) goto L_0x063d
            java.lang.String r0 = "no encoders"
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x064a
        L_0x063d:
            java.lang.String r0 = "unsupported device"
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x064a
        L_0x0644:
            java.lang.String r0 = "supported"
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
        L_0x064a:
            r0 = r37
            if (r37 == 0) goto L_0x0657
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
        L_0x0657:
            X.1QO r0 = r2.A0Y     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A03()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x068a
            java.lang.String r1 = "Payments"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            if (r44 == 0) goto L_0x068a
            boolean r0 = X.C197289wS.A00(r33)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x068a
            java.util.Iterator r3 = r44.iterator()     // Catch:{ Exception -> 0x0b1d }
        L_0x0674:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x068a
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x0b1d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0674
        L_0x068a:
            X.1Cd r0 = r2.A0R     // Catch:{ Exception -> 0x0b1d }
            r0.A06()     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A08     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x06ef
            X.1La r8 = r2.A0S     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "cross_platform_migration_completed"
            r3 = 0
            int r0 = r8.A00(r0, r3)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x06f0
            java.lang.String r7 = "cross_platform_migration_completed_timestamp"
            r0 = 0
            long r0 = r8.A01(r7, r0)     // Catch:{ Exception -> 0x0b1d }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x0b1d }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0b1d }
            r0 = r20
            java.lang.String r1 = r0.format(r7)     // Catch:{ Exception -> 0x0b1d }
        L_0x06b1:
            java.lang.String r0 = "XPMigrated"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
            X.00H r7 = r2.A0F     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r11 = r7.get()     // Catch:{ Exception -> 0x0b1d }
            X.1NP r11 = (X.AnonymousClass1NP) r11     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r9 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r8 = "google_backup_timestamp"
            r0 = 0
            long r21 = r9.getLong(r8, r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r9 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r8 = "google_restore_timestamp"
            long r14 = r9.getLong(r8, r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r9 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r8 = "msg_backup_timestamp"
            long r12 = r9.getLong(r8, r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r9 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r8 = "msg_restore_timestamp"
            long r8 = r9.getLong(r8, r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r10 = "backup-restore"
            int r0 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x06fc
            goto L_0x06f3
        L_0x06ef:
            r3 = 0
        L_0x06f0:
            java.lang.String r1 = "no"
            goto L_0x06b1
        L_0x06f3:
            int r0 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x06fc
            int r0 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x06fc
            goto L_0x0753
        L_0x06fc:
            int r0 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0719
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0719
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0719
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b1d }
            r9.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "g-restore:"
            r9.append(r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r8 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "google_restore_result"
            goto L_0x0763
        L_0x0719:
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0736
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0736
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0736
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b1d }
            r9.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "backup:"
            r9.append(r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r8 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "msg_backup_result"
            goto L_0x0763
        L_0x0736:
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0772
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0772
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0772
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b1d }
            r9.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "restore:"
            r9.append(r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r8 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "msg_restore_result"
            goto L_0x0763
        L_0x0753:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b1d }
            r9.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "g-backup:"
            r9.append(r0)     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r8 = r11.A07()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "google_backup_result"
        L_0x0763:
            r0 = 0
            java.lang.String r0 = r8.getString(r1, r0)     // Catch:{ Exception -> 0x0b1d }
            r9.append(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r10)     // Catch:{ Exception -> 0x0b1d }
        L_0x0772:
            r0 = r32
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r8 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "last_datacenter"
            r0 = 0
            java.lang.String r1 = r8.getString(r1, r0)     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x078e
            java.lang.String r0 = "Datacenter"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x078e:
            java.lang.String r1 = "Screen reader"
            android.view.accessibility.AccessibilityManager r0 = r30.A0M()     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = "Fingerprint eligible"
            X.00H r0 = r2.A0f     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            X.1XL r0 = (X.AnonymousClass1XL) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A05()     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            X.1j7 r0 = r2.A05     // Catch:{ Exception -> 0x0b1d }
            X.11r r0 = X.C33621j7.A00(r0)     // Catch:{ Exception -> 0x0b1d }
            X.1Wb r0 = r0.A09     // Catch:{ Exception -> 0x0b1d }
            long r0 = r0.A0G()     // Catch:{ Exception -> 0x0b1d }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x07e1
            java.lang.String r1 = "never"
        L_0x07c8:
            java.lang.String r0 = "Last local backup time"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r9 = r32.A0f()     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0b1d }
            r8 = r0 ^ 1
            java.lang.String r1 = "Google account added"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x07f6
        L_0x07e1:
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x07ea
            r1 = r23
            goto L_0x07c8
        L_0x07ea:
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x0b1d }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0b1d }
            r0 = r20
            java.lang.String r1 = r0.format(r8)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x07c8
        L_0x07f6:
            if (r8 == 0) goto L_0x0891
            r0 = r32
            long r0 = r0.A0U(r9)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r10 = "Last successful Google storage backup time"
            r11 = 0
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0859
            java.lang.String r0 = "never"
        L_0x0808:
            A01(r0, r5, r10)     // Catch:{ Exception -> 0x0b1d }
            r0 = r32
            long r0 = r0.A0V(r9)     // Catch:{ Exception -> 0x0b1d }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0839
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b1d }
            r8.<init>()     // Catch:{ Exception -> 0x0b1d }
            r8.append(r0)     // Catch:{ Exception -> 0x0b1d }
            r8.append(r6)     // Catch:{ Exception -> 0x0b1d }
            r6 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r6, r0)     // Catch:{ Exception -> 0x0b1d }
            r8.append(r0)     // Catch:{ Exception -> 0x0b1d }
            r0 = r19
            r8.append(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "Size of Google storage backup"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x0839:
            java.lang.Object r0 = r7.get()     // Catch:{ Exception -> 0x0b1d }
            X.1NP r0 = (X.AnonymousClass1NP) r0     // Catch:{ Exception -> 0x0b1d }
            int r0 = r0.A03()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = X.C41361wE.A04(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "Backup to Google storage frequency"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r7.get()     // Catch:{ Exception -> 0x0b1d }
            X.1NP r0 = (X.AnonymousClass1NP) r0     // Catch:{ Exception -> 0x0b1d }
            int r0 = r0.A04()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0874
            goto L_0x086e
        L_0x0859:
            r11 = -1
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0862
            r0 = r23
            goto L_0x0808
        L_0x0862:
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x0b1d }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0b1d }
            r0 = r20
            java.lang.String r0 = r0.format(r8)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0808
        L_0x086e:
            if (r0 != r4) goto L_0x0877
            java.lang.String r23 = "wifi or cellular"
            goto L_0x0877
        L_0x0874:
            java.lang.String r23 = "wifi only"
        L_0x0877:
            java.lang.String r1 = "Backed up over"
            r0 = r23
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r7.get()     // Catch:{ Exception -> 0x0b1d }
            X.1NP r0 = (X.AnonymousClass1NP) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A0P()     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "Videos included in backup"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x0891:
            java.lang.String r6 = "Groups media visibility"
            X.1Nb r7 = r2.A0a     // Catch:{ Exception -> 0x0b1d }
            X.1yM r0 = r7.A0V()     // Catch:{ Exception -> 0x0b1d }
            int r1 = r0.A01     // Catch:{ Exception -> 0x0b1d }
            if (r1 == 0) goto L_0x08a8
            if (r1 == r4) goto L_0x08a5
            r0 = 2
            if (r1 == r0) goto L_0x08ab
            java.lang.String r0 = "<unknown>"
            goto L_0x08ad
        L_0x08a5:
            java.lang.String r0 = "off"
            goto L_0x08ad
        L_0x08a8:
            java.lang.String r0 = "default"
            goto L_0x08ad
        L_0x08ab:
            java.lang.String r0 = "on"
        L_0x08ad:
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r6 = "Individual media visibility"
            X.1yM r0 = r7.A0W()     // Catch:{ Exception -> 0x0b1d }
            int r1 = r0.A01     // Catch:{ Exception -> 0x0b1d }
            if (r1 == 0) goto L_0x08c5
            if (r1 == r4) goto L_0x08c2
            r0 = 2
            if (r1 == r0) goto L_0x08c8
            java.lang.String r0 = "<unknown>"
            goto L_0x08ca
        L_0x08c2:
            java.lang.String r0 = "off"
            goto L_0x08ca
        L_0x08c5:
            java.lang.String r0 = "default"
            goto L_0x08ca
        L_0x08c8:
            java.lang.String r0 = "on"
        L_0x08ca:
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r6 = "In scoped mode"
            X.1L7 r1 = r2.A06     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r1.A0C()     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b1d }
            r0 = 30
            if (r6 < r0) goto L_0x08f7
            boolean r0 = r1.A0C()     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x08f7
            java.io.File r0 = r1.A06()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r6 = "scoped root"
            if (r0 == 0) goto L_0x0954
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0b1d }
        L_0x08f4:
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
        L_0x08f7:
            java.lang.String r6 = "Has unexpected .nomedia"
            X.17r r7 = r2.A03     // Catch:{ Exception -> 0x0b1d }
            X.2hC r0 = r7.A08()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = r0.A01     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            X.2hC r0 = r7.A08()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = r0.A00     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            X.2hC r0 = r7.A08()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = r0.A0Q     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            X.2hC r0 = r7.A08()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = r0.A07     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            X.2hC r0 = r7.A08()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = r0.A03     // Catch:{ Exception -> 0x0b1d }
            X.C218617r.A07(r0, r3)     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            java.io.File r0 = r7.A0J()     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0957
            X.00H r0 = r1.A02     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r1 = A02(r0)     // Catch:{ Exception -> 0x0b1d }
            r0 = 0
            if (r1 == 0) goto L_0x0958
            goto L_0x0957
        L_0x0954:
            java.lang.String r0 = "null"
            goto L_0x08f4
        L_0x0957:
            r0 = 1
        L_0x0958:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0b1d }
            r0.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x0b1d }
        L_0x0968:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x097e
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x0b1d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0968
        L_0x097e:
            X.00H r0 = r2.A0l     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            X.1dS r0 = (X.C30141dS) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x099d
            java.lang.String r6 = "crossposting enabled"
            X.1mM r1 = r2.A0d     // Catch:{ Exception -> 0x0b1d }
            java.lang.Integer r0 = X.AnonymousClass00R.A0B     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r1.A06(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
        L_0x099d:
            X.00H r0 = r2.A0k     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = com.whatsapp.bridge.wfal.WfalManager.A00(r0, r3)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x09c3
            java.lang.String r6 = "wfl_state"
            X.00H r0 = r2.A0j     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            X.1le r1 = (X.C35101le) r1     // Catch:{ Exception -> 0x0b1d }
            X.1lh r0 = X.C35131lh.A02     // Catch:{ Exception -> 0x0b1d }
            int r0 = r1.A00(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
        L_0x09c3:
            if (r45 == 0) goto L_0x09ed
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0b1d }
            r7.<init>()     // Catch:{ Exception -> 0x0b1d }
            java.util.Iterator r6 = r45.iterator()     // Catch:{ Exception -> 0x0b1d }
        L_0x09ce:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x09e4
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x0b1d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0b1d }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x09ce
        L_0x09e4:
            java.lang.String r1 = "User context"
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
        L_0x09ed:
            r7 = r38
            if (r38 == 0) goto L_0x0a04
            X.0ve r6 = r2.A0U     // Catch:{ Exception -> 0x0b1d }
            r1 = 2057(0x809, float:2.882E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a04
            java.lang.String r1 = "entity id"
            java.lang.String r0 = r7.user     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
        L_0x0a04:
            java.lang.String r6 = "Is Companion"
            X.1VJ r0 = r2.A0N     // Catch:{ Exception -> 0x0b1d }
            int r1 = r0.A00()     // Catch:{ Exception -> 0x0b1d }
            r0 = 2
            if (r1 != r0) goto L_0x0a1d
            X.00H r0 = r2.A0g     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0b1d }
            X.2km r0 = (X.C58492km) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a23
        L_0x0a1d:
            boolean r0 = r28.A0N()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a24
        L_0x0a23:
            r3 = 1
        L_0x0a24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r6 = "Has Wear OS Companion"
            java.util.ArrayList r0 = r31.A06()     // Catch:{ Exception -> 0x0b1d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0b1d }
        L_0x0a35:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a56
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x0b1d }
            X.4Zh r0 = (X.C88344Zh) r0     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = r0.A0A     // Catch:{ Exception -> 0x0b1d }
            if (r1 == 0) goto L_0x0a35
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "wear os"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a35
            r0 = 1
            goto L_0x0a57
        L_0x0a56:
            r0 = 0
        L_0x0a57:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r6)     // Catch:{ Exception -> 0x0b1d }
            X.00H r3 = r2.A0e     // Catch:{ Exception -> 0x0b1d }
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x0b1d }
            X.1cN r0 = (X.C29491cN) r0     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A0F()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0a83
            java.lang.String r1 = "Number of Accounts"
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x0b1d }
            X.1cN r0 = (X.C29491cN) r0     // Catch:{ Exception -> 0x0b1d }
            X.0z4 r0 = r0.A0A     // Catch:{ Exception -> 0x0b1d }
            int r0 = r0.A0E()     // Catch:{ Exception -> 0x0b1d }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
        L_0x0a83:
            if (r53 == 0) goto L_0x0ab6
            X.0zA r1 = r2.A00     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r1.A07()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0acd
            java.lang.Object r0 = r1.A03()     // Catch:{ Exception -> 0x0b1d }
            X.1Ra r0 = (X.C26151Ra) r0     // Catch:{ Exception -> 0x0b1d }
            X.0ve r1 = r0.A00     // Catch:{ Exception -> 0x0b1d }
            r0 = 5626(0x15fa, float:7.884E-42)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0acd
            X.0ve r1 = r2.A0U     // Catch:{ Exception -> 0x0b1d }
            r0 = 9942(0x26d6, float:1.3932E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0aca
            java.lang.String r1 = "saga_v1_enabled"
        L_0x0aab:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0b1d }
            if (r0 != 0) goto L_0x0ab6
            java.lang.String r0 = "sagaKey"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x0ab6:
            java.lang.String r1 = "saga_copy"
            X.0ve r7 = r2.A0U     // Catch:{ Exception -> 0x0b1d }
            r0 = 7044(0x1b84, float:9.871E-42)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = X.C18020vd.A05(r6, r7, r0)     // Catch:{ Exception -> 0x0b1d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0ad0
        L_0x0aca:
            java.lang.String r1 = "saga"
            goto L_0x0aab
        L_0x0acd:
            r1 = r16
            goto L_0x0aab
        L_0x0ad0:
            r1 = r43
            if (r43 == 0) goto L_0x0ad9
            java.lang.String r0 = "endpoint"
            A01(r1, r5, r0)     // Catch:{ Exception -> 0x0b1d }
        L_0x0ad9:
            java.lang.String r1 = "InAppBugReporting"
            r0 = r33
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0b0c
            java.lang.String r3 = "Mobile Build Id"
            r0 = 670735092(0x27fa9af4, double:3.313871664E-315)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0b1d }
            A01(r0, r5, r3)     // Catch:{ Exception -> 0x0b1d }
            X.0zA r0 = r2.A01     // Catch:{ Exception -> 0x0b1d }
            boolean r0 = r0.A07()     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0b0c
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)     // Catch:{ Exception -> 0x0b1d }
            if (r0 == 0) goto L_0x0b0c
            X.0zA r0 = r2.A01     // Catch:{ Exception -> 0x0b1d }
            r0.A03()     // Catch:{ Exception -> 0x0b1d }
            java.lang.String r0 = "isMetaVerifiedSubscriptionActive"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0b1c
        L_0x0b0c:
            if (r51 == 0) goto L_0x0b3e
            r0 = r18
            java.lang.String r1 = r0.toString(r4)     // Catch:{ Exception -> 0x0b1d }
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x0b1d }
            goto L_0x0b3e
        L_0x0b1a:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0b1d }
        L_0x0b1c:
            throw r1     // Catch:{ Exception -> 0x0b1d }
        L_0x0b1d:
            r3 = move-exception
            goto L_0x0b37
        L_0x0b1f:
            r1 = move-exception
            if (r9 == 0) goto L_0x0b2a
            r9.close()     // Catch:{ all -> 0x0b26 }
            goto L_0x0b2a
        L_0x0b26:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0b2b }
        L_0x0b2a:
            throw r1     // Catch:{ all -> 0x0b2b }
        L_0x0b2b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0b30 }
            goto L_0x0b34
        L_0x0b30:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0b35 }
        L_0x0b34:
            throw r1     // Catch:{ Exception -> 0x0b35 }
        L_0x0b35:
            r3 = move-exception
            r4 = 1
        L_0x0b37:
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteException
            if (r0 == 0) goto L_0x0b43
            X.C17960vV.A0B(r3)
        L_0x0b3e:
            java.lang.String r0 = r17.toString()
            return r0
        L_0x0b43:
            java.lang.String r0 = "exception during email composition"
            com.whatsapp.util.Log.e(r0, r3)
            X.190 r2 = r2.A0K
            java.lang.String r1 = "Exception building debug info"
            java.lang.String r0 = r3.getMessage()
            r2.A0G(r1, r0, r4)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35551mQ.A04(android.content.Context, android.util.Pair, X.1EC, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, org.json.JSONObject, long, long, boolean, boolean, boolean):java.lang.String");
    }
}
