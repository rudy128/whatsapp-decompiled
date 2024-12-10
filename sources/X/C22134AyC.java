package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.AyC  reason: case insensitive filesystem */
public final class C22134AyC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22134AyC(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Map map = (Map) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C18070vi.A0b(map);
        int A0M = AnonymousClass000.A0M(C29431cG.A0Z(map.keySet()));
        View view = (View) C29431cG.A0Z(map.values());
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A06;
        if (mediaCardGrid == null) {
            str = "mediaCard";
        } else {
            Context context = mediaCardGrid.getContext();
            UserJid userJid = linkedIGPostsSummaryViewActivity.A03;
            if (userJid == null) {
                C18070vi.A11("bizJid");
                throw null;
            }
            C161508Fg r0 = linkedIGPostsSummaryViewActivity.A02;
            str = "linkedIGPostsSummaryViewModel";
            if (r0 != null) {
                ArrayList arrayList = r0.A0A;
                LinkedAccountMediaView.A03(context, view, (C1417376t) null, userJid, AnonymousClass001.A1H("thumb-transition-", ((AnonymousClass77G) arrayList.get(A0M)).A01.A04, AnonymousClass000.A10()), arrayList, A0M, 1, 1, true);
                AnonymousClass00H r02 = linkedIGPostsSummaryViewActivity.A07;
                if (r02 != null) {
                    C137966wJ r1 = (C137966wJ) r02.get();
                    UserJid userJid2 = linkedIGPostsSummaryViewActivity.A03;
                    if (userJid2 == null) {
                        C18070vi.A11("bizJid");
                        throw null;
                    }
                    C137966wJ.A00(r1, userJid2, 1);
                    return C27621Wu.A00;
                }
                C18070vi.A11("linkedIGPostsLoggingHelper");
                throw null;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
