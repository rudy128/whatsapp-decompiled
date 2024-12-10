package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.app.job.JobParameters;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.download.service.MediaDownloadJobService$onStartJob$1$1", f = "MediaDownloadJobService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaDownloadJobService$onStartJob$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ JobParameters $params;
    public int label;
    public final /* synthetic */ MediaDownloadJobService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaDownloadJobService$onStartJob$1$1(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, C30391dr r4) {
        super(2, r4);
        this.this$0 = mediaDownloadJobService;
        this.$params = jobParameters;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaDownloadJobService$onStartJob$1$1(this.$params, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            MediaDownloadJobService mediaDownloadJobService = this.this$0;
            mediaDownloadJobService.A05(this.$params, C18070vi.A0F(mediaDownloadJobService.A07().A00, 2131898700), this.this$0.getResources().getQuantityString(2131755095, 1, new Object[]{AnonymousClass3MW.A0v(1)}), (ArrayList) null);
            MediaDownloadJobService.A01(this.$params, this.this$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaDownloadJobService$onStartJob$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
