package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass10E;
import X.C139636zC;
import X.C162178Jk;
import X.C17890vO;
import X.C180129Lg;
import X.C18070vi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class FetchDownloadableStickerPackWorker extends Worker {
    public final C139636zC A00;

    public C180129Lg A0B() {
        this.A00.A02();
        return new C162178Jk();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchDownloadableStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = (C139636zC) ((AnonymousClass10E) C17890vO.A0H(context)).AAT.get();
    }
}
