package X;

import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import com.whatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.service.GcmFGService;

/* renamed from: X.6Fz  reason: invalid class name and case insensitive filesystem */
public abstract class C120876Fz extends C29651cd implements AnonymousClass009 {
    public final Object A00 = C17880vN.A0p();
    public volatile C008203r A01;

    public void A04() {
        if (this instanceof GcmFGService) {
            GcmFGService gcmFGService = (GcmFGService) this;
            if (!gcmFGService.A03) {
                gcmFGService.A03 = true;
                AnonymousClass10E A03 = A03(gcmFGService);
                gcmFGService.A00 = AnonymousClass10E.A6O(A03);
                gcmFGService.A02 = AnonymousClass3MY.A0Z(A03);
                gcmFGService.A01 = AnonymousClass3Ma.A0g(A03);
            }
        } else if (this instanceof MediaTranscodeService) {
            MediaTranscodeService mediaTranscodeService = (MediaTranscodeService) this;
            if (!mediaTranscodeService.A05) {
                mediaTranscodeService.A05 = true;
                AnonymousClass10E A032 = A03(mediaTranscodeService);
                mediaTranscodeService.A03 = AnonymousClass3MY.A0Z(A032);
                mediaTranscodeService.A00 = AnonymousClass10E.A4z(A032);
                mediaTranscodeService.A01 = AnonymousClass3MZ.A0g(A032);
                mediaTranscodeService.A02 = AnonymousClass3MZ.A0o(A032);
                mediaTranscodeService.A04 = (C32861hs) A032.Agw.get();
            }
        } else if (this instanceof MediaDownloadService) {
            MediaDownloadService mediaDownloadService = (MediaDownloadService) this;
            if (!mediaDownloadService.A08) {
                mediaDownloadService.A08 = true;
                AnonymousClass10E A033 = A03(mediaDownloadService);
                mediaDownloadService.A03 = AnonymousClass3MZ.A0l(A033);
                mediaDownloadService.A06 = AnonymousClass10E.AL1(A033);
                mediaDownloadService.A00 = AnonymousClass10E.A4z(A033);
                mediaDownloadService.A01 = AnonymousClass3MZ.A0g(A033);
                mediaDownloadService.A04 = (C32431hB) A033.A66.get();
                mediaDownloadService.A02 = AnonymousClass10E.A6O(A033);
            }
        } else if (this instanceof InstrumentationFGService) {
            InstrumentationFGService instrumentationFGService = (InstrumentationFGService) this;
            if (!instrumentationFGService.A01) {
                instrumentationFGService.A01 = true;
                instrumentationFGService.A00 = AnonymousClass3MY.A0Z(A03(instrumentationFGService));
            }
        } else {
            VoiceFGService voiceFGService = (VoiceFGService) this;
            if (!voiceFGService.A05) {
                voiceFGService.A05 = true;
                AnonymousClass10E A034 = A03(voiceFGService);
                voiceFGService.A02 = AnonymousClass3Ma.A0g(A034);
                voiceFGService.A03 = AnonymousClass3MY.A0Z(A034);
                voiceFGService.A01 = (AnonymousClass1V7) A034.A97.get();
                voiceFGService.A04 = C000200d.A00(A034.A00.AIh);
                voiceFGService.A00 = (AnonymousClass195) A034.A0L.get();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C008203r(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public static AnonymousClass10E A03(AnonymousClass6Fx r2) {
        AnonymousClass10E r1 = ((C31221fD) ((C008503u) r2.generatedComponent())).A07;
        r2.A01 = C000200d.A00(r1.ATS);
        r2.A00 = (AnonymousClass1DC) r1.A95.get();
        return r1;
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }
}
