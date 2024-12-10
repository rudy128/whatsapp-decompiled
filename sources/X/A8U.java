package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A8U {
    public static final int A0J = 10;
    public static final int A0K = 5000;
    public static final long A0L = 64092211200L;
    public static final String A0M = "xpm-messages-exporter-";
    public int A00;
    public long A01;
    public long A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1NK A04;
    public final C196139uW A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1TK A09;
    public final C19830z4 A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass1Cd A0C;
    public final C18030ve A0D;
    public final AnonymousClass1T7 A0E;
    public final AnonymousClass1Nb A0F;
    public final C25141Na A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public static void A05(C188009gj r9, OutputStream outputStream) {
        try {
            JSONObject A15 = C17880vN.A15();
            JSONObject A152 = C17880vN.A15();
            A152.put("creation_date", r9.A00);
            A152.put("os", r9.A05);
            A152.put("os_version", r9.A06);
            A152.put("app_name", r9.A02);
            A152.put("app_version", r9.A03);
            A152.put("format_version", r9.A04);
            A15.put("header", A152);
            if (r9.A01 != null) {
                JSONObject A153 = C17880vN.A15();
                A15.put("messages", A153);
                A153.put("filename", r9.A01.A00);
                JSONArray A12 = AnonymousClass8BT.A12(r9.A01.A01, "format", A153);
                A153.put("chunks", A12);
                List<C184629bG> list = r9.A01.A02;
                if (list != null) {
                    for (C184629bG r4 : list) {
                        JSONObject A154 = C17880vN.A15();
                        A154.put("chunk_number", r4.A00);
                        A154.put("messages_count", r4.A01);
                        A12.put(A154);
                    }
                }
            }
            outputStream.write(A15.toString(4).getBytes(DefaultCrypto.UTF_8));
        } catch (IOException | JSONException e) {
            Log.e("Failed to write header information.", e);
            throw e;
        }
    }

    public Cursor A07(int i, long j, long j2, long j3) {
        String[] strArr = new String[4];
        C17880vN.A1V(strArr, 0, j);
        C17880vN.A1V(strArr, 1, j2);
        C17880vN.A1V(strArr, 2, j3);
        C17880vN.A1S(strArr, i, 3);
        C28781at A042 = this.A0C.get();
        try {
            Cursor A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A0I, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B(java.io.File r15) {
        /*
            r14 = this;
            r5 = 0
            if (r15 == 0) goto L_0x00e4
            boolean r0 = r15.exists()
            if (r0 == 0) goto L_0x00e4
            r8 = 1
            java.lang.String r6 = r15.getCanonicalPath()     // Catch:{ IOException -> 0x00cc }
            int r10 = A01(r6)
            r4 = 0
            java.lang.String r7 = ""
            r9 = 0
        L_0x0016:
            r0 = 10
            if (r9 >= r0) goto L_0x00a3
            X.9uW r0 = r14.A05     // Catch:{ IOException -> 0x00a0 }
            X.C18070vi.A0d(r6, r4)     // Catch:{ IOException -> 0x00a0 }
            X.1at r2 = X.C19961A0s.A00(r0)     // Catch:{ IOException -> 0x00a0 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0099 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.local_path = ?"
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ all -> 0x0099 }
            r1[r4] = r6     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_LOCAL_PATH_SINGLE"
            android.database.Cursor r3 = r11.A0A(r3, r0, r1)     // Catch:{ all -> 0x0099 }
            boolean r1 = r3.moveToFirst()     // Catch:{ all -> 0x0092 }
            r0 = 0
            if (r1 == 0) goto L_0x003f
            X.9gH r0 = X.C196729vY.A00(r3)     // Catch:{ all -> 0x0092 }
        L_0x003f:
            r3.close()     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x00a0 }
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            goto L_0x008f
        L_0x004a:
            int r0 = r10 % 100
            long r2 = (long) r0     // Catch:{ IOException -> 0x00a0 }
            int r0 = r10 / 100
            int r0 = r0 % 100
            long r0 = (long) r0     // Catch:{ IOException -> 0x00a0 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r12 = "Media/%d/%d/%d-%s"
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x00a0 }
            X.AnonymousClass3MX.A1S(r11, r4, r2)     // Catch:{ IOException -> 0x00a0 }
            X.AnonymousClass3MX.A1S(r11, r8, r0)     // Catch:{ IOException -> 0x00a0 }
            X.AnonymousClass3Ma.A1S(r11, r10)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r1 = r15.getName()     // Catch:{ IOException -> 0x00a0 }
            r0 = 3
            r11[r0] = r1     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r7 = java.lang.String.format(r13, r12, r11)     // Catch:{ IOException -> 0x00a0 }
            X.9uW r0 = r14.A05     // Catch:{ IOException -> 0x00a0 }
            X.C18070vi.A0d(r7, r8)     // Catch:{ IOException -> 0x00a0 }
            long r11 = r0.A02(r15, r7, r4)     // Catch:{ IOException -> 0x00a0 }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x00a0 }
            int r10 = A01(r0)     // Catch:{ IOException -> 0x00a0 }
            int r9 = r9 + 1
            goto L_0x0016
        L_0x008f:
            java.lang.String r7 = r0.A04     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00a4
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x00a0 }
            throw r0     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            r3 = move-exception
            r2 = 0
            goto L_0x00a8
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            r2 = r8
            goto L_0x00b8
        L_0x00a6:
            r3 = move-exception
            r2 = 1
        L_0x00a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/IOException during file registration. Local path: "
            X.C17900vP.A0h(r0, r6, r1, r3)
            X.190 r1 = r14.A08
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/IOException"
            X.AnonymousClass8BS.A17(r1, r0, r3, r8)
        L_0x00b8:
            if (r2 != 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/File is not registered. Local path: "
            X.C17900vP.A0e(r0, r6, r1)
            X.190 r1 = r14.A08
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/registerFile"
            r1.A0G(r0, r5, r4)
            return r5
        L_0x00cb:
            return r7
        L_0x00cc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/Failed to get canonical file path: "
            r1.append(r0)
            java.lang.String r0 = r15.getName()
            X.C17890vO.A19(r1, r0)
            X.190 r1 = r14.A08
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/getCanonicalPath"
            X.AnonymousClass8BS.A17(r1, r0, r2, r8)
        L_0x00e4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8U.A0B(java.io.File):java.lang.String");
    }

    public static /* synthetic */ int A00(Pair pair, Pair pair2) {
        return -((Long) pair.second).compareTo((Long) pair2.second);
    }

    public static C165298au A02(int i) {
        if (i == 0) {
            return null;
        }
        C23624Bmt A0N = C165298au.DEFAULT_INSTANCE.A0N();
        if ((i & 1) > 0) {
            C165298au r2 = (C165298au) C17880vN.A0G(A0N);
            r2.bitField0_ |= 1;
            r2.downloadImages_ = true;
        }
        if ((i & 2) > 0) {
            C165298au r22 = (C165298au) C17880vN.A0G(A0N);
            r22.bitField0_ |= 2;
            r22.downloadAudio_ = true;
        }
        if ((i & 4) > 0) {
            C165298au r23 = (C165298au) C17880vN.A0G(A0N);
            r23.bitField0_ |= 4;
            r23.downloadVideo_ = true;
        }
        if ((i & 8) > 0) {
            C165298au r24 = (C165298au) C17880vN.A0G(A0N);
            r24.bitField0_ |= 8;
            r24.downloadDocuments_ = true;
        }
        return (C165298au) A0N.A0C();
    }

    public static AnonymousClass8ZN A03(AnonymousClass732 r4) {
        C23624Bmt A0N = AnonymousClass8ZN.DEFAULT_INSTANCE.A0N();
        String obj = r4.A04.A00.toString();
        AnonymousClass8ZN r1 = (AnonymousClass8ZN) C17880vN.A0G(A0N);
        obj.getClass();
        r1.bitField0_ |= 1;
        r1.fbid_ = obj;
        String str = (String) r4.A05.A00;
        AnonymousClass8ZN r12 = (AnonymousClass8ZN) C17880vN.A0G(A0N);
        str.getClass();
        r12.bitField0_ |= 2;
        r12.password_ = str;
        return (AnonymousClass8ZN) A0N.A0C();
    }

    public static C165708bd A04(C42551yM r4) {
        C23624Bmt A0N = C165708bd.DEFAULT_INSTANCE.A0N();
        if (r4.A08() != null) {
            String A082 = r4.A08();
            C165708bd r1 = (C165708bd) C17880vN.A0G(A0N);
            A082.getClass();
            r1.bitField0_ |= 1;
            r1.messageVibrate_ = A082;
        }
        if (r4.A06() != null) {
            String A062 = r4.A06();
            C165708bd r12 = (C165708bd) C17880vN.A0G(A0N);
            A062.getClass();
            r12.bitField0_ |= 2;
            r12.messagePopup_ = A062;
        }
        if (r4.A05() != null) {
            String A052 = r4.A05();
            C165708bd r13 = (C165708bd) C17880vN.A0G(A0N);
            A052.getClass();
            r13.bitField0_ |= 4;
            r13.messageLight_ = A052;
        }
        boolean A0C2 = r4.A0C();
        C165708bd r14 = (C165708bd) C17880vN.A0G(A0N);
        r14.bitField0_ |= 8;
        r14.lowPriorityNotifications_ = A0C2;
        boolean z = r4.A02().A0R;
        C165708bd r15 = (C165708bd) C17880vN.A0G(A0N);
        r15.bitField0_ |= 16;
        r15.reactionsMuted_ = z;
        if (r4.A04() != null) {
            String A042 = r4.A04();
            C165708bd r16 = (C165708bd) C17880vN.A0G(A0N);
            A042.getClass();
            r16.bitField0_ |= 32;
            r16.callVibrate_ = A042;
        }
        return (C165708bd) A0N.A0C();
    }

    private boolean A06(AnonymousClass1BI r2) {
        return AnonymousClass000.A1X(this.A0B.A0A(r2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.9gj] */
    public C188009gj A08() {
        ? obj = new Object();
        obj.A00 = System.currentTimeMillis();
        obj.A05 = "android";
        obj.A06 = String.valueOf(Build.VERSION.SDK_INT);
        obj.A02 = "consumer";
        obj.A03 = "2.24.24.78";
        obj.A04 = "1.0";
        return obj;
    }

    public AnonymousClass8X2 A09(Cursor cursor, CancellationSignal cancellationSignal, Map map) {
        HashSet hashSet;
        int i;
        C195629te r14 = new C195629te(AnonymousClass00R.A01, 0, true, true, true, true, false, false, false);
        AnonymousClass1T7 r8 = this.A0E;
        ArrayList A13 = AnonymousClass000.A13();
        C25111Mx r1 = r8.A01;
        HashMap A0I2 = r1.A01.A0I();
        HashMap A082 = r1.A08();
        LinkedHashMap A132 = C17880vN.A13();
        HashSet A12 = C17880vN.A12();
        while (true) {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToNext()) {
                break;
            }
            AnonymousClass206 A012 = C17880vN.A0c(r8.A04).A01(cursor2);
            if (A012 != null) {
                r8.A05(A012, A12);
                AnonymousClass1Q8 r0 = r8.A02;
                AnonymousClass205 r11 = A012.A0v;
                r0.A01(r11);
                A0K(A012);
                if (A012.A0I < 0) {
                    break;
                }
                AnonymousClass1BI r12 = r11.A00;
                if (r12 != null && !(A012 instanceof AnonymousClass22M) && !(A012 instanceof C439821r)) {
                    AnonymousClass1T7.A00(A012);
                    C45662Ay r02 = (C45662Ay) A132.get(r12);
                    if (r02 == null) {
                        r02 = r8.A01(r12, A0I2, A082);
                        A132.put(r12, r02);
                    }
                    if (!r8.A06(r14, r02, A012)) {
                        if (A012 instanceof C436420i) {
                            hashSet = r8.A05;
                            i = ((C436420i) A012).A00;
                        } else {
                            hashSet = r8.A06;
                            i = A012.A0u;
                        }
                        C17890vO.A1D(hashSet, i);
                    }
                }
            }
        }
        A13.addAll(r8.A02(A12));
        if (A132.size() == 0) {
            return null;
        }
        AnonymousClass8X2 r5 = (AnonymousClass8X2) C166148cQ.DEFAULT_INSTANCE.A0N();
        r5.A0K(AnonymousClass9KV.FULL);
        Iterator A15 = AnonymousClass000.A15(A132);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            cancellationSignal.throwIfCanceled();
            AnonymousClass1BI r3 = (AnonymousClass1BI) A16.getKey();
            C45662Ay r2 = (C45662Ay) A16.getValue();
            if (!A06(AnonymousClass3MX.A0l(((C166298cf) r2.A00).id_))) {
                if (r3 instanceof AnonymousClass1E9) {
                    this.A0E.A04((AnonymousClass1E9) r3, r2);
                }
                A0H(r3, r2, map);
                r5.A0I(r2);
            }
        }
        return r5;
    }

    public AnonymousClass8UK A0A(AnonymousClass1BI r6, boolean z) {
        String str;
        int i;
        C85344Na Bbh = this.A0G.Bbh(r6, z);
        AnonymousClass8UK r3 = null;
        if (Bbh != null && Bbh.A01.equals("USER_PROVIDED") && (str = Bbh.A02) != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                str = parse.getPath();
            }
            String A0B2 = A0B(C108945cZ.A17(str));
            if (A0B2 != null) {
                r3 = (AnonymousClass8UK) AnonymousClass8ZQ.DEFAULT_INSTANCE.A0N();
                AnonymousClass8ZQ r1 = (AnonymousClass8ZQ) C17880vN.A0G(r3);
                r1.bitField0_ |= 1;
                r1.filename_ = A0B2;
                Integer num = Bbh.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 100;
                }
                AnonymousClass8ZQ r12 = (AnonymousClass8ZQ) C17880vN.A0G(r3);
                r12.bitField0_ |= 2;
                r12.opacity_ = i;
            }
        }
        return r3;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.9dX] */
    public void A0F(CancellationSignal cancellationSignal, B5L b5l, File file) {
        ZipOutputStream zipOutputStream;
        AnonymousClass1Ez r8 = new AnonymousClass1Ez();
        r8.A04();
        this.A00 = 0;
        C20736AWr.A00(C17880vN.A0V(this.A06), 0, 9);
        C188009gj A082 = A08();
        try {
            FileOutputStream A19 = C108945cZ.A19(file);
            try {
                zipOutputStream = new ZipOutputStream(A19);
                zipOutputStream.putNextEntry(new ZipEntry("messages.bin"));
                file.getParentFile();
                List A0C2 = A0C(cancellationSignal, b5l, zipOutputStream);
                zipOutputStream.closeEntry();
                ? obj = new Object();
                obj.A00 = "messages.bin";
                obj.A01 = "protobuf";
                obj.A02 = A0C2;
                A082.A01 = obj;
                zipOutputStream.putNextEntry(new ZipEntry("header.json"));
                A05(A082, zipOutputStream);
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                A19.close();
                long A012 = r8.A01();
                Locale locale = Locale.US;
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass3MX.A1S(A1a, 0, TimeUnit.MILLISECONDS.toHours(A012));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AnonymousClass3MX.A1S(A1a, 1, timeUnit.toMinutes(A012) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(A012)));
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                C17890vO.A1N(A1a, timeUnit2.toSeconds(A012) - TimeUnit.MINUTES.toSeconds(timeUnit2.toMinutes(A012)));
                C17900vP.A0f("exportMessages - messages exporting is completed, consumed time: ", String.format(locale, "%02d:%02d:%02d", A1a), AnonymousClass000.A10());
                return;
            } catch (Throwable th) {
                A19.close();
                throw th;
            }
            throw th;
        } catch (JSONException e) {
            C20736AWr.A00(C17880vN.A0V(this.A06), 1, 10);
            Log.e("Failed to write metadata; data export is not completed.");
            file.delete();
            throw new IOException("Failed to write metadata; data export is not completed.", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A0G(CancellationSignal cancellationSignal, File file) {
        A0F(cancellationSignal, new AW5(this), file);
    }

    public void A0I(AnonymousClass8UD r4) {
        C166198cV A0N;
        int i;
        if (!this.A09.A05() || ((C59992nD) this.A0I.get()).A00() == null) {
            A0N = AnonymousClass8BS.A0N(r4);
            int i2 = C166198cV.AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER;
            A0N.chatLockSettings_ = null;
            i = A0N.bitField0_ & -262145;
        } else {
            C163858Wp r1 = (C163858Wp) C164288Yg.DEFAULT_INSTANCE.A0N();
            r1.A0H(this.A09.A04());
            r1.A0G(((C59992nD) this.A0I.get()).A00());
            C164288Yg r12 = (C164288Yg) r1.A0C();
            A0N = AnonymousClass8BS.A0N(r4);
            int i3 = C166198cV.AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER;
            r12.getClass();
            A0N.chatLockSettings_ = r12;
            i = A0N.bitField0_ | 262144;
        }
        A0N.bitField0_ = i;
    }

    public void A0J(AnonymousClass8X2 r6) {
        AnonymousClass9KK A002;
        AnonymousClass8UD r4 = (AnonymousClass8UD) C166198cV.DEFAULT_INSTANCE.A0N();
        AnonymousClass8UK A0A2 = A0A((AnonymousClass1BI) null, false);
        if (A0A2 != null) {
            C166198cV A0N = AnonymousClass8BS.A0N(r4);
            AnonymousClass8ZQ r0 = (AnonymousClass8ZQ) A0A2.A0C();
            r0.getClass();
            A0N.lightThemeWallpaper_ = r0;
            A0N.bitField0_ |= 1;
        }
        AnonymousClass8UK A0A3 = A0A((AnonymousClass1BI) null, true);
        if (A0A3 != null) {
            C166198cV A0N2 = AnonymousClass8BS.A0N(r4);
            AnonymousClass8ZQ r02 = (AnonymousClass8ZQ) A0A3.A0C();
            r02.getClass();
            A0N2.darkThemeWallpaper_ = r02;
            A0N2.bitField0_ |= 4;
        }
        int i = this.A0F.A0W().A01;
        if (i == 0) {
            A002 = AnonymousClass9KK.DEFAULT;
        } else {
            A002 = AnonymousClass9KK.A00(i);
        }
        C166198cV A0N3 = AnonymousClass8BS.A0N(r4);
        A0N3.mediaVisibility_ = A002.value;
        A0N3.bitField0_ |= 2;
        C165298au A022 = A02(C17890vO.A0B(this.A0A).getInt("autodownload_wifi_mask", 15));
        if (A022 != null) {
            C166198cV A0N4 = AnonymousClass8BS.A0N(r4);
            A0N4.autoDownloadWiFi_ = A022;
            A0N4.bitField0_ |= 8;
        }
        C165298au A023 = A02(this.A0A.A04());
        if (A023 != null) {
            C166198cV A0N5 = AnonymousClass8BS.A0N(r4);
            A0N5.autoDownloadCellular_ = A023;
            A0N5.bitField0_ |= 16;
        }
        C165298au A024 = A02(C17890vO.A00(C17890vO.A0B(this.A0A), "autodownload_roaming_mask"));
        if (A024 != null) {
            C166198cV A0N6 = AnonymousClass8BS.A0N(r4);
            A0N6.autoDownloadRoaming_ = A024;
            A0N6.bitField0_ |= 32;
        }
        this.A0F.A0W();
        boolean z = !this.A0F.A0W().A0C();
        C166198cV A0N7 = AnonymousClass8BS.A0N(r4);
        A0N7.bitField0_ |= 64;
        A0N7.showIndividualNotificationsPreview_ = z;
        C165708bd A042 = A04(this.A0F.A0W());
        C166198cV A0N8 = AnonymousClass8BS.A0N(r4);
        A042.getClass();
        A0N8.individualNotificationSettings_ = A042;
        A0N8.bitField0_ |= 65536;
        this.A0F.A0V();
        boolean A0C2 = true ^ this.A0F.A0V().A0C();
        C166198cV A0N9 = AnonymousClass8BS.A0N(r4);
        A0N9.bitField0_ |= 128;
        A0N9.showGroupNotificationsPreview_ = A0C2;
        C165708bd A043 = A04(this.A0F.A0V());
        C166198cV A0N10 = AnonymousClass8BS.A0N(r4);
        A043.getClass();
        A0N10.groupNotificationSettings_ = A043;
        A0N10.bitField0_ |= A7Y.A0F;
        AnonymousClass732 A003 = ((C136796uQ) this.A0H.get()).A00();
        if (!(A003 == null || A003.A04.A00 == null || A003.A05.A00 == null)) {
            AnonymousClass8ZN A032 = A03(A003);
            C166198cV A0N11 = AnonymousClass8BS.A0N(r4);
            A032.getClass();
            A0N11.avatarUserSettings_ = A032;
            A0N11.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        int A012 = C20099A7c.A01(C17890vO.A0B(this.A0A).getString("interface_font_size", "0"), 0);
        C166198cV A0N12 = AnonymousClass8BS.A0N(r4);
        A0N12.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A0N12.fontSize_ = A012;
        boolean A2M = this.A0A.A2M();
        C166198cV A0N13 = AnonymousClass8BS.A0N(r4);
        A0N13.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A0N13.securityNotifications_ = A2M;
        boolean A2R = this.A0A.A2R();
        C166198cV A0N14 = AnonymousClass8BS.A0N(r4);
        A0N14.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        A0N14.autoUnarchiveChats_ = A2R;
        int A0L2 = this.A0A.A0L();
        C166198cV A0N15 = AnonymousClass8BS.A0N(r4);
        A0N15.bitField0_ |= 16384;
        A0N15.videoQualityMode_ = A0L2;
        int A0G2 = this.A0A.A0G();
        C166198cV A0N16 = AnonymousClass8BS.A0N(r4);
        A0N16.bitField0_ |= 32768;
        A0N16.photoQualityMode_ = A0G2;
        A0I(r4);
        C166148cQ r2 = (C166148cQ) C17880vN.A0G(r6);
        C166198cV r1 = (C166198cV) r4.A0C();
        int i2 = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.getClass();
        r2.globalSettings_ = r1;
        r2.bitField0_ |= 8;
    }

    public void A0K(AnonymousClass206 r7) {
        C62572rc r1;
        String A0B2;
        long j = this.A02 + 1;
        this.A02 = j;
        int i = (int) ((((double) j) * 100.0d) / ((double) this.A01));
        if (this.A00 != i) {
            this.A00 = i;
            C20736AWr.A00(C17880vN.A0V(this.A06), i, 9);
        }
        if (r7 instanceof AnonymousClass21V) {
            AnonymousClass1BI r12 = r7.A0v.A00;
            if (!C22971Dz.A0a(r12) && !C22971Dz.A0b(r12) && (r1 = ((AnonymousClass21V) r7).A02) != null && (A0B2 = A0B(r1.A0G)) != null) {
                r1.A0G = C108945cZ.A17(A0B2);
            }
        }
    }

    public A8U(AnonymousClass11P r2, C18030ve r3, AnonymousClass190 r4, AnonymousClass1CJ r5, AnonymousClass1NK r6, AnonymousClass1T7 r7, AnonymousClass1Nb r8, AnonymousClass1Cd r9, C19830z4 r10, C196139uW r11, C25141Na r12, AnonymousClass1TK r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        this.A03 = r2;
        this.A0D = r3;
        this.A08 = r4;
        this.A0B = r5;
        this.A04 = r6;
        this.A0E = r7;
        this.A0F = r8;
        this.A0A = r10;
        this.A0C = r9;
        this.A05 = r11;
        this.A0G = r12;
        this.A09 = r13;
        this.A06 = r14;
        this.A0H = r15;
        this.A0I = r16;
        this.A07 = r17;
    }

    public static int A01(String str) {
        return str.hashCode() & Integer.MAX_VALUE;
    }

    public List A0C(CancellationSignal cancellationSignal, B5L b5l, OutputStream outputStream) {
        ArrayList A13 = AnonymousClass000.A13();
        long j = 1;
        long A012 = this.A04.A01() + 1;
        this.A01 = (long) this.A04.A00(1, A012);
        this.A02 = 0;
        Map A0D2 = A0D();
        int i = 0;
        while (j < A012) {
            cancellationSignal.throwIfCanceled();
            C184629bG r3 = new C184629bG();
            Cursor A072 = ((AW5) b5l).A00.A07(5000, j, A012, System.currentTimeMillis());
            if (A072 == null) {
                break;
            }
            try {
                r3.A01 = (long) A072.getCount();
                if (A072.moveToLast()) {
                    j = C17890vO.A06(A072, "_id");
                    A072.moveToFirst();
                    A072.move(-1);
                    AnonymousClass8X2 A092 = A09(A072, cancellationSignal, A0D2);
                    if (A092 != null) {
                        A092.A0G(i);
                        if (i == 0) {
                            A0J(A092);
                        }
                        ((C166148cQ) A092.A0C()).A0L(outputStream);
                        this.A07.get();
                        C24521Kq r0 = C24521Kq.$redex_init_class;
                        r3.A00 = i;
                        A13.add(r3);
                        i++;
                        A072.close();
                    }
                }
                A072.close();
                return A13;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        return A13;
    }

    public Map A0D() {
        long j;
        HashMap A11 = C17880vN.A11();
        Set A0f = this.A0F.A0f();
        if (!(A0f == null || A0f.size() == 0)) {
            ArrayList A0z = C17880vN.A0z(A0f.size());
            Iterator it = A0f.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                C42551yM A0a = this.A0F.A0a(A0Q);
                if (A0a.A0S) {
                    j = A0a.A07;
                } else {
                    j = 0;
                }
                C108965cb.A1Q(A0Q, Long.valueOf(j), A0z);
            }
            C21486Akr.A01(35, A0z);
            int i = 0;
            while (i < A0z.size()) {
                i++;
                C17890vO.A0z(((Pair) A0z.get(i)).first, A11, i);
            }
        }
        return A11;
    }

    public void A0E(long j) {
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r2 != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.AnonymousClass1BI r8, X.C45662Ay r9, java.util.Map r10) {
        /*
            r7 = this;
            java.lang.Number r0 = X.C108945cZ.A1E(r8, r10)
            if (r0 == 0) goto L_0x0019
            int r3 = r0.intValue()
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r9)
            int r0 = X.C166298cf.ARCHIVED_FIELD_NUMBER
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.pinned_ = r3
        L_0x0019:
            X.1Nb r0 = r7.A0F
            X.1yM r6 = r0.A0a(r8)
            long r2 = r6.A00()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            long r2 = X.C17880vN.A04(r2)
        L_0x002d:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
        L_0x0031:
            X.8cf r4 = X.AnonymousClass8BT.A0Y(r9)
            int r0 = X.C166298cf.ARCHIVED_FIELD_NUMBER
            int r1 = r4.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.muteEndTime_ = r2
        L_0x0040:
            int r1 = r6.A01
            r3 = 1
            if (r1 != r3) goto L_0x0092
            X.9KK r1 = X.AnonymousClass9KK.OFF
        L_0x0047:
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r9)
            int r0 = X.C166298cf.ARCHIVED_FIELD_NUMBER
            int r0 = r1.value
            r2.mediaVisibility_ = r0
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0058:
            r0 = 0
            X.8UK r0 = r7.A0A(r8, r0)
            if (r0 != 0) goto L_0x0065
            X.8UK r0 = r7.A0A(r8, r3)
            if (r0 == 0) goto L_0x007d
        L_0x0065:
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r9)
            X.Bm6 r1 = r0.A0C()
            X.8ZQ r1 = (X.AnonymousClass8ZQ) r1
            int r0 = X.C166298cf.ARCHIVED_FIELD_NUMBER
            r1.getClass()
            r2.wallpaper_ = r1
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x007d:
            X.1CJ r0 = r7.A0B
            boolean r2 = r0.A0S(r8)
            X.8cf r1 = X.AnonymousClass8BT.A0Y(r9)
            int r0 = X.C166298cf.ARCHIVED_FIELD_NUMBER
            int r0 = r1.bitField1_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField1_ = r0
            r1.locked_ = r2
            return
        L_0x0092:
            r0 = 2
            if (r1 != r0) goto L_0x0058
            X.9KK r1 = X.AnonymousClass9KK.ON
            goto L_0x0047
        L_0x0098:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            r2 = 64092211200(0xeec318800, double:3.166575972E-313)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8U.A0H(X.1BI, X.2Ay, java.util.Map):void");
    }
}
