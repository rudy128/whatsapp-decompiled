package com.whatsapp.media.upload;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1TI;
import X.AnonymousClass3MW;
import X.AnonymousClass7PS;
import X.C109285d7;
import X.C137276vC;
import X.C145937Ne;
import X.C18000vb;
import X.C18070vi;
import X.C200710s;
import X.C24921Me;
import X.C32861hs;
import android.app.Notification;
import android.app.job.JobParameters;
import android.text.TextUtils;
import com.whatsapp.media.transcode.MediaTranscodeService;
import java.util.Collection;

public final class MediaUploadJobService extends C109285d7 {
    public int A00 = -1;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public C18000vb A03;
    public AnonymousClass1LU A04;
    public C32861hs A05;
    public AnonymousClass10I A06;
    public AnonymousClass1TI A07;
    public String A08;

    public static /* synthetic */ void A00(JobParameters jobParameters, MediaUploadJobService mediaUploadJobService, Collection collection) {
        String str;
        Collection collection2 = collection;
        C18070vi.A0d(collection, 2);
        MediaUploadJobService mediaUploadJobService2 = mediaUploadJobService;
        if (!collection.isEmpty()) {
            AnonymousClass1M9 r6 = mediaUploadJobService.A01;
            if (r6 != null) {
                C24921Me r7 = mediaUploadJobService.A02;
                if (r7 != null) {
                    C32861hs r10 = mediaUploadJobService.A05;
                    if (r10 != null) {
                        AnonymousClass1LU r9 = mediaUploadJobService.A04;
                        if (r9 != null) {
                            C18000vb r8 = mediaUploadJobService.A03;
                            if (r8 != null) {
                                AnonymousClass7PS A002 = C137276vC.A00(mediaUploadJobService2, r6, r7, r8, r9, r10, collection2, false);
                                Notification notification = (Notification) A002.first;
                                String str2 = (String) A002.second;
                                int A0M = AnonymousClass000.A0M(A002.third);
                                if (mediaUploadJobService.A00 != A0M || !TextUtils.equals(str2, mediaUploadJobService.A08)) {
                                    mediaUploadJobService.setNotification(jobParameters, 3, notification, 1);
                                }
                                mediaUploadJobService.A00 = A0M;
                                mediaUploadJobService.A08 = str2;
                                return;
                            }
                            str = "whatsAppLocale";
                        } else {
                            str = "waIntents";
                        }
                    } else {
                        str = "sendMediaMessageManager";
                    }
                } else {
                    str = "waContactNames";
                }
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass1TI r1 = mediaUploadJobService.A07;
        if (r1 != null) {
            MediaTranscodeService.A0A.A02(r1);
        }
        mediaUploadJobService.jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            return true;
        }
        C145937Ne r2 = new C145937Ne(jobParameters, this, 21);
        this.A07 = r2;
        AnonymousClass10I r0 = this.A06;
        if (r0 != null) {
            MediaTranscodeService.A0A.A03(r2, C200710s.A00(r0));
            return true;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass1TI r1 = this.A07;
        if (r1 == null) {
            return false;
        }
        MediaTranscodeService.A0A.A02(r1);
        return false;
    }
}
