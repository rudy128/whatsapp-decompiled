package com.whatsapp.ml.v2.worker;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass8AS;
import X.C000100c;
import X.C122716Rq;
import X.C124056Ww;
import X.C132046m5;
import X.C162168Jj;
import X.C162178Jk;
import X.C17890vO;
import X.C18070vi;
import X.C30391dr;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import com.whatsapp.ml.v2.repo.MLModelRepository$cleanup$1;
import com.whatsapp.util.Log;

public final class MLModelCleanUpWorkerV2 extends CoroutineWorker {
    public final C000100c A00;
    public final C132046m5 A01;
    public final MLModelRepository A02;

    private final C122716Rq A00() {
        String A03 = this.A01.A01.A03("ML_MODEL_WORKER_MODEL_FEATURE_NAME");
        if (A03 != null) {
            C122716Rq A002 = C124056Ww.A00(A03);
            if (A002 != null) {
                return A002;
            }
            throw AnonymousClass000.A0k("Feature name is not registered");
        }
        throw AnonymousClass000.A0k("Feature name is missing");
    }

    public Object A0A(C30391dr r8) {
        try {
            AnonymousClass8AS A002 = this.A01.A00("ML_DOWNLOADER_CLEAN_UP", 721685391, A00().hashCode());
            A002.Bj0();
            A002.Bir("feature", A00().name());
            MLModelRepository mLModelRepository = this.A02;
            C122716Rq A003 = A00();
            AnonymousClass3MW.A1X(mLModelRepository.A03, new MLModelRepository$cleanup$1(A003, mLModelRepository, (C30391dr) null), mLModelRepository.A04);
            A002.Biu(2);
            return new C162178Jk();
        } catch (Exception e) {
            Log.e("MLModelCleanUpWorkerV2/doWork/error", e);
            return new C162168Jj();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelCleanUpWorkerV2(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (MLModelRepository) r1.A5w.get();
        this.A01 = (C132046m5) r1.A6v.get();
    }
}
