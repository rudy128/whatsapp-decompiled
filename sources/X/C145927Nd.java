package X;

import android.os.Handler;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.7Nd  reason: invalid class name and case insensitive filesystem */
public class C145927Nd implements AnonymousClass1TI {
    public final int A00;
    public final int A01;
    public final Object A02;

    public final void accept(Object obj) {
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A02;
                int i2 = this.A01;
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.CEx();
                if (((Boolean) obj2).booleanValue()) {
                    deepLinkActivity.finish();
                    return;
                } else {
                    deepLinkActivity.BhQ(i2);
                    return;
                }
            case 1:
                C33581j3 r5 = (C33581j3) this.A02;
                int i3 = this.A01;
                AnonymousClass206 r6 = (AnonymousClass206) obj2;
                if (r6 instanceof AnonymousClass21V) {
                    AnonymousClass21V r62 = (AnonymousClass21V) r6;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("mediaautodownload/updatequeue/foreach message.key=");
                    C17900vP.A0b(r62.A0v, A10);
                    C32431hB r4 = r5.A05;
                    C115295ti A0A = r4.A0A(r62);
                    if (A0A == null) {
                        Log.i("mediaautodownload/updatequeue/foreach message skipped");
                        return;
                    } else if (A0A.A15 != 0) {
                        AnonymousClass00H r1 = r5.A09;
                        if (((C26501Sj) r1.get()).A04(r62)) {
                            i = 1;
                        } else {
                            boolean A05 = ((C26501Sj) r1.get()).A05(r62, i3);
                            i = 3;
                            if (!A05) {
                                C32431hB.A06(r4, r62, false, false, false);
                                return;
                            }
                        }
                        A0A.A15 = i;
                        AnonymousClass70W r12 = A0A.A0k;
                        synchronized (r12) {
                            r12.A00 = i;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                MediaDownloadService mediaDownloadService = (MediaDownloadService) this.A02;
                int i4 = this.A01;
                ArrayList arrayList = (ArrayList) obj2;
                if (!arrayList.isEmpty()) {
                    ((Handler) mediaDownloadService.A0A.get()).post(new AnonymousClass7R3(mediaDownloadService, arrayList, AnonymousClass74L.A06(mediaDownloadService, arrayList), AnonymousClass74L.A05(mediaDownloadService, mediaDownloadService.A00, mediaDownloadService.A01, arrayList), i4, 2));
                    return;
                }
                ((C139916ze) mediaDownloadService.A01.get()).A02(mediaDownloadService.A03.A00, C108945cZ.A0G("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED"), MediaDownloadService.class);
                return;
        }
    }

    public C145927Nd(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }
}
