package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.quicklog.reliability.CancelReason;
import com.whatsapp.net.tls13.WtCachedPsk;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.DcJ  reason: case insensitive filesystem */
public class C27347DcJ extends SSLSocket implements C28475E2q {
    public int A00;
    public C24216BxU A01;
    public C27006DPc A02;
    public C27346DcI A03;
    public DWS A04;
    public DWS A05;
    public CVT A06;
    public InputStream A07;
    public OutputStream A08;
    public String A09;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public long A0E;
    public C24228Bxg A0F;

    private synchronized void A02() {
        this.A0D = true;
        C27006DPc dPc = this.A02;
        dPc.A0R = null;
        dPc.A0S = null;
        if (this.A0C) {
            this.A01.close();
            this.A0F.close();
        }
        A0C();
    }

    public static void A05(C27347DcJ dcJ) {
        dcJ.A0C = false;
        dcJ.A0B = false;
        dcJ.A0D = false;
        dcJ.A0A = new HashSet();
    }

    public static synchronized void A06(C27347DcJ dcJ, SSLException sSLException, byte b, byte b2, boolean z) {
        IOException iOException;
        String str;
        String str2;
        synchronized (dcJ) {
            if (z) {
                iOException = (IOException) BE9.A0u(sSLException);
            } else {
                if (!dcJ.A0D) {
                    Integer num = AnonymousClass00R.A01;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Sending Alert : type : ");
                    if (b == 2) {
                        str = "FATAL";
                    } else {
                        str = "WARNING";
                    }
                    A10.append(str);
                    A10.append(" description : ");
                    A10.append(A01(b2));
                    A10.append("(");
                    A10.append(b2);
                    A10.append(") exception : ");
                    if (sSLException == null) {
                        str2 = "";
                    } else {
                        str2 = sSLException.toString();
                    }
                    String A0y = AnonymousClass000.A0y(str2, A10);
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    C4Z c4z = C25420CfS.A00;
                    String obj = stackTrace[2].toString();
                    if (!(c4z instanceof C24028BuF)) {
                        PrintStream printStream = System.err;
                        StringBuilder A102 = AnonymousClass000.A10();
                        BE7.A1N(A102, C24029BuG.A00(num));
                        A102.append(obj);
                        printStream.println(AnonymousClass001.A1H(" : ", A0y, A102));
                        if (sSLException != null) {
                            sSLException.printStackTrace(printStream);
                        }
                    }
                    try {
                        dcJ.A02.A0B.A01(new byte[]{b, b2}, 0, 2, (byte) 21);
                    } catch (Exception e) {
                        C25420CfS.A00(AnonymousClass00R.A0Y, AnonymousClass001.A1E(e, "Encountered exception. Nothing much can be done here. ", AnonymousClass000.A10()));
                    }
                    dcJ.A02();
                }
                if (b == 2) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("WATLS Exception\n");
                    String A0y2 = AnonymousClass000.A0y(dcJ.A00(), A103);
                    Throwable th = sSLException;
                    if (sSLException != null) {
                        th = BE9.A0u(sSLException);
                    }
                    iOException = new IOException(A0y2, th);
                }
            }
            throw iOException;
        }
    }

    public static void A07(C27347DcJ dcJ, byte[] bArr, byte b) {
        byte[] A012 = C25352CeB.A01(bArr, b);
        dcJ.A02.A0B.A01(A012, 0, A012.length, (byte) 22);
        dcJ.A02.A0D.A00(A012);
    }

    public synchronized void close() {
        if (!this.A0D) {
            if (this.A0C) {
                A06(this, (SSLException) null, (byte) 1, (byte) 0, false);
            } else {
                A02();
            }
        }
    }

    public boolean getEnableSessionCreation() {
        return true;
    }

    public boolean getUseClientMode() {
        return true;
    }

    public void setEnableSessionCreation(boolean z) {
    }

    public void setUseClientMode(boolean z) {
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.CXp] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.Buy, X.C6K] */
    /* JADX WARNING: type inference failed for: r1v17, types: [X.C6a, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d0, code lost:
        if (r5 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x00bc */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0120 A[Catch:{ NoSuchAlgorithmException -> 0x01e4, IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014f A[Catch:{ NoSuchAlgorithmException -> 0x01e4, IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0160 A[Catch:{ NoSuchAlgorithmException -> 0x01e4, IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b6 A[Catch:{ NoSuchAlgorithmException -> 0x01e4, IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d6 A[Catch:{ NoSuchAlgorithmException -> 0x01e4, IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startHandshake() {
        /*
            r10 = this;
            r3 = 2
            r4 = 0
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = "Start handshake."
            X.C25420CfS.A00(r1, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            boolean r0 = r10.A0C     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 != 0) goto L_0x0208
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r10.A0E = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r6 = 1
            r10.A0C = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DcI r7 = r10.A03     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r1 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Bxb r0 = new X.Bxb     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.A08 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Buv r7 = (X.C24070Buv) r7     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18g r0 = r7.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0F = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = "SHA-256"
            r2.A0P = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0 = 32
            r2.A02 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r9 = 32
            X.CXp r0 = new X.CXp     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A09 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.15v r0 = r7.A04     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.00H r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CDV r1 = (X.CDV) r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CWN r0 = new X.CWN     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0G = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CWN r0 = r2.A0G     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CDV r0 = r0.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0H = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.15u r0 = r7.A03     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0I = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18Z r0 = r7.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.00H r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.15u r1 = (X.C213915u) r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.COj r0 = new X.COj     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0J = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r5 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.COj r1 = r5.A0J     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            javax.net.ssl.X509TrustManager r0 = r7.A07     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.A00 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = "http/1.1"
            r5.A0O = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18e r0 = r7.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r5.A0E = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.io.InputStream r2 = r10.A07     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Bxb r1 = r5.A08     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Buw r0 = new X.Buw     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r5.A0A = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.io.OutputStream r1 = r10.A08     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Buy r0 = new X.Buy     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.A00 = r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0B = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CMD r0 = new X.CMD     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0K = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.A00 = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18h r1 = r7.A06     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r5 = r1.A00(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r5 == 0) goto L_0x00ad
            int r0 = r5.length()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 != 0) goto L_0x00d2
        L_0x00ad:
            java.lang.String r0 = r10.A09     // Catch:{ UnknownHostException -> 0x00bc }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x00bc }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00bc }
            java.lang.String r5 = r1.A00(r0)     // Catch:{ UnknownHostException -> 0x00bc }
            goto L_0x00d0
        L_0x00bc:
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = "Failed to normalize the IP address "
            r1.append(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.C25420CfS.A00(r2, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x00d0:
            if (r5 == 0) goto L_0x00dd
        L_0x00d2:
            int r0 = r5.length()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 <= 0) goto L_0x00dd
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0Q = r5     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            goto L_0x00e3
        L_0x00dd:
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0Q = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x00e3:
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0U = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.io.InputStream r0 = r10.A07     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0M = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.io.OutputStream r0 = r10.A08     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0N = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.BxU r0 = r10.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Bxb r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A07 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18b r0 = r7.A05     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0L = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0b = r4     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0d = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0l = r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CMD r0 = r2.A0K     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18b r2 = r0.A0L     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            int r0 = r10.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r8 = "TLS_AES_128_GCM_SHA256"
            byte[] r0 = X.C26287Cwn.A0A(r1, r8, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            javax.net.ssl.SSLSession r5 = r2.getSession(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DWS r5 = (X.DWS) r5     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r5 != 0) goto L_0x012d
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.18b r2 = r0.A0L     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            int r0 = r10.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DWS r5 = new X.DWS     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r5.<init>(r2, r1, r8, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x012d:
            r10.A04 = r5     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.A0C = r5     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r10.A05 = r5     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.A0j = r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CMD r0 = r0.A0K     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CWN r0 = r0.A0G     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.A00()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CWN r1 = r2.A0G     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.6fZ r0 = r1.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 != 0) goto L_0x0152
            r1.A00()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x0152:
            X.6fZ r0 = r1.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r0 = r0.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0i = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CWN r1 = r2.A0G     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.6fZ r0 = r1.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 != 0) goto L_0x0163
            r1.A00()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x0163:
            X.6fZ r0 = r1.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0h = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r5 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.lang.String r2 = r5.A0P     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.C6a r1 = new X.C6a     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.<init>()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0 = 0
            r1.A01 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x01e4 }
            r1.A00 = r0     // Catch:{ NoSuchAlgorithmException -> 0x01e4 }
            r5.A0D = r1     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r2 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0e = r4     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0Z = r4     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            boolean r0 = r7.A08     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0a = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0R = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r2.A0S = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            r2.A06 = r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r0 = A08(r2)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r5 = X.C25352CeB.A01(r0, r6)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r0 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.C6K r2 = r0.A0B     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            int r1 = r5.length     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0 = 22
            r2.A01(r5, r4, r1, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r1 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            boolean r0 = r1.A0a     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 == 0) goto L_0x01d6
            X.DWS r0 = r1.A0C     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            com.whatsapp.net.tls13.WtCachedPsk r0 = r0.A01     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r1.A0d     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            if (r0 == 0) goto L_0x01c9
            X.C6K r2 = r1.A0B     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1[r4] = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0 = 20
            r2.A01(r1, r4, r6, r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.DPc r1 = r10.A02     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.A0e = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x01c9:
            r1.A0Y = r6     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.CVT r1 = r10.A06     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Bug r0 = new X.Bug     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.A00(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            return
        L_0x01d6:
            X.CVT r1 = r10.A06     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            X.Buf r0 = new X.Buf     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r1.A00(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            r10.A09()     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            return
        L_0x01e4:
            r0 = move-exception
            X.18c r0 = X.BEA.A0Y(r0)     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
            throw r0     // Catch:{ IOException -> 0x0209, 18c -> 0x01fe, Exception -> 0x01ea }
        L_0x01ea:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r0 = X.BE9.A0u(r0)
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r2, r0)
            r0 = 80
            A06(r10, r1, r3, r0, r4)
            return
        L_0x01fe:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            A06(r10, r0, r3, r2, r1)
        L_0x0208:
            return
        L_0x0209:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27347DcJ.startHandshake():void");
    }

    public static String A01(byte b) {
        if (b == 0) {
            return "close_notify";
        }
        if (b == 10) {
            return "unexpected_message";
        }
        if (b == 20) {
            return "bad_record_mac";
        }
        if (b == 22) {
            return "record_overflow";
        }
        if (b == 40) {
            return "handshake_failure";
        }
        if (b == 80) {
            return "internal_error";
        }
        if (b == 86) {
            return "inappropriate_fallback";
        }
        if (b == 90) {
            return CancelReason.USER_CANCELLED;
        }
        if (b == 120) {
            return "no_application_protocol";
        }
        if (b == 70) {
            return "protocol_version";
        }
        if (b == 71) {
            return "insufficient_security";
        }
        if (b == 109) {
            return "missing_extension";
        }
        if (b == 110) {
            return "unsupported_version";
        }
        if (b == 112) {
            return "unrecognized_name";
        }
        if (b == 113) {
            return "bad_certificate_status_response";
        }
        if (b == 115) {
            return "unknown_psk_identity";
        }
        if (b == 116) {
            return "certificate_required";
        }
        switch (b) {
            case 42:
                return "bad_certificate";
            case 43:
                return "unsupported_certificate";
            case 44:
                return "certificate_revoked";
            case 45:
                return "certificate_expired";
            case 46:
                return "certificate_unknown";
            case 47:
                return "illegal_parameter";
            case 48:
                return "unknown_ca";
            case 49:
                return "access_denied";
            case 50:
                return "decode_error";
            case 51:
                return "decrypt_error";
            default:
                return "invalid description";
        }
    }

    public static void A03(C24829CLx cLx, C27347DcJ dcJ) {
        byte[] bArr = (byte[]) cLx.A00;
        Integer num = AnonymousClass00R.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Received Alert: Level ");
        A10.append(bArr[0]);
        A10.append(" Description ");
        byte b = bArr[1];
        A10.append(A01(b));
        A10.append("(");
        A10.append(b);
        C25420CfS.A00(num, AnonymousClass8BU.A0q(A10));
        dcJ.A02();
        byte b2 = bArr[1];
        if (b2 == 0 || b2 == 50) {
            throw new IOException(new SSLException(AnonymousClass001.A1I("Received alert ", AnonymousClass000.A10(), b2)));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("WATLS Exception\n");
        throw new IOException(AnonymousClass000.A0y(dcJ.A00(), A102), new SSLException(AnonymousClass001.A1I("Received alert ", AnonymousClass000.A10(), b2)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.C62, java.lang.Object] */
    public static void A04(C25728Cky cky, byte[] bArr, short s) {
        ? obj = new Object();
        obj.A00 = s;
        obj.A01 = bArr;
        ArrayList arrayList = cky.A02;
        int i = cky.A00;
        arrayList.add(i, obj);
        cky.A01 += obj.A01.length + 4;
        cky.A00 = i + 1;
    }

    public static byte[] A08(C27006DPc dPc) {
        ByteBuffer allocate;
        long currentTimeMillis;
        short s;
        byte[] bArr;
        if (dPc != null) {
            byte[] bArr2 = dPc.A0j;
            if (bArr2 == null || bArr2.length != 32) {
                throw BE9.A0b("Client random is not correctly initialized.", (byte) 80);
            } else if (dPc.A0l != null) {
                C25728Cky cky = new C25728Cky();
                try {
                    String str = dPc.A0O;
                    if (str != null) {
                        if (!str.isEmpty()) {
                            byte[] bytes = str.getBytes(DefaultCrypto.UTF_8);
                            int length = bytes.length;
                            ByteBuffer allocate2 = ByteBuffer.allocate(length + 3);
                            C26287Cwn.A05(length + 1, allocate2);
                            allocate2.put((byte) length);
                            allocate2.put(bytes);
                            A04(cky, allocate2.array(), 16);
                        }
                    }
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.putShort(2);
                    allocate3.putShort(1027);
                    A04(cky, allocate3.array(), 13);
                    ByteBuffer allocate4 = ByteBuffer.allocate(4);
                    allocate4.putShort(2);
                    allocate4.putShort(29);
                    A04(cky, allocate4.array(), 10);
                    ByteBuffer allocate5 = ByteBuffer.allocate(2);
                    allocate5.put((byte) 1);
                    allocate5.put(dPc.A00);
                    A04(cky, allocate5.array(), 45);
                    ByteBuffer allocate6 = ByteBuffer.allocate(5);
                    allocate6.put((byte) 4);
                    Set set = CID.A04;
                    allocate6.putShort(772);
                    allocate6.putShort(-1254);
                    A04(cky, allocate6.array(), 43);
                    ByteBuffer allocate7 = ByteBuffer.allocate(4);
                    allocate7.putShort(2);
                    allocate7.putShort(1027);
                    A04(cky, allocate7.array(), 50);
                    if (dPc.A0a && dPc.A0C.A01 != null && !dPc.A0c) {
                        A04(cky, new byte[0], 42);
                    }
                    try {
                        byte[] bytes2 = dPc.A0Q.getBytes(DefaultCrypto.UTF_8);
                        int length2 = bytes2.length;
                        ByteBuffer allocate8 = ByteBuffer.allocate(length2 + 5);
                        C26287Cwn.A05(length2 + 3, allocate8);
                        allocate8.put(C26287Cwn.A07(length2));
                        allocate8.put(bytes2);
                        A04(cky, allocate8.array(), 0);
                        if (dPc.A0c && (bArr = dPc.A0k) != null) {
                            ByteBuffer allocate9 = ByteBuffer.allocate(bArr.length + 2);
                            C26287Cwn.A05(bArr.length, allocate9);
                            allocate9.put(bArr);
                            A04(cky, allocate9.array(), 44);
                        }
                        if (!dPc.A0c || (s = dPc.A0W) == 29) {
                            ByteBuffer allocate10 = ByteBuffer.allocate(38);
                            C26287Cwn.A05(36, allocate10);
                            allocate10.putShort(29);
                            C26287Cwn.A05(32, allocate10);
                            allocate10.put(dPc.A0i);
                            A04(cky, allocate10.array(), 51);
                            ByteBuffer allocate11 = ByteBuffer.allocate(cky.A01);
                            Iterator it = cky.A02.iterator();
                            while (it.hasNext()) {
                                C62 c62 = (C62) it.next();
                                byte[] bArr3 = c62.A01;
                                int length3 = bArr3.length;
                                ByteBuffer allocate12 = ByteBuffer.allocate(length3 + 4);
                                allocate12.putShort(c62.A00);
                                C26287Cwn.A05(length3, allocate12);
                                allocate12.put(bArr3);
                                allocate11.put(allocate12.array());
                            }
                            byte[] array = allocate11.array();
                            WtCachedPsk wtCachedPsk = dPc.A0C.A01;
                            if (wtCachedPsk == null) {
                                allocate = ByteBuffer.allocate(0);
                            } else {
                                byte[] bArr4 = wtCachedPsk.ticket;
                                allocate = ByteBuffer.allocate(bArr4.length + 6 + 6 + dPc.A02 + 1 + 2);
                                byte[] bArr5 = dPc.A0C.A01.ticket;
                                allocate.putShort(41);
                                C26287Cwn.A05(allocate.capacity() - 4, allocate);
                                int length4 = bArr5.length;
                                C26287Cwn.A05(length4 + 6, allocate);
                                C26287Cwn.A05(length4, allocate);
                                allocate.put(bArr5);
                                WtCachedPsk wtCachedPsk2 = dPc.A0C.A01;
                                if (wtCachedPsk2.useTestTime) {
                                    currentTimeMillis = 3600000;
                                } else {
                                    currentTimeMillis = System.currentTimeMillis();
                                }
                                long j = currentTimeMillis - wtCachedPsk2.ticketIssuedTime;
                                if (j < 0) {
                                    j = 0;
                                }
                                long j2 = (j + wtCachedPsk2.ticketAgeAdd) % 4294967296L;
                                if (j2 < 0) {
                                    j2 += 4294967296L;
                                }
                                if (j2 < 0 || j2 >= 4294967296L) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("Invalid argument. The supplied long value = ");
                                    A10.append(j2);
                                    throw BE9.A0b(AnonymousClass000.A0y(" does not  fit in 4 bytes.", A10), (byte) 80);
                                }
                                allocate.put(new byte[]{(byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) (j2 & 255))});
                            }
                            int length5 = array.length + allocate.capacity();
                            ByteBuffer allocate13 = ByteBuffer.allocate(dPc.A0l.length + 35 + 2 + 2 + 1 + 1 + 2 + length5);
                            allocate13.putShort(771);
                            allocate13.put(dPc.A0j);
                            allocate13.put((byte) dPc.A0l.length);
                            allocate13.put(dPc.A0l);
                            allocate13.putShort(2);
                            allocate13.putShort(4865);
                            allocate13.put((byte) 1);
                            allocate13.put((byte) 0);
                            C26287Cwn.A05(length5, allocate13);
                            allocate13.put(array);
                            if (dPc.A0C.A01 != null) {
                                try {
                                    MessageDigest messageDigest = (MessageDigest) dPc.A0D.A00.clone();
                                    byte[] copyOfRange = Arrays.copyOfRange(allocate13.array(), 0, allocate13.position());
                                    byte[] copyOfRange2 = Arrays.copyOfRange(allocate.array(), 0, allocate.position());
                                    messageDigest.update((byte) 1);
                                    messageDigest.update(C26287Cwn.A07(allocate13.capacity()));
                                    messageDigest.update(copyOfRange);
                                    messageDigest.update(copyOfRange2);
                                    byte[] digest = messageDigest.digest();
                                    int i = dPc.A02 + 1;
                                    ByteBuffer allocate14 = ByteBuffer.allocate(i + 2);
                                    C26287Cwn.A05(i, allocate14);
                                    try {
                                        byte[] A0C2 = C26287Cwn.A0C(dPc.A0P, C26287Cwn.A09(dPc.A09, dPc, "finished", new byte[0], C26287Cwn.A09(dPc.A09, dPc, "res binder", MessageDigest.getInstance(dPc.A0P).digest(), dPc.A09.A00(new byte[dPc.A02], dPc.A0C.A01.pskVal))), digest);
                                        allocate14.put((byte) A0C2.length);
                                        allocate14.put(A0C2);
                                        allocate.put(allocate14.array());
                                        allocate13.put(allocate.array());
                                    } catch (NoSuchAlgorithmException e) {
                                        throw BEA.A0Y(e);
                                    }
                                } catch (CloneNotSupportedException e2) {
                                    throw BEA.A0Y(e2);
                                }
                            }
                            return allocate13.array();
                        }
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Must use key group sent by HelloRetryRequest: ");
                        A102.append(s);
                        throw BE9.A0b(AnonymousClass001.A1I(" client key group: ", A102, 29), (byte) 80);
                    } catch (UnsupportedEncodingException e3) {
                        throw BE9.A0d(e3);
                    }
                } catch (UnsupportedEncodingException e4) {
                    throw BE9.A0d(e4);
                }
            } else {
                throw BE9.A0b("Legacy session id is not correctly initialized.", (byte) 80);
            }
        } else {
            throw BE9.A0b("Illegal argument. Context cannot be null.", (byte) 80);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.E2p, java.lang.Object, X.DPb] */
    public void A09() {
        C24829CLx A012;
        while (true) {
            boolean equals = this.A06.A00.A00.equals(CIL.A08);
            C27006DPc dPc = this.A02;
            if (!equals) {
                C25191Cai cai = dPc.A0A;
                synchronized (cai) {
                    A012 = cai.A01();
                }
                if (!(A012 instanceof C24062Bun)) {
                    if (A012 instanceof C24049Bua) {
                        A03(A012, this);
                        throw null;
                    }
                    this.A06.A00(A012);
                    if (A012 instanceof C24060Bul) {
                        A07(this, A08(this.A02), (byte) 1);
                    }
                }
            } else {
                if (!dPc.A0b) {
                    A06(this, new SSLException("Server must either choose a PSK or send certificates."), (byte) 2, (byte) 116, false);
                }
                if (this.A02.A0f) {
                    A07(this, new byte[0], (byte) 5);
                }
                C27006DPc dPc2 = this.A02;
                if (dPc2.A0d && !dPc2.A0e) {
                    dPc2.A0B.A01(new byte[]{1}, 0, 1, (byte) 20);
                }
                C27006DPc dPc3 = this.A02;
                ? obj = new Object();
                obj.A00(BE6.A1W("client_hs_key", dPc3.A0U), BE6.A1W("client_hs_iv", this.A02.A0U));
                C27006DPc dPc4 = this.A02;
                C27006DPc.A00(obj, dPc4);
                if (dPc4.A0X) {
                    A07(this, new byte[4], (byte) 11);
                }
                C27006DPc dPc5 = this.A02;
                if (dPc5 != null) {
                    byte[] A013 = dPc5.A0D.A01();
                    byte[] A014 = C25352CeB.A01(C26287Cwn.A0C(dPc5.A0P, BE6.A1W("client_finished", dPc5.A0U), A013), (byte) 20);
                    this.A02.A0B.A01(A014, 0, A014.length, (byte) 22);
                    this.A06.A00(new C24829CLx(A014));
                    long currentTimeMillis = System.currentTimeMillis();
                    this.A0B = true;
                    Integer num = AnonymousClass00R.A0C;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Handshake complete : session_resumed ");
                    C27006DPc dPc6 = this.A02;
                    A10.append(dPc6.A0g);
                    A10.append(" early_data_sent ");
                    A10.append(dPc6.A0Z);
                    A10.append(" early_data_accepted ");
                    A10.append(dPc6.A0f);
                    A10.append(" client_cert_requested ");
                    A10.append(dPc6.A0X);
                    A10.append(" time_ms ");
                    C25420CfS.A00(num, C17880vN.A0u(A10, currentTimeMillis - this.A0E));
                    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A05);
                    for (HandshakeCompletedListener handshakeCompleted : this.A0A) {
                        handshakeCompleted.handshakeCompleted(handshakeCompletedEvent);
                    }
                    return;
                }
                throw BEA.A0X("Illegal argument. Context cannot be null.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.BxU, java.io.InputStream] */
    public void A0A() {
        C25420CfS.A00 = new C24028BuF((C24070Buv) this.A03);
        A0B();
        ? inputStream = new InputStream();
        inputStream.A01 = this;
        inputStream.A00 = new C24223Bxb();
        this.A01 = inputStream;
        this.A0F = new C24228Bxg(this);
        C27006DPc dPc = new C27006DPc();
        this.A02 = dPc;
        try {
            this.A06 = new CVT(dPc);
        } catch (C219718c e) {
            throw new IOException(e);
        }
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0A.add(handshakeCompletedListener);
    }

    public SocketChannel getChannel() {
        throw AnonymousClass8BR.A0v("Channels are not supported by WtSocket.");
    }

    public SSLSession getHandshakeSession() {
        return this.A04;
    }

    public InputStream getInputStream() {
        C24216BxU bxU = this.A01;
        if (bxU != null) {
            return bxU;
        }
        throw C17880vN.A0f("Input stream is closed.");
    }

    public boolean getNeedClientAuth() {
        return this.A03.getNeedClientAuth();
    }

    public OutputStream getOutputStream() {
        C24228Bxg bxg = this.A0F;
        if (bxg != null) {
            return bxg;
        }
        throw C17880vN.A0f("Output stream is closed.");
    }

    public SSLParameters getSSLParameters() {
        return this.A03;
    }

    public SSLSession getSession() {
        return this.A05;
    }

    public boolean getWantClientAuth() {
        return this.A03.getWantClientAuth();
    }

    public boolean isClosed() {
        return this.A0D;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0A.remove(handshakeCompletedListener);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A03.setCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.A03.setProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.A03.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof C27346DcI) {
            this.A03 = (C27346DcI) sSLParameters;
        }
    }

    public void setWantClientAuth(boolean z) {
        this.A03.setWantClientAuth(z);
    }

    public C27347DcJ(C27346DcI dcI, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        A05(this);
        this.A03 = dcI;
        this.A09 = null;
        this.A00 = i;
        A0A();
    }

    private String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("host=");
        C27006DPc dPc = this.A02;
        A10.append(dPc.A0Q);
        A10.append(" hrr=");
        A10.append(dPc.A0c);
        A10.append(" r=");
        A10.append(dPc.A0g);
        A10.append(" ed=");
        A10.append(dPc.A0Z);
        A10.append(" eda=");
        A10.append(dPc.A0f);
        A10.append(" s=");
        return AnonymousClass000.A0y(this.A06.A00.A00.A03, A10);
    }

    public void A0B() {
        this.A07 = super.getInputStream();
        this.A08 = super.getOutputStream();
    }

    public void A0C() {
        super.close();
        this.A07.close();
        this.A08.close();
    }

    public String[] getEnabledCipherSuites() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "TLS_AES_128_GCM_SHA256";
        A1Z[1] = "use default";
        return A1Z;
    }

    public String[] getEnabledProtocols() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "TLSv1.3";
        A1Z[1] = "TLSv1.2";
        return A1Z;
    }

    public String[] getSupportedCipherSuites() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "TLS_AES_128_GCM_SHA256";
        A1Z[1] = "use default";
        return A1Z;
    }

    public String[] getSupportedProtocols() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "TLSv1.3";
        A1Z[1] = "TLSv1.2";
        return A1Z;
    }

    public C27347DcJ(C27346DcI dcI, InetAddress inetAddress, InetAddress inetAddress2, int i, int i2) {
        super(inetAddress, i, inetAddress2, i2);
        A05(this);
        this.A03 = dcI;
        this.A09 = inetAddress.getHostName();
        this.A00 = i;
        A0A();
    }

    public C27347DcJ(C27346DcI dcI, String str, InetAddress inetAddress, int i, int i2) {
        super(str, i, inetAddress, i2);
        A05(this);
        this.A03 = dcI;
        this.A09 = str;
        this.A00 = i;
        A0A();
    }

    public C27347DcJ(C27346DcI dcI, String str, int i) {
        super(str, i);
        A05(this);
        this.A03 = dcI;
        this.A09 = str;
        this.A00 = i;
        A0A();
    }

    public C27347DcJ(C27346DcI dcI) {
        A05(this);
        this.A03 = dcI;
        this.A09 = null;
        this.A00 = -1;
        A0A();
    }

    public C27347DcJ() {
        A05(this);
    }
}
