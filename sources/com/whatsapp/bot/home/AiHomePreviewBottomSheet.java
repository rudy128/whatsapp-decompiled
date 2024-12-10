package com.whatsapp.bot.home;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass78Q;
import X.AnonymousClass7E5;
import X.C108945cZ;
import X.C108965cb;
import X.C109965ei;
import X.C110745gz;
import X.C111745kM;
import X.C114255qP;
import X.C122626Rc;
import X.C127016df;
import X.C131346kw;
import X.C136486tt;
import X.C1401970i;
import X.C143307Cw;
import X.C148417hP;
import X.C148427hQ;
import X.C148437hR;
import X.C155177sK;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C20125A8k;
import X.C25811Ps;
import X.C36401np;
import X.C57642jP;
import X.C72453Mb;
import X.C99274sY;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;
import java.util.ArrayList;

public final class AiHomePreviewBottomSheet extends Hilt_AiHomePreviewBottomSheet {
    public NestedScrollView A00;
    public C131346kw A01;
    public C25811Ps A02;
    public C57642jP A03;
    public C18030ve A04;
    public C36401np A05;
    public AnonymousClass00H A06;
    public final int A07 = 2131624169;
    public final C18100vl A08;

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        boolean z;
        String str2;
        C110745gz r1;
        AiHomeBotImpl.Persona BX1;
        C20125A8k A09;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        C143307Cw r5 = (C143307Cw) C108945cZ.A0b(this.A08).A02.A06();
        if (r5 == null) {
            A28();
            return;
        }
        ImageView A0C = AnonymousClass3Ma.A0C(view2, 2131433800);
        C131346kw r2 = this.A01;
        if (r2 != null) {
            C136486tt A002 = r2.A00(A1G(), C122626Rc.A04);
            AiHomeBot aiHomeBot = r5.A00;
            if (aiHomeBot != null) {
                A002.A02(aiHomeBot, A002.A01(A0C, AnonymousClass7E5.A00, new C148417hP(aiHomeBot)));
            }
            AnonymousClass3Ma.A0E(view2, 2131432903).setText(C1401970i.A00(r5));
            TextEmojiLabel A0c = C72453Mb.A0c(view2, 2131427913);
            C57642jP r7 = this.A03;
            if (r7 != null) {
                Context A14 = A14();
                String str3 = null;
                if (!(aiHomeBot == null || (A09 = ((C20125A8k) aiHomeBot).A09(AiHomeBotImpl.Creator.class, "creator")) == null)) {
                    str3 = A09.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }
                String str4 = null;
                if (aiHomeBot != null) {
                    C20125A8k a8k = (C20125A8k) aiHomeBot;
                    C20125A8k A092 = a8k.A09(AiHomeBotImpl.Creator.class, "creator");
                    if (A092 != null) {
                        str4 = A092.A0F("profile_uri");
                    }
                    i = a8k.A00.optInt("social_signal_message_count");
                    z = a8k.A0G("is_meta_created");
                } else {
                    i = 0;
                    z = false;
                }
                r7.A00(A14, A0c, 17, str3, str4, i, false, true, true, z, false);
                TextView A0E = AnonymousClass3Ma.A0E(view2, 2131429927);
                if (aiHomeBot == null || (BX1 = aiHomeBot.BX1()) == null || (str2 = BX1.A0F("welcome_message")) == null) {
                    str2 = "";
                }
                A0E.setText(str2);
                TextView A0E2 = AnonymousClass3Ma.A0E(view2, 2131429029);
                A0E2.setText(2131886594);
                AnonymousClass78Q.A00(A0E2, this, r5, 39);
                AnonymousClass3MZ.A1I(C18070vi.A05(view2, 2131429138), this, 45);
                AnonymousClass78Q.A00(C18070vi.A05(view2, 2131430985), this, r5, 40);
                ArrayList A022 = C1401970i.A02(r5);
                if (A022 != null && !A022.isEmpty()) {
                    RecyclerView recyclerView = (RecyclerView) C18070vi.A05(view2, 2131434211);
                    C108965cb.A0z(A1n(), recyclerView);
                    C111745kM r0 = new C111745kM(new C127016df(r5, this));
                    r0.A0W(A022);
                    recyclerView.setAdapter(r0);
                }
                this.A00 = (NestedScrollView) AnonymousClass1HF.A06(view2, 2131434837);
                Dialog dialog = this.A03;
                if ((dialog instanceof C110745gz) && (r1 = (C110745gz) dialog) != null) {
                    if (r1.A01 == null) {
                        C110745gz.A02(r1);
                    }
                    BottomSheetBehavior bottomSheetBehavior = r1.A01;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.A0W(3);
                        bottomSheetBehavior.A0h = true;
                        bottomSheetBehavior.A0V(view2.getHeight());
                        bottomSheetBehavior.A0Z(new C114255qP(bottomSheetBehavior, this, 0));
                    }
                }
                view2.setOutlineProvider(new C109965ei(AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169546)));
                view2.setClipToOutline(true);
                return;
            }
            str = "aiHomeUtil";
        } else {
            str = "botPhotoLoaderFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public AiHomePreviewBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiHomeViewModel.class);
        this.A08 = C99274sY.A00(new C148427hQ(this), new C148437hR(this), new C155177sK(this), A15);
    }

    public void A1r() {
        super.A1r();
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isChangingConfigurations()) {
            C108945cZ.A0b(this.A08).A02.A0F((Object) null);
        }
    }
}
