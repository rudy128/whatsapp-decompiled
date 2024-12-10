package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11A;
import X.AnonymousClass11P;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass1TI;
import X.AnonymousClass3MW;
import X.AnonymousClass74L;
import X.AnonymousClass7RA;
import X.C109275d6;
import X.C145937Ne;
import X.C146807Qr;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18600wl;
import X.C200710s;
import X.C21438Ak5;
import X.C24921Me;
import X.C30391dr;
import X.C32431hB;
import android.app.Notification;
import android.app.job.JobParameters;
import java.util.ArrayList;

public final class MediaDownloadJobService extends C109275d6 {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public AnonymousClass11P A02;
    public AnonymousClass118 A03;
    public C32431hB A04;
    public C200710s A05;
    public AnonymousClass10I A06;
    public AnonymousClass1TI A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public C18600wl A0A;
    public AnonymousClass1OX A0B;
    public boolean A0C;

    public static /* synthetic */ void A04(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, ArrayList arrayList) {
        String str;
        JobParameters jobParameters2 = jobParameters;
        C18070vi.A0d(jobParameters, 1);
        ArrayList arrayList2 = arrayList;
        C18070vi.A0d(arrayList, 2);
        MediaDownloadJobService mediaDownloadJobService2 = mediaDownloadJobService;
        if (C17880vN.A1X(arrayList)) {
            String A062 = AnonymousClass74L.A06(mediaDownloadJobService, arrayList);
            AnonymousClass1M9 r1 = mediaDownloadJobService.A00;
            if (r1 != null) {
                C24921Me r0 = mediaDownloadJobService.A01;
                if (r0 != null) {
                    String A052 = AnonymousClass74L.A05(mediaDownloadJobService, r1, r0, arrayList);
                    AnonymousClass00H r02 = mediaDownloadJobService2.A08;
                    if (r02 != null) {
                        ((AnonymousClass11A) r02.get()).CGP(new C21438Ak5(mediaDownloadJobService2, jobParameters2, arrayList2, A062, A052, 5));
                        return;
                    }
                    str = "mainThreadHandler";
                } else {
                    str = "waContactNames";
                }
            } else {
                str = "contactManager";
            }
        } else {
            AnonymousClass10I r12 = mediaDownloadJobService.A06;
            if (r12 != null) {
                AnonymousClass7RA.A00(r12, mediaDownloadJobService, 35);
                mediaDownloadJobService.jobFinished(jobParameters, false);
                return;
            }
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static /* synthetic */ void A06(MediaDownloadJobService mediaDownloadJobService) {
        mediaDownloadJobService.A0C = false;
        AnonymousClass1TI r1 = mediaDownloadJobService.A07;
        if (r1 != null) {
            C32431hB r0 = mediaDownloadJobService.A04;
            if (r0 != null) {
                r0.A05.A02(r1);
            } else {
                C18070vi.A11("mediaDownloadManager");
                throw null;
            }
        }
    }

    public static final /* synthetic */ void A01(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService) {
        String str;
        mediaDownloadJobService.A07 = new C145937Ne(jobParameters, mediaDownloadJobService, 18);
        AnonymousClass10I r0 = mediaDownloadJobService.A06;
        if (r0 != null) {
            C200710s A002 = C200710s.A00(r0);
            mediaDownloadJobService.A05 = A002;
            C32431hB r02 = mediaDownloadJobService.A04;
            if (r02 != null) {
                AnonymousClass1TI r1 = mediaDownloadJobService.A07;
                if (r1 == null) {
                    str = "largeMediaDownloadingObservable";
                } else {
                    r02.A05.A03(r1, A002);
                    return;
                }
            } else {
                str = "mediaDownloadManager";
            }
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static /* synthetic */ void A03(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, String str, String str2, ArrayList arrayList) {
        if (str != null) {
            mediaDownloadJobService.A05(jobParameters, str, str2, arrayList);
        }
    }

    /* access modifiers changed from: private */
    public final void A05(JobParameters jobParameters, String str, String str2, ArrayList arrayList) {
        String str3;
        if (this.A00 == null) {
            str3 = "contactManager";
        } else if (this.A02 != null) {
            Notification A032 = AnonymousClass74L.A03(this, str, str2, arrayList);
            C18070vi.A0X(A032);
            setNotification(jobParameters, 242478024, A032, 1);
            return;
        } else {
            str3 = "time";
        }
        C18070vi.A11(str3);
        throw null;
    }

    public final AnonymousClass118 A07() {
        AnonymousClass118 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass10I r2 = this.A06;
        if (r2 != null) {
            r2.CGF(new C146807Qr(jobParameters, this, 41));
            return true;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public static /* synthetic */ void A00(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("media-download-job-service/onStopJob:; p0: ");
        A10.append(jobParameters);
        A10.append(" largeMediaDownloadsInProgress=");
        C17900vP.A0r(A10, mediaDownloadJobService.A0C);
        mediaDownloadJobService.A0C = false;
        AnonymousClass1TI r1 = mediaDownloadJobService.A07;
        if (r1 != null) {
            C32431hB r0 = mediaDownloadJobService.A04;
            if (r0 != null) {
                r0.A05.A02(r1);
            } else {
                C18070vi.A11("mediaDownloadManager");
                throw null;
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("media-download-job-service/onStartJob:; p0: ");
        A10.append(jobParameters);
        A10.append(" largeMediaDownloadsInProgress=");
        C17900vP.A0r(A10, this.A0C);
        this.A0C = true;
        if (jobParameters != null) {
            AnonymousClass1OX r3 = this.A0B;
            if (r3 != null) {
                C18600wl r2 = this.A0A;
                if (r2 != null) {
                    AnonymousClass3MW.A1X(r2, new MediaDownloadJobService$onStartJob$1$1(jobParameters, this, (C30391dr) null), r3);
                } else {
                    str = "ioDispatcher";
                }
            } else {
                str = "applicationScope";
            }
            C18070vi.A11(str);
            throw null;
        }
        return true;
    }
}
