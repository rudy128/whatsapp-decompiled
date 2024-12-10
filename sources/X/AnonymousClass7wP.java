package X;

import android.app.Notification;
import android.content.res.Resources;
import androidx.work.WorkerParameters;
import com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2;
import java.util.UUID;

/* renamed from: X.7wP  reason: invalid class name */
public final class AnonymousClass7wP extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $notificationId;
    public final /* synthetic */ int $totalBytes;
    public final /* synthetic */ int $value;
    public final /* synthetic */ MLModelDownloadWorkerV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wP(MLModelDownloadWorkerV2 mLModelDownloadWorkerV2, int i, int i2, int i3) {
        super(0);
        this.$value = i;
        this.$totalBytes = i2;
        this.this$0 = mLModelDownloadWorkerV2;
        this.$notificationId = i3;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.concurrent.Future, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        int i = this.$value;
        int i2 = this.$totalBytes;
        int A01 = C22339B3q.A01((((float) i) / ((float) i2)) * 100.0f);
        MLModelDownloadWorkerV2 mLModelDownloadWorkerV2 = this.this$0;
        C129136hJ r7 = mLModelDownloadWorkerV2.A05;
        int i3 = this.$notificationId;
        long A04 = C17880vN.A04(System.currentTimeMillis() - mLModelDownloadWorkerV2.A00);
        if (A04 > 0) {
            j = Math.max(0, ((long) (i2 - i)) / (((long) i) / A04)) / 60;
        } else {
            j = -1;
        }
        int i4 = (int) j;
        int i5 = i4;
        C1409673t r4 = r7.A00;
        if (r4 != null) {
            Resources A05 = AnonymousClass3MW.A05(r7.A01);
            if (i4 <= 0) {
                i4 = 1;
            }
            Object[] objArr = new Object[1];
            boolean A1b = C72453Mb.A1b(objArr, i5);
            String quantityString = A05.getQuantityString(2131755519, i4, objArr);
            C18070vi.A0X(quantityString);
            r4.A0D(quantityString);
            r4.A07(100, A01, A1b);
            C27301Vn r1 = r7.A02;
            Notification A052 = r4.A05();
            C18070vi.A0X(A052);
            r1.BkR(i3, A052);
        }
        MLModelDownloadWorkerV2 mLModelDownloadWorkerV22 = this.this$0;
        C192939pH r3 = new C192939pH();
        C17880vN.A1P("com.whatsapp.ml.model.PROGRESS", r3.A00, (int) ((((long) this.$totalBytes) / 1048576) - (((long) this.$value) / 1048576)));
        A6Y A00 = r3.A00();
        WorkerParameters workerParameters = mLModelDownloadWorkerV22.A01;
        B4M b4m = workerParameters.A03;
        UUID uuid = workerParameters.A08;
        C20347AHd aHd = (C20347AHd) b4m;
        ? obj = new Object();
        aHd.A01.BKq(new C21368Aix(aHd, obj, A00, uuid, 2));
        obj.get();
        return null;
    }
}
