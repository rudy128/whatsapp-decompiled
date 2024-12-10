package com.whatsapp.ml.v2.worker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass3MZ;
import X.AnonymousClass7x9;
import X.C000100c;
import X.C129136hJ;
import X.C131606lN;
import X.C132046m5;
import X.C134406qX;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.ml.v2.MLModelDownloaderManagerV2;
import com.whatsapp.ml.v2.MLModelUtilV2;
import com.whatsapp.ml.v2.postprocessing.PostProcessingManager;

public final class MLModelDownloadWorkerV2 extends CoroutineWorker {
    public long A00;
    public final AnonymousClass11P A01;
    public final MLModelDownloaderManagerV2 A02;
    public final C134406qX A03;
    public final C132046m5 A04;
    public final C129136hJ A05;
    public final PostProcessingManager A06;
    public final C131606lN A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(AnonymousClass7x9.A00);
    public final C000100c A09;
    public final MLModelUtilV2 A0A;
    public final C18600wl A0B;

    public Object A0A(C30391dr r4) {
        return C30451dy.A00(r4, this.A0B, new MLModelDownloadWorkerV2$doWork$2(this, (C30391dr) null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelDownloadWorkerV2(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A09 = A0H;
        AnonymousClass10E r3 = (AnonymousClass10E) A0H;
        AnonymousClass10G r1 = r3.Ao8.A00;
        this.A02 = AnonymousClass10G.A7i(r1);
        this.A07 = (C131606lN) r3.A60.get();
        this.A04 = (C132046m5) r3.A6v.get();
        this.A0B = AnonymousClass3MZ.A1B(r3);
        this.A06 = AnonymousClass10G.A7m(r1);
        this.A05 = AnonymousClass10G.A7l(r1);
        this.A03 = (C134406qX) r3.A5y.get();
        this.A0A = (MLModelUtilV2) r3.A5x.get();
        this.A01 = A0H.CP7();
    }
}
