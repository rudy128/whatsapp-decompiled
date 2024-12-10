package X;

import android.content.Context;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1;
import com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2;

/* renamed from: X.7gn  reason: invalid class name and case insensitive filesystem */
public class C148037gn extends AnonymousClass1JJ implements C36001nB {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C148037gn(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2> r3 = com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2.class
            java.lang.String r5 = "updateProgress(III)V"
            r6 = 0
            r1 = 3
            java.lang.String r4 = "updateProgress"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.2qm> r3 = X.C62092qm.class
            java.lang.String r5 = "startAddNewAccountFlowIfServerUpdatesCompleted(Landroid/content/Context;IZ)V"
            r6 = 0
            r1 = 3
            java.lang.String r4 = "startAddNewAccountFlowIfServerUpdatesCompleted"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.class
            java.lang.String r5 = "onStickerSelection(Lcom/whatsapp/funstickers/data/model/FunStickerModel;ILcom/whatsapp/stickers/Sticker;)V"
            r6 = 0
            r1 = 3
            java.lang.String r4 = "onStickerSelection"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148037gn.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 0:
                Context context = (Context) obj;
                C62092qm.A00(context, (C62092qm) AnonymousClass3Ma.A0z(context, this), AnonymousClass000.A0M(obj2), AnonymousClass000.A1Y(obj3));
                break;
            case 1:
                AnonymousClass77V r10 = (AnonymousClass77V) obj;
                int A0M = AnonymousClass000.A0M(obj2);
                C1418377d r12 = (C1418377d) obj3;
                C18070vi.A0i(r10, r12);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
                WaEditText waEditText = searchFunStickersBottomSheet.A0A;
                if (waEditText != null) {
                    waEditText.A0H();
                }
                SearchFunStickersViewModel A0Q = C108955ca.A0Q(searchFunStickersBottomSheet);
                AnonymousClass1FL A1D = searchFunStickersBottomSheet.A1D();
                C18070vi.A0b(A1D);
                if (!C18070vi.A18(A0Q.A0D.A06(), AnonymousClass60N.A00)) {
                    AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$shareSticker$1(A0Q, r12, (C30391dr) null, A0M), C41561wd.A00(A0Q));
                    break;
                } else {
                    A0Q.A0T(A1D, r10);
                    break;
                }
            default:
                int A0M2 = AnonymousClass000.A0M(obj);
                int A0M3 = AnonymousClass000.A0M(obj2);
                int A0M4 = AnonymousClass000.A0M(obj3);
                MLModelDownloadWorkerV2 mLModelDownloadWorkerV2 = (MLModelDownloadWorkerV2) this.receiver;
                C126146cG r8 = (C126146cG) mLModelDownloadWorkerV2.A08.getValue();
                AnonymousClass7wP r7 = new AnonymousClass7wP(mLModelDownloadWorkerV2, A0M4, A0M2, A0M3);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - r8.A00 > 2000) {
                    r8.A00 = currentTimeMillis;
                    r7.invoke();
                    break;
                }
                break;
        }
        return C27621Wu.A00;
    }
}
