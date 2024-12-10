package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;
import com.whatsapp.spamreport.ReportSpamDialogViewModel;
import com.whatsapp.status.tiles.StatusGridPageFragment;

/* renamed from: X.7RS  reason: invalid class name */
public class AnonymousClass7RS implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AnonymousClass7RS(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bd, code lost:
        r0.setText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0465, code lost:
        r5.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0468, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0486, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x048a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01de, code lost:
        r1.notifyAllObservers(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0469;
                case 1: goto L_0x044b;
                case 2: goto L_0x0441;
                case 3: goto L_0x0429;
                case 4: goto L_0x041f;
                case 5: goto L_0x0413;
                case 6: goto L_0x0409;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03df;
                case 9: goto L_0x03c1;
                case 10: goto L_0x03b5;
                case 11: goto L_0x03ac;
                case 12: goto L_0x0396;
                case 13: goto L_0x0389;
                case 14: goto L_0x037d;
                case 15: goto L_0x01bf;
                case 16: goto L_0x0191;
                case 17: goto L_0x017b;
                case 18: goto L_0x000f;
                case 19: goto L_0x0360;
                case 20: goto L_0x0313;
                case 21: goto L_0x02fa;
                case 22: goto L_0x02e3;
                case 23: goto L_0x02b7;
                case 24: goto L_0x0272;
                case 25: goto L_0x010a;
                case 26: goto L_0x0257;
                case 27: goto L_0x00e2;
                case 28: goto L_0x024c;
                case 29: goto L_0x0076;
                case 30: goto L_0x004d;
                case 31: goto L_0x0202;
                case 32: goto L_0x01f4;
                case 33: goto L_0x01e2;
                case 34: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A01
            X.1cu r1 = (X.C29811cu) r1
            java.lang.String r0 = r8.A02
            X.C29811cu.A03(r1, r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r8.A01
            X.10T r1 = (X.AnonymousClass10T) r1
            r0 = 29
            X.7KX r2 = new X.7KX
            r2.<init>(r0)
            goto L_0x01de
        L_0x001c:
            java.lang.Object r5 = r8.A01
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r5 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r5
            java.lang.String r1 = r8.A02
            androidx.appcompat.widget.Toolbar r4 = r5.A03
            if (r4 == 0) goto L_0x003f
            X.0vb r3 = r5.A09
            if (r3 == 0) goto L_0x047b
            android.content.Context r2 = r5.A14()
            java.lang.String r0 = "close"
            boolean r1 = r0.equals(r1)
            r0 = 2131233200(0x7f0809b0, float:1.808253E38)
            if (r1 == 0) goto L_0x003c
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
        L_0x003c:
            X.AnonymousClass3NL.A02(r2, r4, r3, r0)
        L_0x003f:
            androidx.appcompat.widget.Toolbar r1 = r5.A03
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            if (r0 == 0) goto L_0x000e
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            if (r1 == 0) goto L_0x000e
            r1.A0Z()
            return
        L_0x004d:
            java.lang.Object r0 = r8.A01
            X.7B9 r0 = (X.AnonymousClass7B9) r0
            java.lang.String r2 = r8.A02
            X.6Mr r4 = r0.A00
            android.app.Activity r1 = r4.A02
            if (r1 == 0) goto L_0x000e
            r0 = 2131890023(0x7f120f67, float:1.9414726E38)
            java.lang.String r3 = r1.getString(r0)
            if (r2 == 0) goto L_0x0073
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replace(r1, r0)
        L_0x006a:
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 1
            X.C122076Mr.A01(r4, r1, r3, r2, r0)
            return
        L_0x0073:
            java.lang.String r2 = ""
            goto L_0x006a
        L_0x0076:
            java.lang.Object r6 = r8.A01
            X.6ph r6 = (X.C133906ph) r6
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r5 = r6.A02
            r4 = 8
            r5.setLoadingViewVisibility(r4)
            java.lang.String r3 = r8.A02
            if (r3 != 0) goto L_0x0090
            android.content.Context r1 = r5.getContext()
            r0 = 2131897255(0x7f122ba7, float:1.9429394E38)
            java.lang.String r3 = X.C18070vi.A0F(r1, r0)
        L_0x0090:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 != 0) goto L_0x00c9
            android.view.LayoutInflater r7 = X.AnonymousClass3MZ.A0D(r5)
            r1 = 2131627521(0x7f0e0e01, float:1.8882309E38)
            r0 = 0
            r2 = 0
            android.view.View r1 = r7.inflate(r1, r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.C18070vi.A0z(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.A02 = r1
            android.widget.FrameLayout r0 = r5.A06
            r0.addView(r1)
            r0 = 2131430532(0x7f0b0c84, float:1.8482768E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r5, r0)
            r5.A03 = r0
            r0 = 2131434675(0x7f0b1cb3, float:1.849117E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x00c7
            android.view.View$OnClickListener r0 = r5.A00
            r1.setOnClickListener(r0)
            r2 = r1
        L_0x00c7:
            r5.A01 = r2
        L_0x00c9:
            android.widget.TextView r0 = r5.A03
            X.C17960vV.A05(r0)
            r0.setText(r3)
            android.widget.FrameLayout r1 = r5.A02
            X.C17960vV.A05(r1)
            r0 = 0
            r1.setVisibility(r0)
            X.6Mj r0 = r6.A03
            if (r0 == 0) goto L_0x000e
            r0.setPlayControlVisibility(r4)
            return
        L_0x00e2:
            java.lang.Object r4 = r8.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r4 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r4
            java.lang.String r3 = r8.A02
            X.0vl r2 = r4.A0v
            java.lang.Object r1 = r2.getValue()
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.String r0 = "NotInitiated"
            boolean r0 = X.AnonymousClass00N.A00(r0, r3, r1)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r2.getValue()
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.String r0 = "Done"
            boolean r0 = X.AnonymousClass00N.A00(r3, r0, r1)
            if (r0 == 0) goto L_0x000e
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0H(r4)
            return
        L_0x010a:
            java.lang.Object r0 = r8.A01
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            java.lang.String r4 = r8.A02
            com.whatsapp.collections.ObservableRecyclerView r6 = r0.A0C
            if (r6 == 0) goto L_0x000e
            X.00H r0 = r0.A0s
            if (r0 == 0) goto L_0x047e
            X.10T r3 = X.C17880vN.A0V(r0)
            X.1qy r2 = r6.getLayoutManager()
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x000e
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L_0x000e
            int r0 = r2.A1O()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A1Q()
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            int r5 = X.AnonymousClass3MZ.A04(r0)
            int r2 = X.C108955ca.A09(r0)
            r0 = -1
            if (r5 <= r0) goto L_0x0178
            if (r2 <= r0) goto L_0x0178
            X.1rD r1 = r6.A0B
            boolean r0 = r1 instanceof X.C112365lM
            if (r0 == 0) goto L_0x0178
            X.5lM r1 = (X.C112365lM) r1
            if (r1 == 0) goto L_0x0178
            java.util.List r1 = X.C112365lM.A06(r1)
            if (r1 == 0) goto L_0x0178
            int r0 = X.AnonymousClass3MX.A01(r1)
            int r0 = java.lang.Math.min(r2, r0)
            if (r5 <= r0) goto L_0x0171
            X.0wS r1 = X.C18460wS.A00
        L_0x0161:
            java.lang.Class<X.6J8> r0 = X.AnonymousClass6J8.class
            java.util.List r2 = X.C29421cF.A0R(r0, r1)
        L_0x0167:
            r1 = 4
            X.35P r0 = new X.35P
            r0.<init>(r1, r4, r2)
            r3.notifyAllObservers(r0)
            return
        L_0x0171:
            int r0 = r0 + 1
            java.util.List r1 = r1.subList(r5, r0)
            goto L_0x0161
        L_0x0178:
            X.0wS r2 = X.C18460wS.A00
            goto L_0x0167
        L_0x017b:
            java.lang.Object r0 = r8.A01
            com.whatsapp.status.tiles.StatusGridPageFragment r0 = (com.whatsapp.status.tiles.StatusGridPageFragment) r0
            com.whatsapp.collections.ObservableRecyclerView r1 = r0.A01
            if (r1 == 0) goto L_0x000e
            X.00H r0 = r0.A08
            if (r0 == 0) goto L_0x0481
            java.lang.Object r0 = r0.get()
            X.6Bh r0 = (X.C120066Bh) r0
            r0.A00(r1)
            return
        L_0x0191:
            java.lang.Object r1 = r8.A01
            X.178 r1 = (X.AnonymousClass178) r1
            java.lang.String r0 = r8.A02
            r3 = 0
            java.lang.ref.WeakReference r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r0.get()
            X.1Fl r2 = (X.C23291Fl) r2
            if (r2 == 0) goto L_0x000e
            X.1Fx r1 = r2.BPx()
            X.1Fx r0 = X.C23401Fx.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 2131896393(0x7f122849, float:1.9427646E38)
            r0 = 3500(0xdac, float:4.905E-42)
            X.4eK r0 = r2.BZQ(r1, r0, r3)
            r0.A03()
            return
        L_0x01bf:
            java.lang.Object r2 = r8.A01
            X.7FX r2 = (X.AnonymousClass7FX) r2
            java.lang.String r1 = r8.A02
            java.util.LinkedHashMap r0 = r2.A03
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x000e
            X.00H r0 = r2.A01
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1IX r3 = r2.A01()
            r0 = 19
            X.7KY r2 = new X.7KY
            r2.<init>(r3, r0)
        L_0x01de:
            r1.notifyAllObservers(r2)
            return
        L_0x01e2:
            java.lang.Object r1 = r8.A01
            X.6ln r1 = (X.C131866ln) r1
            java.lang.String r0 = r8.A02
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r1.A00(r0)
            return
        L_0x01f4:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r1 = r8.A02
            X.1GP r0 = r0.A1E()
            X.AnonymousClass1GP.A0J(r0, r1)
            return
        L_0x0202:
            java.lang.Object r0 = r8.A01
            X.6mx r0 = (X.C132526mx) r0
            java.lang.String r7 = r8.A02
            r1 = 1
            X.C18070vi.A0d(r7, r1)
            X.6c2 r0 = r0.A01
            X.C17960vV.A00()
            X.1RM r0 = r0.A00
            X.1au r6 = r0.A06()
            X.1xA r5 = r6.BD0()     // Catch:{ all -> 0x0242 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0238 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0238 }
            java.lang.String r3 = "draft_voice_note_metadata"
            java.lang.String r2 = "chat_jid=?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0238 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "DraftVoiceNoteMetadataDataStore/delete"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0238 }
            r5.A00()     // Catch:{ all -> 0x0238 }
            r5.close()     // Catch:{ all -> 0x0242 }
            r6.close()
            return
        L_0x0238:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x023d }
            goto L_0x0241
        L_0x023d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0242 }
        L_0x0241:
            throw r1     // Catch:{ all -> 0x0242 }
        L_0x0242:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0247 }
            throw r1
        L_0x0247:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x024c:
            java.lang.Object r2 = r8.A01
            X.1KB r2 = (X.AnonymousClass1KB) r2
            java.lang.String r1 = r8.A02
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x0257:
            java.lang.Object r2 = r8.A01
            X.6KP r2 = (X.AnonymousClass6KP) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.List r0 = X.C42011xT.A0I
            X.00H r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.6Bh r1 = (X.C120066Bh) r1
            com.whatsapp.collections.ObservableRecyclerView r0 = r2.A04
            X.C18070vi.A0X(r0)
            r1.A00(r0)
            return
        L_0x0272:
            java.lang.Object r4 = r8.A01
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r4 = (com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity) r4
            java.util.List r0 = r4.A0K
            java.util.Iterator r3 = r0.iterator()
        L_0x027c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6zw r0 = (X.C140096zw) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r8.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x027c
        L_0x0293:
            X.6zw r2 = (X.C140096zw) r2
            if (r2 == 0) goto L_0x02ab
            X.1DT r1 = r2.A06
            r0 = 4
            X.AnonymousClass3MX.A1K(r1, r0)
            X.1DT r1 = r2.A03
            r0 = 2131896884(0x7f122a34, float:1.9428642E38)
            X.C108955ca.A1C(r4, r1, r0)
            java.lang.String r1 = r8.A02
            r0 = 0
            r4.A4b(r2, r1, r0)
        L_0x02ab:
            X.73G r1 = X.C108965cb.A0d(r4)
            java.lang.String r0 = r8.A02
            r1.A06(r0)
            return
        L_0x02b5:
            r2 = 0
            goto L_0x0293
        L_0x02b7:
            java.lang.Object r1 = r8.A01
            X.61m r1 = (X.C1179261m) r1
            java.lang.String r5 = r8.A02
            X.00H r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.6uV r2 = (X.C136846uV) r2
            r3 = -1
            r6 = 1
            r7 = 0
            r2.A02(r3, r5, r6, r7)
            X.12E r2 = r1.A01
            X.2R1 r0 = X.AnonymousClass2R1.A03
            X.2sh r1 = new X.2sh
            r1.<init>(r0, r7)
            X.2qq r0 = X.C62132qq.A0P
            r1.A00 = r0
            r1.A03 = r6
            X.2re r0 = r1.A02()
            X.AnonymousClass12E.A00(r2, r0, r6)
            return
        L_0x02e3:
            java.lang.String r3 = r8.A02
            java.lang.Object r2 = r8.A01
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            android.content.res.Resources r1 = X.C108955ca.A0D(r2)
            X.1KW r0 = r2.A0D
            X.C18070vi.A0X(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass72Y.A00(r1, r0, r3)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r2)
            return
        L_0x02fa:
            java.lang.String r3 = r8.A02
            java.lang.Object r2 = r8.A01
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            android.content.res.Resources r1 = X.C108955ca.A0D(r2)
            X.1KW r0 = r2.A0D
            X.C18070vi.A0W(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass72Y.A00(r1, r0, r3)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r2)
            r2.A0D = r3
            return
        L_0x0313:
            java.lang.String r4 = r8.A02
            java.lang.Object r3 = r8.A01
            com.whatsapp.support.faq.FaqItemActivity r3 = (com.whatsapp.support.faq.FaqItemActivity) r3
            boolean r0 = X.C197289wS.A00(r4)
            if (r0 == 0) goto L_0x0345
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "payments_support_topics"
            java.util.ArrayList r2 = r1.getParcelableArrayListExtra(r0)
            if (r2 == 0) goto L_0x0345
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r1 = r1.getBundleExtra(r0)
            X.1LU r0 = r3.A04
            if (r0 == 0) goto L_0x0341
            android.content.Intent r0 = r0.A1t(r3, r1, r2)
            r3.startActivity(r0)
            return
        L_0x0341:
            java.lang.String r0 = "waIntents"
            goto L_0x0486
        L_0x0345:
            X.6pu r2 = r3.A03
            if (r2 == 0) goto L_0x035c
            if (r4 != 0) goto L_0x034d
            java.lang.String r4 = "FaqItemActivity"
        L_0x034d:
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r1 = r1.getBundleExtra(r0)
            r0 = 1
            r2.A00(r1, r3, r4, r0)
            return
        L_0x035c:
            java.lang.String r0 = "feedbackSendMethods"
            goto L_0x0486
        L_0x0360:
            java.lang.Object r3 = r8.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            java.lang.String r2 = r8.A02
            X.1SB r0 = r3.A08
            if (r0 == 0) goto L_0x0379
            X.4VT r1 = r0.A08()
            X.1KB r5 = r3.A05
            r0 = 23
            X.7Qz r4 = new X.7Qz
            r4.<init>(r1, r3, r2, r0)
            goto L_0x0465
        L_0x0379:
            java.lang.String r0 = "stickerRepository"
            goto L_0x0486
        L_0x037d:
            java.lang.Object r0 = r8.A01
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = (com.whatsapp.spamreport.ReportSpamDialogViewModel) r0
            java.lang.String r1 = "about-blocking-reporting"
            X.1DT r0 = r0.A01
            r0.A0E(r1)
            return
        L_0x0389:
            java.lang.Object r0 = r8.A01
            X.7ES r0 = (X.AnonymousClass7ES) r0
            java.lang.String r2 = r8.A02
            r1 = 1
            X.1KB r0 = r0.A00
            r0.A0G(r2, r1)
            return
        L_0x0396:
            java.lang.Object r3 = r8.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            java.lang.String r2 = "newsletter-dsa-report-unlawful-content"
            X.00H r0 = r3.A0H
            if (r0 == 0) goto L_0x0484
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r0 = r3.A1D()
            r1.A01(r0, r2)
            return
        L_0x03ac:
            java.lang.Object r0 = r8.A01
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            java.lang.String r1 = r8.A02
            android.widget.TextView r0 = r0.A0P
            goto L_0x03bd
        L_0x03b5:
            java.lang.Object r0 = r8.A01
            com.whatsapp.settings.SettingsDataUsageActivity r0 = (com.whatsapp.settings.SettingsDataUsageActivity) r0
            java.lang.String r1 = r8.A02
            android.widget.TextView r0 = r0.A05
        L_0x03bd:
            r0.setText(r1)
            return
        L_0x03c1:
            java.lang.Object r2 = r8.A01
            X.1eb r2 = (X.C30841eb) r2
            java.lang.String r3 = r8.A02
            X.1LD r0 = r2.A02
            boolean r6 = r0.A01()
            X.11C r0 = r2.A00
            boolean r5 = X.C30841eb.A00(r0)
            X.11A r0 = r2.A03
            r4 = 6
            X.4rc r1 = new X.4rc
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00(r1)
            return
        L_0x03df:
            java.lang.Object r1 = r8.A01
            X.1jc r1 = (X.C33931jc) r1
            java.lang.String r7 = r8.A02
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.wamsys.JniBridge r6 = r1.A05
            X.118 r0 = r1.A01
            android.content.Context r3 = r0.A00
            X.2dC r2 = new X.2dC
            r2.<init>(r1, r4)
            r1 = 3
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext
            java.lang.Object r0 = r0.get()
            com.whatsapp.wamsys.JniBridge.jvidispatchIOOOO(r1, r7, r3, r2, r0)
            return
        L_0x03ff:
            java.lang.Object r1 = r8.A01
            X.B9O r1 = (X.B9O) r1
            java.lang.String r0 = r8.A02
            r1.C2d(r0)
            return
        L_0x0409:
            java.lang.Object r1 = r8.A01
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            java.lang.String r0 = r8.A02
            com.whatsapp.registration.RegisterName.A0t(r1, r0)
            return
        L_0x0413:
            java.lang.Object r0 = r8.A01
            X.5e5 r0 = (X.C109835e5) r0
            java.lang.String r1 = r8.A02
            X.8AH r0 = r0.A08
            r0.C2H(r1)
            return
        L_0x041f:
            java.lang.Object r1 = r8.A01
            X.1GV r1 = (X.AnonymousClass1GV) r1
            java.lang.String r0 = r8.A02
            r1.accept(r0)
            return
        L_0x0429:
            java.lang.Object r2 = r8.A01
            X.2eB r2 = (X.C54462eB) r2
            java.lang.String r3 = "fmessage-protobuf-subsystem-deserialize"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SlowMethodWatcher found a thread stuck for "
            X.C17900vP.A0e(r0, r3, r1)
            X.190 r2 = r2.A00
            java.lang.String r1 = "slow-method-watcher"
            r0 = 1
            r2.A0G(r1, r3, r0)
            return
        L_0x0441:
            java.lang.Object r1 = r8.A01
            X.1Uo r1 = (X.C27061Uo) r1
            java.lang.String r0 = r8.A02
            X.C27061Uo.A00(r1, r0)
            return
        L_0x044b:
            java.lang.Object r2 = r8.A01
            com.whatsapp.profile.ProfilePhotoReminder r2 = (com.whatsapp.profile.ProfilePhotoReminder) r2
            java.lang.String r1 = r8.A02
            X.00H r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.9m8 r0 = (X.C191169m8) r0
            r0.A00(r1)
            X.1KB r5 = r2.A05
            r0 = 37
            X.7Qm r4 = new X.7Qm
            r4.<init>((java.lang.Object) r2, (int) r0)
        L_0x0465:
            r5.A0J(r4)
            return
        L_0x0469:
            java.lang.Object r0 = r8.A01
            com.whatsapp.profile.ProfileInfoActivity r0 = (com.whatsapp.profile.ProfileInfoActivity) r0
            java.lang.String r1 = r8.A02
            X.00H r0 = r0.A0X
            java.lang.Object r0 = r0.get()
            X.9m8 r0 = (X.C191169m8) r0
            r0.A00(r1)
            return
        L_0x047b:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x0486
        L_0x047e:
            java.lang.String r0 = "statusTilesDataObservers"
            goto L_0x0486
        L_0x0481:
            java.lang.String r0 = "dataObserverLazy"
            goto L_0x0486
        L_0x0484:
            java.lang.String r0 = "contextualHelpHandler"
        L_0x0486:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RS.run():void");
    }

    public AnonymousClass7RS(C120066Bh r2) {
        this.A00 = 18;
        this.A01 = r2;
        this.A02 = "UpdatesViewModel";
    }

    public AnonymousClass7RS(C54462eB r2) {
        this.A00 = 3;
        this.A01 = r2;
        this.A02 = "fmessage-protobuf-subsystem-deserialize";
    }

    public AnonymousClass7RS(AnonymousClass6KP r2) {
        this.A00 = 26;
        this.A01 = r2;
        this.A02 = "UpdatesViewModel";
    }

    public AnonymousClass7RS(ReportSpamDialogFragment reportSpamDialogFragment) {
        this.A00 = 12;
        this.A01 = reportSpamDialogFragment;
        this.A02 = "newsletter-dsa-report-unlawful-content";
    }

    public AnonymousClass7RS(ReportSpamDialogViewModel reportSpamDialogViewModel) {
        this.A00 = 14;
        this.A01 = reportSpamDialogViewModel;
        this.A02 = "about-blocking-reporting";
    }

    public AnonymousClass7RS(StatusGridPageFragment statusGridPageFragment) {
        this.A00 = 17;
        this.A01 = statusGridPageFragment;
        this.A02 = "UpdatesViewModel";
    }
}
