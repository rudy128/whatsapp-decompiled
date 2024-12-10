package com.whatsapp.media.download;

import X.A6Y;
import X.AnonymousClass1RN;
import X.C108945cZ;
import X.C162168Jj;
import X.C162178Jk;
import X.C17890vO;
import X.C180129Lg;
import X.C64062u9;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class ExpressPathGarbageCollectWorker extends Worker {
    public final AnonymousClass1RN A00;

    public C180129Lg A0B() {
        String str;
        A6Y a6y = this.A01.A01;
        String A03 = a6y.A03("file_path");
        if (A03 == null) {
            str = "expressPathGarbageCollectWorker/doWork file path is null";
        } else {
            C64062u9.A0Q(C108945cZ.A17(A03));
            String A032 = a6y.A03("end_hash");
            if (A032 == null) {
                str = "expressPathGarbageCollectWorker/doWork encrypted file hash is null";
            } else {
                if (this.A00.A01(A032)) {
                    return new C162178Jk();
                }
                return new C162168Jj();
            }
        }
        Log.e(str);
        return new C162168Jj();
    }

    public ExpressPathGarbageCollectWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = C17890vO.A0H(context).BA9();
    }
}
