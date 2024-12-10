package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1M9;
import X.AnonymousClass1TI;
import X.AnonymousClass6Fx;
import X.AnonymousClass74L;
import X.C139916ze;
import X.C145927Nd;
import X.C147127Rx;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18150vq;
import X.C200710s;
import X.C24921Me;
import X.C32431hB;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class MediaDownloadService extends AnonymousClass6Fx {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public AnonymousClass11P A02;
    public AnonymousClass118 A03;
    public C32431hB A04;
    public C200710s A05;
    public AnonymousClass10I A06;
    public AnonymousClass1TI A07;
    public boolean A08 = false;
    public boolean A09;
    public final AnonymousClass00H A0A = C18150vq.A01(C147127Rx.A00(26));

    public IBinder onBind(Intent intent) {
        return null;
    }

    public MediaDownloadService() {
        super("media-download-service", true);
    }

    public void onCreate() {
        Log.i("media-download-service/onCreate");
        A04();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("media-download-service/onDestroy");
        AnonymousClass1TI r1 = this.A07;
        if (r1 != null) {
            this.A04.A05.A02(r1);
            this.A07 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("media-download-service/onStartCommand:");
        A10.append(intent);
        A10.append("; startId: ");
        A10.append(i2);
        A10.append(" largeMediaDownloadsInProgress=");
        C17900vP.A0r(A10, this.A09);
        if (intent != null) {
            if (C17890vO.A1S(intent, "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED")) {
                this.A09 = true;
            } else if (C17890vO.A1S(intent, "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED")) {
                this.A09 = false;
            }
        }
        String string = getString(2131898700);
        Resources resources = getResources();
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, 1, 0);
        A06(AnonymousClass74L.A03(this, string, resources.getQuantityString(2131755095, 1, objArr), (ArrayList) null), (Integer) null, i2, 242478024);
        if (!this.A09) {
            ((C139916ze) this.A01.get()).A03(this.A03.A00, MediaDownloadService.class);
            return 2;
        } else if (this.A07 != null) {
            return 2;
        } else {
            this.A07 = new C145927Nd(this, i2, 2);
            C200710s r2 = this.A05;
            if (r2 == null) {
                r2 = new C200710s(this.A06, false);
                this.A05 = r2;
            }
            C32431hB r0 = this.A04;
            r0.A05.A03(this.A07, r2);
            return 2;
        }
    }
}
