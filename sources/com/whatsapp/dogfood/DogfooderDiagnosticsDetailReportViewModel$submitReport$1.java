package com.whatsapp.dogfood;

import X.AnonymousClass1OS;
import X.AnonymousClass4S3;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel$submitReport$1", f = "DogfooderDiagnosticsDetailReportViewModel.kt", i = {}, l = {124, 139, 150, 154}, m = "invokeSuspend", n = {}, s = {})
public final class DogfooderDiagnosticsDetailReportViewModel$submitReport$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4S3 $dogfooderDiagnosticsConfiguration;
    public final /* synthetic */ int $reportType;
    public final /* synthetic */ Uri $screenshotFileUri;
    public int label;
    public final /* synthetic */ DogfooderDiagnosticsDetailReportViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DogfooderDiagnosticsDetailReportViewModel$submitReport$1(Uri uri, AnonymousClass4S3 r3, DogfooderDiagnosticsDetailReportViewModel dogfooderDiagnosticsDetailReportViewModel, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = dogfooderDiagnosticsDetailReportViewModel;
        this.$screenshotFileUri = uri;
        this.$dogfooderDiagnosticsConfiguration = r3;
        this.$reportType = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new DogfooderDiagnosticsDetailReportViewModel$submitReport$1(this.$screenshotFileUri, this.$dogfooderDiagnosticsConfiguration, this.this$0, r8, this.$reportType);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r21
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r4 = r20
            int r0 = r4.label
            r5 = 4
            r6 = 3
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L_0x001c
            if (r0 == r7) goto L_0x002e
            if (r0 == r2) goto L_0x009f
            if (r0 == r6) goto L_0x00c0
            if (r0 != r5) goto L_0x00e8
            X.C30691eM.A01(r1)
        L_0x0019:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001c:
            X.C30691eM.A01(r1)
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = r4.this$0
            X.5bm r1 = r0.A06
            X.3xq r0 = X.C80723xq.A00
            r4.label = r7
            java.lang.Object r0 = r1.CHH(r0, r4)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x002e:
            X.C30691eM.A01(r1)
        L_0x0031:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            android.net.Uri r8 = r4.$screenshotFileUri
            if (r8 == 0) goto L_0x004d
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = r4.this$0
            X.00H r0 = r0.A04
            java.lang.Object r7 = r0.get()
            X.6oC r7 = (X.C133116oC) r7
            r0 = 0
            X.Af0 r7 = r7.A00(r8, r0)
            r0 = 12
            X.C98334qx.A00(r7, r1, r0)
        L_0x004d:
            X.4S3 r11 = r4.$dogfooderDiagnosticsConfiguration
            X.5bc r9 = r11.A00
            if (r9 == 0) goto L_0x00a5
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r8 = r4.this$0
            int r10 = r4.$reportType
            X.00H r0 = r8.A03
            java.lang.Object r12 = r0.get()
            com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper r12 = (com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper) r12
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[DogfooderDiagnostics] "
            r7.append(r0)
            boolean r0 = r11 instanceof X.C80673xl
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "Ghost View Report"
        L_0x006e:
            java.lang.String r13 = X.AnonymousClass000.A0y(r0, r7)
            java.lang.String r14 = java.lang.String.valueOf(r10)
            java.lang.String r15 = r9.BQI()
            X.00H r0 = r8.A02
            java.lang.Object r0 = r0.get()
            X.6lw r0 = (X.C131956lw) r0
            java.lang.String r16 = r0.A00()
            r4.label = r2
            java.lang.String r17 = "dogfooder_diagnostics"
            r18 = r1
            r19 = r4
            java.lang.Object r1 = r12.A00(r13, r14, r15, r16, r17, r18, r19)
            if (r1 != r3) goto L_0x00a2
            return r3
        L_0x0095:
            boolean r0 = r11 instanceof X.C80653xj
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "Crash Report"
            goto L_0x006e
        L_0x009c:
            java.lang.String r0 = "Slow Conversation Row Report"
            goto L_0x006e
        L_0x009f:
            X.C30691eM.A01(r1)
        L_0x00a2:
            X.4Eg r1 = (X.C83214Eg) r1
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            boolean r0 = r1 instanceof X.AnonymousClass41X
            if (r0 == 0) goto L_0x00ce
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = r4.this$0
            X.5bm r2 = r0.A06
            X.41X r1 = (X.AnonymousClass41X) r1
            java.lang.String r1 = r1.A00
            X.3xp r0 = new X.3xp
            r0.<init>(r1)
            r4.label = r6
            java.lang.Object r0 = r2.CHH(r0, r4)
            if (r0 != r3) goto L_0x00c3
            return r3
        L_0x00c0:
            X.C30691eM.A01(r1)
        L_0x00c3:
            X.4S3 r0 = r4.$dogfooderDiagnosticsConfiguration
            X.5bc r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            r0.CKy()
            goto L_0x0019
        L_0x00ce:
            boolean r0 = r1 instanceof X.AnonymousClass41W
            if (r0 == 0) goto L_0x0019
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = r4.this$0
            X.5bm r2 = r0.A06
            X.41W r1 = (X.AnonymousClass41W) r1
            java.lang.String r1 = r1.A00
            X.3xo r0 = new X.3xo
            r0.<init>(r1)
            r4.label = r5
            java.lang.Object r0 = r2.CHH(r0, r4)
            if (r0 != r3) goto L_0x0019
            return r3
        L_0x00e8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel$submitReport$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DogfooderDiagnosticsDetailReportViewModel$submitReport$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
