package com.whatsapp.ml.v2.worker;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass708;
import X.AnonymousClass7x8;
import X.AnonymousClass8AS;
import X.C000100c;
import X.C108975cc;
import X.C122716Rq;
import X.C124056Ww;
import X.C132046m5;
import X.C146997Rk;
import X.C162168Jj;
import X.C162178Jk;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class StaleModelDeletionWorkerV2 extends CoroutineWorker {
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

    public Object A0A(C30391dr r9) {
        try {
            AnonymousClass8AS A002 = this.A01.A00("ML_DOWNLOADER_STALE_MODEL_DELETION", 721697316, A00().hashCode());
            A002.Bj0();
            A002.Bir("feature", A00().name());
            MLModelRepository mLModelRepository = this.A02;
            ArrayList A03 = mLModelRepository.A03(A00());
            LinkedHashMap A13 = C17880vN.A13();
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("map key:");
                String str = ((AnonymousClass708) next).A06;
                A002.Biz(AnonymousClass000.A0y(str, A10));
                ((List) C72473Md.A0h(str, A13)).add(next);
            }
            ArrayList A11 = C72453Mb.A11(A13);
            Iterator A15 = AnonymousClass000.A15(A13);
            while (A15.hasNext()) {
                A11.add(C29431cG.A0p(C29431cG.A0y((List) C17890vO.A0P(A15), new C146997Rk((Object) A002, 8))));
            }
            Iterator it2 = C29351c6.A0F(A11).iterator();
            while (it2.hasNext()) {
                AnonymousClass708 r2 = (AnonymousClass708) it2.next();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("removed:");
                C108975cc.A14(A102, r2.A06);
                A002.Biz(C17880vN.A0t(A102, r2.A01));
                mLModelRepository.A05(r2, AnonymousClass7x8.A00);
            }
            A002.Biu(2);
            return new C162178Jk();
        } catch (Exception e) {
            Log.e("StaleModelDeletionWorkerV2/doWork/error", e);
            return new C162168Jj();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StaleModelDeletionWorkerV2(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (MLModelRepository) r1.A5w.get();
        this.A01 = (C132046m5) r1.A6v.get();
    }
}
