package X;

import com.whatsapp.ml.v2.MLModelManagerV2$enqueueSilentDownloadIfRequired$1;
import com.whatsapp.ml.v2.MLModelManagerV2$enqueueStaleModelsForDeletion$1;

/* renamed from: X.7Er  reason: invalid class name and case insensitive filesystem */
public final class C143757Er implements AnonymousClass1L0 {
    public final C1407873b A00;
    public final C132046m5 A01;
    public final C131606lN A02;
    public final C18030ve A03;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 8925)) {
            for (C122716Rq r10 : C122716Rq.values()) {
                try {
                    AnonymousClass8Ak A002 = this.A02.A00(r10, false);
                    AnonymousClass8AS A003 = this.A01.A00("ML_DOWNLOADER_CRON_JOB", 721693071, A002.BV1().hashCode());
                    A003.Bj0();
                    A003.Bir("feature", r10.name());
                    if (A002.isEnabled()) {
                        A003.Bis("is_enabled", true);
                        C1407873b r5 = this.A00;
                        AnonymousClass1OX r4 = r5.A08;
                        C18600wl r3 = r5.A07;
                        MLModelManagerV2$enqueueStaleModelsForDeletion$1 mLModelManagerV2$enqueueStaleModelsForDeletion$1 = new MLModelManagerV2$enqueueStaleModelsForDeletion$1(r5, r10, (C30391dr) null);
                        Integer num = AnonymousClass00R.A00;
                        C30451dy.A02(num, r3, mLModelManagerV2$enqueueStaleModelsForDeletion$1, r4);
                        C30451dy.A02(num, r3, new MLModelManagerV2$enqueueSilentDownloadIfRequired$1(r5, r10, (C30391dr) null), r4);
                    } else {
                        A003.Bis("is_enabled", false);
                        this.A00.A06(r10);
                    }
                    A003.Biu(2);
                } catch (Exception e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("MLModelDownloaderDailyCron Exception while running daily cron job for feature: ");
                    C108985cd.A1M(r10.name(), A10, e);
                }
            }
        }
    }

    public C143757Er(C18030ve r1, C1407873b r2, C132046m5 r3, C131606lN r4) {
        C18070vi.A0s(r2, r1, r4, r3);
        this.A00 = r2;
        this.A03 = r1;
        this.A02 = r4;
        this.A01 = r3;
    }
}
