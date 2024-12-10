package X;

import com.whatsapp.jobqueue.job.SendEngagedReceiptJob;

/* renamed from: X.9kk  reason: invalid class name and case insensitive filesystem */
public class C190319kk {
    public final C25001Mm A00;
    public final AnonymousClass00H A01;

    public final void A00(AnonymousClass206 r13, String str, String str2) {
        boolean z;
        C18030ve r2;
        int i;
        String str3 = str2;
        C18070vi.A0i(r13, str2);
        AnonymousClass00H r6 = this.A01;
        AnonymousClass9c9 r22 = (AnonymousClass9c9) r6.get();
        C18030ve r5 = r22.A01;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r5, 2849)) {
            z = r22.A00.A2U();
        } else {
            z = true;
        }
        boolean A11 = r13.A11(524288);
        if (!C18020vd.A05(r1, r5, 2848) && z && A11) {
            AnonymousClass9c9 r23 = (AnonymousClass9c9) r6.get();
            String str4 = str;
            switch (str.hashCode()) {
                case -1435389390:
                    if (str.equals("media-image")) {
                        r2 = r23.A01;
                        i = 3527;
                        break;
                    } else {
                        return;
                    }
                case -1423499950:
                    if (str.equals("media-video")) {
                        r2 = r23.A01;
                        i = 3529;
                        break;
                    } else {
                        return;
                    }
                case -903583990:
                    if (str.equals("quick-reply")) {
                        r2 = r23.A01;
                        i = 3524;
                        break;
                    } else {
                        return;
                    }
                case -862592005:
                    if (str.equals("cta-call")) {
                        r2 = r23.A01;
                        i = 3526;
                        break;
                    } else {
                        return;
                    }
                case 1080570930:
                    if (str.equals("cta-url")) {
                        r2 = r23.A01;
                        i = 3525;
                        break;
                    } else {
                        return;
                    }
                case 2139281359:
                    if (str.equals("media-doc")) {
                        r2 = r23.A01;
                        i = 3528;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            if (C18020vd.A05(r1, r2, i)) {
                C25001Mm r24 = this.A00;
                AnonymousClass205 r12 = r13.A0v;
                AnonymousClass1BI r0 = r12.A00;
                C17960vV.A07(r0);
                String rawString = r0.getRawString();
                String str5 = r12.A01;
                C18070vi.A0X(str5);
                r24.A01(new SendEngagedReceiptJob(rawString, str5, str4, str3, r13.A0I, r13.A10));
            }
        }
    }

    public C190319kk(C25001Mm r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
