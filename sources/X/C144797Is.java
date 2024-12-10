package X;

import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7Is  reason: invalid class name and case insensitive filesystem */
public class C144797Is implements BC9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144797Is(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public /* synthetic */ void BsA(long j) {
        if (3 - this.A00 == 0) {
            C115295ti r4 = (C115295ti) this.A02;
            r4.A0I.A04(Long.valueOf(j));
            r4.A0d.A0A(j);
            C139666zF r6 = r4.A0e;
            if (r6.A02()) {
                if (C18020vd.A05(C18040vf.A02, r4.A0Q, 8961)) {
                    C136956ug r5 = r4.A0r;
                    r5.A04(j, j - r5.A0B);
                }
            }
            C56202h4 r0 = r4.A01;
            if (r0 != null) {
                r0.A0A = j;
            }
            try {
                File file = r6.A0B;
                if (r6.A02 == 2 && file != null && j >= 65536) {
                    C1407372t r1 = (C1407372t) ((AnonymousClass00H) this.A01).get();
                    if (r1.A00 == 0 && !r1.A02(j)) {
                        if (r1.A00 == 1) {
                            r4.A0B.A0P(file).createNewFile();
                            return;
                        }
                        throw new AnonymousClass6S8();
                    }
                }
            } catch (AnonymousClass6S8 | IOException e) {
                Log.e("MediaDownload/maybeCreateStreamCheckSuccessFile", e);
            }
        }
    }

    public /* synthetic */ void BsC(boolean z) {
        switch (this.A00) {
            case 4:
                AnonymousClass1RO r2 = ((C32401h8) this.A02).A05;
                String str = ((C443823f) this.A01).A01;
                C17960vV.A07(str);
                r2.A03((C1409173o) null, (Integer) null, str);
                return;
            case 6:
                C17900vP.A0n("BusinessActivityReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass000.A10(), z);
                if (!z) {
                    C36191nU r22 = (C36191nU) this.A01;
                    File A0A = r22.A01.A0A();
                    if (A0A.exists() && !A0A.delete()) {
                        Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
                    }
                    r22.A03.A19(2);
                    return;
                }
                return;
            case 7:
                Log.i("statusdownload/status-cancelled");
                C1407572w r23 = (C1407572w) this.A02;
                r23.A00 = null;
                r23.A01 = null;
                C1407572w.A00(C1407572w.A07, (AnonymousClass21V) this.A01, r23);
                return;
            default:
                return;
        }
    }

    public final void BsD(C1409173o r12, C136996uk r13) {
        C62572rc r1;
        AnonymousClass21V r4;
        C62572rc r0;
        C1409173o r6 = r12;
        C136996uk r7 = r13;
        switch (this.A00) {
            case 0:
                C676530i r42 = (C676530i) this.A01;
                C441322g r3 = (C441322g) ((AnonymousClass21V) this.A02);
                if (r12.A03() && (r1 = r3.A02) != null) {
                    r1.A0G = r13.A03();
                    ((C132486mt) r42.A0O.get()).A00(r3, new C697138g(r42, r3, 1));
                    return;
                }
                return;
            case 1:
                C60142nS r2 = (C60142nS) this.A01;
                AnonymousClass206 r14 = (AnonymousClass206) this.A02;
                C18070vi.A0d(r12, 2);
                if (r12.A03()) {
                    r2.A01.A0R(r14);
                    return;
                }
                return;
            case 2:
                Object obj = this.A01;
                C138656xT r32 = (C138656xT) this.A02;
                C18070vi.A0d(r12, 2);
                if (r12.A03()) {
                    r32.A01.A0J(new C146807Qr(r32, obj, 25));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                C18070vi.A0d(r12, 0);
                AnonymousClass1RO r22 = ((C32401h8) this.A02).A05;
                String str = ((C443823f) this.A01).A01;
                C17960vV.A07(str);
                r22.A03(r12, (Integer) null, str);
                return;
            case 5:
                C191819nE r5 = (C191819nE) this.A01;
                Object obj2 = this.A02;
                C18070vi.A0k(r12, r13);
                File A03 = r13.A03();
                if (r12.A03() && A03 != null) {
                    r5.A08.CGF(new C21435Ak2(obj2, r5, A03, 31));
                    return;
                }
                return;
            case 6:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("BusinessActivityReportManager/download-report/on-download-completed success -> ");
                boolean A032 = r12.A03();
                C17900vP.A0r(A10, A032);
                if (A032) {
                    C36191nU r23 = (C36191nU) this.A01;
                    synchronized (r23) {
                        r23.A03.A19(4);
                    }
                    Log.i("BusinessActivityReportViewModel/download-report/on-success");
                    BusinessActivityReportViewModel businessActivityReportViewModel = ((C126276cT) this.A02).A00;
                    AnonymousClass3MX.A1K(businessActivityReportViewModel.A02, businessActivityReportViewModel.A05.A00());
                    return;
                }
                Log.i("BusinessActivityReportViewModel/download-report/on-error");
                BusinessActivityReportViewModel businessActivityReportViewModel2 = ((C126276cT) this.A02).A00;
                BusinessActivityReportViewModel.A00(businessActivityReportViewModel2);
                AnonymousClass3MX.A1K(businessActivityReportViewModel2.A01, 5);
                ((C36191nU) this.A01).A03.A19(2);
                return;
            case 7:
                C18070vi.A0d(r12, 0);
                Log.i("statusdownload/status-completed");
                C1407572w r52 = (C1407572w) this.A02;
                while (true) {
                    ArrayList arrayList = r52.A05;
                    r4 = null;
                    if (arrayList.size() > 0) {
                        Object remove = arrayList.remove(0);
                        C18070vi.A0X(remove);
                        r4 = (AnonymousClass21V) remove;
                        AnonymousClass21V r02 = r52.A00;
                        if ((r02 == null || !C18070vi.A18(r4.A0v, r02.A0v)) && (r0 = r4.A02) != null && !r0.A0V) {
                        }
                    }
                }
                r52.A00 = null;
                r52.A01 = null;
                C1407572w.A00(r12, (AnonymousClass21V) this.A01, r52);
                if (r4 != null) {
                    C18030ve r24 = r52.A02;
                    boolean A012 = AnonymousClass72Z.A01(r24, r4);
                    if (!C22781De.A03() || !C18020vd.A05(C18040vf.A02, r24, 9775)) {
                        int i = 0;
                        if (A012) {
                            i = 6;
                        }
                        C1407572w.A01(r4, r52, i);
                        return;
                    }
                    r52.A04.CGS(new C146867Qx(r52, r4, 15, A012), "status-download-manager-worker-token");
                    return;
                }
                return;
            default:
                StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = (StickerStorePackPreviewViewModel) this.A01;
                C441522i r8 = (C441522i) this.A02;
                C18070vi.A0o(r8, r12, r13);
                AnonymousClass3MW.A1X(stickerStorePackPreviewViewModel.A06, new StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1(r6, r7, r8, stickerStorePackPreviewViewModel, (C30391dr) null), C41561wd.A00(stickerStorePackPreviewViewModel));
                return;
        }
    }

    public C144797Is(C115295ti r3) {
        this.A00 = 3;
        this.A02 = r3;
        this.A01 = C18150vq.A01(new C147087Rt(this, 5));
    }
}
