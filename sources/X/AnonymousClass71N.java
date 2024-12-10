package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.71N  reason: invalid class name */
public class AnonymousClass71N {
    public long A00 = 0;
    public long A01;
    public final DataTask A02;
    public final NetworkSession A03;
    public final UrlRequest A04;
    public final BufferedOutputStream A05;
    public final HttpURLConnection A06;
    public final C128106fS A07;
    public final /* synthetic */ C23081El A08;

    public AnonymousClass71N(DataTask dataTask, NetworkSession networkSession, C128106fS r11, C23081El r12) {
        this.A08 = r12;
        this.A07 = r11;
        this.A02 = dataTask;
        this.A03 = networkSession;
        UrlRequest urlRequest = dataTask.mUrlRequest;
        this.A04 = urlRequest;
        try {
            HttpsURLConnection A012 = C23081El.A01(urlRequest, r12, (FileInputStream) null, (byte[]) null);
            this.A06 = A012;
            A012.setDoOutput(true);
            A012.setChunkedStreamingMode(10240);
            long j = dataTask.mContentLength;
            if (Long.valueOf(j) == null || j <= 0) {
                throw C17880vN.A0f("Content-Length cannot be empty for streaming upload");
            }
            this.A01 = j;
            this.A05 = new BufferedOutputStream(new C179259He(r12.A02, A012.getOutputStream(), (Integer) null, 29), 10240);
            networkSession.executeInNetworkContext(new AnonymousClass2A4(dataTask, networkSession, this, r12));
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            Log.e("wa-msys/NetworkSession: Error while initializing StreamingUploadDataTask", e);
            IOException iOException = new IOException(e);
            A00(NetworkUtils.newErrorURLResponse(this.A04), this, iOException, (byte[]) null);
            throw iOException;
        }
    }

    public static void A01(AnonymousClass71N r2) {
        try {
            BufferedOutputStream bufferedOutputStream = r2.A05;
            if (bufferedOutputStream != null) {
                r2.A06.connect();
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            Log.e("wa-msys/NetworkSession: Exception while attempting to close the active output stream.  This could mean that the output stream has been previously closed.", e);
        }
    }

    public static void A00(UrlResponse urlResponse, AnonymousClass71N r5, IOException iOException, byte[] bArr) {
        A01(r5);
        r5.A06.disconnect();
        C128106fS r0 = r5.A07;
        r0.A01.A05.remove(r0.A00.mTaskIdentifier);
        NetworkUtils.markDataTaskCompleted(r5.A02, r5.A03, urlResponse, "wa-msys/NetworkSession: ", bArr, (File) null, iOException);
    }
}
