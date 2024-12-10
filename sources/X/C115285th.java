package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.5th  reason: invalid class name and case insensitive filesystem */
public final class C115285th extends C167258fi {
    public final String A00;
    public final /* synthetic */ AnonymousClass6EY A01;

    public C115285th(AnonymousClass6EY r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A0E() {
        AnonymousClass6EY r5 = this.A01;
        AnonymousClass00H r3 = r5.A00;
        C63042sP.A00((C63042sP) r3.get(), 501813884);
        String str = this.A00;
        String A04 = C17970vW.A04(str);
        if (A04 != null) {
            Bitmap A012 = ((A5O) r5.A05.getValue()).A01(A04);
            if (A012 != null) {
                return A012;
            }
        } else {
            A04 = null;
        }
        FutureTask futureTask = this.A02;
        if (!futureTask.isCancelled()) {
            AUZ A05 = ((AnonymousClass1D9) r5.A03.get()).A05((Pair) null, (C220418j) r5.A01.get(), str, (String) null);
            if (A05.A01.getResponseCode() == 200) {
                try {
                    C179229Hb A0N = C108955ca.A0N((AnonymousClass181) r5.A02.get(), A05, (Integer) null, 41);
                    if (!futureTask.isCancelled()) {
                        Bitmap decodeStream = BitmapFactory.decodeStream(A0N);
                        if (A04 != null) {
                            ((A5O) r5.A05.getValue()).A03(decodeStream, A04);
                        }
                        C63042sP.A01((C63042sP) r3.get(), 501813884, 2);
                        C18070vi.A0b(decodeStream);
                        return decodeStream;
                    }
                    A00(r3);
                    throw new InterruptedException("AlbumArtworkDirectDownloader/interrupted after download");
                } catch (IOException e) {
                    A00(r3);
                    throw new ExecutionException("AlbumArtworkDirectDownloader/Error downloading or decoding", e);
                }
            } else {
                Log.e("AlbumArtworkDirectDownloader/download failed");
                A00(r3);
                throw new ExecutionException(new RuntimeException("AlbumArtworkDirectDownloader/download failed"));
            }
        } else {
            A00(r3);
            throw new InterruptedException("AlbumArtworkDirectDownloader/interrupted before download");
        }
    }

    public static void A00(AnonymousClass00H r2) {
        C63042sP.A01((C63042sP) r2.get(), 501813884, 3);
    }
}
