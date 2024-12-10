package com.whatsapp.util;

import X.AnonymousClass00N;
import X.AnonymousClass11K;
import X.AnonymousClass190;
import X.C17900vP;
import X.C17930vS;
import X.C18160vr;
import X.C18170vs;
import X.C60412nz;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;

public class Log {
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);
    public static final C18160vr LOGGER_THREAD;
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static FileChannel channel = null;
    public static final Object compressFileLock = new Object();
    public static AnonymousClass11K connectivityInfoProvider = null;
    public static int level = 5;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static File logFile;
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static File logTempFile;
    public static final Object tempFileLock = new Object();
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);

    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            C18160vr r4 = LOGGER_THREAD;
            if (Thread.currentThread() == r4) {
                int size = r4.A01.size();
                for (int i = 0; i < size; i++) {
                    C18160vr.A00(r4);
                }
            } else {
                FutureTask futureTask = new FutureTask(C18160vr.A06, (Object) null);
                C18160vr.A01(r4, futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            ReentrantLock reentrantLock = writeFileLock;
            reentrantLock.lock();
            FileChannel fileChannel = channel;
            if (fileChannel != null && fileChannel.isOpen()) {
                channel.force(true);
            }
            reentrantLock.unlock();
            blockingLog(5, "log/flush/end");
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("log/flush/failed");
            sb.append("; exception=");
            sb.append(e);
            String obj = sb.toString();
            String stackTraceString = getStackTraceString(e);
            StringBuilder sb2 = new StringBuilder(obj.length() + 1 + stackTraceString.length());
            sb2.append(obj);
            sb2.append("\n");
            sb2.append(stackTraceString);
            String adorn = adorn("LL_E ", sb2);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        } catch (Throwable th) {
            writeFileLock.unlock();
            throw th;
        }
    }

    public static void setLogLevel() {
        level = 3;
        StringBuilder sb = new StringBuilder();
        sb.append("==== logfile version=");
        sb.append("2.24.24.78");
        sb.append(" level=");
        sb.append(3);
        sb.append("====");
        log("LL_I ", sb.toString());
    }

    static {
        C18160vr r0 = new C18160vr();
        r0.start();
        LOGGER_THREAD = r0;
    }

    public static void a(boolean z) {
        if (!z) {
            log("LL_A ", "Assertion Failed");
        }
    }

    public static void blockingLog(int i, String str) {
        if (i <= level) {
            String adorn = adorn(getLogPrefix(i), new StringBuilder(str));
            logAdorned(adorn, true);
            if (level == 5) {
                logToLogcat(i, adorn);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0100, code lost:
        if (r3.exists() == false) goto L_0x0113;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compress() {
        /*
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.Object r15 = compressFileLock
            monitor-enter(r15)
            java.lang.Object r14 = tempFileLock     // Catch:{ all -> 0x0143 }
            monitor-enter(r14)     // Catch:{ all -> 0x0143 }
            r13 = 0
            java.io.File r0 = logFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r6 = logTempFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException | SecurityException -> 0x0139 }
            r5.<init>()     // Catch:{ IOException | SecurityException -> 0x0139 }
            int r4 = A00(r0, r6)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r3 = r0.getParent()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r2 = 1
        L_0x001e:
            if (r2 > r4) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r6.getName()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.append(r2)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.<init>(r3, r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0046
            r5.add(r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0049:
            java.util.Iterator r12 = r5.iterator()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x004d:
            boolean r0 = r12.hasNext()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x013d
            java.lang.Object r2 = r12.next()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r5 = logFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r2.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x011a
            java.util.Date r1 = new java.util.Date     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = ".gz"
            java.lang.String r3 = X.C60412nz.A00(r5, r0, r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r0 = r5.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0139 }
            r4.<init>(r0, r3)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r5 = r5.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.append(r3)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0139 }
            r3.<init>(r5, r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            r0 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            r7.<init>(r3, r0)     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00f2 }
            r8.<init>(r7)     // Catch:{ all -> 0x00f2 }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x00e8 }
            long r9 = r4.length()     // Catch:{ all -> 0x00e8 }
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00be
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00e8 }
            r1.<init>(r4)     // Catch:{ all -> 0x00e8 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e8 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e8 }
            r5.<init>(r0)     // Catch:{ all -> 0x00e8 }
            appendStream(r8, r5, r11)     // Catch:{ all -> 0x00de }
            r5.close()     // Catch:{ all -> 0x00e8 }
        L_0x00be:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e8 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e8 }
            r5.<init>(r0)     // Catch:{ all -> 0x00e8 }
            appendStream(r8, r5, r11)     // Catch:{ all -> 0x00de }
            r5.close()     // Catch:{ all -> 0x00e8 }
            r8.close()     // Catch:{ all -> 0x00f2 }
            r3.renameTo(r4)     // Catch:{ all -> 0x00f2 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0113
            goto L_0x0102
        L_0x00de:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00e7:
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00f1
        L_0x00ed:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00f2 }
        L_0x00f1:
            throw r1     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
        L_0x00fb:
            throw r1     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
        L_0x00fc:
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0113
        L_0x0102:
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 != 0) goto L_0x0113
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0113:
            boolean r0 = r4.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r13 = r4
            if (r0 != 0) goto L_0x011b
        L_0x011a:
            r13 = 0
        L_0x011b:
            r2.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
            goto L_0x004d
        L_0x0120:
            r2 = move-exception
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 != 0) goto L_0x0138
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0138:
            throw r2     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0140 }
        L_0x013d:
            monitor-exit(r14)     // Catch:{ all -> 0x0140 }
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            return r13
        L_0x0140:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void d(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", getStackTraceString(th));
        }
    }

    public static void doLogToFile(String str) {
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        sb.append(instance.get(1));
        sb.append('-');
        if (instance.get(2) < 9) {
            sb.append('0');
        }
        sb.append(instance.get(2) + 1);
        sb.append('-');
        if (instance.get(5) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(5));
        sb.append(' ');
        if (instance.get(11) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(11));
        sb.append(':');
        if (instance.get(12) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(12));
        sb.append(':');
        if (instance.get(13) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(13));
        sb.append('.');
        if (instance.get(14) < 10) {
            sb.append("00");
        } else if (instance.get(14) < 100) {
            sb.append('0');
        }
        sb.append(instance.get(14));
        sb.append(' ');
        ReentrantLock reentrantLock = writeFileLock;
        reentrantLock.lock();
        try {
            if (initialize()) {
                FileChannel fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.position(fileChannel.size());
                    FileChannel fileChannel2 = channel;
                    CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                    ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                    encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, sb);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, str);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, "\n");
                } else {
                    throw new NullPointerException();
                }
            }
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IOException on ");
            sb2.append(str);
            android.util.Log.e("WhatsApp", sb2.toString(), e);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        reentrantLock.unlock();
    }

    public static void doLogToLogcat(int i, String str) {
        if (i == 0 || i == 5) {
            android.util.Log.v("WhatsApp", str);
        } else if (i == 4) {
            android.util.Log.d("WhatsApp", str);
        } else if (i == 3) {
            android.util.Log.i("WhatsApp", str);
        } else if (i == 2) {
            android.util.Log.w("WhatsApp", str);
        } else {
            android.util.Log.e("WhatsApp", str);
        }
    }

    public static void e(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", stackTraceString));
        } else {
            log("LL_E ", stackTraceString);
        }
    }

    public static List getLatestLogs(int i) {
        File file = logFile;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String name = file.getName();
        String A0A = C17900vP.A0A(name.substring(name.indexOf(46)), ".gz");
        String name2 = file.getName();
        String substring = C60412nz.A01(name2, new Date()).substring(0, name2.indexOf(46) + 1);
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name3 = file2.getName();
                if (name3.startsWith(substring) && name3.endsWith(A0A)) {
                    int length = substring.length();
                    try {
                        if ((date.getTime() - simpleDateFormat.parse(name3.substring(length, pattern.length() + length)).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                            arrayList.add(file2);
                        }
                    } catch (ParseException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getLogPrefix(int i) {
        if (i == 0) {
            return "LL_A ";
        }
        if (i == 1) {
            return "LL_E ";
        }
        if (i == 2) {
            return "LL_W ";
        }
        if (i == 3) {
            return "LL_I ";
        }
        if (i != 4) {
            return "LL_V ";
        }
        return "LL_D ";
    }

    public static String getStackTraceInfo(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String A01 = C18170vs.A01();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("### begin stack trace ");
        sb2.append(A01);
        sb2.append("\n");
        sb.append(sb2.toString());
        sb.append(getStackTraceInfo(th));
        sb.append("### end stack trace");
        return sb.toString();
    }

    public static void i(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(3, log("LL_I ", stackTraceString));
        } else {
            log("LL_I ", stackTraceString);
        }
    }

    public static void log(int i, String str) {
        if (i <= level) {
            String log = log(getLogPrefix(i), str);
            if (level == 5) {
                logToLogcat(i, log);
            }
        }
    }

    public static String logAdorned(String str, boolean z) {
        C18160vr r0;
        if (z || Thread.currentThread() == (r0 = LOGGER_THREAD)) {
            doLogToFile(str);
            return str;
        }
        C18160vr.A01(r0, str);
        return str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0056 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0056=Splitter:B:27:0x0056, B:20:0x004c=Splitter:B:20:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean rotate() {
        /*
            java.lang.Object r6 = tempFileLock
            monitor-enter(r6)
            java.util.concurrent.locks.ReentrantLock r5 = writeFileLock     // Catch:{ all -> 0x006c }
            r5.lock()     // Catch:{ all -> 0x006c }
            boolean r0 = initialize()     // Catch:{ all -> 0x0067 }
            r2 = 0
            if (r0 == 0) goto L_0x0062
            java.nio.channels.FileChannel r0 = channel     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0059
            r1 = 0
            r0.close()     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            channel = r1     // Catch:{ all -> 0x0067 }
            java.io.File r4 = logFile     // Catch:{ all -> 0x0067 }
            java.io.File r3 = logTempFile     // Catch:{ all -> 0x0067 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x004b
            int r2 = A00(r4, r3)     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0067 }
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            int r0 = r2 + 1
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0067 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0067 }
            r0.<init>(r1)     // Catch:{ all -> 0x0067 }
            boolean r0 = r4.renameTo(r0)     // Catch:{ SecurityException -> 0x004b }
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            initialize()     // Catch:{ all -> 0x0067 }
            r5.unlock()     // Catch:{ all -> 0x006c }
            monitor-exit(r6)     // Catch:{ all -> 0x006c }
            return r0
        L_0x0054:
            r0 = move-exception
            goto L_0x005f
        L_0x0056:
            channel = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0062
        L_0x0059:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
            goto L_0x0061
        L_0x005f:
            channel = r1     // Catch:{ all -> 0x0067 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0062:
            r5.unlock()     // Catch:{ all -> 0x006c }
            monitor-exit(r6)     // Catch:{ all -> 0x006c }
            return r2
        L_0x0067:
            r0 = move-exception
            r5.unlock()     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.rotate():boolean");
    }

    public static void setCrashLogs(AnonymousClass190 r2) {
        C18160vr r1 = LOGGER_THREAD;
        synchronized (r1) {
            r1.A00 = r2;
        }
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(2, log("LL_W ", stackTraceString));
        } else {
            log("LL_W ", stackTraceString);
        }
    }

    public static int A00(File file, File file2) {
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File name2 : listFiles) {
            String name3 = name2.getName();
            if (name3.startsWith(name) && length2 < (length = name3.length())) {
                try {
                    int parseInt = Integer.parseInt(name3.substring(length2, length));
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return i;
    }

    public static String adorn(String str, StringBuilder sb) {
        String str2;
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        AnonymousClass11K r0 = connectivityInfoProvider;
        if (r0 != null) {
            str2 = (String) r0.A00.get();
        } else {
            str2 = "D";
        }
        sb3.append(str2);
        sb3.append(" ");
        String obj = sb3.toString();
        if (level < 5) {
            int length = obj.length() + 20 + name.length() + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("]");
                sb2.append(" ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(length + sb.length());
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("]");
                sb2.append(" ");
                sb2.append(sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str3 = "";
        String str4 = str3;
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    str3 = stackTraceElement.getFileName();
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                str4 = String.valueOf(stackTraceElement.getLineNumber());
                str3 = "(null)";
            } else if (i == 5) {
                str3 = stackTraceElement.getFileName();
                str4 = "native";
            }
            i++;
        }
        StringBuilder sb4 = new StringBuilder(obj.length() + 1 + 20 + 1 + name.length() + 1 + str3.length() + 1 + str4.length() + 1 + sb.length());
        sb4.append(obj);
        sb4.append('[');
        sb4.append(id);
        sb4.append(':');
        sb4.append(name);
        sb4.append(']');
        sb4.append(str3);
        sb4.append(':');
        sb4.append(str4);
        sb4.append(' ');
        sb4.append(sb);
        return sb4.toString();
    }

    public static void appendStream(GZIPOutputStream gZIPOutputStream, BufferedInputStream bufferedInputStream, byte[] bArr) {
        int read = bufferedInputStream.read(bArr, 0, 32768);
        while (read != -1) {
            gZIPOutputStream.write(bArr, 0, read);
            read = bufferedInputStream.read(bArr, 0, 32768);
        }
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    public static void initialize(C17930vS r1, boolean z) {
        File file = new File(r1.A01(), "Logs");
        if (!AnonymousClass00N.A00((Object) null, file, logDirRef)) {
            throw new IllegalStateException("log application context already assigned");
        }
        logFile = new File(file, "whatsapp.log");
        logTempFile = new File(file, "whatsapp.tmp");
        logFileLatch.countDown();
    }

    public static void logToLogcat(int i, String str) {
        int length = str.length();
        if (length > 4000) {
            StringBuilder sb = new StringBuilder(4006);
            int i2 = 0;
            while (length - i2 > 4000) {
                if (i2 > 0) {
                    sb.append("...");
                }
                sb.append(str.substring(i2, (i2 + 4000) - 3));
                sb.append("...");
                doLogToLogcat(i, sb.toString());
                i2 += 3997;
                sb.setLength(0);
            }
            StringBuilder sb2 = new StringBuilder(4006);
            if (i2 > 0) {
                sb2.append("...");
            }
            sb2.append(str.substring(i2));
            str = sb2.toString();
        }
        doLogToLogcat(i, str);
    }

    public static void setConnectivityInfoProvider(AnonymousClass11K r0) {
        connectivityInfoProvider = r0;
    }

    public static String stackTraceStartPhrase() {
        String A01 = C18170vs.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("### begin stack trace ");
        sb.append(A01);
        sb.append("\n");
        return sb.toString();
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", obj, getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", obj, getStackTraceString(th));
        }
    }

    public static void e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", obj, stackTraceString));
        } else {
            log("LL_E ", obj, stackTraceString);
        }
    }

    public static void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(3, log("LL_I ", obj, stackTraceString));
        } else {
            log("LL_I ", obj, stackTraceString);
        }
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str3.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; exception=");
            sb.append(th);
            logToLogcat(5, log("LL_V ", sb.toString(), getStackTraceString(th)));
        }
    }

    public static void w(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(2, log("LL_W ", obj, stackTraceString));
        } else {
            log("LL_W ", obj, stackTraceString);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean initialize() {
        /*
            java.nio.channels.FileChannel r0 = channel
            r3 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x000c
            return r3
        L_0x000c:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x002a
            java.util.concurrent.CountDownLatch r0 = logFileLatch
            long r4 = r0.getCount()
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002a
            java.lang.String r1 = "If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand."
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x002a:
            r6 = 0
            java.util.concurrent.CountDownLatch r0 = logFileLatch     // Catch:{ InterruptedException -> 0x00fe }
            r0.await()     // Catch:{ InterruptedException -> 0x00fe }
            java.util.concurrent.atomic.AtomicReference r0 = logDirRef
            java.lang.Object r1 = r0.get()
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x0046
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            java.io.File r1 = logFile     // Catch:{  }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{  }
            r0.<init>(r1, r3)     // Catch:{  }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{  }
            channel = r0     // Catch:{  }
            java.io.PrintStream r5 = java.lang.System.err
            java.io.PrintStream r0 = ORIGINAL_SYSTEM_ERR
            r4 = 0
            if (r5 == r0) goto L_0x005c
            r4 = 1
        L_0x005c:
            X.0w4 r2 = new X.0w4
            r2.<init>(r0)
            java.nio.channels.FileChannel r0 = channel
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r0)
            X.0w5 r1 = new X.0w5
            r1.<init>(r2, r0)
            java.io.PrintStream r0 = new java.io.PrintStream
            r0.<init>(r1, r3)
            java.lang.System.setErr(r0)
            if (r4 == 0) goto L_0x00f7
            r5.close()
        L_0x0079:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 15
            int r5 = r1.get(r0)
            r0 = 16
            int r0 = r1.get(r0)
            int r5 = r5 + r0
            r0 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 / r0
            int r1 = r5 / 60
            java.util.Locale r4 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 43
            if (r1 >= 0) goto L_0x009b
            r0 = 45
        L_0x009b:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r2[r6] = r0
            int r0 = java.lang.Math.abs(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            int r0 = r5 % 60
            int r0 = java.lang.Math.abs(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "%c%02d%02d"
            java.lang.String r2 = java.lang.String.format(r4, r0, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "==== logfile level="
            r1.append(r0)
            int r0 = level
            r1.append(r0)
            java.lang.String r0 = " tz="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ===="
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "LL_I "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r0 = adorn(r1, r0)
            logAdorned(r0, r3)
            java.nio.channels.FileChannel r0 = channel
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x00fc
            return r3
        L_0x00f7:
            r5.flush()
            goto L_0x0079
        L_0x00fc:
            r3 = 0
            return r3
        L_0x00fe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.initialize():boolean");
    }

    public static void d(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", str));
        } else if (i >= 4) {
            log("LL_D ", str);
        }
    }

    public static void e(String str) {
        if (level == 5) {
            logToLogcat(1, log("LL_E ", str));
        } else {
            log("LL_E ", str);
        }
    }

    public static void i(String str) {
        if (level == 5) {
            logToLogcat(3, log("LL_I ", str));
        } else {
            log("LL_I ", str);
        }
    }

    public static String log(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        String adorn = adorn(str, new StringBuilder(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void w(String str) {
        if (level == 5) {
            logToLogcat(2, log("LL_W ", str));
        } else {
            log("LL_W ", str);
        }
    }
}
