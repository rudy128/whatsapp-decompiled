package com.whatsapp.home.ui;

import X.AGX;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10I;
import X.AnonymousClass1FU;
import X.AnonymousClass1HF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass49F;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C21355Aik;
import X.C218317o;
import X.C27691Xc;
import X.C28281Zt;
import X.C36401np;
import X.C72473Md;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class StarredMessagesPlaceholderActivity extends AnonymousClass1FU {
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup.LayoutParams A03;
    public ViewGroup A04;

    public class StarredMessagePlaceholderView extends LinearLayout implements AnonymousClass009, C218317o {
        public ImageView A00;
        public TextView A01;
        public C18030ve A02;
        public WallPaperView A03;
        public C36401np A04;
        public AnonymousClass10I A05;
        public AnonymousClass031 A06;
        public boolean A07;
        public TextView A08;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C18070vi.A0d(context, 1);
            if (!this.A07) {
                this.A07 = true;
                C27691Xc.A0y((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
            }
            View.inflate(context, 2131627384, this);
            this.A00 = AnonymousClass3MW.A0G(this, 2131431537);
            this.A01 = AnonymousClass3MW.A0J(this, 2131436476);
            this.A08 = AnonymousClass3MW.A0J(this, 2131436474);
            this.A03 = (WallPaperView) AnonymousClass1HF.A06(this, 2131433873);
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setImageResource(2131233447);
            }
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(2131896290);
            }
            setPlaceholderE2EText(2131889005);
        }

        public static final void setPlaceholderE2EText$lambda$0(StarredMessagePlaceholderView starredMessagePlaceholderView) {
            AnonymousClass1FU r1;
            C18070vi.A0d(starredMessagePlaceholderView, 0);
            E2EEDescriptionBottomSheet A002 = E2EEDescriptionBottomSheet.A00(12);
            Context context = starredMessagePlaceholderView.getContext();
            if ((context instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) context) != null) {
                r1.CMl(A002);
            }
        }

        public final void setAbProps(C18030ve r2) {
            C18070vi.A0d(r2, 0);
            this.A02 = r2;
        }

        public final void setLinkifier(C36401np r2) {
            C18070vi.A0d(r2, 0);
            this.A04 = r2;
        }

        public final void setWaWorkers(AnonymousClass10I r2) {
            C18070vi.A0d(r2, 0);
            this.A05 = r2;
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A08;
            if (textView != null) {
                textView.setText(getLinkifier().A06(textView.getContext(), new C21355Aik(this, 47), AnonymousClass3Ma.A11(this, i), "%s", AnonymousClass1YL.A00(textView.getContext(), 2130968627, 2131102239)));
                AnonymousClass3Ma.A1I(textView, getAbProps());
            }
        }

        public final Object generatedComponent() {
            AnonymousClass031 r0 = this.A06;
            if (r0 == null) {
                r0 = AnonymousClass3MW.A0u(this);
                this.A06 = r0;
            }
            return r0.generatedComponent();
        }

        public final C18030ve getAbProps() {
            C18030ve r0 = this.A02;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }

        public final C36401np getLinkifier() {
            C36401np r0 = this.A04;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1E();
            throw null;
        }

        public final AnonymousClass10I getWaWorkers() {
            AnonymousClass10I r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1G();
            throw null;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C17890vO.A0u(new AnonymousClass49F(AnonymousClass3MY.A04(this), AnonymousClass3MX.A05(this), getAbProps(), this.A03), getWaWorkers());
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A03;
            if (wallPaperView != null) {
                C72473Md.A1F(wallPaperView);
            }
        }

        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A07) {
                this.A07 = true;
                C27691Xc.A0y((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624112);
        C28281Zt.A06(this, 2131102739);
        C28281Zt.A04(this);
        ViewGroup A0F = AnonymousClass3MX.A0F(this, 16908290);
        this.A04 = A0F;
        if (A0F != null) {
            AnonymousClass1HF.A0g(A0F, new AGX(this));
        }
    }
}
